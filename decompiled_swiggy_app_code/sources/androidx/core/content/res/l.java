package androidx.core.content.res;

/* compiled from: ViewingConditions */
final class l {
    static final l k = k(b.f9190c, (float) ((((double) b.h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a  reason: collision with root package name */
    private final float f9224a;

    /* renamed from: b  reason: collision with root package name */
    private final float f9225b;

    /* renamed from: c  reason: collision with root package name */
    private final float f9226c;

    /* renamed from: d  reason: collision with root package name */
    private final float f9227d;

    /* renamed from: e  reason: collision with root package name */
    private final float f9228e;

    /* renamed from: f  reason: collision with root package name */
    private final float f9229f;

    /* renamed from: g  reason: collision with root package name */
    private final float[] f9230g;

    /* renamed from: h  reason: collision with root package name */
    private final float f9231h;

    /* renamed from: i  reason: collision with root package name */
    private final float f9232i;
    private final float j;

    private l(float f11, float f12, float f13, float f14, float f15, float f16, float[] fArr, float f17, float f18, float f19) {
        this.f9229f = f11;
        this.f9224a = f12;
        this.f9225b = f13;
        this.f9226c = f14;
        this.f9227d = f15;
        this.f9228e = f16;
        this.f9230g = fArr;
        this.f9231h = f17;
        this.f9232i = f18;
        this.j = f19;
    }

    static l k(float[] fArr, float f11, float f12, float f13, boolean z11) {
        float f14;
        float f15 = f11;
        float[][] fArr2 = b.f9188a;
        float f16 = (fArr[0] * fArr2[0][0]) + (fArr[1] * fArr2[0][1]) + (fArr[2] * fArr2[0][2]);
        float f17 = (fArr[0] * fArr2[1][0]) + (fArr[1] * fArr2[1][1]) + (fArr[2] * fArr2[1][2]);
        float f18 = (fArr[0] * fArr2[2][0]) + (fArr[1] * fArr2[2][1]) + (fArr[2] * fArr2[2][2]);
        float f19 = (f13 / 10.0f) + 0.8f;
        float d11 = ((double) f19) >= 0.9d ? b.d(0.59f, 0.69f, (f19 - 0.9f) * 10.0f) : b.d(0.525f, 0.59f, (f19 - 0.8f) * 10.0f);
        if (z11) {
            f14 = 1.0f;
        } else {
            f14 = (1.0f - (((float) Math.exp((double) (((-f15) - 42.0f) / 92.0f))) * 0.2777778f)) * f19;
        }
        double d12 = (double) f14;
        if (d12 > 1.0d) {
            f14 = 1.0f;
        } else if (d12 < 0.0d) {
            f14 = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f16) * f14) + 1.0f) - f14, (((100.0f / f17) * f14) + 1.0f) - f14, (((100.0f / f18) * f14) + 1.0f) - f14};
        float f21 = 1.0f / ((5.0f * f15) + 1.0f);
        float f22 = f21 * f21 * f21 * f21;
        float f23 = 1.0f - f22;
        float cbrt = (f22 * f15) + (0.1f * f23 * f23 * ((float) Math.cbrt(((double) f15) * 5.0d)));
        float h11 = b.h(f12) / fArr[1];
        double d13 = (double) h11;
        float sqrt = ((float) Math.sqrt(d13)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d13, 0.2d));
        float[] fArr4 = {(float) Math.pow(((double) ((fArr3[0] * cbrt) * f16)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[1] * cbrt) * f17)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[2] * cbrt) * f18)) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new l(h11, ((fArr5[0] * 2.0f) + fArr5[1] + (fArr5[2] * 0.05f)) * pow, pow, pow, d11, f19, fArr3, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    /* access modifiers changed from: package-private */
    public float a() {
        return this.f9224a;
    }

    /* access modifiers changed from: package-private */
    public float b() {
        return this.f9227d;
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.f9231h;
    }

    /* access modifiers changed from: package-private */
    public float d() {
        return this.f9232i;
    }

    /* access modifiers changed from: package-private */
    public float e() {
        return this.f9229f;
    }

    /* access modifiers changed from: package-private */
    public float f() {
        return this.f9225b;
    }

    /* access modifiers changed from: package-private */
    public float g() {
        return this.f9228e;
    }

    /* access modifiers changed from: package-private */
    public float h() {
        return this.f9226c;
    }

    /* access modifiers changed from: package-private */
    public float[] i() {
        return this.f9230g;
    }

    /* access modifiers changed from: package-private */
    public float j() {
        return this.j;
    }
}
