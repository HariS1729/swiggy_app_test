package d2;

import kotlin.jvm.internal.i;

/* compiled from: IntSize.kt */
public final class p {

    /* renamed from: b  reason: collision with root package name */
    public static final a f14019b = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f14020c = c(0);

    /* renamed from: a  reason: collision with root package name */
    private final long f14021a;

    /* compiled from: IntSize.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final long a() {
            return p.f14020c;
        }
    }

    private /* synthetic */ p(long j) {
        this.f14021a = j;
    }

    public static final /* synthetic */ p b(long j) {
        return new p(j);
    }

    public static long c(long j) {
        return j;
    }

    public static boolean d(long j, Object obj) {
        return (obj instanceof p) && j == ((p) obj).j();
    }

    public static final boolean e(long j, long j11) {
        return j == j11;
    }

    public static final int f(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int g(long j) {
        return (int) (j >> 32);
    }

    public static int h(long j) {
        return bs.a.a(j);
    }

    public static String i(long j) {
        return g(j) + " x " + f(j);
    }

    public boolean equals(Object obj) {
        return d(this.f14021a, obj);
    }

    public int hashCode() {
        return h(this.f14021a);
    }

    public final /* synthetic */ long j() {
        return this.f14021a;
    }

    public String toString() {
        return i(this.f14021a);
    }
}
