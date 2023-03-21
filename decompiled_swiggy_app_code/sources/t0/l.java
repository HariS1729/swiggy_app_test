package t0;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;

/* compiled from: Size.kt */
public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16682b = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f16683c = m.a(0.0f, 0.0f);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final long f16684d = m.a(Float.NaN, Float.NaN);

    /* renamed from: a  reason: collision with root package name */
    private final long f16685a;

    /* compiled from: Size.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final long a() {
            return l.f16684d;
        }

        public final long b() {
            return l.f16683c;
        }
    }

    private /* synthetic */ l(long j) {
        this.f16685a = j;
    }

    public static final /* synthetic */ l c(long j) {
        return new l(j);
    }

    public static long d(long j) {
        return j;
    }

    public static boolean e(long j, Object obj) {
        return (obj instanceof l) && j == ((l) obj).m();
    }

    public static final boolean f(long j, long j11) {
        return j == j11;
    }

    public static final float g(long j) {
        if (j != f16684d) {
            k kVar = k.f25688a;
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    public static final float h(long j) {
        return Math.min(Math.abs(i(j)), Math.abs(g(j)));
    }

    public static final float i(long j) {
        if (j != f16684d) {
            k kVar = k.f25688a;
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    public static int j(long j) {
        return bs.a.a(j);
    }

    public static final boolean k(long j) {
        return i(j) <= 0.0f || g(j) <= 0.0f;
    }

    public static String l(long j) {
        if (!(j != f16682b.a())) {
            return "Size.Unspecified";
        }
        return "Size(" + c.a(i(j), 1) + ", " + c.a(g(j), 1) + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f16685a, obj);
    }

    public int hashCode() {
        return j(this.f16685a);
    }

    public final /* synthetic */ long m() {
        return this.f16685a;
    }

    public String toString() {
        return l(this.f16685a);
    }
}
