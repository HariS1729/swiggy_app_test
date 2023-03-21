package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import d0.b;
import d0.c;
import defpackage.v1;
import e0.d1;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineStart;
import t0.l;
import u.a;
import u.h;
import u0.c0;
import u0.d0;
import u0.e0;
import w0.d;
import w0.e;
import w0.f;
import w0.g;
import wp0.j0;
import wp0.k1;

/* compiled from: Ripple.kt */
final class StateLayer {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f5851a;

    /* renamed from: b  reason: collision with root package name */
    private final d1<b> f5852b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Animatable<Float, v1.k> f5853c = v1.b.b(0.0f, 0.0f, 2, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    private final List<h> f5854d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private h f5855e;

    public StateLayer(boolean z11, d1<b> d1Var) {
        p.j(d1Var, "rippleAlpha");
        this.f5851a = z11;
        this.f5852b = d1Var;
    }

    public final void b(f fVar, float f11, long j) {
        float f12;
        f fVar2 = fVar;
        p.j(fVar2, "$receiver");
        if (Float.isNaN(f11)) {
            f12 = c.a(fVar2, this.f5851a, fVar.d());
        } else {
            f12 = fVar.v0(f11);
        }
        float f13 = f12;
        float floatValue = this.f5853c.o().floatValue();
        if (floatValue > 0.0f) {
            long l11 = d0.l(j, floatValue, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            if (this.f5851a) {
                float i11 = l.i(fVar.d());
                float g11 = l.g(fVar.d());
                int b11 = c0.f16752a.b();
                d O = fVar.O();
                long d11 = O.d();
                O.a().a();
                O.c().b(0.0f, 0.0f, i11, g11, b11);
                e.f(fVar, l11, f13, 0, 0.0f, (g) null, (e0) null, 0, 124, (Object) null);
                O.a().o();
                O.b(d11);
                return;
            }
            e.f(fVar, l11, f13, 0, 0.0f, (g) null, (e0) null, 0, 124, (Object) null);
        }
    }

    public final void c(h hVar, j0 j0Var) {
        float f11;
        p.j(hVar, "interaction");
        p.j(j0Var, "scope");
        boolean z11 = hVar instanceof u.f;
        if (z11) {
            this.f5854d.add(hVar);
        } else if (hVar instanceof u.g) {
            this.f5854d.remove(((u.g) hVar).a());
        } else if (hVar instanceof u.d) {
            this.f5854d.add(hVar);
        } else if (hVar instanceof u.e) {
            this.f5854d.remove(((u.e) hVar).a());
        } else if (hVar instanceof u.b) {
            this.f5854d.add(hVar);
        } else if (hVar instanceof u.c) {
            this.f5854d.remove(((u.c) hVar).a());
        } else if (hVar instanceof a) {
            this.f5854d.remove(((a) hVar).a());
        } else {
            return;
        }
        h hVar2 = (h) s.i0(this.f5854d);
        if (!p.e(this.f5855e, hVar2)) {
            if (hVar2 != null) {
                if (z11) {
                    f11 = this.f5852b.getValue().c();
                } else if (hVar instanceof u.d) {
                    f11 = this.f5852b.getValue().b();
                } else {
                    f11 = hVar instanceof u.b ? this.f5852b.getValue().a() : 0.0f;
                }
                k1 unused = j.d(j0Var, (CoroutineContext) null, (CoroutineStart) null, new StateLayer$handleInteraction$1(this, f11, d0.h.c(hVar2), (fp0.c<? super StateLayer$handleInteraction$1>) null), 3, (Object) null);
            } else {
                k1 unused2 = j.d(j0Var, (CoroutineContext) null, (CoroutineStart) null, new StateLayer$handleInteraction$2(this, d0.h.d(this.f5855e), (fp0.c<? super StateLayer$handleInteraction$2>) null), 3, (Object) null);
            }
            this.f5855e = hVar2;
        }
    }
}
