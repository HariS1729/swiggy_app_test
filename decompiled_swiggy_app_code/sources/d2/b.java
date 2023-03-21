package d2;

import kotlin.jvm.internal.i;
import okhttp3.internal.http2.Settings;

/* compiled from: Constraints.kt */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f13990b = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f13991c = {18, 20, 17, 15};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f13992d = {Settings.DEFAULT_INITIAL_WINDOW_SIZE, 262143, 32767, 8191};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f13993e = {32767, 8191, Settings.DEFAULT_INITIAL_WINDOW_SIZE, 262143};

    /* renamed from: a  reason: collision with root package name */
    private final long f13994a;

    /* compiled from: Constraints.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        private final int a(int i11) {
            if (i11 < 8191) {
                return 13;
            }
            if (i11 < 32767) {
                return 15;
            }
            if (i11 < 65535) {
                return 16;
            }
            if (i11 < 262143) {
                return 18;
            }
            throw new IllegalArgumentException("Can't represent a size of " + i11 + " in Constraints");
        }

        public final long b(int i11, int i12, int i13, int i14) {
            long j;
            int i15 = i14 == Integer.MAX_VALUE ? i13 : i14;
            int a11 = a(i15);
            int i16 = i12 == Integer.MAX_VALUE ? i11 : i12;
            int a12 = a(i16);
            if (a11 + a12 <= 31) {
                if (a12 == 13) {
                    j = 3;
                } else if (a12 == 18) {
                    j = 1;
                } else if (a12 == 15) {
                    j = 2;
                } else if (a12 == 16) {
                    j = 0;
                } else {
                    throw new IllegalStateException("Should only have the provided constants.");
                }
                int i17 = 0;
                int i18 = i12 == Integer.MAX_VALUE ? 0 : i12 + 1;
                if (i14 != Integer.MAX_VALUE) {
                    i17 = i14 + 1;
                }
                int i19 = b.f13991c[(int) j];
                return b.c((((long) i18) << 33) | j | (((long) i11) << 2) | (((long) i13) << i19) | (((long) i17) << (i19 + 31)));
            }
            throw new IllegalArgumentException("Can't represent a width of " + i16 + " and height of " + i15 + " in Constraints");
        }

        public final long c(int i11, int i12) {
            if (i11 >= 0 && i12 >= 0) {
                return b(i11, i11, i12, i12);
            }
            throw new IllegalArgumentException(("width(" + i11 + ") and height(" + i12 + ") must be >= 0").toString());
        }

        public final long d(int i11) {
            if (i11 >= 0) {
                return b(0, Integer.MAX_VALUE, i11, i11);
            }
            throw new IllegalArgumentException(("height(" + i11 + ") must be >= 0").toString());
        }

        public final long e(int i11) {
            if (i11 >= 0) {
                return b(i11, i11, 0, Integer.MAX_VALUE);
            }
            throw new IllegalArgumentException(("width(" + i11 + ") must be >= 0").toString());
        }
    }

    private /* synthetic */ b(long j) {
        this.f13994a = j;
    }

    public static final /* synthetic */ b b(long j) {
        return new b(j);
    }

    public static long c(long j) {
        return j;
    }

    public static final long d(long j, int i11, int i12, int i13, int i14) {
        boolean z11 = true;
        if (i13 >= 0 && i11 >= 0) {
            if (i12 >= i11 || i12 == Integer.MAX_VALUE) {
                if (i14 < i13 && i14 != Integer.MAX_VALUE) {
                    z11 = false;
                }
                if (z11) {
                    return f13990b.b(i11, i12, i13, i14);
                }
                throw new IllegalArgumentException(("maxHeight(" + i14 + ") must be >= minHeight(" + i13 + ')').toString());
            }
            throw new IllegalArgumentException(("maxWidth(" + i12 + ") must be >= minWidth(" + i11 + ')').toString());
        }
        throw new IllegalArgumentException(("minHeight(" + i13 + ") and minWidth(" + i11 + ") must be >= 0").toString());
    }

    public static /* synthetic */ long e(long j, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = p(j);
        }
        int i16 = i11;
        if ((i15 & 2) != 0) {
            i12 = n(j);
        }
        int i17 = i12;
        if ((i15 & 4) != 0) {
            i13 = o(j);
        }
        int i18 = i13;
        if ((i15 & 8) != 0) {
            i14 = m(j);
        }
        return d(j, i16, i17, i18, i14);
    }

    public static boolean f(long j, Object obj) {
        return (obj instanceof b) && j == ((b) obj).t();
    }

    public static final boolean g(long j, long j11) {
        return j == j11;
    }

    private static final int h(long j) {
        return (int) (j & 3);
    }

    public static final boolean i(long j) {
        int h11 = h(j);
        return (((int) (j >> (f13991c[h11] + 31))) & f13993e[h11]) != 0;
    }

    public static final boolean j(long j) {
        return (((int) (j >> 33)) & f13992d[h(j)]) != 0;
    }

    public static final boolean k(long j) {
        return m(j) == o(j);
    }

    public static final boolean l(long j) {
        return n(j) == p(j);
    }

    public static final int m(long j) {
        int h11 = h(j);
        int i11 = ((int) (j >> (f13991c[h11] + 31))) & f13993e[h11];
        if (i11 == 0) {
            return Integer.MAX_VALUE;
        }
        return i11 - 1;
    }

    public static final int n(long j) {
        int i11 = ((int) (j >> 33)) & f13992d[h(j)];
        if (i11 == 0) {
            return Integer.MAX_VALUE;
        }
        return i11 - 1;
    }

    public static final int o(long j) {
        int h11 = h(j);
        return ((int) (j >> f13991c[h11])) & f13993e[h11];
    }

    public static final int p(long j) {
        return ((int) (j >> 2)) & f13992d[h(j)];
    }

    public static int q(long j) {
        return bs.a.a(j);
    }

    public static final boolean r(long j) {
        return n(j) == 0 || m(j) == 0;
    }

    public static String s(long j) {
        String str;
        int n = n(j);
        String str2 = "Infinity";
        if (n == Integer.MAX_VALUE) {
            str = str2;
        } else {
            str = String.valueOf(n);
        }
        int m11 = m(j);
        if (m11 != Integer.MAX_VALUE) {
            str2 = String.valueOf(m11);
        }
        return "Constraints(minWidth = " + p(j) + ", maxWidth = " + str + ", minHeight = " + o(j) + ", maxHeight = " + str2 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f13994a, obj);
    }

    public int hashCode() {
        return q(this.f13994a);
    }

    public final /* synthetic */ long t() {
        return this.f13994a;
    }

    public String toString() {
        return s(this.f13994a);
    }
}
