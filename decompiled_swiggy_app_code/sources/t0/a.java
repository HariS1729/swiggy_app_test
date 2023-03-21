package t0;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;

/* compiled from: CornerRadius.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0187a f16656a = new C0187a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final long f16657b = b.b(0.0f, 0.0f, 2, (Object) null);

    /* renamed from: t0.a$a  reason: collision with other inner class name */
    /* compiled from: CornerRadius.kt */
    public static final class C0187a {
        private C0187a() {
        }

        public /* synthetic */ C0187a(i iVar) {
            this();
        }

        public final long a() {
            return a.f16657b;
        }
    }

    public static long b(long j) {
        return j;
    }

    public static final boolean c(long j, long j11) {
        return j == j11;
    }

    public static final float d(long j) {
        k kVar = k.f25688a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float e(long j) {
        k kVar = k.f25688a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static int f(long j) {
        return bs.a.a(j);
    }

    public static String g(long j) {
        if (d(j) == e(j)) {
            return "CornerRadius.circular(" + c.a(d(j), 1) + ')';
        }
        return "CornerRadius.elliptical(" + c.a(d(j), 1) + ", " + c.a(e(j), 1) + ')';
    }
}
