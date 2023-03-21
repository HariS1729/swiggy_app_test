package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.foreground.a;
import d4.i;

public class SystemForegroundService extends LifecycleService implements a.b {

    /* renamed from: f  reason: collision with root package name */
    private static final String f12415f = i.f("SystemFgService");

    /* renamed from: g  reason: collision with root package name */
    private static SystemForegroundService f12416g = null;

    /* renamed from: b  reason: collision with root package name */
    private Handler f12417b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12418c;

    /* renamed from: d  reason: collision with root package name */
    a f12419d;

    /* renamed from: e  reason: collision with root package name */
    NotificationManager f12420e;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f12421a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Notification f12422b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f12423c;

        a(int i11, Notification notification, int i12) {
            this.f12421a = i11;
            this.f12422b = notification;
            this.f12423c = i12;
        }

        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f12421a, this.f12422b, this.f12423c);
            } else {
                SystemForegroundService.this.startForeground(this.f12421a, this.f12422b);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f12425a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Notification f12426b;

        b(int i11, Notification notification) {
            this.f12425a = i11;
            this.f12426b = notification;
        }

        public void run() {
            SystemForegroundService.this.f12420e.notify(this.f12425a, this.f12426b);
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f12428a;

        c(int i11) {
            this.f12428a = i11;
        }

        public void run() {
            SystemForegroundService.this.f12420e.cancel(this.f12428a);
        }
    }

    private void b() {
        this.f12417b = new Handler(Looper.getMainLooper());
        this.f12420e = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.f12419d = aVar;
        aVar.m(this);
    }

    public void i0(int i11) {
        this.f12417b.post(new c(i11));
    }

    public void j0(int i11, Notification notification) {
        this.f12417b.post(new b(i11, notification));
    }

    public void k0(int i11, int i12, Notification notification) {
        this.f12417b.post(new a(i11, notification, i12));
    }

    public void onCreate() {
        super.onCreate();
        f12416g = this;
        b();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f12419d.k();
    }

    public int onStartCommand(Intent intent, int i11, int i12) {
        super.onStartCommand(intent, i11, i12);
        if (this.f12418c) {
            i.c().d(f12415f, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f12419d.k();
            b();
            this.f12418c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f12419d.l(intent);
        return 3;
    }

    public void stop() {
        this.f12418c = true;
        i.c().a(f12415f, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f12416g = null;
        stopSelf();
    }
}
