package i2;

/* compiled from: StopLogicEngine */
public class n implements m {

    /* renamed from: a  reason: collision with root package name */
    private float f14986a;

    /* renamed from: b  reason: collision with root package name */
    private float f14987b;

    /* renamed from: c  reason: collision with root package name */
    private float f14988c;

    /* renamed from: d  reason: collision with root package name */
    private float f14989d;

    /* renamed from: e  reason: collision with root package name */
    private float f14990e;

    /* renamed from: f  reason: collision with root package name */
    private float f14991f;

    /* renamed from: g  reason: collision with root package name */
    private float f14992g;

    /* renamed from: h  reason: collision with root package name */
    private float f14993h;

    /* renamed from: i  reason: collision with root package name */
    private float f14994i;
    private int j;
    private String k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f14995l = false;

    /* renamed from: m  reason: collision with root package name */
    private float f14996m;
    private float n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f14997o = false;

    private float c(float f11) {
        this.f14997o = false;
        float f12 = this.f14989d;
        if (f11 <= f12) {
            float f13 = this.f14986a;
            return (f13 * f11) + ((((this.f14987b - f13) * f11) * f11) / (f12 * 2.0f));
        }
        int i11 = this.j;
        if (i11 == 1) {
            return this.f14992g;
        }
        float f14 = f11 - f12;
        float f15 = this.f14990e;
        if (f14 < f15) {
            float f16 = this.f14992g;
            float f17 = this.f14987b;
            return f16 + (f17 * f14) + ((((this.f14988c - f17) * f14) * f14) / (f15 * 2.0f));
        } else if (i11 == 2) {
            return this.f14993h;
        } else {
            float f18 = f14 - f15;
            float f19 = this.f14991f;
            if (f18 <= f19) {
                float f21 = this.f14993h;
                float f22 = this.f14988c;
                return (f21 + (f22 * f18)) - (((f22 * f18) * f18) / (f19 * 2.0f));
            }
            this.f14997o = true;
            return this.f14994i;
        }
    }

    private void f(float f11, float f12, float f13, float f14, float f15) {
        this.f14997o = false;
        if (f11 == 0.0f) {
            f11 = 1.0E-4f;
        }
        this.f14986a = f11;
        float f16 = f11 / f13;
        float f17 = (f16 * f11) / 2.0f;
        if (f11 < 0.0f) {
            float sqrt = (float) Math.sqrt((double) ((f12 - ((((-f11) / f13) * f11) / 2.0f)) * f13));
            if (sqrt < f14) {
                this.k = "backward accelerate, decelerate";
                this.j = 2;
                this.f14986a = f11;
                this.f14987b = sqrt;
                this.f14988c = 0.0f;
                float f18 = (sqrt - f11) / f13;
                this.f14989d = f18;
                this.f14990e = sqrt / f13;
                this.f14992g = ((f11 + sqrt) * f18) / 2.0f;
                this.f14993h = f12;
                this.f14994i = f12;
                return;
            }
            this.k = "backward accelerate cruse decelerate";
            this.j = 3;
            this.f14986a = f11;
            this.f14987b = f14;
            this.f14988c = f14;
            float f19 = (f14 - f11) / f13;
            this.f14989d = f19;
            float f21 = f14 / f13;
            this.f14991f = f21;
            float f22 = ((f11 + f14) * f19) / 2.0f;
            float f23 = (f21 * f14) / 2.0f;
            this.f14990e = ((f12 - f22) - f23) / f14;
            this.f14992g = f22;
            this.f14993h = f12 - f23;
            this.f14994i = f12;
        } else if (f17 >= f12) {
            this.k = "hard stop";
            this.j = 1;
            this.f14986a = f11;
            this.f14987b = 0.0f;
            this.f14992g = f12;
            this.f14989d = (2.0f * f12) / f11;
        } else {
            float f24 = f12 - f17;
            float f25 = f24 / f11;
            if (f25 + f16 < f15) {
                this.k = "cruse decelerate";
                this.j = 2;
                this.f14986a = f11;
                this.f14987b = f11;
                this.f14988c = 0.0f;
                this.f14992g = f24;
                this.f14993h = f12;
                this.f14989d = f25;
                this.f14990e = f16;
                return;
            }
            float sqrt2 = (float) Math.sqrt((double) ((f13 * f12) + ((f11 * f11) / 2.0f)));
            float f26 = (sqrt2 - f11) / f13;
            this.f14989d = f26;
            float f27 = sqrt2 / f13;
            this.f14990e = f27;
            if (sqrt2 < f14) {
                this.k = "accelerate decelerate";
                this.j = 2;
                this.f14986a = f11;
                this.f14987b = sqrt2;
                this.f14988c = 0.0f;
                this.f14989d = f26;
                this.f14990e = f27;
                this.f14992g = ((f11 + sqrt2) * f26) / 2.0f;
                this.f14993h = f12;
                return;
            }
            this.k = "accelerate cruse decelerate";
            this.j = 3;
            this.f14986a = f11;
            this.f14987b = f14;
            this.f14988c = f14;
            float f28 = (f14 - f11) / f13;
            this.f14989d = f28;
            float f29 = f14 / f13;
            this.f14991f = f29;
            float f31 = ((f11 + f14) * f28) / 2.0f;
            float f32 = (f29 * f14) / 2.0f;
            this.f14990e = ((f12 - f31) - f32) / f14;
            this.f14992g = f31;
            this.f14993h = f12 - f32;
            this.f14994i = f12;
        }
    }

    public float a() {
        return this.f14995l ? -e(this.n) : e(this.n);
    }

    public boolean b() {
        return a() < 1.0E-5f && Math.abs(this.f14994i - this.n) < 1.0E-5f;
    }

    public void d(float f11, float f12, float f13, float f14, float f15, float f16) {
        boolean z11 = false;
        this.f14997o = false;
        this.f14996m = f11;
        if (f11 > f12) {
            z11 = true;
        }
        this.f14995l = z11;
        if (z11) {
            f(-f13, f11 - f12, f15, f16, f14);
            return;
        }
        f(f13, f12 - f11, f15, f16, f14);
    }

    public float e(float f11) {
        float f12 = this.f14989d;
        if (f11 <= f12) {
            float f13 = this.f14986a;
            return f13 + (((this.f14987b - f13) * f11) / f12);
        }
        int i11 = this.j;
        if (i11 == 1) {
            return 0.0f;
        }
        float f14 = f11 - f12;
        float f15 = this.f14990e;
        if (f14 < f15) {
            float f16 = this.f14987b;
            return f16 + (((this.f14988c - f16) * f14) / f15);
        } else if (i11 == 2) {
            return this.f14993h;
        } else {
            float f17 = f14 - f15;
            float f18 = this.f14991f;
            if (f17 >= f18) {
                return this.f14994i;
            }
            float f19 = this.f14988c;
            return f19 - ((f17 * f19) / f18);
        }
    }

    public float getInterpolation(float f11) {
        float c11 = c(f11);
        this.n = f11;
        return this.f14995l ? this.f14996m - c11 : this.f14996m + c11;
    }
}
