package y0;

/* compiled from: PathNode.kt */
public final class e {
    /* JADX WARNING: type inference failed for: r12v2, types: [y0.d$m] */
    /* JADX WARNING: type inference failed for: r12v3, types: [y0.d$e] */
    /* JADX WARNING: type inference failed for: r12v6, types: [y0.d$m] */
    /* JADX WARNING: type inference failed for: r12v7, types: [y0.d$e] */
    /* JADX WARNING: type inference failed for: r8v25, types: [y0.d$m] */
    /* JADX WARNING: type inference failed for: r8v26, types: [y0.d$e] */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x03c2, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0675, code lost:
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x06f4, code lost:
        r19 = r19;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<y0.d> a(char r27, float[] r28) {
        /*
            r0 = r27
            r1 = r28
            java.lang.String r2 = "args"
            kotlin.jvm.internal.p.j(r1, r2)
            r2 = 1
            r3 = 0
            r4 = 122(0x7a, float:1.71E-43)
            if (r0 != r4) goto L_0x0011
        L_0x000f:
            r4 = 1
            goto L_0x0017
        L_0x0011:
            r4 = 90
            if (r0 != r4) goto L_0x0016
            goto L_0x000f
        L_0x0016:
            r4 = 0
        L_0x0017:
            if (r4 == 0) goto L_0x0021
            y0.d$b r0 = y0.d.b.f17904c
            java.util.List r0 = kotlin.collections.j.d(r0)
            goto L_0x06f8
        L_0x0021:
            r4 = 109(0x6d, float:1.53E-43)
            r5 = 2
            r6 = 10
            if (r0 != r4) goto L_0x007e
            rp0.f r0 = new rp0.f
            int r4 = r1.length
            int r4 = r4 - r5
            r0.<init>(r3, r4)
            rp0.d r0 = rp0.l.t(r0, r5)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = kotlin.collections.l.u(r0, r6)
            r4.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0040:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x007b
            r5 = r0
            cp0.m r5 = (cp0.m) r5
            int r5 = r5.b()
            int r6 = r5 + 2
            float[] r6 = kotlin.collections.g.p(r1, r5, r6)
            y0.d$n r7 = new y0.d$n
            r8 = r6[r3]
            r9 = r6[r2]
            r7.<init>(r8, r9)
            boolean r8 = r7 instanceof y0.d.f
            if (r8 == 0) goto L_0x006c
            if (r5 <= 0) goto L_0x006c
            y0.d$e r7 = new y0.d$e
            r5 = r6[r3]
            r6 = r6[r2]
            r7.<init>(r5, r6)
            goto L_0x0077
        L_0x006c:
            if (r5 <= 0) goto L_0x0077
            y0.d$m r7 = new y0.d$m
            r5 = r6[r3]
            r6 = r6[r2]
            r7.<init>(r5, r6)
        L_0x0077:
            r4.add(r7)
            goto L_0x0040
        L_0x007b:
            r0 = r4
            goto L_0x06f8
        L_0x007e:
            r4 = 77
            if (r0 != r4) goto L_0x00d5
            rp0.f r0 = new rp0.f
            int r4 = r1.length
            int r4 = r4 - r5
            r0.<init>(r3, r4)
            rp0.d r0 = rp0.l.t(r0, r5)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = kotlin.collections.l.u(r0, r6)
            r4.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x009a:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x007b
            r5 = r0
            cp0.m r5 = (cp0.m) r5
            int r5 = r5.b()
            int r6 = r5 + 2
            float[] r6 = kotlin.collections.g.p(r1, r5, r6)
            y0.d$f r7 = new y0.d$f
            r8 = r6[r3]
            r9 = r6[r2]
            r7.<init>(r8, r9)
            if (r5 <= 0) goto L_0x00c2
            y0.d$e r7 = new y0.d$e
            r5 = r6[r3]
            r6 = r6[r2]
            r7.<init>(r5, r6)
            goto L_0x00d1
        L_0x00c2:
            boolean r8 = r7 instanceof y0.d.n
            if (r8 == 0) goto L_0x00d1
            if (r5 <= 0) goto L_0x00d1
            y0.d$m r7 = new y0.d$m
            r5 = r6[r3]
            r6 = r6[r2]
            r7.<init>(r5, r6)
        L_0x00d1:
            r4.add(r7)
            goto L_0x009a
        L_0x00d5:
            r4 = 108(0x6c, float:1.51E-43)
            if (r0 != r4) goto L_0x0130
            rp0.f r0 = new rp0.f
            int r4 = r1.length
            int r4 = r4 - r5
            r0.<init>(r3, r4)
            rp0.d r0 = rp0.l.t(r0, r5)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = kotlin.collections.l.u(r0, r6)
            r4.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x00f1:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x007b
            r5 = r0
            cp0.m r5 = (cp0.m) r5
            int r5 = r5.b()
            int r6 = r5 + 2
            float[] r6 = kotlin.collections.g.p(r1, r5, r6)
            y0.d$m r7 = new y0.d$m
            r8 = r6[r3]
            r9 = r6[r2]
            r7.<init>(r8, r9)
            boolean r8 = r7 instanceof y0.d.f
            if (r8 == 0) goto L_0x011d
            if (r5 <= 0) goto L_0x011d
            y0.d$e r7 = new y0.d$e
            r5 = r6[r3]
            r6 = r6[r2]
            r7.<init>(r5, r6)
            goto L_0x012c
        L_0x011d:
            boolean r8 = r7 instanceof y0.d.n
            if (r8 == 0) goto L_0x012c
            if (r5 <= 0) goto L_0x012c
            y0.d$m r7 = new y0.d$m
            r5 = r6[r3]
            r6 = r6[r2]
            r7.<init>(r5, r6)
        L_0x012c:
            r4.add(r7)
            goto L_0x00f1
        L_0x0130:
            r4 = 76
            if (r0 != r4) goto L_0x018b
            rp0.f r0 = new rp0.f
            int r4 = r1.length
            int r4 = r4 - r5
            r0.<init>(r3, r4)
            rp0.d r0 = rp0.l.t(r0, r5)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = kotlin.collections.l.u(r0, r6)
            r4.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x014c:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x007b
            r5 = r0
            cp0.m r5 = (cp0.m) r5
            int r5 = r5.b()
            int r6 = r5 + 2
            float[] r6 = kotlin.collections.g.p(r1, r5, r6)
            y0.d$e r7 = new y0.d$e
            r8 = r6[r3]
            r9 = r6[r2]
            r7.<init>(r8, r9)
            boolean r8 = r7 instanceof y0.d.f
            if (r8 == 0) goto L_0x0178
            if (r5 <= 0) goto L_0x0178
            y0.d$e r7 = new y0.d$e
            r5 = r6[r3]
            r6 = r6[r2]
            r7.<init>(r5, r6)
            goto L_0x0187
        L_0x0178:
            boolean r8 = r7 instanceof y0.d.n
            if (r8 == 0) goto L_0x0187
            if (r5 <= 0) goto L_0x0187
            y0.d$m r7 = new y0.d$m
            r5 = r6[r3]
            r6 = r6[r2]
            r7.<init>(r5, r6)
        L_0x0187:
            r4.add(r7)
            goto L_0x014c
        L_0x018b:
            r4 = 104(0x68, float:1.46E-43)
            if (r0 != r4) goto L_0x01e4
            rp0.f r0 = new rp0.f
            int r4 = r1.length
            int r4 = r4 - r2
            r0.<init>(r3, r4)
            rp0.d r0 = rp0.l.t(r0, r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = kotlin.collections.l.u(r0, r6)
            r4.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x01a7:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x007b
            r5 = r0
            cp0.m r5 = (cp0.m) r5
            int r5 = r5.b()
            int r6 = r5 + 1
            float[] r6 = kotlin.collections.g.p(r1, r5, r6)
            y0.d$l r7 = new y0.d$l
            r8 = r6[r3]
            r7.<init>(r8)
            boolean r8 = r7 instanceof y0.d.f
            if (r8 == 0) goto L_0x01d1
            if (r5 <= 0) goto L_0x01d1
            y0.d$e r7 = new y0.d$e
            r5 = r6[r3]
            r6 = r6[r2]
            r7.<init>(r5, r6)
            goto L_0x01e0
        L_0x01d1:
            boolean r8 = r7 instanceof y0.d.n
            if (r8 == 0) goto L_0x01e0
            if (r5 <= 0) goto L_0x01e0
            y0.d$m r7 = new y0.d$m
            r5 = r6[r3]
            r6 = r6[r2]
            r7.<init>(r5, r6)
        L_0x01e0:
            r4.add(r7)
            goto L_0x01a7
        L_0x01e4:
            r4 = 72
            if (r0 != r4) goto L_0x023d
            rp0.f r0 = new rp0.f
            int r4 = r1.length
            int r4 = r4 - r2
            r0.<init>(r3, r4)
            rp0.d r0 = rp0.l.t(r0, r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = kotlin.collections.l.u(r0, r6)
            r4.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0200:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x007b
            r5 = r0
            cp0.m r5 = (cp0.m) r5
            int r5 = r5.b()
            int r6 = r5 + 1
            float[] r6 = kotlin.collections.g.p(r1, r5, r6)
            y0.d$d r7 = new y0.d$d
            r8 = r6[r3]
            r7.<init>(r8)
            boolean r8 = r7 instanceof y0.d.f
            if (r8 == 0) goto L_0x022a
            if (r5 <= 0) goto L_0x022a
            y0.d$e r7 = new y0.d$e
            r5 = r6[r3]
            r6 = r6[r2]
            r7.<init>(r5, r6)
            goto L_0x0239
        L_0x022a:
            boolean r8 = r7 instanceof y0.d.n
            if (r8 == 0) goto L_0x0239
            if (r5 <= 0) goto L_0x0239
            y0.d$m r7 = new y0.d$m
            r5 = r6[r3]
            r6 = r6[r2]
            r7.<init>(r5, r6)
        L_0x0239:
            r4.add(r7)
            goto L_0x0200
        L_0x023d:
            r4 = 118(0x76, float:1.65E-43)
            if (r0 != r4) goto L_0x0296
            rp0.f r0 = new rp0.f
            int r4 = r1.length
            int r4 = r4 - r2
            r0.<init>(r3, r4)
            rp0.d r0 = rp0.l.t(r0, r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = kotlin.collections.l.u(r0, r6)
            r4.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0259:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x007b
            r5 = r0
            cp0.m r5 = (cp0.m) r5
            int r5 = r5.b()
            int r6 = r5 + 1
            float[] r6 = kotlin.collections.g.p(r1, r5, r6)
            y0.d$r r7 = new y0.d$r
            r8 = r6[r3]
            r7.<init>(r8)
            boolean r8 = r7 instanceof y0.d.f
            if (r8 == 0) goto L_0x0283
            if (r5 <= 0) goto L_0x0283
            y0.d$e r7 = new y0.d$e
            r5 = r6[r3]
            r6 = r6[r2]
            r7.<init>(r5, r6)
            goto L_0x0292
        L_0x0283:
            boolean r8 = r7 instanceof y0.d.n
            if (r8 == 0) goto L_0x0292
            if (r5 <= 0) goto L_0x0292
            y0.d$m r7 = new y0.d$m
            r5 = r6[r3]
            r6 = r6[r2]
            r7.<init>(r5, r6)
        L_0x0292:
            r4.add(r7)
            goto L_0x0259
        L_0x0296:
            r4 = 86
            if (r0 != r4) goto L_0x02ef
            rp0.f r0 = new rp0.f
            int r4 = r1.length
            int r4 = r4 - r2
            r0.<init>(r3, r4)
            rp0.d r0 = rp0.l.t(r0, r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = kotlin.collections.l.u(r0, r6)
            r4.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x02b2:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x007b
            r5 = r0
            cp0.m r5 = (cp0.m) r5
            int r5 = r5.b()
            int r6 = r5 + 1
            float[] r6 = kotlin.collections.g.p(r1, r5, r6)
            y0.d$s r7 = new y0.d$s
            r8 = r6[r3]
            r7.<init>(r8)
            boolean r8 = r7 instanceof y0.d.f
            if (r8 == 0) goto L_0x02dc
            if (r5 <= 0) goto L_0x02dc
            y0.d$e r7 = new y0.d$e
            r5 = r6[r3]
            r6 = r6[r2]
            r7.<init>(r5, r6)
            goto L_0x02eb
        L_0x02dc:
            boolean r8 = r7 instanceof y0.d.n
            if (r8 == 0) goto L_0x02eb
            if (r5 <= 0) goto L_0x02eb
            y0.d$m r7 = new y0.d$m
            r5 = r6[r3]
            r6 = r6[r2]
            r7.<init>(r5, r6)
        L_0x02eb:
            r4.add(r7)
            goto L_0x02b2
        L_0x02ef:
            r4 = 99
            r7 = 5
            r8 = 6
            r9 = 3
            r10 = 4
            if (r0 != r4) goto L_0x0361
            rp0.f r0 = new rp0.f
            int r4 = r1.length
            int r4 = r4 - r8
            r0.<init>(r3, r4)
            rp0.d r0 = rp0.l.t(r0, r8)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = kotlin.collections.l.u(r0, r6)
            r4.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x030f:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x007b
            r6 = r0
            cp0.m r6 = (cp0.m) r6
            int r6 = r6.b()
            int r8 = r6 + 6
            float[] r8 = kotlin.collections.g.p(r1, r6, r8)
            y0.d$k r15 = new y0.d$k
            r12 = r8[r3]
            r13 = r8[r2]
            r14 = r8[r5]
            r16 = r8[r9]
            r17 = r8[r10]
            r18 = r8[r7]
            r11 = r15
            r7 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r11.<init>(r12, r13, r14, r15, r16, r17)
            boolean r11 = r7 instanceof y0.d.f
            if (r11 == 0) goto L_0x034b
            if (r6 <= 0) goto L_0x034b
            y0.d$e r15 = new y0.d$e
            r6 = r8[r3]
            r7 = r8[r2]
            r15.<init>(r6, r7)
            goto L_0x035c
        L_0x034b:
            boolean r11 = r7 instanceof y0.d.n
            if (r11 == 0) goto L_0x035b
            if (r6 <= 0) goto L_0x035b
            y0.d$m r15 = new y0.d$m
            r6 = r8[r3]
            r7 = r8[r2]
            r15.<init>(r6, r7)
            goto L_0x035c
        L_0x035b:
            r15 = r7
        L_0x035c:
            r4.add(r15)
            r7 = 5
            goto L_0x030f
        L_0x0361:
            r4 = 67
            if (r0 != r4) goto L_0x03c6
            rp0.f r0 = new rp0.f
            int r4 = r1.length
            int r4 = r4 - r8
            r0.<init>(r3, r4)
            rp0.d r0 = rp0.l.t(r0, r8)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = kotlin.collections.l.u(r0, r6)
            r4.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x037d:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x007b
            r6 = r0
            cp0.m r6 = (cp0.m) r6
            int r6 = r6.b()
            int r7 = r6 + 6
            float[] r7 = kotlin.collections.g.p(r1, r6, r7)
            y0.d$c r8 = new y0.d$c
            r12 = r7[r3]
            r13 = r7[r2]
            r14 = r7[r5]
            r15 = r7[r9]
            r16 = r7[r10]
            r11 = 5
            r17 = r7[r11]
            r11 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17)
            boolean r11 = r8 instanceof y0.d.f
            if (r11 == 0) goto L_0x03b3
            if (r6 <= 0) goto L_0x03b3
            y0.d$e r8 = new y0.d$e
            r6 = r7[r3]
            r7 = r7[r2]
            r8.<init>(r6, r7)
            goto L_0x03c2
        L_0x03b3:
            boolean r11 = r8 instanceof y0.d.n
            if (r11 == 0) goto L_0x03c2
            if (r6 <= 0) goto L_0x03c2
            y0.d$m r8 = new y0.d$m
            r6 = r7[r3]
            r7 = r7[r2]
            r8.<init>(r6, r7)
        L_0x03c2:
            r4.add(r8)
            goto L_0x037d
        L_0x03c6:
            r4 = 115(0x73, float:1.61E-43)
            if (r0 != r4) goto L_0x0425
            rp0.f r0 = new rp0.f
            int r4 = r1.length
            int r4 = r4 - r10
            r0.<init>(r3, r4)
            rp0.d r0 = rp0.l.t(r0, r10)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = kotlin.collections.l.u(r0, r6)
            r4.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x03e2:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x007b
            r6 = r0
            cp0.m r6 = (cp0.m) r6
            int r6 = r6.b()
            int r7 = r6 + 4
            float[] r7 = kotlin.collections.g.p(r1, r6, r7)
            y0.d$p r8 = new y0.d$p
            r10 = r7[r3]
            r11 = r7[r2]
            r12 = r7[r5]
            r13 = r7[r9]
            r8.<init>(r10, r11, r12, r13)
            boolean r10 = r8 instanceof y0.d.f
            if (r10 == 0) goto L_0x0412
            if (r6 <= 0) goto L_0x0412
            y0.d$e r8 = new y0.d$e
            r6 = r7[r3]
            r7 = r7[r2]
            r8.<init>(r6, r7)
            goto L_0x0421
        L_0x0412:
            boolean r10 = r8 instanceof y0.d.n
            if (r10 == 0) goto L_0x0421
            if (r6 <= 0) goto L_0x0421
            y0.d$m r8 = new y0.d$m
            r6 = r7[r3]
            r7 = r7[r2]
            r8.<init>(r6, r7)
        L_0x0421:
            r4.add(r8)
            goto L_0x03e2
        L_0x0425:
            r4 = 83
            if (r0 != r4) goto L_0x0484
            rp0.f r0 = new rp0.f
            int r4 = r1.length
            int r4 = r4 - r10
            r0.<init>(r3, r4)
            rp0.d r0 = rp0.l.t(r0, r10)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = kotlin.collections.l.u(r0, r6)
            r4.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x0441:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x007b
            r6 = r0
            cp0.m r6 = (cp0.m) r6
            int r6 = r6.b()
            int r7 = r6 + 4
            float[] r7 = kotlin.collections.g.p(r1, r6, r7)
            y0.d$h r8 = new y0.d$h
            r10 = r7[r3]
            r11 = r7[r2]
            r12 = r7[r5]
            r13 = r7[r9]
            r8.<init>(r10, r11, r12, r13)
            boolean r10 = r8 instanceof y0.d.f
            if (r10 == 0) goto L_0x0471
            if (r6 <= 0) goto L_0x0471
            y0.d$e r8 = new y0.d$e
            r6 = r7[r3]
            r7 = r7[r2]
            r8.<init>(r6, r7)
            goto L_0x0480
        L_0x0471:
            boolean r10 = r8 instanceof y0.d.n
            if (r10 == 0) goto L_0x0480
            if (r6 <= 0) goto L_0x0480
            y0.d$m r8 = new y0.d$m
            r6 = r7[r3]
            r7 = r7[r2]
            r8.<init>(r6, r7)
        L_0x0480:
            r4.add(r8)
            goto L_0x0441
        L_0x0484:
            r4 = 113(0x71, float:1.58E-43)
            if (r0 != r4) goto L_0x04e3
            rp0.f r0 = new rp0.f
            int r4 = r1.length
            int r4 = r4 - r10
            r0.<init>(r3, r4)
            rp0.d r0 = rp0.l.t(r0, r10)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = kotlin.collections.l.u(r0, r6)
            r4.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x04a0:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x007b
            r6 = r0
            cp0.m r6 = (cp0.m) r6
            int r6 = r6.b()
            int r7 = r6 + 4
            float[] r7 = kotlin.collections.g.p(r1, r6, r7)
            y0.d$o r8 = new y0.d$o
            r10 = r7[r3]
            r11 = r7[r2]
            r12 = r7[r5]
            r13 = r7[r9]
            r8.<init>(r10, r11, r12, r13)
            boolean r10 = r8 instanceof y0.d.f
            if (r10 == 0) goto L_0x04d0
            if (r6 <= 0) goto L_0x04d0
            y0.d$e r8 = new y0.d$e
            r6 = r7[r3]
            r7 = r7[r2]
            r8.<init>(r6, r7)
            goto L_0x04df
        L_0x04d0:
            boolean r10 = r8 instanceof y0.d.n
            if (r10 == 0) goto L_0x04df
            if (r6 <= 0) goto L_0x04df
            y0.d$m r8 = new y0.d$m
            r6 = r7[r3]
            r7 = r7[r2]
            r8.<init>(r6, r7)
        L_0x04df:
            r4.add(r8)
            goto L_0x04a0
        L_0x04e3:
            r4 = 81
            if (r0 != r4) goto L_0x0542
            rp0.f r0 = new rp0.f
            int r4 = r1.length
            int r4 = r4 - r10
            r0.<init>(r3, r4)
            rp0.d r0 = rp0.l.t(r0, r10)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = kotlin.collections.l.u(r0, r6)
            r4.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x04ff:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x007b
            r6 = r0
            cp0.m r6 = (cp0.m) r6
            int r6 = r6.b()
            int r7 = r6 + 4
            float[] r7 = kotlin.collections.g.p(r1, r6, r7)
            y0.d$g r8 = new y0.d$g
            r10 = r7[r3]
            r11 = r7[r2]
            r12 = r7[r5]
            r13 = r7[r9]
            r8.<init>(r10, r11, r12, r13)
            boolean r10 = r8 instanceof y0.d.f
            if (r10 == 0) goto L_0x052f
            if (r6 <= 0) goto L_0x052f
            y0.d$e r8 = new y0.d$e
            r6 = r7[r3]
            r7 = r7[r2]
            r8.<init>(r6, r7)
            goto L_0x053e
        L_0x052f:
            boolean r10 = r8 instanceof y0.d.n
            if (r10 == 0) goto L_0x053e
            if (r6 <= 0) goto L_0x053e
            y0.d$m r8 = new y0.d$m
            r6 = r7[r3]
            r7 = r7[r2]
            r8.<init>(r6, r7)
        L_0x053e:
            r4.add(r8)
            goto L_0x04ff
        L_0x0542:
            r4 = 116(0x74, float:1.63E-43)
            if (r0 != r4) goto L_0x059d
            rp0.f r0 = new rp0.f
            int r4 = r1.length
            int r4 = r4 - r5
            r0.<init>(r3, r4)
            rp0.d r0 = rp0.l.t(r0, r5)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = kotlin.collections.l.u(r0, r6)
            r4.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x055e:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x007b
            r5 = r0
            cp0.m r5 = (cp0.m) r5
            int r5 = r5.b()
            int r6 = r5 + 2
            float[] r6 = kotlin.collections.g.p(r1, r5, r6)
            y0.d$q r7 = new y0.d$q
            r8 = r6[r3]
            r9 = r6[r2]
            r7.<init>(r8, r9)
            boolean r8 = r7 instanceof y0.d.f
            if (r8 == 0) goto L_0x058a
            if (r5 <= 0) goto L_0x058a
            y0.d$e r7 = new y0.d$e
            r5 = r6[r3]
            r6 = r6[r2]
            r7.<init>(r5, r6)
            goto L_0x0599
        L_0x058a:
            boolean r8 = r7 instanceof y0.d.n
            if (r8 == 0) goto L_0x0599
            if (r5 <= 0) goto L_0x0599
            y0.d$m r7 = new y0.d$m
            r5 = r6[r3]
            r6 = r6[r2]
            r7.<init>(r5, r6)
        L_0x0599:
            r4.add(r7)
            goto L_0x055e
        L_0x059d:
            r4 = 84
            if (r0 != r4) goto L_0x05f8
            rp0.f r0 = new rp0.f
            int r4 = r1.length
            int r4 = r4 - r5
            r0.<init>(r3, r4)
            rp0.d r0 = rp0.l.t(r0, r5)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = kotlin.collections.l.u(r0, r6)
            r4.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x05b9:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x007b
            r5 = r0
            cp0.m r5 = (cp0.m) r5
            int r5 = r5.b()
            int r6 = r5 + 2
            float[] r6 = kotlin.collections.g.p(r1, r5, r6)
            y0.d$i r7 = new y0.d$i
            r8 = r6[r3]
            r9 = r6[r2]
            r7.<init>(r8, r9)
            boolean r8 = r7 instanceof y0.d.f
            if (r8 == 0) goto L_0x05e5
            if (r5 <= 0) goto L_0x05e5
            y0.d$e r7 = new y0.d$e
            r5 = r6[r3]
            r6 = r6[r2]
            r7.<init>(r5, r6)
            goto L_0x05f4
        L_0x05e5:
            boolean r8 = r7 instanceof y0.d.n
            if (r8 == 0) goto L_0x05f4
            if (r5 <= 0) goto L_0x05f4
            y0.d$m r7 = new y0.d$m
            r5 = r6[r3]
            r6 = r6[r2]
            r7.<init>(r5, r6)
        L_0x05f4:
            r4.add(r7)
            goto L_0x05b9
        L_0x05f8:
            r4 = 97
            r7 = 7
            r11 = 0
            if (r0 != r4) goto L_0x0679
            rp0.f r0 = new rp0.f
            int r4 = r1.length
            int r4 = r4 - r7
            r0.<init>(r3, r4)
            rp0.d r0 = rp0.l.t(r0, r7)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = kotlin.collections.l.u(r0, r6)
            r4.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x0616:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x007b
            r6 = r0
            cp0.m r6 = (cp0.m) r6
            int r6 = r6.b()
            int r7 = r6 + 7
            float[] r7 = kotlin.collections.g.p(r1, r6, r7)
            y0.d$j r12 = new y0.d$j
            r20 = r7[r3]
            r21 = r7[r2]
            r22 = r7[r5]
            r13 = r7[r9]
            int r13 = java.lang.Float.compare(r13, r11)
            if (r13 == 0) goto L_0x063c
            r23 = 1
            goto L_0x063e
        L_0x063c:
            r23 = 0
        L_0x063e:
            r13 = r7[r10]
            int r13 = java.lang.Float.compare(r13, r11)
            if (r13 == 0) goto L_0x064a
            r13 = 5
            r24 = 1
            goto L_0x064d
        L_0x064a:
            r13 = 5
            r24 = 0
        L_0x064d:
            r25 = r7[r13]
            r26 = r7[r8]
            r19 = r12
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            boolean r13 = r12 instanceof y0.d.f
            if (r13 == 0) goto L_0x0666
            if (r6 <= 0) goto L_0x0666
            y0.d$e r12 = new y0.d$e
            r6 = r7[r3]
            r7 = r7[r2]
            r12.<init>(r6, r7)
            goto L_0x0675
        L_0x0666:
            boolean r13 = r12 instanceof y0.d.n
            if (r13 == 0) goto L_0x0675
            if (r6 <= 0) goto L_0x0675
            y0.d$m r12 = new y0.d$m
            r6 = r7[r3]
            r7 = r7[r2]
            r12.<init>(r6, r7)
        L_0x0675:
            r4.add(r12)
            goto L_0x0616
        L_0x0679:
            r4 = 65
            if (r0 != r4) goto L_0x06f9
            rp0.f r0 = new rp0.f
            int r4 = r1.length
            int r4 = r4 - r7
            r0.<init>(r3, r4)
            rp0.d r0 = rp0.l.t(r0, r7)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = kotlin.collections.l.u(r0, r6)
            r4.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x0695:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x007b
            r6 = r0
            cp0.m r6 = (cp0.m) r6
            int r6 = r6.b()
            int r7 = r6 + 7
            float[] r7 = kotlin.collections.g.p(r1, r6, r7)
            y0.d$a r12 = new y0.d$a
            r20 = r7[r3]
            r21 = r7[r2]
            r22 = r7[r5]
            r13 = r7[r9]
            int r13 = java.lang.Float.compare(r13, r11)
            if (r13 == 0) goto L_0x06bb
            r23 = 1
            goto L_0x06bd
        L_0x06bb:
            r23 = 0
        L_0x06bd:
            r13 = r7[r10]
            int r13 = java.lang.Float.compare(r13, r11)
            if (r13 == 0) goto L_0x06c9
            r13 = 5
            r24 = 1
            goto L_0x06cc
        L_0x06c9:
            r13 = 5
            r24 = 0
        L_0x06cc:
            r25 = r7[r13]
            r26 = r7[r8]
            r19 = r12
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            boolean r14 = r12 instanceof y0.d.f
            if (r14 == 0) goto L_0x06e5
            if (r6 <= 0) goto L_0x06e5
            y0.d$e r12 = new y0.d$e
            r6 = r7[r3]
            r7 = r7[r2]
            r12.<init>(r6, r7)
            goto L_0x06f4
        L_0x06e5:
            boolean r14 = r12 instanceof y0.d.n
            if (r14 == 0) goto L_0x06f4
            if (r6 <= 0) goto L_0x06f4
            y0.d$m r12 = new y0.d$m
            r6 = r7[r3]
            r7 = r7[r2]
            r12.<init>(r6, r7)
        L_0x06f4:
            r4.add(r12)
            goto L_0x0695
        L_0x06f8:
            return r0
        L_0x06f9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown command for: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.e.a(char, float[]):java.util.List");
    }
}
