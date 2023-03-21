package androidx.compose.material.ripple;

import androidx.compose.runtime.g;
import d0.b;
import e0.d1;
import e0.r0;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineStart;
import n0.n;
import u0.d0;
import w0.c;
import w0.f;
import wp0.j0;
import wp0.k1;

/* compiled from: CommonRipple.kt */
public final class CommonRippleIndicationInstance extends b implements r0 {

    /* renamed from: b  reason: collision with root package name */
    private final boolean f5800b;

    /* renamed from: c  reason: collision with root package name */
    private final float f5801c;

    /* renamed from: d  reason: collision with root package name */
    private final d1<d0> f5802d;

    /* renamed from: e  reason: collision with root package name */
    private final d1<b> f5803e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final n<u.n, RippleAnimation> f5804f;

    private CommonRippleIndicationInstance(boolean z11, float f11, d1<d0> d1Var, d1<b> d1Var2) {
        super(z11, d1Var2);
        this.f5800b = z11;
        this.f5801c = f11;
        this.f5802d = d1Var;
        this.f5803e = d1Var2;
        this.f5804f = g.f();
    }

    public /* synthetic */ CommonRippleIndicationInstance(boolean z11, float f11, d1 d1Var, d1 d1Var2, i iVar) {
        this(z11, f11, d1Var, d1Var2);
    }

    private final void j(f fVar, long j) {
        for (Map.Entry<u.n, RippleAnimation> value : this.f5804f.entrySet()) {
            RippleAnimation rippleAnimation = (RippleAnimation) value.getValue();
            float d11 = this.f5803e.getValue().d();
            if (!(d11 == 0.0f)) {
                rippleAnimation.e(fVar, d0.l(j, d11, 0.0f, 0.0f, 0.0f, 14, (Object) null));
            }
        }
    }

    public void a(c cVar) {
        p.j(cVar, "<this>");
        long v = this.f5802d.getValue().v();
        cVar.V();
        d(cVar, this.f5801c, v);
        j(cVar, v);
    }

    public void b() {
    }

    public void c(u.n nVar, j0 j0Var) {
        p.j(nVar, "interaction");
        p.j(j0Var, "scope");
        for (Map.Entry<u.n, RippleAnimation> value : this.f5804f.entrySet()) {
            ((RippleAnimation) value.getValue()).h();
        }
        RippleAnimation rippleAnimation = new RippleAnimation(this.f5800b ? t0.f.d(nVar.a()) : null, this.f5801c, this.f5800b, (i) null);
        this.f5804f.put(nVar, rippleAnimation);
        k1 unused = j.d(j0Var, (CoroutineContext) null, (CoroutineStart) null, new CommonRippleIndicationInstance$addRipple$2(rippleAnimation, this, nVar, (fp0.c<? super CommonRippleIndicationInstance$addRipple$2>) null), 3, (Object) null);
    }

    public void e(u.n nVar) {
        p.j(nVar, "interaction");
        RippleAnimation rippleAnimation = this.f5804f.get(nVar);
        if (rippleAnimation != null) {
            rippleAnimation.h();
        }
    }

    public void f() {
        this.f5804f.clear();
    }

    public void g() {
        this.f5804f.clear();
    }
}
