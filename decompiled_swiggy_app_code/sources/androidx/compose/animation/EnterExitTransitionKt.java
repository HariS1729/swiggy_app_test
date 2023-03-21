package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.ComposedModifierKt;
import d2.l;
import d2.p;
import defpackage.v1;
import e0.a1;
import e0.d1;
import e0.h0;
import kotlin.jvm.internal.i;
import p.f;
import p.j;
import p.m;
import p.q;
import p0.a;
import p0.d;
import u0.q1;

/* compiled from: EnterExitTransition.kt */
public final class EnterExitTransitionKt {

    /* renamed from: a  reason: collision with root package name */
    private static final v1.q0<q1, v1.l> f2522a = VectorConvertersKt.a(EnterExitTransitionKt$TransformOriginVectorConverter$1.f2528a, EnterExitTransitionKt$TransformOriginVectorConverter$2.f2529a);

    /* renamed from: b  reason: collision with root package name */
    private static final h0<Float> f2523b = j.e(Float.valueOf(1.0f), (a1) null, 2, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final v1.l0<Float> f2524c = v1.h.g(0.0f, 400.0f, (Object) null, 5, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final v1.l0<l> f2525d = v1.h.g(0.0f, 400.0f, l.b(v1.c1.c(l.f14010b)), 1, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final v1.l0<p> f2526e = v1.h.g(0.0f, 400.0f, p.b(v1.c1.d(p.f14019b)), 1, (Object) null);

    /* compiled from: EnterExitTransition.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2530a;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            iArr[EnterExitState.Visible.ordinal()] = 1;
            iArr[EnterExitState.PreEnter.ordinal()] = 2;
            iArr[EnterExitState.PostExit.ordinal()] = 3;
            f2530a = iArr;
        }
    }

    private static final d A(d dVar, Transition<EnterExitState> transition, d1<p.d> d1Var, d1<p.d> d1Var2, String str) {
        return ComposedModifierKt.d(dVar, (lp0.l) null, new EnterExitTransitionKt$shrinkExpand$1(transition, d1Var, d1Var2, str), 1, (Object) null);
    }

    public static final c B(v1.a0<p> a0Var, a.b bVar, boolean z11, lp0.l<? super Integer, Integer> lVar) {
        kotlin.jvm.internal.p.j(a0Var, "animationSpec");
        kotlin.jvm.internal.p.j(bVar, "shrinkTowards");
        kotlin.jvm.internal.p.j(lVar, "targetWidth");
        return D(a0Var, Q(bVar), z11, new EnterExitTransitionKt$shrinkHorizontally$2(lVar));
    }

    public static /* synthetic */ c C(v1.a0 a0Var, a.b bVar, boolean z11, lp0.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            a0Var = v1.h.g(0.0f, 400.0f, p.b(v1.c1.d(p.f14019b)), 1, (Object) null);
        }
        if ((i11 & 2) != 0) {
            bVar = p0.a.f16019a.j();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            lVar = EnterExitTransitionKt$shrinkHorizontally$1.f2548a;
        }
        return B(a0Var, bVar, z11, lVar);
    }

    public static final c D(v1.a0<p> a0Var, p0.a aVar, boolean z11, lp0.l<? super p, p> lVar) {
        kotlin.jvm.internal.p.j(a0Var, "animationSpec");
        kotlin.jvm.internal.p.j(aVar, "shrinkTowards");
        kotlin.jvm.internal.p.j(lVar, "targetSize");
        return new d(new q((f) null, (m) null, new p.d(aVar, lVar, a0Var, z11), (j) null, 11, (i) null));
    }

    public static /* synthetic */ c E(v1.a0 a0Var, p0.a aVar, boolean z11, lp0.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            a0Var = v1.h.g(0.0f, 400.0f, p.b(v1.c1.d(p.f14019b)), 1, (Object) null);
        }
        if ((i11 & 2) != 0) {
            aVar = p0.a.f16019a.c();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            lVar = EnterExitTransitionKt$shrinkOut$1.f2550a;
        }
        return D(a0Var, aVar, z11, lVar);
    }

    public static final c F(v1.a0<p> a0Var, a.c cVar, boolean z11, lp0.l<? super Integer, Integer> lVar) {
        kotlin.jvm.internal.p.j(a0Var, "animationSpec");
        kotlin.jvm.internal.p.j(cVar, "shrinkTowards");
        kotlin.jvm.internal.p.j(lVar, "targetHeight");
        return D(a0Var, R(cVar), z11, new EnterExitTransitionKt$shrinkVertically$2(lVar));
    }

    public static /* synthetic */ c G(v1.a0 a0Var, a.c cVar, boolean z11, lp0.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            a0Var = v1.h.g(0.0f, 400.0f, p.b(v1.c1.d(p.f14019b)), 1, (Object) null);
        }
        if ((i11 & 2) != 0) {
            cVar = p0.a.f16019a.a();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            lVar = EnterExitTransitionKt$shrinkVertically$1.f2551a;
        }
        return F(a0Var, cVar, z11, lVar);
    }

