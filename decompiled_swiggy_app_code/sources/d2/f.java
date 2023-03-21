package d2;

import kotlin.jvm.internal.p;

/* compiled from: Density.kt */
final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final float f13995a;

    /* renamed from: b  reason: collision with root package name */
    private final float f13996b;

    public f(float f11, float f12) {
        this.f13995a = f11;
        this.f13996b = f12;
    }

    public /* synthetic */ float M(float f11) {
        return d.c(this, f11);
    }

    public /* synthetic */ long S(long j) {
        return d.h(this, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p.e(Float.valueOf(getDensity()), Float.valueOf(fVar.getDensity())) && p.e(Float.valueOf(u0()), Float.valueOf(fVar.u0()));
    }

    public float getDensity() {
        return this.f13995a;
    }

    public int hashCode() {
        return (Float.floatToIntBits(getDensity()) * 31) + Float.floatToIntBits(u0());
    }

    public /* synthetic */ int j0(float f11) {
        return d.b(this, f11);
    }

    public /* synthetic */ float k(int i11) {
        return d.d(this, i11);
    }

    public /* synthetic */ float m0(long j) {
        return d.f(this, j);
    }

    public /* synthetic */ long o(long j) {
        return d.e(this, j);
    }

    public /* synthetic */ long q(int i11) {
        return d.i(this, i11);
    }

    public String toString() {
        return "DensityImpl(density=" + getDensity() + ", fontScale=" + u0() + ')';
    }

    public float u0() {
        return this.f13996b;
    }

    public /* synthetic */ float v0(float f11) {
        return d.g(this, f11);
    }

    public /* synthetic */ int y0(long j) {
        return d.a(this, j);
    }
}
