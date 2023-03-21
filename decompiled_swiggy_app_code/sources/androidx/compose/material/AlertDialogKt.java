package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.e;
import d2.h;
import d2.s;
import defpackage.a2;
import e0.f;
import e0.g;
import e0.s0;
import e0.t0;
import i1.t;
import lp0.a;
import lp0.p;
import lp0.q;
import p0.a;
import p0.d;

/* compiled from: AlertDialog.kt */
public final class AlertDialogKt {

    /* renamed from: a  reason: collision with root package name */
    private static final d f4802a;

    /* renamed from: b  reason: collision with root package name */
    private static final d f4803b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f4804c = s.f(40);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final long f4805d = s.f(36);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final long f4806e = s.f(38);

    static {
        d.a aVar = d.f16037h0;
        float f11 = (float) 24;
        f4802a = PaddingKt.m(aVar, h.n(f11), 0.0f, h.n(f11), 0.0f, 10, (Object) null);
        f4803b = PaddingKt.m(aVar, h.n(f11), 0.0f, h.n(f11), h.n((float) 28), 2, (Object) null);
    }

    public static final void a(a2.h hVar, p<? super g, ? super Integer, k> pVar, p<? super g, ? super Integer, k> pVar2, g gVar, int i11) {
        int i12;
        a2.h hVar2 = hVar;
        p<? super g, ? super Integer, k> pVar3 = pVar;
        p<? super g, ? super Integer, k> pVar4 = pVar2;
        int i13 = i11;
        kotlin.jvm.internal.p.j(hVar2, "<this>");
        g t = gVar.t(-1735756929);
        if ((i13 & 14) == 0) {
            i12 = (t.k(hVar2) ? 4 : 2) | i13;
        } else {
            i12 = i13;
        }
        if ((i13 & 112) == 0) {
            i12 |= t.k(pVar3) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i12 |= t.k(pVar4) ? 256 : 128;
        }
        if (((i12 & 731) ^ 146) != 0 || !t.b()) {
            d a11 = hVar2.a(d.f16037h0, 1.0f, false);
            AlertDialogKt$AlertDialogBaselineLayout$2 alertDialogKt$AlertDialogBaselineLayout$2 = AlertDialogKt$AlertDialogBaselineLayout$2.f4807a;
            t.E(1376089394);
            e eVar = (e) t.z(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) t.z(CompositionLocalsKt.j());
            n1 n1Var = (n1) t.z(CompositionLocalsKt.n());
            ComposeUiNode.Companion companion = ComposeUiNode.J;
            a<ComposeUiNode> a12 = companion.a();
            q<t0<ComposeUiNode>, g, Integer, k> b11 = LayoutKt.b(a11);
            if (!(t.u() instanceof e0.e)) {
                f.c();
            }
            t.f();
            if (t.s()) {
                t.K(a12);
            } else {
                t.c();
            }
            t.J();
            g a13 = Updater.a(t);
            Updater.c(a13, alertDialogKt$AlertDialogBaselineLayout$2, companion.d());
            Updater.c(a13, eVar, companion.b());
            Updater.c(a13, layoutDirection, companion.c());
            Updater.c(a13, n1Var, companion.f());
            t.o();
            b11.invoke(t0.a(t0.b(t)), t, 0);
            t.E(2058660585);
            t.E(-1160646213);
            t.E(-1160646206);
            if (pVar3 != null) {
                d b12 = LayoutIdKt.b(f4802a, "title");
                a.C0160a aVar = p0.a.f16019a;
                d b13 = hVar2.b(b12, aVar.k());
                t.E(-1990474327);
                t h11 = BoxKt.h(aVar.o(), false, t, 0);
                t.E(1376089394);
                e eVar2 = (e) t.z(CompositionLocalsKt.e());
                LayoutDirection layoutDirection2 = (LayoutDirection) t.z(CompositionLocalsKt.j());
                n1 n1Var2 = (n1) t.z(CompositionLocalsKt.n());
                lp0.a<ComposeUiNode> a14 = companion.a();
                q<t0<ComposeUiNode>, g, Integer, k> b14 = LayoutKt.b(b13);
                if (!(t.u() instanceof e0.e)) {
                    f.c();
                }
                t.f();
                if (t.s()) {
                    t.K(a14);
                } else {
                    t.c();
                }
                t.J();
                g a15 = Updater.a(t);
                Updater.c(a15, h11, companion.d());
                Updater.c(a15, eVar2, companion.b());
                Updater.c(a15, layoutDirection2, companion.c());
                Updater.c(a15, n1Var2, companion.f());
                t.o();
                b14.invoke(t0.a(t0.b(t)), t, 0);
                t.E(2058660585);
                t.E(-1253629305);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3698a;
                t.E(-630329100);
                pVar3.invoke(t, 0);
                t.P();
                t.P();
                t.P();
                t.d();
                t.P();
                t.P();
                k kVar = k.f22762a;
            }
            t.P();
            if (pVar4 != null) {
                d b15 = LayoutIdKt.b(f4803b, "text");
                a.C0160a aVar2 = p0.a.f16019a;
                d b16 = hVar2.b(b15, aVar2.k());
                t.E(-1990474327);
                t h12 = BoxKt.h(aVar2.o(), false, t, 0);
                t.E(1376089394);
                e eVar3 = (e) t.z(CompositionLocalsKt.e());
                LayoutDirection layoutDirection3 = (LayoutDirection) t.z(CompositionLocalsKt.j());
                n1 n1Var3 = (n1) t.z(CompositionLocalsKt.n());
                lp0.a<ComposeUiNode> a16 = companion.a();
                q<t0<ComposeUiNode>, g, Integer, k> b17 = LayoutKt.b(b16);
                if (!(t.u() instanceof e0.e)) {
                    f.c();
                }
                t.f();
                if (t.s()) {
                    t.K(a16);
                } else {
                    t.c();
                }
                t.J();
                g a17 = Updater.a(t);
                Updater.c(a17, h12, companion.d());
                Updater.c(a17, eVar3, companion.b());
                Updater.c(a17, layoutDirection3, companion.c());
                Updater.c(a17, n1Var3, companion.f());
                t.o();
                b17.invoke(t0.a(t0.b(t)), t, 0);
                t.E(2058660585);
                t.E(-1253629305);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f3698a;
                t.E(-630328933);
                pVar4.invoke(t, 0);
                t.P();
                t.P();
                t.P();
                t.d();
                t.P();
                t.P();
                k kVar2 = k.f22762a;
            }
            t.P();
            t.P();
            t.d();
            t.P();
        } else {
            t.h();
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new AlertDialogKt$AlertDialogBaselineLayout$3(hVar2, pVar3, pVar4, i13));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0117, code lost:
        if ((r38 & 64) != 0) goto L_0x0119;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r27, p0.d r28, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r29, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r30, u0.j1 r31, long r32, long r34, e0.g r36, int r37, int r38) {
        /*
            r1 = r27
            r10 = r37
            java.lang.String r0 = "buttons"
            kotlin.jvm.internal.p.j(r1, r0)
            r0 = 1208798579(0x480ccd73, float:144181.8)
            r2 = r36
            e0.g r0 = r2.t(r0)
            r2 = r38 & 1
            if (r2 == 0) goto L_0x0019
            r2 = r10 | 6
            goto L_0x0029
        L_0x0019:
            r2 = r10 & 14
            if (r2 != 0) goto L_0x0028
            boolean r2 = r0.k(r1)
            if (r2 == 0) goto L_0x0025
            r2 = 4
            goto L_0x0026
        L_0x0025:
            r2 = 2
        L_0x0026:
            r2 = r2 | r10
            goto L_0x0029
        L_0x0028:
            r2 = r10
        L_0x0029:
            r3 = r38 & 2
            if (r3 == 0) goto L_0x0030
            r2 = r2 | 48
            goto L_0x0043
        L_0x0030:
            r4 = r10 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0043
            r4 = r28
            boolean r5 = r0.k(r4)
            if (r5 == 0) goto L_0x003f
            r5 = 32
            goto L_0x0041
        L_0x003f:
            r5 = 16
        L_0x0041:
            r2 = r2 | r5
            goto L_0x0045
        L_0x0043:
            r4 = r28
        L_0x0045:
            r5 = r38 & 4
            if (r5 == 0) goto L_0x004c
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004c:
            r6 = r10 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x005f
            r6 = r29
            boolean r7 = r0.k(r6)
            if (r7 == 0) goto L_0x005b
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r2 = r2 | r7
            goto L_0x0061
        L_0x005f:
            r6 = r29
        L_0x0061:
            r7 = r38 & 8
            if (r7 == 0) goto L_0x0068
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x0068:
            r8 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007b
            r8 = r30
            boolean r9 = r0.k(r8)
            if (r9 == 0) goto L_0x0077
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r2 = r2 | r9
            goto L_0x007d
        L_0x007b:
            r8 = r30
        L_0x007d:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r10
            if (r9 != 0) goto L_0x0098
            r9 = r38 & 16
            if (r9 != 0) goto L_0x0092
            r9 = r31
            boolean r11 = r0.k(r9)
            if (r11 == 0) goto L_0x0094
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0092:
            r9 = r31
        L_0x0094:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r2 = r2 | r11
            goto L_0x009a
        L_0x0098:
            r9 = r31
        L_0x009a:
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r10
            if (r11 != 0) goto L_0x00b4
            r11 = r38 & 32
            if (r11 != 0) goto L_0x00ae
            r11 = r32
            boolean r13 = r0.q(r11)
            if (r13 == 0) goto L_0x00b0
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b2
        L_0x00ae:
            r11 = r32
        L_0x00b0:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00b2:
            r2 = r2 | r13
            goto L_0x00b6
        L_0x00b4:
            r11 = r32
        L_0x00b6:
            r13 = 3670016(0x380000, float:5.142788E-39)
            r13 = r13 & r10
            if (r13 != 0) goto L_0x00d0
            r13 = r38 & 64
            if (r13 != 0) goto L_0x00ca
            r13 = r34
            boolean r15 = r0.q(r13)
            if (r15 == 0) goto L_0x00cc
            r15 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ce
        L_0x00ca:
            r13 = r34
        L_0x00cc:
            r15 = 524288(0x80000, float:7.34684E-40)
        L_0x00ce:
            r2 = r2 | r15
            goto L_0x00d2
        L_0x00d0:
            r13 = r34
        L_0x00d2:
            r15 = 2995931(0x2db6db, float:4.198194E-39)
            r15 = r15 & r2
            r16 = 599186(0x92492, float:8.39638E-40)
            r15 = r15 ^ r16
            if (r15 != 0) goto L_0x00ef
            boolean r15 = r0.b()
            if (r15 != 0) goto L_0x00e4
            goto L_0x00ef
        L_0x00e4:
            r0.h()
            r2 = r4
            r3 = r6
            r4 = r8
            r5 = r9
            r6 = r11
            r8 = r13
            goto L_0x0198
        L_0x00ef:
            r0.H()
            r15 = r10 & 1
            r16 = -3670017(0xffffffffffc7ffff, float:NaN)
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            r18 = -57345(0xffffffffffff1fff, float:NaN)
            if (r15 == 0) goto L_0x0120
            boolean r15 = r0.i()
            if (r15 == 0) goto L_0x0106
            goto L_0x0120
        L_0x0106:
            r0.h()
            r3 = r38 & 16
            if (r3 == 0) goto L_0x010f
            r2 = r2 & r18
        L_0x010f:
            r3 = r38 & 32
            if (r3 == 0) goto L_0x0115
            r2 = r2 & r17
        L_0x0115:
            r3 = r38 & 64
            if (r3 == 0) goto L_0x011b
        L_0x0119:
            r2 = r2 & r16
        L_0x011b:
            r5 = r2
            r2 = r11
            r23 = r13
            goto L_0x015b
        L_0x0120:
            if (r3 == 0) goto L_0x0125
            p0.d$a r3 = p0.d.f16037h0
            r4 = r3
        L_0x0125:
            r3 = 0
            if (r5 == 0) goto L_0x0129
            r6 = r3
        L_0x0129:
            if (r7 == 0) goto L_0x012c
            r8 = r3
        L_0x012c:
            r3 = r38 & 16
            r5 = 6
            if (r3 == 0) goto L_0x013e
            c0.q r3 = c0.q.f12737a
            c0.u r3 = r3.b(r0, r5)
            z.a r3 = r3.b()
            r2 = r2 & r18
            r9 = r3
        L_0x013e:
            r3 = r38 & 32
            if (r3 == 0) goto L_0x014e
            c0.q r3 = c0.q.f12737a
            c0.c r3 = r3.a(r0, r5)
            long r11 = r3.n()
            r2 = r2 & r17
        L_0x014e:
            r3 = r38 & 64
            if (r3 == 0) goto L_0x011b
            int r3 = r2 >> 15
            r3 = r3 & 14
            long r13 = androidx.compose.material.ColorsKt.b(r11, r0, r3)
            goto L_0x0119
        L_0x015b:
            r0.A()
            r17 = 0
            r18 = 0
            r7 = -819892496(0xffffffffcf216ef0, float:-2.70840218E9)
            androidx.compose.material.AlertDialogKt$AlertDialogContent$1 r11 = new androidx.compose.material.AlertDialogKt$AlertDialogContent$1
            r11.<init>(r6, r8, r1, r5)
            r12 = 1
            l0.a r19 = l0.b.b(r0, r7, r12, r11)
            r7 = 1572864(0x180000, float:2.204052E-39)
            int r11 = r5 >> 3
            r11 = r11 & 14
            r7 = r7 | r11
            int r5 = r5 >> 9
            r11 = r5 & 112(0x70, float:1.57E-43)
            r7 = r7 | r11
            r11 = r5 & 896(0x380, float:1.256E-42)
            r7 = r7 | r11
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r21 = r7 | r5
            r22 = 48
            r11 = r4
            r12 = r9
            r13 = r2
            r15 = r23
            r20 = r0
            androidx.compose.material.SurfaceKt.b(r11, r12, r13, r15, r17, r18, r19, r20, r21, r22)
            r5 = r9
            r25 = r2
            r2 = r4
            r3 = r6
            r4 = r8
            r8 = r23
            r6 = r25
        L_0x0198:
            e0.s0 r12 = r0.v()
            if (r12 != 0) goto L_0x019f
            goto L_0x01ae
        L_0x019f:
            androidx.compose.material.AlertDialogKt$AlertDialogContent$2 r13 = new androidx.compose.material.AlertDialogKt$AlertDialogContent$2
            r0 = r13
            r1 = r27
            r10 = r37
            r11 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11)
            r12.a(r13)
        L_0x01ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AlertDialogKt.b(lp0.p, p0.d, lp0.p, lp0.p, u0.j1, long, long, e0.g, int, int):void");
    }

    public static final void c(float f11, float f12, p<? super g, ? super Integer, k> pVar, g gVar, int i11) {
        int i12;
        kotlin.jvm.internal.p.j(pVar, "content");
        g t = gVar.t(-489408515);
        if ((i11 & 14) == 0) {
            i12 = (t.n(f11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= t.n(f12) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= t.k(pVar) ? 256 : 128;
        }
        if (((i12 & 731) ^ 146) != 0 || !t.b()) {
            AlertDialogKt$AlertDialogFlowRow$1 alertDialogKt$AlertDialogFlowRow$1 = new AlertDialogKt$AlertDialogFlowRow$1(f11, f12);
            t.E(1376089394);
            d.a aVar = d.f16037h0;
            e eVar = (e) t.z(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) t.z(CompositionLocalsKt.j());
            n1 n1Var = (n1) t.z(CompositionLocalsKt.n());
            ComposeUiNode.Companion companion = ComposeUiNode.J;
            lp0.a<ComposeUiNode> a11 = companion.a();
            q<t0<ComposeUiNode>, g, Integer, k> b11 = LayoutKt.b(aVar);
            int i13 = ((((i12 >> 6) & 14) << 9) & 7168) | 6;
            if (!(t.u() instanceof e0.e)) {
                f.c();
            }
            t.f();
            if (t.s()) {
                t.K(a11);
            } else {
                t.c();
            }
            t.J();
            g a12 = Updater.a(t);
            Updater.c(a12, alertDialogKt$AlertDialogFlowRow$1, companion.d());
            Updater.c(a12, eVar, companion.b());
            Updater.c(a12, layoutDirection, companion.c());
            Updater.c(a12, n1Var, companion.f());
            t.o();
            b11.invoke(t0.a(t0.b(t)), t, Integer.valueOf((i13 >> 3) & 112));
            t.E(2058660585);
            pVar.invoke(t, Integer.valueOf((i13 >> 9) & 14));
            t.P();
            t.d();
            t.P();
        } else {
            t.h();
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new AlertDialogKt$AlertDialogFlowRow$2(f11, f12, pVar, i11));
        }
    }
}
