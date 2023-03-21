package d2;

/* compiled from: Constraints.kt */
public final class c {
    public static final long a(int i11, int i12, int i13, int i14) {
        boolean z11 = true;
        if (i12 >= i11) {
            if (i14 >= i13) {
                if (i11 < 0 || i13 < 0) {
                    z11 = false;
                }
                if (z11) {
                    return b.f13990b.b(i11, i12, i13, i14);
                }
                throw new IllegalArgumentException(("minWidth(" + i11 + ") and minHeight(" + i13 + ") must be >= 0").toString());
            }
            throw new IllegalArgumentException(("maxHeight(" + i14 + ") must be >= than minHeight(" + i13 + ')').toString());
        }
        throw new IllegalArgumentException(("maxWidth(" + i12 + ") must be >= than minWidth(" + i11 + ')').toString());
    }

    public static /* synthetic */ long b(int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = 0;
        }
        if ((i15 & 2) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        if ((i15 & 4) != 0) {
            i13 = 0;
        }
        if ((i15 & 8) != 0) {
            i14 = Integer.MAX_VALUE;
        }
        return a(i11, i12, i13, i14);
    }

    private static final int c(int i11, int i12) {
        return i11 == Integer.MAX_VALUE ? i11 : l.d(i11 + i12, 0);
    }

    public static final long d(long j, long j11) {
        return q.a(l.m(p.g(j11), b.p(j), b.n(j)), l.m(p.f(j11), b.o(j), b.m(j)));
    }

    public static final long e(long j, long j11) {
        return a(l.m(b.p(j11), b.p(j), b.n(j)), l.m(b.n(j11), b.p(j), b.n(j)), l.m(b.o(j11), b.o(j), b.m(j)), l.m(b.m(j11), b.o(j), b.m(j)));
    }

    public static final int f(long j, int i11) {
        return l.m(i11, b.o(j), b.m(j));
    }

    public static final int g(long j, int i11) {
        return l.m(i11, b.p(j), b.n(j));
    }

    public static final boolean h(long j, long j11) {
        int p11 = b.p(j);
        int n = b.n(j);
        int g11 = p.g(j11);
        if (p11 <= g11 && g11 <= n) {
            int o11 = b.o(j);
            int m11 = b.m(j);
            int f11 = p.f(j11);
            if (o11 <= f11 && f11 <= m11) {
                return true;
            }
        }
        return false;
    }

    public static final long i(long j, int i11, int i12) {
        return a(l.d(b.p(j) + i11, 0), c(b.n(j), i11), l.d(b.o(j) + i12, 0), c(b.m(j), i12));
    }

    public static /* synthetic */ long j(long j, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return i(j, i11, i12);
    }
}
