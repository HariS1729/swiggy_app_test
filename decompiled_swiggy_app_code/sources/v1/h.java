package v1;

import p1.a0;
import p1.b0;

/* compiled from: EditingBuffer.kt */
public final class h {
    public static final long a(long j, long j11) {
        int i11;
        int l11 = a0.l(j);
        int k = a0.k(j);
        if (a0.p(j11, j)) {
            if (a0.d(j11, j)) {
                l11 = a0.l(j11);
                k = l11;
            } else if (a0.d(j, j11)) {
                i11 = a0.j(j11);
            } else if (a0.e(j11, l11)) {
                l11 = a0.l(j11);
                i11 = a0.j(j11);
            } else {
                k = a0.l(j11);
            }
            return b0.b(l11, k);
        }
        if (k > a0.l(j11)) {
            l11 -= a0.j(j11);
            i11 = a0.j(j11);
        }
        return b0.b(l11, k);
        k -= i11;
        return b0.b(l11, k);
    }
}
