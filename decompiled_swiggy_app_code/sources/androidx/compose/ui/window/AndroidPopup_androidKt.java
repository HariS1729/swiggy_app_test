package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.CompositionLocalKt;
import bp0.k;
import d2.n;
import e0.a1;
import e0.d1;
import e0.g;
import e0.m0;
import lp0.p;

/* compiled from: AndroidPopup.android.kt */
public final class AndroidPopup_androidKt {

    /* renamed from: a  reason: collision with root package name */
    private static final m0<String> f7786a = CompositionLocalKt.c((a1) null, AndroidPopup_androidKt$LocalPopupTestTag$1.f7787a, 1, (Object) null);

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.window.g r27, lp0.a<bp0.k> r28, androidx.compose.ui.window.h r29, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r30, e0.g r31, int r32, int r33) {
        /*
            r11 = r27
            r12 = r30
            r13 = r32
            java.lang.String r0 = "popupPositionProvider"
            kotlin.jvm.internal.p.j(r11, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r12, r0)
            r0 = -830247068(0xffffffffce836f64, float:-1.1025577E9)
            r1 = r31
            e0.g r14 = r1.t(r0)
            r0 = r33 & 1
            if (r0 == 0) goto L_0x0020
            r0 = r13 | 6
            goto L_0x0030
        L_0x0020:
            r0 = r13 & 14
            if (r0 != 0) goto L_0x002f
            boolean r0 = r14.k(r11)
            if (r0 == 0) goto L_0x002c
            r0 = 4
            goto L_0x002d
        L_0x002c:
            r0 = 2
        L_0x002d:
            r0 = r0 | r13
            goto L_0x0030
        L_0x002f:
            r0 = r13
        L_0x0030:
            r1 = r33 & 2
            if (r1 == 0) goto L_0x0037
            r0 = r0 | 48
            goto L_0x004a
        L_0x0037:
            r2 = r13 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004a
            r2 = r28
            boolean r3 = r14.k(r2)
            if (r3 == 0) goto L_0x0046
            r3 = 32
            goto L_0x0048
        L_0x0046:
            r3 = 16
        L_0x0048:
            r0 = r0 | r3
            goto L_0x004c
        L_0x004a:
            r2 = r28
        L_0x004c:
            r3 = r13 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0065
            r3 = r33 & 4
            if (r3 != 0) goto L_0x005f
            r3 = r29
            boolean r4 = r14.k(r3)
            if (r4 == 0) goto L_0x0061
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x005f:
            r3 = r29
        L_0x0061:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r0 = r0 | r4
            goto L_0x0067
        L_0x0065:
            r3 = r29
        L_0x0067:
            r4 = r33 & 8
            if (r4 == 0) goto L_0x006e
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x007e
        L_0x006e:
            r4 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x007e
            boolean r4 = r14.k(r12)
            if (r4 == 0) goto L_0x007b
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r0 = r0 | r4
        L_0x007e:
            r4 = r0 & 5851(0x16db, float:8.199E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r4 != r5) goto L_0x0090
            boolean r4 = r14.b()
            if (r4 != 0) goto L_0x008b
            goto L_0x0090
        L_0x008b:
            r14.h()
            goto L_0x0260
        L_0x0090:
            r14.H()
            r4 = r13 & 1
            if (r4 == 0) goto L_0x00a8
            boolean r4 = r14.i()
            if (r4 == 0) goto L_0x009e
            goto L_0x00a8
        L_0x009e:
            r14.h()
            r1 = r33 & 4
            if (r1 == 0) goto L_0x00cf
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x00cf
        L_0x00a8:
            if (r1 == 0) goto L_0x00ab
            r2 = 0
        L_0x00ab:
            r1 = r33 & 4
            if (r1 == 0) goto L_0x00cf
            androidx.compose.ui.window.h r1 = new androidx.compose.ui.window.h
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 63
            r24 = 0
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
            r18 = r0
            r17 = r1
            r16 = r2
            goto L_0x00d5
        L_0x00cf:
            r18 = r0
            r16 = r2
            r17 = r3
        L_0x00d5:
            r14.A()
            e0.m0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.k()
            java.lang.Object r0 = r14.z(r0)
            r8 = r0
            android.view.View r8 = (android.view.View) r8
            e0.m0 r0 = androidx.compose.ui.platform.CompositionLocalsKt.e()
            java.lang.Object r0 = r14.z(r0)
            r9 = r0
            d2.e r9 = (d2.e) r9
            e0.m0<java.lang.String> r0 = f7786a
            java.lang.Object r0 = r14.z(r0)
            r19 = r0
            java.lang.String r19 = (java.lang.String) r19
            e0.m0 r0 = androidx.compose.ui.platform.CompositionLocalsKt.j()
            java.lang.Object r0 = r14.z(r0)
            r10 = r0
            androidx.compose.ui.unit.LayoutDirection r10 = (androidx.compose.ui.unit.LayoutDirection) r10
            r0 = 0
            androidx.compose.runtime.a r7 = e0.f.d(r14, r0)
            int r1 = r18 >> 9
            r1 = r1 & 14
            e0.d1 r6 = androidx.compose.runtime.g.m(r12, r14, r1)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r3 = 0
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1 r4 = androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1.f7822a
            r20 = 3080(0xc08, float:4.316E-42)
            r21 = 6
            r5 = r14
            r15 = r6
            r6 = r20
            r25 = r7
            r7 = r21
            java.lang.Object r1 = androidx.compose.runtime.saveable.RememberSaveableKt.b(r1, r2, r3, r4, r5, r6, r7)
            r7 = r1
            java.util.UUID r7 = (java.util.UUID) r7
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.E(r1)
            java.lang.Object r1 = r14.F()
            e0.g$a r2 = e0.g.f14172a
            java.lang.Object r2 = r2.a()
            if (r1 != r2) goto L_0x017c
            androidx.compose.ui.window.PopupLayout r6 = new androidx.compose.ui.window.PopupLayout
            java.lang.String r1 = "popupId"
            kotlin.jvm.internal.p.i(r7, r1)
            r20 = 0
            r21 = 128(0x80, float:1.794E-43)
            r22 = 0
            r5 = 0
            r0 = r6
            r1 = r16
            r2 = r17
            r3 = r19
            r4 = r8
            r8 = 0
            r5 = r9
            r9 = r6
            r6 = r27
            r8 = r20
            r26 = r9
            r9 = r21
            r28 = r10
            r10 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 1302892335(0x4da88f2f, float:3.53494496E8)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1 r1 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
            r2 = r26
            r1.<init>(r2, r15)
            r3 = 1
            l0.a r0 = l0.b.c(r0, r3, r1)
            r1 = r25
            r2.p(r1, r0)
            r14.y(r2)
            r1 = r2
            goto L_0x017e
        L_0x017c:
            r28 = r10
        L_0x017e:
            r14.P()
            androidx.compose.ui.window.PopupLayout r1 = (androidx.compose.ui.window.PopupLayout) r1
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2
            r3 = r0
            r4 = r1
            r5 = r16
            r6 = r17
            r7 = r19
            r8 = r28
            r3.<init>(r4, r5, r6, r7, r8)
            r2 = 8
            e0.u.b(r1, r0, r14, r2)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            r3 = 0
            e0.u.g(r0, r14, r3)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4
            r0.<init>(r1, r11)
            r4 = r18 & 14
            e0.u.b(r11, r0, r14, r4)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5
            r4 = 0
            r0.<init>(r1, r4)
            e0.u.e(r1, r0, r14, r2)
            p0.d$a r0 = p0.d.f16037h0
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7 r2 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7
            r2.<init>(r1)
            p0.d r0 = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.a(r0, r2)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8 r2 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8
            r4 = r28
            r2.<init>(r1, r4)
            r1 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.E(r1)
            e0.m0 r1 = androidx.compose.ui.platform.CompositionLocalsKt.e()
            java.lang.Object r1 = r14.z(r1)
            d2.e r1 = (d2.e) r1
            e0.m0 r4 = androidx.compose.ui.platform.CompositionLocalsKt.j()
            java.lang.Object r4 = r14.z(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.ui.unit.LayoutDirection) r4
            e0.m0 r5 = androidx.compose.ui.platform.CompositionLocalsKt.n()
            java.lang.Object r5 = r14.z(r5)
            androidx.compose.ui.platform.n1 r5 = (androidx.compose.ui.platform.n1) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.J
            lp0.a r7 = r6.a()
            lp0.q r0 = androidx.compose.ui.layout.LayoutKt.b(r0)
            e0.e r8 = r14.u()
            boolean r8 = r8 instanceof e0.e
            if (r8 != 0) goto L_0x01ff
            e0.f.c()
        L_0x01ff:
            r14.f()
            boolean r8 = r14.s()
            if (r8 == 0) goto L_0x020c
            r14.K(r7)
            goto L_0x020f
        L_0x020c:
            r14.c()
        L_0x020f:
            r14.J()
            e0.g r7 = androidx.compose.runtime.Updater.a(r14)
            lp0.p r8 = r6.d()
            androidx.compose.runtime.Updater.c(r7, r2, r8)
            lp0.p r2 = r6.b()
            androidx.compose.runtime.Updater.c(r7, r1, r2)
            lp0.p r1 = r6.c()
            androidx.compose.runtime.Updater.c(r7, r4, r1)
            lp0.p r1 = r6.f()
            androidx.compose.runtime.Updater.c(r7, r5, r1)
            r14.o()
            e0.g r1 = e0.t0.b(r14)
            e0.t0 r1 = e0.t0.a(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r0.invoke(r1, r14, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.E(r0)
            r0 = 2085825549(0x7c532c0d, float:4.3858724E36)
            r14.E(r0)
            r14.P()
            r14.P()
            r14.d()
            r14.P()
            r2 = r16
            r3 = r17
        L_0x0260:
            e0.s0 r7 = r14.v()
            if (r7 != 0) goto L_0x0267
            goto L_0x0278
        L_0x0267:
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9 r8 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
            r0 = r8
            r1 = r27
            r4 = r30
            r5 = r32
            r6 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0278:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt.a(androidx.compose.ui.window.g, lp0.a, androidx.compose.ui.window.h, lp0.p, e0.g, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final p<g, Integer, k> b(d1<? extends p<? super g, ? super Integer, k>> d1Var) {
        return (p) d1Var.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: androidx.compose.ui.window.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(p0.a r23, long r24, lp0.a<bp0.k> r26, androidx.compose.ui.window.h r27, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r28, e0.g r29, int r30, int r31) {
        /*
            r7 = r28
            r8 = r30
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r7, r0)
            r0 = 295309329(0x119a1011, float:2.4306818E-28)
            r1 = r29
            e0.g r9 = r1.t(r0)
            r0 = r31 & 1
            if (r0 == 0) goto L_0x001c
            r1 = r8 | 6
            r2 = r1
            r1 = r23
            goto L_0x0030
        L_0x001c:
            r1 = r8 & 14
            if (r1 != 0) goto L_0x002d
            r1 = r23
            boolean r2 = r9.k(r1)
            if (r2 == 0) goto L_0x002a
            r2 = 4
            goto L_0x002b
        L_0x002a:
            r2 = 2
        L_0x002b:
            r2 = r2 | r8
            goto L_0x0030
        L_0x002d:
            r1 = r23
            r2 = r8
        L_0x0030:
            r3 = r31 & 2
            if (r3 == 0) goto L_0x0037
            r2 = r2 | 48
            goto L_0x004a
        L_0x0037:
            r4 = r8 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004a
            r4 = r24
            boolean r6 = r9.q(r4)
            if (r6 == 0) goto L_0x0046
            r6 = 32
            goto L_0x0048
        L_0x0046:
            r6 = 16
        L_0x0048:
            r2 = r2 | r6
            goto L_0x004c
        L_0x004a:
            r4 = r24
        L_0x004c:
            r6 = r31 & 4
            if (r6 == 0) goto L_0x0053
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r10 = r8 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x0066
            r10 = r26
            boolean r11 = r9.k(r10)
            if (r11 == 0) goto L_0x0062
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r2 = r2 | r11
            goto L_0x0068
        L_0x0066:
            r10 = r26
        L_0x0068:
            r11 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x0081
            r11 = r31 & 8
            if (r11 != 0) goto L_0x007b
            r11 = r27
            boolean r12 = r9.k(r11)
            if (r12 == 0) goto L_0x007d
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007b:
            r11 = r27
        L_0x007d:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r2 = r2 | r12
            goto L_0x0083
        L_0x0081:
            r11 = r27
        L_0x0083:
            r12 = r31 & 16
            if (r12 == 0) goto L_0x008a
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009c
        L_0x008a:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r8
            if (r12 != 0) goto L_0x009c
            boolean r12 = r9.k(r7)
            if (r12 == 0) goto L_0x0099
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r2 = r2 | r12
        L_0x009c:
            r12 = 46811(0xb6db, float:6.5596E-41)
            r12 = r12 & r2
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r12 != r13) goto L_0x00b3
            boolean r12 = r9.b()
            if (r12 != 0) goto L_0x00ab
            goto L_0x00b3
        L_0x00ab:
            r9.h()
            r2 = r4
            r4 = r10
            r5 = r11
            goto L_0x0154
        L_0x00b3:
            r9.H()
            r12 = r8 & 1
            r13 = 0
            if (r12 == 0) goto L_0x00d0
            boolean r12 = r9.i()
            if (r12 == 0) goto L_0x00c2
            goto L_0x00d0
        L_0x00c2:
            r9.h()
            r0 = r31 & 8
            if (r0 == 0) goto L_0x00cb
            r2 = r2 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00cb:
            r14 = r10
            r15 = r11
            r10 = r1
            r11 = r4
            goto L_0x010a
        L_0x00d0:
            if (r0 == 0) goto L_0x00d9
            p0.a$a r0 = p0.a.f16019a
            p0.a r0 = r0.o()
            goto L_0x00da
        L_0x00d9:
            r0 = r1
        L_0x00da:
            if (r3 == 0) goto L_0x00e2
            r1 = 0
            long r3 = d2.m.a(r1, r1)
            goto L_0x00e3
        L_0x00e2:
            r3 = r4
        L_0x00e3:
            if (r6 == 0) goto L_0x00e6
            r10 = r13
        L_0x00e6:
            r1 = r31 & 8
            if (r1 == 0) goto L_0x0106
            androidx.compose.ui.window.h r1 = new androidx.compose.ui.window.h
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 63
            r22 = 0
            r14 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r2 = r2 & -7169(0xffffffffffffe3ff, float:NaN)
            r15 = r1
            r11 = r3
            r14 = r10
            r10 = r0
            goto L_0x010a
        L_0x0106:
            r14 = r10
            r15 = r11
            r10 = r0
            r11 = r3
        L_0x010a:
            r9.A()
            d2.l r0 = d2.l.b(r11)
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r9.E(r1)
            boolean r1 = r9.k(r10)
            boolean r0 = r9.k(r0)
            r0 = r0 | r1
            java.lang.Object r1 = r9.F()
            if (r0 != 0) goto L_0x012e
            e0.g$a r0 = e0.g.f14172a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0136
        L_0x012e:
            androidx.compose.ui.window.a r1 = new androidx.compose.ui.window.a
            r1.<init>(r10, r11, r13)
            r9.y(r1)
        L_0x0136:
            r9.P()
            r0 = r1
            androidx.compose.ui.window.a r0 = (androidx.compose.ui.window.a) r0
            int r1 = r2 >> 3
            r2 = r1 & 112(0x70, float:1.57E-43)
            r3 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r5 = r2 | r1
            r6 = 0
            r1 = r14
            r2 = r15
            r3 = r28
            r4 = r9
            a(r0, r1, r2, r3, r4, r5, r6)
            r1 = r10
            r2 = r11
            r4 = r14
            r5 = r15
        L_0x0154:
            e0.s0 r9 = r9.v()
            if (r9 != 0) goto L_0x015b
            goto L_0x016a
        L_0x015b:
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1 r10 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1
            r0 = r10
            r6 = r28
            r7 = r30
            r8 = r31
            r0.<init>(r1, r2, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x016a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt.c(p0.a, long, lp0.a, androidx.compose.ui.window.h, lp0.p, e0.g, int, int):void");
    }

    public static final boolean f(View view) {
        kotlin.jvm.internal.p.j(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        if (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final n g(Rect rect) {
        return new n(rect.left, rect.top, rect.right, rect.bottom);
    }
}
