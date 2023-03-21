package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.background.systemalarm.e;
import d4.i;
import m4.l;

public class SystemAlarmService extends LifecycleService implements e.c {

    /* renamed from: d  reason: collision with root package name */
    private static final String f12373d = i.f("SystemAlarmService");

    /* renamed from: b  reason: collision with root package name */
    private e f12374b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12375c;

    private void b() {
        e eVar = new e(this);
        this.f12374b = eVar;
        eVar.m(this);
    }

    public void a() {
        this.f12375c = true;
        i.c().a(f12373d, "All commands completed in dispatcher", new Throwable[0]);
        l.a();
        stopSelf();
    }

    public void onCreate() {
        super.onCreate();
        b();
        this.f12375c = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f12375c = true;
        this.f12374b.j();
    }

    public int onStartCommand(Intent intent, int i11, int i12) {
        super.onStartCommand(intent, i11, i12);
        if (this.f12375c) {
            i.c().d(f12373d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f12374b.j();
            b();
            this.f12375c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f12374b.a(intent, i12);
        return 3;
    }
}
