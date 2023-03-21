package x1;

import a2.e;
import android.graphics.Shader;
import android.text.TextPaint;
import kotlin.jvm.internal.p;
import t0.f;
import t0.l;
import u0.d0;
import u0.f0;
import u0.f1;
import u0.h1;
import u0.k1;
import u0.u;

/* compiled from: AndroidTextPaint.android.kt */
public final class h extends TextPaint {

    /* renamed from: a  reason: collision with root package name */
    private e f17662a = e.f915b.c();

    /* renamed from: b  reason: collision with root package name */
    private h1 f17663b = h1.f16796d.a();

    /* renamed from: c  reason: collision with root package name */
    private u f17664c;

    /* renamed from: d  reason: collision with root package name */
    private l f17665d;

    public h(int i11, float f11) {
        super(i11);
        this.density = f11;
    }

    public final void a(u uVar, long j) {
        if (uVar == null) {
            setShader((Shader) null);
            return;
        }
        boolean z11 = false;
        if (p.e(this.f17664c, uVar)) {
            l lVar = this.f17665d;
            if (lVar == null ? false : l.f(lVar.m(), j)) {
                return;
            }
        }
        this.f17664c = uVar;
        this.f17665d = l.c(j);
        if (uVar instanceof k1) {
            setShader((Shader) null);
            b(((k1) uVar).b());
        } else if (uVar instanceof f1) {
            if (j != l.f16682b.a()) {
                z11 = true;
            }
            if (z11) {
                setShader(((f1) uVar).b(j));
            }
        }
    }

    public final void b(long j) {
        int j11;
        if ((j != d0.f16756b.f()) && getColor() != (j11 = f0.j(j))) {
            setColor(j11);
        }
    }

    public final void c(h1 h1Var) {
        if (h1Var == null) {
            h1Var = h1.f16796d.a();
        }
        if (!p.e(this.f17663b, h1Var)) {
            this.f17663b = h1Var;
            if (p.e(h1Var, h1.f16796d.a())) {
                clearShadowLayer();
            } else {
                setShadowLayer(this.f17663b.b(), f.m(this.f17663b.d()), f.n(this.f17663b.d()), f0.j(this.f17663b.c()));
            }
        }
    }

    public final void d(e eVar) {
        if (eVar == null) {
            eVar = e.f915b.c();
        }
        if (!p.e(this.f17662a, eVar)) {
            this.f17662a = eVar;
            e.a aVar = e.f915b;
            setUnderlineText(eVar.d(aVar.d()));
            setStrikeThruText(this.f17662a.d(aVar.b()));
        }
    }
}
