package androidx.compose.material;

import androidx.compose.foundation.BorderKt;
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
import lp0.l;
import lp0.p;
import lp0.q;
import org.apache.pdfbox.pdmodel.interactive.form.PDButton;
import org.apache.pdfbox.pdmodel.interactive.form.PDChoice;
import p0.a;
import p0.d;
import p1.c0;
import u0.j1;

/* compiled from: OutlinedTextField.kt */
public final class OutlinedTextFieldKt {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f5101a = h.n((float) 4);

    /* renamed from: b  reason: collision with root package name */
    private static final float f5102b = h.n((float) 8);

    /* access modifiers changed from: private */
    public static final void a(p<? super g, ? super Integer, k> pVar, q<? super d, ? super g, ? super Integer, k> qVar, p<? super g, ? super Integer, k> pVar2, p<? super g, ? super Integer, k> pVar3, p<? super g, ? super Integer, k> pVar4, boolean z11, long j, long j11, float f11, l<? super t0.l, k> lVar, j1 j1Var, float f12, long j12, long j13, g gVar, int i11, int i12) {
        int i13;
        int i14;
        g gVar2;
        g gVar3;
        int i15;
        int i16;
        d.a aVar;
        g gVar4;
        int i17;
        float f13;
        p<? super g, ? super Integer, k> pVar5 = pVar;
        q<? super d, ? super g, ? super Integer, k> qVar2 = qVar;
        p<? super g, ? super Integer, k> pVar6 = pVar2;
        p<? super g, ? super Integer, k> pVar7 = pVar3;
        p<? super g, ? super Integer, k> pVar8 = pVar4;
        boolean z12 = z11;
        float f14 = f11;
        l<? super t0.l, k> lVar2 = lVar;
        int i18 = i11;
        int i19 = i12;
        g t = gVar.t(178502739);
        int i21 = 4;
        if ((i18 & 14) == 0) {
            i13 = (t.k(pVar5) ? 4 : 2) | i18;
        } else {
            i13 = i18;
        }
        int i22 = 16;
        if ((i18 & 112) == 0) {
            i13 |= t.k(qVar2) ? 32 : 16;
        }
        int i23 = 256;
        if ((i18 & 896) == 0) {
            i13 |= t.k(pVar6) ? 256 : 128;
        }
        int i24 = 2048;
        if ((i18 & 7168) == 0) {
            i13 |= t.k(pVar7) ? 2048 : 1024;
        }
        if ((57344 & i18) == 0) {
            i13 |= t.k(pVar8) ? 16384 : 8192;
        }
        if ((458752 & i18) == 0) {
            i13 |= t.m(z12) ? PDChoice.FLAG_COMBO : PDButton.FLAG_PUSHBUTTON;
        }
        if ((3670016 & i18) == 0) {
            i13 |= t.q(j) ? 1048576 : 524288;
        } else {
            long j14 = j;
        }
        long j15 = j11;
        if ((i18 & 29360128) == 0) {
            i13 |= t.q(j15) ? 8388608 : 4194304;
        }
        if ((i18 & 234881024) == 0) {
            i13 |= t.n(f14) ? 67108864 : PDButton.FLAG_RADIOS_IN_UNISON;
        }
        if ((i18 & 1879048192) == 0) {
            i13 |= t.k(lVar2) ? 536870912 : 268435456;
        }
        j1 j1Var2 = j1Var;
        if ((i19 & 14) == 0) {
            if (!t.k(j1Var2)) {
                i21 = 2;
            }
            i14 = i21 | i19;
        } else {
            i14 = i19;
        }
        if ((i19 & 112) == 0) {
            if (t.n(f12)) {
                i22 = 32;
            }
            i14 |= i22;
        } else {
            float f15 = f12;
        }
        long j16 = j12;
        if ((i19 & 896) == 0) {
            if (!t.q(j16)) {
                i23 = 128;
            }
            i14 |= i23;
        }
        long j17 = j13;
        if ((i19 & 7168) == 0) {
            if (!t.q(j17)) {
                i24 = 1024;
            }
            i14 |= i24;
        }
        if (((1533916891 & i13) ^ 306783378) == 0 && ((i14 & 5851) ^ 1170) == 0 && t.b()) {
            t.h();
            gVar2 = t;
        } else {
            Boolean valueOf = Boolean.valueOf(z11);
            Float valueOf2 = Float.valueOf(f11);
            int i25 = i13 >> 18;
            t.E(-3686095);
            boolean k = t.k(valueOf) | t.k(lVar2) | t.k(valueOf2);
            Object F = t.F();
            if (k || F == g.f14172a.a()) {
                F = new OutlinedTextFieldMeasurePolicy(lVar2, z12, f14);
                t.y(F);
            }
            t.P();
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) F;
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
            Updater.c(a12, outlinedTextFieldMeasurePolicy, companion.d());
            Updater.c(a12, eVar, companion.b());
            Updater.c(a12, layoutDirection, companion.c());
            Updater.c(a12, n1Var, companion.f());
            t.o();
            b11.invoke(t0.a(t0.b(t)), t, 0);
            t.E(2058660585);
            t.E(-804088231);
            BoxKt.a(p(LayoutIdKt.b(aVar2, "border"), j1Var, f12, j12, j13), t, 0);
            t.E(-804088054);
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
                t.E(-447675374);
                i16 = i13;
                aVar = aVar2;
                gVar3 = t;
                i15 = 6;
                TextFieldImplKt.a(j, (c0) null, (Float) null, pVar3, t, (i13 & 7168) | (i25 & 14), 6);
                gVar3.P();
                gVar3.P();
                gVar3.P();
                gVar3.d();
                gVar3.P();
                gVar3.P();
            } else {
                i16 = i13;
                aVar = aVar2;
                gVar3 = t;
                i15 = 6;
            }
            gVar3.P();
            g gVar5 = gVar3;
            gVar5.E(-804087650);
            if (pVar8 != null) {
                d N2 = LayoutIdKt.b(aVar, "Trailing").N(TextFieldImplKt.f());
                p0.a e12 = p0.a.f16019a.e();
                gVar5.E(-1990474327);
                t h12 = BoxKt.h(e12, false, gVar5, i15);
                gVar5.E(1376089394);
                e eVar3 = (e) gVar5.z(CompositionLocalsKt.e());
                LayoutDirection layoutDirection3 = (LayoutDirection) gVar5.z(CompositionLocalsKt.j());
                n1 n1Var3 = (n1) gVar5.z(CompositionLocalsKt.n());
                a<ComposeUiNode> a15 = companion.a();
                q<t0<ComposeUiNode>, g, Integer, k> b13 = LayoutKt.b(N2);
                if (!(gVar5.u() instanceof e0.e)) {
                    f.c();
                }
                gVar5.f();
                if (gVar5.s()) {
                    gVar5.K(a15);
                } else {
                    gVar5.c();
                }
                gVar5.J();
                g a16 = Updater.a(gVar5);
                Updater.c(a16, h12, companion.d());
                Updater.c(a16, eVar3, companion.b());
                Updater.c(a16, layoutDirection3, companion.c());
                Updater.c(a16, n1Var3, companion.f());
                gVar5.o();
                b13.invoke(t0.a(t0.b(gVar5)), gVar5, 0);
                gVar5.E(2058660585);
                gVar5.E(-1253629305);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f3698a;
                gVar5.E(-447674968);
                i17 = -1990474327;
                gVar4 = gVar5;
                TextFieldImplKt.a(j11, (c0) null, (Float) null, pVar4, gVar5, ((i16 >> 21) & 14) | ((i16 >> 3) & 7168), 6);
                gVar4.P();
                gVar4.P();
                gVar4.P();
                gVar4.d();
                gVar4.P();
                gVar4.P();
            } else {
                gVar4 = gVar5;
                i17 = -1990474327;
            }
            gVar4.P();
            float n = h.n(TextFieldImplKt.h() - TextFieldImplKt.e());
            if (pVar7 != null) {
                f13 = n;
            } else {
                f13 = TextFieldImplKt.h();
            }
            if (pVar8 == null) {
                n = TextFieldImplKt.h();
            }
            d m11 = PaddingKt.m(aVar, f13, 0.0f, n, 0.0f, 10, (Object) null);
            gVar2 = gVar4;
            gVar2.E(-804086949);
            if (qVar2 != null) {
                qVar2.invoke(LayoutIdKt.b(aVar, "Hint").N(m11), gVar2, Integer.valueOf(i16 & 112));
            }
            gVar2.P();
            d N3 = LayoutIdKt.b(aVar, "TextField").N(m11);
            gVar2.E(i17);
            a.C0160a aVar3 = p0.a.f16019a;
            t h13 = BoxKt.h(aVar3.o(), true, gVar2, 48);
            gVar2.E(1376089394);
            e eVar4 = (e) gVar2.z(CompositionLocalsKt.e());
            LayoutDirection layoutDirection4 = (LayoutDirection) gVar2.z(CompositionLocalsKt.j());
            n1 n1Var4 = (n1) gVar2.z(CompositionLocalsKt.n());
            lp0.a<ComposeUiNode> a17 = companion.a();
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
            gVar2.E(-1253629305);
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.f3698a;
            gVar2.E(-447674213);
            pVar5.invoke(gVar2, Integer.valueOf(i16 & 14));
            gVar2.P();
            gVar2.P();
            gVar2.P();
            gVar2.d();
            gVar2.P();
            gVar2.P();
            if (pVar6 != null) {
                d b15 = LayoutIdKt.b(aVar, "Label");
                gVar2.E(-1990474327);
                t h14 = BoxKt.h(aVar3.o(), false, gVar2, 0);
                gVar2.E(1376089394);
                e eVar5 = (e) gVar2.z(CompositionLocalsKt.e());
                LayoutDirection layoutDirection5 = (LayoutDirection) gVar2.z(CompositionLocalsKt.j());
                n1 n1Var5 = (n1) gVar2.z(CompositionLocalsKt.n());
                lp0.a<ComposeUiNode> a19 = companion.a();
                q<t0<ComposeUiNode>, g, Integer, k> b16 = LayoutKt.b(b15);
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
                b16.invoke(t0.a(t0.b(gVar2)), gVar2, 0);
                gVar2.E(2058660585);
                gVar2.E(-1253629305);
                gVar2.E(-447674092);
                pVar6.invoke(gVar2, Integer.valueOf((i16 >> 6) & 14));
                gVar2.P();
                gVar2.P();
                gVar2.P();
                gVar2.d();
                gVar2.P();
                gVar2.P();
            }
            gVar2.P();
            gVar2.P();
            gVar2.d();
            gVar2.P();
        }
        s0 v = gVar2.v();
        if (v != null) {
            OutlinedTextFieldKt$IconsWithTextFieldLayout$2 outlinedTextFieldKt$IconsWithTextFieldLayout$2 = r0;
            OutlinedTextFieldKt$IconsWithTextFieldLayout$2 outlinedTextFieldKt$IconsWithTextFieldLayout$22 = new OutlinedTextFieldKt$IconsWithTextFieldLayout$2(pVar, qVar, pVar2, pVar3, pVar4, z11, j, j11, f11, lVar, j1Var, f12, j12, j13, i11, i12);
            v.a(outlinedTextFieldKt$IconsWithTextFieldLayout$2);
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
    /* JADX WARNING: Removed duplicated region for block: B:285:0x04fe  */
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
            r0 = 1961400318(0x74e897fe, float:1.4742378E32)
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
            goto L_0x04f7
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
            goto L_0x045b
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
            if (r1 == 0) goto L_0x03d9
            c0.q r1 = c0.q.f12737a
            r14 = 6
            c0.u r1 = r1.b(r10, r14)
            z.a r1 = r1.c()
            r14 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r7 = r7 & r14
            r14 = r1
        L_0x03d9:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r11
            if (r1 == 0) goto L_0x043d
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
            c0.c0 r1 = r16.c(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r60, r61, r62, r63)
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
            goto L_0x045b
        L_0x043d:
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
        L_0x045b:
            r10.A()
            androidx.compose.material.TextFieldType r0 = androidx.compose.material.TextFieldType.Outlined
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
        L_0x04f7:
            e0.s0 r2 = r38.v()
            if (r2 != 0) goto L_0x04fe
            goto L_0x0519
        L_0x04fe:
            androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$5 r1 = new androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$5
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
        L_0x0519:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.b(androidx.compose.ui.text.input.TextFieldValue, lp0.l, p0.d, boolean, boolean, p1.c0, lp0.p, lp0.p, lp0.p, lp0.p, boolean, v1.f0, a0.i, a0.g, boolean, int, u.k, u0.j1, c0.c0, e0.g, int, int, int):void");
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
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0534  */
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
            r0 = 1961393918(0x74e87efe, float:1.4736189E32)
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
            goto L_0x052d
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
            goto L_0x041d
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
            if (r2 == 0) goto L_0x0364
            a0.g$a r2 = a0.g.f823g
            a0.g r2 = r2.a()
            r9 = r9 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0366
        L_0x0364:
            r2 = r86
        L_0x0366:
            if (r11 == 0) goto L_0x036a
            r11 = 0
            goto L_0x036c
        L_0x036a:
            r11 = r87
        L_0x036c:
            if (r16 == 0) goto L_0x0375
            r16 = 2147483647(0x7fffffff, float:NaN)
            r71 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0377
        L_0x0375:
            r71 = r88
        L_0x0377:
            r77 = r2
            if (r17 == 0) goto L_0x039c
            r2 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r0.E(r2)
            java.lang.Object r2 = r0.F()
            e0.g$a r16 = e0.g.f14172a
            r78 = r3
            java.lang.Object r3 = r16.a()
            if (r2 != r3) goto L_0x0396
            u.k r2 = u.j.a()
            r0.y(r2)
        L_0x0396:
            r0.P()
            u.k r2 = (u.k) r2
            goto L_0x03a0
        L_0x039c:
            r78 = r3
            r2 = r89
        L_0x03a0:
            r3 = r13 & r22
            if (r3 == 0) goto L_0x03b7
            c0.q r3 = c0.q.f12737a
            r79 = r2
            r2 = 6
            c0.u r2 = r3.b(r0, r2)
            z.a r2 = r2.c()
            r3 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r3 = r3 & r9
            r9 = r3
            goto L_0x03bb
        L_0x03b7:
            r79 = r2
            r2 = r90
        L_0x03bb:
            r3 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 & r13
            if (r3 == 0) goto L_0x040e
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
            c0.c0 r3 = r16.c(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r60, r61, r62, r63)
            r16 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r9 = r9 & r16
            r13 = r78
            r39 = r79
            r40 = r2
            r41 = r3
            r14 = r9
            r2 = r75
            r3 = r76
            goto L_0x041b
        L_0x040e:
            r3 = r76
            r13 = r78
            r39 = r79
            r41 = r91
            r40 = r2
            r14 = r9
            r2 = r75
        L_0x041b:
            r9 = r77
        L_0x041d:
            r0.A()
            r15 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r0.E(r15)
            java.lang.Object r15 = r0.F()
            e0.g$a r16 = e0.g.f14172a
            r82 = r11
            java.lang.Object r11 = r16.a()
            if (r15 != r11) goto L_0x0458
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
            goto L_0x045a
        L_0x0458:
            r83 = r9
        L_0x045a:
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
            if (r11 != 0) goto L_0x04a2
            java.lang.Object r11 = r16.a()
            if (r8 != r11) goto L_0x04aa
        L_0x04a2:
            androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$2$1 r8 = new androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$2$1
            r8.<init>(r1, r3, r15)
            r0.y(r8)
        L_0x04aa:
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
        L_0x052d:
            e0.s0 r2 = r0.v()
            if (r2 != 0) goto L_0x0534
            goto L_0x0552
        L_0x0534:
            androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$3 r0 = new androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$3
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
        L_0x0552:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.c(java.lang.String, lp0.l, p0.d, boolean, boolean, p1.c0, lp0.p, lp0.p, lp0.p, lp0.p, boolean, v1.f0, a0.i, a0.g, boolean, int, u.k, u0.j1, c0.c0, e0.g, int, int, int):void");
    }

    private static final TextFieldValue d(h0<TextFieldValue> h0Var) {
        return h0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void e(h0<TextFieldValue> h0Var, TextFieldValue textFieldValue) {
        h0Var.setValue(textFieldValue);
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0430  */
    /* JADX WARNING: Removed duplicated region for block: B:269:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(p0.d r40, androidx.compose.ui.text.input.TextFieldValue r41, lp0.l<? super androidx.compose.ui.text.input.TextFieldValue, bp0.k> r42, boolean r43, boolean r44, a0.i r45, a0.g r46, p1.c0 r47, boolean r48, int r49, v1.f0 r50, u.k r51, lp0.q<? super p0.d, ? super e0.g, ? super java.lang.Integer, bp0.k> r52, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r53, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r54, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r55, long r56, long r58, float r60, float r61, long r62, long r64, long r66, u0.j1 r68, e0.g r69, int r70, int r71, int r72, int r73) {
        /*
            r1 = r40
            r0 = r41
            r14 = r42
            r12 = r45
            r11 = r46
            r10 = r47
            r9 = r50
            r8 = r51
            r7 = r53
            r5 = r64
            r2 = r66
            r13 = r68
            r15 = r70
            r4 = r71
            r2 = r72
            r3 = r73
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
            r5 = -614217678(0xffffffffdb63c832, float:-6.4114937E16)
            r6 = r69
            e0.g r6 = r6.t(r5)
            r5 = r3 & 1
            r16 = 4
            if (r5 == 0) goto L_0x005f
            r5 = r15 | 6
            goto L_0x006f
        L_0x005f:
            r5 = r15 & 14
            if (r5 != 0) goto L_0x006e
            boolean r5 = r6.k(r1)
            if (r5 == 0) goto L_0x006b
            r5 = 4
            goto L_0x006c
        L_0x006b:
            r5 = 2
        L_0x006c:
            r5 = r5 | r15
            goto L_0x006f
        L_0x006e:
            r5 = r15
        L_0x006f:
            r17 = r3 & 2
            r18 = 32
            r19 = 16
            if (r17 == 0) goto L_0x007a
            r5 = r5 | 48
            goto L_0x008b
        L_0x007a:
            r17 = r15 & 112(0x70, float:1.57E-43)
            if (r17 != 0) goto L_0x008b
            boolean r17 = r6.k(r0)
            if (r17 == 0) goto L_0x0087
            r17 = 32
            goto L_0x0089
        L_0x0087:
            r17 = 16
        L_0x0089:
            r5 = r5 | r17
        L_0x008b:
            r17 = r3 & 4
            r20 = 256(0x100, float:3.59E-43)
            r21 = 128(0x80, float:1.794E-43)
            if (r17 == 0) goto L_0x0096
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x00a6
        L_0x0096:
            r13 = r15 & 896(0x380, float:1.256E-42)
            if (r13 != 0) goto L_0x00a6
            boolean r13 = r6.k(r14)
            if (r13 == 0) goto L_0x00a3
            r13 = 256(0x100, float:3.59E-43)
            goto L_0x00a5
        L_0x00a3:
            r13 = 128(0x80, float:1.794E-43)
        L_0x00a5:
            r5 = r5 | r13
        L_0x00a6:
            r13 = r3 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r22 = 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x00b1
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x00c5
        L_0x00b1:
            r13 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x00c5
            r13 = r43
            boolean r23 = r6.m(r13)
            if (r23 == 0) goto L_0x00c0
            r23 = 2048(0x800, float:2.87E-42)
            goto L_0x00c2
        L_0x00c0:
            r23 = 1024(0x400, float:1.435E-42)
        L_0x00c2:
            r5 = r5 | r23
            goto L_0x00c7
        L_0x00c5:
            r13 = r43
        L_0x00c7:
            r23 = r3 & 16
            r24 = 16384(0x4000, float:2.2959E-41)
            r25 = 8192(0x2000, float:1.14794E-41)
            r35 = 57344(0xe000, float:8.0356E-41)
            if (r23 == 0) goto L_0x00d7
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            r13 = r44
            goto L_0x00ea
        L_0x00d7:
            r23 = r15 & r35
            r13 = r44
            if (r23 != 0) goto L_0x00ea
            boolean r23 = r6.m(r13)
            if (r23 == 0) goto L_0x00e6
            r23 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00e8
        L_0x00e6:
            r23 = 8192(0x2000, float:1.14794E-41)
        L_0x00e8:
            r5 = r5 | r23
        L_0x00ea:
            r23 = r3 & 32
            r36 = 458752(0x70000, float:6.42848E-40)
            if (r23 == 0) goto L_0x00f5
            r23 = 196608(0x30000, float:2.75506E-40)
        L_0x00f2:
            r5 = r5 | r23
            goto L_0x0105
        L_0x00f5:
            r23 = r15 & r36
            if (r23 != 0) goto L_0x0105
            boolean r23 = r6.k(r12)
            if (r23 == 0) goto L_0x0102
            r23 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00f2
        L_0x0102:
            r23 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00f2
        L_0x0105:
            r23 = r3 & 64
            r37 = 3670016(0x380000, float:5.142788E-39)
            if (r23 == 0) goto L_0x0110
            r23 = 1572864(0x180000, float:2.204052E-39)
        L_0x010d:
            r5 = r5 | r23
            goto L_0x0120
        L_0x0110:
            r23 = r15 & r37
            if (r23 != 0) goto L_0x0120
            boolean r23 = r6.k(r11)
            if (r23 == 0) goto L_0x011d
            r23 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x010d
        L_0x011d:
            r23 = 524288(0x80000, float:7.34684E-40)
            goto L_0x010d
        L_0x0120:
            r0 = r3 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0128
            r0 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x0126:
            r5 = r5 | r0
            goto L_0x0139
        L_0x0128:
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r15
            if (r0 != 0) goto L_0x0139
            boolean r0 = r6.k(r10)
            if (r0 == 0) goto L_0x0136
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0126
        L_0x0136:
            r0 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x0126
        L_0x0139:
            r0 = r3 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0141
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r5 = r5 | r0
            goto L_0x0156
        L_0x0141:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r15
            if (r0 != 0) goto L_0x0156
            r0 = r48
            boolean r23 = r6.m(r0)
            if (r23 == 0) goto L_0x0151
            r23 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0153
        L_0x0151:
            r23 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0153:
            r5 = r5 | r23
            goto L_0x0158
        L_0x0156:
            r0 = r48
        L_0x0158:
            r0 = r3 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0163
            r23 = 805306368(0x30000000, float:4.656613E-10)
            r5 = r5 | r23
            r10 = r49
            goto L_0x0178
        L_0x0163:
            r23 = 1879048192(0x70000000, float:1.58456325E29)
            r23 = r15 & r23
            r10 = r49
            if (r23 != 0) goto L_0x0178
            boolean r23 = r6.p(r10)
            if (r23 == 0) goto L_0x0174
            r23 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0176
        L_0x0174:
            r23 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0176:
            r5 = r5 | r23
        L_0x0178:
            r10 = r3 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L_0x017f
            r10 = r4 | 6
            goto L_0x018f
        L_0x017f:
            r10 = r4 & 14
            if (r10 != 0) goto L_0x018e
            boolean r10 = r6.k(r9)
            if (r10 == 0) goto L_0x018b
            r10 = 4
            goto L_0x018c
        L_0x018b:
            r10 = 2
        L_0x018c:
            r10 = r10 | r4
            goto L_0x018f
        L_0x018e:
            r10 = r4
        L_0x018f:
            r9 = r3 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x0196
            r10 = r10 | 48
            goto L_0x01a6
        L_0x0196:
            r9 = r4 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x01a6
            boolean r9 = r6.k(r8)
            if (r9 == 0) goto L_0x01a3
            r9 = 32
            goto L_0x01a5
        L_0x01a3:
            r9 = 16
        L_0x01a5:
            r10 = r10 | r9
        L_0x01a6:
            r9 = r3 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x01ad
            r10 = r10 | 384(0x180, float:5.38E-43)
            goto L_0x01c1
        L_0x01ad:
            r9 = r4 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x01c1
            r9 = r52
            boolean r23 = r6.k(r9)
            if (r23 == 0) goto L_0x01bc
            r23 = 256(0x100, float:3.59E-43)
            goto L_0x01be
        L_0x01bc:
            r23 = 128(0x80, float:1.794E-43)
        L_0x01be:
            r10 = r10 | r23
            goto L_0x01c3
        L_0x01c1:
            r9 = r52
        L_0x01c3:
            r8 = r3 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L_0x01ca
            r10 = r10 | 3072(0xc00, float:4.305E-42)
            goto L_0x01da
        L_0x01ca:
            r8 = r4 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x01da
            boolean r8 = r6.k(r7)
            if (r8 == 0) goto L_0x01d7
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x01d9
        L_0x01d7:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x01d9:
            r10 = r10 | r8
        L_0x01da:
            r8 = r3 & 16384(0x4000, float:2.2959E-41)
            if (r8 == 0) goto L_0x01e1
            r10 = r10 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01f3
        L_0x01e1:
            r8 = r4 & r35
            if (r8 != 0) goto L_0x01f3
            r8 = r54
            boolean r23 = r6.k(r8)
            if (r23 == 0) goto L_0x01ee
            goto L_0x01f0
        L_0x01ee:
            r24 = 8192(0x2000, float:1.14794E-41)
        L_0x01f0:
            r10 = r10 | r24
            goto L_0x01f5
        L_0x01f3:
            r8 = r54
        L_0x01f5:
            r23 = 32768(0x8000, float:4.5918E-41)
            r23 = r3 & r23
            if (r23 == 0) goto L_0x0203
            r23 = 196608(0x30000, float:2.75506E-40)
            r10 = r10 | r23
            r13 = r55
            goto L_0x0216
        L_0x0203:
            r23 = r4 & r36
            r13 = r55
            if (r23 != 0) goto L_0x0216
            boolean r23 = r6.k(r13)
            if (r23 == 0) goto L_0x0212
            r23 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0214
        L_0x0212:
            r23 = 65536(0x10000, float:9.18355E-41)
        L_0x0214:
            r10 = r10 | r23
        L_0x0216:
            r23 = 65536(0x10000, float:9.18355E-41)
            r23 = r3 & r23
            if (r23 == 0) goto L_0x0223
            r23 = 1572864(0x180000, float:2.204052E-39)
            r10 = r10 | r23
            r13 = r56
            goto L_0x0236
        L_0x0223:
            r23 = r4 & r37
            r13 = r56
            if (r23 != 0) goto L_0x0236
            boolean r23 = r6.q(r13)
            if (r23 == 0) goto L_0x0232
            r23 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0234
        L_0x0232:
            r23 = 524288(0x80000, float:7.34684E-40)
        L_0x0234:
            r10 = r10 | r23
        L_0x0236:
            r23 = 131072(0x20000, float:1.83671E-40)
            r23 = r3 & r23
            if (r23 == 0) goto L_0x0243
            r23 = 12582912(0xc00000, float:1.7632415E-38)
            r10 = r10 | r23
            r13 = r58
            goto L_0x0258
        L_0x0243:
            r23 = 29360128(0x1c00000, float:7.052966E-38)
            r23 = r4 & r23
            r13 = r58
            if (r23 != 0) goto L_0x0258
            boolean r23 = r6.q(r13)
            if (r23 == 0) goto L_0x0254
            r23 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0256
        L_0x0254:
            r23 = 4194304(0x400000, float:5.877472E-39)
        L_0x0256:
            r10 = r10 | r23
        L_0x0258:
            r23 = 262144(0x40000, float:3.67342E-40)
            r23 = r3 & r23
            if (r23 == 0) goto L_0x0265
            r23 = 100663296(0x6000000, float:2.4074124E-35)
            r10 = r10 | r23
            r13 = r60
            goto L_0x0279
        L_0x0265:
            r23 = 234881024(0xe000000, float:1.5777218E-30)
            r23 = r4 & r23
            r13 = r60
            if (r23 != 0) goto L_0x0279
            boolean r14 = r6.n(r13)
            if (r14 == 0) goto L_0x0276
            r14 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0278
        L_0x0276:
            r14 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0278:
            r10 = r10 | r14
        L_0x0279:
            r14 = 524288(0x80000, float:7.34684E-40)
            r14 = r14 & r3
            if (r14 == 0) goto L_0x0282
            r14 = 805306368(0x30000000, float:4.656613E-10)
            r10 = r10 | r14
            goto L_0x0297
        L_0x0282:
            r14 = 1879048192(0x70000000, float:1.58456325E29)
            r14 = r14 & r4
            if (r14 != 0) goto L_0x0297
            r14 = r61
            boolean r23 = r6.n(r14)
            if (r23 == 0) goto L_0x0292
            r23 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0294
        L_0x0292:
            r23 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0294:
            r10 = r10 | r23
            goto L_0x0299
        L_0x0297:
            r14 = r61
        L_0x0299:
            r23 = 1048576(0x100000, float:1.469368E-39)
            r23 = r3 & r23
            if (r23 == 0) goto L_0x02a4
            r16 = r2 | 6
            r13 = r62
            goto L_0x02b8
        L_0x02a4:
            r23 = r2 & 14
            r13 = r62
            if (r23 != 0) goto L_0x02b6
            boolean r23 = r6.q(r13)
            if (r23 == 0) goto L_0x02b1
            goto L_0x02b3
        L_0x02b1:
            r16 = 2
        L_0x02b3:
            r16 = r2 | r16
            goto L_0x02b8
        L_0x02b6:
            r16 = r2
        L_0x02b8:
            r23 = 2097152(0x200000, float:2.938736E-39)
            r23 = r3 & r23
            if (r23 == 0) goto L_0x02c3
            r16 = r16 | 48
            r13 = r64
            goto L_0x02d4
        L_0x02c3:
            r23 = r2 & 112(0x70, float:1.57E-43)
            r13 = r64
            if (r23 != 0) goto L_0x02d4
            boolean r23 = r6.q(r13)
            if (r23 == 0) goto L_0x02d0
            goto L_0x02d2
        L_0x02d0:
            r18 = 16
        L_0x02d2:
            r16 = r16 | r18
        L_0x02d4:
            r4 = r16
            r16 = 4194304(0x400000, float:5.877472E-39)
            r16 = r3 & r16
            if (r16 == 0) goto L_0x02df
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x02f1
        L_0x02df:
            r8 = r2 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x02f1
            r8 = r66
            boolean r16 = r6.q(r8)
            if (r16 == 0) goto L_0x02ec
            goto L_0x02ee
        L_0x02ec:
            r20 = 128(0x80, float:1.794E-43)
        L_0x02ee:
            r4 = r4 | r20
            goto L_0x02f3
        L_0x02f1:
            r8 = r66
        L_0x02f3:
            r16 = 8388608(0x800000, float:1.17549435E-38)
            r16 = r3 & r16
            if (r16 == 0) goto L_0x02fc
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x030f
        L_0x02fc:
            r3 = r2 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x030f
            r3 = r68
            r2 = 2
            boolean r16 = r6.k(r3)
            if (r16 == 0) goto L_0x030a
            goto L_0x030c
        L_0x030a:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x030c:
            r4 = r4 | r17
            goto L_0x0312
        L_0x030f:
            r3 = r68
            r2 = 2
        L_0x0312:
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r16 = r5 & r16
            r17 = 306783378(0x12492492, float:6.3469493E-28)
            r16 = r16 ^ r17
            if (r16 != 0) goto L_0x033f
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r16 = r10 & r16
            r17 = 306783378(0x12492492, float:6.3469493E-28)
            r16 = r16 ^ r17
            if (r16 != 0) goto L_0x033f
            r2 = r4 & 5851(0x16db, float:8.199E-42)
            r2 = r2 ^ 1170(0x492, float:1.64E-42)
            if (r2 != 0) goto L_0x033f
            boolean r2 = r6.b()
            if (r2 != 0) goto L_0x0337
            goto L_0x033f
        L_0x0337:
            r6.h()
            r10 = r49
            r1 = r6
            goto L_0x0429
        L_0x033f:
            if (r0 == 0) goto L_0x0345
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0347
        L_0x0345:
            r0 = r49
        L_0x0347:
            r2 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r6.E(r2)
            java.lang.Object r2 = r6.F()
            e0.g$a r16 = e0.g.f14172a
            r17 = r4
            java.lang.Object r4 = r16.a()
            if (r2 != r4) goto L_0x036f
            t0.l$a r2 = t0.l.f16682b
            long r18 = r2.b()
            t0.l r2 = t0.l.c(r18)
            r4 = 0
            r11 = 0
            r12 = 2
            e0.h0 r2 = androidx.compose.runtime.j.e(r2, r4, r12, r11)
            r6.y(r2)
        L_0x036f:
            r6.P()
            e0.h0 r2 = (e0.h0) r2
            if (r7 == 0) goto L_0x0389
            p0.d$a r18 = p0.d.f16037h0
            r19 = 0
            float r20 = f5102b
            r21 = 0
            r22 = 0
            r23 = 13
            r24 = 0
            p0.d r4 = androidx.compose.foundation.layout.PaddingKt.m(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x038b
        L_0x0389:
            p0.d$a r4 = p0.d.f16037h0
        L_0x038b:
            p0.d r4 = r1.N(r4)
            c0.e0 r11 = c0.e0.f12691a
            float r12 = r11.b()
            float r11 = r11.a()
            p0.d r4 = androidx.compose.foundation.layout.SizeKt.g(r4, r12, r11)
            p0.d r4 = androidx.compose.foundation.BackgroundKt.c(r4, r8, r3)
            r11 = r17
            u0.k1 r12 = new u0.k1
            r15 = r12
            r1 = 0
            r12.<init>(r13, r1)
            r13 = r1
            r1 = -819911221(0xffffffffcf2125cb, float:-2.70360858E9)
            r3 = 1
            androidx.compose.material.OutlinedTextFieldKt$OutlinedTextFieldLayout$1 r12 = new androidx.compose.material.OutlinedTextFieldKt$OutlinedTextFieldLayout$1
            r16 = r12
            r17 = r2
            r18 = r52
            r19 = r53
            r20 = r54
            r21 = r55
            r22 = r48
            r23 = r56
            r25 = r58
            r27 = r60
            r28 = r10
            r29 = r68
            r30 = r61
            r31 = r62
            r33 = r5
            r34 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r25, r27, r28, r29, r30, r31, r33, r34)
            l0.a r16 = l0.b.b(r6, r1, r3, r12)
            int r1 = r5 >> 3
            r2 = r1 & 14
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r2 = r5 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = r5 & r35
            r1 = r1 | r2
            int r2 = r5 >> 6
            r2 = r2 & r36
            r1 = r1 | r2
            int r2 = r5 << 3
            r3 = r2 & r37
            r1 = r1 | r3
            int r3 = a0.g.f824h
            int r3 = r3 << 21
            r1 = r1 | r3
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r3
            r1 = r1 | r2
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r5
            r1 = r1 | r2
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r5
            r18 = r1 | r2
            r1 = r10 & 14
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            int r2 = r10 << 3
            r2 = r2 & 896(0x380, float:1.256E-42)
            r19 = r1 | r2
            r20 = 2048(0x800, float:2.87E-42)
            r2 = r41
            r3 = r42
            r5 = r43
            r1 = r6
            r6 = r44
            r7 = r47
            r8 = r45
            r9 = r46
            r10 = r48
            r11 = r0
            r12 = r50
            r14 = r51
            r17 = r1
            androidx.compose.foundation.text.BasicTextFieldKt.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r10 = r0
        L_0x0429:
            e0.s0 r15 = r1.v()
            if (r15 != 0) goto L_0x0430
            goto L_0x0477
        L_0x0430:
            androidx.compose.material.OutlinedTextFieldKt$OutlinedTextFieldLayout$2 r14 = new androidx.compose.material.OutlinedTextFieldKt$OutlinedTextFieldLayout$2
            r0 = r14
            r1 = r40
            r2 = r41
            r3 = r42
            r4 = r43
            r5 = r44
            r6 = r45
            r7 = r46
            r8 = r47
            r9 = r48
            r11 = r50
            r12 = r51
            r13 = r52
            r38 = r14
            r14 = r53
            r39 = r15
            r15 = r54
            r16 = r55
            r17 = r56
            r19 = r58
            r21 = r60
            r22 = r61
            r23 = r62
            r25 = r64
            r27 = r66
            r29 = r68
            r30 = r70
            r31 = r71
            r32 = r72
            r33 = r73
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r22, r23, r25, r27, r29, r30, r31, r32, r33)
            r1 = r38
            r0 = r39
            r0.a(r1)
        L_0x0477:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.f(p0.d, androidx.compose.ui.text.input.TextFieldValue, lp0.l, boolean, boolean, a0.i, a0.g, p1.c0, boolean, int, v1.f0, u.k, lp0.q, lp0.p, lp0.p, lp0.p, long, long, float, float, long, long, long, u0.j1, e0.g, int, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final int m(int i11, int i12, int i13, int i14, int i15, long j, float f11) {
        int max = Math.max(i13, i15);
        float h11 = TextFieldImplKt.h() * f11;
        return Math.max(b.o(j), Math.max(i11, Math.max(i12, c.c(((float) max) + h11 + Math.max(h11, ((float) i14) / 2.0f)))));
    }

    /* access modifiers changed from: private */
    public static final int n(int i11, int i12, int i13, int i14, int i15, long j) {
        return Math.max(i11 + Math.max(i13, Math.max(i14, i15)) + i12, b.p(j));
    }

    private static final d o(d dVar, long j) {
        return DrawModifierKt.c(dVar, new OutlinedTextFieldKt$outlineCutout$1(j));
    }

    private static final d p(d dVar, j1 j1Var, float f11, long j, long j11) {
        return BorderKt.h(o(dVar, j11), f11, j, j1Var);
    }

    /* access modifiers changed from: private */
    public static final void q(e0.a aVar, int i11, int i12, e0 e0Var, e0 e0Var2, e0 e0Var3, e0 e0Var4, e0 e0Var5, e0 e0Var6, float f11, boolean z11, float f12) {
        float f13;
        int i13 = i11;
        int c11 = c.c(TextFieldImplKt.h() * f12);
        float e11 = TextFieldImplKt.e() * f12;
        if (e0Var != null) {
            e0.a.n(aVar, e0Var, 0, p0.a.f16019a.i().a(e0Var.e0(), i13), 0.0f, 4, (Object) null);
        }
        if (e0Var2 != null) {
            e0.a.n(aVar, e0Var2, i12 - e0Var2.A0(), p0.a.f16019a.i().a(e0Var2.e0(), i13), 0.0f, 4, (Object) null);
        }
        if (e0Var4 != null) {
            float f14 = ((float) 1) - f11;
            float a11 = (((float) (z11 ? p0.a.f16019a.i().a(e0Var4.e0(), i13) : c11)) * f14) - (((float) (e0Var4.e0() / 2)) * f11);
            if (e0Var == null) {
                f13 = 0.0f;
            } else {
                f13 = f14 * (((float) TextFieldImplKt.k(e0Var)) - e11);
            }
            e0.a.n(aVar, e0Var4, c.c(f13) + c11, c.c(a11), 0.0f, 4, (Object) null);
        }
        e0.a.n(aVar, e0Var3, TextFieldImplKt.k(e0Var), z11 ? p0.a.f16019a.i().a(e0Var3.e0(), i13) : c11, 0.0f, 4, (Object) null);
        if (e0Var5 != null) {
            if (z11) {
                c11 = p0.a.f16019a.i().a(e0Var5.e0(), i13);
            }
            e0.a.n(aVar, e0Var5, TextFieldImplKt.k(e0Var), c11, 0.0f, 4, (Object) null);
        }
        e0.a.l(aVar, e0Var6, d2.l.f14010b.a(), 0.0f, 2, (Object) null);
    }
}
