package a0;

import bp0.k;
import kotlin.jvm.internal.p;
import s0.b;
import s0.f;
import v1.l;

/* compiled from: KeyboardActionRunner.kt */
public final class e implements f {

    /* renamed from: a  reason: collision with root package name */
    public g f821a;

    /* renamed from: b  reason: collision with root package name */
    public f f822b;

    public void a(int i11) {
        l.a aVar = l.f17134b;
        if (l.l(i11, aVar.d())) {
            b().a(b.f16557b.d());
        } else if (l.l(i11, aVar.f())) {
            b().a(b.f16557b.f());
        } else {
            boolean z11 = true;
            if (!(l.l(i11, aVar.b()) ? true : l.l(i11, aVar.c()) ? true : l.l(i11, aVar.g()) ? true : l.l(i11, aVar.h()))) {
                z11 = l.l(i11, aVar.a());
            }
            if (!z11) {
                l.l(i11, aVar.e());
            }
        }
    }

    public final f b() {
        f fVar = this.f822b;
        if (fVar != null) {
            return fVar;
        }
        p.B("focusManager");
        return null;
    }

    public final g c() {
        g gVar = this.f821a;
        if (gVar != null) {
            return gVar;
        }
        p.B("keyboardActions");
        return null;
    }

    public final void d(int i11) {
        lp0.l<f, k> lVar;
        l.a aVar = l.f17134b;
        k kVar = null;
        if (l.l(i11, aVar.b())) {
            lVar = c().b();
        } else if (l.l(i11, aVar.c())) {
            lVar = c().c();
        } else if (l.l(i11, aVar.d())) {
            lVar = c().d();
        } else if (l.l(i11, aVar.f())) {
            lVar = c().e();
        } else if (l.l(i11, aVar.g())) {
            lVar = c().f();
        } else if (l.l(i11, aVar.h())) {
            lVar = c().g();
        } else {
            if (l.l(i11, aVar.a()) ? true : l.l(i11, aVar.e())) {
                lVar = null;
            } else {
                throw new IllegalStateException("invalid ImeAction".toString());
            }
        }
        if (lVar != null) {
            lVar.invoke(this);
            kVar = k.f22762a;
        }
        if (kVar == null) {
            a(i11);
        }
    }

    public final void e(f fVar) {
        p.j(fVar, "<set-?>");
        this.f822b = fVar;
    }

    public final void f(g gVar) {
        p.j(gVar, "<set-?>");
        this.f821a = gVar;
    }
}
