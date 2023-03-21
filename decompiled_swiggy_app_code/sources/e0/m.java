package e0;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.p;
import wp0.j0;
import wp0.k0;

/* compiled from: Effects.kt */
public final class m implements r0 {

    /* renamed from: a  reason: collision with root package name */
    private final j0 f14211a;

    public m(j0 j0Var) {
        p.j(j0Var, "coroutineScope");
        this.f14211a = j0Var;
    }

    public final j0 a() {
        return this.f14211a;
    }

    public void b() {
    }

    public void f() {
        k0.d(this.f14211a, (CancellationException) null, 1, (Object) null);
    }

    public void g() {
        k0.d(this.f14211a, (CancellationException) null, 1, (Object) null);
    }
}
