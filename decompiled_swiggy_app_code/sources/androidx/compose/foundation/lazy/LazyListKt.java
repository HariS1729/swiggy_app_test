package androidx.compose.foundation.lazy;

import e0.g;
import e0.s0;
import s.l;
import w.k;
import w.m;
import w.s;

/* compiled from: LazyList.kt */
public final class LazyListKt {
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(p0.d r35, androidx.compose.foundation.lazy.LazyListState r36, defpackage.a2.p r37, boolean r38, boolean r39, defpackage.y1.k r40, boolean r41, p0.a.b r42, androidx.compose.foundation.layout.Arrangement.l r43, p0.a.c r44, androidx.compose.foundation.layout.Arrangement.d r45, lp0.l<? super androidx.compose.foundation.lazy.c, bp0.k> r46, e0.g r47, int r48, int r49, int r50) {
        /*
            r1 = r35
            r0 = r36
            r15 = r37
            r14 = r38
            r13 = r39
            r12 = r40
            r11 = r46
            r10 = r48
            r9 = r50
            java.lang.String r2 = "modifier"
            kotlin.jvm.internal.p.j(r1, r2)
            java.lang.String r2 = "state"
            kotlin.jvm.internal.p.j(r0, r2)
            java.lang.String r2 = "contentPadding"
            kotlin.jvm.internal.p.j(r15, r2)
            java.lang.String r2 = "flingBehavior"
            kotlin.jvm.internal.p.j(r12, r2)
            java.lang.String r2 = "content"
            kotlin.jvm.internal.p.j(r11, r2)
            r2 = 955299798(0x38f0b7d6, float:1.1478334E-4)
            r3 = r47
            e0.g r8 = r3.t(r2)
            r2 = r9 & 1
            if (r2 == 0) goto L_0x003b
            r2 = r10 | 6
            goto L_0x004b
        L_0x003b:
            r2 = r10 & 14
            if (r2 != 0) goto L_0x004a
            boolean r2 = r8.k(r1)
            if (r2 == 0) goto L_0x0047
            r2 = 4
            goto L_0x0048
        L_0x0047:
            r2 = 2
        L_0x0048:
            r2 = r2 | r10
            goto L_0x004b
        L_0x004a:
            r2 = r10
        L_0x004b:
            r5 = r9 & 2
            if (r5 == 0) goto L_0x0052
            r2 = r2 | 48
            goto L_0x0062
        L_0x0052:
            r5 = r10 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0062
            boolean r5 = r8.k(r0)
            if (r5 == 0) goto L_0x005f
            r5 = 32
            goto L_0x0061
        L_0x005f:
            r5 = 16
        L_0x0061:
            r2 = r2 | r5
        L_0x0062:
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0069
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0079
        L_0x0069:
            r5 = r10 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0079
            boolean r5 = r8.k(r15)
            if (r5 == 0) goto L_0x0076
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0078
        L_0x0076:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0078:
            r2 = r2 | r5
        L_0x0079:
            r5 = r9 & 8
            if (r5 == 0) goto L_0x0080
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0090
        L_0x0080:
            r5 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0090
            boolean r5 = r8.m(r14)
            if (r5 == 0) goto L_0x008d
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x008f
        L_0x008d:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x008f:
            r2 = r2 | r5
        L_0x0090:
            r5 = r9 & 16
            r18 = 57344(0xe000, float:8.0356E-41)
            if (r5 == 0) goto L_0x009a
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00aa
        L_0x009a:
            r5 = r10 & r18
            if (r5 != 0) goto L_0x00aa
            boolean r5 = r8.m(r13)
            if (r5 == 0) goto L_0x00a7
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a9
        L_0x00a7:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x00a9:
            r2 = r2 | r5
        L_0x00aa:
            r5 = r9 & 32
            r16 = 458752(0x70000, float:6.42848E-40)
            if (r5 == 0) goto L_0x00b4
            r5 = 196608(0x30000, float:2.75506E-40)
        L_0x00b2:
            r2 = r2 | r5
            goto L_0x00c4
        L_0x00b4:
            r5 = r10 & r16
            if (r5 != 0) goto L_0x00c4
            boolean r5 = r8.k(r12)
            if (r5 == 0) goto L_0x00c1
            r5 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b2
        L_0x00c1:
            r5 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00b2
        L_0x00c4:
            r5 = r9 & 64
            r19 = 3670016(0x380000, float:5.142788E-39)
            if (r5 == 0) goto L_0x00ce
            r5 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 | r5
            goto L_0x00e2
        L_0x00ce:
            r5 = r10 & r19
            if (r5 != 0) goto L_0x00e2
            r5 = r41
            boolean r17 = r8.m(r5)
            if (r17 == 0) goto L_0x00dd
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00df
        L_0x00dd:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00df:
            r2 = r2 | r17
            goto L_0x00e4
        L_0x00e2:
            r5 = r41
        L_0x00e4:
            r3 = r9 & 128(0x80, float:1.794E-43)
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            if (r3 == 0) goto L_0x00f1
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 | r20
            r4 = r42
            goto L_0x0104
        L_0x00f1:
            r20 = r10 & r17
            r4 = r42
            if (r20 != 0) goto L_0x0104
            boolean r21 = r8.k(r4)
            if (r21 == 0) goto L_0x0100
            r21 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0102
        L_0x0100:
            r21 = 4194304(0x400000, float:5.877472E-39)
        L_0x0102:
            r2 = r2 | r21
        L_0x0104:
            r6 = r9 & 256(0x100, float:3.59E-43)
            r22 = 234881024(0xe000000, float:1.5777218E-30)
            if (r6 == 0) goto L_0x0111
            r23 = 100663296(0x6000000, float:2.4074124E-35)
            r2 = r2 | r23
            r7 = r43
            goto L_0x0124
        L_0x0111:
            r23 = r10 & r22
            r7 = r43
            if (r23 != 0) goto L_0x0124
            boolean r24 = r8.k(r7)
            if (r24 == 0) goto L_0x0120
            r24 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0122
        L_0x0120:
            r24 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0122:
            r2 = r2 | r24
        L_0x0124:
            r4 = r9 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x012f
            r24 = 805306368(0x30000000, float:4.656613E-10)
            r2 = r2 | r24
            r5 = r44
            goto L_0x0144
        L_0x012f:
            r24 = 1879048192(0x70000000, float:1.58456325E29)
            r24 = r10 & r24
            r5 = r44
            if (r24 != 0) goto L_0x0144
            boolean r24 = r8.k(r5)
            if (r24 == 0) goto L_0x0140
            r24 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0142
        L_0x0140:
            r24 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0142:
            r2 = r2 | r24
        L_0x0144:
            r5 = r9 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x014d
            r20 = r49 | 6
            r7 = r45
            goto L_0x0163
        L_0x014d:
            r24 = r49 & 14
            r7 = r45
            if (r24 != 0) goto L_0x0161
            boolean r24 = r8.k(r7)
            if (r24 == 0) goto L_0x015c
            r20 = 4
            goto L_0x015e
        L_0x015c:
            r20 = 2
        L_0x015e:
            r20 = r49 | r20
            goto L_0x0163
        L_0x0161:
            r20 = r49
        L_0x0163:
            r7 = r9 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x016a
            r20 = r20 | 48
            goto L_0x017b
        L_0x016a:
            r7 = r49 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x017b
            boolean r7 = r8.k(r11)
            if (r7 == 0) goto L_0x0177
            r21 = 32
            goto L_0x0179
        L_0x0177:
            r21 = 16
        L_0x0179:
            r20 = r20 | r21
        L_0x017b:
            r7 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r7 = r7 & r2
            r9 = 306783378(0x12492492, float:6.3469493E-28)
            if (r7 != r9) goto L_0x019f
            r7 = r20 & 91
            r9 = 18
            if (r7 != r9) goto L_0x019f
            boolean r7 = r8.b()
            if (r7 != 0) goto L_0x0191
            goto L_0x019f
        L_0x0191:
            r8.h()
            r9 = r43
            r10 = r44
            r11 = r45
            r12 = r8
            r8 = r42
            goto L_0x035a
        L_0x019f:
            r7 = 0
            if (r3 == 0) goto L_0x01a5
            r21 = r7
            goto L_0x01a7
        L_0x01a5:
            r21 = r42
        L_0x01a7:
            if (r6 == 0) goto L_0x01ac
            r23 = r7
            goto L_0x01ae
        L_0x01ac:
            r23 = r43
        L_0x01ae:
            if (r4 == 0) goto L_0x01b3
            r24 = r7
            goto L_0x01b5
        L_0x01b3:
            r24 = r44
        L_0x01b5:
            if (r5 == 0) goto L_0x01ba
            r25 = r7
            goto L_0x01bc
        L_0x01ba:
            r25 = r45
        L_0x01bc:
            androidx.compose.foundation.gestures.b r3 = androidx.compose.foundation.gestures.b.f3627a
            r9 = 6
            s.l r7 = r3.b(r8, r9)
            int r3 = r2 >> 3
            r4 = r3 & 14
            r5 = r20 & 112(0x70, float:1.57E-43)
            r4 = r4 | r5
            w.k r6 = androidx.compose.foundation.lazy.LazyListItemProviderImplKt.d(r0, r11, r8, r4)
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8.E(r4)
            java.lang.Object r4 = r8.F()
            e0.g$a r5 = e0.g.f14172a
            java.lang.Object r9 = r5.a()
            if (r4 != r9) goto L_0x01e8
            w.e r4 = new w.e
            r4.<init>()
            r8.y(r4)
        L_0x01e8:
            r8.P()
            r9 = r4
            w.e r9 = (w.e) r9
            r4 = 773894976(0x2e20b340, float:3.6538994E-11)
            r8.E(r4)
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8.E(r4)
            java.lang.Object r4 = r8.F()
            java.lang.Object r10 = r5.a()
            if (r4 != r10) goto L_0x0213
            kotlin.coroutines.EmptyCoroutineContext r4 = kotlin.coroutines.EmptyCoroutineContext.f25631a
            wp0.j0 r4 = e0.u.i(r4, r8)
            e0.m r10 = new e0.m
            r10.<init>(r4)
            r8.y(r10)
            r4 = r10
        L_0x0213:
            r8.P()
            e0.m r4 = (e0.m) r4
            wp0.j0 r10 = r4.a()
            r8.P()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r39)
            r11 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r8.E(r11)
            boolean r11 = r8.k(r0)
            boolean r4 = r8.k(r4)
            r4 = r4 | r11
            java.lang.Object r11 = r8.F()
            if (r4 != 0) goto L_0x023e
            java.lang.Object r4 = r5.a()
            if (r11 != r4) goto L_0x0246
        L_0x023e:
            androidx.compose.foundation.lazy.LazyListItemPlacementAnimator r11 = new androidx.compose.foundation.lazy.LazyListItemPlacementAnimator
            r11.<init>(r10, r13)
            r8.y(r11)
        L_0x0246:
            r8.P()
            androidx.compose.foundation.lazy.LazyListItemPlacementAnimator r11 = (androidx.compose.foundation.lazy.LazyListItemPlacementAnimator) r11
            r0.x(r11)
            r5 = r2 & 112(0x70, float:1.57E-43)
            int r26 = f0.e.f14468d
            int r4 = r26 << 6
            r4 = r4 | r5
            int r27 = r2 << 6
            r28 = r27 & r18
            r4 = r4 | r28
            r28 = r27 & r16
            r4 = r4 | r28
            r16 = r27 & r19
            r4 = r4 | r16
            r16 = r2 & r17
            r4 = r4 | r16
            r3 = r3 & r22
            r3 = r3 | r4
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            int r16 = r20 << 27
            r4 = r16 & r4
            r16 = r3 | r4
            int r3 = r2 >> 24
            r3 = r3 & 14
            r17 = r3 | 64
            r20 = 0
            r4 = r2
            r2 = r6
            r3 = r36
            r29 = r4
            r4 = r9
            r1 = r5
            r5 = r7
            r30 = r6
            r6 = r37
            r31 = r7
            r7 = r38
            r43 = r8
            r8 = r39
            r42 = r9
            r22 = 6
            r9 = r21
            r27 = r10
            r10 = r24
            r32 = r11
            r11 = r25
            r12 = r23
            r13 = r32
            r14 = r43
            r15 = r16
            r16 = r17
            r17 = r20
            lp0.p r11 = f(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r12 = r43
            r13 = r30
            b(r13, r0, r12, r1)
            if (r39 == 0) goto L_0x02b9
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Vertical
            goto L_0x02bb
        L_0x02b9:
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Horizontal
        L_0x02bb:
            r14 = r2
            i1.g0 r2 = r36.q()
            r15 = r1
            r1 = r35
            p0.d r2 = r1.N(r2)
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r3 = r36.g()
            p0.d r2 = r2.N(r3)
            r10 = r29
            int r3 = r10 << 3
            r3 = r3 & 896(0x380, float:1.256E-42)
            r3 = r3 | 4096(0x1000, float:5.74E-42)
            r4 = r10 & r18
            r3 = r3 | r4
            r3 = r3 | r28
            r4 = r10 & r19
            r16 = r3 | r4
            r3 = r13
            r4 = r36
            r5 = r27
            r6 = r39
            r7 = r38
            r8 = r41
            r9 = r12
            r1 = r10
            r10 = r16
            p0.d r2 = androidx.compose.foundation.lazy.LazySemanticsKt.a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            p0.d r2 = s.e.a(r2, r14)
            int r3 = r26 << 6
            r3 = r3 | r15
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r7 = r3 | r1
            r3 = r36
            r4 = r42
            r5 = r38
            r6 = r12
            p0.d r1 = w.b.b(r2, r3, r4, r5, r6, r7)
            int r2 = r26 << 6
            r2 = r2 | r15
            p0.d r1 = w.o.a(r1, r0, r4, r12, r2)
            r5 = r31
            p0.d r2 = s.m.a(r1, r5)
            r1 = -908836175(0xffffffffc9d442b1, float:-1738838.1)
            r12.E(r1)
            r1 = r38 ^ 1
            e0.m0 r3 = androidx.compose.ui.platform.CompositionLocalsKt.j()
            java.lang.Object r3 = r12.z(r3)
            androidx.compose.ui.unit.LayoutDirection r4 = androidx.compose.ui.unit.LayoutDirection.Rtl
            if (r3 != r4) goto L_0x032c
            r3 = 1
            goto L_0x032d
        L_0x032c:
            r3 = 0
        L_0x032d:
            if (r3 == 0) goto L_0x0333
            if (r39 != 0) goto L_0x0333
            r1 = r1 ^ 1
        L_0x0333:
            r7 = r1
            r12.P()
            u.k r9 = r36.k()
            r3 = r36
            r4 = r14
            r6 = r41
            r8 = r40
            p0.d r4 = androidx.compose.foundation.gestures.ScrollableKt.h(r2, r3, r4, r5, r6, r7, r8, r9)
            x.g r5 = r36.n()
            r8 = 0
            r9 = 0
            r3 = r13
            r6 = r11
            r7 = r12
            androidx.compose.foundation.lazy.layout.LazyLayoutKt.a(r3, r4, r5, r6, r7, r8, r9)
            r8 = r21
            r9 = r23
            r10 = r24
            r11 = r25
        L_0x035a:
            e0.s0 r15 = r12.v()
            if (r15 != 0) goto L_0x0361
            goto L_0x0388
        L_0x0361:
            androidx.compose.foundation.lazy.LazyListKt$LazyList$2 r14 = new androidx.compose.foundation.lazy.LazyListKt$LazyList$2
            r0 = r14
            r1 = r35
            r2 = r36
            r3 = r37
            r4 = r38
            r5 = r39
            r6 = r40
            r7 = r41
            r12 = r46
            r13 = r48
            r33 = r14
            r14 = r49
            r34 = r15
            r15 = r50
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r33
            r0 = r34
            r0.a(r1)
        L_0x0388:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListKt.a(p0.d, androidx.compose.foundation.lazy.LazyListState, a2$p, boolean, boolean, y1$k, boolean, p0.a$b, androidx.compose.foundation.layout.Arrangement$l, p0.a$c, androidx.compose.foundation.layout.Arrangement$d, lp0.l, e0.g, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void b(k kVar, LazyListState lazyListState, g gVar, int i11) {
        int i12;
        g t = gVar.t(3173830);
        if ((i11 & 14) == 0) {
            i12 = (t.k(kVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= t.k(lazyListState) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && t.b()) {
            t.h();
        } else if (kVar.getItemCount() > 0) {
            lazyListState.B(kVar);
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new LazyListKt$ScrollPositionUpdater$1(kVar, lazyListState, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final void e(l lVar, m mVar) {
        boolean e11 = mVar.e();
        s g11 = mVar.g();
        boolean z11 = false;
        boolean z12 = ((g11 != null ? g11.b() : 0) == 0 && mVar.h() == 0) ? false : true;
        if (e11 || z12) {
            z11 = true;
        }
        lVar.setEnabled(z11);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1} */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        if (r1 == e0.g.f14172a.a()) goto L_0x007c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final lp0.p<x.e, d2.b, i1.u> f(w.k r17, androidx.compose.foundation.lazy.LazyListState r18, w.e r19, s.l r20, defpackage.a2.p r21, boolean r22, boolean r23, p0.a.b r24, p0.a.c r25, androidx.compose.foundation.layout.Arrangement.d r26, androidx.compose.foundation.layout.Arrangement.l r27, androidx.compose.foundation.lazy.LazyListItemPlacementAnimator r28, e0.g r29, int r30, int r31, int r32) {
        /*
            r0 = r29
            r1 = r32
            r2 = -1404987696(0xffffffffac4196d0, float:-2.7510667E-12)
            r0.E(r2)
            r2 = r1 & 128(0x80, float:1.794E-43)
            r3 = 0
            if (r2 == 0) goto L_0x0011
            r14 = r3
            goto L_0x0013
        L_0x0011:
            r14 = r24
        L_0x0013:
            r2 = r1 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0019
            r15 = r3
            goto L_0x001b
        L_0x0019:
            r15 = r25
        L_0x001b:
            r2 = r1 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0021
            r11 = r3
            goto L_0x0023
        L_0x0021:
            r11 = r26
        L_0x0023:
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0029
            r10 = r3
            goto L_0x002b
        L_0x0029:
            r10 = r27
        L_0x002b:
            r1 = 11
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r18
            r4 = 1
            r2[r4] = r19
            r4 = 2
            r2[r4] = r20
            r4 = 3
            r2[r4] = r21
            r4 = 4
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r22)
            r2[r4] = r5
            r4 = 5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r23)
            r2[r4] = r5
            r4 = 6
            r2[r4] = r14
            r4 = 7
            r2[r4] = r15
            r4 = 8
            r2[r4] = r11
            r4 = 9
            r2[r4] = r10
            r4 = 10
            r2[r4] = r28
            r4 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r0.E(r4)
            r4 = 0
        L_0x0062:
            if (r3 >= r1) goto L_0x006e
            r5 = r2[r3]
            boolean r5 = r0.k(r5)
            r4 = r4 | r5
            int r3 = r3 + 1
            goto L_0x0062
        L_0x006e:
            java.lang.Object r1 = r29.F()
            if (r4 != 0) goto L_0x007c
            e0.g$a r2 = e0.g.f14172a
            java.lang.Object r2 = r2.a()
            if (r1 != r2) goto L_0x0095
        L_0x007c:
            androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1 r1 = new androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
            r4 = r1
            r5 = r23
            r6 = r21
            r7 = r22
            r8 = r18
            r9 = r17
            r12 = r28
            r13 = r19
            r16 = r20
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.y(r1)
        L_0x0095:
            r29.P()
            lp0.p r1 = (lp0.p) r1
            r29.P()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListKt.f(w.k, androidx.compose.foundation.lazy.LazyListState, w.e, s.l, a2$p, boolean, boolean, p0.a$b, p0.a$c, androidx.compose.foundation.layout.Arrangement$d, androidx.compose.foundation.layout.Arrangement$l, androidx.compose.foundation.lazy.LazyListItemPlacementAnimator, e0.g, int, int, int):lp0.p");
    }
}
