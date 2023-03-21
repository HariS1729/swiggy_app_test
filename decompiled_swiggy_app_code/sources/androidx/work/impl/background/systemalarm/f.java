package androidx.work.impl.background.systemalarm;

import android.content.Context;
import d4.i;
import e4.e;
import l4.p;

/* compiled from: SystemAlarmScheduler */
public class f implements e {

    /* renamed from: b  reason: collision with root package name */
    private static final String f12409b = i.f("SystemAlarmScheduler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f12410a;

    public f(Context context) {
        this.f12410a = context.getApplicationContext();
    }

    private void a(p pVar) {
        i.c().a(f12409b, String.format("Scheduling work with workSpecId %s", new Object[]{pVar.f15493a}), new Throwable[0]);
        this.f12410a.startService(b.f(this.f12410a, pVar.f15493a));
    }

    public boolean b() {
        return true;
    }

    public void d(String str) {
        this.f12410a.startService(b.g(this.f12410a, str));
    }

    public void e(p... pVarArr) {
        for (p a11 : pVarArr) {
            a(a11);
        }
    }
}
