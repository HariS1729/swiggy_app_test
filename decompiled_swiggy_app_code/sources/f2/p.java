package f2;

/* compiled from: ConstraintSetParser.kt */
public final class p implements o {

    /* renamed from: a  reason: collision with root package name */
    private float f14598a;

    /* renamed from: b  reason: collision with root package name */
    private float f14599b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14600c;

    public p(float f11, float f12) {
        this.f14598a = f12;
        this.f14599b = f11;
    }

    public float value() {
        if (!this.f14600c) {
            this.f14599b += this.f14598a;
        }
        return this.f14599b;
    }
}
