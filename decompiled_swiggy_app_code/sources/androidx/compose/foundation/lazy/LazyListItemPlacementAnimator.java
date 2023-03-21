package androidx.compose.foundation.lazy;

import bp0.k;
import d2.l;
import d2.m;
import defpackage.v1;
import fp0.c;
import in.swiggy.android.tejas.network.HttpRequest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineStart;
import rp0.f;
import w.a;
import w.q;
import w.s;
import w.t;
import wp0.j0;
import wp0.k1;

/* compiled from: LazyListItemPlacementAnimator.kt */
public final class LazyListItemPlacementAnimator {

    /* renamed from: a  reason: collision with root package name */
    private final j0 f3952a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3953b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Object, b> f3954c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private Map<Object, Integer> f3955d = x.f();

    /* renamed from: e  reason: collision with root package name */
    private int f3956e = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f3957f;

    /* renamed from: g  reason: collision with root package name */
    private int f3958g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f3959h;

    /* renamed from: i  reason: collision with root package name */
    private final Set<Object> f3960i = new LinkedHashSet();

    public LazyListItemPlacementAnimator(j0 j0Var, boolean z11) {
        p.j(j0Var, "scope");
        this.f3952a = j0Var;
        this.f3953b = z11;
    }

    private final int a(int i11, int i12, int i13, long j, boolean z11, int i14, int i15, List<q> list) {
        f fVar;
        f fVar2;
        int i16 = 0;
        int i17 = this.f3958g;
        boolean z12 = z11 ? i17 > i11 : i17 < i11;
        int i18 = this.f3956e;
        boolean z13 = z11 ? i18 < i11 : i18 > i11;
        if (z12) {
            if (!z11) {
                fVar2 = l.u(this.f3958g + 1, i11);
            } else {
                fVar2 = l.u(i11 + 1, this.f3958g);
            }
            int f11 = fVar2.f();
            int g11 = fVar2.g();
            if (f11 <= g11) {
                while (true) {
                    i16 += c(list, f11, i13);
                    if (f11 == g11) {
                        break;
                    }
                    f11++;
                }
            }
            return i14 + this.f3959h + i16 + d(j);
        } else if (!z13) {
            return i15;
        } else {
            if (!z11) {
                fVar = l.u(i11 + 1, this.f3956e);
            } else {
                fVar = l.u(this.f3956e + 1, i11);
            }
            int f12 = fVar.f();
            int g12 = fVar.g();
            if (f12 <= g12) {
                while (true) {
                    i12 += c(list, f12, i13);
                    if (f12 == g12) {
                        break;
                    }
                    f12++;
                }
            }
            return (this.f3957f - i12) + d(j);
        }
    }

    private final int c(List<q> list, int i11, int i12) {
        if (!list.isEmpty() && i11 >= ((q) s.W(list)).getIndex() && i11 <= ((q) s.h0(list)).getIndex()) {
            if (i11 - ((q) s.W(list)).getIndex() >= ((q) s.h0(list)).getIndex() - i11) {
                int l11 = k.l(list);
                while (-1 < l11) {
                    q qVar = list.get(l11);
                    if (qVar.getIndex() != i11) {
                        if (qVar.getIndex() < i11) {
                            break;
                        }
                        l11--;
                    } else {
                        return qVar.j();
                    }
                }
            } else {
                int i13 = 0;
                int size = list.size();
                while (i13 < size) {
                    q qVar2 = list.get(i13);
                    if (qVar2.getIndex() != i11) {
                        if (qVar2.getIndex() > i11) {
                            break;
                        }
                        i13++;
                    } else {
                        return qVar2.j();
                    }
                }
            }
        }
        return i12;
    }

    private final int d(long j) {
        return this.f3953b ? l.k(j) : l.j(j);
    }

