package e0;

import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import java.util.Arrays;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.l;
import wp0.j0;
import wp0.k0;
import wp0.k1;
import wp0.n1;
import wp0.z;

/* compiled from: Effects.kt */
public final class u {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final s f14221a = new s();

    public static final void a(Object obj, Object obj2, l<? super s, ? extends r> lVar, g gVar, int i11) {
        p.j(lVar, "effect");
        gVar.E(1429097729);
        gVar.E(511388516);
        boolean k = gVar.k(obj) | gVar.k(obj2);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            gVar.y(new q(lVar));
        }
        gVar.P();
        gVar.P();
    }

    public static final void b(Object obj, l<? super s, ? extends r> lVar, g gVar, int i11) {
        p.j(lVar, "effect");
        gVar.E(-1371986847);
        gVar.E(1157296644);
        boolean k = gVar.k(obj);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            gVar.y(new q(lVar));
        }
        gVar.P();
        gVar.P();
    }

    public static final void c(Object obj, Object obj2, Object obj3, lp0.p<? super j0, ? super c<? super k>, ? extends Object> pVar, g gVar, int i11) {
        p.j(pVar, RenderingDetails.TYPE_BLOCK);
        gVar.E(-54093371);
        CoroutineContext x11 = gVar.x();
        gVar.E(1618982084);
        boolean k = gVar.k(obj) | gVar.k(obj2) | gVar.k(obj3);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            gVar.y(new z(x11, pVar));
        }
        gVar.P();
        gVar.P();
    }

    public static final void d(Object obj, Object obj2, lp0.p<? super j0, ? super c<? super k>, ? extends Object> pVar, g gVar, int i11) {
        p.j(pVar, RenderingDetails.TYPE_BLOCK);
        gVar.E(590241125);
        CoroutineContext x11 = gVar.x();
        gVar.E(511388516);
        boolean k = gVar.k(obj) | gVar.k(obj2);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            gVar.y(new z(x11, pVar));
        }
        gVar.P();
        gVar.P();
    }

    public static final void e(Object obj, lp0.p<? super j0, ? super c<? super k>, ? extends Object> pVar, g gVar, int i11) {
        p.j(pVar, RenderingDetails.TYPE_BLOCK);
        gVar.E(1179185413);
        CoroutineContext x11 = gVar.x();
        gVar.E(1157296644);
        boolean k = gVar.k(obj);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            gVar.y(new z(x11, pVar));
        }
        gVar.P();
        gVar.P();
    }

    public static final void f(Object[] objArr, lp0.p<? super j0, ? super c<? super k>, ? extends Object> pVar, g gVar, int i11) {
        p.j(objArr, "keys");
        p.j(pVar, RenderingDetails.TYPE_BLOCK);
        gVar.E(-139560008);
        CoroutineContext x11 = gVar.x();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        gVar.E(-568225417);
        boolean z11 = false;
        for (Object k : copyOf) {
            z11 |= gVar.k(k);
        }
        Object F = gVar.F();
        if (z11 || F == g.f14172a.a()) {
            gVar.y(new z(x11, pVar));
        }
        gVar.P();
        gVar.P();
    }

    public static final void g(a<k> aVar, g gVar, int i11) {
        p.j(aVar, "effect");
        gVar.E(-1288466761);
        gVar.e(aVar);
        gVar.P();
    }

    public static final j0 i(CoroutineContext coroutineContext, g gVar) {
        p.j(coroutineContext, "coroutineContext");
        p.j(gVar, "composer");
        k1.b bVar = k1.f29476l0;
        if (coroutineContext.get(bVar) != null) {
            z b11 = p1.b((k1) null, 1, (Object) null);
            b11.a(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
            return k0.a(b11);
        }
        CoroutineContext x11 = gVar.x();
        return k0.a(x11.plus(n1.a((k1) x11.get(bVar))).plus(coroutineContext));
    }
}
