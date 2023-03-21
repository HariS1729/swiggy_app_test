package u0;

import android.graphics.Shader;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: Brush.kt */
public final class k1 extends u {

    /* renamed from: c  reason: collision with root package name */
    private final long f16821c;

    private k1(long j) {
        super((i) null);
        this.f16821c = j;
    }

    public /* synthetic */ k1(long j, i iVar) {
        this(j);
    }

    public void a(long j, t0 t0Var, float f11) {
        long j11;
        p.j(t0Var, "p");
        t0Var.c(1.0f);
        if (!(f11 == 1.0f)) {
            long j12 = this.f16821c;
            j11 = d0.l(j12, d0.o(j12) * f11, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j11 = this.f16821c;
        }
        t0Var.h(j11);
        if (t0Var.l() != null) {
            t0Var.v((Shader) null);
        }
    }

    public final long b() {
        return this.f16821c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1) && d0.n(this.f16821c, ((k1) obj).f16821c);
    }

    public int hashCode() {
        return d0.t(this.f16821c);
    }

    public String toString() {
        return "SolidColor(value=" + d0.u(this.f16821c) + ')';
    }
}
