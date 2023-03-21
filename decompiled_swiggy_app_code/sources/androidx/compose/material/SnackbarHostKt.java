package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.platform.h;
import bp0.k;
import defpackage.v1;
import e0.d1;
import e0.g;
import e0.u;
import fp0.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;

/* compiled from: SnackbarHost.kt */
public final class SnackbarHostKt {

    /* compiled from: SnackbarHost.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5327a;

        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            iArr[SnackbarDuration.Indefinite.ordinal()] = 1;
            iArr[SnackbarDuration.Long.ordinal()] = 2;
            iArr[SnackbarDuration.Short.ordinal()] = 3;
            f5327a = iArr;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(c0.v r18, p0.d r19, lp0.q<? super c0.v, ? super e0.g, ? super java.lang.Integer, bp0.k> r20, e0.g r21, int r22, int r23) {
        /*
            r1 = r18
            r3 = r20
            r4 = r22
            r0 = -1656515806(0xffffffff9d439322, float:-2.58841E-21)
            r2 = r21
            e0.g r0 = r2.t(r0)
            r2 = r23 & 1
            if (r2 == 0) goto L_0x0016
            r2 = r4 | 6
            goto L_0x0026
        L_0x0016:
            r2 = r4 & 14
            if (r2 != 0) goto L_0x0025
            boolean r2 = r0.k(r1)
            if (r2 == 0) goto L_0x0022
            r2 = 4
            goto L_0x0023
        L_0x0022:
            r2 = 2
        L_0x0023:
            r2 = r2 | r4
            goto L_0x0026
        L_0x0025:
            r2 = r4
        L_0x0026:
            r6 = r23 & 2
            if (r6 == 0) goto L_0x002d
            r2 = r2 | 48
            goto L_0x0040
        L_0x002d:
            r8 = r4 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0040
            r8 = r19
            boolean r9 = r0.k(r8)
            if (r9 == 0) goto L_0x003c
            r9 = 32
            goto L_0x003e
        L_0x003c:
            r9 = 16
        L_0x003e:
            r2 = r2 | r9
            goto L_0x0042
        L_0x0040:
            r8 = r19
        L_0x0042:
            r9 = r23 & 4
            if (r9 == 0) goto L_0x0049
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0059
        L_0x0049:
            r9 = r4 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0059
            boolean r9 = r0.k(r3)
            if (r9 == 0) goto L_0x0056
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r2 = r2 | r9
        L_0x0059:
            r9 = r2 & 731(0x2db, float:1.024E-42)
            r9 = r9 ^ 146(0x92, float:2.05E-43)
            if (r9 != 0) goto L_0x006c
            boolean r9 = r0.b()
            if (r9 != 0) goto L_0x0066
            goto L_0x006c
        L_0x0066:
            r0.h()
            r2 = r8
            goto L_0x024b
        L_0x006c:
            if (r6 == 0) goto L_0x0071
            p0.d$a r6 = p0.d.f16037h0
            goto L_0x0072
        L_0x0071:
            r6 = r8
        L_0x0072:
            r8 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r0.E(r8)
            java.lang.Object r8 = r0.F()
            e0.g$a r9 = e0.g.f14172a
            java.lang.Object r9 = r9.a()
            if (r8 != r9) goto L_0x008c
            androidx.compose.material.e r8 = new androidx.compose.material.e
            r8.<init>()
            r0.y(r8)
        L_0x008c:
            r0.P()
            androidx.compose.material.e r8 = (androidx.compose.material.e) r8
            java.lang.Object r9 = r8.a()
            boolean r9 = kotlin.jvm.internal.p.e(r1, r9)
            r10 = 1
            if (r9 != 0) goto L_0x0109
            r8.d(r1)
            java.util.List r9 = r8.b()
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = kotlin.collections.l.u(r9, r12)
            r11.<init>(r12)
            java.util.Iterator r9 = r9.iterator()
        L_0x00b2:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x00c8
            java.lang.Object r12 = r9.next()
            androidx.compose.material.d r12 = (androidx.compose.material.d) r12
            java.lang.Object r12 = r12.c()
            c0.v r12 = (c0.v) r12
            r11.add(r12)
            goto L_0x00b2
        L_0x00c8:
            java.util.List r9 = kotlin.collections.s.G0(r11)
            boolean r11 = r9.contains(r1)
            if (r11 != 0) goto L_0x00d5
            r9.add(r1)
        L_0x00d5:
            java.util.List r11 = r8.b()
            r11.clear()
            java.util.List r11 = kotlin.collections.s.T(r9)
            java.util.List r12 = r8.b()
            java.util.Iterator r11 = r11.iterator()
        L_0x00e8:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x0109
            java.lang.Object r13 = r11.next()
            c0.v r13 = (c0.v) r13
            androidx.compose.material.d r14 = new androidx.compose.material.d
            r15 = -985541570(0xffffffffc541d43e, float:-3101.2651)
            androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1 r7 = new androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1
            r7.<init>(r13, r1, r9, r8)
            l0.a r7 = l0.b.c(r15, r10, r7)
            r14.<init>(r13, r7)
            r12.add(r14)
            goto L_0x00e8
        L_0x0109:
            int r7 = r2 >> 3
            r7 = r7 & 14
            r9 = -1990474327(0xffffffff895bc5a9, float:-2.6454105E-33)
            r0.E(r9)
            p0.a$a r9 = p0.a.f16019a
            p0.a r9 = r9.o()
            int r11 = r7 >> 3
            r12 = r11 & 14
            r11 = r11 & 112(0x70, float:1.57E-43)
            r11 = r11 | r12
            r12 = 0
            i1.t r9 = androidx.compose.foundation.layout.BoxKt.h(r9, r12, r0, r11)
            int r11 = r7 << 3
            r11 = r11 & 112(0x70, float:1.57E-43)
            r13 = 1376089394(0x52057532, float:1.43299215E11)
            r0.E(r13)
            e0.m0 r13 = androidx.compose.ui.platform.CompositionLocalsKt.e()
            java.lang.Object r13 = r0.z(r13)
            d2.e r13 = (d2.e) r13
            e0.m0 r14 = androidx.compose.ui.platform.CompositionLocalsKt.j()
            java.lang.Object r14 = r0.z(r14)
            androidx.compose.ui.unit.LayoutDirection r14 = (androidx.compose.ui.unit.LayoutDirection) r14
            e0.m0 r15 = androidx.compose.ui.platform.CompositionLocalsKt.n()
            java.lang.Object r15 = r0.z(r15)
            androidx.compose.ui.platform.n1 r15 = (androidx.compose.ui.platform.n1) r15
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.ui.node.ComposeUiNode.J
            lp0.a r10 = r16.a()
            lp0.q r12 = androidx.compose.ui.layout.LayoutKt.b(r6)
            int r11 = r11 << 9
            r11 = r11 & 7168(0x1c00, float:1.0045E-41)
            r17 = 6
            r11 = r11 | 6
            e0.e r5 = r0.u()
            boolean r5 = r5 instanceof e0.e
            if (r5 != 0) goto L_0x016a
            e0.f.c()
        L_0x016a:
            r0.f()
            boolean r5 = r0.s()
            if (r5 == 0) goto L_0x0177
            r0.K(r10)
            goto L_0x017a
        L_0x0177:
            r0.c()
        L_0x017a:
            r0.J()
            e0.g r5 = androidx.compose.runtime.Updater.a(r0)
            lp0.p r10 = r16.d()
            androidx.compose.runtime.Updater.c(r5, r9, r10)
            lp0.p r9 = r16.b()
            androidx.compose.runtime.Updater.c(r5, r13, r9)
            lp0.p r9 = r16.c()
            androidx.compose.runtime.Updater.c(r5, r14, r9)
            lp0.p r9 = r16.f()
            androidx.compose.runtime.Updater.c(r5, r15, r9)
            r0.o()
            e0.g r5 = e0.t0.b(r0)
            e0.t0 r5 = e0.t0.a(r5)
            int r9 = r11 >> 3
            r9 = r9 & 112(0x70, float:1.57E-43)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12.invoke(r5, r0, r9)
            r5 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r0.E(r5)
            int r5 = r11 >> 9
            r5 = r5 & 14
            r9 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            r0.E(r9)
            r5 = r5 & 11
            r9 = 2
            r5 = r5 ^ r9
            if (r5 != 0) goto L_0x01d4
            boolean r5 = r0.b()
            if (r5 != 0) goto L_0x01d0
            goto L_0x01d4
        L_0x01d0:
            r0.h()
            goto L_0x023b
        L_0x01d4:
            androidx.compose.foundation.layout.BoxScopeInstance r5 = androidx.compose.foundation.layout.BoxScopeInstance.f3698a
            int r5 = r7 >> 6
            r5 = r5 & 112(0x70, float:1.57E-43)
            r5 = r5 | 6
            r7 = -1050268607(0xffffffffc1662c41, float:-14.385804)
            r0.E(r7)
            r5 = r5 & 81
            r7 = 16
            r5 = r5 ^ r7
            if (r5 != 0) goto L_0x01f4
            boolean r5 = r0.b()
            if (r5 != 0) goto L_0x01f0
            goto L_0x01f4
        L_0x01f0:
            r0.h()
            goto L_0x0238
        L_0x01f4:
            r5 = 0
            e0.o0 r7 = e0.f.b(r0, r5)
            r8.e(r7)
            java.util.List r7 = r8.b()
            int r8 = r7.size()
            r12 = 0
        L_0x0205:
            if (r12 >= r8) goto L_0x0238
            int r5 = r12 + 1
            java.lang.Object r9 = r7.get(r12)
            androidx.compose.material.d r9 = (androidx.compose.material.d) r9
            java.lang.Object r10 = r9.a()
            c0.v r10 = (c0.v) r10
            lp0.q r9 = r9.b()
            r11 = -208579897(0xfffffffff39152c7, float:-2.3027404E31)
            r0.I(r11, r10)
            r11 = -819901460(0xffffffffcf214bec, float:-2.70610739E9)
            androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1 r12 = new androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
            r12.<init>(r3, r10, r2)
            r10 = 1
            l0.a r11 = l0.b.b(r0, r11, r10, r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r17)
            r9.invoke(r11, r0, r12)
            r0.O()
            r12 = r5
            goto L_0x0205
        L_0x0238:
            r0.P()
        L_0x023b:
            r0.P()
            r0.P()
            r0.d()
            r0.P()
            r0.P()
            r2 = r6
        L_0x024b:
            e0.s0 r6 = r0.v()
            if (r6 != 0) goto L_0x0252
            goto L_0x0263
        L_0x0252:
            androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$3 r7 = new androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$3
            r0 = r7
            r1 = r18
            r3 = r20
            r4 = r22
            r5 = r23
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0263:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostKt.a(c0.v, p0.d, lp0.q, e0.g, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.material.SnackbarHostState r12, p0.d r13, lp0.q<? super c0.v, ? super e0.g, ? super java.lang.Integer, bp0.k> r14, e0.g r15, int r16, int r17) {
        /*
            r1 = r12
            r4 = r16
            java.lang.String r0 = "hostState"
            kotlin.jvm.internal.p.j(r12, r0)
            r0 = 1627730774(0x61053356, float:1.5356976E20)
            r2 = r15
            e0.g r0 = r15.t(r0)
            r2 = r17 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r4 | 6
            goto L_0x0027
        L_0x0017:
            r2 = r4 & 14
            if (r2 != 0) goto L_0x0026
            boolean r2 = r0.k(r12)
            if (r2 == 0) goto L_0x0023
            r2 = 4
            goto L_0x0024
        L_0x0023:
            r2 = 2
        L_0x0024:
            r2 = r2 | r4
            goto L_0x0027
        L_0x0026:
            r2 = r4
        L_0x0027:
            r3 = r17 & 2
            if (r3 == 0) goto L_0x002e
            r2 = r2 | 48
            goto L_0x0040
        L_0x002e:
            r5 = r4 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0040
            r5 = r13
            boolean r6 = r0.k(r13)
            if (r6 == 0) goto L_0x003c
            r6 = 32
            goto L_0x003e
        L_0x003c:
            r6 = 16
        L_0x003e:
            r2 = r2 | r6
            goto L_0x0041
        L_0x0040:
            r5 = r13
        L_0x0041:
            r6 = r17 & 4
            if (r6 == 0) goto L_0x0048
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x005a
        L_0x0048:
            r7 = r4 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x005a
            r7 = r14
            boolean r8 = r0.k(r14)
            if (r8 == 0) goto L_0x0056
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r2 = r2 | r8
            goto L_0x005b
        L_0x005a:
            r7 = r14
        L_0x005b:
            r8 = r2 & 731(0x2db, float:1.024E-42)
            r8 = r8 ^ 146(0x92, float:2.05E-43)
            if (r8 != 0) goto L_0x006e
            boolean r8 = r0.b()
            if (r8 != 0) goto L_0x0068
            goto L_0x006e
        L_0x0068:
            r0.h()
            r2 = r5
            r3 = r7
            goto L_0x00aa
        L_0x006e:
            if (r3 == 0) goto L_0x0073
            p0.d$a r3 = p0.d.f16037h0
            goto L_0x0074
        L_0x0073:
            r3 = r5
        L_0x0074:
            if (r6 == 0) goto L_0x007e
            androidx.compose.material.ComposableSingletons$SnackbarHostKt r5 = androidx.compose.material.ComposableSingletons$SnackbarHostKt.f4935a
            lp0.q r5 = r5.a()
            r11 = r5
            goto L_0x007f
        L_0x007e:
            r11 = r7
        L_0x007f:
            c0.v r5 = r12.b()
            e0.m0 r6 = androidx.compose.ui.platform.CompositionLocalsKt.c()
            java.lang.Object r6 = r0.z(r6)
            androidx.compose.ui.platform.h r6 = (androidx.compose.ui.platform.h) r6
            androidx.compose.material.SnackbarHostKt$SnackbarHost$1 r7 = new androidx.compose.material.SnackbarHostKt$SnackbarHost$1
            r8 = 0
            r7.<init>(r5, r6, r8)
            r6 = 0
            e0.u.e(r5, r7, r0, r6)
            c0.v r5 = r12.b()
            r6 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 & 896(0x380, float:1.256E-42)
            r9 = r6 | r2
            r10 = 0
            r6 = r3
            r7 = r11
            r8 = r0
            a(r5, r6, r7, r8, r9, r10)
            r2 = r3
            r3 = r11
        L_0x00aa:
            e0.s0 r6 = r0.v()
            if (r6 != 0) goto L_0x00b1
            goto L_0x00bf
        L_0x00b1:
            androidx.compose.material.SnackbarHostKt$SnackbarHost$2 r7 = new androidx.compose.material.SnackbarHostKt$SnackbarHost$2
            r0 = r7
            r1 = r12
            r4 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostKt.b(androidx.compose.material.SnackbarHostState, p0.d, lp0.q, e0.g, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final d1<Float> f(v1.g<Float> gVar, boolean z11, lp0.a<k> aVar, g gVar2, int i11, int i12) {
        gVar2.E(-731820156);
        if ((i12 & 4) != 0) {
            aVar = SnackbarHostKt$animatedOpacity$1.f5328a;
        }
        lp0.a<k> aVar2 = aVar;
        gVar2.E(-3687241);
        Object F = gVar2.F();
        if (F == g.f14172a.a()) {
            F = v1.b.b(!z11 ? 1.0f : 0.0f, 0.0f, 2, (Object) null);
            gVar2.y(F);
        }
        gVar2.P();
        Animatable animatable = (Animatable) F;
        u.e(Boolean.valueOf(z11), new SnackbarHostKt$animatedOpacity$2(animatable, z11, gVar, aVar2, (c<? super SnackbarHostKt$animatedOpacity$2>) null), gVar2, (i11 >> 3) & 14);
        d1<Float> g11 = animatable.g();
        gVar2.P();
        return g11;
    }

    /* access modifiers changed from: private */
    public static final d1<Float> g(v1.g<Float> gVar, boolean z11, g gVar2, int i11) {
        gVar2.E(-684820976);
        gVar2.E(-3687241);
        Object F = gVar2.F();
        if (F == g.f14172a.a()) {
            F = v1.b.b(!z11 ? 1.0f : 0.8f, 0.0f, 2, (Object) null);
            gVar2.y(F);
        }
        gVar2.P();
        Animatable animatable = (Animatable) F;
        u.e(Boolean.valueOf(z11), new SnackbarHostKt$animatedScale$1(animatable, z11, gVar, (c<? super SnackbarHostKt$animatedScale$1>) null), gVar2, (i11 >> 3) & 14);
        d1<Float> g11 = animatable.g();
        gVar2.P();
        return g11;
    }

    public static final long h(SnackbarDuration snackbarDuration, boolean z11, h hVar) {
        long j;
        p.j(snackbarDuration, "<this>");
        int i11 = a.f5327a[snackbarDuration.ordinal()];
        if (i11 == 1) {
            j = Long.MAX_VALUE;
        } else if (i11 == 2) {
            j = 10000;
        } else if (i11 == 3) {
            j = 4000;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        long j11 = j;
        if (hVar == null) {
            return j11;
        }
        return hVar.a(j11, true, true, z11);
    }
}
