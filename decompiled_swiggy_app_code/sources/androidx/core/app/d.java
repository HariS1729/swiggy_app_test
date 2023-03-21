package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: ActivityRecreator */
final class d {

    /* renamed from: a  reason: collision with root package name */
    protected static final Class<?> f9000a;

    /* renamed from: b  reason: collision with root package name */
    protected static final Field f9001b = b();

    /* renamed from: c  reason: collision with root package name */
    protected static final Field f9002c = f();

    /* renamed from: d  reason: collision with root package name */
    protected static final Method f9003d;

    /* renamed from: e  reason: collision with root package name */
    protected static final Method f9004e;

    /* renamed from: f  reason: collision with root package name */
    protected static final Method f9005f;

    /* renamed from: g  reason: collision with root package name */
    private static final Handler f9006g = new Handler(Looper.getMainLooper());

    /* compiled from: ActivityRecreator */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0033d f9007a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f9008b;

        a(C0033d dVar, Object obj) {
            this.f9007a = dVar;
            this.f9008b = obj;
        }

        public void run() {
            this.f9007a.f9013a = this.f9008b;
        }
    }

    /* compiled from: ActivityRecreator */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Application f9009a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C0033d f9010b;

        b(Application application, C0033d dVar) {
            this.f9009a = application;
            this.f9010b = dVar;
        }

        public void run() {
            this.f9009a.unregisterActivityLifecycleCallbacks(this.f9010b);
        }
    }

    /* compiled from: ActivityRecreator */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f9011a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f9012b;

        c(Object obj, Object obj2) {
            this.f9011a = obj;
            this.f9012b = obj2;
        }

        public void run() {
            try {
                Method method = d.f9003d;
                if (method != null) {
                    method.invoke(this.f9011a, new Object[]{this.f9012b, Boolean.FALSE, "AppCompat recreation"});
                    return;
                }
                d.f9004e.invoke(this.f9011a, new Object[]{this.f9012b, Boolean.FALSE});
            } catch (RuntimeException e11) {
                if (e11.getClass() == RuntimeException.class && e11.getMessage() != null && e11.getMessage().startsWith("Unable to stop")) {
                    throw e11;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
            }
        }
    }

    /* renamed from: androidx.core.app.d$d  reason: collision with other inner class name */
    /* compiled from: ActivityRecreator */
    private static final class C0033d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        Object f9013a;

        /* renamed from: b  reason: collision with root package name */
        private Activity f9014b;

        /* renamed from: c  reason: collision with root package name */
        private final int f9015c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f9016d = false;

        /* renamed from: e  reason: collision with root package name */
        private boolean f9017e = false;

        /* renamed from: f  reason: collision with root package name */
        private boolean f9018f = false;

        C0033d(Activity activity) {
            this.f9014b = activity;
            this.f9015c = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f9014b == activity) {
                this.f9014b = null;
                this.f9017e = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f9017e && !this.f9018f && !this.f9016d && d.h(this.f9013a, this.f9015c, activity)) {
                this.f9018f = true;
                this.f9013a = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f9014b == activity) {
                this.f9016d = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a11 = a();
        f9000a = a11;
        f9003d = d(a11);
        f9004e = c(a11);
        f9005f = e(a11);
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i11 = Build.VERSION.SDK_INT;
        return i11 == 26 || i11 == 27;
    }

    protected static boolean h(Object obj, int i11, Activity activity) {
        try {
            Object obj2 = f9002c.get(activity);
            if (obj2 == obj) {
                if (activity.hashCode() == i11) {
                    f9006g.postAtFrontOfQueue(new c(f9001b.get(activity), obj2));
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        Application application;
        C0033d dVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f9005f == null) {
            return false;
        } else {
            if (f9004e == null && f9003d == null) {
                return false;
            }
            try {
                Object obj2 = f9002c.get(activity);
                if (obj2 == null || (obj = f9001b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new C0033d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f9006g;
                handler.post(new a(dVar, obj2));
                if (g()) {
                    Method method = f9005f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
