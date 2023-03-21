package f1;

import bs.a;

/* compiled from: PointerEvent.kt */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final long f14531a;

    private /* synthetic */ u(long j) {
        this.f14531a = j;
    }

    public static final /* synthetic */ u a(long j) {
        return new u(j);
    }

    public static long b(long j) {
        return j;
    }

    public static boolean c(long j, Object obj) {
        return (obj instanceof u) && j == ((u) obj).g();
    }

    public static final boolean d(long j, long j11) {
        return j == j11;
    }

    public static int e(long j) {
        return a.a(j);
    }

    public static String f(long j) {
        return "PointerId(value=" + j + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f14531a, obj);
    }

    public final /* synthetic */ long g() {
        return this.f14531a;
    }

    public int hashCode() {
        return e(this.f14531a);
    }

    public String toString() {
        return f(this.f14531a);
    }
}
