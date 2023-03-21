package k3;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* compiled from: CallbackHandlerRegistry */
public class a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f15402b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final androidx.collection.a<Class<? extends b>, b> f15403a = new androidx.collection.a<>();

    /* renamed from: k3.a$a  reason: collision with other inner class name */
    /* compiled from: CallbackHandlerRegistry */
    public interface C0143a<T extends b> {
        void a(Context context, T t, Bundle bundle);
    }

    /* compiled from: CallbackHandlerRegistry */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        final androidx.collection.a<String, C0143a<? extends b>> f15404a = new androidx.collection.a<>();

        /* renamed from: b  reason: collision with root package name */
        b f15405b;

        b() {
        }
    }

    private static Class<? extends Runnable> b(Class<? extends b> cls) throws ClassNotFoundException {
        return Class.forName(String.format("%s.%sInitializer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
    }

    private b c(Class<?> cls) {
        b bVar;
        synchronized (this) {
            bVar = this.f15403a.get(cls);
        }
        if (bVar != null) {
            return bVar;
        }
        if (cls.getSuperclass() != null) {
            return c(cls.getSuperclass());
        }
        return null;
    }

    private <T extends b> void e(Class<T> cls) {
        try {
            b bVar = new b();
            this.f15403a.put(cls, bVar);
            bVar.f15405b = (b) b(cls).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InstantiationException e11) {
            Log.e("CallbackHandlerRegistry", "Unable to initialize " + cls.getName(), e11);
        } catch (IllegalAccessException e12) {
            Log.e("CallbackHandlerRegistry", "Unable to initialize " + cls.getName(), e12);
        } catch (InvocationTargetException e13) {
            Log.e("CallbackHandlerRegistry", "Unable to initialize " + cls.getName(), e13);
        } catch (NoSuchMethodException e14) {
            Log.e("CallbackHandlerRegistry", "Unable to initialize " + cls.getName(), e14);
        } catch (ClassNotFoundException e15) {
            Log.e("CallbackHandlerRegistry", "Unable to initialize " + cls.getName(), e15);
        }
    }

    /* access modifiers changed from: package-private */
    public <T extends b> void a(Class<T> cls) {
        synchronized (this) {
            if (!this.f15403a.containsKey(cls)) {
                e(cls);
            }
        }
    }

    public <T extends b> void d(Context context, T t, Bundle bundle) {
        Class<?> cls = t.getClass();
        a(cls);
        b c11 = c(cls);
        if (c11 == null) {
            Log.e("CallbackHandlerRegistry", "No map found for " + cls.getName());
            return;
        }
        String string = bundle.getString("remotecallback.method");
        C0143a aVar = c11.f15404a.get(string);
        if (aVar == null) {
            Log.e("CallbackHandlerRegistry", "No handler found for " + string + " on " + cls.getName());
            return;
        }
        aVar.a(context, t, bundle);
    }
}
