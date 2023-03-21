package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import e0.d1;
import e0.g;
import e0.h0;
import kotlin.jvm.internal.Lambda;
import lp0.q;
import p0.d;

/* compiled from: EnterExitTransition.kt */
final class EnterExitTransitionKt$shrinkExpand$1 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Transition<EnterExitState> f2544a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d1<p.d> f2545b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d1<p.d> f2546c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f2547d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EnterExitTransitionKt$shrinkExpand$1(Transition<EnterExitState> transition, d1<p.d> d1Var, d1<p.d> d1Var2, String str) {
        super(3);
        this.f2544a = transition;
        this.f2545b = d1Var;
        this.f2546c = d1Var2;
        this.f2547d = str;
    }

    private static final boolean b(h0<Boolean> h0Var) {
        return h0Var.getValue().booleanValue();
    }

    private static final void c(h0<Boolean> h0Var, boolean z11) {
        h0Var.setValue(Boolean.valueOf(z11));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: androidx.compose.animation.ExpandShrinkModifier} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: androidx.compose.animation.ExpandShrinkModifier} */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x015c, code lost:
        if (r6 == r14.a()) goto L_0x015e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p0.d a(p0.d r21, e0.g r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r8 = r22
            java.lang.String r2 = "$this$composed"
            kotlin.jvm.internal.p.j(r1, r2)
            r2 = -1553215817(0xffffffffa36bceb7, float:-1.2783149E-17)
            r8.E(r2)
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.f2544a
            r9 = -3686930(0xffffffffffc7bdee, float:NaN)
            r8.E(r9)
            boolean r2 = r8.k(r2)
            java.lang.Object r3 = r22.F()
            r10 = 0
            if (r2 != 0) goto L_0x002c
            e0.g$a r2 = e0.g.f14172a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x0036
        L_0x002c:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r3 = 2
            e0.h0 r3 = androidx.compose.runtime.j.e(r2, r10, r3, r10)
            r8.y(r3)
        L_0x0036:
            r22.P()
            e0.h0 r3 = (e0.h0) r3
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.f2544a
            java.lang.Object r2 = r2.g()
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r4 = r0.f2544a
            java.lang.Object r4 = r4.m()
            r11 = 1
            r12 = 0
            if (r2 != r4) goto L_0x0057
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.f2544a
            boolean r2 = r2.q()
            if (r2 != 0) goto L_0x0057
            c(r3, r12)
            goto L_0x006a
        L_0x0057:
            e0.d1<p.d> r2 = r0.f2545b
            java.lang.Object r2 = r2.getValue()
            if (r2 != 0) goto L_0x0067
            e0.d1<p.d> r2 = r0.f2546c
            java.lang.Object r2 = r2.getValue()
            if (r2 == 0) goto L_0x006a
        L_0x0067:
            c(r3, r11)
        L_0x006a:
            boolean r2 = b(r3)
            if (r2 == 0) goto L_0x01da
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.f2544a
            androidx.compose.animation.core.Transition$b r2 = r2.k()
            androidx.compose.animation.EnterExitState r3 = androidx.compose.animation.EnterExitState.PreEnter
            androidx.compose.animation.EnterExitState r4 = androidx.compose.animation.EnterExitState.Visible
            boolean r2 = r2.a(r3, r4)
            e0.d1<p.d> r3 = r0.f2545b
            e0.d1<p.d> r4 = r0.f2546c
            if (r2 == 0) goto L_0x00a2
            java.lang.Object r2 = r3.getValue()
            p.d r2 = (p.d) r2
            if (r2 != 0) goto L_0x008e
            r2 = r10
            goto L_0x0092
        L_0x008e:
            p0.a r2 = r2.a()
        L_0x0092:
            if (r2 != 0) goto L_0x00c0
            java.lang.Object r2 = r4.getValue()
            p.d r2 = (p.d) r2
            if (r2 != 0) goto L_0x009d
            goto L_0x00ba
        L_0x009d:
            p0.a r2 = r2.a()
            goto L_0x00c0
        L_0x00a2:
            java.lang.Object r2 = r4.getValue()
            p.d r2 = (p.d) r2
            if (r2 != 0) goto L_0x00ac
            r2 = r10
            goto L_0x00b0
        L_0x00ac:
            p0.a r2 = r2.a()
        L_0x00b0:
            if (r2 != 0) goto L_0x00c0
            java.lang.Object r2 = r3.getValue()
            p.d r2 = (p.d) r2
            if (r2 != 0) goto L_0x00bc
        L_0x00ba:
            r2 = r10
            goto L_0x00c0
        L_0x00bc:
            p0.a r2 = r2.a()
        L_0x00c0:
            e0.d1 r19 = androidx.compose.runtime.g.m(r2, r8, r12)
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.f2544a
            d2.p$a r3 = d2.p.f14019b
            v1$q0 r3 = androidx.compose.animation.core.VectorConvertersKt.e(r3)
            java.lang.String r4 = r0.f2547d
            r13 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r8.E(r13)
            java.lang.Object r5 = r22.F()
            e0.g$a r14 = e0.g.f14172a
            java.lang.Object r6 = r14.a()
            if (r5 != r6) goto L_0x00e9
            java.lang.String r5 = " shrink/expand"
            java.lang.String r5 = kotlin.jvm.internal.p.s(r4, r5)
            r8.y(r5)
        L_0x00e9:
            r22.P()
            r4 = r5
            java.lang.String r4 = (java.lang.String) r4
            r6 = 448(0x1c0, float:6.28E-43)
            r7 = 0
            r5 = r22
            androidx.compose.animation.core.Transition$a r15 = androidx.compose.animation.core.TransitionKt.b(r2, r3, r4, r5, r6, r7)
            r2 = -1553214637(0xffffffffa36bd353, float:-1.2784125E-17)
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r3 = r0.f2544a
            java.lang.Object r3 = r3.g()
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r4 = r0.f2544a
            java.lang.Object r4 = r4.m()
            if (r3 != r4) goto L_0x010b
            r3 = 1
            goto L_0x010c
        L_0x010b:
            r3 = 0
        L_0x010c:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r8.I(r2, r3)
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.f2544a
            d2.l$a r3 = d2.l.f14010b
            v1$q0 r3 = androidx.compose.animation.core.VectorConvertersKt.d(r3)
            java.lang.String r4 = r0.f2547d
            r8.E(r13)
            java.lang.Object r5 = r22.F()
            java.lang.Object r6 = r14.a()
            if (r5 != r6) goto L_0x0133
            java.lang.String r5 = " InterruptionHandlingOffset"
            java.lang.String r5 = kotlin.jvm.internal.p.s(r4, r5)
            r8.y(r5)
        L_0x0133:
            r22.P()
            r4 = r5
            java.lang.String r4 = (java.lang.String) r4
            r6 = 448(0x1c0, float:6.28E-43)
            r7 = 0
            r5 = r22
            androidx.compose.animation.core.Transition$a r2 = androidx.compose.animation.core.TransitionKt.b(r2, r3, r4, r5, r6, r7)
            r22.O()
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r3 = r0.f2544a
            e0.d1<p.d> r4 = r0.f2545b
            e0.d1<p.d> r5 = r0.f2546c
            r8.E(r9)
            boolean r3 = r8.k(r3)
            java.lang.Object r6 = r22.F()
            if (r3 != 0) goto L_0x015e
            java.lang.Object r3 = r14.a()
            if (r6 != r3) goto L_0x016f
        L_0x015e:
            androidx.compose.animation.ExpandShrinkModifier r6 = new androidx.compose.animation.ExpandShrinkModifier
            r13 = r6
            r14 = r15
            r15 = r2
            r16 = r4
            r17 = r5
            r18 = r19
            r13.<init>(r14, r15, r16, r17, r18)
            r8.y(r6)
        L_0x016f:
            r22.P()
            androidx.compose.animation.ExpandShrinkModifier r6 = (androidx.compose.animation.ExpandShrinkModifier) r6
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.f2544a
            java.lang.Object r2 = r2.g()
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r3 = r0.f2544a
            java.lang.Object r3 = r3.m()
            if (r2 != r3) goto L_0x0186
            r6.f(r10)
            goto L_0x019d
        L_0x0186:
            p0.a r2 = r6.c()
            if (r2 != 0) goto L_0x019d
            java.lang.Object r2 = r19.getValue()
            p0.a r2 = (p0.a) r2
            if (r2 != 0) goto L_0x019a
            p0.a$a r2 = p0.a.f16019a
            p0.a r2 = r2.o()
        L_0x019a:
            r6.f(r2)
        L_0x019d:
            e0.d1<p.d> r2 = r0.f2545b
            java.lang.Object r2 = r2.getValue()
            p.d r2 = (p.d) r2
            if (r2 != 0) goto L_0x01a9
        L_0x01a7:
            r2 = 0
            goto L_0x01b0
        L_0x01a9:
            boolean r2 = r2.c()
            if (r2 != 0) goto L_0x01a7
            r2 = 1
        L_0x01b0:
            if (r2 != 0) goto L_0x01c9
            e0.d1<p.d> r2 = r0.f2546c
            java.lang.Object r2 = r2.getValue()
            p.d r2 = (p.d) r2
            if (r2 != 0) goto L_0x01be
        L_0x01bc:
            r2 = 0
            goto L_0x01c5
        L_0x01be:
            boolean r2 = r2.c()
            if (r2 != 0) goto L_0x01bc
            r2 = 1
        L_0x01c5:
            if (r2 == 0) goto L_0x01c8
            goto L_0x01c9
        L_0x01c8:
            r11 = 0
        L_0x01c9:
            p0.d$a r2 = p0.d.f16037h0
            if (r11 == 0) goto L_0x01ce
            goto L_0x01d2
        L_0x01ce:
            p0.d r2 = r0.d.b(r2)
        L_0x01d2:
            p0.d r1 = r1.N(r2)
            p0.d r1 = r1.N(r6)
        L_0x01da:
            r22.P()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt$shrinkExpand$1.a(p0.d, e0.g, int):p0.d");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
