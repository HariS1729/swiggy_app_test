package c0;

import d2.e;
import d2.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: Swipeable.kt */
public final class m implements f0 {

    /* renamed from: a  reason: collision with root package name */
    private final float f12735a;

    private m(float f11) {
        this.f12735a = f11;
    }

    public /* synthetic */ m(float f11, i iVar) {
        this(f11);
    }

    public float a(e eVar, float f11, float f12) {
        p.j(eVar, "<this>");
        return f11 + (eVar.v0(this.f12735a) * Math.signum(f12 - f11));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && h.p(this.f12735a, ((m) obj).f12735a);
    }

    public int hashCode() {
        return h.q(this.f12735a);
    }

    public String toString() {
        return "FixedThreshold(offset=" + h.r(this.f12735a) + ')';
    }
}
