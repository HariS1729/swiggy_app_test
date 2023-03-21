package p;

import defpackage.v1;
import kotlin.jvm.internal.p;

/* compiled from: EnterExitTransition.kt */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final float f15998a;

    /* renamed from: b  reason: collision with root package name */
    private final v1.a0<Float> f15999b;

    public f(float f11, v1.a0<Float> a0Var) {
        p.j(a0Var, "animationSpec");
        this.f15998a = f11;
        this.f15999b = a0Var;
    }

    public final float a() {
        return this.f15998a;
    }

    public final v1.a0<Float> b() {
        return this.f15999b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p.e(Float.valueOf(this.f15998a), Float.valueOf(fVar.f15998a)) && p.e(this.f15999b, fVar.f15999b);
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f15998a) * 31) + this.f15999b.hashCode();
    }

    public String toString() {
        return "Fade(alpha=" + this.f15998a + ", animationSpec=" + this.f15999b + ')';
    }
}
