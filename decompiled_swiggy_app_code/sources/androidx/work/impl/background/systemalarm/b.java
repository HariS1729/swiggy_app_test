package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.e;
import d4.i;
import java.util.HashMap;
import java.util.Map;
import l4.p;

/* compiled from: CommandHandler */
public class b implements e4.b {

    /* renamed from: d  reason: collision with root package name */
    private static final String f12377d = i.f("CommandHandler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f12378a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, e4.b> f12379b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Object f12380c = new Object();

    b(Context context) {
        this.f12378a = context;
    }

    static Intent a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent d(Context context, String str, boolean z11) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z11);
        return intent;
    }

    static Intent e(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    static Intent f(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent g(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    private void h(Intent intent, int i11, e eVar) {
        i.c().a(f12377d, String.format("Handling constraints changed %s", new Object[]{intent}), new Throwable[0]);
        new c(this.f12378a, i11, eVar).a();
    }

    private void i(Intent intent, int i11, e eVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f12380c) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            i c11 = i.c();
            String str = f12377d;
            c11.a(str, String.format("Handing delay met for %s", new Object[]{string}), new Throwable[0]);
            if (!this.f12379b.containsKey(string)) {
                d dVar = new d(this.f12378a, i11, string, eVar);
                this.f12379b.put(string, dVar);
                dVar.e();
            } else {
                i.c().a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", new Object[]{string}), new Throwable[0]);
            }
        }
    }

    private void j(Intent intent, int i11) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z11 = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        i.c().a(f12377d, String.format("Handling onExecutionCompleted %s, %s", new Object[]{intent, Integer.valueOf(i11)}), new Throwable[0]);
        c(string, z11);
    }

    private void k(Intent intent, int i11, e eVar) {
        i.c().a(f12377d, String.format("Handling reschedule %s, %s", new Object[]{intent, Integer.valueOf(i11)}), new Throwable[0]);
        eVar.g().A();
    }

    private void l(Intent intent, int i11, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        i c11 = i.c();
        String str = f12377d;
        c11.a(str, String.format("Handling schedule work for %s", new Object[]{string}), new Throwable[0]);
        WorkDatabase w11 = eVar.g().w();
        w11.e();
        try {
            p m11 = w11.N().m(string);
            if (m11 == null) {
                i c12 = i.c();
                c12.h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
            } else if (m11.f15494b.isFinished()) {
                i c13 = i.c();
                c13.h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                w11.i();
            } else {
                long a11 = m11.a();
                if (!m11.b()) {
                    i.c().a(str, String.format("Setting up Alarms for %s at %s", new Object[]{string, Long.valueOf(a11)}), new Throwable[0]);
                    a.c(this.f12378a, eVar.g(), string, a11);
                } else {
                    i.c().a(str, String.format("Opportunistically setting an alarm for %s at %s", new Object[]{string, Long.valueOf(a11)}), new Throwable[0]);
                    a.c(this.f12378a, eVar.g(), string, a11);
                    eVar.k(new e.b(eVar, a(this.f12378a), i11));
                }
                w11.C();
                w11.i();
            }
        } finally {
            w11.i();
        }
    }

    private void m(Intent intent, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        i.c().a(f12377d, String.format("Handing stopWork work for %s", new Object[]{string}), new Throwable[0]);
        eVar.g().F(string);
        a.a(this.f12378a, eVar.g(), string);
        eVar.c(string, false);
    }

    private static boolean n(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    public void c(String str, boolean z11) {
        synchronized (this.f12380c) {
            e4.b remove = this.f12379b.remove(str);
            if (remove != null) {
                remove.c(str, z11);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        boolean z11;
        synchronized (this.f12380c) {
            z11 = !this.f12379b.isEmpty();
        }
        return z11;
    }

    /* access modifiers changed from: package-private */
    public void p(Intent intent, int i11, e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            h(intent, i11, eVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            k(intent, i11, eVar);
        } else if (!n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            i.c().b(f12377d, String.format("Invalid request for %s, requires %s.", new Object[]{action, "KEY_WORKSPEC_ID"}), new Throwable[0]);
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            l(intent, i11, eVar);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            i(intent, i11, eVar);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            m(intent, eVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            j(intent, i11);
        } else {
            i.c().h(f12377d, String.format("Ignoring intent %s", new Object[]{intent}), new Throwable[0]);
        }
    }
}
