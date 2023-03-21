package u0;

import android.graphics.Shader;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import t0.l;
import u0.d0;

/* compiled from: Brush.kt */
public abstract class f1 extends u {

    /* renamed from: c  reason: collision with root package name */
    private Shader f16784c;

    /* renamed from: d  reason: collision with root package name */
    private long f16785d = l.f16682b.a();

    public f1() {
        super((i) null);
    }

    public final void a(long j, t0 t0Var, float f11) {
        p.j(t0Var, "p");
        Shader shader = this.f16784c;
        if (shader == null || !l.f(this.f16785d, j)) {
            shader = b(j);
            this.f16784c = shader;
            this.f16785d = j;
        }
        long a11 = t0Var.a();
        d0.a aVar = d0.f16756b;
        if (!d0.n(a11, aVar.a())) {
            t0Var.h(aVar.a());
        }
        if (!p.e(t0Var.l(), shader)) {
            t0Var.v(shader);
        }
        if (!(t0Var.getAlpha() == f11)) {
            t0Var.c(f11);
        }
    }

    public abstract Shader b(long j);
}
