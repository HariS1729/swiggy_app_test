package z;

import kotlin.jvm.internal.p;
import t0.l;

/* compiled from: CornerSize.kt */
final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    private final float f18040a;

    public e(float f11) {
        this.f18040a = f11;
        if (f11 < 0.0f || f11 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    public float a(long j, d2.e eVar) {
        p.j(eVar, "density");
        return l.h(j) * (this.f18040a / 100.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && p.e(Float.valueOf(this.f18040a), Float.valueOf(((e) obj).f18040a));
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f18040a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f18040a + "%)";
    }
}
