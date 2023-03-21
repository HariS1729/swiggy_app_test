package p1;

import kotlin.jvm.internal.i;

/* compiled from: TextRange.kt */
public final class a0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16041b = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f16042c = b0.a(0);

    /* renamed from: a  reason: collision with root package name */
    private final long f16043a;

    /* compiled from: TextRange.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final long a() {
            return a0.f16042c;
        }
    }

    private /* synthetic */ a0(long j) {
        this.f16043a = j;
    }

    public static final /* synthetic */ a0 b(long j) {
        return new a0(j);
    }

    public static long c(long j) {
        return j;
    }

    public static final boolean d(long j, long j11) {
        return l(j) <= l(j11) && k(j11) <= k(j);
    }

    public static final boolean e(long j, int i11) {
        return i11 < k(j) && l(j) <= i11;
    }

    public static boolean f(long j, Object obj) {
        return (obj instanceof a0) && j == ((a0) obj).r();
    }

    public static final boolean g(long j, long j11) {
        return j == j11;
    }

    public static final boolean h(long j) {
        return n(j) == i(j);
    }

    public static final int i(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int j(long j) {
        return k(j) - l(j);
    }

    public static final int k(long j) {
        return n(j) > i(j) ? n(j) : i(j);
    }

    public static final int l(long j) {
        return n(j) > i(j) ? i(j) : n(j);
    }

    public static final boolean m(long j) {
        return n(j) > i(j);
    }

    public static final int n(long j) {
        return (int) (j >> 32);
    }

    public static int o(long j) {
        return bs.a.a(j);
    }

    public static final boolean p(long j, long j11) {
        return l(j) < k(j11) && l(j11) < k(j);
    }

    public static String q(long j) {
        return "TextRange(" + n(j) + ", " + i(j) + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f16043a, obj);
    }

    public int hashCode() {
        return o(this.f16043a);
    }

    public final /* synthetic */ long r() {
        return this.f16043a;
    }

    public String toString() {
        return q(this.f16043a);
    }
}
