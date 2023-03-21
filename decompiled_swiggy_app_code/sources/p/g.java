package p;

import d2.e;
import kotlin.jvm.internal.p;

/* compiled from: FlingCalculator.kt */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final float f16000a;

    /* renamed from: b  reason: collision with root package name */
    private final e f16001b;

    /* renamed from: c  reason: collision with root package name */
    private final float f16002c;

    /* compiled from: FlingCalculator.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final float f16003a;

        /* renamed from: b  reason: collision with root package name */
        private final float f16004b;

        /* renamed from: c  reason: collision with root package name */
        private final long f16005c;

        public a(float f11, float f12, long j) {
            this.f16003a = f11;
            this.f16004b = f12;
            this.f16005c = j;
        }

        public final float a(long j) {
            long j11 = this.f16005c;
            return this.f16004b * Math.signum(this.f16003a) * a.f15983a.b(j11 > 0 ? ((float) j) / ((float) j11) : 1.0f).a();
        }

        public final float b(long j) {
            long j11 = this.f16005c;
            return (((a.f15983a.b(j11 > 0 ? ((float) j) / ((float) j11) : 1.0f).b() * Math.signum(this.f16003a)) * this.f16004b) / ((float) this.f16005c)) * 1000.0f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p.e(Float.valueOf(this.f16003a), Float.valueOf(aVar.f16003a)) && p.e(Float.valueOf(this.f16004b), Float.valueOf(aVar.f16004b)) && this.f16005c == aVar.f16005c;
        }

        public int hashCode() {
            return (((Float.floatToIntBits(this.f16003a) * 31) + Float.floatToIntBits(this.f16004b)) * 31) + bs.a.a(this.f16005c);
        }

        public String toString() {
            return "FlingInfo(initialVelocity=" + this.f16003a + ", distance=" + this.f16004b + ", duration=" + this.f16005c + ')';
        }
    }

    public g(float f11, e eVar) {
        p.j(eVar, "density");
        this.f16000a = f11;
        this.f16001b = eVar;
        this.f16002c = a(eVar);
    }

    private final float a(e eVar) {
        return h.c(0.84f, eVar.getDensity());
    }

    private final double e(float f11) {
        return a.f15983a.a(f11, this.f16000a * this.f16002c);
    }

    public final float b(float f11) {
        double e11 = e(f11);
        return (float) (((double) (this.f16000a * this.f16002c)) * Math.exp((((double) h.f16006a) / (((double) h.f16006a) - 1.0d)) * e11));
    }

    public final long c(float f11) {
        return (long) (Math.exp(e(f11) / (((double) h.f16006a) - 1.0d)) * 1000.0d);
    }

    public final a d(float f11) {
        double e11 = e(f11);
        double b11 = ((double) h.f16006a) - 1.0d;
        return new a(f11, (float) (((double) (this.f16000a * this.f16002c)) * Math.exp((((double) h.f16006a) / b11) * e11)), (long) (Math.exp(e11 / b11) * 1000.0d));
    }
}
