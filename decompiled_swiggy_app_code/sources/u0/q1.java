package u0;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;

/* compiled from: TransformOrigin.kt */
public final class q1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16858b = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f16859c = r1.a(0.5f, 0.5f);

    /* renamed from: a  reason: collision with root package name */
    private final long f16860a;

    /* compiled from: TransformOrigin.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final long a() {
            return q1.f16859c;
        }
    }

    private /* synthetic */ q1(long j) {
        this.f16860a = j;
    }

    public static final /* synthetic */ q1 b(long j) {
        return new q1(j);
    }

    public static long c(long j) {
        return j;
    }

    public static boolean d(long j, Object obj) {
        return (obj instanceof q1) && j == ((q1) obj).j();
    }

    public static final boolean e(long j, long j11) {
        return j == j11;
    }

    public static final float f(long j) {
        k kVar = k.f25688a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float g(long j) {
        k kVar = k.f25688a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static int h(long j) {
        return bs.a.a(j);
    }

    public static String i(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f16860a, obj);
    }

    public int hashCode() {
        return h(this.f16860a);
    }

    public final /* synthetic */ long j() {
        return this.f16860a;
    }

    public String toString() {
        return i(this.f16860a);
    }
}
