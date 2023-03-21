package a6;

import android.os.Handler;
import android.os.Looper;

/* compiled from: MainUIThread */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f991b;

    /* renamed from: a  reason: collision with root package name */
    private Handler f992a = new Handler(Looper.getMainLooper());

    private a() {
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (f991b == null) {
                f991b = new a();
            }
            aVar = f991b;
        }
        return aVar;
    }

    public void b(Runnable runnable) {
        this.f992a.post(runnable);
    }
}