    public static final a H(v1.a0<l> a0Var, lp0.l<? super p, l> lVar) {
        kotlin.jvm.internal.p.j(a0Var, "animationSpec");
        kotlin.jvm.internal.p.j(lVar, "initialOffset");
        return new b(new q((f) null, new m(lVar, a0Var), (p.d) null, (j) null, 13, (i) null));
    }

    public static final a I(v1.a0<l> a0Var, lp0.l<? super Integer, Integer> lVar) {
        kotlin.jvm.internal.p.j(a0Var, "animationSpec");
        kotlin.jvm.internal.p.j(lVar, "initialOffsetX");
        return H(a0Var, new EnterExitTransitionKt$slideInHorizontally$2(lVar));
    }

    private static final d J(d dVar, Transition<EnterExitState> transition, d1<m> d1Var, d1<m> d1Var2, String str) {
        return ComposedModifierKt.d(dVar, (lp0.l) null, new EnterExitTransitionKt$slideInOut$1(transition, d1Var, d1Var2, str), 1, (Object) null);
    }

    public static final a K(v1.a0<l> a0Var, lp0.l<? super Integer, Integer> lVar) {
        kotlin.jvm.internal.p.j(a0Var, "animationSpec");
        kotlin.jvm.internal.p.j(lVar, "initialOffsetY");
        return H(a0Var, new EnterExitTransitionKt$slideInVertically$2(lVar));
    }

