package androidx.compose.foundation.lazy.layout;

/* compiled from: LazyLayout.kt */
public final class LazyLayoutKt {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(x.d r13, p0.d r14, x.g r15, lp0.p<? super x.e, ? super d2.b, ? extends i1.u> r16, e0.g r17, int r18, int r19) {
        /*
            r1 = r13
            r4 = r16
            r5 = r18
            java.lang.String r0 = "itemProvider"
            kotlin.jvm.internal.p.j(r13, r0)
            java.lang.String r0 = "measurePolicy"
            kotlin.jvm.internal.p.j(r4, r0)
            r0 = 852831187(0x32d52bd3, float:2.4816392E-8)
            r2 = r17
            e0.g r0 = r2.t(r0)
            r2 = r19 & 1
            if (r2 == 0) goto L_0x001f
            r2 = r5 | 6
            goto L_0x002f
        L_0x001f:
            r2 = r5 & 14
            if (r2 != 0) goto L_0x002e
            boolean r2 = r0.k(r13)
            if (r2 == 0) goto L_0x002b
            r2 = 4
            goto L_0x002c
        L_0x002b:
            r2 = 2
        L_0x002c:
            r2 = r2 | r5
            goto L_0x002f
        L_0x002e:
            r2 = r5
        L_0x002f:
            r3 = r19 & 2
            if (r3 == 0) goto L_0x0036
            r2 = r2 | 48
            goto L_0x0048
        L_0x0036:
            r6 = r5 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0048
            r6 = r14
            boolean r7 = r0.k(r14)
            if (r7 == 0) goto L_0x0044
            r7 = 32
            goto L_0x0046
        L_0x0044:
            r7 = 16
        L_0x0046:
            r2 = r2 | r7
            goto L_0x0049
        L_0x0048:
            r6 = r14
        L_0x0049:
            r7 = r19 & 4
            if (r7 == 0) goto L_0x0050
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0062
        L_0x0050:
            r8 = r5 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0062
            r8 = r15
            boolean r9 = r0.k(r15)
            if (r9 == 0) goto L_0x005e
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r2 = r2 | r9
            goto L_0x0063
        L_0x0062:
            r8 = r15
        L_0x0063:
            r9 = r19 & 8
            if (r9 == 0) goto L_0x006a
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x007a
        L_0x006a:
            r9 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x007a
            boolean r9 = r0.k(r4)
            if (r9 == 0) goto L_0x0077
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r2 = r2 | r9
        L_0x007a:
            r9 = r2 & 5851(0x16db, float:8.199E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x008e
            boolean r9 = r0.b()
            if (r9 != 0) goto L_0x0087
            goto L_0x008e
        L_0x0087:
            r0.h()
            r2 = r6
            r3 = r8
            goto L_0x013a
        L_0x008e:
            if (r3 == 0) goto L_0x0093
            p0.d$a r3 = p0.d.f16037h0
            goto L_0x0094
        L_0x0093:
            r3 = r6
        L_0x0094:
            if (r7 == 0) goto L_0x0099
            r6 = 0
            r12 = r6
            goto L_0x009a
        L_0x0099:
            r12 = r8
        L_0x009a:
            r6 = r2 & 14
            e0.d1 r6 = androidx.compose.runtime.g.m(r13, r0, r6)
            r7 = 0
            m0.a r7 = androidx.compose.runtime.saveable.SaveableStateHolderKt.a(r0, r7)
            r8 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.E(r8)
            java.lang.Object r9 = r0.F()
            e0.g$a r10 = e0.g.f14172a
            java.lang.Object r11 = r10.a()
            if (r9 != r11) goto L_0x00c4
            androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory r9 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory
            androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$itemContentFactory$1$1 r11 = new androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$itemContentFactory$1$1
            r11.<init>(r6)
            r9.<init>(r7, r11)
            r0.y(r9)
        L_0x00c4:
            r0.P()
            androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory r9 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory) r9
            r0.E(r8)
            java.lang.Object r6 = r0.F()
            java.lang.Object r7 = r10.a()
            if (r6 != r7) goto L_0x00e3
            androidx.compose.ui.layout.SubcomposeLayoutState r6 = new androidx.compose.ui.layout.SubcomposeLayoutState
            androidx.compose.foundation.lazy.layout.a r7 = new androidx.compose.foundation.lazy.layout.a
            r7.<init>(r9)
            r6.<init>(r7)
            r0.y(r6)
        L_0x00e3:
            r0.P()
            androidx.compose.ui.layout.SubcomposeLayoutState r6 = (androidx.compose.ui.layout.SubcomposeLayoutState) r6
            r7 = 617316839(0x24cb81e7, float:8.825728E-17)
            r0.E(r7)
            if (r12 != 0) goto L_0x00f1
            goto L_0x0101
        L_0x00f1:
            int r7 = r2 >> 6
            r7 = r7 & 14
            r7 = r7 | 64
            int r8 = androidx.compose.ui.layout.SubcomposeLayoutState.f6787f
            int r8 = r8 << 6
            r7 = r7 | r8
            androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher_androidKt.a(r12, r9, r6, r0, r7)
            bp0.k r7 = bp0.k.f22762a
        L_0x0101:
            r0.P()
            r7 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r0.E(r7)
            boolean r7 = r0.k(r9)
            boolean r8 = r0.k(r4)
            r7 = r7 | r8
            java.lang.Object r8 = r0.F()
            if (r7 != 0) goto L_0x011f
            java.lang.Object r7 = r10.a()
            if (r8 != r7) goto L_0x0127
        L_0x011f:
            androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$2$1 r8 = new androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$2$1
            r8.<init>(r9, r4)
            r0.y(r8)
        L_0x0127:
            r0.P()
            lp0.p r8 = (lp0.p) r8
            int r7 = androidx.compose.ui.layout.SubcomposeLayoutState.f6787f
            r2 = r2 & 112(0x70, float:1.57E-43)
            r10 = r7 | r2
            r11 = 0
            r7 = r3
            r9 = r0
            androidx.compose.ui.layout.SubcomposeLayoutKt.a(r6, r7, r8, r9, r10, r11)
            r2 = r3
            r3 = r12
        L_0x013a:
            e0.s0 r7 = r0.v()
            if (r7 != 0) goto L_0x0141
            goto L_0x0151
        L_0x0141:
            androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3 r8 = new androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3
            r0 = r8
            r1 = r13
            r4 = r16
            r5 = r18
            r6 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0151:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutKt.a(x.d, p0.d, x.g, lp0.p, e0.g, int, int):void");
    }
}
