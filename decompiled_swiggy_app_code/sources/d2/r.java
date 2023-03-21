package d2;

import d2.t;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;

/* compiled from: TextUnit.kt */
public final class r {

    /* renamed from: b  reason: collision with root package name */
    public static final a f14022b = new a((i) null);

    /* renamed from: c  reason: collision with root package name */
    private static final t[] f14023c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final long f14024d = s.i(0, Float.NaN);

    /* renamed from: a  reason: collision with root package name */
    private final long f14025a;

    /* compiled from: TextUnit.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final long a() {
            return r.f14024d;
        }
    }

    static {
        t.a aVar = t.f14026b;
        f14023c = new t[]{t.d(aVar.c()), t.d(aVar.b()), t.d(aVar.a())};
    }

    private /* synthetic */ r(long j) {
        this.f14025a = j;
    }

    public static final /* synthetic */ r b(long j) {
        return new r(j);
    }

    public static long c(long j) {
        return j;
    }

    public static boolean d(long j, Object obj) {
        return (obj instanceof r) && j == ((r) obj).k();
    }

    public static final boolean e(long j, long j11) {
        return j == j11;
    }

    public static final long f(long j) {
        return j & 1095216660480L;
    }

    public static final long g(long j) {
        return f14023c[(int) (f(j) >>> 32)].j();
    }

    public static final float h(long j) {
        k kVar = k.f25688a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static int i(long j) {
        return bs.a.a(j);
    }

    public static String j(long j) {
        long g11 = g(j);
        t.a aVar = t.f14026b;
        if (t.g(g11, aVar.c())) {
            return "Unspecified";
        }
        if (t.g(g11, aVar.b())) {
            return h(j) + ".sp";
        } else if (!t.g(g11, aVar.a())) {
            return "Invalid";
        } else {
            return h(j) + ".em";
        }
    }

    public boolean equals(Object obj) {
        return d(this.f14025a, obj);
    }

    public int hashCode() {
        return i(this.f14025a);
    }

    public final /* synthetic */ long k() {
        return this.f14025a;
    }

    public String toString() {
        return j(this.f14025a);
    }
}
