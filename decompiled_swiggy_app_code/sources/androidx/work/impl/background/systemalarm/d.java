package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.e;
import d4.i;
import e4.b;
import h4.c;
import java.util.Collections;
import java.util.List;
import m4.l;
import m4.p;

/* compiled from: DelayMetCommandHandler */
public class d implements c, b, p.b {
    private static final String j = i.f("DelayMetCommandHandler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f12386a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12387b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12388c;

    /* renamed from: d  reason: collision with root package name */
    private final e f12389d;

    /* renamed from: e  reason: collision with root package name */
    private final h4.d f12390e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f12391f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private int f12392g = 0;

    /* renamed from: h  reason: collision with root package name */
    private PowerManager.WakeLock f12393h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f12394i = false;

    d(Context context, int i11, String str, e eVar) {
        this.f12386a = context;
        this.f12387b = i11;
        this.f12389d = eVar;
        this.f12388c = str;
        this.f12390e = new h4.d(context, eVar.f(), this);
    }

    private void d() {
        synchronized (this.f12391f) {
            this.f12390e.e();
            this.f12389d.h().c(this.f12388c);
            PowerManager.WakeLock wakeLock = this.f12393h;
            if (wakeLock != null && wakeLock.isHeld()) {
                i.c().a(j, String.format("Releasing wakelock %s for WorkSpec %s", new Object[]{this.f12393h, this.f12388c}), new Throwable[0]);
                this.f12393h.release();
            }
        }
    }

    private void g() {
        synchronized (this.f12391f) {
            if (this.f12392g < 2) {
                this.f12392g = 2;
                i c11 = i.c();
                String str = j;
                c11.a(str, String.format("Stopping work for WorkSpec %s", new Object[]{this.f12388c}), new Throwable[0]);
                Intent g11 = b.g(this.f12386a, this.f12388c);
                e eVar = this.f12389d;
                eVar.k(new e.b(eVar, g11, this.f12387b));
                if (this.f12389d.e().g(this.f12388c)) {
                    i.c().a(str, String.format("WorkSpec %s needs to be rescheduled", new Object[]{this.f12388c}), new Throwable[0]);
                    Intent f11 = b.f(this.f12386a, this.f12388c);
                    e eVar2 = this.f12389d;
                    eVar2.k(new e.b(eVar2, f11, this.f12387b));
                } else {
                    i.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.f12388c}), new Throwable[0]);
                }
            } else {
                i.c().a(j, String.format("Already stopped work for %s", new Object[]{this.f12388c}), new Throwable[0]);
            }
        }
    }

    public void a(List<String> list) {
        g();
    }

    public void b(String str) {
        i.c().a(j, String.format("Exceeded time limits on execution for %s", new Object[]{str}), new Throwable[0]);
        g();
    }

    public void c(String str, boolean z11) {
        i.c().a(j, String.format("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z11)}), new Throwable[0]);
        d();
        if (z11) {
            Intent f11 = b.f(this.f12386a, this.f12388c);
            e eVar = this.f12389d;
            eVar.k(new e.b(eVar, f11, this.f12387b));
        }
        if (this.f12394i) {
            Intent a11 = b.a(this.f12386a);
            e eVar2 = this.f12389d;
            eVar2.k(new e.b(eVar2, a11, this.f12387b));
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.f12393h = l.b(this.f12386a, String.format("%s (%s)", new Object[]{this.f12388c, Integer.valueOf(this.f12387b)}));
        i c11 = i.c();
        String str = j;
        c11.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", new Object[]{this.f12393h, this.f12388c}), new Throwable[0]);
        this.f12393h.acquire();
        l4.p m11 = this.f12389d.g().w().N().m(this.f12388c);
        if (m11 == null) {
            g();
            return;
        }
        boolean b11 = m11.b();
        this.f12394i = b11;
        if (!b11) {
            i.c().a(str, String.format("No constraints for %s", new Object[]{this.f12388c}), new Throwable[0]);
            f(Collections.singletonList(this.f12388c));
            return;
        }
        this.f12390e.d(Collections.singletonList(m11));
    }

    public void f(List<String> list) {
        if (list.contains(this.f12388c)) {
            synchronized (this.f12391f) {
                if (this.f12392g == 0) {
                    this.f12392g = 1;
                    i.c().a(j, String.format("onAllConstraintsMet for %s", new Object[]{this.f12388c}), new Throwable[0]);
                    if (this.f12389d.e().j(this.f12388c)) {
                        this.f12389d.h().b(this.f12388c, 600000, this);
                    } else {
                        d();
                    }
                } else {
                    i.c().a(j, String.format("Already started work for %s", new Object[]{this.f12388c}), new Throwable[0]);
                }
            }
        }
    }
}
