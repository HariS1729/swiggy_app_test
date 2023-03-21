package w;

import androidx.compose.foundation.lazy.LazyListItemPlacementAnimator;
import d2.l;
import d2.m;
import defpackage.v1;
import i1.e0;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: LazyMeasuredItem.kt */
public final class q implements i {

    /* renamed from: a  reason: collision with root package name */
    private final int f17388a;

    /* renamed from: b  reason: collision with root package name */
    private final int f17389b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f17390c;

    /* renamed from: d  reason: collision with root package name */
    private final int f17391d;

    /* renamed from: e  reason: collision with root package name */
    private final int f17392e;

    /* renamed from: f  reason: collision with root package name */
    private final int f17393f;

    /* renamed from: g  reason: collision with root package name */
    private final int f17394g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f17395h;

    /* renamed from: i  reason: collision with root package name */
    private final List<p> f17396i;
    private final LazyListItemPlacementAnimator j;
    private final long k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f17397l;

    private q(int i11, int i12, Object obj, int i13, int i14, int i15, int i16, boolean z11, List<p> list, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j11) {
        this.f17388a = i11;
        this.f17389b = i12;
        this.f17390c = obj;
        this.f17391d = i13;
        this.f17392e = i14;
        this.f17393f = i15;
        this.f17394g = i16;
        this.f17395h = z11;
        this.f17396i = list;
        this.j = lazyListItemPlacementAnimator;
        this.k = j11;
        int h11 = h();
        boolean z12 = false;
        int i17 = 0;
        while (true) {
            if (i17 >= h11) {
                break;
            } else if (a(i17) != null) {
                z12 = true;
                break;
            } else {
                i17++;
            }
        }
        this.f17397l = z12;
    }

    public /* synthetic */ q(int i11, int i12, Object obj, int i13, int i14, int i15, int i16, boolean z11, List list, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j11, i iVar) {
        this(i11, i12, obj, i13, i14, i15, i16, z11, list, lazyListItemPlacementAnimator, j11);
    }

    private final int e(e0 e0Var) {
        return this.f17395h ? e0Var.e0() : e0Var.A0();
    }

    public final v1.a0<l> a(int i11) {
        Object b11 = this.f17396i.get(i11).b();
        if (b11 instanceof v1.a0) {
            return (v1.a0) b11;
        }
        return null;
    }

    public final boolean b() {
        return this.f17397l;
    }

    public Object c() {
        return this.f17390c;
    }

    public final int d(int i11) {
        return e(this.f17396i.get(i11).c());
    }

    public int f() {
        return this.f17388a;
    }

    public final long g(int i11) {
        return this.f17396i.get(i11).a();
    }

    public int getIndex() {
        return this.f17389b;
    }

    public final int h() {
        return this.f17396i.size();
    }

    public int i() {
        return this.f17391d;
    }

    public final int j() {
        return this.f17392e;
    }

    public final void k(e0.a aVar) {
        long j11;
        p.j(aVar, "scope");
        int h11 = h();
        for (int i11 = 0; i11 < h11; i11++) {
            e0 c11 = this.f17396i.get(i11).c();
            int e11 = this.f17393f - e(c11);
            int i12 = this.f17394g;
            if (a(i11) != null) {
                j11 = this.j.b(c(), i11, e11, i12, g(i11));
            } else {
                j11 = g(i11);
            }
            if (this.f17395h) {
                long j12 = this.k;
                e0.a.x(aVar, c11, m.a(l.j(j11) + l.j(j12), l.k(j11) + l.k(j12)), 0.0f, (lp0.l) null, 6, (Object) null);
            } else {
                long j13 = this.k;
                e0.a.t(aVar, c11, m.a(l.j(j11) + l.j(j13), l.k(j11) + l.k(j13)), 0.0f, (lp0.l) null, 6, (Object) null);
            }
        }
    }
}
