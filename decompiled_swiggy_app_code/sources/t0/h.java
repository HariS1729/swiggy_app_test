package t0;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: Rect.kt */
public final class h {

    /* renamed from: e  reason: collision with root package name */
    public static final a f16667e = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final h f16668f = new h(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a  reason: collision with root package name */
    private final float f16669a;

    /* renamed from: b  reason: collision with root package name */
    private final float f16670b;

    /* renamed from: c  reason: collision with root package name */
    private final float f16671c;

    /* renamed from: d  reason: collision with root package name */
    private final float f16672d;

    /* compiled from: Rect.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final h a() {
            return h.f16668f;
        }
    }

    public h(float f11, float f12, float f13, float f14) {
        this.f16669a = f11;
        this.f16670b = f12;
        this.f16671c = f13;
        this.f16672d = f14;
    }

    public static /* synthetic */ h d(h hVar, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = hVar.f16669a;
        }
        if ((i11 & 2) != 0) {
            f12 = hVar.f16670b;
        }
        if ((i11 & 4) != 0) {
            f13 = hVar.f16671c;
        }
        if ((i11 & 8) != 0) {
            f14 = hVar.f16672d;
        }
        return hVar.c(f11, f12, f13, f14);
    }

    public final boolean b(long j) {
        return f.m(j) >= this.f16669a && f.m(j) < this.f16671c && f.n(j) >= this.f16670b && f.n(j) < this.f16672d;
    }

    public final h c(float f11, float f12, float f13, float f14) {
        return new h(f11, f12, f13, f14);
    }

    public final float e() {
        return this.f16672d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p.e(Float.valueOf(this.f16669a), Float.valueOf(hVar.f16669a)) && p.e(Float.valueOf(this.f16670b), Float.valueOf(hVar.f16670b)) && p.e(Float.valueOf(this.f16671c), Float.valueOf(hVar.f16671c)) && p.e(Float.valueOf(this.f16672d), Float.valueOf(hVar.f16672d));
    }

    public final long f() {
        return g.a(this.f16671c, this.f16672d);
    }

    public final long g() {
        return g.a(this.f16669a + (n() / 2.0f), this.f16670b + (h() / 2.0f));
    }

    public final float h() {
        return this.f16672d - this.f16670b;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f16669a) * 31) + Float.floatToIntBits(this.f16670b)) * 31) + Float.floatToIntBits(this.f16671c)) * 31) + Float.floatToIntBits(this.f16672d);
    }

    public final float i() {
        return this.f16669a;
    }

    public final float j() {
        return this.f16671c;
    }

    public final long k() {
        return m.a(n(), h());
    }

    public final float l() {
        return this.f16670b;
    }

    public final long m() {
        return g.a(this.f16669a, this.f16670b);
    }

    public final float n() {
        return this.f16671c - this.f16669a;
    }

    public final h o(h hVar) {
        p.j(hVar, "other");
        return new h(Math.max(this.f16669a, hVar.f16669a), Math.max(this.f16670b, hVar.f16670b), Math.min(this.f16671c, hVar.f16671c), Math.min(this.f16672d, hVar.f16672d));
    }

    public final boolean p(h hVar) {
        p.j(hVar, "other");
        if (this.f16671c <= hVar.f16669a || hVar.f16671c <= this.f16669a || this.f16672d <= hVar.f16670b || hVar.f16672d <= this.f16670b) {
            return false;
        }
        return true;
    }

    public final h q(float f11, float f12) {
        return new h(this.f16669a + f11, this.f16670b + f12, this.f16671c + f11, this.f16672d + f12);
    }

    public final h r(long j) {
        return new h(this.f16669a + f.m(j), this.f16670b + f.n(j), this.f16671c + f.m(j), this.f16672d + f.n(j));
    }

    public String toString() {
        return "Rect.fromLTRB(" + c.a(this.f16669a, 1) + ", " + c.a(this.f16670b, 1) + ", " + c.a(this.f16671c, 1) + ", " + c.a(this.f16672d, 1) + ')';
    }
}
