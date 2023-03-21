package f4;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.WorkInfo;
import androidx.work.a;
import com.xiaomi.mipush.sdk.Constants;
import d4.i;
import e4.e;
import h4.c;
import h4.d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l4.p;
import m4.f;

/* compiled from: GreedyScheduler */
public class b implements e, c, e4.b {

    /* renamed from: i  reason: collision with root package name */
    private static final String f14630i = i.f("GreedyScheduler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f14631a;

    /* renamed from: b  reason: collision with root package name */
    private final e4.i f14632b;

    /* renamed from: c  reason: collision with root package name */
    private final d f14633c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<p> f14634d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private a f14635e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14636f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f14637g;

    /* renamed from: h  reason: collision with root package name */
    Boolean f14638h;

    public b(Context context, a aVar, n4.a aVar2, e4.i iVar) {
        this.f14631a = context;
        this.f14632b = iVar;
        this.f14633c = new d(context, aVar2, this);
        this.f14635e = new a(this, aVar.k());
        this.f14637g = new Object();
    }

    private void g() {
        this.f14638h = Boolean.valueOf(f.b(this.f14631a, this.f14632b.q()));
    }

    private void h() {
        if (!this.f14636f) {
            this.f14632b.u().d(this);
            this.f14636f = true;
        }
    }

    private void i(String str) {
        synchronized (this.f14637g) {
            Iterator<p> it2 = this.f14634d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                p next = it2.next();
                if (next.f15493a.equals(str)) {
                    i.c().a(f14630i, String.format("Stopping tracking for %s", new Object[]{str}), new Throwable[0]);
                    this.f14634d.remove(next);
                    this.f14633c.d(this.f14634d);
                    break;
                }
            }
        }
    }

    public void a(List<String> list) {
        for (String next : list) {
            i.c().a(f14630i, String.format("Constraints not met: Cancelling work ID %s", new Object[]{next}), new Throwable[0]);
            this.f14632b.F(next);
        }
    }

    public boolean b() {
        return false;
    }

    public void c(String str, boolean z11) {
        i(str);
    }

    public void d(String str) {
        if (this.f14638h == null) {
            g();
        }
        if (!this.f14638h.booleanValue()) {
            i.c().d(f14630i, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        h();
        i.c().a(f14630i, String.format("Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
        a aVar = this.f14635e;
        if (aVar != null) {
            aVar.b(str);
        }
        this.f14632b.F(str);
    }

    public void e(p... pVarArr) {
        if (this.f14638h == null) {
            g();
        }
        if (!this.f14638h.booleanValue()) {
            i.c().d(f14630i, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            long a11 = pVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.f15494b == WorkInfo.State.ENQUEUED) {
                if (currentTimeMillis < a11) {
                    a aVar = this.f14635e;
                    if (aVar != null) {
                        aVar.a(pVar);
                    }
                } else if (pVar.b()) {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 23 && pVar.j.h()) {
                        i.c().a(f14630i, String.format("Ignoring WorkSpec %s, Requires device idle.", new Object[]{pVar}), new Throwable[0]);
                    } else if (i11 < 24 || !pVar.j.e()) {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f15493a);
                    } else {
                        i.c().a(f14630i, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", new Object[]{pVar}), new Throwable[0]);
                    }
                } else {
                    i.c().a(f14630i, String.format("Starting work for %s", new Object[]{pVar.f15493a}), new Throwable[0]);
                    this.f14632b.C(pVar.f15493a);
                }
            }
        }
        synchronized (this.f14637g) {
            if (!hashSet.isEmpty()) {
                i.c().a(f14630i, String.format("Starting tracking for [%s]", new Object[]{TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, hashSet2)}), new Throwable[0]);
                this.f14634d.addAll(hashSet);
                this.f14633c.d(this.f14634d);
            }
        }
    }

    public void f(List<String> list) {
        for (String next : list) {
            i.c().a(f14630i, String.format("Constraints met: Scheduling work ID %s", new Object[]{next}), new Throwable[0]);
            this.f14632b.C(next);
        }
    }
}
