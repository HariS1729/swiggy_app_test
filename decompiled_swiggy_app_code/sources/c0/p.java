package c0;

import u0.d0;
import u0.f0;

/* compiled from: MaterialTextSelectionColors.kt */
public final class p {
    private static final float a(long j, long j11, long j12) {
        float f11 = 0.4f;
        float f12 = 0.4f;
        float f13 = 0.2f;
        for (int i11 = 0; i11 < 7; i11++) {
            float c11 = (c(j, f11, j11, j12) / 4.5f) - 1.0f;
            if (0.0f <= c11 && c11 <= 0.01f) {
                break;
            }
            if (c11 < 0.0f) {
                f12 = f11;
            } else {
                f13 = f11;
            }
            f11 = (f12 + f13) / 2.0f;
        }
        return f11;
    }

    public static final float b(long j, long j11) {
        float h11 = f0.h(j) + 0.05f;
        float h12 = f0.h(j11) + 0.05f;
        return Math.max(h11, h12) / Math.min(h11, h12);
    }

    private static final float c(long j, float f11, long j11, long j12) {
        long e11 = f0.e(d0.l(j, f11, 0.0f, 0.0f, 0.0f, 14, (Object) null), j12);
        return b(f0.e(j11, e11), e11);
    }

    public static final long d(long j, long j11, long j12) {
        return d0.l(j, c(j, 0.4f, j11, j12) >= 4.5f ? 0.4f : c(j, 0.2f, j11, j12) < 4.5f ? 0.2f : a(j, j11, j12), 0.0f, 0.0f, 0.0f, 14, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: b0.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: b0.o} */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0081, code lost:
        if (r9 == e0.g.f14172a.a()) goto L_0x0083;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final b0.o e(c0.c r17, e0.g r18, int r19) {
        /*
            r0 = r17
            r1 = r18
            java.lang.String r2 = "colors"
            kotlin.jvm.internal.p.j(r0, r2)
            r2 = 35572393(0x21ecaa9, float:1.1666167E-37)
            r1.E(r2)
            long r3 = r17.j()
            long r7 = r17.c()
            r2 = 35572910(0x21eccae, float:1.1666747E-37)
            r1.E(r2)
            long r5 = androidx.compose.material.ColorsKt.a(r0, r7)
            u0.d0$a r2 = u0.d0.f16756b
            long r9 = r2.f()
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x002d
            r2 = 1
            goto L_0x002e
        L_0x002d:
            r2 = 0
        L_0x002e:
            if (r2 == 0) goto L_0x0031
            goto L_0x003f
        L_0x0031:
            e0.m0 r2 = androidx.compose.material.ContentColorKt.a()
            java.lang.Object r2 = r1.z(r2)
            u0.d0 r2 = (u0.d0) r2
            long r5 = r2.v()
        L_0x003f:
            r9 = r5
            r18.P()
            c0.d r2 = c0.d.f12682a
            r5 = 6
            float r11 = r2.d(r1, r5)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 14
            r16 = 0
            long r5 = u0.d0.l(r9, r11, r12, r13, r14, r15, r16)
            u0.d0 r2 = u0.d0.h(r3)
            u0.d0 r9 = u0.d0.h(r7)
            u0.d0 r10 = u0.d0.h(r5)
            r11 = -3686095(0xffffffffffc7c131, float:NaN)
            r1.E(r11)
            boolean r2 = r1.k(r2)
            boolean r9 = r1.k(r9)
            r2 = r2 | r9
            boolean r9 = r1.k(r10)
            r2 = r2 | r9
            java.lang.Object r9 = r18.F()
            if (r2 != 0) goto L_0x0083
            e0.g$a r2 = e0.g.f14172a
            java.lang.Object r2 = r2.a()
            if (r9 != r2) goto L_0x0095
        L_0x0083:
            b0.o r9 = new b0.o
            long r11 = r17.j()
            long r13 = d(r3, r5, r7)
            r15 = 0
            r10 = r9
            r10.<init>(r11, r13, r15)
            r1.y(r9)
        L_0x0095:
            r18.P()
            b0.o r9 = (b0.o) r9
            r18.P()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.p.e(c0.c, e0.g, int):b0.o");
    }
}
