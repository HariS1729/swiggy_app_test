package androidx.compose.animation.core;

import defpackage.v1;
import kotlin.Pair;

/* compiled from: SpringEstimation.kt */
public final class SpringEstimationKt {
    public static final long a(double d11, double d12, double d13, double d14, double d15) {
        return f(v1.r.a(1.0d, 2.0d * d12 * Math.sqrt(d11), d11), d12, d13, d14, d15);
    }

    public static final long b(float f11, float f12, float f13, float f14, float f15) {
        return a((double) f11, (double) f12, (double) f13, (double) f14, (double) f15);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b9 A[LOOP:0: B:35:0x00ac->B:39:0x00b9, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final double c(kotlin.Pair<defpackage.v1.q, defpackage.v1.q> r19, double r20, double r22, double r24) {
        /*
            r8 = r24
            java.lang.Object r0 = r19.c()
            v1$q r0 = (defpackage.v1.q) r0
            double r10 = r0.f()
            double r0 = r10 * r20
            double r12 = r22 - r0
            double r2 = r8 / r20
            double r2 = java.lang.Math.abs(r2)
            double r2 = java.lang.Math.log(r2)
            double r2 = r2 / r10
            double r4 = r8 / r12
            double r4 = java.lang.Math.abs(r4)
            double r4 = java.lang.Math.log(r4)
            double r4 = d(r4, r10)
            double r4 = r4 / r10
            boolean r6 = java.lang.Double.isInfinite(r2)
            r14 = 0
            r7 = 1
            if (r6 != 0) goto L_0x003a
            boolean r6 = java.lang.Double.isNaN(r2)
            if (r6 != 0) goto L_0x003a
            r6 = 1
            goto L_0x003b
        L_0x003a:
            r6 = 0
        L_0x003b:
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x0040
            r15 = r4
            goto L_0x0058
        L_0x0040:
            boolean r6 = java.lang.Double.isInfinite(r4)
            if (r6 != 0) goto L_0x004e
            boolean r6 = java.lang.Double.isNaN(r4)
            if (r6 != 0) goto L_0x004e
            r6 = 1
            goto L_0x004f
        L_0x004e:
            r6 = 0
        L_0x004f:
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x0053
            goto L_0x0057
        L_0x0053:
            double r2 = java.lang.Math.max(r2, r4)
        L_0x0057:
            r15 = r2
        L_0x0058:
            double r0 = r0 + r12
            double r0 = -r0
            double r2 = r10 * r12
            double r4 = r0 / r2
            boolean r0 = java.lang.Double.isNaN(r4)
            if (r0 != 0) goto L_0x0091
            r17 = 0
            int r0 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r0 > 0) goto L_0x006b
            goto L_0x0091
        L_0x006b:
            int r0 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x0087
            r0 = r20
            r2 = r10
            r6 = r12
            double r0 = e(r0, r2, r4, r6)
            double r0 = -r0
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0087
            int r0 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x0091
            int r0 = (r20 > r17 ? 1 : (r20 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x0091
            r15 = r17
            goto L_0x0091
        L_0x0087:
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 / r10
            double r0 = -r0
            double r2 = r20 / r12
            double r15 = r0 - r2
            r7 = r8
            goto L_0x0093
        L_0x0091:
            double r0 = -r8
            r7 = r0
        L_0x0093:
            androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fn$1 r9 = new androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fn$1
            r0 = r9
            r1 = r20
            r3 = r12
            r5 = r10
            r0.<init>(r1, r3, r5, r7)
            androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fnPrime$1 r7 = new androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fnPrime$1
            r0 = r7
            r1 = r12
            r3 = r10
            r5 = r20
            r0.<init>(r1, r3, r5)
            r0 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        L_0x00ac:
            r2 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x00e2
            r0 = 100
            if (r14 >= r0) goto L_0x00e2
            int r14 = r14 + 1
            java.lang.Double r0 = java.lang.Double.valueOf(r15)
            java.lang.Object r0 = r9.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            java.lang.Double r2 = java.lang.Double.valueOf(r15)
            java.lang.Object r2 = r7.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r0 = r0 / r2
            double r0 = r15 - r0
            double r15 = r15 - r0
            double r2 = java.lang.Math.abs(r15)
            r15 = r0
            r0 = r2
            goto L_0x00ac
        L_0x00e2:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SpringEstimationKt.c(kotlin.Pair, double, double, double):double");
    }

    private static final double d(double d11, double d12) {
        int i11 = 0;
        double d13 = d11;
        while (i11 < 6) {
            i11++;
            d13 = d11 - Math.log(Math.abs(d13 / d12));
        }
        return d13;
    }

    private static final double e(double d11, double d12, double d13, double d14) {
        double d15 = d12 * d13;
        return (d11 * Math.exp(d15)) + (d14 * d13 * Math.exp(d15));
    }

    private static final long f(Pair<v1.q, v1.q> pair, double d11, double d12, double d13, double d14) {
        double d15;
        boolean z11 = true;
        int i11 = (d13 > 0.0d ? 1 : (d13 == 0.0d ? 0 : -1));
        if (i11 == 0) {
            if (d12 != 0.0d) {
                z11 = false;
            }
            if (z11) {
                return 0;
            }
        }
        if (i11 < 0) {
            d12 = -d12;
        }
        double d16 = d12;
        double abs = Math.abs(d13);
        if (d11 > 1.0d) {
            d15 = g(pair, abs, d16, d14);
        } else if (d11 < 1.0d) {
            d15 = i(pair, abs, d16, d14);
        } else {
            d15 = c(pair, abs, d16, d14);
        }
        return (long) (d15 * 1000.0d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final double g(kotlin.Pair<defpackage.v1.q, defpackage.v1.q> r31, double r32, double r34, double r36) {
        /*
            r0 = r36
            java.lang.Object r2 = r31.c()
            v1$q r2 = (defpackage.v1.q) r2
            double r14 = r2.f()
            java.lang.Object r2 = r31.d()
            v1$q r2 = (defpackage.v1.q) r2
            double r16 = r2.f()
            double r2 = r14 * r32
            double r2 = r2 - r34
            double r18 = r14 - r16
            double r11 = r2 / r18
            double r20 = r32 - r11
            double r2 = r0 / r20
            double r2 = java.lang.Math.abs(r2)
            double r2 = java.lang.Math.log(r2)
            double r2 = r2 / r14
            double r4 = r0 / r11
            double r4 = java.lang.Math.abs(r4)
            double r4 = java.lang.Math.log(r4)
            double r4 = r4 / r16
            boolean r6 = java.lang.Double.isInfinite(r2)
            r22 = 0
            r7 = 1
            if (r6 != 0) goto L_0x0048
            boolean r6 = java.lang.Double.isNaN(r2)
            if (r6 != 0) goto L_0x0048
            r6 = 1
            goto L_0x0049
        L_0x0048:
            r6 = 0
        L_0x0049:
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x004f
            r23 = r4
            goto L_0x0068
        L_0x004f:
            boolean r6 = java.lang.Double.isInfinite(r4)
            if (r6 != 0) goto L_0x005d
            boolean r6 = java.lang.Double.isNaN(r4)
            if (r6 != 0) goto L_0x005d
            r6 = 1
            goto L_0x005e
        L_0x005d:
            r6 = 0
        L_0x005e:
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x0062
            goto L_0x0066
        L_0x0062:
            double r2 = java.lang.Math.max(r2, r4)
        L_0x0066:
            r23 = r2
        L_0x0068:
            double r25 = r20 * r14
            double r2 = -r11
            double r2 = r2 * r16
            double r2 = r25 / r2
            double r2 = java.lang.Math.log(r2)
            double r4 = r16 - r14
            double r7 = r2 / r4
            boolean r2 = java.lang.Double.isNaN(r7)
            if (r2 != 0) goto L_0x00b6
            r27 = 0
            int r2 = (r7 > r27 ? 1 : (r7 == r27 ? 0 : -1))
            if (r2 > 0) goto L_0x0084
            goto L_0x00b6
        L_0x0084:
            int r2 = (r7 > r27 ? 1 : (r7 == r27 ? 0 : -1))
            if (r2 <= 0) goto L_0x00a4
            r3 = r20
            r5 = r14
            r9 = r11
            r29 = r11
            r11 = r16
            double r2 = h(r3, r5, r7, r9, r11)
            double r2 = -r2
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x00a6
            int r2 = (r29 > r27 ? 1 : (r29 == r27 ? 0 : -1))
            if (r2 <= 0) goto L_0x00b8
            int r2 = (r20 > r27 ? 1 : (r20 == r27 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b8
            r23 = r27
            goto L_0x00b8
        L_0x00a4:
            r29 = r11
        L_0x00a6:
            double r11 = r29 * r16
            double r11 = r11 * r16
            double r2 = -r11
            double r25 = r25 * r14
            double r2 = r2 / r25
            double r2 = java.lang.Math.log(r2)
            double r23 = r2 / r18
            goto L_0x00b9
        L_0x00b6:
            r29 = r11
        L_0x00b8:
            double r0 = -r0
        L_0x00b9:
            r12 = r0
            androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fn$1 r0 = new androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fn$1
            r3 = r0
            r4 = r20
            r6 = r14
            r8 = r29
            r10 = r16
            r3.<init>(r4, r6, r8, r10, r12)
            androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fnPrime$1 r1 = new androidx.compose.animation.core.SpringEstimationKt$estimateOverDamped$fnPrime$1
            r3 = r1
            r3.<init>(r4, r6, r8, r10)
            java.lang.Double r2 = java.lang.Double.valueOf(r23)
            java.lang.Object r2 = r0.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            double r2 = java.lang.Math.abs(r2)
            r4 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x00e9
            return r23
        L_0x00e9:
            r2 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r4 = 0
        L_0x00ef:
            r5 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0127
            r2 = 100
            if (r4 >= r2) goto L_0x0127
            int r4 = r4 + 1
            java.lang.Double r2 = java.lang.Double.valueOf(r23)
            java.lang.Object r2 = r0.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            java.lang.Double r5 = java.lang.Double.valueOf(r23)
            java.lang.Object r5 = r1.invoke(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            double r5 = r5.doubleValue()
            double r2 = r2 / r5
            double r2 = r23 - r2
            double r23 = r23 - r2
            double r5 = java.lang.Math.abs(r23)
            r23 = r2
            r2 = r5
            goto L_0x00ef
        L_0x0127:
            return r23
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SpringEstimationKt.g(kotlin.Pair, double, double, double):double");
    }

    private static final double h(double d11, double d12, double d13, double d14, double d15) {
        return (d11 * Math.exp(d12 * d13)) + (d14 * Math.exp(d15 * d13));
    }

    private static final double i(Pair<v1.q, v1.q> pair, double d11, double d12, double d13) {
        double f11 = pair.c().f();
        double e11 = (d12 - (f11 * d11)) / pair.c().e();
        return Math.log(d13 / Math.sqrt((d11 * d11) + (e11 * e11))) / f11;
    }
}
