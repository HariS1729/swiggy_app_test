package v0;

import kotlin.jvm.internal.p;

/* compiled from: WhitePoint.kt */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final float f17048a;

    /* renamed from: b  reason: collision with root package name */
    private final float f17049b;

    public h(float f11, float f12) {
        this.f17048a = f11;
        this.f17049b = f12;
    }

    public final float a() {
        return this.f17048a;
    }

    public final float b() {
        return this.f17049b;
    }

    public final float[] c() {
        float f11 = this.f17048a;
        float f12 = this.f17049b;
        return new float[]{f11 / f12, 1.0f, ((1.0f - f11) - f12) / f12};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p.e(Float.valueOf(this.f17048a), Float.valueOf(hVar.f17048a)) && p.e(Float.valueOf(this.f17049b), Float.valueOf(hVar.f17049b));
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f17048a) * 31) + Float.floatToIntBits(this.f17049b);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f17048a + ", y=" + this.f17049b + ')';
    }
}
