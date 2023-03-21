package e0;

import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Effects.kt */
final class q implements r0 {

    /* renamed from: a  reason: collision with root package name */
    private final l<s, r> f14217a;

    /* renamed from: b  reason: collision with root package name */
    private r f14218b;

    public q(l<? super s, ? extends r> lVar) {
        p.j(lVar, "effect");
        this.f14217a = lVar;
    }

    public void b() {
        this.f14218b = this.f14217a.invoke(u.f14221a);
    }

    public void f() {
    }

    public void g() {
        r rVar = this.f14218b;
        if (rVar != null) {
            rVar.dispose();
        }
        this.f14218b = null;
    }
}
