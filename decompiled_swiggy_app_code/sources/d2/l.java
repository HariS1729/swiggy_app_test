package d2;

import kotlin.jvm.internal.i;

/* compiled from: IntOffset.kt */
public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final a f14010b = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f14011c = m.a(0, 0);

    /* renamed from: a  reason: collision with root package name */
    private final long f14012a;

    /* compiled from: IntOffset.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final long a() {
            return l.f14011c;
        }
    }

    private /* synthetic */ l(long j) {
        this.f14012a = j;
    }

    public static final /* synthetic */ l b(long j) {
        return new l(j);
    }

    public static final int c(long j) {
        return j(j);
    }

    public static final int d(long j) {
        return k(j);
    }

    public static long e(long j) {
        return j;
    }

    public static final long f(long j, int i11, int i12) {
        return m.a(i11, i12);
    }

    public static /* synthetic */ long g(long j, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = j(j);
        }
        if ((i13 & 2) != 0) {
            i12 = k(j);
        }
        return f(j, i11, i12);
    }

    public static boolean h(long j, Object obj) {
        return (obj instanceof l) && j == ((l) obj).n();
    }

    public static final boolean i(long j, long j11) {
        return j == j11;
    }

    public static final int j(long j) {
        return (int) (j >> 32);
    }

    public static final int k(long j) {
        return (int) (j & 4294967295L);
    }

    public static int l(long j) {
        return bs.a.a(j);
    }

    public static String m(long j) {
        return '(' + j(j) + ", " + k(j) + ')';
    }

    public boolean equals(Object obj) {
        return h(this.f14012a, obj);
    }

    public int hashCode() {
        return l(this.f14012a);
    }

    public final /* synthetic */ long n() {
        return this.f14012a;
    }

    public String toString() {
        return m(this.f14012a);
    }
}
