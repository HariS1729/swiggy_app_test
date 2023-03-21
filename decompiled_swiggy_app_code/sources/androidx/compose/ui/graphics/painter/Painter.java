package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import kotlin.jvm.internal.p;
import lp0.l;
import t0.h;
import t0.m;
import u0.e0;
import u0.i;
import u0.t0;
import u0.x;
import w0.f;

/* compiled from: Painter.kt */
public abstract class Painter {

    /* renamed from: a  reason: collision with root package name */
    private t0 f6492a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6493b;

    /* renamed from: c  reason: collision with root package name */
    private e0 f6494c;

    /* renamed from: d  reason: collision with root package name */
    private float f6495d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private LayoutDirection f6496e = LayoutDirection.Ltr;

    /* renamed from: f  reason: collision with root package name */
    private final l<f, k> f6497f = new Painter$drawLambda$1(this);

    private final void e(float f11) {
        if (!(this.f6495d == f11)) {
            if (!a(f11)) {
                if (f11 == 1.0f) {
                    t0 t0Var = this.f6492a;
                    if (t0Var != null) {
                        t0Var.c(f11);
                    }
                    this.f6493b = false;
                } else {
                    l().c(f11);
                    this.f6493b = true;
                }
            }
            this.f6495d = f11;
        }
    }

    private final void h(e0 e0Var) {
        if (!p.e(this.f6494c, e0Var)) {
            if (!c(e0Var)) {
                if (e0Var == null) {
                    t0 t0Var = this.f6492a;
                    if (t0Var != null) {
                        t0Var.s((e0) null);
                    }
                    this.f6493b = false;
                } else {
                    l().s(e0Var);
                    this.f6493b = true;
                }
            }
            this.f6494c = e0Var;
        }
    }

    private final void i(LayoutDirection layoutDirection) {
        if (this.f6496e != layoutDirection) {
            d(layoutDirection);
            this.f6496e = layoutDirection;
        }
    }

    private final t0 l() {
        t0 t0Var = this.f6492a;
        if (t0Var != null) {
            return t0Var;
        }
        t0 a11 = i.a();
        this.f6492a = a11;
        return a11;
    }

    /* access modifiers changed from: protected */
    public boolean a(float f11) {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean c(e0 e0Var) {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean d(LayoutDirection layoutDirection) {
        p.j(layoutDirection, "layoutDirection");
        return false;
    }

    public final void j(f fVar, long j, float f11, e0 e0Var) {
        p.j(fVar, "$this$draw");
        e(f11);
        h(e0Var);
        i(fVar.getLayoutDirection());
        float i11 = t0.l.i(fVar.d()) - t0.l.i(j);
        float g11 = t0.l.g(fVar.d()) - t0.l.g(j);
        fVar.O().c().f(0.0f, 0.0f, i11, g11);
        if (f11 > 0.0f && t0.l.i(j) > 0.0f && t0.l.g(j) > 0.0f) {
            if (this.f6493b) {
                h b11 = t0.i.b(t0.f.f16662b.c(), m.a(t0.l.i(j), t0.l.g(j)));
                x a11 = fVar.O().a();
                try {
                    a11.h(b11, l());
                    m(fVar);
                } finally {
                    a11.o();
                }
            } else {
                m(fVar);
            }
        }
        fVar.O().c().f(-0.0f, -0.0f, -i11, -g11);
    }

    public abstract long k();

    /* access modifiers changed from: protected */
    public abstract void m(f fVar);
}
