package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class LifecycleService extends Service implements r {

    /* renamed from: a  reason: collision with root package name */
    private final h0 f10632a = new h0(this);

    public Lifecycle getLifecycle() {
        return this.f10632a.a();
    }

    public IBinder onBind(Intent intent) {
        this.f10632a.b();
        return null;
    }

    public void onCreate() {
        this.f10632a.c();
        super.onCreate();
    }

    public void onDestroy() {
        this.f10632a.d();
        super.onDestroy();
    }

    public void onStart(Intent intent, int i11) {
        this.f10632a.e();
        super.onStart(intent, i11);
    }

    public int onStartCommand(Intent intent, int i11, int i12) {
        return super.onStartCommand(intent, i11, i12);
    }
}
