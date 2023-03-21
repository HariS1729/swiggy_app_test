package t0;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: RoundRect.kt */
public final class j {

    /* renamed from: i  reason: collision with root package name */
    public static final a f16673i = new a((i) null);
    private static final j j = k.c(0.0f, 0.0f, 0.0f, 0.0f, a.f16656a.a());

    /* renamed from: a  reason: collision with root package name */
    private final float f16674a;

    /* renamed from: b  reason: collision with root package name */
    private final float f16675b;

    /* renamed from: c  reason: collision with root package name */
    private final float f16676c;

    /* renamed from: d  reason: collision with root package name */
    private final float f16677d;

    /* renamed from: e  reason: collision with root package name */
    private final long f16678e;

    /* renamed from: f  reason: collision with root package name */
    private final long f16679f;

    /* renamed from: g  reason: collision with root package name */
    private final long f16680g;

    /* renamed from: h  reason: collision with root package name */
    private final long f16681h;

    /* compiled from: RoundRect.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    private j(float f11, float f12, float f13, float f14, long j11, long j12, long j13, long j14) {
        this.f16674a = f11;
        this.f16675b = f12;
        this.f16676c = f13;
        this.f16677d = f14;
        this.f16678e = j11;
        this.f16679f = j12;
        this.f16680g = j13;
        this.f16681h = j14;
    }

    public /* synthetic */ j(float f11, float f12, float f13, float f14, long j11, long j12, long j13, long j14, i iVar) {
        this(f11, f12, f13, f14, j11, j12, j13, j14);
    }

    public final float a() {
        return this.f16677d;
    }

    public final long b() {
        return this.f16681h;
    }

    public final long c() {
        return this.f16680g;
    }

    public final float d() {
        return this.f16677d - this.f16675b;
    }

    public final float e() {
        return this.f16674a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p.e(Float.valueOf(this.f16674a), Float.valueOf(jVar.f16674a)) && p.e(Float.valueOf(this.f16675b), Float.valueOf(jVar.f16675b)) && p.e(Float.valueOf(this.f16676c), Float.valueOf(jVar.f16676c)) && p.e(Float.valueOf(this.f16677d), Float.valueOf(jVar.f16677d)) && a.c(this.f16678e, jVar.f16678e) && a.c(this.f16679f, jVar.f16679f) && a.c(this.f16680g, jVar.f16680g) && a.c(this.f16681h, jVar.f16681h);
    }

    public final float f() {
        return this.f16676c;
    }

    public final float g() {
        return this.f16675b;
    }

    public final long h() {
        return this.f16678e;
    }

    public int hashCode() {
        return (((((((((((((Float.floatToIntBits(this.f16674a) * 31) + Float.floatToIntBits(this.f16675b)) * 31) + Float.floatToIntBits(this.f16676c)) * 31) + Float.floatToIntBits(this.f16677d)) * 31) + a.f(this.f16678e)) * 31) + a.f(this.f16679f)) * 31) + a.f(this.f16680g)) * 31) + a.f(this.f16681h);
    }

    public final long i() {
        return this.f16679f;
    }

    public final float j() {
        return this.f16676c - this.f16674a;
    }

    public String toString() {
        long j11 = this.f16678e;
        long j12 = this.f16679f;
        long j13 = this.f16680g;
        long j14 = this.f16681h;
        String str = c.a(this.f16674a, 1) + ", " + c.a(this.f16675b, 1) + ", " + c.a(this.f16676c, 1) + ", " + c.a(this.f16677d, 1);
        if (!a.c(j11, j12) || !a.c(j12, j13) || !a.c(j13, j14)) {
            return "RoundRect(rect=" + str + ", topLeft=" + a.g(j11) + ", topRight=" + a.g(j12) + ", bottomRight=" + a.g(j13) + ", bottomLeft=" + a.g(j14) + ')';
        }
        if (a.d(j11) == a.e(j11)) {
            return "RoundRect(rect=" + str + ", radius=" + c.a(a.d(j11), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + c.a(a.d(j11), 1) + ", y=" + c.a(a.e(j11), 1) + ')';
    }
}
