package c3;

import c3.b;

/* compiled from: SpringForce */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    double f12804a = Math.sqrt(1500.0d);

    /* renamed from: b  reason: collision with root package name */
    double f12805b = 0.5d;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12806c = false;

    /* renamed from: d  reason: collision with root package name */
    private double f12807d;

    /* renamed from: e  reason: collision with root package name */
    private double f12808e;

    /* renamed from: f  reason: collision with root package name */
    private double f12809f;

    /* renamed from: g  reason: collision with root package name */
    private double f12810g;

    /* renamed from: h  reason: collision with root package name */
    private double f12811h;

    /* renamed from: i  reason: collision with root package name */
    private double f12812i = Double.MAX_VALUE;
    private final b.o j = new b.o();

    public e(float f11) {
        this.f12812i = (double) f11;
    }

    private void b() {
        if (!this.f12806c) {
            if (this.f12812i != Double.MAX_VALUE) {
                double d11 = this.f12805b;
                if (d11 > 1.0d) {
                    double d12 = this.f12804a;
                    this.f12809f = ((-d11) * d12) + (d12 * Math.sqrt((d11 * d11) - 1.0d));
                    double d13 = this.f12805b;
                    double d14 = this.f12804a;
                    this.f12810g = ((-d13) * d14) - (d14 * Math.sqrt((d13 * d13) - 1.0d));
                } else if (d11 >= 0.0d && d11 < 1.0d) {
                    this.f12811h = this.f12804a * Math.sqrt(1.0d - (d11 * d11));
                }
                this.f12806c = true;
                return;
            }
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
    }

    public float a() {
        return (float) this.f12812i;
    }

    public boolean c(float f11, float f12) {
        return ((double) Math.abs(f12)) < this.f12808e && ((double) Math.abs(f11 - a())) < this.f12807d;
    }

    public e d(float f11) {
        if (f11 >= 0.0f) {
            this.f12805b = (double) f11;
            this.f12806c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public e e(float f11) {
        this.f12812i = (double) f11;
        return this;
    }

    public e f(float f11) {
        if (f11 > 0.0f) {
            this.f12804a = Math.sqrt((double) f11);
            this.f12806c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* access modifiers changed from: package-private */
    public void g(double d11) {
        double abs = Math.abs(d11);
        this.f12807d = abs;
        this.f12808e = abs * 62.5d;
    }

    /* access modifiers changed from: package-private */
    public b.o h(double d11, double d12, long j11) {
        double d13;
        double d14;
        b();
        double d15 = ((double) j11) / 1000.0d;
        double d16 = d11 - this.f12812i;
        double d17 = this.f12805b;
        if (d17 > 1.0d) {
            double d18 = this.f12810g;
            double d19 = this.f12809f;
            double d21 = d16 - (((d18 * d16) - d12) / (d18 - d19));
            double d22 = ((d16 * d18) - d12) / (d18 - d19);
            d14 = (Math.pow(2.718281828459045d, d18 * d15) * d21) + (Math.pow(2.718281828459045d, this.f12809f * d15) * d22);
            double d23 = this.f12810g;
            double pow = d21 * d23 * Math.pow(2.718281828459045d, d23 * d15);
            double d24 = this.f12809f;
            d13 = pow + (d22 * d24 * Math.pow(2.718281828459045d, d24 * d15));
        } else if (d17 == 1.0d) {
            double d25 = this.f12804a;
            double d26 = d12 + (d25 * d16);
            double d27 = d16 + (d26 * d15);
            d14 = Math.pow(2.718281828459045d, (-d25) * d15) * d27;
            double pow2 = d27 * Math.pow(2.718281828459045d, (-this.f12804a) * d15);
            double d28 = this.f12804a;
            d13 = (d26 * Math.pow(2.718281828459045d, (-d28) * d15)) + (pow2 * (-d28));
        } else {
            double d29 = 1.0d / this.f12811h;
            double d31 = this.f12804a;
            double d32 = d29 * ((d17 * d31 * d16) + d12);
            double pow3 = Math.pow(2.718281828459045d, (-d17) * d31 * d15) * ((Math.cos(this.f12811h * d15) * d16) + (Math.sin(this.f12811h * d15) * d32));
            double d33 = this.f12804a;
            double d34 = this.f12805b;
            double d35 = (-d33) * pow3 * d34;
            double pow4 = Math.pow(2.718281828459045d, (-d34) * d33 * d15);
            double d36 = this.f12811h;
            double d37 = pow3;
            double sin = (-d36) * d16 * Math.sin(d36 * d15);
            double d38 = this.f12811h;
            d13 = d35 + (pow4 * (sin + (d32 * d38 * Math.cos(d38 * d15))));
            d14 = d37;
        }
        b.o oVar = this.j;
        oVar.f12801a = (float) (d14 + this.f12812i);
        oVar.f12802b = (float) d13;
        return oVar;
    }
}
