package androidx.compose.material;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import bp0.k;
import c0.x;
import c0.y;
import d2.h;
import defpackage.v1;
import e0.g;
import e0.s0;
import fp0.c;
import kotlin.jvm.internal.i;
import lp0.a;
import lp0.l;
import lp0.p;
import org.apache.fontbox.ttf.OS2WindowsMetricsTable;
import p0.d;
import u0.d0;

/* compiled from: Drawer.kt */
public final class DrawerKt {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f4978a = h.n((float) 56);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final float f4979b = h.n((float) OS2WindowsMetricsTable.WEIGHT_CLASS_NORMAL);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final v1.p0<Float> f4980c = new v1.p0(256, 0, (v1.y) null, 6, (i) null);

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(lp0.q<? super defpackage.a2.h, ? super e0.g, ? super java.lang.Integer, bp0.k> r34, p0.d r35, androidx.compose.material.DrawerState r36, boolean r37, u0.j1 r38, float r39, long r40, long r42, long r44, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r46, e0.g r47, int r48, int r49) {
        /*
            r15 = r34
            r14 = r46
            r13 = r48
            r12 = r49
            java.lang.String r0 = "drawerContent"
            kotlin.jvm.internal.p.j(r15, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r14, r0)
            r0 = -73332094(0xfffffffffba10a82, float:-1.6723458E36)
            r1 = r47
            e0.g r11 = r1.t(r0)
            r0 = r12 & 1
            if (r0 == 0) goto L_0x0022
            r0 = r13 | 6
            goto L_0x0032
        L_0x0022:
            r0 = r13 & 14
            if (r0 != 0) goto L_0x0031
            boolean r0 = r11.k(r15)
            if (r0 == 0) goto L_0x002e
            r0 = 4
            goto L_0x002f
        L_0x002e:
            r0 = 2
        L_0x002f:
            r0 = r0 | r13
            goto L_0x0032
        L_0x0031:
            r0 = r13
        L_0x0032:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0039
            r0 = r0 | 48
            goto L_0x004c
        L_0x0039:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004c
            r3 = r35
            boolean r4 = r11.k(r3)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r0 = r0 | r4
            goto L_0x004e
        L_0x004c:
            r3 = r35
        L_0x004e:
            r4 = r13 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0067
            r4 = r12 & 4
            if (r4 != 0) goto L_0x0061
            r4 = r36
            boolean r5 = r11.k(r4)
            if (r5 == 0) goto L_0x0063
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0061:
            r4 = r36
        L_0x0063:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r0 = r0 | r5
            goto L_0x0069
        L_0x0067:
            r4 = r36
        L_0x0069:
            r5 = r12 & 8
            if (r5 == 0) goto L_0x0070
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r6 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x0083
            r6 = r37
            boolean r7 = r11.m(r6)
            if (r7 == 0) goto L_0x007f
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r0 = r0 | r7
            goto L_0x0085
        L_0x0083:
            r6 = r37
        L_0x0085:
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r13
            if (r7 != 0) goto L_0x00a0
            r7 = r12 & 16
            if (r7 != 0) goto L_0x009a
            r7 = r38
            boolean r8 = r11.k(r7)
            if (r8 == 0) goto L_0x009c
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r7 = r38
        L_0x009c:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r0 = r0 | r8
            goto L_0x00a2
        L_0x00a0:
            r7 = r38
        L_0x00a2:
            r8 = r12 & 32
            if (r8 == 0) goto L_0x00aa
            r9 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r9
            goto L_0x00be
        L_0x00aa:
            r9 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r13
            if (r9 != 0) goto L_0x00be
            r9 = r39
            boolean r10 = r11.n(r9)
            if (r10 == 0) goto L_0x00ba
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bc
        L_0x00ba:
            r10 = 65536(0x10000, float:9.18355E-41)
        L_0x00bc:
            r0 = r0 | r10
            goto L_0x00c0
        L_0x00be:
            r9 = r39
        L_0x00c0:
            r10 = 3670016(0x380000, float:5.142788E-39)
            r10 = r10 & r13
            if (r10 != 0) goto L_0x00dd
            r10 = r12 & 64
            if (r10 != 0) goto L_0x00d5
            r10 = r2
            r1 = r40
            boolean r16 = r11.q(r1)
            if (r16 == 0) goto L_0x00d8
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00da
        L_0x00d5:
            r10 = r2
            r1 = r40
        L_0x00d8:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00da:
            r0 = r0 | r16
            goto L_0x00e0
        L_0x00dd:
            r10 = r2
            r1 = r40
        L_0x00e0:
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r13 & r16
            if (r16 != 0) goto L_0x00fc
            r1 = r12 & 128(0x80, float:1.794E-43)
            if (r1 != 0) goto L_0x00f5
            r1 = r42
            boolean r16 = r11.q(r1)
            if (r16 == 0) goto L_0x00f7
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f9
        L_0x00f5:
            r1 = r42
        L_0x00f7:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f9:
            r0 = r0 | r16
            goto L_0x00fe
        L_0x00fc:
            r1 = r42
        L_0x00fe:
            r16 = 234881024(0xe000000, float:1.5777218E-30)
            r16 = r13 & r16
            if (r16 != 0) goto L_0x011a
            r1 = r12 & 256(0x100, float:3.59E-43)
            if (r1 != 0) goto L_0x0113
            r1 = r44
            boolean r16 = r11.q(r1)
            if (r16 == 0) goto L_0x0115
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0117
        L_0x0113:
            r1 = r44
        L_0x0115:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0117:
            r0 = r0 | r16
            goto L_0x011c
        L_0x011a:
            r1 = r44
        L_0x011c:
            r1 = r12 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0124
            r1 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0122:
            r0 = r0 | r1
            goto L_0x0135
        L_0x0124:
            r1 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r13
            if (r1 != 0) goto L_0x0135
            boolean r1 = r11.k(r14)
            if (r1 == 0) goto L_0x0132
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0122
        L_0x0132:
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0122
        L_0x0135:
            r1 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r1 = r1 & r0
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            r1 = r1 ^ r2
            if (r1 != 0) goto L_0x0157
            boolean r1 = r11.b()
            if (r1 != 0) goto L_0x0146
            goto L_0x0157
        L_0x0146:
            r11.h()
            r2 = r3
            r3 = r4
            r4 = r6
            r5 = r7
            r6 = r9
            r0 = r11
            r7 = r40
            r9 = r42
            r11 = r44
            goto L_0x02b6
        L_0x0157:
            r11.H()
            r1 = r13 & 1
            r16 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            r18 = -57345(0xffffffffffff1fff, float:NaN)
            if (r1 == 0) goto L_0x01a3
            boolean r1 = r11.i()
            if (r1 == 0) goto L_0x016e
            goto L_0x01a3
        L_0x016e:
            r11.h()
            r1 = r12 & 4
            if (r1 == 0) goto L_0x0177
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0177:
            r1 = r12 & 16
            if (r1 == 0) goto L_0x017d
            r0 = r0 & r18
        L_0x017d:
            r1 = r12 & 64
            if (r1 == 0) goto L_0x0183
            r0 = r0 & r17
        L_0x0183:
            r1 = r12 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0189
            r0 = r0 & r16
        L_0x0189:
            r1 = r12 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0191
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r0 = r0 & r1
        L_0x0191:
            r21 = r40
            r23 = r42
            r25 = r44
            r16 = r4
            r17 = r6
            r18 = r7
            r19 = r9
            r9 = r3
        L_0x01a0:
            r3 = r0
            goto L_0x0228
        L_0x01a3:
            if (r10 == 0) goto L_0x01a8
            p0.d$a r1 = p0.d.f16037h0
            goto L_0x01a9
        L_0x01a8:
            r1 = r3
        L_0x01a9:
            r3 = r12 & 4
            r10 = 6
            if (r3 == 0) goto L_0x01b9
            androidx.compose.material.DrawerValue r3 = androidx.compose.material.DrawerValue.Closed
            r2 = 2
            r4 = 0
            androidx.compose.material.DrawerState r2 = i(r3, r4, r11, r10, r2)
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x01ba
        L_0x01b9:
            r2 = r4
        L_0x01ba:
            if (r5 == 0) goto L_0x01bd
            r6 = 1
        L_0x01bd:
            r3 = r12 & 16
            if (r3 == 0) goto L_0x01ce
            c0.q r3 = c0.q.f12737a
            c0.u r3 = r3.b(r11, r10)
            z.a r3 = r3.a()
            r0 = r0 & r18
            goto L_0x01cf
        L_0x01ce:
            r3 = r7
        L_0x01cf:
            if (r8 == 0) goto L_0x01d8
            c0.g r4 = c0.g.f12710a
            float r4 = r4.a()
            goto L_0x01d9
        L_0x01d8:
            r4 = r9
        L_0x01d9:
            r5 = r12 & 64
            if (r5 == 0) goto L_0x01ea
            c0.q r5 = c0.q.f12737a
            c0.c r5 = r5.a(r11, r10)
            long r7 = r5.n()
            r0 = r0 & r17
            goto L_0x01ec
        L_0x01ea:
            r7 = r40
        L_0x01ec:
            r5 = r12 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x01fb
            int r5 = r0 >> 18
            r5 = r5 & 14
            long r17 = androidx.compose.material.ColorsKt.b(r7, r11, r5)
            r0 = r0 & r16
            goto L_0x01fd
        L_0x01fb:
            r17 = r42
        L_0x01fd:
            r5 = r12 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L_0x0217
            c0.g r5 = c0.g.f12710a
            long r9 = r5.b(r11, r10)
            r5 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r0 = r0 & r5
            r16 = r2
            r19 = r4
            r21 = r7
            r25 = r9
            r23 = r17
            r9 = r1
            goto L_0x0222
        L_0x0217:
            r25 = r44
            r9 = r1
            r16 = r2
            r19 = r4
            r21 = r7
            r23 = r17
        L_0x0222:
            r18 = r3
            r17 = r6
            goto L_0x01a0
        L_0x0228:
            r11.A()
            r0 = -723524056(0xffffffffd4dfe628, float:-7.6931127E12)
            r11.E(r0)
            r0 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r11.E(r0)
            java.lang.Object r0 = r11.F()
            e0.g$a r1 = e0.g.f14172a
            java.lang.Object r1 = r1.a()
            if (r0 != r1) goto L_0x0252
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.f25631a
            wp0.j0 r0 = e0.u.i(r0, r11)
            e0.m r1 = new e0.m
            r1.<init>(r0)
            r11.y(r1)
            r0 = r1
        L_0x0252:
            r11.P()
            e0.m r0 = (e0.m) r0
            wp0.j0 r27 = r0.a()
            r11.P()
            r0 = 0
            r1 = 0
            r2 = 1
            p0.d r20 = androidx.compose.foundation.layout.SizeKt.l(r9, r0, r2, r1)
            r28 = 0
            r29 = 0
            r10 = -819899687(0xffffffffcf2152d9, float:-2.70656128E9)
            androidx.compose.material.DrawerKt$ModalDrawer$1 r7 = new androidx.compose.material.DrawerKt$ModalDrawer$1
            r0 = r7
            r1 = r16
            r8 = 1
            r2 = r17
            r4 = r25
            r6 = r18
            r15 = r7
            r7 = r21
            r30 = r9
            r9 = r23
            r31 = r11
            r11 = r19
            r12 = r46
            r13 = r27
            r14 = r34
            r0.<init>(r1, r2, r3, r4, r6, r7, r9, r11, r12, r13, r14)
            r0 = r31
            r1 = -819899687(0xffffffffcf2152d9, float:-2.70656128E9)
            r2 = 1
            l0.a r1 = l0.b.b(r0, r1, r2, r15)
            r2 = 3072(0xc00, float:4.305E-42)
            r3 = 6
            r35 = r20
            r36 = r28
            r37 = r29
            r38 = r1
            r39 = r0
            r40 = r2
            r41 = r3
            androidx.compose.foundation.layout.BoxWithConstraintsKt.a(r35, r36, r37, r38, r39, r40, r41)
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r11 = r25
            r2 = r30
        L_0x02b6:
            e0.s0 r15 = r0.v()
            if (r15 != 0) goto L_0x02bd
            goto L_0x02d6
        L_0x02bd:
            androidx.compose.material.DrawerKt$ModalDrawer$2 r14 = new androidx.compose.material.DrawerKt$ModalDrawer$2
            r0 = r14
            r1 = r34
            r13 = r46
            r32 = r14
            r14 = r48
            r33 = r15
            r15 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r13, r14, r15)
            r1 = r32
            r0 = r33
            r0.a(r1)
        L_0x02d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.a(lp0.q, p0.d, androidx.compose.material.DrawerState, boolean, u0.j1, float, long, long, long, lp0.p, e0.g, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void b(boolean z11, a<k> aVar, a<Float> aVar2, long j, g gVar, int i11) {
        int i12;
        d dVar;
        g t = gVar.t(1010553887);
        if ((i11 & 14) == 0) {
            i12 = (t.m(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= t.k(aVar) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= t.k(aVar2) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= t.q(j) ? 2048 : 1024;
        }
        if (((i12 & 5851) ^ 1170) != 0 || !t.b()) {
            String a11 = y.a(x.f12750a.a(), t, 6);
            t.E(1010554067);
            if (z11) {
                d.a aVar3 = d.f16037h0;
                t.E(-3686930);
                boolean k = t.k(aVar);
                Object F = t.F();
                if (k || F == g.f14172a.a()) {
                    F = new DrawerKt$Scrim$dismissDrawer$1$1(aVar, (c<? super DrawerKt$Scrim$dismissDrawer$1$1>) null);
                    t.y(F);
                }
                t.P();
                d c11 = SuspendingPointerInputFilterKt.c(aVar3, aVar, (p) F);
                t.E(-3686552);
                boolean k11 = t.k(a11) | t.k(aVar);
                Object F2 = t.F();
                if (k11 || F2 == g.f14172a.a()) {
                    F2 = new DrawerKt$Scrim$dismissDrawer$2$1(a11, aVar);
                    t.y(F2);
                }
                t.P();
                dVar = SemanticsModifierKt.b(c11, true, (l) F2);
            } else {
                dVar = d.f16037h0;
            }
            t.P();
            d N = SizeKt.l(d.f16037h0, 0.0f, 1, (Object) null).N(dVar);
            d0 h11 = d0.h(j);
            t.E(-3686552);
            boolean k12 = t.k(h11) | t.k(aVar2);
            Object F3 = t.F();
            if (k12 || F3 == g.f14172a.a()) {
                F3 = new DrawerKt$Scrim$1$1(j, aVar2);
                t.y(F3);
            }
            t.P();
            CanvasKt.a(N, (l) F3, t, 0);
        } else {
            t.h();
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new DrawerKt$Scrim$2(z11, aVar, aVar2, j, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final float h(float f11, float f12, float f13) {
        return l.l((f13 - f11) / (f12 - f11), 0.0f, 1.0f);
    }

    public static final DrawerState i(DrawerValue drawerValue, l<? super DrawerValue, Boolean> lVar, g gVar, int i11, int i12) {
        kotlin.jvm.internal.p.j(drawerValue, "initialValue");
        gVar.E(-1540949526);
        if ((i12 & 2) != 0) {
            lVar = DrawerKt$rememberDrawerState$1.f5033a;
        }
        DrawerState drawerState = (DrawerState) RememberSaveableKt.b(new Object[0], DrawerState.f5036b.a(lVar), (String) null, new DrawerKt$rememberDrawerState$2(drawerValue, lVar), gVar, 72, 4);
        gVar.P();
        return drawerState;
    }
}