    public static /* synthetic */ a L(v1.a0 a0Var, lp0.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            a0Var = v1.h.g(0.0f, 400.0f, l.b(v1.c1.c(l.f14010b)), 1, (Object) null);
        }
        if ((i11 & 2) != 0) {
            lVar = EnterExitTransitionKt$slideInVertically$1.f2558a;
        }
        return K(a0Var, lVar);
    }

    public static final c M(v1.a0<l> a0Var, lp0.l<? super p, l> lVar) {
        kotlin.jvm.internal.p.j(a0Var, "animationSpec");
        kotlin.jvm.internal.p.j(lVar, "targetOffset");
        return new d(new q((f) null, new m(lVar, a0Var), (p.d) null, (j) null, 13, (i) null));
    }

    public static final c N(v1.a0<l> a0Var, lp0.l<? super Integer, Integer> lVar) {
        kotlin.jvm.internal.p.j(a0Var, "animationSpec");
        kotlin.jvm.internal.p.j(lVar, "targetOffsetX");
        return M(a0Var, new EnterExitTransitionKt$slideOutHorizontally$2(lVar));
    }

    public static final c O(v1.a0<l> a0Var, lp0.l<? super Integer, Integer> lVar) {
        kotlin.jvm.internal.p.j(a0Var, "animationSpec");
        kotlin.jvm.internal.p.j(lVar, "targetOffsetY");
        return M(a0Var, new EnterExitTransitionKt$slideOutVertically$2(lVar));
    }

    public static /* synthetic */ c P(v1.a0 a0Var, lp0.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            a0Var = v1.h.g(0.0f, 400.0f, l.b(v1.c1.c(l.f14010b)), 1, (Object) null);
        }
        if ((i11 & 2) != 0) {
            lVar = EnterExitTransitionKt$slideOutVertically$1.f2561a;
        }
        return O(a0Var, lVar);
    }

    private static final p0.a Q(a.b bVar) {
        a.C0160a aVar = p0.a.f16019a;
        if (kotlin.jvm.internal.p.e(bVar, aVar.k())) {
            return aVar.h();
        }
        if (kotlin.jvm.internal.p.e(bVar, aVar.j())) {
            return aVar.f();
        }
        return aVar.e();
    }

    private static final p0.a R(a.c cVar) {
        a.C0160a aVar = p0.a.f16019a;
        if (kotlin.jvm.internal.p.e(cVar, aVar.l())) {
            return aVar.m();
        }
        if (kotlin.jvm.internal.p.e(cVar, aVar.a())) {
            return aVar.b();
        }
        return aVar.e();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: e0.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: e0.h0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x04a6  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0342  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p0.d g(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r24, androidx.compose.animation.a r25, androidx.compose.animation.c r26, java.lang.String r27, e0.g r28, int r29) {
        /*
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.p.j(r8, r0)
            java.lang.String r0 = "enter"
            kotlin.jvm.internal.p.j(r9, r0)
            java.lang.String r0 = "exit"
            kotlin.jvm.internal.p.j(r10, r0)
            java.lang.String r0 = "label"
            kotlin.jvm.internal.p.j(r11, r0)
            r0 = 1657239113(0x62c77649, float:1.8397127E21)
            r12.E(r0)
            p0.d$a r0 = p0.d.f16037h0
            p.q r1 = r25.a()
            p.m r1 = r1.d()
            r2 = 0
            e0.d1 r1 = androidx.compose.runtime.g.m(r1, r12, r2)
            p.q r3 = r26.a()
            p.m r3 = r3.d()
            e0.d1 r3 = androidx.compose.runtime.g.m(r3, r12, r2)
            p0.d r0 = J(r0, r8, r1, r3, r11)
            p.q r1 = r25.a()
            p.d r1 = r1.a()
            e0.d1 r1 = androidx.compose.runtime.g.m(r1, r12, r2)
            p.q r3 = r26.a()
            p.d r3 = r3.a()
            e0.d1 r3 = androidx.compose.runtime.g.m(r3, r12, r2)
            p0.d r13 = A(r0, r8, r1, r3, r11)
            r14 = r29 & 14
            r0 = -3686930(0xffffffffffc7bdee, float:NaN)
            r12.E(r0)
            boolean r1 = r12.k(r8)
            java.lang.Object r3 = r28.F()
            r15 = 2
            r7 = 0
            if (r1 != 0) goto L_0x007b
            e0.g$a r1 = e0.g.f14172a
            java.lang.Object r1 = r1.a()
            if (r3 != r1) goto L_0x0084
        L_0x007b:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            e0.h0 r3 = androidx.compose.runtime.j.e(r1, r7, r15, r7)
            r12.y(r3)
        L_0x0084:
            r28.P()
            r6 = r3
            e0.h0 r6 = (e0.h0) r6
            r12.E(r0)
            boolean r0 = r12.k(r8)
            java.lang.Object r1 = r28.F()
            if (r0 != 0) goto L_0x009f
            e0.g$a r0 = e0.g.f14172a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x00a8
        L_0x009f:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            e0.h0 r1 = androidx.compose.runtime.j.e(r0, r7, r15, r7)
            r12.y(r1)
        L_0x00a8:
            r28.P()
            r5 = r1
            e0.h0 r5 = (e0.h0) r5
            java.lang.Object r0 = r24.g()
            java.lang.Object r1 = r24.m()
            r4 = 1
            if (r0 != r1) goto L_0x00c6
            boolean r0 = r24.q()
            if (r0 != 0) goto L_0x00c6
            k(r6, r2)
            m(r5, r2)
            goto L_0x00f4
        L_0x00c6:
            p.q r0 = r25.a()
            p.f r0 = r0.b()
            if (r0 != 0) goto L_0x00da
            p.q r0 = r26.a()
            p.f r0 = r0.b()
            if (r0 == 0) goto L_0x00dd
        L_0x00da:
            k(r6, r4)
        L_0x00dd:
            p.q r0 = r25.a()
            p.j r0 = r0.c()
            if (r0 != 0) goto L_0x00f1
            p.q r0 = r26.a()
            p.j r0 = r0.c()
            if (r0 == 0) goto L_0x00f4
        L_0x00f1:
            m(r5, r4)
        L_0x00f4:
            r0 = 1657240548(0x62c77be4, float:1.8399147E21)
            r12.E(r0)
            boolean r0 = h(r6)
            r3 = 1399891485(0x5370a61d, float:1.03357907E12)
            r2 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r16 = 458752(0x70000, float:6.42848E-40)
            r1 = 1847725064(0x6e220c08, float:1.2537779E28)
            r17 = 57344(0xe000, float:8.0356E-41)
            r15 = 3
            r18 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0221
            androidx.compose.animation.EnterExitTransitionKt$createModifier$alpha$2 r0 = new androidx.compose.animation.EnterExitTransitionKt$createModifier$alpha$2
            r0.<init>(r9, r10)
            r12.E(r2)
            java.lang.Object r2 = r28.F()
            e0.g$a r20 = e0.g.f14172a
            java.lang.Object r7 = r20.a()
            if (r2 != r7) goto L_0x012e
            java.lang.String r2 = " alpha"
            java.lang.String r2 = kotlin.jvm.internal.p.s(r11, r2)
            r12.y(r2)
        L_0x012e:
            r28.P()
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            r2 = r14 | 384(0x180, float:5.38E-43)
            r12.E(r3)
            kotlin.jvm.internal.k r20 = kotlin.jvm.internal.k.f25688a
            v1$q0 r20 = androidx.compose.animation.core.VectorConvertersKt.f(r20)
            r22 = r2 & 14
            int r2 = r2 << r15
            r3 = r2 & 896(0x380, float:1.256E-42)
            r3 = r22 | r3
            r15 = r2 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r15
            r2 = r2 & r17
            r2 = r2 | r3
            r12.E(r1)
            java.lang.Object r3 = r24.g()
            androidx.compose.animation.EnterExitState r3 = (androidx.compose.animation.EnterExitState) r3
            r15 = -9519786(0xffffffffff6ebd56, float:-3.1733935E38)
            r12.E(r15)
            int[] r23 = androidx.compose.animation.EnterExitTransitionKt.a.f2530a
            int r3 = r3.ordinal()
            r3 = r23[r3]
            if (r3 == r4) goto L_0x0191
            r1 = 2
            if (r3 == r1) goto L_0x0181
            r1 = 3
            if (r3 != r1) goto L_0x017b
            p.q r1 = r26.a()
            p.f r1 = r1.b()
            if (r1 != 0) goto L_0x0176
            goto L_0x0191
        L_0x0176:
            float r1 = r1.a()
            goto L_0x0193
        L_0x017b:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0181:
            p.q r1 = r25.a()
            p.f r1 = r1.b()
            if (r1 != 0) goto L_0x018c
            goto L_0x0191
        L_0x018c:
            float r1 = r1.a()
            goto L_0x0193
        L_0x0191:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0193:
            r28.P()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Object r3 = r24.m()
            androidx.compose.animation.EnterExitState r3 = (androidx.compose.animation.EnterExitState) r3
            r12.E(r15)
            int r3 = r3.ordinal()
            r3 = r23[r3]
            if (r3 == r4) goto L_0x01d7
            r15 = 2
            if (r3 == r15) goto L_0x01c7
            r15 = 3
            if (r3 != r15) goto L_0x01c1
            p.q r3 = r26.a()
            p.f r3 = r3.b()
            if (r3 != 0) goto L_0x01bc
            goto L_0x01d7
        L_0x01bc:
            float r3 = r3.a()
            goto L_0x01d9
        L_0x01c1:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01c7:
            p.q r3 = r25.a()
            p.f r3 = r3.b()
            if (r3 != 0) goto L_0x01d2
            goto L_0x01d7
        L_0x01d2:
            float r3 = r3.a()
            goto L_0x01d9
        L_0x01d7:
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x01d9:
            r28.P()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            androidx.compose.animation.core.Transition$b r15 = r24.k()
            int r23 = r2 >> 3
            r23 = r23 & 112(0x70, float:1.57E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r23)
            java.lang.Object r0 = r0.invoke(r15, r12, r4)
            r4 = r0
            v1$a0 r4 = (defpackage.v1.a0) r4
            r0 = r2 & 14
            int r15 = r2 << 9
            r15 = r15 & r17
            r0 = r0 | r15
            int r2 = r2 << 6
            r2 = r2 & r16
            r15 = r0 | r2
            r0 = r24
            r2 = 1847725064(0x6e220c08, float:1.2537779E28)
            r8 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r2 = r3
            r3 = r4
            r4 = r20
            r19 = r5
            r5 = r7
            r20 = r6
            r6 = r28
            r21 = 0
            r7 = r15
            e0.d1 r0 = androidx.compose.animation.core.TransitionKt.c(r0, r1, r2, r3, r4, r5, r6, r7)
            r28.P()
            r28.P()
            goto L_0x022c
        L_0x0221:
            r19 = r5
            r20 = r6
            r21 = r7
            r8 = -3687241(0xffffffffffc7bcb7, float:NaN)
            e0.h0<java.lang.Float> r0 = f2523b
        L_0x022c:
            r15 = r0
            r28.P()
            boolean r0 = l(r19)
            if (r0 == 0) goto L_0x04f5
            androidx.compose.animation.EnterExitTransitionKt$createModifier$scale$2 r0 = new androidx.compose.animation.EnterExitTransitionKt$createModifier$scale$2
            r0.<init>(r9, r10)
            r12.E(r8)
            java.lang.Object r1 = r28.F()
            e0.g$a r2 = e0.g.f14172a
            java.lang.Object r2 = r2.a()
            if (r1 != r2) goto L_0x0253
            java.lang.String r1 = " scale"
            java.lang.String r1 = kotlin.jvm.internal.p.s(r11, r1)
            r12.y(r1)
        L_0x0253:
            r28.P()
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            r1 = r14 | 384(0x180, float:5.38E-43)
            r2 = 1399891485(0x5370a61d, float:1.03357907E12)
            r12.E(r2)
            kotlin.jvm.internal.k r2 = kotlin.jvm.internal.k.f25688a
            v1$q0 r4 = androidx.compose.animation.core.VectorConvertersKt.f(r2)
            r2 = r1 & 14
            r3 = 3
            int r1 = r1 << r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r1 = r1 & r17
            r1 = r1 | r2
            r8 = 1847725064(0x6e220c08, float:1.2537779E28)
            r12.E(r8)
            java.lang.Object r2 = r24.g()
            androidx.compose.animation.EnterExitState r2 = (androidx.compose.animation.EnterExitState) r2
            r3 = -9518895(0xffffffffff6ec0d1, float:-3.1735742E38)
            r12.E(r3)
            int[] r11 = androidx.compose.animation.EnterExitTransitionKt.a.f2530a
            int r2 = r2.ordinal()
            r2 = r11[r2]
            r7 = 1
            if (r2 == r7) goto L_0x02bd
            r6 = 2
            if (r2 == r6) goto L_0x02ad
            r6 = 3
            if (r2 != r6) goto L_0x02a7
            p.q r2 = r26.a()
            p.j r2 = r2.c()
            if (r2 != 0) goto L_0x02a2
            goto L_0x02bd
        L_0x02a2:
            float r2 = r2.b()
            goto L_0x02bf
        L_0x02a7:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02ad:
            p.q r2 = r25.a()
            p.j r2 = r2.c()
            if (r2 != 0) goto L_0x02b8
            goto L_0x02bd
        L_0x02b8:
            float r2 = r2.b()
            goto L_0x02bf
        L_0x02bd:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x02bf:
            r28.P()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r6 = r24.m()
            androidx.compose.animation.EnterExitState r6 = (androidx.compose.animation.EnterExitState) r6
            r12.E(r3)
            int r3 = r6.ordinal()
            r3 = r11[r3]
            if (r3 == r7) goto L_0x0302
            r6 = 2
            if (r3 == r6) goto L_0x02f3
            r6 = 3
            if (r3 != r6) goto L_0x02ed
            p.q r3 = r26.a()
            p.j r3 = r3.c()
            if (r3 != 0) goto L_0x02e8
            goto L_0x0302
        L_0x02e8:
            float r18 = r3.b()
            goto L_0x0302
        L_0x02ed:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02f3:
            p.q r3 = r25.a()
            p.j r3 = r3.c()
            if (r3 != 0) goto L_0x02fe
            goto L_0x0302
        L_0x02fe:
            float r18 = r3.b()
        L_0x0302:
            r28.P()
            java.lang.Float r3 = java.lang.Float.valueOf(r18)
            androidx.compose.animation.core.Transition$b r6 = r24.k()
            int r18 = r1 >> 3
            r18 = r18 & 112(0x70, float:1.57E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r18)
            java.lang.Object r0 = r0.invoke(r6, r12, r7)
            r6 = r0
            v1$a0 r6 = (defpackage.v1.a0) r6
            r0 = r1 & 14
            int r7 = r1 << 9
            r7 = r7 & r17
            r0 = r0 | r7
            int r1 = r1 << 6
            r1 = r1 & r16
            r7 = r0 | r1
            r0 = r24
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r28
            e0.d1 r7 = androidx.compose.animation.core.TransitionKt.c(r0, r1, r2, r3, r4, r5, r6, r7)
            r28.P()
            r28.P()
            java.lang.Object r0 = r24.g()
            androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.PreEnter
            if (r0 != r1) goto L_0x036d
            p.q r0 = r25.a()
            p.j r0 = r0.c()
            if (r0 != 0) goto L_0x034f
            r0 = r21
            goto L_0x0357
        L_0x034f:
            long r0 = r0.c()
            u0.q1 r0 = u0.q1.b(r0)
        L_0x0357:
            if (r0 != 0) goto L_0x0399
            p.q r0 = r26.a()
            p.j r0 = r0.c()
            if (r0 != 0) goto L_0x0364
            goto L_0x038e
        L_0x0364:
            long r0 = r0.c()
            u0.q1 r0 = u0.q1.b(r0)
            goto L_0x0399
        L_0x036d:
            p.q r0 = r26.a()
            p.j r0 = r0.c()
            if (r0 != 0) goto L_0x037a
            r0 = r21
            goto L_0x0382
        L_0x037a:
            long r0 = r0.c()
            u0.q1 r0 = u0.q1.b(r0)
        L_0x0382:
            if (r0 != 0) goto L_0x0399
            p.q r0 = r25.a()
            p.j r0 = r0.c()
            if (r0 != 0) goto L_0x0391
        L_0x038e:
            r0 = r21
            goto L_0x0399
        L_0x0391:
            long r0 = r0.c()
            u0.q1 r0 = u0.q1.b(r0)
        L_0x0399:
            v1$q0<u0.q1, v1$l> r4 = f2522a
            r1 = r14 | 3136(0xc40, float:4.394E-42)
            r12.E(r8)
            androidx.compose.animation.EnterExitTransitionKt$createModifier$$inlined$animateValue$1 r2 = androidx.compose.animation.EnterExitTransitionKt$createModifier$$inlined$animateValue$1.f2527a
            java.lang.Object r3 = r24.g()
            androidx.compose.animation.EnterExitState r3 = (androidx.compose.animation.EnterExitState) r3
            r5 = -9518037(0xffffffffff6ec42b, float:-3.1737483E38)
            r12.E(r5)
            int r3 = r3.ordinal()
            r3 = r11[r3]
            r6 = 1
            if (r3 == r6) goto L_0x041b
            r8 = 2
            if (r3 == r8) goto L_0x03ee
            r8 = 3
            if (r3 != r8) goto L_0x03e8
            p.q r3 = r26.a()
            p.j r3 = r3.c()
            if (r3 != 0) goto L_0x03ca
            r3 = r21
            goto L_0x03d2
        L_0x03ca:
            long r18 = r3.c()
            u0.q1 r3 = u0.q1.b(r18)
        L_0x03d2:
            if (r3 != 0) goto L_0x041c
            p.q r3 = r25.a()
            p.j r3 = r3.c()
            if (r3 != 0) goto L_0x03df
            goto L_0x040f
        L_0x03df:
            long r18 = r3.c()
            u0.q1 r3 = u0.q1.b(r18)
            goto L_0x041c
        L_0x03e8:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x03ee:
            p.q r3 = r25.a()
            p.j r3 = r3.c()
            if (r3 != 0) goto L_0x03fb
            r3 = r21
            goto L_0x0403
        L_0x03fb:
            long r18 = r3.c()
            u0.q1 r3 = u0.q1.b(r18)
        L_0x0403:
            if (r3 != 0) goto L_0x041c
            p.q r3 = r26.a()
            p.j r3 = r3.c()
            if (r3 != 0) goto L_0x0412
        L_0x040f:
            r3 = r21
            goto L_0x041c
        L_0x0412:
            long r18 = r3.c()
            u0.q1 r3 = u0.q1.b(r18)
            goto L_0x041c
        L_0x041b:
            r3 = r0
        L_0x041c:
            if (r3 != 0) goto L_0x0425
            u0.q1$a r3 = u0.q1.f16858b
            long r18 = r3.a()
            goto L_0x0429
        L_0x0425:
            long r18 = r3.j()
        L_0x0429:
            r28.P()
            u0.q1 r3 = u0.q1.b(r18)
            java.lang.Object r8 = r24.m()
            androidx.compose.animation.EnterExitState r8 = (androidx.compose.animation.EnterExitState) r8
            r12.E(r5)
            int r5 = r8.ordinal()
            r5 = r11[r5]
            if (r5 == r6) goto L_0x04a4
            r6 = 2
            if (r5 == r6) goto L_0x0478
            r0 = 3
            if (r5 != r0) goto L_0x0472
            p.q r0 = r26.a()
            p.j r0 = r0.c()
            if (r0 != 0) goto L_0x0454
            r0 = r21
            goto L_0x045c
        L_0x0454:
            long r5 = r0.c()
            u0.q1 r0 = u0.q1.b(r5)
        L_0x045c:
            if (r0 != 0) goto L_0x04a4
            p.q r0 = r25.a()
            p.j r0 = r0.c()
            if (r0 != 0) goto L_0x0469
            goto L_0x0499
        L_0x0469:
            long r5 = r0.c()
            u0.q1 r0 = u0.q1.b(r5)
            goto L_0x04a4
        L_0x0472:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0478:
            p.q r0 = r25.a()
            p.j r0 = r0.c()
            if (r0 != 0) goto L_0x0485
            r0 = r21
            goto L_0x048d
        L_0x0485:
            long r5 = r0.c()
            u0.q1 r0 = u0.q1.b(r5)
        L_0x048d:
            if (r0 != 0) goto L_0x04a4
            p.q r0 = r26.a()
            p.j r0 = r0.c()
            if (r0 != 0) goto L_0x049c
        L_0x0499:
            r0 = r21
            goto L_0x04a4
        L_0x049c:
            long r5 = r0.c()
            u0.q1 r0 = u0.q1.b(r5)
        L_0x04a4:
            if (r0 != 0) goto L_0x04ad
            u0.q1$a r0 = u0.q1.f16858b
            long r5 = r0.a()
            goto L_0x04b1
        L_0x04ad:
            long r5 = r0.j()
        L_0x04b1:
            r28.P()
            u0.q1 r5 = u0.q1.b(r5)
            androidx.compose.animation.core.Transition$b r0 = r24.k()
            int r6 = r1 >> 3
            r6 = r6 & 112(0x70, float:1.57E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r2.invoke(r0, r12, r6)
            r6 = r0
            v1$a0 r6 = (defpackage.v1.a0) r6
            r0 = r1 & 14
            int r2 = r1 << 9
            r2 = r2 & r17
            r0 = r0 | r2
            int r1 = r1 << 6
            r1 = r1 & r16
            r8 = r0 | r1
            java.lang.String r9 = "TransformOriginInterruptionHandling"
            r0 = r24
            r1 = r3
            r2 = r5
            r3 = r6
            r5 = r9
            r6 = r28
            r9 = r7
            r7 = r8
            e0.d1 r0 = androidx.compose.animation.core.TransitionKt.c(r0, r1, r2, r3, r4, r5, r6, r7)
            r28.P()
            androidx.compose.animation.EnterExitTransitionKt$createModifier$1 r1 = new androidx.compose.animation.EnterExitTransitionKt$createModifier$1
            r1.<init>(r15, r9, r0)
            p0.d r13 = androidx.compose.ui.graphics.GraphicsLayerModifierKt.a(r13, r1)
            goto L_0x0504
        L_0x04f5:
            boolean r0 = h(r20)
            if (r0 == 0) goto L_0x0504
            androidx.compose.animation.EnterExitTransitionKt$createModifier$2 r0 = new androidx.compose.animation.EnterExitTransitionKt$createModifier$2
            r0.<init>(r15)
            p0.d r13 = androidx.compose.ui.graphics.GraphicsLayerModifierKt.a(r13, r0)
        L_0x0504:
            r28.P()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt.g(androidx.compose.animation.core.Transition, androidx.compose.animation.a, androidx.compose.animation.c, java.lang.String, e0.g, int):p0.d");
    }

    private static final boolean h(h0<Boolean> h0Var) {
        return h0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final float i(d1<Float> d1Var) {
        return d1Var.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final long j(d1<q1> d1Var) {
        return d1Var.getValue().j();
    }

    private static final void k(h0<Boolean> h0Var, boolean z11) {
        h0Var.setValue(Boolean.valueOf(z11));
    }

    private static final boolean l(h0<Boolean> h0Var) {
        return h0Var.getValue().booleanValue();
    }

    private static final void m(h0<Boolean> h0Var, boolean z11) {
        h0Var.setValue(Boolean.valueOf(z11));
    }

    /* access modifiers changed from: private */
    public static final float n(d1<Float> d1Var) {
        return d1Var.getValue().floatValue();
    }

    public static final a o(v1.a0<p> a0Var, a.b bVar, boolean z11, lp0.l<? super Integer, Integer> lVar) {
        kotlin.jvm.internal.p.j(a0Var, "animationSpec");
        kotlin.jvm.internal.p.j(bVar, "expandFrom");
        kotlin.jvm.internal.p.j(lVar, "initialWidth");
        return q(a0Var, Q(bVar), z11, new EnterExitTransitionKt$expandHorizontally$2(lVar));
    }

    public static /* synthetic */ a p(v1.a0 a0Var, a.b bVar, boolean z11, lp0.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            a0Var = v1.h.g(0.0f, 400.0f, p.b(v1.c1.d(p.f14019b)), 1, (Object) null);
        }
        if ((i11 & 2) != 0) {
            bVar = p0.a.f16019a.j();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            lVar = EnterExitTransitionKt$expandHorizontally$1.f2539a;
        }
        return o(a0Var, bVar, z11, lVar);
    }

    public static final a q(v1.a0<p> a0Var, p0.a aVar, boolean z11, lp0.l<? super p, p> lVar) {
        kotlin.jvm.internal.p.j(a0Var, "animationSpec");
        kotlin.jvm.internal.p.j(aVar, "expandFrom");
        kotlin.jvm.internal.p.j(lVar, "initialSize");
        return new b(new q((f) null, (m) null, new p.d(aVar, lVar, a0Var, z11), (j) null, 11, (i) null));
    }

    public static /* synthetic */ a r(v1.a0 a0Var, p0.a aVar, boolean z11, lp0.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            a0Var = v1.h.g(0.0f, 400.0f, p.b(v1.c1.d(p.f14019b)), 1, (Object) null);
        }
        if ((i11 & 2) != 0) {
            aVar = p0.a.f16019a.c();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            lVar = EnterExitTransitionKt$expandIn$1.f2541a;
        }
        return q(a0Var, aVar, z11, lVar);
    }

    public static final a s(v1.a0<p> a0Var, a.c cVar, boolean z11, lp0.l<? super Integer, Integer> lVar) {
        kotlin.jvm.internal.p.j(a0Var, "animationSpec");
        kotlin.jvm.internal.p.j(cVar, "expandFrom");
        kotlin.jvm.internal.p.j(lVar, "initialHeight");
        return q(a0Var, R(cVar), z11, new EnterExitTransitionKt$expandVertically$2(lVar));
    }

    public static /* synthetic */ a t(v1.a0 a0Var, a.c cVar, boolean z11, lp0.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            a0Var = v1.h.g(0.0f, 400.0f, p.b(v1.c1.d(p.f14019b)), 1, (Object) null);
        }
        if ((i11 & 2) != 0) {
            cVar = p0.a.f16019a.a();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            lVar = EnterExitTransitionKt$expandVertically$1.f2542a;
        }
        return s(a0Var, cVar, z11, lVar);
    }

    public static final a u(v1.a0<Float> a0Var, float f11) {
        kotlin.jvm.internal.p.j(a0Var, "animationSpec");
        return new b(new q(new f(f11, a0Var), (m) null, (p.d) null, (j) null, 14, (i) null));
    }

    public static /* synthetic */ a v(v1.a0 a0Var, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            a0Var = v1.h.g(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        return u(a0Var, f11);
    }

    public static final c w(v1.a0<Float> a0Var, float f11) {
        kotlin.jvm.internal.p.j(a0Var, "animationSpec");
        return new d(new q(new f(f11, a0Var), (m) null, (p.d) null, (j) null, 14, (i) null));
    }

    public static /* synthetic */ c x(v1.a0 a0Var, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            a0Var = v1.h.g(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        return w(a0Var, f11);
    }

    public static final a y(v1.a0<Float> a0Var, float f11, long j) {
        kotlin.jvm.internal.p.j(a0Var, "animationSpec");
        return new b(new q((f) null, (m) null, (p.d) null, new j(f11, j, a0Var, (i) null), 7, (i) null));
    }

    public static /* synthetic */ a z(v1.a0 a0Var, float f11, long j, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            a0Var = v1.h.g(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            j = q1.f16858b.a();
        }
        return y(a0Var, f11, j);
    }
}
