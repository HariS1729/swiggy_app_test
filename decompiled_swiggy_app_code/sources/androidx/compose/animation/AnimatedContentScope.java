package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.unit.LayoutDirection;
import d2.e;
import d2.p;
import d2.q;
import defpackage.v1;
import e0.a1;
import e0.d1;
import e0.g;
import e0.h0;
import i1.d0;
import i1.e0;
import i1.r;
import i1.u;
import i1.v;
import i1.w;
import java.util.LinkedHashMap;
import java.util.Map;
import p.i;
import p.l;
import p0.d;

/* compiled from: AnimatedContent.kt */
public final class AnimatedContentScope<S> implements Transition.b<S> {

    /* renamed from: a  reason: collision with root package name */
    private final Transition<S> f2442a;

    /* renamed from: b  reason: collision with root package name */
    private p0.a f2443b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutDirection f2444c;

    /* renamed from: d  reason: collision with root package name */
    private final h0 f2445d = j.e(p.b(p.f14019b.a()), (a1) null, 2, (Object) null);

    /* renamed from: e  reason: collision with root package name */
    private final Map<S, d1<p>> f2446e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    private d1<p> f2447f;

    /* compiled from: AnimatedContent.kt */
    private final class SizeModifier extends i {

        /* renamed from: a  reason: collision with root package name */
        private final Transition<S>.defpackage.a<p, v1.l> f2448a;

        /* renamed from: b  reason: collision with root package name */
        private final d1<l> f2449b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AnimatedContentScope<S> f2450c;

        public SizeModifier(AnimatedContentScope animatedContentScope, Transition<S>.defpackage.a<p, v1.l> aVar, d1<? extends l> d1Var) {
            kotlin.jvm.internal.p.j(animatedContentScope, "this$0");
            kotlin.jvm.internal.p.j(aVar, "sizeAnimation");
            kotlin.jvm.internal.p.j(d1Var, "sizeTransform");
            this.f2450c = animatedContentScope;
            this.f2448a = aVar;
            this.f2449b = d1Var;
        }

        public u K(w wVar, r rVar, long j) {
            kotlin.jvm.internal.p.j(wVar, "$receiver");
            kotlin.jvm.internal.p.j(rVar, "measurable");
            e0 N = rVar.N(j);
            d1<p> a11 = this.f2448a.a(new AnimatedContentScope$SizeModifier$measure$size$1(this.f2450c, this), new AnimatedContentScope$SizeModifier$measure$size$2(this.f2450c));
            this.f2450c.i(a11);
            return v.b(wVar, p.g(a11.getValue().j()), p.f(a11.getValue().j()), (Map) null, new AnimatedContentScope$SizeModifier$measure$1(N, this.f2450c.g().a(q.a(N.A0(), N.e0()), a11.getValue().j(), LayoutDirection.Ltr)), 4, (Object) null);
        }

        public final d1<l> a() {
            return this.f2449b;
        }
    }

    /* compiled from: AnimatedContent.kt */
    public static final class a implements d0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f2456a;

        public a(boolean z11) {
            this.f2456a = z11;
        }

        public d N(d dVar) {
            return d0.a.d(this, dVar);
        }

        public Object U(e eVar, Object obj) {
            kotlin.jvm.internal.p.j(eVar, "<this>");
            return this;
        }

        public <R> R W(R r11, lp0.p<? super d.b, ? super R, ? extends R> pVar) {
            return d0.a.c(this, r11, pVar);
        }

        public final boolean a() {
            return this.f2456a;
        }

        public final void c(boolean z11) {
            this.f2456a = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f2456a == ((a) obj).f2456a;
        }

        public int hashCode() {
            boolean z11 = this.f2456a;
            if (z11) {
                return 1;
            }
            return z11 ? 1 : 0;
        }

        public <R> R s(R r11, lp0.p<? super R, ? super d.b, ? extends R> pVar) {
            return d0.a.b(this, r11, pVar);
        }

        public String toString() {
            return "ChildData(isTarget=" + this.f2456a + ')';
        }

        public boolean x(lp0.l<? super d.b, Boolean> lVar) {
            return d0.a.a(this, lVar);
        }
    }

    public AnimatedContentScope(Transition<S> transition, p0.a aVar, LayoutDirection layoutDirection) {
        kotlin.jvm.internal.p.j(transition, "transition");
        kotlin.jvm.internal.p.j(aVar, "contentAlignment");
        kotlin.jvm.internal.p.j(layoutDirection, "layoutDirection");
        this.f2442a = transition;
        this.f2443b = aVar;
        this.f2444c = layoutDirection;
    }

    private static final boolean e(h0<Boolean> h0Var) {
        return h0Var.getValue().booleanValue();
    }

    private static final void f(h0<Boolean> h0Var, boolean z11) {
        h0Var.setValue(Boolean.valueOf(z11));
    }

    public boolean a(S s11, S s12) {
        return Transition.b.a.a(this, s11, s12);
    }

    public S b() {
        return this.f2442a.k().b();
    }

    public S c() {
        return this.f2442a.k().c();
    }

    public final d d(p.e eVar, g gVar, int i11) {
        d dVar;
        kotlin.jvm.internal.p.j(eVar, "contentTransform");
        gVar.E(-237337061);
        gVar.E(-3686930);
        boolean k = gVar.k(this);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            F = j.e(Boolean.FALSE, (a1) null, 2, (Object) null);
            gVar.y(F);
        }
        gVar.P();
        h0 h0Var = (h0) F;
        boolean z11 = false;
        d1 m11 = androidx.compose.runtime.g.m(eVar.b(), gVar, 0);
        if (kotlin.jvm.internal.p.e(this.f2442a.g(), this.f2442a.m())) {
            f(h0Var, false);
        } else if (m11.getValue() != null) {
            f(h0Var, true);
        }
        if (e(h0Var)) {
            Transition.a<p, v1.l> b11 = TransitionKt.b(this.f2442a, VectorConvertersKt.e(p.f14019b), (String) null, gVar, 64, 2);
            gVar.E(-3686930);
            boolean k11 = gVar.k(b11);
            Object F2 = gVar.F();
            if (k11 || F2 == g.f14172a.a()) {
                l lVar = (l) m11.getValue();
                if (lVar != null && !lVar.a()) {
                    z11 = true;
                }
                d dVar2 = d.f16037h0;
                if (!z11) {
                    dVar2 = r0.d.b(dVar2);
                }
                F2 = dVar2.N(new SizeModifier(this, b11, m11));
                gVar.y(F2);
            }
            gVar.P();
            dVar = (d) F2;
        } else {
            this.f2447f = null;
            dVar = d.f16037h0;
        }
        gVar.P();
        return dVar;
    }

    public final p0.a g() {
        return this.f2443b;
    }

    public final Map<S, d1<p>> h() {
        return this.f2446e;
    }

    public final void i(d1<p> d1Var) {
        this.f2447f = d1Var;
    }

    public final void j(p0.a aVar) {
        kotlin.jvm.internal.p.j(aVar, "<set-?>");
        this.f2443b = aVar;
    }

    public final void k(LayoutDirection layoutDirection) {
        kotlin.jvm.internal.p.j(layoutDirection, "<set-?>");
        this.f2444c = layoutDirection;
    }

    public final void l(long j) {
        this.f2445d.setValue(p.b(j));
    }

    public final p.e m(p.e eVar, l lVar) {
        kotlin.jvm.internal.p.j(eVar, "<this>");
        eVar.e(lVar);
        return eVar;
    }
}
