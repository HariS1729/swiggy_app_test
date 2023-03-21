package p;

import kotlin.jvm.internal.p;

/* compiled from: SplineBasedDecay.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f15983a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final float[] f15984b;

    /* renamed from: c  reason: collision with root package name */
    private static final float[] f15985c;

    /* renamed from: p.a$a  reason: collision with other inner class name */
    /* compiled from: SplineBasedDecay.kt */
    public static final class C0159a {

        /* renamed from: a  reason: collision with root package name */
        private final float f15986a;

        /* renamed from: b  reason: collision with root package name */
        private final float f15987b;

        public C0159a(float f11, float f12) {
            this.f15986a = f11;
            this.f15987b = f12;
        }

        public final float a() {
            return this.f15986a;
        }

        public final float b() {
            return this.f15987b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0159a)) {
                return false;
            }
            C0159a aVar = (C0159a) obj;
            return p.e(Float.valueOf(this.f15986a), Float.valueOf(aVar.f15986a)) && p.e(Float.valueOf(this.f15987b), Float.valueOf(aVar.f15987b));
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f15986a) * 31) + Float.floatToIntBits(this.f15987b);
        }

        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.f15986a + ", velocityCoefficient=" + this.f15987b + ')';
        }
    }

    static {
        float[] fArr = new float[101];
        f15984b = fArr;
        float[] fArr2 = new float[101];
        f15985c = fArr2;
        n.b(fArr, fArr2, 100);
    }

    private a() {
    }

    public final double a(float f11, float f12) {
        return Math.log(((double) (Math.abs(f11) * 0.35f)) / ((double) f12));
    }

    public final C0159a b(float f11) {
        float f12;
        float f13;
        float f14 = (float) 100;
        int i11 = (int) (f14 * f11);
        if (i11 < 100) {
            float f15 = ((float) i11) / f14;
            int i12 = i11 + 1;
            float f16 = ((float) i12) / f14;
            float[] fArr = f15984b;
            float f17 = fArr[i11];
            f13 = (fArr[i12] - f17) / (f16 - f15);
            f12 = f17 + ((f11 - f15) * f13);
        } else {
            f12 = 1.0f;
            f13 = 0.0f;
        }
        return new C0159a(f12, f13);
    }
}
