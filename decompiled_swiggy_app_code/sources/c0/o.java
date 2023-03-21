package c0;

import d2.e;
import e2.a;
import kotlin.jvm.internal.p;

/* compiled from: Swipeable.kt */
public final class o implements f0 {

    /* renamed from: a  reason: collision with root package name */
    private final float f12736a;

    public o(float f11) {
        this.f12736a = f11;
    }

    public float a(e eVar, float f11, float f12) {
        p.j(eVar, "<this>");
        return a.a(f11, f12, this.f12736a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && p.e(Float.valueOf(this.f12736a), Float.valueOf(((o) obj).f12736a));
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f12736a);
    }

    public String toString() {
        return "FractionalThreshold(fraction=" + this.f12736a + ')';
    }
}
