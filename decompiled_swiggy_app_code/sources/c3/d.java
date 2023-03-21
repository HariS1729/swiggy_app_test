package c3;

import c3.b;

/* compiled from: SpringAnimation */
public final class d extends b<d> {
    private e A = null;
    private float B = Float.MAX_VALUE;
    private boolean C = false;

    public <K> d(K k, c<K> cVar) {
        super(k, cVar);
    }

    private void m() {
        e eVar = this.A;
        if (eVar != null) {
            double a11 = (double) eVar.a();
            if (a11 > ((double) this.f12797g)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (a11 < ((double) this.f12798h)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    public void h() {
        m();
        this.A.g((double) d());
        super.h();
    }

    /* access modifiers changed from: package-private */
    public boolean j(long j) {
        if (this.C) {
            float f11 = this.B;
            if (f11 != Float.MAX_VALUE) {
                this.A.e(f11);
                this.B = Float.MAX_VALUE;
            }
            this.f12792b = this.A.a();
            this.f12791a = 0.0f;
            this.C = false;
            return true;
        }
        if (this.B != Float.MAX_VALUE) {
            this.A.a();
            long j11 = j / 2;
            b.o h11 = this.A.h((double) this.f12792b, (double) this.f12791a, j11);
            this.A.e(this.B);
            this.B = Float.MAX_VALUE;
            b.o h12 = this.A.h((double) h11.f12801a, (double) h11.f12802b, j11);
            this.f12792b = h12.f12801a;
            this.f12791a = h12.f12802b;
        } else {
            b.o h13 = this.A.h((double) this.f12792b, (double) this.f12791a, j);
            this.f12792b = h13.f12801a;
            this.f12791a = h13.f12802b;
        }
        float max = Math.max(this.f12792b, this.f12798h);
        this.f12792b = max;
        float min = Math.min(max, this.f12797g);
        this.f12792b = min;
        if (!l(min, this.f12791a)) {
            return false;
        }
        this.f12792b = this.A.a();
        this.f12791a = 0.0f;
        return true;
    }

    public e k() {
        return this.A;
    }

    /* access modifiers changed from: package-private */
    public boolean l(float f11, float f12) {
        return this.A.c(f11, f12);
    }

    public d n(e eVar) {
        this.A = eVar;
        return this;
    }
}
