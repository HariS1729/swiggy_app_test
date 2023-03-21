package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* compiled from: ClassesInfoCache */
final class b {

    /* renamed from: c  reason: collision with root package name */
    static b f10709c = new b();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, a> f10710a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, Boolean> f10711b = new HashMap();

    @Deprecated
    /* compiled from: ClassesInfoCache */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        final Map<Lifecycle.Event, List<C0064b>> f10712a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Map<C0064b, Lifecycle.Event> f10713b;

        a(Map<C0064b, Lifecycle.Event> map) {
            this.f10713b = map;
            for (Map.Entry next : map.entrySet()) {
                Lifecycle.Event event = (Lifecycle.Event) next.getValue();
                List list = this.f10712a.get(event);
                if (list == null) {
                    list = new ArrayList();
                    this.f10712a.put(event, list);
                }
                list.add((C0064b) next.getKey());
            }
        }

        private static void b(List<C0064b> list, r rVar, Lifecycle.Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(rVar, event, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(r rVar, Lifecycle.Event event, Object obj) {
            b(this.f10712a.get(event), rVar, event, obj);
            b(this.f10712a.get(Lifecycle.Event.ON_ANY), rVar, event, obj);
        }
    }

    @Deprecated
    /* renamed from: androidx.lifecycle.b$b  reason: collision with other inner class name */
    /* compiled from: ClassesInfoCache */
    static final class C0064b {

        /* renamed from: a  reason: collision with root package name */
        final int f10714a;

        /* renamed from: b  reason: collision with root package name */
        final Method f10715b;

        C0064b(int i11, Method method) {
            this.f10714a = i11;
            this.f10715b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        public void a(r rVar, Lifecycle.Event event, Object obj) {
            try {
                int i11 = this.f10714a;
                if (i11 == 0) {
                    this.f10715b.invoke(obj, new Object[0]);
                } else if (i11 == 1) {
                    this.f10715b.invoke(obj, new Object[]{rVar});
                } else if (i11 == 2) {
                    this.f10715b.invoke(obj, new Object[]{rVar, event});
                }
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            } catch (IllegalAccessException e12) {
                throw new RuntimeException(e12);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0064b)) {
                return false;
            }
            C0064b bVar = (C0064b) obj;
            if (this.f10714a != bVar.f10714a || !this.f10715b.getName().equals(bVar.f10715b.getName())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f10714a * 31) + this.f10715b.getName().hashCode();
        }
    }

    b() {
    }

    private a a(Class<?> cls, Method[] methodArr) {
        int i11;
        a c11;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c11 = c(superclass)) == null)) {
            hashMap.putAll(c11.f10713b);
        }
        for (Class c12 : cls.getInterfaces()) {
            for (Map.Entry next : c(c12).f10713b.entrySet()) {
                e(hashMap, (C0064b) next.getKey(), (Lifecycle.Event) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z11 = false;
        for (Method method : methodArr) {
            a0 a0Var = (a0) method.getAnnotation(a0.class);
            if (a0Var != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i11 = 0;
                } else if (parameterTypes[0].isAssignableFrom(r.class)) {
                    i11 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                Lifecycle.Event value = a0Var.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(Lifecycle.Event.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == Lifecycle.Event.ON_ANY) {
                        i11 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new C0064b(i11, method), value, cls);
                    z11 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f10710a.put(cls, aVar);
        this.f10711b.put(cls, Boolean.valueOf(z11));
        return aVar;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e11) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
        }
    }

    private void e(Map<C0064b, Lifecycle.Event> map, C0064b bVar, Lifecycle.Event event, Class<?> cls) {
        Lifecycle.Event event2 = map.get(bVar);
        if (event2 != null && event != event2) {
            Method method = bVar.f10715b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
        } else if (event2 == null) {
            map.put(bVar, event);
        }
    }

    /* access modifiers changed from: package-private */
    public a c(Class<?> cls) {
        a aVar = this.f10710a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return a(cls, (Method[]) null);
    }

    /* access modifiers changed from: package-private */
    public boolean d(Class<?> cls) {
        Boolean bool = this.f10711b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b11 = b(cls);
        for (Method annotation : b11) {
            if (((a0) annotation.getAnnotation(a0.class)) != null) {
                a(cls, b11);
                return true;
            }
        }
        this.f10711b.put(cls, Boolean.FALSE);
        return false;
    }
}
