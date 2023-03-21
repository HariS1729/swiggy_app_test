package androidx.core.content.res;

/* compiled from: CamColor */
class a {

    /* renamed from: a  reason: collision with root package name */
    private final float f9179a;

    /* renamed from: b  reason: collision with root package name */
    private final float f9180b;

    /* renamed from: c  reason: collision with root package name */
    private final float f9181c;

    /* renamed from: d  reason: collision with root package name */
    private final float f9182d;

    /* renamed from: e  reason: collision with root package name */
    private final float f9183e;

    /* renamed from: f  reason: collision with root package name */
    private final float f9184f;

    /* renamed from: g  reason: collision with root package name */
    private final float f9185g;

    /* renamed from: h  reason: collision with root package name */
    private final float f9186h;

    /* renamed from: i  reason: collision with root package name */
    private final float f9187i;

    a(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        this.f9179a = f11;
        this.f9180b = f12;
        this.f9181c = f13;
        this.f9182d = f14;
        this.f9183e = f15;
        this.f9184f = f16;
        this.f9185g = f17;
        this.f9186h = f18;
        this.f9187i = f19;
    }

    private static a b(float f11, float f12, float f13) {
        float f14 = 1000.0f;
        a aVar = null;
        float f15 = 1000.0f;
        float f16 = 100.0f;
        float f17 = 0.0f;
        while (Math.abs(f17 - f16) > 0.01f) {
            float f18 = ((f16 - f17) / 2.0f) + f17;
            int p11 = e(f18, f12, f11).p();
            float b11 = b.b(p11);
            float abs = Math.abs(f13 - b11);
            if (abs < 0.2f) {
                a c11 = c(p11);
                float a11 = c11.a(e(c11.k(), c11.i(), f11));
                if (a11 <= 1.0f) {
                    aVar = c11;
                    f14 = abs;
                    f15 = a11;
                }
            }
            if (f14 == 0.0f && f15 == 0.0f) {
                break;
            } else if (b11 < f13) {
                f17 = f18;
            } else {
                f16 = f18;
            }
        }
        return aVar;
    }

    static a c(int i11) {
        return d(i11, l.k);
    }

