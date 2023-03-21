package androidx.compose.foundation;

import bp0.k;
import d2.p;
import d2.q;
import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: AndroidOverscroll.kt */
final class AndroidEdgeEffectOverscrollEffect$onNewSize$1 extends Lambda implements l<p, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AndroidEdgeEffectOverscrollEffect f2836a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidEdgeEffectOverscrollEffect$onNewSize$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect) {
        super(1);
        this.f2836a = androidEdgeEffectOverscrollEffect;
    }

    public final void a(long j) {
        boolean z11 = !t0.l.f(q.b(j), this.f2836a.n);
        this.f2836a.n = q.b(j);
        if (z11) {
            this.f2836a.f2822b.setSize(p.g(j), p.f(j));
            this.f2836a.f2823c.setSize(p.g(j), p.f(j));
            this.f2836a.f2824d.setSize(p.f(j), p.g(j));
            this.f2836a.f2825e.setSize(p.f(j), p.g(j));
            this.f2836a.f2827g.setSize(p.g(j), p.f(j));
            this.f2836a.f2828h.setSize(p.g(j), p.f(j));
            this.f2836a.f2829i.setSize(p.f(j), p.g(j));
            this.f2836a.j.setSize(p.f(j), p.g(j));
        }
        if (z11) {
            this.f2836a.y();
            this.f2836a.s();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a(((p) obj).j());
        return k.f22762a;
    }
}
