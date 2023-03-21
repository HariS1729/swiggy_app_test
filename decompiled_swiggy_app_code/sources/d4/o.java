package d4;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* compiled from: WorkerFactory */
public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    private static final String f14138a = i.f("WorkerFactory");

    /* compiled from: WorkerFactory */
    class a extends o {
        a() {
        }

        public ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static o c() {
        return new a();
    }

    public abstract ListenableWorker a(Context context, String str, WorkerParameters workerParameters);

    public final ListenableWorker b(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker a11 = a(context, str, workerParameters);
        if (a11 == null) {
            Class<? extends U> cls = null;
            try {
                cls = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th2) {
                i c11 = i.c();
                String str2 = f14138a;
                c11.b(str2, "Invalid class: " + str, th2);
            }
            if (cls != null) {
                try {
                    a11 = (ListenableWorker) cls.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
                } catch (Throwable th3) {
                    i c12 = i.c();
                    String str3 = f14138a;
                    c12.b(str3, "Could not instantiate " + str, th3);
                }
            }
        }
        if (a11 == null || !a11.m()) {
            return a11;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", new Object[]{getClass().getName(), str}));
    }
}
