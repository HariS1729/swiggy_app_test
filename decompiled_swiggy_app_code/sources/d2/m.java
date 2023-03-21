package d2;

import t0.f;
import t0.g;

/* compiled from: IntOffset.kt */
public final class m {
    public static final long a(int i11, int i12) {
        return l.e((((long) i12) & 4294967295L) | (((long) i11) << 32));
    }

    public static final long b(long j, long j11) {
        return g.a(f.m(j) - ((float) l.j(j11)), f.n(j) - ((float) l.k(j11)));
    }

    public static final long c(long j, long j11) {
        return g.a(f.m(j) + ((float) l.j(j11)), f.n(j) + ((float) l.k(j11)));
    }
}
