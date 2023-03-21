package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import d4.i;
import h4.c;
import h4.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import l4.p;

/* compiled from: SystemForegroundDispatcher */
public class a implements c, e4.b {
    static final String k = i.f("SystemFgDispatcher");

    /* renamed from: a  reason: collision with root package name */
    private Context f12430a;

    /* renamed from: b  reason: collision with root package name */
    private e4.i f12431b;

    /* renamed from: c  reason: collision with root package name */
    private final n4.a f12432c;

    /* renamed from: d  reason: collision with root package name */
    final Object f12433d = new Object();

    /* renamed from: e  reason: collision with root package name */
    String f12434e;

    /* renamed from: f  reason: collision with root package name */
    final Map<String, d4.c> f12435f;

    /* renamed from: g  reason: collision with root package name */
    final Map<String, p> f12436g;

    /* renamed from: h  reason: collision with root package name */
    final Set<p> f12437h;

    /* renamed from: i  reason: collision with root package name */
    final d f12438i;
    private b j;

    /* renamed from: androidx.work.impl.foreground.a$a  reason: collision with other inner class name */
    /* compiled from: SystemForegroundDispatcher */
    class C0095a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WorkDatabase f12439a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f12440b;

        C0095a(WorkDatabase workDatabase, String str) {
            this.f12439a = workDatabase;
            this.f12440b = str;
        }

        public void run() {
            p m11 = this.f12439a.N().m(this.f12440b);
            if (m11 != null && m11.b()) {
                synchronized (a.this.f12433d) {
                    a.this.f12436g.put(this.f12440b, m11);
                    a.this.f12437h.add(m11);
                    a aVar = a.this;
                    aVar.f12438i.d(aVar.f12437h);
                }
            }
        }
    }

    /* compiled from: SystemForegroundDispatcher */
    interface b {
        void i0(int i11);

        void j0(int i11, Notification notification);

        void k0(int i11, int i12, Notification notification);

        void stop();
    }

    a(Context context) {
        this.f12430a = context;
        e4.i s11 = e4.i.s(context);
        this.f12431b = s11;
        n4.a x11 = s11.x();
        this.f12432c = x11;
        this.f12434e = null;
        this.f12435f = new LinkedHashMap();
        this.f12437h = new HashSet();
        this.f12436g = new HashMap();
        this.f12438i = new d(this.f12430a, x11, this);
        this.f12431b.u().d(this);
    }

    public static Intent b(Context context, String str, d4.c cVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", cVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", cVar.a());
        intent.putExtra("KEY_NOTIFICATION", cVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context, String str, d4.c cVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", cVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", cVar.a());
        intent.putExtra("KEY_NOTIFICATION", cVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent e(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void g(Intent intent) {
        i.c().d(k, String.format("Stopping foreground work for %s", new Object[]{intent}), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
            this.f12431b.e(UUID.fromString(stringExtra));
        }
    }

    private void h(Intent intent) {
        int i11 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        i.c().a(k, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", new Object[]{Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)}), new Throwable[0]);
        if (notification != null && this.j != null) {
            this.f12435f.put(stringExtra, new d4.c(intExtra, notification, intExtra2));
            if (TextUtils.isEmpty(this.f12434e)) {
                this.f12434e = stringExtra;
                this.j.k0(intExtra, intExtra2, notification);
                return;
            }
            this.j.j0(intExtra, notification);
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry<String, d4.c> value : this.f12435f.entrySet()) {
                    i11 |= ((d4.c) value.getValue()).a();
                }
                d4.c cVar = this.f12435f.get(this.f12434e);
                if (cVar != null) {
                    this.j.k0(cVar.c(), i11, cVar.b());
                }
            }
        }
    }

    private void i(Intent intent) {
        i.c().d(k, String.format("Started foreground service %s", new Object[]{intent}), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        this.f12432c.c(new C0095a(this.f12431b.w(), stringExtra));
    }

    public void a(List<String> list) {
        if (!list.isEmpty()) {
            for (String next : list) {
                i.c().a(k, String.format("Constraints unmet for WorkSpec %s", new Object[]{next}), new Throwable[0]);
                this.f12431b.E(next);
            }
        }
    }

    public void c(String str, boolean z11) {
        Map.Entry entry;
        synchronized (this.f12433d) {
            p remove = this.f12436g.remove(str);
            if (remove != null ? this.f12437h.remove(remove) : false) {
                this.f12438i.d(this.f12437h);
            }
        }
        d4.c remove2 = this.f12435f.remove(str);
        if (str.equals(this.f12434e) && this.f12435f.size() > 0) {
            Iterator it2 = this.f12435f.entrySet().iterator();
            Object next = it2.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it2.hasNext()) {
                    break;
                }
                next = it2.next();
            }
            this.f12434e = (String) entry.getKey();
            if (this.j != null) {
                d4.c cVar = (d4.c) entry.getValue();
                this.j.k0(cVar.c(), cVar.a(), cVar.b());
                this.j.i0(cVar.c());
            }
        }
        b bVar = this.j;
        if (remove2 != null && bVar != null) {
            i.c().a(k, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", new Object[]{Integer.valueOf(remove2.c()), str, Integer.valueOf(remove2.a())}), new Throwable[0]);
            bVar.i0(remove2.c());
        }
    }

    public void f(List<String> list) {
    }

    /* access modifiers changed from: package-private */
    public void j(Intent intent) {
        i.c().d(k, "Stopping foreground service", new Throwable[0]);
        b bVar = this.j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    /* access modifiers changed from: package-private */
    public void k() {
        this.j = null;
        synchronized (this.f12433d) {
            this.f12438i.e();
        }
        this.f12431b.u().i(this);
    }

    /* access modifiers changed from: package-private */
    public void l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            i(intent);
            h(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            h(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            g(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            j(intent);
        }
    }

    /* access modifiers changed from: package-private */
    public void m(b bVar) {
        if (this.j != null) {
            i.c().b(k, "A callback already exists.", new Throwable[0]);
        } else {
            this.j = bVar;
        }
    }
}
