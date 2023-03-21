package d2;

import d2.h;
import kotlin.jvm.internal.i;

/* compiled from: Dp.kt */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final a f14006b = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f14007c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final long f14008d;

    /* renamed from: a  reason: collision with root package name */
    private final long f14009a;

    /* compiled from: Dp.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final long a() {
            return k.f14008d;
        }

        public final long b() {
            return k.f14007c;
        }
    }

    static {
        float f11 = (float) 0;
        f14007c = i.b(h.n(f11), h.n(f11));
        h.a aVar = h.f13997b;
        f14008d = i.b(aVar.c(), aVar.c());
    }

    private /* synthetic */ k(long j) {
        this.f14009a = j;
    }

    public static final /* synthetic */ k c(long j) {
        return new k(j);
    }

    public static long d(long j) {
        return j;
    }

    public static boolean e(long j, Object obj) {
        return (obj instanceof k) && j == ((k) obj).k();
    }

    public static final boolean f(long j, long j11) {
        return j == j11;
    }

    public static final float g(long j) {
        if (j != f14008d) {
            kotlin.jvm.internal.k kVar = kotlin.jvm.internal.k.f25688a;
            return h.n(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    public static final float h(long j) {
        if (j != f14008d) {
            kotlin.jvm.internal.k kVar = kotlin.jvm.internal.k.f25688a;
            return h.n(Float.intBitsToFloat((int) (j >> 32)));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    public static int i(long j) {
        return bs.a.a(j);
    }

    public static String j(long j) {
        if (!(j != f14006b.a())) {
            return "DpSize.Unspecified";
        }
        return h.r(h(j)) + " x " + h.r(g(j));
    }

    public boolean equals(Object obj) {
        return e(this.f14009a, obj);
    }

    public int hashCode() {
        return i(this.f14009a);
    }

    public final /* synthetic */ long k() {
        return this.f14009a;
    }

    public String toString() {
        return j(this.f14009a);
    }
}
