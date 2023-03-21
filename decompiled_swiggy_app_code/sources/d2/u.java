package d2;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;

/* compiled from: Velocity.kt */
public final class u {

    /* renamed from: b  reason: collision with root package name */
    public static final a f14031b = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f14032c = v.a(0.0f, 0.0f);

    /* renamed from: a  reason: collision with root package name */
    private final long f14033a;

    /* compiled from: Velocity.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final long a() {
            return u.f14032c;
        }
    }

    private /* synthetic */ u(long j) {
        this.f14033a = j;
    }

    public static final /* synthetic */ u b(long j) {
        return new u(j);
    }

    public static long c(long j) {
        return j;
    }

    public static final long d(long j, float f11, float f12) {
        return v.a(f11, f12);
    }

    public static /* synthetic */ long e(long j, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = h(j);
        }
        if ((i11 & 2) != 0) {
            f12 = i(j);
        }
        return d(j, f11, f12);
    }

    public static boolean f(long j, Object obj) {
        return (obj instanceof u) && j == ((u) obj).n();
    }

    public static final boolean g(long j, long j11) {
        return j == j11;
    }

    public static final float h(long j) {
        k kVar = k.f25688a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float i(long j) {
        k kVar = k.f25688a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static int j(long j) {
        return bs.a.a(j);
    }

    public static final long k(long j, long j11) {
        return v.a(h(j) - h(j11), i(j) - i(j11));
    }

    public static final long l(long j, long j11) {
        return v.a(h(j) + h(j11), i(j) + i(j11));
    }

    public static String m(long j) {
        return '(' + h(j) + ", " + i(j) + ") px/sec";
    }

    public boolean equals(Object obj) {
        return f(this.f14033a, obj);
    }

    public int hashCode() {
        return j(this.f14033a);
    }

    public final /* synthetic */ long n() {
        return this.f14033a;
    }

    public String toString() {
        return m(this.f14033a);
    }
}
