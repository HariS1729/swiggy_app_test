package i2;

/* compiled from: SpringStopEngine */
public class k implements m {

    /* renamed from: a  reason: collision with root package name */
    double f14976a = 0.5d;

    /* renamed from: b  reason: collision with root package name */
    private boolean f14977b = false;

    /* renamed from: c  reason: collision with root package name */
    private double f14978c;

    /* renamed from: d  reason: collision with root package name */
    private double f14979d;

    /* renamed from: e  reason: collision with root package name */
    private double f14980e;

    /* renamed from: f  reason: collision with root package name */
    private float f14981f;

    /* renamed from: g  reason: collision with root package name */
    private float f14982g;

    /* renamed from: h  reason: collision with root package name */
    private float f14983h;

    /* renamed from: i  reason: collision with root package name */
    private float f14984i;
    private float j;
    private int k = 0;

    private void c(double d11) {
        double d12 = this.f14978c;
        double d13 = this.f14976a;
        int sqrt = (int) ((9.0d / ((Math.sqrt(d12 / ((double) this.f14984i)) * d11) * 4.0d)) + 1.0d);
        double d14 = d11 / ((double) sqrt);
        int i11 = 0;
        while (i11 < sqrt) {
            float f11 = this.f14982g;
            double d15 = this.f14979d;
            float f12 = this.f14983h;
            double d16 = d12;
            float f13 = this.f14984i;
            double d17 = d13;
            double d18 = ((double) f12) + ((((((-d12) * (((double) f11) - d15)) - (((double) f12) * d13)) / ((double) f13)) * d14) / 2.0d);
            double d19 = ((((-((((double) f11) + ((d14 * d18) / 2.0d)) - d15)) * d16) - (d18 * d17)) / ((double) f13)) * d14;
            float f14 = (float) (((double) f12) + d19);
            this.f14983h = f14;
            float f15 = (float) (((double) f11) + ((((double) f12) + (d19 / 2.0d)) * d14));
            this.f14982g = f15;
            int i12 = this.k;
            if (i12 > 0) {
                if (f15 < 0.0f && (i12 & 1) == 1) {
                    this.f14982g = -f15;
                    this.f14983h = -f14;
                }
                float f16 = this.f14982g;
                if (f16 > 1.0f && (i12 & 2) == 2) {
                    this.f14982g = 2.0f - f16;
                    this.f14983h = -this.f14983h;
                }
            }
            i11++;
            d12 = d16;
            d13 = d17;
        }
    }

    public float a() {
        return 0.0f;
    }

    public boolean b() {
        double d11 = ((double) this.f14982g) - this.f14979d;
        double d12 = this.f14978c;
        double d13 = (double) this.f14983h;
        return Math.sqrt((((d13 * d13) * ((double) this.f14984i)) + ((d12 * d11) * d11)) / d12) <= ((double) this.j);
    }

    public void d(float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i11) {
        this.f14979d = (double) f12;
        this.f14976a = (double) f16;
        this.f14977b = false;
        this.f14982g = f11;
        this.f14980e = (double) f13;
        this.f14978c = (double) f15;
        this.f14984i = f14;
        this.j = f17;
        this.k = i11;
        this.f14981f = 0.0f;
    }

    public float getInterpolation(float f11) {
        c((double) (f11 - this.f14981f));
        this.f14981f = f11;
        return this.f14982g;
    }
}
