package androidx.compose.material;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import e0.f;
import e0.g;
import e0.s0;
import e0.t0;
import i1.t;
import in.juspay.hyper.constants.LogCategory;
import lp0.p;
import lp0.q;
import p0.a;
import p0.d;

/* compiled from: Snackbar.kt */
public final class SnackbarKt {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f5353a = h.n((float) 30);

    /* renamed from: b  reason: collision with root package name */
    private static final float f5354b = h.n((float) 16);

    /* renamed from: c  reason: collision with root package name */
    private static final float f5355c;

    /* renamed from: d  reason: collision with root package name */
    private static final float f5356d = h.n((float) 2);

    /* renamed from: e  reason: collision with root package name */
    private static final float f5357e = h.n((float) 6);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final float f5358f;

    /* renamed from: g  reason: collision with root package name */
    private static final float f5359g = h.n((float) 12);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final float f5360h = h.n((float) 48);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final float f5361i = h.n((float) 68);

    static {
        float f11 = (float) 8;
        f5355c = h.n(f11);
        f5358f = h.n(f11);
    }

    /* access modifiers changed from: private */
    public static final void a(p<? super g, ? super Integer, k> pVar, p<? super g, ? super Integer, k> pVar2, g gVar, int i11) {
        int i12;
        p<? super g, ? super Integer, k> pVar3 = pVar;
        p<? super g, ? super Integer, k> pVar4 = pVar2;
        int i13 = i11;
        g t = gVar.t(-829912271);
        if ((i13 & 14) == 0) {
            i12 = (t.k(pVar3) ? 4 : 2) | i13;
        } else {
            i12 = i13;
        }
        if ((i13 & 112) == 0) {
            i12 |= t.k(pVar4) ? 32 : 16;
        }
        if (((i12 & 91) ^ 18) != 0 || !t.b()) {
            d.a aVar = d.f16037h0;
            d n = SizeKt.n(aVar, 0.0f, 1, (Object) null);
            float f11 = f5354b;
            float f12 = f5355c;
            d m11 = PaddingKt.m(n, f11, 0.0f, f12, f5356d, 2, (Object) null);
            t.E(-1113030915);
            Arrangement.l h11 = Arrangement.f3654a.h();
            a.C0160a aVar2 = a.f16019a;
            t a11 = ColumnKt.a(h11, aVar2.k(), t, 0);
            t.E(1376089394);
            e eVar = (e) t.z(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) t.z(CompositionLocalsKt.j());
            n1 n1Var = (n1) t.z(CompositionLocalsKt.n());
            ComposeUiNode.Companion companion = ComposeUiNode.J;
            lp0.a<ComposeUiNode> a12 = companion.a();
            q<t0<ComposeUiNode>, g, Integer, k> b11 = LayoutKt.b(m11);
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
            Updater.c(a13, a11, companion.d());
            Updater.c(a13, eVar, companion.b());
            Updater.c(a13, layoutDirection, companion.c());
            Updater.c(a13, n1Var, companion.f());
            t.o();
            b11.invoke(t0.a(t0.b(t)), t, 0);
            t.E(2058660585);
            t.E(276693625);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3715a;
            t.E(71171629);
            d m12 = PaddingKt.m(AlignmentLineKt.g(aVar, f5353a, f5359g), 0.0f, 0.0f, f12, 0.0f, 11, (Object) null);
            t.E(-1990474327);
            t h12 = BoxKt.h(aVar2.o(), false, t, 0);
            t.E(1376089394);
            e eVar2 = (e) t.z(CompositionLocalsKt.e());
            LayoutDirection layoutDirection2 = (LayoutDirection) t.z(CompositionLocalsKt.j());
            n1 n1Var2 = (n1) t.z(CompositionLocalsKt.n());
            lp0.a<ComposeUiNode> a14 = companion.a();
            q<t0<ComposeUiNode>, g, Integer, k> b12 = LayoutKt.b(m12);
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
            Updater.c(a15, h12, companion.d());
            Updater.c(a15, eVar2, companion.b());
            Updater.c(a15, layoutDirection2, companion.c());
            Updater.c(a15, n1Var2, companion.f());
            t.o();
            b12.invoke(t0.a(t0.b(t)), t, 0);
            t.E(2058660585);
            t.E(-1253629305);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3698a;
            t.E(683214577);
            pVar3.invoke(t, Integer.valueOf(i12 & 14));
            t.P();
            t.P();
            t.P();
            t.d();
            t.P();
            t.P();
            d b13 = columnScopeInstance.b(aVar, aVar2.j());
            t.E(-1990474327);
            t h13 = BoxKt.h(aVar2.o(), false, t, 0);
            t.E(1376089394);
            e eVar3 = (e) t.z(CompositionLocalsKt.e());
            LayoutDirection layoutDirection3 = (LayoutDirection) t.z(CompositionLocalsKt.j());
            n1 n1Var3 = (n1) t.z(CompositionLocalsKt.n());
            lp0.a<ComposeUiNode> a16 = companion.a();
            q<t0<ComposeUiNode>, g, Integer, k> b14 = LayoutKt.b(b13);
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
            Updater.c(a17, h13, companion.d());
            Updater.c(a17, eVar3, companion.b());
            Updater.c(a17, layoutDirection3, companion.c());
            Updater.c(a17, n1Var3, companion.f());
            t.o();
            b14.invoke(t0.a(t0.b(t)), t, 0);
            t.E(2058660585);
            t.E(-1253629305);
            t.E(683214631);
            pVar4.invoke(t, Integer.valueOf((i12 >> 3) & 14));
            t.P();
            t.P();
            t.P();
            t.d();
            t.P();
            t.P();
            t.P();
            t.P();
            t.P();
            t.d();
            t.P();
            t.P();
        } else {
            t.h();
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new SnackbarKt$NewLineButtonSnackbar$2(pVar3, pVar4, i13));
        }
    }

    /* access modifiers changed from: private */
    public static final void b(p<? super g, ? super Integer, k> pVar, p<? super g, ? super Integer, k> pVar2, g gVar, int i11) {
        int i12;
        p<? super g, ? super Integer, k> pVar3 = pVar;
        p<? super g, ? super Integer, k> pVar4 = pVar2;
        int i13 = i11;
        g t = gVar.t(-1143069261);
        if ((i13 & 14) == 0) {
            i12 = (t.k(pVar3) ? 4 : 2) | i13;
        } else {
            i12 = i13;
        }
        if ((i13 & 112) == 0) {
            i12 |= t.k(pVar4) ? 32 : 16;
        }
        if (((i12 & 91) ^ 18) != 0 || !t.b()) {
            d.a aVar = d.f16037h0;
            d m11 = PaddingKt.m(aVar, f5354b, 0.0f, f5355c, 0.0f, 10, (Object) null);
            SnackbarKt$OneRowSnackbar$2 snackbarKt$OneRowSnackbar$2 = new SnackbarKt$OneRowSnackbar$2(LogCategory.ACTION, "text");
            t.E(1376089394);
            e eVar = (e) t.z(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) t.z(CompositionLocalsKt.j());
            n1 n1Var = (n1) t.z(CompositionLocalsKt.n());
            ComposeUiNode.Companion companion = ComposeUiNode.J;
            lp0.a<ComposeUiNode> a11 = companion.a();
            q<t0<ComposeUiNode>, g, Integer, k> b11 = LayoutKt.b(m11);
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
            Updater.c(a12, snackbarKt$OneRowSnackbar$2, companion.d());
            Updater.c(a12, eVar, companion.b());
            Updater.c(a12, layoutDirection, companion.c());
            Updater.c(a12, n1Var, companion.f());
            t.o();
            b11.invoke(t0.a(t0.b(t)), t, 0);
            t.E(2058660585);
            t.E(-849178871);
            d k = PaddingKt.k(LayoutIdKt.b(aVar, "text"), 0.0f, f5357e, 1, (Object) null);
            t.E(-1990474327);
            a.C0160a aVar2 = a.f16019a;
            t h11 = BoxKt.h(aVar2.o(), false, t, 0);
            t.E(1376089394);
            e eVar2 = (e) t.z(CompositionLocalsKt.e());
            LayoutDirection layoutDirection2 = (LayoutDirection) t.z(CompositionLocalsKt.j());
            n1 n1Var2 = (n1) t.z(CompositionLocalsKt.n());
            lp0.a<ComposeUiNode> a13 = companion.a();
            q<t0<ComposeUiNode>, g, Integer, k> b12 = LayoutKt.b(k);
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
            t.E(-202240392);
            pVar3.invoke(t, Integer.valueOf(i12 & 14));
            t.P();
            t.P();
            t.P();
            t.d();
            t.P();
            t.P();
            d b13 = LayoutIdKt.b(aVar, LogCategory.ACTION);
            t.E(-1990474327);
            t h12 = BoxKt.h(aVar2.o(), false, t, 0);
            t.E(1376089394);
            e eVar3 = (e) t.z(CompositionLocalsKt.e());
            LayoutDirection layoutDirection3 = (LayoutDirection) t.z(CompositionLocalsKt.j());
            n1 n1Var3 = (n1) t.z(CompositionLocalsKt.n());
            lp0.a<ComposeUiNode> a15 = companion.a();
            q<t0<ComposeUiNode>, g, Integer, k> b14 = LayoutKt.b(b13);
            if (!(t.u() instanceof e0.e)) {
                f.c();
            }
            t.f();
            if (t.s()) {
                t.K(a15);
            } else {
                t.c();
            }
            t.J();
            g a16 = Updater.a(t);
            Updater.c(a16, h12, companion.d());
            Updater.c(a16, eVar3, companion.b());
            Updater.c(a16, layoutDirection3, companion.c());
            Updater.c(a16, n1Var3, companion.f());
            t.o();
            b14.invoke(t0.a(t0.b(t)), t, 0);
            t.E(2058660585);
            t.E(-1253629305);
            t.E(-202240335);
            pVar4.invoke(t, Integer.valueOf((i12 >> 3) & 14));
            t.P();
            t.P();
            t.P();
            t.d();
            t.P();
            t.P();
            t.P();
            t.P();
            t.d();
            t.P();
        } else {
            t.h();
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new SnackbarKt$OneRowSnackbar$3(pVar3, pVar4, i13));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(p0.d r29, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r30, boolean r31, u0.j1 r32, long r33, long r35, float r37, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r38, e0.g r39, int r40, int r41) {
        /*
            r10 = r38
            r11 = r40
            r12 = r41
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r10, r0)
            r0 = 895524162(0x35609d42, float:8.3675343E-7)
            r1 = r39
            e0.g r0 = r1.t(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x001e
            r2 = r11 | 6
            r3 = r2
            r2 = r29
            goto L_0x0032
        L_0x001e:
            r2 = r11 & 14
            if (r2 != 0) goto L_0x002f
            r2 = r29
            boolean r3 = r0.k(r2)
            if (r3 == 0) goto L_0x002c
            r3 = 4
            goto L_0x002d
        L_0x002c:
            r3 = 2
        L_0x002d:
            r3 = r3 | r11
            goto L_0x0032
        L_0x002f:
            r2 = r29
            r3 = r11
        L_0x0032:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x0039
            r3 = r3 | 48
            goto L_0x004c
        L_0x0039:
            r5 = r11 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004c
            r5 = r30
            boolean r6 = r0.k(r5)
            if (r6 == 0) goto L_0x0048
            r6 = 32
            goto L_0x004a
        L_0x0048:
            r6 = 16
        L_0x004a:
            r3 = r3 | r6
            goto L_0x004e
        L_0x004c:
            r5 = r30
        L_0x004e:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0055
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r7 = r11 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0068
            r7 = r31
            boolean r8 = r0.m(r7)
            if (r8 == 0) goto L_0x0064
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r3 = r3 | r8
            goto L_0x006a
        L_0x0068:
            r7 = r31
        L_0x006a:
            r8 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0083
            r8 = r12 & 8
            if (r8 != 0) goto L_0x007d
            r8 = r32
            boolean r9 = r0.k(r8)
            if (r9 == 0) goto L_0x007f
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007d:
            r8 = r32
        L_0x007f:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r3 = r3 | r9
            goto L_0x0085
        L_0x0083:
            r8 = r32
        L_0x0085:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r11
            if (r9 != 0) goto L_0x009e
            r9 = r12 & 16
            r13 = r33
            if (r9 != 0) goto L_0x009a
            boolean r9 = r0.q(r13)
            if (r9 == 0) goto L_0x009a
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r3 = r3 | r9
            goto L_0x00a0
        L_0x009e:
            r13 = r33
        L_0x00a0:
            r9 = 458752(0x70000, float:6.42848E-40)
            r15 = r11 & r9
            if (r15 != 0) goto L_0x00b9
            r15 = r12 & 32
            r9 = r35
            if (r15 != 0) goto L_0x00b5
            boolean r15 = r0.q(r9)
            if (r15 == 0) goto L_0x00b5
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r3 = r3 | r15
            goto L_0x00bb
        L_0x00b9:
            r9 = r35
        L_0x00bb:
            r15 = r12 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r15 == 0) goto L_0x00c6
            r3 = r3 | r16
            r2 = r37
            goto L_0x00db
        L_0x00c6:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r11 & r17
            r2 = r37
            if (r17 != 0) goto L_0x00db
            boolean r17 = r0.n(r2)
            if (r17 == 0) goto L_0x00d7
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r3 = r3 | r17
        L_0x00db:
            r2 = r12 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00e5
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r2
            r10 = r38
            goto L_0x00f8
        L_0x00e5:
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r11
            r10 = r38
            if (r2 != 0) goto L_0x00f8
            boolean r2 = r0.k(r10)
            if (r2 == 0) goto L_0x00f5
            r2 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f7
        L_0x00f5:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f7:
            r3 = r3 | r2
        L_0x00f8:
            r2 = 23967451(0x16db6db, float:4.3661218E-38)
            r2 = r2 & r3
            r9 = 4793490(0x492492, float:6.71711E-39)
            r2 = r2 ^ r9
            if (r2 != 0) goto L_0x0118
            boolean r2 = r0.b()
            if (r2 != 0) goto L_0x0109
            goto L_0x0118
        L_0x0109:
            r0.h()
            r1 = r29
            r9 = r37
            r2 = r5
            r3 = r7
            r4 = r8
            r5 = r13
            r7 = r35
            goto L_0x01d9
        L_0x0118:
            r0.H()
            r2 = r11 & 1
            r9 = -458753(0xfffffffffff8ffff, float:NaN)
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            if (r2 == 0) goto L_0x0149
            boolean r2 = r0.i()
            if (r2 == 0) goto L_0x012c
            goto L_0x0149
        L_0x012c:
            r0.h()
            r1 = r12 & 8
            if (r1 == 0) goto L_0x0135
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0135:
            r1 = r12 & 16
            if (r1 == 0) goto L_0x013b
            r3 = r3 & r17
        L_0x013b:
            r1 = r12 & 32
            if (r1 == 0) goto L_0x0140
            r3 = r3 & r9
        L_0x0140:
            r1 = r29
            r25 = r35
            r4 = r37
            r6 = r3
            r2 = r13
            goto L_0x0199
        L_0x0149:
            if (r1 == 0) goto L_0x014e
            p0.d$a r1 = p0.d.f16037h0
            goto L_0x0150
        L_0x014e:
            r1 = r29
        L_0x0150:
            if (r4 == 0) goto L_0x0154
            r2 = 0
            r5 = r2
        L_0x0154:
            if (r6 == 0) goto L_0x0158
            r2 = 0
            r7 = 0
        L_0x0158:
            r2 = r12 & 8
            r4 = 6
            if (r2 == 0) goto L_0x016a
            c0.q r2 = c0.q.f12737a
            c0.u r2 = r2.b(r0, r4)
            z.a r2 = r2.c()
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r8 = r2
        L_0x016a:
            r2 = r12 & 16
            if (r2 == 0) goto L_0x0176
            c0.w r2 = c0.w.f12749a
            long r13 = r2.a(r0, r4)
            r3 = r3 & r17
        L_0x0176:
            r2 = r12 & 32
            if (r2 == 0) goto L_0x0188
            c0.q r2 = c0.q.f12737a
            c0.c r2 = r2.a(r0, r4)
            long r17 = r2.n()
            r2 = r3 & r9
            r3 = r2
            goto L_0x018a
        L_0x0188:
            r17 = r35
        L_0x018a:
            if (r15 == 0) goto L_0x0193
            float r2 = (float) r4
            float r2 = d2.h.n(r2)
            r4 = r2
            goto L_0x0195
        L_0x0193:
            r4 = r37
        L_0x0195:
            r6 = r3
            r2 = r13
            r25 = r17
        L_0x0199:
            r0.A()
            r19 = 0
            r9 = -819890581(0xffffffffcf21766b, float:-2.70889242E9)
            androidx.compose.material.SnackbarKt$Snackbar$1 r13 = new androidx.compose.material.SnackbarKt$Snackbar$1
            r13.<init>(r5, r10, r6, r7)
            r14 = 1
            l0.a r21 = l0.b.b(r0, r9, r14, r13)
            r9 = r6 & 14
            r9 = r9 | r16
            int r13 = r6 >> 6
            r14 = r13 & 112(0x70, float:1.57E-43)
            r9 = r9 | r14
            r14 = r13 & 896(0x380, float:1.256E-42)
            r9 = r9 | r14
            r13 = r13 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 | r13
            int r6 = r6 >> 3
            r13 = 458752(0x70000, float:6.42848E-40)
            r6 = r6 & r13
            r23 = r9 | r6
            r24 = 16
            r13 = r1
            r14 = r8
            r15 = r2
            r17 = r25
            r20 = r4
            r22 = r0
            androidx.compose.material.SurfaceKt.b(r13, r14, r15, r17, r19, r20, r21, r22, r23, r24)
            r9 = r4
            r4 = r8
            r27 = r2
            r2 = r5
            r5 = r27
            r3 = r7
            r7 = r25
        L_0x01d9:
            e0.s0 r13 = r0.v()
            if (r13 != 0) goto L_0x01e0
            goto L_0x01ef
        L_0x01e0:
            androidx.compose.material.SnackbarKt$Snackbar$2 r14 = new androidx.compose.material.SnackbarKt$Snackbar$2
            r0 = r14
            r10 = r38
            r11 = r40
            r12 = r41
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12)
            r13.a(r14)
        L_0x01ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarKt.c(p0.d, lp0.p, boolean, u0.j1, long, long, float, lp0.p, e0.g, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:140:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(c0.v r29, p0.d r30, boolean r31, u0.j1 r32, long r33, long r35, long r37, float r39, e0.g r40, int r41, int r42) {
        /*
            r1 = r29
            r12 = r41
            r13 = r42
            java.lang.String r0 = "snackbarData"
            kotlin.jvm.internal.p.j(r1, r0)
            r0 = 895527353(0x3560a9b9, float:8.369348E-7)
            r2 = r40
            e0.g r0 = r2.t(r0)
            r2 = r13 & 1
            if (r2 == 0) goto L_0x001b
            r2 = r12 | 6
            goto L_0x002b
        L_0x001b:
            r2 = r12 & 14
            if (r2 != 0) goto L_0x002a
            boolean r2 = r0.k(r1)
            if (r2 == 0) goto L_0x0027
            r2 = 4
            goto L_0x0028
        L_0x0027:
            r2 = 2
        L_0x0028:
            r2 = r2 | r12
            goto L_0x002b
        L_0x002a:
            r2 = r12
        L_0x002b:
            r3 = r13 & 2
            if (r3 == 0) goto L_0x0032
            r2 = r2 | 48
            goto L_0x0045
        L_0x0032:
            r4 = r12 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0045
            r4 = r30
            boolean r5 = r0.k(r4)
            if (r5 == 0) goto L_0x0041
            r5 = 32
            goto L_0x0043
        L_0x0041:
            r5 = 16
        L_0x0043:
            r2 = r2 | r5
            goto L_0x0047
        L_0x0045:
            r4 = r30
        L_0x0047:
            r5 = r13 & 4
            if (r5 == 0) goto L_0x004e
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r6 = r12 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0061
            r6 = r31
            boolean r7 = r0.m(r6)
            if (r7 == 0) goto L_0x005d
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r2 = r2 | r7
            goto L_0x0063
        L_0x0061:
            r6 = r31
        L_0x0063:
            r7 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007c
            r7 = r13 & 8
            if (r7 != 0) goto L_0x0076
            r7 = r32
            boolean r8 = r0.k(r7)
            if (r8 == 0) goto L_0x0078
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0076:
            r7 = r32
        L_0x0078:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r2 = r2 | r8
            goto L_0x007e
        L_0x007c:
            r7 = r32
        L_0x007e:
            r8 = 57344(0xe000, float:8.0356E-41)
            r9 = r12 & r8
            if (r9 != 0) goto L_0x009a
            r9 = r13 & 16
            if (r9 != 0) goto L_0x0094
            r9 = r33
            boolean r11 = r0.q(r9)
            if (r11 == 0) goto L_0x0096
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0094:
            r9 = r33
        L_0x0096:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r2 = r2 | r11
            goto L_0x009c
        L_0x009a:
            r9 = r33
        L_0x009c:
            r11 = 458752(0x70000, float:6.42848E-40)
            r14 = r12 & r11
            if (r14 != 0) goto L_0x00b8
            r14 = r13 & 32
            if (r14 != 0) goto L_0x00b1
            r14 = r35
            boolean r16 = r0.q(r14)
            if (r16 == 0) goto L_0x00b3
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b5
        L_0x00b1:
            r14 = r35
        L_0x00b3:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b5:
            r2 = r2 | r16
            goto L_0x00ba
        L_0x00b8:
            r14 = r35
        L_0x00ba:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r17 = r12 & r16
            if (r17 != 0) goto L_0x00d3
            r17 = r13 & 64
            r8 = r37
            if (r17 != 0) goto L_0x00cf
            boolean r10 = r0.q(r8)
            if (r10 == 0) goto L_0x00cf
            r10 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d1
        L_0x00cf:
            r10 = 524288(0x80000, float:7.34684E-40)
        L_0x00d1:
            r2 = r2 | r10
            goto L_0x00d5
        L_0x00d3:
            r8 = r37
        L_0x00d5:
            r10 = r13 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r10 == 0) goto L_0x00e0
            r2 = r2 | r17
            r11 = r39
            goto L_0x00f5
        L_0x00e0:
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r18 = r12 & r18
            r11 = r39
            if (r18 != 0) goto L_0x00f5
            boolean r19 = r0.n(r11)
            if (r19 == 0) goto L_0x00f1
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f3
        L_0x00f1:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f3:
            r2 = r2 | r19
        L_0x00f5:
            r19 = 23967451(0x16db6db, float:4.3661218E-38)
            r19 = r2 & r19
            r20 = 4793490(0x492492, float:6.71711E-39)
            r19 = r19 ^ r20
            if (r19 != 0) goto L_0x0114
            boolean r19 = r0.b()
            if (r19 != 0) goto L_0x0108
            goto L_0x0114
        L_0x0108:
            r0.h()
            r2 = r4
            r3 = r6
            r4 = r7
            r9 = r8
            r7 = r14
            r5 = r33
            goto L_0x0226
        L_0x0114:
            r0.H()
            r19 = r12 & 1
            r20 = -3670017(0xffffffffffc7ffff, float:NaN)
            r21 = -458753(0xfffffffffff8ffff, float:NaN)
            r22 = -57345(0xffffffffffff1fff, float:NaN)
            if (r19 == 0) goto L_0x0154
            boolean r19 = r0.i()
            if (r19 == 0) goto L_0x012b
            goto L_0x0154
        L_0x012b:
            r0.h()
            r3 = r13 & 8
            if (r3 == 0) goto L_0x0134
            r2 = r2 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0134:
            r3 = r13 & 16
            if (r3 == 0) goto L_0x013a
            r2 = r2 & r22
        L_0x013a:
            r3 = r13 & 32
            if (r3 == 0) goto L_0x0140
            r2 = r2 & r21
        L_0x0140:
            r3 = r13 & 64
            if (r3 == 0) goto L_0x0146
            r2 = r2 & r20
        L_0x0146:
            r3 = r4
            r4 = r6
            r5 = r7
            r6 = r33
            r27 = r14
            r14 = r2
            r2 = r11
            r10 = r8
            r8 = r27
            goto L_0x01b4
        L_0x0154:
            if (r3 == 0) goto L_0x0159
            p0.d$a r3 = p0.d.f16037h0
            goto L_0x015a
        L_0x0159:
            r3 = r4
        L_0x015a:
            if (r5 == 0) goto L_0x015e
            r4 = 0
            goto L_0x015f
        L_0x015e:
            r4 = r6
        L_0x015f:
            r5 = r13 & 8
            r6 = 6
            if (r5 == 0) goto L_0x0171
            c0.q r5 = c0.q.f12737a
            c0.u r5 = r5.b(r0, r6)
            z.a r5 = r5.c()
            r2 = r2 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0172
        L_0x0171:
            r5 = r7
        L_0x0172:
            r7 = r13 & 16
            if (r7 == 0) goto L_0x017f
            c0.w r7 = c0.w.f12749a
            long r23 = r7.a(r0, r6)
            r2 = r2 & r22
            goto L_0x0181
        L_0x017f:
            r23 = r33
        L_0x0181:
            r7 = r13 & 32
            if (r7 == 0) goto L_0x0191
            c0.q r7 = c0.q.f12737a
            c0.c r7 = r7.a(r0, r6)
            long r14 = r7.n()
            r2 = r2 & r21
        L_0x0191:
            r7 = r13 & 64
            if (r7 == 0) goto L_0x019e
            c0.w r7 = c0.w.f12749a
            long r7 = r7.b(r0, r6)
            r2 = r2 & r20
            goto L_0x019f
        L_0x019e:
            r7 = r8
        L_0x019f:
            if (r10 == 0) goto L_0x01ab
            float r6 = (float) r6
            float r6 = d2.h.n(r6)
            r10 = r7
            r8 = r14
            r14 = r2
            r2 = r6
            goto L_0x01b2
        L_0x01ab:
            r27 = r14
            r14 = r2
            r2 = r11
            r10 = r7
            r8 = r27
        L_0x01b2:
            r6 = r23
        L_0x01b4:
            r0.A()
            java.lang.String r15 = r29.b()
            if (r15 == 0) goto L_0x01d7
            androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1 r12 = new androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1
            r30 = r12
            r31 = r10
            r33 = r14
            r34 = r29
            r35 = r15
            r30.<init>(r31, r33, r34, r35)
            r30 = r10
            r10 = 1
            r15 = -819889186(0xffffffffcf217bde, float:-2.70924954E9)
            l0.a r11 = l0.b.b(r0, r15, r10, r12)
            goto L_0x01db
        L_0x01d7:
            r30 = r10
            r10 = 1
            r11 = 0
        L_0x01db:
            r15 = r11
            r11 = 12
            float r11 = (float) r11
            float r11 = d2.h.n(r11)
            p0.d r11 = androidx.compose.foundation.layout.PaddingKt.i(r3, r11)
            r12 = -819890114(0xffffffffcf21783e, float:-2.70901197E9)
            r32 = r3
            androidx.compose.material.SnackbarKt$Snackbar$3 r3 = new androidx.compose.material.SnackbarKt$Snackbar$3
            r3.<init>(r1)
            l0.a r23 = l0.b.b(r0, r12, r10, r3)
            r3 = r14 & 896(0x380, float:1.256E-42)
            r3 = r3 | r17
            r10 = r14 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r10
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r14
            r3 = r3 | r10
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r14
            r3 = r3 | r10
            int r10 = r14 >> 3
            r10 = r10 & r16
            r25 = r3 | r10
            r26 = 0
            r14 = r11
            r16 = r4
            r17 = r5
            r18 = r6
            r20 = r8
            r22 = r2
            r24 = r0
            c(r14, r15, r16, r17, r18, r20, r22, r23, r24, r25, r26)
            r11 = r2
            r3 = r4
            r4 = r5
            r5 = r6
            r7 = r8
            r9 = r30
            r2 = r32
        L_0x0226:
            e0.s0 r14 = r0.v()
            if (r14 != 0) goto L_0x022d
            goto L_0x023c
        L_0x022d:
            androidx.compose.material.SnackbarKt$Snackbar$4 r15 = new androidx.compose.material.SnackbarKt$Snackbar$4
            r0 = r15
            r1 = r29
            r12 = r41
            r13 = r42
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r11, r12, r13)
            r14.a(r15)
        L_0x023c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarKt.d(c0.v, p0.d, boolean, u0.j1, long, long, long, float, e0.g, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void e(p<? super g, ? super Integer, k> pVar, g gVar, int i11) {
        int i12;
        g t = gVar.t(-868771705);
        if ((i11 & 14) == 0) {
            i12 = (t.k(pVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((2 ^ (i12 & 11)) != 0 || !t.b()) {
            SnackbarKt$TextOnlySnackbar$2 snackbarKt$TextOnlySnackbar$2 = SnackbarKt$TextOnlySnackbar$2.f5412a;
            t.E(1376089394);
            d.a aVar = d.f16037h0;
            e eVar = (e) t.z(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) t.z(CompositionLocalsKt.j());
            n1 n1Var = (n1) t.z(CompositionLocalsKt.n());
            ComposeUiNode.Companion companion = ComposeUiNode.J;
            lp0.a<ComposeUiNode> a11 = companion.a();
            q<t0<ComposeUiNode>, g, Integer, k> b11 = LayoutKt.b(aVar);
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
            Updater.c(a12, snackbarKt$TextOnlySnackbar$2, companion.d());
            Updater.c(a12, eVar, companion.b());
            Updater.c(a12, layoutDirection, companion.c());
            Updater.c(a12, n1Var, companion.f());
            t.o();
            b11.invoke(t0.a(t0.b(t)), t, 0);
            t.E(2058660585);
            t.E(-1987608331);
            d j = PaddingKt.j(aVar, f5354b, f5357e);
            t.E(-1990474327);
            t h11 = BoxKt.h(a.f16019a.o(), false, t, 0);
            t.E(1376089394);
            e eVar2 = (e) t.z(CompositionLocalsKt.e());
            LayoutDirection layoutDirection2 = (LayoutDirection) t.z(CompositionLocalsKt.j());
            n1 n1Var2 = (n1) t.z(CompositionLocalsKt.n());
            lp0.a<ComposeUiNode> a13 = companion.a();
            q<t0<ComposeUiNode>, g, Integer, k> b12 = LayoutKt.b(j);
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
            t.E(1159675981);
            pVar.invoke(t, Integer.valueOf(i12 & 14));
            t.P();
            t.P();
            t.P();
            t.d();
            t.P();
            t.P();
            t.P();
            t.P();
            t.d();
            t.P();
        } else {
            t.h();
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new SnackbarKt$TextOnlySnackbar$3(pVar, i11));
        }
    }
}
