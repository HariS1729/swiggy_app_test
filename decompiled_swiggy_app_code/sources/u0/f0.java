package u0;

import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.a;
import bp0.i;
import lp0.l;
import v0.b;
import v0.c;

/* compiled from: Color.kt */
public final class f0 {
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x014d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long a(float r9, float r10, float r11, float r12, androidx.compose.ui.graphics.colorspace.a r13) {
        /*
            java.lang.String r0 = "colorSpace"
            kotlin.jvm.internal.p.j(r13, r0)
            r0 = 0
            float r1 = r13.e(r0)
            float r2 = r13.d(r0)
            r3 = 1
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0019
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 > 0) goto L_0x0019
            r1 = 1
            goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            r2 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r1 == 0) goto L_0x0059
            float r1 = r13.e(r3)
            float r5 = r13.d(r3)
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0031
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 > 0) goto L_0x0031
            r1 = 1
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            if (r1 == 0) goto L_0x0059
            r1 = 2
            float r5 = r13.e(r1)
            float r1 = r13.d(r1)
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0047
            int r1 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r1 > 0) goto L_0x0047
            r1 = 1
            goto L_0x0048
        L_0x0047:
            r1 = 0
        L_0x0048:
            if (r1 == 0) goto L_0x0059
            int r1 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r1 > 0) goto L_0x0054
            int r1 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0054
            r1 = 1
            goto L_0x0055
        L_0x0054:
            r1 = 0
        L_0x0055:
            if (r1 == 0) goto L_0x0059
            r1 = 1
            goto L_0x005a
        L_0x0059:
            r1 = 0
        L_0x005a:
            if (r1 == 0) goto L_0x014d
            boolean r1 = r13.h()
            r5 = 32
            r6 = 16
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r1 == 0) goto L_0x009b
            r13 = 1132396544(0x437f0000, float:255.0)
            float r12 = r12 * r13
            float r12 = r12 + r7
            int r12 = (int) r12
            int r12 = r12 << 24
            float r9 = r9 * r13
            float r9 = r9 + r7
            int r9 = (int) r9
            int r9 = r9 << r6
            r9 = r9 | r12
            float r10 = r10 * r13
            float r10 = r10 + r7
            int r10 = (int) r10
            int r10 = r10 << 8
            r9 = r9 | r10
            float r11 = r11 * r13
            float r11 = r11 + r7
            int r10 = (int) r11
            r9 = r9 | r10
            long r9 = (long) r9
            long r9 = bp0.i.c(r9)
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r11
            long r9 = bp0.i.c(r9)
            long r9 = r9 << r5
            long r9 = bp0.i.c(r9)
            long r9 = u0.d0.i(r9)
            return r9
        L_0x009b:
            int r1 = r13.b()
            r8 = 3
            if (r1 != r8) goto L_0x00a4
            r1 = 1
            goto L_0x00a5
        L_0x00a4:
            r1 = 0
        L_0x00a5:
            if (r1 == 0) goto L_0x0141
            int r13 = r13.c()
            r1 = -1
            if (r13 == r1) goto L_0x00af
            r0 = 1
        L_0x00af:
            if (r0 == 0) goto L_0x0135
            short r9 = u0.i0.a(r9)
            short r10 = u0.i0.a(r10)
            short r11 = u0.i0.a(r11)
            float r12 = java.lang.Math.min(r12, r2)
            float r12 = java.lang.Math.max(r4, r12)
            r0 = 1149222912(0x447fc000, float:1023.0)
            float r12 = r12 * r0
            float r12 = r12 + r7
            int r12 = (int) r12
            long r0 = (long) r9
            long r0 = bp0.i.c(r0)
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            long r0 = bp0.i.c(r0)
            r9 = 48
            long r0 = r0 << r9
            long r0 = bp0.i.c(r0)
            long r9 = (long) r10
            long r9 = bp0.i.c(r9)
            long r9 = r9 & r2
            long r9 = bp0.i.c(r9)
            long r9 = r9 << r5
            long r9 = bp0.i.c(r9)
            long r9 = r9 | r0
            long r9 = bp0.i.c(r9)
            long r0 = (long) r11
            long r0 = bp0.i.c(r0)
            long r0 = r0 & r2
            long r0 = bp0.i.c(r0)
            long r0 = r0 << r6
            long r0 = bp0.i.c(r0)
            long r9 = r9 | r0
            long r9 = bp0.i.c(r9)
            long r11 = (long) r12
            long r11 = bp0.i.c(r11)
            r0 = 1023(0x3ff, double:5.054E-321)
            long r11 = r11 & r0
            long r11 = bp0.i.c(r11)
            r0 = 6
            long r11 = r11 << r0
            long r11 = bp0.i.c(r11)
            long r9 = r9 | r11
            long r9 = bp0.i.c(r9)
            long r11 = (long) r13
            long r11 = bp0.i.c(r11)
            r0 = 63
            long r11 = r11 & r0
            long r11 = bp0.i.c(r11)
            long r9 = r9 | r11
            long r9 = bp0.i.c(r9)
            long r9 = u0.d0.i(r9)
            return r9
        L_0x0135:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Unknown color space, please use a color space in ColorSpaces"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0141:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Color only works with ColorSpaces with 3 components"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x014d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "red = "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = ", green = "
            r0.append(r9)
            r0.append(r10)
            java.lang.String r9 = ", blue = "
            r0.append(r9)
            r0.append(r11)
            java.lang.String r9 = ", alpha = "
            r0.append(r9)
            r0.append(r12)
            java.lang.String r9 = " outside the range for "
            r0.append(r9)
            r0.append(r13)
            java.lang.String r9 = r0.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.f0.a(float, float, float, float, androidx.compose.ui.graphics.colorspace.a):long");
    }

    public static final long b(int i11) {
        return d0.i(i.c(i.c((long) i11) << 32));
    }

    public static final long c(long j) {
        return d0.i(i.c(i.c(i.c(j) & 4294967295L) << 32));
    }

    public static final long e(long j, long j11) {
        long j12 = d0.j(j, d0.q(j11));
        float o11 = d0.o(j11);
        float o12 = d0.o(j12);
        float f11 = 1.0f - o12;
        float f12 = (o11 * f11) + o12;
        boolean z11 = true;
        float f13 = 0.0f;
        int i11 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
        float s11 = i11 == 0 ? 0.0f : ((d0.s(j12) * o12) + ((d0.s(j11) * o11) * f11)) / f12;
        float r11 = i11 == 0 ? 0.0f : ((d0.r(j12) * o12) + ((d0.r(j11) * o11) * f11)) / f12;
        float p11 = d0.p(j12);
        float p12 = d0.p(j11);
        if (i11 != 0) {
            z11 = false;
        }
        if (!z11) {
            f13 = ((p11 * o12) + ((p12 * o11) * f11)) / f12;
        }
        return a(s11, r11, f13, f12, d0.q(j11));
    }

    /* access modifiers changed from: private */
    public static final float[] f(long j) {
        return new float[]{d0.s(j), d0.r(j), d0.p(j), d0.o(j)};
    }

    public static final long g(long j, long j11, float f11) {
        a p11 = ColorSpaces.f6442a.p();
        long j12 = d0.j(j, p11);
        long j13 = d0.j(j11, p11);
        float o11 = d0.o(j12);
        float s11 = d0.s(j12);
        float r11 = d0.r(j12);
        float p12 = d0.p(j12);
        float o12 = d0.o(j13);
        float s12 = d0.s(j13);
        float r12 = d0.r(j13);
        float p13 = d0.p(j13);
        return d0.j(a(e2.a.a(s11, s12, f11), e2.a.a(r11, r12, f11), e2.a.a(p12, p13, f11), e2.a.a(o11, o12, f11), p11), d0.q(j11));
    }

    public static final float h(long j) {
        a q = d0.q(j);
        if (b.e(q.f(), b.f17013a.b())) {
            l<Double, Double> l11 = ((Rgb) q).l();
            return i((float) ((l11.invoke(Double.valueOf((double) d0.s(j))).doubleValue() * 0.2126d) + (l11.invoke(Double.valueOf((double) d0.r(j))).doubleValue() * 0.7152d) + (l11.invoke(Double.valueOf((double) d0.p(j))).doubleValue() * 0.0722d)));
        }
        throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + b.h(q.f())).toString());
    }

    private static final float i(float f11) {
        if (f11 <= 0.0f) {
            return 0.0f;
        }
        if (f11 >= 1.0f) {
            return 1.0f;
        }
        return f11;
    }

    public static final int j(long j) {
        a q = d0.q(j);
        if (q.h()) {
            return (int) i.c(j >>> 32);
        }
        float[] f11 = f(j);
        c.i(q, (a) null, 0, 3, (Object) null).a(f11);
        return ((int) ((f11[2] * 255.0f) + 0.5f)) | (((int) ((f11[3] * 255.0f) + 0.5f)) << 24) | (((int) ((f11[0] * 255.0f) + 0.5f)) << 16) | (((int) ((f11[1] * 255.0f) + 0.5f)) << 8);
    }
}
