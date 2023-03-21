package i1;

import kotlin.jvm.internal.p;

/* compiled from: ContentScale.kt */
public final class f implements c {

    /* renamed from: b  reason: collision with root package name */
    private final float f14883b;

    public f(float f11) {
        this.f14883b = f11;
    }

    public long a(long j, long j11) {
        float f11 = this.f14883b;
        return i0.a(f11, f11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && p.e(Float.valueOf(this.f14883b), Float.valueOf(((f) obj).f14883b));
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f14883b);
    }

    public String toString() {
        return "FixedScale(value=" + this.f14883b + ')';
    }
}
