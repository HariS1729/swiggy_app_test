package e4;

import android.text.TextUtils;
import androidx.work.ExistingWorkPolicy;
import androidx.work.c;
import androidx.work.e;
import d4.i;
import d4.j;
import d4.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import m4.b;

/* compiled from: WorkContinuationImpl */
public class g extends m {
    private static final String j = i.f("WorkContinuationImpl");

    /* renamed from: a  reason: collision with root package name */
    private final i f14301a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14302b;

    /* renamed from: c  reason: collision with root package name */
    private final ExistingWorkPolicy f14303c;

    /* renamed from: d  reason: collision with root package name */
    private final List<? extends e> f14304d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f14305e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f14306f;

    /* renamed from: g  reason: collision with root package name */
    private final List<g> f14307g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f14308h;

    /* renamed from: i  reason: collision with root package name */
    private j f14309i;

    public g(i iVar, List<? extends e> list) {
        this(iVar, (String) null, ExistingWorkPolicy.KEEP, list, (List<g>) null);
    }

    private static boolean k(g gVar, Set<String> set) {
        set.addAll(gVar.e());
        Set<String> n = n(gVar);
        for (String contains : set) {
            if (n.contains(contains)) {
                return true;
            }
        }
        List<g> g11 = gVar.g();
        if (g11 != null && !g11.isEmpty()) {
            for (g k : g11) {
                if (k(k, set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.e());
        return false;
    }

    public static Set<String> n(g gVar) {
        HashSet hashSet = new HashSet();
        List<g> g11 = gVar.g();
        if (g11 != null && !g11.isEmpty()) {
            for (g e11 : g11) {
                hashSet.addAll(e11.e());
            }
        }
        return hashSet;
    }

    public j a() {
        if (!this.f14308h) {
            b bVar = new b(this);
            this.f14301a.x().c(bVar);
            this.f14309i = bVar.d();
        } else {
            i.c().h(j, String.format("Already enqueued work ids (%s)", new Object[]{TextUtils.join(", ", this.f14305e)}), new Throwable[0]);
        }
        return this.f14309i;
    }

    public m c(List<c> list) {
        if (list.isEmpty()) {
            return this;
        }
        return new g(this.f14301a, this.f14302b, ExistingWorkPolicy.KEEP, list, Collections.singletonList(this));
    }

    public ExistingWorkPolicy d() {
        return this.f14303c;
    }

    public List<String> e() {
        return this.f14305e;
    }

    public String f() {
        return this.f14302b;
    }

    public List<g> g() {
        return this.f14307g;
    }

    public List<? extends e> h() {
        return this.f14304d;
    }

    public i i() {
        return this.f14301a;
    }

    public boolean j() {
        return k(this, new HashSet());
    }

    public boolean l() {
        return this.f14308h;
    }

    public void m() {
        this.f14308h = true;
    }

    public g(i iVar, String str, ExistingWorkPolicy existingWorkPolicy, List<? extends e> list) {
        this(iVar, str, existingWorkPolicy, list, (List<g>) null);
    }

    public g(i iVar, String str, ExistingWorkPolicy existingWorkPolicy, List<? extends e> list, List<g> list2) {
        this.f14301a = iVar;
        this.f14302b = str;
        this.f14303c = existingWorkPolicy;
        this.f14304d = list;
        this.f14307g = list2;
        this.f14305e = new ArrayList(list.size());
        this.f14306f = new ArrayList();
        if (list2 != null) {
            for (g gVar : list2) {
                this.f14306f.addAll(gVar.f14306f);
            }
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            String a11 = ((e) list.get(i11)).a();
            this.f14305e.add(a11);
            this.f14306f.add(a11);
        }
    }
}
