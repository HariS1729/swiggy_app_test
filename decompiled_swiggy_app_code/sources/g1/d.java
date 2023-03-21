package g1;

import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: VelocityTracker.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final List<Float> f14716a;

    /* renamed from: b  reason: collision with root package name */
    private final float f14717b;

    public d(List<Float> list, float f11) {
        p.j(list, "coefficients");
        this.f14716a = list;
        this.f14717b = f11;
    }

    public final List<Float> a() {
        return this.f14716a;
    }

    public final float b() {
        return this.f14717b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p.e(this.f14716a, dVar.f14716a) && p.e(Float.valueOf(this.f14717b), Float.valueOf(dVar.f14717b));
    }

    public int hashCode() {
        return (this.f14716a.hashCode() * 31) + Float.floatToIntBits(this.f14717b);
    }

    public String toString() {
        return "PolynomialFit(coefficients=" + this.f14716a + ", confidence=" + this.f14717b + ')';
    }
}
