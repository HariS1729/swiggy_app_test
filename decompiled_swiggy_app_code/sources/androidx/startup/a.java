package androidx.startup;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: AppInitializer */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f11747d;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f11748e = new Object();

    /* renamed from: a  reason: collision with root package name */
    final Map<Class<?>, Object> f11749a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    final Set<Class<? extends v3.a<?>>> f11750b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    final Context f11751c;

    a(Context context) {
        this.f11751c = context.getApplicationContext();
    }

    private <T> T b(Class<? extends v3.a<?>> cls, Set<Class<?>> set) {
        T t;
        if (x3.a.d()) {
            try {
                x3.a.a(cls.getSimpleName());
            } catch (Throwable th2) {
                x3.a.b();
                throw th2;
            }
        }
        if (!set.contains(cls)) {
            if (!this.f11749a.containsKey(cls)) {
                set.add(cls);
                v3.a aVar = (v3.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends v3.a<?>>> b11 = aVar.b();
                if (!b11.isEmpty()) {
                    for (Class next : b11) {
                        if (!this.f11749a.containsKey(next)) {
                            b(next, set);
                        }
                    }
                }
                t = aVar.a(this.f11751c);
                set.remove(cls);
                this.f11749a.put(cls, t);
            } else {
                t = this.f11749a.get(cls);
            }
            x3.a.b();
            return t;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }

    public static a c(Context context) {
        if (f11747d == null) {
            synchronized (f11748e) {
                if (f11747d == null) {
                    f11747d = new a(context);
                }
            }
        }
        return f11747d;
    }

    /* access modifiers changed from: package-private */
    public <T> T a(Class<? extends v3.a<?>> cls) {
        T t;
        synchronized (f11748e) {
            t = this.f11749a.get(cls);
            if (t == null) {
                t = b(cls, new HashSet());
            }
        }
        return t;
    }

    public <T> T d(Class<? extends v3.a<T>> cls) {
        return a(cls);
    }

    public boolean e(Class<? extends v3.a<?>> cls) {
        return this.f11750b.contains(cls);
    }
}
