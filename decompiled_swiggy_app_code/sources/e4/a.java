package e4;

import android.os.Handler;
import android.os.Looper;
import androidx.core.os.e;
import d4.l;

/* compiled from: DefaultRunnableScheduler */
public class a implements l {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f14284a = e.a(Looper.getMainLooper());

    public void a(Runnable runnable) {
        this.f14284a.removeCallbacks(runnable);
    }

    public void b(long j, Runnable runnable) {
        this.f14284a.postDelayed(runnable, j);
    }
}
