package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import d4.i;
import java.util.ArrayList;
import java.util.List;
import m4.g;
import m4.l;
import m4.p;

/* compiled from: SystemAlarmDispatcher */
public class e implements e4.b {
    static final String k = i.f("SystemAlarmDispatcher");

    /* renamed from: a  reason: collision with root package name */
    final Context f12395a;

    /* renamed from: b  reason: collision with root package name */
    private final n4.a f12396b;

    /* renamed from: c  reason: collision with root package name */
    private final p f12397c;

    /* renamed from: d  reason: collision with root package name */
    private final e4.d f12398d;

    /* renamed from: e  reason: collision with root package name */
    private final e4.i f12399e;

    /* renamed from: f  reason: collision with root package name */
    final b f12400f;

    /* renamed from: g  reason: collision with root package name */
    private final Handler f12401g;

    /* renamed from: h  reason: collision with root package name */
    final List<Intent> f12402h;

    /* renamed from: i  reason: collision with root package name */
    Intent f12403i;
    private c j;

    /* compiled from: SystemAlarmDispatcher */
    class a implements Runnable {
        a() {
        }

        public void run() {
            d dVar;
            e eVar;
            synchronized (e.this.f12402h) {
                e eVar2 = e.this;
                eVar2.f12403i = eVar2.f12402h.get(0);
            }
            Intent intent = e.this.f12403i;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.f12403i.getIntExtra("KEY_START_ID", 0);
                i c11 = i.c();
                String str = e.k;
                c11.a(str, String.format("Processing command %s, %s", new Object[]{e.this.f12403i, Integer.valueOf(intExtra)}), new Throwable[0]);
                PowerManager.WakeLock b11 = l.b(e.this.f12395a, String.format("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
                try {
                    i.c().a(str, String.format("Acquiring operation wake lock (%s) %s", new Object[]{action, b11}), new Throwable[0]);
                    b11.acquire();
                    e eVar3 = e.this;
                    eVar3.f12400f.p(eVar3.f12403i, intExtra, eVar3);
                    i.c().a(str, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, b11}), new Throwable[0]);
                    b11.release();
                    eVar = e.this;
                    dVar = new d(eVar);
                } catch (Throwable th2) {
                    i.c().a(e.k, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, b11}), new Throwable[0]);
                    b11.release();
                    e eVar4 = e.this;
                    eVar4.k(new d(eVar4));
                    throw th2;
                }
                eVar.k(dVar);
            }
        }
    }

    /* compiled from: SystemAlarmDispatcher */
    static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final e f12405a;

        /* renamed from: b  reason: collision with root package name */
        private final Intent f12406b;

        /* renamed from: c  reason: collision with root package name */
        private final int f12407c;

        b(e eVar, Intent intent, int i11) {
            this.f12405a = eVar;
            this.f12406b = intent;
            this.f12407c = i11;
        }

        public void run() {
            this.f12405a.a(this.f12406b, this.f12407c);
        }
    }

    /* compiled from: SystemAlarmDispatcher */
    interface c {
        void a();
    }

    /* compiled from: SystemAlarmDispatcher */
    static class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final e f12408a;

        d(e eVar) {
            this.f12408a = eVar;
        }

        public void run() {
            this.f12408a.d();
        }
    }

    e(Context context) {
        this(context, (e4.d) null, (e4.i) null);
    }

    private void b() {
        if (this.f12401g.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean i(String str) {
        b();
        synchronized (this.f12402h) {
            for (Intent action : this.f12402h) {
                if (str.equals(action.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    private void l() {
        b();
        PowerManager.WakeLock b11 = l.b(this.f12395a, "ProcessCommand");
        try {
            b11.acquire();
            this.f12399e.x().c(new a());
        } finally {
            b11.release();
        }
    }

    public boolean a(Intent intent, int i11) {
        i c11 = i.c();
        String str = k;
        boolean z11 = false;
        c11.a(str, String.format("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i11)}), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            i.c().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i11);
            synchronized (this.f12402h) {
                if (!this.f12402h.isEmpty()) {
                    z11 = true;
                }
                this.f12402h.add(intent);
                if (!z11) {
                    l();
                }
            }
            return true;
        }
    }

    public void c(String str, boolean z11) {
        k(new b(this, b.d(this.f12395a, str, z11), 0));
    }

    /* access modifiers changed from: package-private */
    public void d() {
        i c11 = i.c();
        String str = k;
        c11.a(str, "Checking if commands are complete.", new Throwable[0]);
        b();
        synchronized (this.f12402h) {
            if (this.f12403i != null) {
                i.c().a(str, String.format("Removing command %s", new Object[]{this.f12403i}), new Throwable[0]);
                if (this.f12402h.remove(0).equals(this.f12403i)) {
                    this.f12403i = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            g a11 = this.f12396b.a();
            if (!this.f12400f.o() && this.f12402h.isEmpty() && !a11.a()) {
                i.c().a(str, "No more commands & intents.", new Throwable[0]);
                c cVar = this.j;
                if (cVar != null) {
                    cVar.a();
                }
            } else if (!this.f12402h.isEmpty()) {
                l();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public e4.d e() {
        return this.f12398d;
    }

    /* access modifiers changed from: package-private */
    public n4.a f() {
        return this.f12396b;
    }

    /* access modifiers changed from: package-private */
    public e4.i g() {
        return this.f12399e;
    }

    /* access modifiers changed from: package-private */
    public p h() {
        return this.f12397c;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        i.c().a(k, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f12398d.i(this);
        this.f12397c.a();
        this.j = null;
    }

    /* access modifiers changed from: package-private */
    public void k(Runnable runnable) {
        this.f12401g.post(runnable);
    }

    /* access modifiers changed from: package-private */
    public void m(c cVar) {
        if (this.j != null) {
            i.c().b(k, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.j = cVar;
        }
    }

    e(Context context, e4.d dVar, e4.i iVar) {
        Context applicationContext = context.getApplicationContext();
        this.f12395a = applicationContext;
        this.f12400f = new b(applicationContext);
        this.f12397c = new p();
        iVar = iVar == null ? e4.i.s(context) : iVar;
        this.f12399e = iVar;
        dVar = dVar == null ? iVar.u() : dVar;
        this.f12398d = dVar;
        this.f12396b = iVar.x();
        dVar.d(this);
        this.f12402h = new ArrayList();
        this.f12403i = null;
        this.f12401g = new Handler(Looper.getMainLooper());
    }
}
