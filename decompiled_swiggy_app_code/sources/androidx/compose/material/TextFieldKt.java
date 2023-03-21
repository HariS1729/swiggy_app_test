package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.b;
import d2.e;
import d2.h;
import e0.f;
import e0.g;
import e0.h0;
import e0.s0;
import e0.t0;
import i1.e0;
import i1.t;
import lp0.a;
import lp0.p;
import lp0.q;
import org.apache.pdfbox.pdmodel.interactive.form.PDButton;
import org.apache.pdfbox.pdmodel.interactive.form.PDChoice;
import p0.d;
import p1.c0;

/* compiled from: TextField.kt */
public final class TextFieldKt {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f5618a = h.n((float) 20);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final float f5619b = h.n((float) 10);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final float f5620c = h.n((float) 4);

    /* access modifiers changed from: private */
    public static final void a(p<? super g, ? super Integer, k> pVar, p<? super g, ? super Integer, k> pVar2, q<? super d, ? super g, ? super Integer, k> qVar, p<? super g, ? super Integer, k> pVar3, p<? super g, ? super Integer, k> pVar4, boolean z11, long j, long j11, float f11, g gVar, int i11) {
        int i12;
        g gVar2;
        g gVar3;
        int i13;
        d.a aVar;
        int i14;
        float f12;
        p<? super g, ? super Integer, k> pVar5 = pVar;
        p<? super g, ? super Integer, k> pVar6 = pVar2;
        q<? super d, ? super g, ? super Integer, k> qVar2 = qVar;
        p<? super g, ? super Integer, k> pVar7 = pVar3;
        p<? super g, ? super Integer, k> pVar8 = pVar4;
        boolean z12 = z11;
        float f13 = f11;
        int i15 = i11;
        g t = gVar.t(178502533);
        if ((i15 & 14) == 0) {
            i12 = (t.k(pVar5) ? 4 : 2) | i15;
        } else {
            i12 = i15;
        }
        if ((i15 & 112) == 0) {
            i12 |= t.k(pVar6) ? 32 : 16;
        }
        if ((i15 & 896) == 0) {
            i12 |= t.k(qVar2) ? 256 : 128;
        }
        if ((i15 & 7168) == 0) {
            i12 |= t.k(pVar7) ? 2048 : 1024;
        }
        if ((57344 & i15) == 0) {
            i12 |= t.k(pVar8) ? 16384 : 8192;
        }
        if ((458752 & i15) == 0) {
            i12 |= t.m(z12) ? PDChoice.FLAG_COMBO : PDButton.FLAG_PUSHBUTTON;
        }
        long j12 = j;
        if ((3670016 & i15) == 0) {
            i12 |= t.q(j12) ? 1048576 : 524288;
        }
        long j13 = j11;
        if ((29360128 & i15) == 0) {
            i12 |= t.q(j13) ? 8388608 : 4194304;
        }
        if ((234881024 & i15) == 0) {
            i12 |= t.n(f13) ? 67108864 : PDButton.FLAG_RADIOS_IN_UNISON;
        }
        int i16 = i12;
        if (((191739611 & i16) ^ 38347922) != 0 || !t.b()) {
            Boolean valueOf = Boolean.valueOf(z11);
            Float valueOf2 = Float.valueOf(f11);
            int i17 = i16 >> 21;
            t.E(-3686552);
            boolean k = t.k(valueOf) | t.k(valueOf2);
            Object F = t.F();
            if (k || F == g.f14172a.a()) {
                F = new TextFieldMeasurePolicy(z12, f13);
                t.y(F);
            }
            t.P();
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) F;
            t.E(1376089394);
            d.a aVar2 = d.f16037h0;
            e eVar = (e) t.z(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) t.z(CompositionLocalsKt.j());
            n1 n1Var = (n1) t.z(CompositionLocalsKt.n());
            ComposeUiNode.Companion companion = ComposeUiNode.J;
            a<ComposeUiNode> a11 = companion.a();
            q<t0<ComposeUiNode>, g, Integer, k> b11 = LayoutKt.b(aVar2);
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
            Updater.c(a12, textFieldMeasurePolicy, companion.d());
            Updater.c(a12, eVar, companion.b());
            Updater.c(a12, layoutDirection, companion.c());
            Updater.c(a12, n1Var, companion.f());
            t.o();
            b11.invoke(t0.a(t0.b(t)), t, 0);
            t.E(2058660585);
            t.E(-804089035);
            t.E(-804089035);
            if (pVar7 != null) {
                d N = LayoutIdKt.b(aVar2, "Leading").N(TextFieldImplKt.f());
                p0.a e11 = p0.a.f16019a.e();
                t.E(-1990474327);
                t h11 = BoxKt.h(e11, false, t, 6);
                t.E(1376089394);
                e eVar2 = (e) t.z(CompositionLocalsKt.e());
                LayoutDirection layoutDirection2 = (LayoutDirection) t.z(CompositionLocalsKt.j());
                n1 n1Var2 = (n1) t.z(CompositionLocalsKt.n());
                a<ComposeUiNode> a13 = companion.a();
                q<t0<ComposeUiNode>, g, Integer, k> b12 = LayoutKt.b(N);
                if (!(t.u() instanceof e0.e)) {
                    f.c();
                }
                t.f();
                if (t.s()) {
                    t.K(a13);
                } else {
                    t.c();
                }
                t.J();
                g a14 = Updater.a(t);
                Updater.c(a14, h11, companion.d());
                Updater.c(a14, eVar2, companion.b());
                Updater.c(a14, layoutDirection2, companion.c());
                Updater.c(a14, n1Var2, companion.f());
                t.o();
                b12.invoke(t0.a(t0.b(t)), t, 0);
                t.E(2058660585);
                t.E(-1253629305);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3698a;
                t.E(-447676355);
                i13 = i16;
                aVar = aVar2;
                gVar3 = t;
                TextFieldImplKt.a(j, (c0) null, (Float) null, pVar3, t, ((i16 >> 18) & 14) | (i16 & 7168), 6);
                gVar3.P();
                gVar3.P();
                gVar3.P();
                gVar3.d();
                gVar3.P();
                gVar3.P();
            } else {
                aVar = aVar2;
                i13 = i16;
                gVar3 = t;
            }
            gVar3.P();
            gVar2 = gVar3;
            gVar2.E(-804088631);
            if (pVar8 != null) {
                d N2 = LayoutIdKt.b(aVar, "Trailing").N(TextFieldImplKt.f());
                p0.a e12 = p0.a.f16019a.e();
                gVar2.E(-1990474327);
                t h12 = BoxKt.h(e12, false, gVar2, 6);
                gVar2.E(1376089394);
                e eVar3 = (e) gVar2.z(CompositionLocalsKt.e());
                LayoutDirection layoutDirection3 = (LayoutDirection) gVar2.z(CompositionLocalsKt.j());
                n1 n1Var3 = (n1) gVar2.z(CompositionLocalsKt.n());
                a<ComposeUiNode> a15 = companion.a();
                q<t0<ComposeUiNode>, g, Integer, k> b13 = LayoutKt.b(N2);
                if (!(gVar2.u() instanceof e0.e)) {
                    f.c();
                }
                gVar2.f();
                if (gVar2.s()) {
                    gVar2.K(a15);
                } else {
                    gVar2.c();
                }
                gVar2.J();
                g a16 = Updater.a(gVar2);
                Updater.c(a16, h12, companion.d());
                Updater.c(a16, eVar3, companion.b());
                Updater.c(a16, layoutDirection3, companion.c());
                Updater.c(a16, n1Var3, companion.f());
                gVar2.o();
                b13.invoke(t0.a(t0.b(gVar2)), gVar2, 0);
                gVar2.E(2058660585);
                gVar2.E(-1253629305);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f3698a;
                gVar2.E(-447675949);
                i14 = -1253629305;
                TextFieldImplKt.a(j11, (c0) null, (Float) null, pVar4, gVar2, (i17 & 14) | ((i13 >> 3) & 7168), 6);
                gVar2.P();
                gVar2.P();
                gVar2.P();
                gVar2.d();
                gVar2.P();
                gVar2.P();
            } else {
                i14 = -1253629305;
            }
            gVar2.P();
            float n = h.n(TextFieldImplKt.h() - TextFieldImplKt.e());
            if (pVar7 != null) {
                f12 = n;
            } else {
                f12 = TextFieldImplKt.h();
            }
            if (pVar8 == null) {
                n = TextFieldImplKt.h();
            }
            d m11 = PaddingKt.m(aVar, f12, 0.0f, n, 0.0f, 10, (Object) null);
            gVar2.E(-804087929);
            if (qVar2 != null) {
                qVar2.invoke(LayoutIdKt.b(aVar, "Hint").N(m11), gVar2, Integer.valueOf((i13 >> 3) & 112));
            }
            gVar2.P();
            gVar2.E(-804087800);
            if (pVar6 != null) {
                d N3 = LayoutIdKt.b(aVar, "Label").N(m11);
                gVar2.E(-1990474327);
                t h13 = BoxKt.h(p0.a.f16019a.o(), false, gVar2, 0);
                gVar2.E(1376089394);
                e eVar4 = (e) gVar2.z(CompositionLocalsKt.e());
                LayoutDirection layoutDirection4 = (LayoutDirection) gVar2.z(CompositionLocalsKt.j());
                n1 n1Var4 = (n1) gVar2.z(CompositionLocalsKt.n());
                a<ComposeUiNode> a17 = companion.a();
                q<t0<ComposeUiNode>, g, Integer, k> b14 = LayoutKt.b(N3);
                if (!(gVar2.u() instanceof e0.e)) {
                    f.c();
                }
                gVar2.f();
                if (gVar2.s()) {
                    gVar2.K(a17);
                } else {
                    gVar2.c();
                }
                gVar2.J();
                g a18 = Updater.a(gVar2);
                Updater.c(a18, h13, companion.d());
                Updater.c(a18, eVar4, companion.b());
                Updater.c(a18, layoutDirection4, companion.c());
                Updater.c(a18, n1Var4, companion.f());
                gVar2.o();
                b14.invoke(t0.a(t0.b(gVar2)), gVar2, 0);
                gVar2.E(2058660585);
                gVar2.E(i14);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.f3698a;
                gVar2.E(-447675266);
                pVar6.invoke(gVar2, Integer.valueOf((i13 >> 3) & 14));
                gVar2.P();
                gVar2.P();
                gVar2.P();
                gVar2.d();
                gVar2.P();
                gVar2.P();
            }
            gVar2.P();
            d N4 = LayoutIdKt.b(aVar, "TextField").N(m11);
            gVar2.E(-1990474327);
            t h14 = BoxKt.h(p0.a.f16019a.o(), true, gVar2, 48);
            gVar2.E(1376089394);
            e eVar5 = (e) gVar2.z(CompositionLocalsKt.e());
            LayoutDirection layoutDirection5 = (LayoutDirection) gVar2.z(CompositionLocalsKt.j());
            n1 n1Var5 = (n1) gVar2.z(CompositionLocalsKt.n());
            a<ComposeUiNode> a19 = companion.a();
            q<t0<ComposeUiNode>, g, Integer, k> b15 = LayoutKt.b(N4);
            if (!(gVar2.u() instanceof e0.e)) {
                f.c();
            }
            gVar2.f();
            if (gVar2.s()) {
                gVar2.K(a19);
            } else {
                gVar2.c();
            }
            gVar2.J();
            g a21 = Updater.a(gVar2);
            Updater.c(a21, h14, companion.d());
            Updater.c(a21, eVar5, companion.b());
            Updater.c(a21, layoutDirection5, companion.c());
            Updater.c(a21, n1Var5, companion.f());
            gVar2.o();
            b15.invoke(t0.a(t0.b(gVar2)), gVar2, 0);
            gVar2.E(2058660585);
            gVar2.E(i14);
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.f3698a;
            gVar2.E(-447675072);
            pVar5.invoke(gVar2, Integer.valueOf(i13 & 14));
            gVar2.P();
            gVar2.P();
            gVar2.P();
            gVar2.d();
            gVar2.P();
            gVar2.P();
            gVar2.P();
            gVar2.P();
            gVar2.d();
            gVar2.P();
        } else {
            t.h();
            gVar2 = t;
        }
        s0 v = gVar2.v();
        if (v != null) {
            v.a(new TextFieldKt$IconsWithTextFieldLayout$2(pVar, pVar2, qVar, pVar3, pVar4, z11, j, j11, f11, i11));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01ac, code lost:
        if (r10.k(r87) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x051f  */
    /* JADX WARNING: Removed duplicated region for block: B:287:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.ui.text.input.TextFieldValue r74, lp0.l<? super androidx.compose.ui.text.input.TextFieldValue, bp0.k> r75, p0.d r76, boolean r77, boolean r78, p1.c0 r79, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r80, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r81, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r82, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r83, boolean r84, v1.f0 r85, a0.i r86, a0.g r87, boolean r88, int r89, u.k r90, u0.j1 r91, c0.c0 r92, e0.g r93, int r94, int r95, int r96) {
        /*
            r15 = r74
            r14 = r75
            r13 = r94
            r12 = r95
            r11 = r96
            java.lang.String r0 = "value"
            kotlin.jvm.internal.p.j(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.p.j(r14, r0)
            r0 = -833022333(0xffffffffce591683, float:-9.105328E8)
            r1 = r93
            e0.g r10 = r1.t(r0)
            r0 = r11 & 1
            if (r0 == 0) goto L_0x0024
            r0 = r13 | 6
            goto L_0x0034
        L_0x0024:
            r0 = r13 & 14
            if (r0 != 0) goto L_0x0033
            boolean r0 = r10.k(r15)
            if (r0 == 0) goto L_0x0030
            r0 = 4
            goto L_0x0031
        L_0x0030:
            r0 = 2
        L_0x0031:
            r0 = r0 | r13
            goto L_0x0034
        L_0x0033:
            r0 = r13
        L_0x0034:
            r3 = r11 & 2
            if (r3 == 0) goto L_0x003b
            r0 = r0 | 48
            goto L_0x004b
        L_0x003b:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004b
            boolean r3 = r10.k(r14)
            if (r3 == 0) goto L_0x0048
            r3 = 32
            goto L_0x004a
        L_0x0048:
            r3 = 16
        L_0x004a:
            r0 = r0 | r3
        L_0x004b:
            r3 = r11 & 4
            if (r3 == 0) goto L_0x0052
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0052:
            r8 = r13 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0065
            r8 = r76
            boolean r9 = r10.k(r8)
            if (r9 == 0) goto L_0x0061
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r0 = r0 | r9
            goto L_0x0067
        L_0x0065:
            r8 = r76
        L_0x0067:
            r9 = r11 & 8
            r16 = 2048(0x800, float:2.87E-42)
            r17 = 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0072
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0072:
            r1 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0086
            r1 = r77
            boolean r18 = r10.m(r1)
            if (r18 == 0) goto L_0x0081
            r18 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x0081:
            r18 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r0 = r0 | r18
            goto L_0x0088
        L_0x0086:
            r1 = r77
        L_0x0088:
            r18 = r11 & 16
            r64 = 57344(0xe000, float:8.0356E-41)
            r19 = 8192(0x2000, float:1.14794E-41)
            if (r18 == 0) goto L_0x0096
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r2 = r78
            goto L_0x00a9
        L_0x0096:
            r20 = r13 & r64
            r2 = r78
            if (r20 != 0) goto L_0x00a9
            boolean r21 = r10.m(r2)
            if (r21 == 0) goto L_0x00a5
            r21 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a7
        L_0x00a5:
            r21 = 8192(0x2000, float:1.14794E-41)
        L_0x00a7:
            r0 = r0 | r21
        L_0x00a9:
            r65 = 458752(0x70000, float:6.42848E-40)
            r21 = r13 & r65
            r22 = 131072(0x20000, float:1.83671E-40)
            if (r21 != 0) goto L_0x00c5
            r21 = r11 & 32
            r4 = r79
            if (r21 != 0) goto L_0x00c0
            boolean r23 = r10.k(r4)
            if (r23 == 0) goto L_0x00c0
            r23 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c2
        L_0x00c0:
            r23 = 65536(0x10000, float:9.18355E-41)
        L_0x00c2:
            r0 = r0 | r23
            goto L_0x00c7
        L_0x00c5:
            r4 = r79
        L_0x00c7:
            r23 = r11 & 64
            r66 = 3670016(0x380000, float:5.142788E-39)
            if (r23 == 0) goto L_0x00d4
            r24 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r24
            r5 = r80
            goto L_0x00e7
        L_0x00d4:
            r24 = r13 & r66
            r5 = r80
            if (r24 != 0) goto L_0x00e7
            boolean r25 = r10.k(r5)
            if (r25 == 0) goto L_0x00e3
            r25 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e5
        L_0x00e3:
            r25 = 524288(0x80000, float:7.34684E-40)
        L_0x00e5:
            r0 = r0 | r25
        L_0x00e7:
            r6 = r11 & 128(0x80, float:1.794E-43)
            r67 = 29360128(0x1c00000, float:7.052966E-38)
            if (r6 == 0) goto L_0x00f4
            r26 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r26
            r7 = r81
            goto L_0x0107
        L_0x00f4:
            r26 = r13 & r67
            r7 = r81
            if (r26 != 0) goto L_0x0107
            boolean r27 = r10.k(r7)
            if (r27 == 0) goto L_0x0103
            r27 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0105
        L_0x0103:
            r27 = 4194304(0x400000, float:5.877472E-39)
        L_0x0105:
            r0 = r0 | r27
        L_0x0107:
            r1 = r11 & 256(0x100, float:3.59E-43)
            r68 = 234881024(0xe000000, float:1.5777218E-30)
            if (r1 == 0) goto L_0x0114
            r27 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r27
            r2 = r82
            goto L_0x0127
        L_0x0114:
            r27 = r13 & r68
            r2 = r82
            if (r27 != 0) goto L_0x0127
            boolean r27 = r10.k(r2)
            if (r27 == 0) goto L_0x0123
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0125
        L_0x0123:
            r27 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0125:
            r0 = r0 | r27
        L_0x0127:
            r2 = r11 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0132
            r27 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r27
            r4 = r83
            goto L_0x0147
        L_0x0132:
            r27 = 1879048192(0x70000000, float:1.58456325E29)
            r27 = r13 & r27
            r4 = r83
            if (r27 != 0) goto L_0x0147
            boolean r27 = r10.k(r4)
            if (r27 == 0) goto L_0x0143
            r27 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0145
        L_0x0143:
            r27 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0145:
            r0 = r0 | r27
        L_0x0147:
            r4 = r11 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0150
            r20 = r12 | 6
            r5 = r84
            goto L_0x0166
        L_0x0150:
            r27 = r12 & 14
            r5 = r84
            if (r27 != 0) goto L_0x0164
            boolean r27 = r10.m(r5)
            if (r27 == 0) goto L_0x015f
            r20 = 4
            goto L_0x0161
        L_0x015f:
            r20 = 2
        L_0x0161:
            r20 = r12 | r20
            goto L_0x0166
        L_0x0164:
            r20 = r12
        L_0x0166:
            r5 = r11 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x016f
            r20 = r20 | 48
            r7 = r85
            goto L_0x0182
        L_0x016f:
            r27 = r12 & 112(0x70, float:1.57E-43)
            r7 = r85
            if (r27 != 0) goto L_0x0182
            boolean r27 = r10.k(r7)
            if (r27 == 0) goto L_0x017e
            r21 = 32
            goto L_0x0180
        L_0x017e:
            r21 = 16
        L_0x0180:
            r20 = r20 | r21
        L_0x0182:
            r7 = r12 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x019c
            r7 = r11 & 4096(0x1000, float:5.74E-42)
            if (r7 != 0) goto L_0x0195
            r7 = r86
            boolean r21 = r10.k(r7)
            if (r21 == 0) goto L_0x0197
            r25 = 256(0x100, float:3.59E-43)
            goto L_0x0199
        L_0x0195:
            r7 = r86
        L_0x0197:
            r25 = 128(0x80, float:1.794E-43)
        L_0x0199:
            r20 = r20 | r25
            goto L_0x019e
        L_0x019c:
            r7 = r86
        L_0x019e:
            r7 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x01b6
            r7 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r7 != 0) goto L_0x01af
            r7 = r87
            boolean r21 = r10.k(r7)
            if (r21 == 0) goto L_0x01b1
            goto L_0x01b3
        L_0x01af:
            r7 = r87
        L_0x01b1:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x01b3:
            r20 = r20 | r16
            goto L_0x01b8
        L_0x01b6:
            r7 = r87
        L_0x01b8:
            r7 = r20
            r8 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r8 == 0) goto L_0x01c3
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            r14 = r88
            goto L_0x01d3
        L_0x01c3:
            r16 = r12 & r64
            r14 = r88
            if (r16 != 0) goto L_0x01d3
            boolean r16 = r10.m(r14)
            if (r16 == 0) goto L_0x01d1
            r19 = 16384(0x4000, float:2.2959E-41)
        L_0x01d1:
            r7 = r7 | r19
        L_0x01d3:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r11 & r16
            if (r16 == 0) goto L_0x01e1
            r17 = 196608(0x30000, float:2.75506E-40)
            r7 = r7 | r17
            r14 = r89
            goto L_0x01f4
        L_0x01e1:
            r17 = r12 & r65
            r14 = r89
            if (r17 != 0) goto L_0x01f4
            boolean r17 = r10.p(r14)
            if (r17 == 0) goto L_0x01f0
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01f2
        L_0x01f0:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x01f2:
            r7 = r7 | r17
        L_0x01f4:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r11 & r17
            if (r17 == 0) goto L_0x0201
            r19 = 1572864(0x180000, float:2.204052E-39)
            r7 = r7 | r19
            r14 = r90
            goto L_0x0214
        L_0x0201:
            r19 = r12 & r66
            r14 = r90
            if (r19 != 0) goto L_0x0214
            boolean r19 = r10.k(r14)
            if (r19 == 0) goto L_0x0210
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0212
        L_0x0210:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x0212:
            r7 = r7 | r19
        L_0x0214:
            r19 = r12 & r67
            if (r19 != 0) goto L_0x022c
            r19 = r11 & r22
            r14 = r91
            if (r19 != 0) goto L_0x0227
            boolean r19 = r10.k(r14)
            if (r19 == 0) goto L_0x0227
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0229
        L_0x0227:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x0229:
            r7 = r7 | r19
            goto L_0x022e
        L_0x022c:
            r14 = r91
        L_0x022e:
            r19 = r12 & r68
            if (r19 != 0) goto L_0x0248
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r11 & r19
            r12 = r92
            if (r19 != 0) goto L_0x0243
            boolean r19 = r10.k(r12)
            if (r19 == 0) goto L_0x0243
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0245
        L_0x0243:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0245:
            r7 = r7 | r19
            goto L_0x024a
        L_0x0248:
            r12 = r92
        L_0x024a:
            r19 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r19 = r0 & r19
            r20 = 306783378(0x12492492, float:6.3469493E-28)
            r19 = r19 ^ r20
            if (r19 != 0) goto L_0x0292
            r19 = 191739611(0xb6db6db, float:4.5782105E-32)
            r19 = r7 & r19
            r20 = 38347922(0x2492492, float:1.4777643E-37)
            r19 = r19 ^ r20
            if (r19 != 0) goto L_0x0292
            boolean r19 = r10.b()
            if (r19 != 0) goto L_0x0269
            goto L_0x0292
        L_0x0269:
            r10.h()
            r3 = r76
            r4 = r77
            r5 = r78
            r6 = r79
            r7 = r80
            r8 = r81
            r9 = r82
            r11 = r84
            r13 = r86
            r15 = r88
            r16 = r89
            r17 = r90
            r38 = r10
            r19 = r12
            r18 = r14
            r10 = r83
            r12 = r85
            r14 = r87
            goto L_0x0518
        L_0x0292:
            r10.H()
            r19 = r13 & 1
            if (r19 == 0) goto L_0x02ed
            boolean r19 = r10.i()
            if (r19 == 0) goto L_0x02a0
            goto L_0x02ed
        L_0x02a0:
            r10.h()
            r1 = r11 & 32
            if (r1 == 0) goto L_0x02ab
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r1
        L_0x02ab:
            r1 = r11 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x02b1
            r7 = r7 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x02b1:
            r1 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x02b7
            r7 = r7 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x02b7:
            r1 = r11 & r22
            if (r1 == 0) goto L_0x02bf
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r7 = r7 & r1
        L_0x02bf:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r11
            if (r1 == 0) goto L_0x02c8
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r7 = r7 & r1
        L_0x02c8:
            r24 = r76
            r25 = r77
            r69 = r78
            r26 = r79
            r70 = r80
            r27 = r81
            r28 = r82
            r29 = r83
            r30 = r84
            r31 = r85
            r32 = r86
            r33 = r87
            r34 = r88
            r71 = r89
            r35 = r90
            r37 = r92
            r1 = r0
        L_0x02e9:
            r36 = r14
            goto L_0x047c
        L_0x02ed:
            if (r3 == 0) goto L_0x02f2
            p0.d$a r3 = p0.d.f16037h0
            goto L_0x02f4
        L_0x02f2:
            r3 = r76
        L_0x02f4:
            if (r9 == 0) goto L_0x02f8
            r9 = 1
            goto L_0x02fa
        L_0x02f8:
            r9 = r77
        L_0x02fa:
            if (r18 == 0) goto L_0x0301
            r18 = 0
            r69 = 0
            goto L_0x0303
        L_0x0301:
            r69 = r78
        L_0x0303:
            r18 = r11 & 32
            if (r18 == 0) goto L_0x0317
            e0.m0 r12 = androidx.compose.material.TextKt.d()
            java.lang.Object r12 = r10.z(r12)
            p1.c0 r12 = (p1.c0) r12
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r18
            goto L_0x0319
        L_0x0317:
            r12 = r79
        L_0x0319:
            r18 = 0
            if (r23 == 0) goto L_0x0320
            r70 = r18
            goto L_0x0322
        L_0x0320:
            r70 = r80
        L_0x0322:
            if (r6 == 0) goto L_0x0327
            r6 = r18
            goto L_0x0329
        L_0x0327:
            r6 = r81
        L_0x0329:
            if (r1 == 0) goto L_0x032e
            r1 = r18
            goto L_0x0330
        L_0x032e:
            r1 = r82
        L_0x0330:
            if (r2 == 0) goto L_0x0335
            r2 = r18
            goto L_0x0337
        L_0x0335:
            r2 = r83
        L_0x0337:
            if (r4 == 0) goto L_0x033b
            r4 = 0
            goto L_0x033d
        L_0x033b:
            r4 = r84
        L_0x033d:
            if (r5 == 0) goto L_0x0346
            v1.f0$a r5 = v1.f0.f17091a
            v1.f0 r5 = r5.c()
            goto L_0x0348
        L_0x0346:
            r5 = r85
        L_0x0348:
            r76 = r0
            r0 = r11 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0357
            a0.i$a r0 = a0.i.f832e
            a0.i r0 = r0.a()
            r7 = r7 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0359
        L_0x0357:
            r0 = r86
        L_0x0359:
            r77 = r0
            r0 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0389
            a0.g r0 = new a0.g
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 63
            r26 = 0
            r78 = r0
            r79 = r18
            r80 = r19
            r81 = r20
            r82 = r21
            r83 = r23
            r84 = r24
            r85 = r25
            r86 = r26
            r78.<init>(r79, r80, r81, r82, r83, r84, r85, r86)
            r7 = r7 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x038b
        L_0x0389:
            r0 = r87
        L_0x038b:
            if (r8 == 0) goto L_0x038f
            r8 = 0
            goto L_0x0391
        L_0x038f:
            r8 = r88
        L_0x0391:
            if (r16 == 0) goto L_0x039a
            r16 = 2147483647(0x7fffffff, float:NaN)
            r71 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x039c
        L_0x039a:
            r71 = r89
        L_0x039c:
            r78 = r0
            if (r17 == 0) goto L_0x03c1
            r0 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r10.E(r0)
            java.lang.Object r0 = r10.F()
            e0.g$a r16 = e0.g.f14172a
            r79 = r1
            java.lang.Object r1 = r16.a()
            if (r0 != r1) goto L_0x03bb
            u.k r0 = u.j.a()
            r10.y(r0)
        L_0x03bb:
            r10.P()
            u.k r0 = (u.k) r0
            goto L_0x03c5
        L_0x03c1:
            r79 = r1
            r0 = r90
        L_0x03c5:
            r1 = r11 & r22
            if (r1 == 0) goto L_0x03fa
            c0.q r1 = c0.q.f12737a
            r14 = 6
            c0.u r1 = r1.b(r10, r14)
            z.a r1 = r1.c()
            r14 = 0
            r16 = 0
            z.b r17 = z.c.c()
            z.b r18 = z.c.c()
            r19 = 3
            r20 = 0
            r80 = r1
            r81 = r14
            r82 = r16
            r83 = r17
            r84 = r18
            r85 = r19
            r86 = r20
            z.a r1 = z.a.d(r80, r81, r82, r83, r84, r85, r86)
            r14 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r7 = r7 & r14
            r14 = r1
        L_0x03fa:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r11
            if (r1 == 0) goto L_0x045e
            c0.e0 r16 = c0.e0.f12691a
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r41 = 0
            r43 = 0
            r45 = 0
            r47 = 0
            r49 = 0
            r51 = 0
            r53 = 0
            r55 = 0
            r57 = 0
            r60 = 0
            r61 = 0
            r62 = 48
            r63 = 2097151(0x1fffff, float:2.938734E-39)
            r59 = r10
            c0.c0 r1 = r16.d(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r60, r61, r62, r63)
            r16 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r7 = r7 & r16
            r32 = r77
            r33 = r78
            r28 = r79
            r35 = r0
            r37 = r1
            r29 = r2
            r24 = r3
            r30 = r4
            r31 = r5
            r27 = r6
            r34 = r8
            r25 = r9
            r26 = r12
            r36 = r14
            r1 = r76
            goto L_0x047c
        L_0x045e:
            r1 = r76
            r32 = r77
            r33 = r78
            r28 = r79
            r37 = r92
            r35 = r0
            r29 = r2
            r24 = r3
            r30 = r4
            r31 = r5
            r27 = r6
            r34 = r8
            r25 = r9
            r26 = r12
            goto L_0x02e9
        L_0x047c:
            r10.A()
            androidx.compose.material.TextFieldType r0 = androidx.compose.material.TextFieldType.Filled
            int r2 = r1 >> 6
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 6
            r3 = r3 | r4
            r2 = r2 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            int r3 = r1 << 9
            r4 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r4
            r4 = r3 & r64
            r2 = r2 | r4
            r3 = r3 & r65
            r2 = r2 | r3
            int r3 = r7 << 6
            r4 = r3 & r66
            r2 = r2 | r4
            int r4 = r1 << 6
            r5 = r4 & r67
            r2 = r2 | r5
            r5 = r4 & r68
            r2 = r2 | r5
            r5 = 1879048192(0x70000000, float:1.58456325E29)
            r4 = r4 & r5
            r21 = r2 | r4
            int r1 = r1 >> 24
            r2 = r1 & 14
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r2 = r3 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r3 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = r3 & r64
            r1 = r1 | r2
            int r2 = a0.g.f824h
            int r2 = r2 << 15
            r1 = r1 | r2
            r2 = r3 & r65
            r1 = r1 | r2
            int r2 = r7 << 3
            r3 = r2 & r66
            r1 = r1 | r3
            r3 = r2 & r67
            r1 = r1 | r3
            r3 = r2 & r68
            r1 = r1 | r3
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r3
            r22 = r1 | r2
            r23 = 0
            r1 = r25
            r2 = r69
            r3 = r74
            r4 = r75
            r5 = r24
            r6 = r34
            r7 = r26
            r8 = r70
            r9 = r27
            r38 = r10
            r10 = r28
            r11 = r29
            r12 = r30
            r13 = r31
            r14 = r32
            r15 = r33
            r16 = r71
            r17 = r35
            r18 = r36
            r19 = r37
            r20 = r38
            androidx.compose.material.TextFieldImplKt.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r3 = r24
            r4 = r25
            r6 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
            r14 = r33
            r15 = r34
            r5 = r69
            r7 = r70
        L_0x0518:
            e0.s0 r2 = r38.v()
            if (r2 != 0) goto L_0x051f
            goto L_0x053a
        L_0x051f:
            androidx.compose.material.TextFieldKt$TextField$5 r1 = new androidx.compose.material.TextFieldKt$TextField$5
            r0 = r1
            r72 = r1
            r1 = r74
            r73 = r2
            r2 = r75
            r20 = r94
            r21 = r95
            r22 = r96
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r1 = r72
            r0 = r73
            r0.a(r1)
        L_0x053a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.b(androidx.compose.ui.text.input.TextFieldValue, lp0.l, p0.d, boolean, boolean, p1.c0, lp0.p, lp0.p, lp0.p, lp0.p, boolean, v1.f0, a0.i, a0.g, boolean, int, u.k, u0.j1, c0.c0, e0.g, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: lp0.l} */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01ac, code lost:
        if (r0.k(r86) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0576  */
    /* JADX WARNING: Removed duplicated region for block: B:296:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(java.lang.String r73, lp0.l<? super java.lang.String, bp0.k> r74, p0.d r75, boolean r76, boolean r77, p1.c0 r78, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r79, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r80, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r81, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r82, boolean r83, v1.f0 r84, a0.i r85, a0.g r86, boolean r87, int r88, u.k r89, u0.j1 r90, c0.c0 r91, e0.g r92, int r93, int r94, int r95) {
        /*
            r1 = r73
            r2 = r74
            r15 = r93
            r14 = r94
            r13 = r95
            java.lang.String r0 = "value"
            kotlin.jvm.internal.p.j(r1, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.p.j(r2, r0)
            r0 = -833028745(0xffffffffce58fd77, float:-9.1012243E8)
            r3 = r92
            e0.g r0 = r3.t(r0)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x0024
            r3 = r15 | 6
            goto L_0x0034
        L_0x0024:
            r3 = r15 & 14
            if (r3 != 0) goto L_0x0033
            boolean r3 = r0.k(r1)
            if (r3 == 0) goto L_0x0030
            r3 = 4
            goto L_0x0031
        L_0x0030:
            r3 = 2
        L_0x0031:
            r3 = r3 | r15
            goto L_0x0034
        L_0x0033:
            r3 = r15
        L_0x0034:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x003b
            r3 = r3 | 48
            goto L_0x004b
        L_0x003b:
            r6 = r15 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x004b
            boolean r6 = r0.k(r2)
            if (r6 == 0) goto L_0x0048
            r6 = 32
            goto L_0x004a
        L_0x0048:
            r6 = 16
        L_0x004a:
            r3 = r3 | r6
        L_0x004b:
            r6 = r13 & 4
            if (r6 == 0) goto L_0x0052
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0052:
            r11 = r15 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x0065
            r11 = r75
            boolean r12 = r0.k(r11)
            if (r12 == 0) goto L_0x0061
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r3 = r3 | r12
            goto L_0x0067
        L_0x0065:
            r11 = r75
        L_0x0067:
            r12 = r13 & 8
            r16 = 2048(0x800, float:2.87E-42)
            r17 = 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0072
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0072:
            r4 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0086
            r4 = r76
            boolean r18 = r0.m(r4)
            if (r18 == 0) goto L_0x0081
            r18 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x0081:
            r18 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r3 = r3 | r18
            goto L_0x0088
        L_0x0086:
            r4 = r76
        L_0x0088:
            r18 = r13 & 16
            r64 = 57344(0xe000, float:8.0356E-41)
            r19 = 8192(0x2000, float:1.14794E-41)
            if (r18 == 0) goto L_0x0096
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r7 = r77
            goto L_0x00a9
        L_0x0096:
            r20 = r15 & r64
            r7 = r77
            if (r20 != 0) goto L_0x00a9
            boolean r21 = r0.m(r7)
            if (r21 == 0) goto L_0x00a5
            r21 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a7
        L_0x00a5:
            r21 = 8192(0x2000, float:1.14794E-41)
        L_0x00a7:
            r3 = r3 | r21
        L_0x00a9:
            r65 = 458752(0x70000, float:6.42848E-40)
            r21 = r15 & r65
            r22 = 131072(0x20000, float:1.83671E-40)
            if (r21 != 0) goto L_0x00c5
            r21 = r13 & 32
            r8 = r78
            if (r21 != 0) goto L_0x00c0
            boolean r23 = r0.k(r8)
            if (r23 == 0) goto L_0x00c0
            r23 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c2
        L_0x00c0:
            r23 = 65536(0x10000, float:9.18355E-41)
        L_0x00c2:
            r3 = r3 | r23
            goto L_0x00c7
        L_0x00c5:
            r8 = r78
        L_0x00c7:
            r23 = r13 & 64
            r66 = 3670016(0x380000, float:5.142788E-39)
            if (r23 == 0) goto L_0x00d4
            r24 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r24
            r9 = r79
            goto L_0x00e7
        L_0x00d4:
            r24 = r15 & r66
            r9 = r79
            if (r24 != 0) goto L_0x00e7
            boolean r25 = r0.k(r9)
            if (r25 == 0) goto L_0x00e3
            r25 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e5
        L_0x00e3:
            r25 = 524288(0x80000, float:7.34684E-40)
        L_0x00e5:
            r3 = r3 | r25
        L_0x00e7:
            r10 = r13 & 128(0x80, float:1.794E-43)
            r67 = 29360128(0x1c00000, float:7.052966E-38)
            if (r10 == 0) goto L_0x00f4
            r26 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r26
            r5 = r80
            goto L_0x0107
        L_0x00f4:
            r26 = r15 & r67
            r5 = r80
            if (r26 != 0) goto L_0x0107
            boolean r26 = r0.k(r5)
            if (r26 == 0) goto L_0x0103
            r26 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0105
        L_0x0103:
            r26 = 4194304(0x400000, float:5.877472E-39)
        L_0x0105:
            r3 = r3 | r26
        L_0x0107:
            r4 = r13 & 256(0x100, float:3.59E-43)
            r68 = 234881024(0xe000000, float:1.5777218E-30)
            if (r4 == 0) goto L_0x0114
            r26 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r26
            r5 = r81
            goto L_0x0127
        L_0x0114:
            r26 = r15 & r68
            r5 = r81
            if (r26 != 0) goto L_0x0127
            boolean r26 = r0.k(r5)
            if (r26 == 0) goto L_0x0123
            r26 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0125
        L_0x0123:
            r26 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0125:
            r3 = r3 | r26
        L_0x0127:
            r5 = r13 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x0132
            r26 = 805306368(0x30000000, float:4.656613E-10)
            r3 = r3 | r26
            r7 = r82
            goto L_0x0147
        L_0x0132:
            r26 = 1879048192(0x70000000, float:1.58456325E29)
            r26 = r15 & r26
            r7 = r82
            if (r26 != 0) goto L_0x0147
            boolean r26 = r0.k(r7)
            if (r26 == 0) goto L_0x0143
            r26 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0145
        L_0x0143:
            r26 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0145:
            r3 = r3 | r26
        L_0x0147:
            r7 = r13 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L_0x0150
            r26 = r14 | 6
            r8 = r83
            goto L_0x0166
        L_0x0150:
            r26 = r14 & 14
            r8 = r83
            if (r26 != 0) goto L_0x0164
            boolean r26 = r0.m(r8)
            if (r26 == 0) goto L_0x015f
            r26 = 4
            goto L_0x0161
        L_0x015f:
            r26 = 2
        L_0x0161:
            r26 = r14 | r26
            goto L_0x0166
        L_0x0164:
            r26 = r14
        L_0x0166:
            r8 = r13 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x016f
            r26 = r26 | 48
            r9 = r84
            goto L_0x0182
        L_0x016f:
            r27 = r14 & 112(0x70, float:1.57E-43)
            r9 = r84
            if (r27 != 0) goto L_0x0182
            boolean r27 = r0.k(r9)
            if (r27 == 0) goto L_0x017e
            r20 = 32
            goto L_0x0180
        L_0x017e:
            r20 = 16
        L_0x0180:
            r26 = r26 | r20
        L_0x0182:
            r9 = r14 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x019c
            r9 = r13 & 4096(0x1000, float:5.74E-42)
            if (r9 != 0) goto L_0x0195
            r9 = r85
            boolean r20 = r0.k(r9)
            if (r20 == 0) goto L_0x0197
            r25 = 256(0x100, float:3.59E-43)
            goto L_0x0199
        L_0x0195:
            r9 = r85
        L_0x0197:
            r25 = 128(0x80, float:1.794E-43)
        L_0x0199:
            r26 = r26 | r25
            goto L_0x019e
        L_0x019c:
            r9 = r85
        L_0x019e:
            r9 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x01b6
            r9 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r9 != 0) goto L_0x01af
            r9 = r86
            boolean r20 = r0.k(r9)
            if (r20 == 0) goto L_0x01b1
            goto L_0x01b3
        L_0x01af:
            r9 = r86
        L_0x01b1:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x01b3:
            r26 = r26 | r16
            goto L_0x01b8
        L_0x01b6:
            r9 = r86
        L_0x01b8:
            r9 = r26
            r11 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01c3
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
            r2 = r87
            goto L_0x01d3
        L_0x01c3:
            r16 = r14 & r64
            r2 = r87
            if (r16 != 0) goto L_0x01d3
            boolean r16 = r0.m(r2)
            if (r16 == 0) goto L_0x01d1
            r19 = 16384(0x4000, float:2.2959E-41)
        L_0x01d1:
            r9 = r9 | r19
        L_0x01d3:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r13 & r16
            if (r16 == 0) goto L_0x01e1
            r17 = 196608(0x30000, float:2.75506E-40)
            r9 = r9 | r17
            r2 = r88
            goto L_0x01f4
        L_0x01e1:
            r17 = r14 & r65
            r2 = r88
            if (r17 != 0) goto L_0x01f4
            boolean r17 = r0.p(r2)
            if (r17 == 0) goto L_0x01f0
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01f2
        L_0x01f0:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x01f2:
            r9 = r9 | r17
        L_0x01f4:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r13 & r17
            if (r17 == 0) goto L_0x0201
            r19 = 1572864(0x180000, float:2.204052E-39)
            r9 = r9 | r19
            r2 = r89
            goto L_0x0214
        L_0x0201:
            r19 = r14 & r66
            r2 = r89
            if (r19 != 0) goto L_0x0214
            boolean r19 = r0.k(r2)
            if (r19 == 0) goto L_0x0210
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0212
        L_0x0210:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x0212:
            r9 = r9 | r19
        L_0x0214:
            r19 = r14 & r67
            if (r19 != 0) goto L_0x022c
            r19 = r13 & r22
            r2 = r90
            if (r19 != 0) goto L_0x0227
            boolean r19 = r0.k(r2)
            if (r19 == 0) goto L_0x0227
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0229
        L_0x0227:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x0229:
            r9 = r9 | r19
            goto L_0x022e
        L_0x022c:
            r2 = r90
        L_0x022e:
            r19 = r14 & r68
            if (r19 != 0) goto L_0x0248
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r13 & r19
            r2 = r91
            if (r19 != 0) goto L_0x0243
            boolean r19 = r0.k(r2)
            if (r19 == 0) goto L_0x0243
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0245
        L_0x0243:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0245:
            r9 = r9 | r19
            goto L_0x024a
        L_0x0248:
            r2 = r91
        L_0x024a:
            r19 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r19 = r3 & r19
            r20 = 306783378(0x12492492, float:6.3469493E-28)
            r19 = r19 ^ r20
            if (r19 != 0) goto L_0x0292
            r19 = 191739611(0xb6db6db, float:4.5782105E-32)
            r19 = r9 & r19
            r20 = 38347922(0x2492492, float:1.4777643E-37)
            r19 = r19 ^ r20
            if (r19 != 0) goto L_0x0292
            boolean r19 = r0.b()
            if (r19 != 0) goto L_0x0269
            goto L_0x0292
        L_0x0269:
            r0.h()
            r3 = r74
            r6 = r75
            r4 = r76
            r5 = r77
            r7 = r78
            r70 = r79
            r8 = r80
            r9 = r81
            r10 = r82
            r11 = r83
            r12 = r84
            r13 = r85
            r14 = r86
            r15 = r87
            r16 = r88
            r17 = r89
            r18 = r90
            r19 = r2
            goto L_0x056f
        L_0x0292:
            r0.H()
            r19 = r15 & 1
            if (r19 == 0) goto L_0x02ee
            boolean r19 = r0.i()
            if (r19 == 0) goto L_0x02a0
            goto L_0x02ee
        L_0x02a0:
            r0.h()
            r4 = r13 & 32
            if (r4 == 0) goto L_0x02ab
            r4 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r4
        L_0x02ab:
            r4 = r13 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L_0x02b1
            r9 = r9 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x02b1:
            r4 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x02b7
            r9 = r9 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x02b7:
            r4 = r13 & r22
            if (r4 == 0) goto L_0x02bf
            r4 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r9 = r9 & r4
        L_0x02bf:
            r4 = 262144(0x40000, float:3.67342E-40)
            r4 = r4 & r13
            if (r4 == 0) goto L_0x02c8
            r4 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r9 = r9 & r4
        L_0x02c8:
            r6 = r75
            r12 = r76
            r69 = r77
            r2 = r78
            r70 = r79
            r10 = r80
            r4 = r81
            r5 = r82
            r7 = r83
            r8 = r84
            r11 = r87
            r71 = r88
            r39 = r89
            r40 = r90
            r41 = r91
            r13 = r3
            r14 = r9
            r3 = r85
            r9 = r86
            goto L_0x045f
        L_0x02ee:
            if (r6 == 0) goto L_0x02f3
            p0.d$a r6 = p0.d.f16037h0
            goto L_0x02f5
        L_0x02f3:
            r6 = r75
        L_0x02f5:
            if (r12 == 0) goto L_0x02f9
            r12 = 1
            goto L_0x02fb
        L_0x02f9:
            r12 = r76
        L_0x02fb:
            if (r18 == 0) goto L_0x0302
            r18 = 0
            r69 = 0
            goto L_0x0304
        L_0x0302:
            r69 = r77
        L_0x0304:
            r18 = r13 & 32
            if (r18 == 0) goto L_0x0318
            e0.m0 r2 = androidx.compose.material.TextKt.d()
            java.lang.Object r2 = r0.z(r2)
            p1.c0 r2 = (p1.c0) r2
            r18 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r18
            goto L_0x031a
        L_0x0318:
            r2 = r78
        L_0x031a:
            if (r23 == 0) goto L_0x031f
            r70 = 0
            goto L_0x0321
        L_0x031f:
            r70 = r79
        L_0x0321:
            if (r10 == 0) goto L_0x0325
            r10 = 0
            goto L_0x0327
        L_0x0325:
            r10 = r80
        L_0x0327:
            if (r4 == 0) goto L_0x032b
            r4 = 0
            goto L_0x032d
        L_0x032b:
            r4 = r81
        L_0x032d:
            if (r5 == 0) goto L_0x0331
            r5 = 0
            goto L_0x0333
        L_0x0331:
            r5 = r82
        L_0x0333:
            if (r7 == 0) goto L_0x0337
            r7 = 0
            goto L_0x0339
        L_0x0337:
            r7 = r83
        L_0x0339:
            if (r8 == 0) goto L_0x0342
            v1.f0$a r8 = v1.f0.f17091a
            v1.f0 r8 = r8.c()
            goto L_0x0344
        L_0x0342:
            r8 = r84
        L_0x0344:
            r75 = r2
            r2 = r13 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x0353
            a0.i$a r2 = a0.i.f832e
            a0.i r2 = r2.a()
            r9 = r9 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0355
        L_0x0353:
            r2 = r85
        L_0x0355:
            r76 = r2
            r2 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0385
            a0.g r2 = new a0.g
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 63
            r26 = 0
            r77 = r2
            r78 = r18
            r79 = r19
            r80 = r20
            r81 = r21
            r82 = r23
            r83 = r24
            r84 = r25
            r85 = r26
            r77.<init>(r78, r79, r80, r81, r82, r83, r84, r85)
            r9 = r9 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0387
        L_0x0385:
            r2 = r86
        L_0x0387:
            if (r11 == 0) goto L_0x038b
            r11 = 0
            goto L_0x038d
        L_0x038b:
            r11 = r87
        L_0x038d:
            if (r16 == 0) goto L_0x0396
            r16 = 2147483647(0x7fffffff, float:NaN)
            r71 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0398
        L_0x0396:
            r71 = r88
        L_0x0398:
            r77 = r2
            if (r17 == 0) goto L_0x03bd
            r2 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r0.E(r2)
            java.lang.Object r2 = r0.F()
            e0.g$a r16 = e0.g.f14172a
            r78 = r3
            java.lang.Object r3 = r16.a()
            if (r2 != r3) goto L_0x03b7
            u.k r2 = u.j.a()
            r0.y(r2)
        L_0x03b7:
            r0.P()
            u.k r2 = (u.k) r2
            goto L_0x03c1
        L_0x03bd:
            r78 = r3
            r2 = r89
        L_0x03c1:
            r3 = r13 & r22
            if (r3 == 0) goto L_0x03f9
            c0.q r3 = c0.q.f12737a
            r79 = r2
            r2 = 6
            c0.u r2 = r3.b(r0, r2)
            z.a r2 = r2.c()
            r3 = 0
            r16 = 0
            z.b r17 = z.c.c()
            z.b r18 = z.c.c()
            r19 = 3
            r20 = 0
            r80 = r2
            r81 = r3
            r82 = r16
            r83 = r17
            r84 = r18
            r85 = r19
            r86 = r20
            z.a r2 = z.a.d(r80, r81, r82, r83, r84, r85, r86)
            r3 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r3 = r3 & r9
            r9 = r3
            goto L_0x03fd
        L_0x03f9:
            r79 = r2
            r2 = r90
        L_0x03fd:
            r3 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 & r13
            if (r3 == 0) goto L_0x0450
            c0.e0 r16 = c0.e0.f12691a
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r41 = 0
            r43 = 0
            r45 = 0
            r47 = 0
            r49 = 0
            r51 = 0
            r53 = 0
            r55 = 0
            r57 = 0
            r60 = 0
            r61 = 0
            r62 = 48
            r63 = 2097151(0x1fffff, float:2.938734E-39)
            r59 = r0
            c0.c0 r3 = r16.d(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r60, r61, r62, r63)
            r16 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r9 = r9 & r16
            r13 = r78
            r39 = r79
            r40 = r2
            r41 = r3
            r14 = r9
            r2 = r75
            r3 = r76
            goto L_0x045d
        L_0x0450:
            r3 = r76
            r13 = r78
            r39 = r79
            r41 = r91
            r40 = r2
            r14 = r9
            r2 = r75
        L_0x045d:
            r9 = r77
        L_0x045f:
            r0.A()
            r15 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r0.E(r15)
            java.lang.Object r15 = r0.F()
            e0.g$a r16 = e0.g.f14172a
            r82 = r11
            java.lang.Object r11 = r16.a()
            if (r15 != r11) goto L_0x049a
            androidx.compose.ui.text.input.TextFieldValue r11 = new androidx.compose.ui.text.input.TextFieldValue
            r17 = 0
            r15 = 0
            r19 = 6
            r20 = 0
            r75 = r11
            r76 = r73
            r77 = r17
            r79 = r15
            r80 = r19
            r81 = r20
            r75.<init>((java.lang.String) r76, (long) r77, (p1.a0) r79, (int) r80, (kotlin.jvm.internal.i) r81)
            r83 = r9
            r9 = 0
            r15 = 2
            e0.h0 r15 = androidx.compose.runtime.j.e(r11, r9, r15, r9)
            r0.y(r15)
            goto L_0x049c
        L_0x049a:
            r83 = r9
        L_0x049c:
            r0.P()
            e0.h0 r15 = (e0.h0) r15
            androidx.compose.ui.text.input.TextFieldValue r9 = d(r15)
            r17 = 0
            r11 = 0
            r19 = 6
            r20 = 0
            r75 = r9
            r76 = r73
            r77 = r17
            r79 = r11
            r80 = r19
            r81 = r20
            androidx.compose.ui.text.input.TextFieldValue r9 = androidx.compose.ui.text.input.TextFieldValue.c(r75, r76, r77, r79, r80, r81)
            r11 = -3686095(0xffffffffffc7c131, float:NaN)
            r0.E(r11)
            boolean r11 = r0.k(r15)
            boolean r17 = r0.k(r1)
            r11 = r11 | r17
            r75 = r3
            r3 = r74
            boolean r17 = r0.k(r3)
            r11 = r11 | r17
            r76 = r8
            java.lang.Object r8 = r0.F()
            if (r11 != 0) goto L_0x04e4
            java.lang.Object r11 = r16.a()
            if (r8 != r11) goto L_0x04ec
        L_0x04e4:
            androidx.compose.material.TextFieldKt$TextField$2$1 r8 = new androidx.compose.material.TextFieldKt$TextField$2$1
            r8.<init>(r1, r3, r15)
            r0.y(r8)
        L_0x04ec:
            r0.P()
            r17 = r8
            lp0.l r17 = (lp0.l) r17
            r8 = r13 & 896(0x380, float:1.256E-42)
            r11 = r13 & 7168(0x1c00, float:1.0045E-41)
            r8 = r8 | r11
            r11 = r13 & r64
            r8 = r8 | r11
            r11 = r13 & r65
            r8 = r8 | r11
            r11 = r13 & r66
            r8 = r8 | r11
            r11 = r13 & r67
            r8 = r8 | r11
            r11 = r13 & r68
            r8 = r8 | r11
            r11 = 1879048192(0x70000000, float:1.58456325E29)
            r11 = r11 & r13
            r36 = r8 | r11
            r8 = r14 & 14
            r11 = r14 & 112(0x70, float:1.57E-43)
            r8 = r8 | r11
            r11 = r14 & 896(0x380, float:1.256E-42)
            r8 = r8 | r11
            int r11 = a0.g.f824h
            int r11 = r11 << 9
            r8 = r8 | r11
            r11 = r14 & 7168(0x1c00, float:1.0045E-41)
            r8 = r8 | r11
            r11 = r14 & r64
            r8 = r8 | r11
            r11 = r14 & r65
            r8 = r8 | r11
            r11 = r14 & r66
            r8 = r8 | r11
            r11 = r14 & r67
            r8 = r8 | r11
            r11 = r14 & r68
            r37 = r8 | r11
            r38 = 0
            r16 = r9
            r18 = r6
            r19 = r12
            r20 = r69
            r21 = r2
            r22 = r70
            r23 = r10
            r24 = r4
            r25 = r5
            r26 = r7
            r27 = r76
            r28 = r75
            r29 = r83
            r30 = r82
            r31 = r71
            r32 = r39
            r33 = r40
            r34 = r41
            r35 = r0
            b(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r13 = r75
            r15 = r82
            r14 = r83
            r9 = r4
            r11 = r7
            r8 = r10
            r4 = r12
            r17 = r39
            r18 = r40
            r19 = r41
            r16 = r71
            r12 = r76
            r7 = r2
            r10 = r5
            r5 = r69
        L_0x056f:
            e0.s0 r2 = r0.v()
            if (r2 != 0) goto L_0x0576
            goto L_0x0594
        L_0x0576:
            androidx.compose.material.TextFieldKt$TextField$3 r0 = new androidx.compose.material.TextFieldKt$TextField$3
            r75 = r0
            r1 = r73
            r72 = r2
            r2 = r74
            r3 = r6
            r6 = r7
            r7 = r70
            r20 = r93
            r21 = r94
            r22 = r95
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r1 = r75
            r0 = r72
            r0.a(r1)
        L_0x0594:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.c(java.lang.String, lp0.l, p0.d, boolean, boolean, p1.c0, lp0.p, lp0.p, lp0.p, lp0.p, boolean, v1.f0, a0.i, a0.g, boolean, int, u.k, u0.j1, c0.c0, e0.g, int, int, int):void");
    }

    private static final TextFieldValue d(h0<TextFieldValue> h0Var) {
        return h0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void e(h0<TextFieldValue> h0Var, TextFieldValue textFieldValue) {
        h0Var.setValue(textFieldValue);
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:261:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0165  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(p0.d r45, androidx.compose.ui.text.input.TextFieldValue r46, lp0.l<? super androidx.compose.ui.text.input.TextFieldValue, bp0.k> r47, boolean r48, boolean r49, a0.i r50, a0.g r51, p1.c0 r52, boolean r53, int r54, v1.f0 r55, u.k r56, lp0.q<? super p0.d, ? super e0.g, ? super java.lang.Integer, bp0.k> r57, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r58, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r59, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r60, long r61, long r63, float r65, float r66, long r67, long r69, long r71, u0.j1 r73, e0.g r74, int r75, int r76, int r77, int r78) {
        /*
            r1 = r45
            r0 = r46
            r14 = r47
            r12 = r50
            r11 = r51
            r10 = r52
            r9 = r55
            r8 = r56
            r7 = r66
            r5 = r67
            r2 = r69
            r13 = r73
            r15 = r75
            r4 = r76
            r2 = r77
            r3 = r78
            java.lang.String r5 = "modifier"
            kotlin.jvm.internal.p.j(r1, r5)
            java.lang.String r5 = "value"
            kotlin.jvm.internal.p.j(r0, r5)
            java.lang.String r5 = "onValueChange"
            kotlin.jvm.internal.p.j(r14, r5)
            java.lang.String r5 = "keyboardOptions"
            kotlin.jvm.internal.p.j(r12, r5)
            java.lang.String r5 = "keyboardActions"
            kotlin.jvm.internal.p.j(r11, r5)
            java.lang.String r5 = "textStyle"
            kotlin.jvm.internal.p.j(r10, r5)
            java.lang.String r5 = "visualTransformation"
            kotlin.jvm.internal.p.j(r9, r5)
            java.lang.String r5 = "interactionSource"
            kotlin.jvm.internal.p.j(r8, r5)
            java.lang.String r5 = "shape"
            kotlin.jvm.internal.p.j(r13, r5)
            r5 = 2075840620(0x7bbad06c, float:1.939989E36)
            r6 = r74
            e0.g r6 = r6.t(r5)
            r5 = r3 & 1
            r16 = 4
            r17 = 2
            if (r5 == 0) goto L_0x0061
            r5 = r15 | 6
            goto L_0x0071
        L_0x0061:
            r5 = r15 & 14
            if (r5 != 0) goto L_0x0070
            boolean r5 = r6.k(r1)
            if (r5 == 0) goto L_0x006d
            r5 = 4
            goto L_0x006e
        L_0x006d:
            r5 = 2
        L_0x006e:
            r5 = r5 | r15
            goto L_0x0071
        L_0x0070:
            r5 = r15
        L_0x0071:
            r18 = r3 & 2
            r19 = 32
            r20 = 16
            if (r18 == 0) goto L_0x007c
            r5 = r5 | 48
            goto L_0x008d
        L_0x007c:
            r18 = r15 & 112(0x70, float:1.57E-43)
            if (r18 != 0) goto L_0x008d
            boolean r18 = r6.k(r0)
            if (r18 == 0) goto L_0x0089
            r18 = 32
            goto L_0x008b
        L_0x0089:
            r18 = 16
        L_0x008b:
            r5 = r5 | r18
        L_0x008d:
            r18 = r3 & 4
            r21 = 256(0x100, float:3.59E-43)
            r22 = 128(0x80, float:1.794E-43)
            if (r18 == 0) goto L_0x0098
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x00a8
        L_0x0098:
            r0 = r15 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x00a8
            boolean r0 = r6.k(r14)
            if (r0 == 0) goto L_0x00a5
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x00a7
        L_0x00a5:
            r0 = 128(0x80, float:1.794E-43)
        L_0x00a7:
            r5 = r5 | r0
        L_0x00a8:
            r0 = r3 & 8
            r18 = 2048(0x800, float:2.87E-42)
            r23 = 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x00b3
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x00c7
        L_0x00b3:
            r0 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x00c7
            r0 = r48
            boolean r24 = r6.m(r0)
            if (r24 == 0) goto L_0x00c2
            r24 = 2048(0x800, float:2.87E-42)
            goto L_0x00c4
        L_0x00c2:
            r24 = 1024(0x400, float:1.435E-42)
        L_0x00c4:
            r5 = r5 | r24
            goto L_0x00c9
        L_0x00c7:
            r0 = r48
        L_0x00c9:
            r24 = r3 & 16
            r25 = 16384(0x4000, float:2.2959E-41)
            r26 = 8192(0x2000, float:1.14794E-41)
            r27 = 57344(0xe000, float:8.0356E-41)
            if (r24 == 0) goto L_0x00d9
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            r0 = r49
            goto L_0x00ec
        L_0x00d9:
            r24 = r15 & r27
            r0 = r49
            if (r24 != 0) goto L_0x00ec
            boolean r24 = r6.m(r0)
            if (r24 == 0) goto L_0x00e8
            r24 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00ea
        L_0x00e8:
            r24 = 8192(0x2000, float:1.14794E-41)
        L_0x00ea:
            r5 = r5 | r24
        L_0x00ec:
            r24 = r3 & 32
            r28 = 458752(0x70000, float:6.42848E-40)
            if (r24 == 0) goto L_0x00f7
            r24 = 196608(0x30000, float:2.75506E-40)
        L_0x00f4:
            r5 = r5 | r24
            goto L_0x0107
        L_0x00f7:
            r24 = r15 & r28
            if (r24 != 0) goto L_0x0107
            boolean r24 = r6.k(r12)
            if (r24 == 0) goto L_0x0104
            r24 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00f4
        L_0x0104:
            r24 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00f4
        L_0x0107:
            r24 = r3 & 64
            r29 = 3670016(0x380000, float:5.142788E-39)
            if (r24 == 0) goto L_0x0112
            r24 = 1572864(0x180000, float:2.204052E-39)
        L_0x010f:
            r5 = r5 | r24
            goto L_0x0122
        L_0x0112:
            r24 = r15 & r29
            if (r24 != 0) goto L_0x0122
            boolean r24 = r6.k(r11)
            if (r24 == 0) goto L_0x011f
            r24 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x010f
        L_0x011f:
            r24 = 524288(0x80000, float:7.34684E-40)
            goto L_0x010f
        L_0x0122:
            r0 = r3 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x012a
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x0128:
            r5 = r5 | r0
            goto L_0x013b
        L_0x012a:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r15
            if (r0 != 0) goto L_0x013b
            boolean r0 = r6.k(r10)
            if (r0 == 0) goto L_0x0138
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0128
        L_0x0138:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x0128
        L_0x013b:
            r0 = r3 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0143
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r5 = r5 | r0
            goto L_0x0158
        L_0x0143:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r15
            if (r0 != 0) goto L_0x0158
            r0 = r53
            boolean r24 = r6.m(r0)
            if (r24 == 0) goto L_0x0153
            r24 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0155
        L_0x0153:
            r24 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0155:
            r5 = r5 | r24
            goto L_0x015a
        L_0x0158:
            r0 = r53
        L_0x015a:
            r0 = r3 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0165
            r24 = 805306368(0x30000000, float:4.656613E-10)
            r5 = r5 | r24
            r10 = r54
            goto L_0x017a
        L_0x0165:
            r24 = 1879048192(0x70000000, float:1.58456325E29)
            r24 = r15 & r24
            r10 = r54
            if (r24 != 0) goto L_0x017a
            boolean r24 = r6.p(r10)
            if (r24 == 0) goto L_0x0176
            r24 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0178
        L_0x0176:
            r24 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0178:
            r5 = r5 | r24
        L_0x017a:
            r10 = r3 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L_0x0181
            r10 = r4 | 6
            goto L_0x0191
        L_0x0181:
            r10 = r4 & 14
            if (r10 != 0) goto L_0x0190
            boolean r10 = r6.k(r9)
            if (r10 == 0) goto L_0x018d
            r10 = 4
            goto L_0x018e
        L_0x018d:
            r10 = 2
        L_0x018e:
            r10 = r10 | r4
            goto L_0x0191
        L_0x0190:
            r10 = r4
        L_0x0191:
            r9 = r3 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x0198
            r10 = r10 | 48
            goto L_0x01a8
        L_0x0198:
            r9 = r4 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x01a8
            boolean r9 = r6.k(r8)
            if (r9 == 0) goto L_0x01a5
            r9 = 32
            goto L_0x01a7
        L_0x01a5:
            r9 = 16
        L_0x01a7:
            r10 = r10 | r9
        L_0x01a8:
            r9 = r3 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x01af
            r10 = r10 | 384(0x180, float:5.38E-43)
            goto L_0x01c3
        L_0x01af:
            r9 = r4 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x01c3
            r9 = r57
            boolean r24 = r6.k(r9)
            if (r24 == 0) goto L_0x01be
            r24 = 256(0x100, float:3.59E-43)
            goto L_0x01c0
        L_0x01be:
            r24 = 128(0x80, float:1.794E-43)
        L_0x01c0:
            r10 = r10 | r24
            goto L_0x01c5
        L_0x01c3:
            r9 = r57
        L_0x01c5:
            r8 = r3 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L_0x01cc
            r10 = r10 | 3072(0xc00, float:4.305E-42)
            goto L_0x01e0
        L_0x01cc:
            r8 = r4 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x01e0
            r8 = r58
            boolean r24 = r6.k(r8)
            if (r24 == 0) goto L_0x01db
            r24 = 2048(0x800, float:2.87E-42)
            goto L_0x01dd
        L_0x01db:
            r24 = 1024(0x400, float:1.435E-42)
        L_0x01dd:
            r10 = r10 | r24
            goto L_0x01e2
        L_0x01e0:
            r8 = r58
        L_0x01e2:
            r8 = r3 & 16384(0x4000, float:2.2959E-41)
            if (r8 == 0) goto L_0x01e9
            r10 = r10 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01fb
        L_0x01e9:
            r8 = r4 & r27
            if (r8 != 0) goto L_0x01fb
            r8 = r59
            boolean r24 = r6.k(r8)
            if (r24 == 0) goto L_0x01f6
            goto L_0x01f8
        L_0x01f6:
            r25 = 8192(0x2000, float:1.14794E-41)
        L_0x01f8:
            r10 = r10 | r25
            goto L_0x01fd
        L_0x01fb:
            r8 = r59
        L_0x01fd:
            r24 = 32768(0x8000, float:4.5918E-41)
            r24 = r3 & r24
            if (r24 == 0) goto L_0x020b
            r24 = 196608(0x30000, float:2.75506E-40)
            r10 = r10 | r24
            r14 = r60
            goto L_0x021e
        L_0x020b:
            r24 = r4 & r28
            r14 = r60
            if (r24 != 0) goto L_0x021e
            boolean r24 = r6.k(r14)
            if (r24 == 0) goto L_0x021a
            r24 = 131072(0x20000, float:1.83671E-40)
            goto L_0x021c
        L_0x021a:
            r24 = 65536(0x10000, float:9.18355E-41)
        L_0x021c:
            r10 = r10 | r24
        L_0x021e:
            r24 = 65536(0x10000, float:9.18355E-41)
            r24 = r3 & r24
            if (r24 == 0) goto L_0x022b
            r24 = 1572864(0x180000, float:2.204052E-39)
            r10 = r10 | r24
            r11 = r61
            goto L_0x023e
        L_0x022b:
            r24 = r4 & r29
            r11 = r61
            if (r24 != 0) goto L_0x023e
            boolean r24 = r6.q(r11)
            if (r24 == 0) goto L_0x023a
            r24 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x023c
        L_0x023a:
            r24 = 524288(0x80000, float:7.34684E-40)
        L_0x023c:
            r10 = r10 | r24
        L_0x023e:
            r24 = 131072(0x20000, float:1.83671E-40)
            r24 = r3 & r24
            if (r24 == 0) goto L_0x024b
            r24 = 12582912(0xc00000, float:1.7632415E-38)
            r10 = r10 | r24
            r11 = r63
            goto L_0x0260
        L_0x024b:
            r24 = 29360128(0x1c00000, float:7.052966E-38)
            r24 = r4 & r24
            r11 = r63
            if (r24 != 0) goto L_0x0260
            boolean r24 = r6.q(r11)
            if (r24 == 0) goto L_0x025c
            r24 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x025e
        L_0x025c:
            r24 = 4194304(0x400000, float:5.877472E-39)
        L_0x025e:
            r10 = r10 | r24
        L_0x0260:
            r24 = 262144(0x40000, float:3.67342E-40)
            r24 = r3 & r24
            if (r24 == 0) goto L_0x026d
            r24 = 100663296(0x6000000, float:2.4074124E-35)
            r10 = r10 | r24
            r14 = r65
            goto L_0x0282
        L_0x026d:
            r24 = 234881024(0xe000000, float:1.5777218E-30)
            r24 = r4 & r24
            r14 = r65
            if (r24 != 0) goto L_0x0282
            boolean r24 = r6.n(r14)
            if (r24 == 0) goto L_0x027e
            r24 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0280
        L_0x027e:
            r24 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0280:
            r10 = r10 | r24
        L_0x0282:
            r24 = 524288(0x80000, float:7.34684E-40)
            r24 = r3 & r24
            if (r24 == 0) goto L_0x028d
            r24 = 805306368(0x30000000, float:4.656613E-10)
        L_0x028a:
            r10 = r10 | r24
            goto L_0x029f
        L_0x028d:
            r24 = 1879048192(0x70000000, float:1.58456325E29)
            r24 = r4 & r24
            if (r24 != 0) goto L_0x029f
            boolean r24 = r6.n(r7)
            if (r24 == 0) goto L_0x029c
            r24 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x028a
        L_0x029c:
            r24 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x028a
        L_0x029f:
            r24 = 1048576(0x100000, float:1.469368E-39)
            r24 = r3 & r24
            if (r24 == 0) goto L_0x02aa
            r16 = r2 | 6
            r8 = r67
            goto L_0x02be
        L_0x02aa:
            r24 = r2 & 14
            r8 = r67
            if (r24 != 0) goto L_0x02bc
            boolean r24 = r6.q(r8)
            if (r24 == 0) goto L_0x02b7
            goto L_0x02b9
        L_0x02b7:
            r16 = 2
        L_0x02b9:
            r16 = r2 | r16
            goto L_0x02be
        L_0x02bc:
            r16 = r2
        L_0x02be:
            r17 = 2097152(0x200000, float:2.938736E-39)
            r17 = r3 & r17
            if (r17 == 0) goto L_0x02c9
            r16 = r16 | 48
            r11 = r69
            goto L_0x02da
        L_0x02c9:
            r17 = r2 & 112(0x70, float:1.57E-43)
            r11 = r69
            if (r17 != 0) goto L_0x02da
            boolean r17 = r6.q(r11)
            if (r17 == 0) goto L_0x02d6
            goto L_0x02d8
        L_0x02d6:
            r19 = 16
        L_0x02d8:
            r16 = r16 | r19
        L_0x02da:
            r4 = r16
            r16 = 4194304(0x400000, float:5.877472E-39)
            r16 = r3 & r16
            if (r16 == 0) goto L_0x02e5
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x02f7
        L_0x02e5:
            r14 = r2 & 896(0x380, float:1.256E-42)
            if (r14 != 0) goto L_0x02f7
            r14 = r71
            boolean r16 = r6.q(r14)
            if (r16 == 0) goto L_0x02f2
            goto L_0x02f4
        L_0x02f2:
            r21 = 128(0x80, float:1.794E-43)
        L_0x02f4:
            r4 = r4 | r21
            goto L_0x02f9
        L_0x02f7:
            r14 = r71
        L_0x02f9:
            r16 = 8388608(0x800000, float:1.17549435E-38)
            r16 = r3 & r16
            if (r16 == 0) goto L_0x0302
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0311
        L_0x0302:
            r3 = r2 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x0311
            boolean r3 = r6.k(r13)
            if (r3 == 0) goto L_0x030d
            goto L_0x030f
        L_0x030d:
            r18 = 1024(0x400, float:1.435E-42)
        L_0x030f:
            r4 = r4 | r18
        L_0x0311:
            r3 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r3 = r3 & r5
            r16 = 306783378(0x12492492, float:6.3469493E-28)
            r3 = r3 ^ r16
            if (r3 != 0) goto L_0x033c
            r3 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r3 = r3 & r10
            r16 = 306783378(0x12492492, float:6.3469493E-28)
            r3 = r3 ^ r16
            if (r3 != 0) goto L_0x033c
            r3 = r4 & 5851(0x16db, float:8.199E-42)
            r3 = r3 ^ 1170(0x492, float:1.64E-42)
            if (r3 != 0) goto L_0x033c
            boolean r3 = r6.b()
            if (r3 != 0) goto L_0x0334
            goto L_0x033c
        L_0x0334:
            r6.h()
            r10 = r54
            r1 = r6
            goto L_0x03d7
        L_0x033c:
            if (r0 == 0) goto L_0x0342
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0344
        L_0x0342:
            r0 = r54
        L_0x0344:
            c0.e0 r3 = c0.e0.f12691a
            float r4 = r3.b()
            float r3 = r3.a()
            p0.d r3 = androidx.compose.foundation.layout.SizeKt.g(r1, r4, r3)
            p0.d r3 = androidx.compose.foundation.BackgroundKt.c(r3, r11, r13)
            p0.d r4 = r(r3, r7, r8)
            u0.k1 r3 = new u0.k1
            r13 = r14
            r15 = r3
            r1 = 0
            r3.<init>(r13, r1)
            r13 = r1
            r1 = -819911731(0xffffffffcf2123cd, float:-2.70347802E9)
            r3 = 1
            androidx.compose.material.TextFieldKt$TextFieldLayout$1 r14 = new androidx.compose.material.TextFieldKt$TextFieldLayout$1
            r30 = r14
            r31 = r58
            r32 = r57
            r33 = r59
            r34 = r60
            r35 = r53
            r36 = r61
            r38 = r63
            r40 = r65
            r41 = r10
            r42 = r5
            r30.<init>(r31, r32, r33, r34, r35, r36, r38, r40, r41, r42)
            l0.a r16 = l0.b.b(r6, r1, r3, r14)
            int r1 = r5 >> 3
            r3 = r1 & 14
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | r3
            r3 = r5 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r3
            r3 = r5 & r27
            r1 = r1 | r3
            int r3 = r5 >> 6
            r3 = r3 & r28
            r1 = r1 | r3
            int r3 = r5 << 3
            r14 = r3 & r29
            r1 = r1 | r14
            int r14 = a0.g.f824h
            int r14 = r14 << 21
            r1 = r1 | r14
            r14 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r14
            r1 = r1 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r5
            r1 = r1 | r3
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = r3 & r5
            r18 = r1 | r3
            r1 = r10 & 14
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            int r3 = r10 << 3
            r3 = r3 & 896(0x380, float:1.256E-42)
            r19 = r1 | r3
            r20 = 2048(0x800, float:2.87E-42)
            r2 = r46
            r3 = r47
            r5 = r48
            r1 = r6
            r6 = r49
            r7 = r52
            r8 = r50
            r9 = r51
            r10 = r53
            r11 = r0
            r12 = r55
            r14 = r56
            r17 = r1
            androidx.compose.foundation.text.BasicTextFieldKt.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r10 = r0
        L_0x03d7:
            e0.s0 r15 = r1.v()
            if (r15 != 0) goto L_0x03de
            goto L_0x0425
        L_0x03de:
            androidx.compose.material.TextFieldKt$TextFieldLayout$2 r14 = new androidx.compose.material.TextFieldKt$TextFieldLayout$2
            r0 = r14
            r1 = r45
            r2 = r46
            r3 = r47
            r4 = r48
            r5 = r49
            r6 = r50
            r7 = r51
            r8 = r52
            r9 = r53
            r11 = r55
            r12 = r56
            r13 = r57
            r43 = r14
            r14 = r58
            r44 = r15
            r15 = r59
            r16 = r60
            r17 = r61
            r19 = r63
            r21 = r65
            r22 = r66
            r23 = r67
            r25 = r69
            r27 = r71
            r29 = r73
            r30 = r75
            r31 = r76
            r32 = r77
            r33 = r78
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r22, r23, r25, r27, r29, r30, r31, r32, r33)
            r1 = r43
            r0 = r44
            r0.a(r1)
        L_0x0425:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.f(p0.d, androidx.compose.ui.text.input.TextFieldValue, lp0.l, boolean, boolean, a0.i, a0.g, p1.c0, boolean, int, v1.f0, u.k, lp0.q, lp0.p, lp0.p, lp0.p, long, long, float, float, long, long, long, u0.j1, e0.g, int, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final int p(int i11, boolean z11, int i12, int i13, int i14, int i15, long j, float f11) {
        float f12 = f5619b * f11;
        float f13 = f5620c * f11;
        float h11 = TextFieldImplKt.h() * f11;
        int max = Math.max(i11, i15);
        return Math.max(c.c(z11 ? ((float) i12) + f13 + ((float) max) + f12 : (h11 * ((float) 2)) + ((float) max)), Math.max(Math.max(i13, i14), b.o(j)));
    }

    /* access modifiers changed from: private */
    public static final int q(int i11, int i12, int i13, int i14, int i15, long j) {
        return Math.max(i11 + Math.max(i13, Math.max(i14, i15)) + i12, b.p(j));
    }

    public static final d r(d dVar, float f11, long j) {
        kotlin.jvm.internal.p.j(dVar, "$this$drawIndicatorLine");
        return DrawModifierKt.a(dVar, new TextFieldKt$drawIndicatorLine$1(f11, j));
    }

    /* access modifiers changed from: private */
    public static final void s(e0.a aVar, int i11, int i12, e0 e0Var, e0 e0Var2, e0 e0Var3, e0 e0Var4, e0 e0Var5, boolean z11, int i13, int i14, float f11, float f12) {
        int i15 = i12;
        int c11 = c.c(TextFieldImplKt.h() * f12);
        if (e0Var4 != null) {
            e0.a.n(aVar, e0Var4, 0, p0.a.f16019a.i().a(e0Var4.e0(), i15), 0.0f, 4, (Object) null);
        }
        if (e0Var5 != null) {
            e0.a.n(aVar, e0Var5, i11 - e0Var5.A0(), p0.a.f16019a.i().a(e0Var5.e0(), i15), 0.0f, 4, (Object) null);
        }
        if (e0Var2 != null) {
            if (z11) {
                c11 = p0.a.f16019a.i().a(e0Var2.e0(), i15);
            }
            e0.a aVar2 = aVar;
            e0 e0Var6 = e0Var2;
            e0.a.n(aVar2, e0Var6, TextFieldImplKt.k(e0Var4), c11 - c.c(((float) (c11 - i13)) * f11), 0.0f, 4, (Object) null);
        }
        e0.a.n(aVar, e0Var, TextFieldImplKt.k(e0Var4), i14, 0.0f, 4, (Object) null);
        if (e0Var3 != null) {
            e0.a.n(aVar, e0Var3, TextFieldImplKt.k(e0Var4), i14, 0.0f, 4, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final void t(e0.a aVar, int i11, int i12, e0 e0Var, e0 e0Var2, e0 e0Var3, e0 e0Var4, boolean z11, float f11) {
        int i13 = i12;
        int c11 = c.c(TextFieldImplKt.h() * f11);
        if (e0Var3 != null) {
            e0.a.n(aVar, e0Var3, 0, p0.a.f16019a.i().a(e0Var3.e0(), i13), 0.0f, 4, (Object) null);
        }
        if (e0Var4 != null) {
            e0.a.n(aVar, e0Var4, i11 - e0Var4.A0(), p0.a.f16019a.i().a(e0Var4.e0(), i13), 0.0f, 4, (Object) null);
        }
        e0.a.n(aVar, e0Var, TextFieldImplKt.k(e0Var3), z11 ? p0.a.f16019a.i().a(e0Var.e0(), i13) : c11, 0.0f, 4, (Object) null);
        if (e0Var2 != null) {
            if (z11) {
                c11 = p0.a.f16019a.i().a(e0Var2.e0(), i13);
            }
            e0.a.n(aVar, e0Var2, TextFieldImplKt.k(e0Var3), c11, 0.0f, 4, (Object) null);
        }
    }
}
