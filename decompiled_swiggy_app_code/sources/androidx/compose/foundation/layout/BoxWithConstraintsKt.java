package androidx.compose.foundation.layout;

/* compiled from: BoxWithConstraints.kt */
public final class BoxWithConstraintsKt {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(p0.d r12, p0.a r13, boolean r14, lp0.q<? super defpackage.a2.f, ? super e0.g, ? super java.lang.Integer, bp0.k> r15, e0.g r16, int r17, int r18) {
        /*
            r4 = r15
            r5 = r17
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r15, r0)
            r0 = 1781813501(0x6a3450fd, float:5.4497275E25)
            r1 = r16
            e0.g r0 = r1.t(r0)
            r1 = r18 & 1
            if (r1 == 0) goto L_0x001a
            r2 = r5 | 6
            r3 = r2
            r2 = r12
            goto L_0x002c
        L_0x001a:
            r2 = r5 & 14
            if (r2 != 0) goto L_0x002a
            r2 = r12
            boolean r3 = r0.k(r12)
            if (r3 == 0) goto L_0x0027
            r3 = 4
            goto L_0x0028
        L_0x0027:
            r3 = 2
        L_0x0028:
            r3 = r3 | r5
            goto L_0x002c
        L_0x002a:
            r2 = r12
            r3 = r5
        L_0x002c:
            r6 = r18 & 2
            if (r6 == 0) goto L_0x0033
            r3 = r3 | 48
            goto L_0x0045
        L_0x0033:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0045
            r7 = r13
            boolean r8 = r0.k(r13)
            if (r8 == 0) goto L_0x0041
            r8 = 32
            goto L_0x0043
        L_0x0041:
            r8 = 16
        L_0x0043:
            r3 = r3 | r8
            goto L_0x0046
        L_0x0045:
            r7 = r13
        L_0x0046:
            r8 = r18 & 4
            if (r8 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004d:
            r9 = r5 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x005f
            r9 = r14
            boolean r10 = r0.m(r14)
            if (r10 == 0) goto L_0x005b
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r3 = r3 | r10
            goto L_0x0060
        L_0x005f:
            r9 = r14
        L_0x0060:
            r10 = r18 & 8
            if (r10 == 0) goto L_0x0067
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0077
        L_0x0067:
            r10 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0077
            boolean r10 = r0.k(r15)
            if (r10 == 0) goto L_0x0074
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r3 = r3 | r10
        L_0x0077:
            r10 = r3 & 5851(0x16db, float:8.199E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r10 != r11) goto L_0x008b
            boolean r10 = r0.b()
            if (r10 != 0) goto L_0x0084
            goto L_0x008b
        L_0x0084:
            r0.h()
            r1 = r2
            r2 = r7
        L_0x0089:
            r3 = r9
            goto L_0x00da
        L_0x008b:
            if (r1 == 0) goto L_0x0090
            p0.d$a r1 = p0.d.f16037h0
            goto L_0x0091
        L_0x0090:
            r1 = r2
        L_0x0091:
            if (r6 == 0) goto L_0x009a
            p0.a$a r2 = p0.a.f16019a
            p0.a r2 = r2.o()
            goto L_0x009b
        L_0x009a:
            r2 = r7
        L_0x009b:
            r6 = 0
            if (r8 == 0) goto L_0x009f
            r9 = 0
        L_0x009f:
            int r7 = r3 >> 3
            r8 = r7 & 14
            r7 = r7 & 112(0x70, float:1.57E-43)
            r7 = r7 | r8
            i1.t r7 = androidx.compose.foundation.layout.BoxKt.h(r2, r9, r0, r7)
            r8 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r0.E(r8)
            boolean r8 = r0.k(r15)
            boolean r10 = r0.k(r7)
            r8 = r8 | r10
            java.lang.Object r10 = r0.F()
            if (r8 != 0) goto L_0x00c7
            e0.g$a r8 = e0.g.f14172a
            java.lang.Object r8 = r8.a()
            if (r10 != r8) goto L_0x00cf
        L_0x00c7:
            androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1 r10 = new androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1
            r10.<init>(r7, r15, r3)
            r0.y(r10)
        L_0x00cf:
            r0.P()
            lp0.p r10 = (lp0.p) r10
            r3 = r3 & 14
            androidx.compose.ui.layout.SubcomposeLayoutKt.b(r1, r10, r0, r3, r6)
            goto L_0x0089
        L_0x00da:
            e0.s0 r7 = r0.v()
            if (r7 != 0) goto L_0x00e1
            goto L_0x00ef
        L_0x00e1:
            androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$2 r8 = new androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$2
            r0 = r8
            r4 = r15
            r5 = r17
            r6 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.BoxWithConstraintsKt.a(p0.d, p0.a, boolean, lp0.q, e0.g, int, int):void");
    }
}