    private final void g(q qVar, b bVar) {
        q qVar2 = qVar;
        while (bVar.b().size() > qVar.h()) {
            Object unused = p.H(bVar.b());
        }
        while (bVar.b().size() < qVar.h()) {
            int size = bVar.b().size();
            long g11 = qVar2.g(size);
            List<d> b11 = bVar.b();
            long a11 = bVar.a();
            b11.add(new d(m.a(l.j(g11) - l.j(a11), l.k(g11) - l.k(a11)), qVar2.d(size), (i) null));
        }
        List<d> b12 = bVar.b();
        int size2 = b12.size();
        for (int i11 = 0; i11 < size2; i11++) {
            d dVar = b12.get(i11);
            long d11 = dVar.d();
            long a12 = bVar.a();
            long a13 = m.a(l.j(d11) + l.j(a12), l.k(d11) + l.k(a12));
            long g12 = qVar2.g(i11);
            dVar.f(qVar2.d(i11));
            v1.a0<l> a14 = qVar2.a(i11);
            if (!l.i(a13, g12)) {
                long a15 = bVar.a();
                dVar.g(m.a(l.j(g12) - l.j(a15), l.k(g12) - l.k(a15)));
                if (a14 != null) {
                    dVar.e(true);
                    k1 unused2 = j.d(this.f3952a, (CoroutineContext) null, (CoroutineStart) null, new LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1(dVar, a14, (c<? super LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1>) null), 3, (Object) null);
                }
            }
        }
    }

    private final long h(int i11) {
        boolean z11 = this.f3953b;
        int i12 = z11 ? 0 : i11;
        if (!z11) {
            i11 = 0;
        }
        return m.a(i12, i11);
    }

    public final long b(Object obj, int i11, int i12, int i13, long j) {
        p.j(obj, HttpRequest.HEADER_KEY);
        b bVar = this.f3954c.get(obj);
        if (bVar == null) {
            return j;
        }
        d dVar = bVar.b().get(i11);
        long n = dVar.a().o().n();
        long a11 = bVar.a();
        long a12 = m.a(l.j(n) + l.j(a11), l.k(n) + l.k(a11));
        long d11 = dVar.d();
        long a13 = bVar.a();
        long a14 = m.a(l.j(d11) + l.j(a13), l.k(d11) + l.k(a13));
        if (dVar.b() && ((d(a14) < i12 && d(a12) < i12) || (d(a14) > i13 && d(a12) > i13))) {
            k1 unused = j.d(this.f3952a, (CoroutineContext) null, (CoroutineStart) null, new LazyListItemPlacementAnimator$getAnimatedOffset$1(dVar, (c<? super LazyListItemPlacementAnimator$getAnimatedOffset$1>) null), 3, (Object) null);
        }
        return a12;
    }

