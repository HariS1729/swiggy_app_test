package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Lifecycling */
public class v {

    /* renamed from: a  reason: collision with root package name */
    private static Map<Class<?>, Integer> f10783a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static Map<Class<?>, List<Constructor<? extends i>>> f10784b = new HashMap();

    private static i a(Constructor<? extends i> constructor, Object obj) {
        try {
            return (i) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e11) {
            throw new RuntimeException(e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException(e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException(e13);
        }
    }

    private static Constructor<? extends i> b(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String c11 = c(canonicalName);
            if (!name.isEmpty()) {
                c11 = name + "." + c11;
            }
            Constructor<?> declaredConstructor = Class.forName(c11).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static String c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    private static int d(Class<?> cls) {
        Integer num = f10783a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g11 = g(cls);
        f10783a.put(cls, Integer.valueOf(g11));
        return g11;
    }

    private static boolean e(Class<?> cls) {
        return cls != null && q.class.isAssignableFrom(cls);
    }

    static o f(Object obj) {
        boolean z11 = obj instanceof o;
        boolean z12 = obj instanceof h;
        if (z11 && z12) {
            return new FullLifecycleObserverAdapter((h) obj, (o) obj);
        }
        if (z12) {
            return new FullLifecycleObserverAdapter((h) obj, (o) null);
        }
        if (z11) {
            return (o) obj;
        }
        Class<?> cls = obj.getClass();
        if (d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = f10784b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(a((Constructor) list.get(0), obj));
        }
        i[] iVarArr = new i[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            iVarArr[i11] = a((Constructor) list.get(i11), obj);
        }
        return new CompositeGeneratedAdaptersObserver(iVarArr);
    }

    private static int g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends i> b11 = b(cls);
        if (b11 != null) {
            f10784b.put(cls, Collections.singletonList(b11));
            return 2;
        } else if (b.f10709c.d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (e(superclass)) {
                if (d(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f10784b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (e(cls2)) {
                    if (d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f10784b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f10784b.put(cls, arrayList);
            return 2;
        }
    }
}
