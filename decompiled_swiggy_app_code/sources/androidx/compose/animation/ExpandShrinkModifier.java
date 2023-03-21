package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.unit.LayoutDirection;
import d2.l;
import d2.m;
import d2.p;
import d2.q;
import defpackage.v1;
import e0.d1;
import i1.e0;
import i1.r;
import i1.u;
import i1.v;
import i1.w;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import p.d;
import p.i;

/* compiled from: EnterExitTransition.kt */
final class ExpandShrinkModifier extends i {

    /* renamed from: a  reason: collision with root package name */
    private final Transition<EnterExitState>.defpackage.a<p, v1.l> f2563a;

    /* renamed from: b  reason: collision with root package name */
    private final Transition<EnterExitState>.defpackage.a<l, v1.l> f2564b;

    /* renamed from: c  reason: collision with root package name */
    private final d1<d> f2565c;

    /* renamed from: d  reason: collision with root package name */
    private final d1<d> f2566d;

    /* renamed from: e  reason: collision with root package name */
    private final d1<p0.a> f2567e;

    /* renamed from: f  reason: collision with root package name */
    private p0.a f2568f;

    /* renamed from: g  reason: collision with root package name */
    private final lp0.l<Transition.b<EnterExitState>, v1.a0<p>> f2569g = new ExpandShrinkModifier$sizeTransitionSpec$1(this);

    /* compiled from: EnterExitTransition.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2570a;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            iArr[EnterExitState.Visible.ordinal()] = 1;
            iArr[EnterExitState.PreEnter.ordinal()] = 2;
            iArr[EnterExitState.PostExit.ordinal()] = 3;
            f2570a = iArr;
        }
    }

    public ExpandShrinkModifier(Transition<EnterExitState>.defpackage.a<p, v1.l> aVar, Transition<EnterExitState>.defpackage.a<l, v1.l> aVar2, d1<d> d1Var, d1<d> d1Var2, d1<? extends p0.a> d1Var3) {
        kotlin.jvm.internal.p.j(aVar, "sizeAnimation");
        kotlin.jvm.internal.p.j(aVar2, "offsetAnimation");
        kotlin.jvm.internal.p.j(d1Var, "expand");
        kotlin.jvm.internal.p.j(d1Var2, "shrink");
        kotlin.jvm.internal.p.j(d1Var3, "alignment");
        this.f2563a = aVar;
        this.f2564b = aVar2;
        this.f2565c = d1Var;
        this.f2566d = d1Var2;
        this.f2567e = d1Var3;
    }

    public u K(w wVar, r rVar, long j) {
        l lVar;
        long j11;
        kotlin.jvm.internal.p.j(wVar, "$receiver");
        kotlin.jvm.internal.p.j(rVar, "measurable");
        e0 N = rVar.N(j);
        long a11 = q.a(N.A0(), N.e0());
        long j12 = this.f2563a.a(this.f2569g, new ExpandShrinkModifier$measure$currentSize$1(this, a11)).getValue().j();
        long n = this.f2564b.a(ExpandShrinkModifier$measure$offsetDelta$1.f2576a, new ExpandShrinkModifier$measure$offsetDelta$2(this, a11)).getValue().n();
        p0.a aVar = this.f2568f;
        if (aVar == null) {
            lVar = null;
        } else {
            lVar = l.b(aVar.a(a11, j12, LayoutDirection.Ltr));
        }
        if (lVar == null) {
            j11 = l.f14010b.a();
        } else {
            j11 = lVar.n();
        }
        return v.b(wVar, p.g(j12), p.f(j12), (Map) null, new ExpandShrinkModifier$measure$1(N, j11, n), 4, (Object) null);
    }

    public final d1<p0.a> a() {
        return this.f2567e;
    }

    public final p0.a c() {
        return this.f2568f;
    }

    public final d1<d> d() {
        return this.f2565c;
    }

    public final d1<d> e() {
        return this.f2566d;
    }

    public final void f(p0.a aVar) {
        this.f2568f = aVar;
    }

    public final long g(EnterExitState enterExitState, long j) {
        kotlin.jvm.internal.p.j(enterExitState, "targetState");
        d value = this.f2565c.getValue();
        long j11 = value == null ? j : value.d().invoke(p.b(j)).j();
        d value2 = this.f2566d.getValue();
        long j12 = value2 == null ? j : value2.d().invoke(p.b(j)).j();
        int i11 = a.f2570a[enterExitState.ordinal()];
        if (i11 == 1) {
            return j;
        }
        if (i11 == 2) {
            return j11;
        }
        if (i11 == 3) {
            return j12;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final long h(EnterExitState enterExitState, long j) {
        l lVar;
        kotlin.jvm.internal.p.j(enterExitState, "targetState");
        if (this.f2568f == null) {
            return l.f14010b.a();
        }
        if (this.f2567e.getValue() == null) {
            return l.f14010b.a();
        }
        if (kotlin.jvm.internal.p.e(this.f2568f, this.f2567e.getValue())) {
            return l.f14010b.a();
        }
        int i11 = a.f2570a[enterExitState.ordinal()];
        if (i11 == 1) {
            return l.f14010b.a();
        }
        if (i11 == 2) {
            return l.f14010b.a();
        }
        if (i11 == 3) {
            d value = this.f2566d.getValue();
            if (value == null) {
                lVar = null;
            } else {
                long j11 = value.d().invoke(p.b(j)).j();
                p0.a value2 = a().getValue();
                kotlin.jvm.internal.p.g(value2);
                long j12 = j;
                long j13 = j11;
                LayoutDirection layoutDirection = LayoutDirection.Ltr;
                long a11 = value2.a(j12, j13, layoutDirection);
                p0.a c11 = c();
                kotlin.jvm.internal.p.g(c11);
                long a12 = c11.a(j12, j13, layoutDirection);
                lVar = l.b(m.a(l.j(a11) - l.j(a12), l.k(a11) - l.k(a12)));
            }
            if (lVar == null) {
                return l.f14010b.a();
            }
            return lVar.n();
        }
        throw new NoWhenBranchMatchedException();
    }
}
