package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import d2.l;
import d2.q;
import defpackage.v1;
import e0.d1;
import i1.e0;
import i1.r;
import i1.u;
import i1.v;
import i1.w;
import java.util.Map;
import kotlin.jvm.internal.p;
import p.i;
import p.m;

/* compiled from: EnterExitTransition.kt */
final class SlideModifier extends i {

    /* renamed from: a  reason: collision with root package name */
    private final Transition<EnterExitState>.defpackage.a<l, v1.l> f2591a;

    /* renamed from: b  reason: collision with root package name */
    private final d1<m> f2592b;

    /* renamed from: c  reason: collision with root package name */
    private final d1<m> f2593c;

    /* renamed from: d  reason: collision with root package name */
    private final lp0.l<Transition.b<EnterExitState>, v1.a0<l>> f2594d = new SlideModifier$transitionSpec$1(this);

    /* compiled from: EnterExitTransition.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2595a;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            iArr[EnterExitState.Visible.ordinal()] = 1;
            iArr[EnterExitState.PreEnter.ordinal()] = 2;
            iArr[EnterExitState.PostExit.ordinal()] = 3;
            f2595a = iArr;
        }
    }

    public SlideModifier(Transition<EnterExitState>.defpackage.a<l, v1.l> aVar, d1<m> d1Var, d1<m> d1Var2) {
        p.j(aVar, "lazyAnimation");
        p.j(d1Var, "slideIn");
        p.j(d1Var2, "slideOut");
        this.f2591a = aVar;
        this.f2592b = d1Var;
        this.f2593c = d1Var2;
    }

    public u K(w wVar, r rVar, long j) {
        p.j(wVar, "$receiver");
        p.j(rVar, "measurable");
        e0 N = rVar.N(j);
        return v.b(wVar, N.A0(), N.e0(), (Map) null, new SlideModifier$measure$1(this, N, q.a(N.A0(), N.e0())), 4, (Object) null);
    }

    public final Transition<EnterExitState>.defpackage.a<l, v1.l> a() {
        return this.f2591a;
    }

    public final d1<m> c() {
        return this.f2592b;
    }

    public final d1<m> d() {
        return this.f2593c;
    }

    public final lp0.l<Transition.b<EnterExitState>, v1.a0<l>> e() {
        return this.f2594d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        r0 = r0.b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long f(androidx.compose.animation.EnterExitState r5, long r6) {
        /*
            r4 = this;
            java.lang.String r0 = "targetState"
            kotlin.jvm.internal.p.j(r5, r0)
            e0.d1<p.m> r0 = r4.f2592b
            java.lang.Object r0 = r0.getValue()
            p.m r0 = (p.m) r0
            r1 = 0
            if (r0 != 0) goto L_0x0012
        L_0x0010:
            r0 = r1
            goto L_0x0023
        L_0x0012:
            lp0.l r0 = r0.b()
            if (r0 != 0) goto L_0x0019
            goto L_0x0010
        L_0x0019:
            d2.p r2 = d2.p.b(r6)
            java.lang.Object r0 = r0.invoke(r2)
            d2.l r0 = (d2.l) r0
        L_0x0023:
            if (r0 != 0) goto L_0x002c
            d2.l$a r0 = d2.l.f14010b
            long r2 = r0.a()
            goto L_0x0030
        L_0x002c:
            long r2 = r0.n()
        L_0x0030:
            e0.d1<p.m> r0 = r4.f2593c
            java.lang.Object r0 = r0.getValue()
            p.m r0 = (p.m) r0
            if (r0 != 0) goto L_0x003b
            goto L_0x004d
        L_0x003b:
            lp0.l r0 = r0.b()
            if (r0 != 0) goto L_0x0042
            goto L_0x004d
        L_0x0042:
            d2.p r6 = d2.p.b(r6)
            java.lang.Object r6 = r0.invoke(r6)
            r1 = r6
            d2.l r1 = (d2.l) r1
        L_0x004d:
            if (r1 != 0) goto L_0x0056
            d2.l$a r6 = d2.l.f14010b
            long r6 = r6.a()
            goto L_0x005a
        L_0x0056:
            long r6 = r1.n()
        L_0x005a:
            int[] r0 = androidx.compose.animation.SlideModifier.a.f2595a
            int r5 = r5.ordinal()
            r5 = r0[r5]
            r0 = 1
            if (r5 == r0) goto L_0x0073
            r0 = 2
            if (r5 == r0) goto L_0x0079
            r0 = 3
            if (r5 != r0) goto L_0x006d
            r2 = r6
            goto L_0x0079
        L_0x006d:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L_0x0073:
            d2.l$a r5 = d2.l.f14010b
            long r2 = r5.a()
        L_0x0079:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.SlideModifier.f(androidx.compose.animation.EnterExitState, long):long");
    }
}
