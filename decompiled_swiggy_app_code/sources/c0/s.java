package c0;

/* compiled from: Swipeable.kt */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private final float f12741a;

    /* renamed from: b  reason: collision with root package name */
    private final float f12742b;

    /* renamed from: c  reason: collision with root package name */
    private final float f12743c;

    public s(float f11, float f12, float f13) {
        this.f12741a = f11;
        this.f12742b = f12;
        this.f12743c = f13;
    }

    public final float a(float f11) {
        float f12 = f11 < 0.0f ? this.f12742b : this.f12743c;
        if (f12 == 0.0f) {
            return 0.0f;
        }
        return (this.f12741a / f12) * ((float) Math.sin((double) ((l.l(f11 / this.f12741a, -1.0f, 1.0f) * 3.1415927f) / ((float) 2))));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (!(this.f12741a == sVar.f12741a)) {
            return false;
        }
        if (!(this.f12742b == sVar.f12742b)) {
            return false;
        }
        return (this.f12743c > sVar.f12743c ? 1 : (this.f12743c == sVar.f12743c ? 0 : -1)) == 0;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.f12741a) * 31) + Float.floatToIntBits(this.f12742b)) * 31) + Float.floatToIntBits(this.f12743c);
    }

    public String toString() {
        return "ResistanceConfig(basis=" + this.f12741a + ", factorAtMin=" + this.f12742b + ", factorAtMax=" + this.f12743c + ')';
    }
}
