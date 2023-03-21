package p;

import d2.e;
import defpackage.v1;
import kotlin.jvm.internal.p;

/* compiled from: SplineBasedFloatDecayAnimationSpec.kt */
public final class o implements v1.c0 {

    /* renamed from: a  reason: collision with root package name */
    private final g f16013a;

    public o(e eVar) {
        p.j(eVar, "density");
        this.f16013a = new g(p.a(), eVar);
    }

    private final float f(float f11) {
        return this.f16013a.b(f11) * Math.signum(f11);
    }

    public float a() {
        return 0.0f;
    }

    public float b(long j, float f11, float f12) {
        return this.f16013a.d(f12).b(j / 1000000);
    }

    public long c(float f11, float f12) {
        return this.f16013a.c(f12) * 1000000;
    }

    public float d(float f11, float f12) {
        return f11 + f(f12);
    }

    public float e(long j, float f11, float f12) {
        return f11 + this.f16013a.d(f12).a(j / 1000000);
    }
}
