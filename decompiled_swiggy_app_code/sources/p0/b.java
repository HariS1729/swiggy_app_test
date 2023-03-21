package p0;

import androidx.compose.ui.unit.LayoutDirection;
import d2.m;
import kotlin.jvm.internal.p;
import p0.a;

/* compiled from: Alignment.kt */
public final class b implements a {

    /* renamed from: b  reason: collision with root package name */
    private final float f16033b;

    /* renamed from: c  reason: collision with root package name */
    private final float f16034c;

    /* compiled from: Alignment.kt */
    public static final class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        private final float f16035a;

        public a(float f11) {
            this.f16035a = f11;
        }

        public int a(int i11, int i12, LayoutDirection layoutDirection) {
            p.j(layoutDirection, "layoutDirection");
            return c.c((((float) (i12 - i11)) / 2.0f) * (((float) 1) + (layoutDirection == LayoutDirection.Ltr ? this.f16035a : ((float) -1) * this.f16035a)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p.e(Float.valueOf(this.f16035a), Float.valueOf(((a) obj).f16035a));
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f16035a);
        }

        public String toString() {
            return "Horizontal(bias=" + this.f16035a + ')';
        }
    }

    /* renamed from: p0.b$b  reason: collision with other inner class name */
    /* compiled from: Alignment.kt */
    public static final class C0161b implements a.c {

        /* renamed from: a  reason: collision with root package name */
        private final float f16036a;

        public C0161b(float f11) {
            this.f16036a = f11;
        }

        public int a(int i11, int i12) {
            return c.c((((float) (i12 - i11)) / 2.0f) * (((float) 1) + this.f16036a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0161b) && p.e(Float.valueOf(this.f16036a), Float.valueOf(((C0161b) obj).f16036a));
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f16036a);
        }

        public String toString() {
            return "Vertical(bias=" + this.f16036a + ')';
        }
    }

    public b(float f11, float f12) {
        this.f16033b = f11;
        this.f16034c = f12;
    }

    public long a(long j, long j11, LayoutDirection layoutDirection) {
        float f11;
        p.j(layoutDirection, "layoutDirection");
        float g11 = ((float) (d2.p.g(j11) - d2.p.g(j))) / 2.0f;
        float f12 = ((float) (d2.p.f(j11) - d2.p.f(j))) / 2.0f;
        if (layoutDirection == LayoutDirection.Ltr) {
            f11 = this.f16033b;
        } else {
            f11 = ((float) -1) * this.f16033b;
        }
        float f13 = (float) 1;
        return m.a(c.c(g11 * (f11 + f13)), c.c(f12 * (f13 + this.f16034c)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p.e(Float.valueOf(this.f16033b), Float.valueOf(bVar.f16033b)) && p.e(Float.valueOf(this.f16034c), Float.valueOf(bVar.f16034c));
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f16033b) * 31) + Float.floatToIntBits(this.f16034c);
    }

    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.f16033b + ", verticalBias=" + this.f16034c + ')';
    }
}
