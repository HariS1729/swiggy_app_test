package t0;

/* compiled from: MutableRect.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private float f16658a;

    /* renamed from: b  reason: collision with root package name */
    private float f16659b;

    /* renamed from: c  reason: collision with root package name */
    private float f16660c;

    /* renamed from: d  reason: collision with root package name */
    private float f16661d;

    public d(float f11, float f12, float f13, float f14) {
        this.f16658a = f11;
        this.f16659b = f12;
        this.f16660c = f13;
        this.f16661d = f14;
    }

    public final float a() {
        return this.f16661d;
    }

    public final float b() {
        return this.f16658a;
    }

    public final float c() {
        return this.f16660c;
    }

    public final float d() {
        return this.f16659b;
    }

    public final void e(float f11, float f12, float f13, float f14) {
        this.f16658a = Math.max(f11, this.f16658a);
        this.f16659b = Math.max(f12, this.f16659b);
        this.f16660c = Math.min(f13, this.f16660c);
        this.f16661d = Math.min(f14, this.f16661d);
    }

    public final boolean f() {
        return this.f16658a >= this.f16660c || this.f16659b >= this.f16661d;
    }

    public final void g(float f11, float f12, float f13, float f14) {
        this.f16658a = f11;
        this.f16659b = f12;
        this.f16660c = f13;
        this.f16661d = f14;
    }

    public final void h(float f11) {
        this.f16661d = f11;
    }

    public final void i(float f11) {
        this.f16658a = f11;
    }

    public final void j(float f11) {
        this.f16660c = f11;
    }

    public final void k(float f11) {
        this.f16659b = f11;
    }

    public String toString() {
        return "MutableRect(" + c.a(this.f16658a, 1) + ", " + c.a(this.f16659b, 1) + ", " + c.a(this.f16660c, 1) + ", " + c.a(this.f16661d, 1) + ')';
    }
}
