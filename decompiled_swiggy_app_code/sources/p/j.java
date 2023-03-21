package p;

import defpackage.v1;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import u0.q1;

/* compiled from: EnterExitTransition.kt */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final float f16007a;

    /* renamed from: b  reason: collision with root package name */
    private final long f16008b;

    /* renamed from: c  reason: collision with root package name */
    private final v1.a0<Float> f16009c;

    private j(float f11, long j, v1.a0<Float> a0Var) {
        this.f16007a = f11;
        this.f16008b = j;
        this.f16009c = a0Var;
    }

    public /* synthetic */ j(float f11, long j, v1.a0 a0Var, i iVar) {
        this(f11, j, a0Var);
    }

    public final v1.a0<Float> a() {
        return this.f16009c;
    }

    public final float b() {
        return this.f16007a;
    }

    public final long c() {
        return this.f16008b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p.e(Float.valueOf(this.f16007a), Float.valueOf(jVar.f16007a)) && q1.e(this.f16008b, jVar.f16008b) && p.e(this.f16009c, jVar.f16009c);
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.f16007a) * 31) + q1.h(this.f16008b)) * 31) + this.f16009c.hashCode();
    }

    public String toString() {
        return "Scale(scale=" + this.f16007a + ", transformOrigin=" + q1.i(this.f16008b) + ", animationSpec=" + this.f16009c + ')';
    }
}
