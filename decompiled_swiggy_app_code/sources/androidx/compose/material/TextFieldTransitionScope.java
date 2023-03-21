package androidx.compose.material;

import d2.h;
import e0.d1;
import u0.d0;

/* compiled from: TextFieldImpl.kt */
final class TextFieldTransitionScope {

    /* renamed from: a  reason: collision with root package name */
    public static final TextFieldTransitionScope f5713a = new TextFieldTransitionScope();

    /* compiled from: TextFieldImpl.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5727a;

        static {
            int[] iArr = new int[InputPhase.values().length];
            iArr[InputPhase.Focused.ordinal()] = 1;
            iArr[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            iArr[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            f5727a = iArr;
        }
    }

    private TextFieldTransitionScope() {
    }

    private static final float b(d1<Float> d1Var) {
        return d1Var.getValue().floatValue();
    }

    private static final float c(d1<h> d1Var) {
        return d1Var.getValue().s();
    }

    private static final float d(d1<Float> d1Var) {
        return d1Var.getValue().floatValue();
    }

    private static final long e(d1<d0> d1Var) {
        return d1Var.getValue().v();
    }

    private static final long f(d1<d0> d1Var) {
        return d1Var.getValue().v();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: v1$q0} */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0241, code lost:
        if (r8 != false) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0218, code lost:
        if (r8 != false) goto L_0x0210;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0235  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.compose.material.InputPhase r29, long r30, long r32, lp0.q<? super androidx.compose.material.InputPhase, ? super e0.g, ? super java.lang.Integer, u0.d0> r34, boolean r35, lp0.u<? super java.lang.Float, ? super u0.d0, ? super u0.d0, ? super d2.h, ? super java.lang.Float, ? super e0.g, ? super java.lang.Integer, bp0.k> r36, e0.g r37, int r38) {
        /*
            r28 = this;
            r2 = r29
            r7 = r34
            r8 = r35
            r5 = r36
            r6 = r38
            java.lang.String r0 = "inputState"
            kotlin.jvm.internal.p.j(r2, r0)
            java.lang.String r0 = "contentColor"
            kotlin.jvm.internal.p.j(r7, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r5, r0)
            r0 = -1836666808(0xffffffff9286b048, float:-8.500046E-28)
            r1 = r37
            e0.g r0 = r1.t(r0)
            r1 = r6 & 14
            r3 = 2
            if (r1 != 0) goto L_0x0032
            boolean r1 = r0.k(r2)
            if (r1 == 0) goto L_0x002f
            r1 = 4
            goto L_0x0030
        L_0x002f:
            r1 = 2
        L_0x0030:
            r1 = r1 | r6
            goto L_0x0033
        L_0x0032:
            r1 = r6
        L_0x0033:
            r4 = r6 & 112(0x70, float:1.57E-43)
            r14 = r30
            if (r4 != 0) goto L_0x0045
            boolean r4 = r0.q(r14)
            if (r4 == 0) goto L_0x0042
            r4 = 32
            goto L_0x0044
        L_0x0042:
            r4 = 16
        L_0x0044:
            r1 = r1 | r4
        L_0x0045:
            r4 = r6 & 896(0x380, float:1.256E-42)
            r12 = r32
            if (r4 != 0) goto L_0x0057
            boolean r4 = r0.q(r12)
            if (r4 == 0) goto L_0x0054
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0056
        L_0x0054:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0056:
            r1 = r1 | r4
        L_0x0057:
            r4 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0067
            boolean r4 = r0.k(r7)
            if (r4 == 0) goto L_0x0064
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0066
        L_0x0064:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0066:
            r1 = r1 | r4
        L_0x0067:
            r4 = 57344(0xe000, float:8.0356E-41)
            r9 = r6 & r4
            if (r9 != 0) goto L_0x007a
            boolean r9 = r0.m(r8)
            if (r9 == 0) goto L_0x0077
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0079
        L_0x0077:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0079:
            r1 = r1 | r9
        L_0x007a:
            r17 = 458752(0x70000, float:6.42848E-40)
            r9 = r6 & r17
            if (r9 != 0) goto L_0x008c
            boolean r9 = r0.k(r5)
            if (r9 == 0) goto L_0x0089
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x008b
        L_0x0089:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x008b:
            r1 = r1 | r9
        L_0x008c:
            r9 = 374491(0x5b6db, float:5.24774E-40)
            r9 = r9 & r1
            r10 = 74898(0x12492, float:1.04954E-40)
            r9 = r9 ^ r10
            if (r9 != 0) goto L_0x00a2
            boolean r9 = r0.b()
            if (r9 != 0) goto L_0x009d
            goto L_0x00a2
        L_0x009d:
            r0.h()
            goto L_0x0413
        L_0x00a2:
            r9 = r1 & 14
            r9 = r9 | 48
            java.lang.String r10 = "TextFieldInputState"
            r11 = 0
            androidx.compose.animation.core.Transition r18 = androidx.compose.animation.core.TransitionKt.d(r2, r10, r0, r9, r11)
            androidx.compose.material.TextFieldTransitionScope$Transition$labelProgress$2 r9 = androidx.compose.material.TextFieldTransitionScope$Transition$labelProgress$2.f5724a
            r10 = 1399891485(0x5370a61d, float:1.03357907E12)
            r0.E(r10)
            kotlin.jvm.internal.k r19 = kotlin.jvm.internal.k.f25688a
            v1$q0 r16 = androidx.compose.animation.core.VectorConvertersKt.f(r19)
            r4 = 1847725064(0x6e220c08, float:1.2537779E28)
            r0.E(r4)
            java.lang.Object r20 = r18.g()
            androidx.compose.material.InputPhase r20 = (androidx.compose.material.InputPhase) r20
            r10 = 337280661(0x141a7e95, float:7.799977E-27)
            r0.E(r10)
            int[] r22 = androidx.compose.material.TextFieldTransitionScope.a.f5727a
            int r20 = r20.ordinal()
            r4 = r22[r20]
            r20 = 0
            r23 = 1065353216(0x3f800000, float:1.0)
            r11 = 3
            r10 = 1
            if (r4 == r10) goto L_0x00ea
            if (r4 == r3) goto L_0x00e8
            if (r4 != r11) goto L_0x00e2
            goto L_0x00ea
        L_0x00e2:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00e8:
            r4 = 0
            goto L_0x00ec
        L_0x00ea:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x00ec:
            r0.P()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.Object r25 = r18.m()
            androidx.compose.material.InputPhase r25 = (androidx.compose.material.InputPhase) r25
            r11 = 337280661(0x141a7e95, float:7.799977E-27)
            r0.E(r11)
            int r11 = r25.ordinal()
            r11 = r22[r11]
            if (r11 == r10) goto L_0x0116
            if (r11 == r3) goto L_0x0113
            r3 = 3
            if (r11 != r3) goto L_0x010d
            goto L_0x0117
        L_0x010d:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0113:
            r3 = 3
            r11 = 0
            goto L_0x0119
        L_0x0116:
            r3 = 3
        L_0x0117:
            r11 = 1065353216(0x3f800000, float:1.0)
        L_0x0119:
            r0.P()
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            androidx.compose.animation.core.Transition$b r3 = r18.k()
            r24 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r24)
            java.lang.Object r3 = r9.invoke(r3, r0, r10)
            v1$a0 r3 = (defpackage.v1.a0) r3
            r26 = 196608(0x30000, float:2.75506E-40)
            java.lang.String r27 = "LabelProgress"
            r9 = r18
            r2 = 1
            r10 = r4
            r4 = 3
            r12 = r3
            r13 = r16
            r14 = r27
            r15 = r0
            r16 = r26
            e0.d1 r3 = androidx.compose.animation.core.TransitionKt.c(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.P()
            r0.P()
            androidx.compose.material.TextFieldTransitionScope$Transition$indicatorWidth$2 r9 = androidx.compose.material.TextFieldTransitionScope$Transition$indicatorWidth$2.f5722a
            r10 = -307431328(0xffffffffedacf860, float:-6.691461E27)
            r0.E(r10)
            d2.h$a r10 = d2.h.f13997b
            v1$q0 r13 = androidx.compose.animation.core.VectorConvertersKt.b(r10)
            r10 = 1847725064(0x6e220c08, float:1.2537779E28)
            r0.E(r10)
            java.lang.Object r10 = r18.g()
            androidx.compose.material.InputPhase r10 = (androidx.compose.material.InputPhase) r10
            r11 = 337281027(0x141a8003, float:7.800259E-27)
            r0.E(r11)
            int r10 = r10.ordinal()
            r10 = r22[r10]
            if (r10 == r2) goto L_0x0188
            r12 = 2
            if (r10 == r12) goto L_0x0183
            if (r10 != r4) goto L_0x017d
            float r10 = androidx.compose.material.TextFieldImplKt.f5543b
            goto L_0x018c
        L_0x017d:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0183:
            float r10 = androidx.compose.material.TextFieldImplKt.f5543b
            goto L_0x018c
        L_0x0188:
            float r10 = androidx.compose.material.TextFieldImplKt.f5544c
        L_0x018c:
            r0.P()
            d2.h r10 = d2.h.k(r10)
            java.lang.Object r12 = r18.m()
            androidx.compose.material.InputPhase r12 = (androidx.compose.material.InputPhase) r12
            r0.E(r11)
            int r11 = r12.ordinal()
            r11 = r22[r11]
            if (r11 == r2) goto L_0x01b9
            r12 = 2
            if (r11 == r12) goto L_0x01b4
            if (r11 != r4) goto L_0x01ae
            float r11 = androidx.compose.material.TextFieldImplKt.f5543b
            goto L_0x01bd
        L_0x01ae:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01b4:
            float r11 = androidx.compose.material.TextFieldImplKt.f5543b
            goto L_0x01bd
        L_0x01b9:
            float r11 = androidx.compose.material.TextFieldImplKt.f5544c
        L_0x01bd:
            r0.P()
            d2.h r11 = d2.h.k(r11)
            androidx.compose.animation.core.Transition$b r12 = r18.k()
            r14 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            java.lang.Object r9 = r9.invoke(r12, r0, r15)
            r12 = r9
            v1$a0 r12 = (defpackage.v1.a0) r12
            java.lang.String r14 = "IndicatorWidth"
            r9 = r18
            r15 = r0
            r16 = r26
            e0.d1 r25 = androidx.compose.animation.core.TransitionKt.c(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.P()
            r0.P()
            androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2 r9 = androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2.f5726a
            r10 = 1399891485(0x5370a61d, float:1.03357907E12)
            r0.E(r10)
            v1$q0 r13 = androidx.compose.animation.core.VectorConvertersKt.f(r19)
            r10 = 1847725064(0x6e220c08, float:1.2537779E28)
            r0.E(r10)
            java.lang.Object r10 = r18.g()
            androidx.compose.material.InputPhase r10 = (androidx.compose.material.InputPhase) r10
            r11 = 337282213(0x141a84a5, float:7.8011726E-27)
            r0.E(r11)
            int r10 = r10.ordinal()
            r10 = r22[r10]
            if (r10 == r2) goto L_0x021b
            r12 = 2
            if (r10 == r12) goto L_0x0218
            if (r10 != r4) goto L_0x0212
        L_0x0210:
            r10 = 0
            goto L_0x021d
        L_0x0212:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0218:
            if (r8 == 0) goto L_0x021b
            goto L_0x0210
        L_0x021b:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x021d:
            r0.P()
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            java.lang.Object r12 = r18.m()
            androidx.compose.material.InputPhase r12 = (androidx.compose.material.InputPhase) r12
            r0.E(r11)
            int r11 = r12.ordinal()
            r11 = r22[r11]
            if (r11 == r2) goto L_0x0244
            r12 = 2
            if (r11 == r12) goto L_0x0241
            if (r11 != r4) goto L_0x023b
            goto L_0x0246
        L_0x023b:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0241:
            if (r8 == 0) goto L_0x0244
            goto L_0x0246
        L_0x0244:
            r20 = 1065353216(0x3f800000, float:1.0)
        L_0x0246:
            r0.P()
            java.lang.Float r11 = java.lang.Float.valueOf(r20)
            androidx.compose.animation.core.Transition$b r12 = r18.k()
            r14 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            java.lang.Object r9 = r9.invoke(r12, r0, r15)
            r12 = r9
            v1$a0 r12 = (defpackage.v1.a0) r12
            java.lang.String r14 = "PlaceholderOpacity"
            r9 = r18
            r15 = r0
            r16 = r26
            e0.d1 r19 = androidx.compose.animation.core.TransitionKt.c(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.P()
            r0.P()
            androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2 r9 = androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2.f5725a
            r15 = -1462136984(0xffffffffa8d98f68, float:-2.4154032E-14)
            r0.E(r15)
            java.lang.Object r10 = r18.m()
            androidx.compose.material.InputPhase r10 = (androidx.compose.material.InputPhase) r10
            r11 = 337282615(0x141a8637, float:7.801482E-27)
            r0.E(r11)
            int r10 = r10.ordinal()
            r10 = r22[r10]
            if (r10 != r2) goto L_0x028d
            r12 = r30
            goto L_0x028f
        L_0x028d:
            r12 = r32
        L_0x028f:
            r0.P()
            androidx.compose.ui.graphics.colorspace.a r10 = u0.d0.q(r12)
            r14 = -3686930(0xffffffffffc7bdee, float:NaN)
            r0.E(r14)
            boolean r12 = r0.k(r10)
            java.lang.Object r13 = r0.F()
            if (r12 != 0) goto L_0x02ae
            e0.g$a r12 = e0.g.f14172a
            java.lang.Object r12 = r12.a()
            if (r13 != r12) goto L_0x02be
        L_0x02ae:
            u0.d0$a r12 = u0.d0.f16756b
            lp0.l r12 = androidx.compose.animation.ColorVectorConverterKt.d(r12)
            java.lang.Object r10 = r12.invoke(r10)
            r13 = r10
            v1$q0 r13 = (defpackage.v1.q0) r13
            r0.y(r13)
        L_0x02be:
            r0.P()
            v1$q0 r13 = (defpackage.v1.q0) r13
            r10 = 1847725064(0x6e220c08, float:1.2537779E28)
            r0.E(r10)
            java.lang.Object r10 = r18.g()
            androidx.compose.material.InputPhase r10 = (androidx.compose.material.InputPhase) r10
            r0.E(r11)
            int r10 = r10.ordinal()
            r10 = r22[r10]
            if (r10 != r2) goto L_0x02dd
            r20 = r30
            goto L_0x02df
        L_0x02dd:
            r20 = r32
        L_0x02df:
            r0.P()
            u0.d0 r10 = u0.d0.h(r20)
            java.lang.Object r12 = r18.m()
            androidx.compose.material.InputPhase r12 = (androidx.compose.material.InputPhase) r12
            r0.E(r11)
            int r11 = r12.ordinal()
            r11 = r22[r11]
            if (r11 != r2) goto L_0x02fa
            r11 = r30
            goto L_0x02fc
        L_0x02fa:
            r11 = r32
        L_0x02fc:
            r0.P()
            u0.d0 r11 = u0.d0.h(r11)
            androidx.compose.animation.core.Transition$b r2 = r18.k()
            r12 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object r2 = r9.invoke(r2, r0, r12)
            r12 = r2
            v1$a0 r12 = (defpackage.v1.a0) r12
            r16 = 229376(0x38000, float:3.21424E-40)
            java.lang.String r2 = "LabelTextStyleColor"
            r9 = r18
            r4 = -3686930(0xffffffffffc7bdee, float:NaN)
            r14 = r2
            r2 = -1462136984(0xffffffffa8d98f68, float:-2.4154032E-14)
            r15 = r0
            e0.d1 r20 = androidx.compose.animation.core.TransitionKt.c(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.P()
            r0.P()
            androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2 r9 = androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2.f5723a
            r10 = r1 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | 384(0x180, float:5.38E-43)
            r0.E(r2)
            java.lang.Object r2 = r18.m()
            int r11 = r10 >> 6
            r11 = r11 & 112(0x70, float:1.57E-43)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object r2 = r7.invoke(r2, r0, r11)
            u0.d0 r2 = (u0.d0) r2
            long r11 = r2.v()
            androidx.compose.ui.graphics.colorspace.a r2 = u0.d0.q(r11)
            r0.E(r4)
            boolean r4 = r0.k(r2)
            java.lang.Object r11 = r0.F()
            if (r4 != 0) goto L_0x0364
            e0.g$a r4 = e0.g.f14172a
            java.lang.Object r4 = r4.a()
            if (r11 != r4) goto L_0x0374
        L_0x0364:
            u0.d0$a r4 = u0.d0.f16756b
            lp0.l r4 = androidx.compose.animation.ColorVectorConverterKt.d(r4)
            java.lang.Object r2 = r4.invoke(r2)
            r11 = r2
            v1$q0 r11 = (defpackage.v1.q0) r11
            r0.y(r11)
        L_0x0374:
            r0.P()
            r13 = r11
            v1$q0 r13 = (defpackage.v1.q0) r13
            r2 = r10 & 14
            r2 = r2 | 64
            r4 = 3
            int r4 = r10 << 3
            r10 = r4 & 896(0x380, float:1.256E-42)
            r2 = r2 | r10
            r10 = r4 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r10
            r10 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r10
            r2 = r2 | r4
            r4 = 1847725064(0x6e220c08, float:1.2537779E28)
            r0.E(r4)
            java.lang.Object r4 = r18.g()
            int r10 = r2 >> 9
            r10 = r10 & 112(0x70, float:1.57E-43)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r7.invoke(r4, r0, r11)
            java.lang.Object r11 = r18.m()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object r11 = r7.invoke(r11, r0, r10)
            androidx.compose.animation.core.Transition$b r10 = r18.k()
            int r12 = r2 >> 3
            r12 = r12 & 112(0x70, float:1.57E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object r9 = r9.invoke(r10, r0, r12)
            r12 = r9
            v1$a0 r12 = (defpackage.v1.a0) r12
            r9 = r2 & 14
            int r10 = r2 << 9
            r14 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r14
            r9 = r9 | r10
            int r2 = r2 << 6
            r2 = r2 & r17
            r16 = r9 | r2
            java.lang.String r14 = "LabelContentColor"
            r9 = r18
            r10 = r4
            r15 = r0
            e0.d1 r2 = androidx.compose.animation.core.TransitionKt.c(r9, r10, r11, r12, r13, r14, r15, r16)
            r0.P()
            r0.P()
            float r3 = b(r3)
            java.lang.Float r10 = java.lang.Float.valueOf(r3)
            long r3 = e(r20)
            u0.d0 r11 = u0.d0.h(r3)
            long r2 = f(r2)
            u0.d0 r12 = u0.d0.h(r2)
            float r2 = c(r25)
            d2.h r13 = d2.h.k(r2)
            float r2 = d(r19)
            java.lang.Float r14 = java.lang.Float.valueOf(r2)
            r1 = r1 & r17
            java.lang.Integer r16 = java.lang.Integer.valueOf(r1)
            r9 = r36
            r9.l0(r10, r11, r12, r13, r14, r15, r16)
        L_0x0413:
            e0.s0 r11 = r0.v()
            if (r11 != 0) goto L_0x041a
            goto L_0x0433
        L_0x041a:
            androidx.compose.material.TextFieldTransitionScope$Transition$1 r12 = new androidx.compose.material.TextFieldTransitionScope$Transition$1
            r0 = r12
            r1 = r28
            r2 = r29
            r3 = r30
            r5 = r32
            r7 = r34
            r8 = r35
            r9 = r36
            r10 = r38
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10)
            r11.a(r12)
        L_0x0433:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldTransitionScope.a(androidx.compose.material.InputPhase, long, long, lp0.q, boolean, lp0.u, e0.g, int):void");
    }
}