    public final void e(int i11, int i12, int i13, boolean z11, List<q> list, t tVar) {
        boolean z12;
        boolean z13;
        boolean z14;
        int i14;
        int i15;
        b bVar;
        q qVar;
        long j;
        int i16;
        long j11;
        int i17;
        List<q> list2 = list;
        t tVar2 = tVar;
        p.j(list2, "positionedItems");
        p.j(tVar2, "itemProvider");
        int size = list.size();
        int i18 = 0;
        int i19 = 0;
        while (true) {
            if (i19 >= size) {
                z12 = false;
                break;
            } else if (list2.get(i19).b()) {
                z12 = true;
                break;
            } else {
                i19++;
            }
        }
        if (!z12) {
            f();
            return;
        }
        int i21 = this.f3953b ? i13 : i12;
        int i22 = i11;
        if (z11) {
            i22 = -i22;
        }
        long h11 = h(i22);
        q qVar2 = (q) s.W(list);
        q qVar3 = (q) s.h0(list);
        int size2 = list.size();
        int i23 = 0;
        for (int i24 = 0; i24 < size2; i24++) {
            q qVar4 = list2.get(i24);
            b bVar2 = this.f3954c.get(qVar4.c());
            if (bVar2 != null) {
                bVar2.c(qVar4.getIndex());
            }
            i23 += qVar4.j();
        }
        int size3 = i23 / list.size();
        this.f3960i.clear();
        int size4 = list.size();
        int i25 = 0;
        while (i25 < size4) {
            q qVar5 = list2.get(i25);
            this.f3960i.add(qVar5.c());
            b bVar3 = this.f3954c.get(qVar5.c());
            if (bVar3 != null) {
                q qVar6 = qVar5;
                i15 = i25;
                i14 = size4;
                if (qVar6.b()) {
                    long a11 = bVar3.a();
                    bVar3.d(m.a(l.j(a11) + l.j(h11), l.k(a11) + l.k(h11)));
                    g(qVar6, bVar3);
                } else {
                    this.f3954c.remove(qVar6.c());
                }
            } else if (qVar5.b()) {
                b bVar4 = new b(qVar5.getIndex());
                Integer num = this.f3955d.get(qVar5.c());
                long g11 = qVar5.g(i18);
                int d11 = qVar5.d(i18);
                if (num == null) {
                    i16 = d(g11);
                    j = g11;
                    bVar = bVar4;
                    qVar = qVar5;
                    i15 = i25;
                    i14 = size4;
                } else {
                    if (!z11) {
                        i17 = d(g11);
                    } else {
                        i17 = (d(g11) - qVar5.j()) + d11;
                    }
                    j = g11;
                    bVar = bVar4;
                    qVar = qVar5;
                    i15 = i25;
                    i14 = size4;
                    i16 = a(num.intValue(), qVar5.j(), size3, h11, z11, i21, i17, list) + (z11 ? qVar.i() - d11 : 0);
                }
                if (this.f3953b) {
                    j11 = l.g(j, 0, i16, 1, (Object) null);
                } else {
                    j11 = l.g(j, i16, 0, 2, (Object) null);
                }
                int h12 = qVar.h();
                for (int i26 = 0; i26 < h12; i26++) {
                    q qVar7 = qVar;
                    long g12 = qVar7.g(i26);
                    long a12 = m.a(l.j(g12) - l.j(j), l.k(g12) - l.k(j));
                    bVar.b().add(new d(m.a(l.j(j11) + l.j(a12), l.k(j11) + l.k(a12)), qVar7.d(i26), (i) null));
                    k kVar = k.f22762a;
                }
                q qVar8 = qVar;
                b bVar5 = bVar;
                this.f3954c.put(qVar8.c(), bVar5);
                g(qVar8, bVar5);
            } else {
                i15 = i25;
                i14 = size4;
            }
            i25 = i15 + 1;
            size4 = i14;
            i18 = 0;
        }
        if (!z11) {
            this.f3956e = qVar2.getIndex();
            this.f3957f = qVar2.f();
            this.f3958g = qVar3.getIndex();
            this.f3959h = (qVar3.f() + qVar3.j()) - i21;
        } else {
            this.f3956e = qVar3.getIndex();
            this.f3957f = (i21 - qVar3.f()) - qVar3.i();
            this.f3958g = qVar2.getIndex();
            this.f3959h = (-qVar2.f()) + (qVar2.j() - qVar2.i());
        }
        Iterator<Map.Entry<Object, b>> it2 = this.f3954c.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry next = it2.next();
            if (!this.f3960i.contains(next.getKey())) {
                b bVar6 = (b) next.getValue();
                long a13 = bVar6.a();
                bVar6.d(m.a(l.j(a13) + l.j(h11), l.k(a13) + l.k(h11)));
                Integer num2 = tVar.c().get(next.getKey());
                List<d> b11 = bVar6.b();
                int size5 = b11.size();
                int i27 = 0;
                while (true) {
                    if (i27 >= size5) {
                        z13 = false;
                        break;
                    }
                    d dVar = b11.get(i27);
                    long d12 = dVar.d();
                    long a14 = bVar6.a();
                    long a15 = m.a(l.j(d12) + l.j(a14), l.k(d12) + l.k(a14));
                    if (d(a15) + dVar.c() > 0 && d(a15) < i21) {
                        z13 = true;
                        break;
                    }
                    i27++;
                }
                List<d> b12 = bVar6.b();
                int size6 = b12.size();
                int i28 = 0;
                while (true) {
                    if (i28 >= size6) {
                        z14 = false;
                        break;
                    } else if (b12.get(i28).b()) {
                        z14 = true;
                        break;
                    } else {
                        i28++;
                    }
                }
                boolean z15 = !z14;
                if ((z13 || !z15) && num2 != null && !bVar6.b().isEmpty()) {
                    s a16 = tVar2.a(a.b(num2.intValue()));
                    s sVar = a16;
                    b bVar7 = bVar6;
                    int a17 = a(num2.intValue(), a16.e(), size3, h11, z11, i21, i21, list);
                    if (z11) {
                        a17 = (i21 - a17) - sVar.d();
                    }
                    q f11 = sVar.f(a17, i12, i13);
                    list2.add(f11);
                    g(f11, bVar7);
                } else {
                    int i29 = i12;
                    int i31 = i13;
                    it2.remove();
                }
            } else {
                int i32 = i12;
                int i33 = i13;
            }
        }
        this.f3955d = tVar.c();
    }

    public final void f() {
        this.f3954c.clear();
        this.f3955d = x.f();
        this.f3956e = -1;
        this.f3957f = 0;
        this.f3958g = -1;
        this.f3959h = 0;
    }
}