    static a d(int i11, l lVar) {
        float[] f11 = b.f(i11);
        float[][] fArr = b.f9188a;
        float f12 = (f11[0] * fArr[0][0]) + (f11[1] * fArr[0][1]) + (f11[2] * fArr[0][2]);
        float f13 = (f11[0] * fArr[1][0]) + (f11[1] * fArr[1][1]) + (f11[2] * fArr[1][2]);
        float f14 = (f11[0] * fArr[2][0]) + (f11[1] * fArr[2][1]) + (f11[2] * fArr[2][2]);
        float f15 = lVar.i()[0] * f12;
        float f16 = lVar.i()[1] * f13;
        float f17 = lVar.i()[2] * f14;
        float pow = (float) Math.pow(((double) (lVar.c() * Math.abs(f15))) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (lVar.c() * Math.abs(f16))) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (lVar.c() * Math.abs(f17))) / 100.0d, 0.42d);
        float signum = ((Math.signum(f15) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f16) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f17) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d11 = (double) signum3;
        float f18 = ((float) (((((double) signum) * 11.0d) + (((double) signum2) * -12.0d)) + d11)) / 11.0f;
        float f19 = ((float) (((double) (signum + signum2)) - (d11 * 2.0d))) / 9.0f;
        float f21 = signum2 * 20.0f;
        float f22 = (((signum * 20.0f) + f21) + (21.0f * signum3)) / 20.0f;
        float f23 = (((signum * 40.0f) + f21) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f19, (double) f18)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f24 = atan2;
        float f25 = (3.1415927f * f24) / 180.0f;
        float pow4 = ((float) Math.pow((double) ((f23 * lVar.f()) / lVar.a()), (double) (lVar.b() * lVar.j()))) * 100.0f;
        float d12 = lVar.d() * (4.0f / lVar.b()) * ((float) Math.sqrt((double) (pow4 / 100.0f))) * (lVar.a() + 4.0f);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) lVar.e()), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) (((double) f24) < 20.14d ? 360.0f + f24 : f24)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.g()) * lVar.h()) * ((float) Math.sqrt((double) ((f18 * f18) + (f19 * f19))))) / (f22 + 0.305f)), 0.9d));
        float sqrt = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        float d13 = sqrt * lVar.d();
        float sqrt2 = ((float) Math.sqrt((double) ((pow5 * lVar.b()) / (lVar.a() + 4.0f)))) * 50.0f;
        float f26 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((0.0228f * d13) + 1.0f))) * 43.85965f;
        double d14 = (double) f25;
        return new a(f24, sqrt, pow4, d12, d13, sqrt2, f26, log * ((float) Math.cos(d14)), log * ((float) Math.sin(d14)));
    }

    private static a e(float f11, float f12, float f13) {
        return f(f11, f12, f13, l.k);
    }

    private static a f(float f11, float f12, float f13, l lVar) {
        float f14 = f11;
        double d11 = ((double) f14) / 100.0d;
        float b11 = (4.0f / lVar.b()) * ((float) Math.sqrt(d11)) * (lVar.a() + 4.0f) * lVar.d();
        float d12 = f12 * lVar.d();
        float sqrt = ((float) Math.sqrt((double) (((f12 / ((float) Math.sqrt(d11))) * lVar.b()) / (lVar.a() + 4.0f)))) * 50.0f;
        float f15 = (1.7f * f14) / ((0.007f * f14) + 1.0f);
        float log = ((float) Math.log((((double) d12) * 0.0228d) + 1.0d)) * 43.85965f;
        double d13 = (double) ((3.1415927f * f13) / 180.0f);
        return new a(f13, f12, f14, b11, d12, sqrt, f15, log * ((float) Math.cos(d13)), log * ((float) Math.sin(d13)));
    }

    static int m(float f11, float f12, float f13) {
        return n(f11, f12, f13, l.k);
    }

    static int n(float f11, float f12, float f13, l lVar) {
        float f14;
        if (((double) f12) < 1.0d || ((double) Math.round(f13)) <= 0.0d || ((double) Math.round(f13)) >= 100.0d) {
            return b.a(f13);
        }
        if (f11 < 0.0f) {
            f14 = 0.0f;
        } else {
            f14 = Math.min(360.0f, f11);
        }
        float f15 = f12;
        a aVar = null;
        float f16 = 0.0f;
        boolean z11 = true;
        while (Math.abs(f16 - f12) >= 0.4f) {
            a b11 = b(f14, f15, f13);
            if (z11) {
                if (b11 != null) {
                    return b11.o(lVar);
                }
                z11 = false;
            } else if (b11 == null) {
                f12 = f15;
            } else {
                f16 = f15;
                aVar = b11;
            }
            f15 = ((f12 - f16) / 2.0f) + f16;
        }
        if (aVar == null) {
            return b.a(f13);
        }
        return aVar.o(lVar);
    }

    /* access modifiers changed from: package-private */
    public float a(a aVar) {
        float l11 = l() - aVar.l();
        float g11 = g() - aVar.g();
        float h11 = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((double) ((l11 * l11) + (g11 * g11) + (h11 * h11))), 0.63d) * 1.41d);
    }

    /* access modifiers changed from: package-private */
    public float g() {
        return this.f9186h;
    }

    /* access modifiers changed from: package-private */
    public float h() {
        return this.f9187i;
    }

    /* access modifiers changed from: package-private */
    public float i() {
        return this.f9180b;
    }

    /* access modifiers changed from: package-private */
    public float j() {
        return this.f9179a;
    }

    /* access modifiers changed from: package-private */
    public float k() {
        return this.f9181c;
    }

    /* access modifiers changed from: package-private */
    public float l() {
        return this.f9185g;
    }

    /* access modifiers changed from: package-private */
    public int o(l lVar) {
        float pow = (float) Math.pow(((double) ((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(((double) k()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, (double) lVar.e()), 0.73d), 1.1111111111111112d);
        double j = (double) ((j() * 3.1415927f) / 180.0f);
        float a11 = lVar.a() * ((float) Math.pow(((double) k()) / 100.0d, (1.0d / ((double) lVar.b())) / ((double) lVar.j())));
        float cos = ((float) (Math.cos(2.0d + j) + 3.8d)) * 0.25f * 3846.1538f * lVar.g() * lVar.h();
        float f11 = a11 / lVar.f();
        float sin = (float) Math.sin(j);
        float cos2 = (float) Math.cos(j);
        float f12 = (((0.305f + f11) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f13 = cos2 * f12;
        float f14 = f12 * sin;
        float f15 = f11 * 460.0f;
        float f16 = (((451.0f * f13) + f15) + (288.0f * f14)) / 1403.0f;
        float f17 = ((f15 - (891.0f * f13)) - (261.0f * f14)) / 1403.0f;
        float f18 = ((f15 - (f13 * 220.0f)) - (f14 * 6300.0f)) / 1403.0f;
        float signum = Math.signum(f16) * (100.0f / lVar.c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f16)) * 27.13d) / (400.0d - ((double) Math.abs(f16))))), 2.380952380952381d));
        float signum2 = Math.signum(f17) * (100.0f / lVar.c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f17)) * 27.13d) / (400.0d - ((double) Math.abs(f17))))), 2.380952380952381d));
        float signum3 = Math.signum(f18) * (100.0f / lVar.c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f18)) * 27.13d) / (400.0d - ((double) Math.abs(f18))))), 2.380952380952381d));
        float f19 = signum / lVar.i()[0];
        float f21 = signum2 / lVar.i()[1];
        float f22 = signum3 / lVar.i()[2];
        float[][] fArr = b.f9189b;
        return androidx.core.graphics.a.b((double) ((fArr[0][0] * f19) + (fArr[0][1] * f21) + (fArr[0][2] * f22)), (double) ((fArr[1][0] * f19) + (fArr[1][1] * f21) + (fArr[1][2] * f22)), (double) ((f19 * fArr[2][0]) + (f21 * fArr[2][1]) + (f22 * fArr[2][2])));
    }

    /* access modifiers changed from: package-private */
    public int p() {
        return o(l.k);
    }
}
