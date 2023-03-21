package t0;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;

/* compiled from: Offset.kt */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16662b = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f16663c = g.a(0.0f, 0.0f);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final long f16664d = g.a(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final long f16665e = g.a(Float.NaN, Float.NaN);

    /* renamed from: a  reason: collision with root package name */
    private final long f16666a;

    /* compiled from: Offset.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final long a() {
            return f.f16664d;
        }

        public final long b() {
            return f.f16665e;
        }

        public final long c() {
            return f.f16663c;
        }
    }

    private /* synthetic */ f(long j) {
        this.f16666a = j;
    }

    public static final /* synthetic */ f d(long j) {
        return new f(j);
    }

    public static final float e(long j) {
        return m(j);
    }

    public static final float f(long j) {
        return n(j);
    }

    public static long g(long j) {
        return j;
    }

    public static final long h(long j, float f11) {
        return g.a(m(j) / f11, n(j) / f11);
    }

    public static boolean i(long j, Object obj) {
        return (obj instanceof f) && j == ((f) obj).u();
    }

    public static final boolean j(long j, long j11) {
        return j == j11;
    }

    public static final float k(long j) {
        return (float) Math.sqrt((double) ((m(j) * m(j)) + (n(j) * n(j))));
    }

    public static final float l(long j) {
        return (m(j) * m(j)) + (n(j) * n(j));
    }

    public static final float m(long j) {
        if (j != f16665e) {
            k kVar = k.f25688a;
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    public static final float n(long j) {
        if (j != f16665e) {
            k kVar = k.f25688a;
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    public static int o(long j) {
        return bs.a.a(j);
    }

    public static final boolean p(long j) {
        if (!Float.isNaN(m(j)) && !Float.isNaN(n(j))) {
            return true;
        }
        throw new IllegalStateException("Offset argument contained a NaN value.".toString());
    }

    public static final long q(long j, long j11) {
        return g.a(m(j) - m(j11), n(j) - n(j11));
    }

    public static final long r(long j, long j11) {
        return g.a(m(j) + m(j11), n(j) + n(j11));
    }

    public static final long s(long j, float f11) {
        return g.a(m(j) * f11, n(j) * f11);
    }

    public static String t(long j) {
        if (!g.c(j)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + c.a(m(j), 1) + ", " + c.a(n(j), 1) + ')';
    }

    public boolean equals(Object obj) {
        return i(this.f16666a, obj);
    }

    public int hashCode() {
        return o(this.f16666a);
    }

    public String toString() {
        return t(this.f16666a);
    }

    public final /* synthetic */ long u() {
        return this.f16666a;
    }
}
