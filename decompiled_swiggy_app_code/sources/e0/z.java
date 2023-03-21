package e0;

import bp0.k;
import fp0.c;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import lp0.p;
import wp0.j0;
import wp0.k0;
import wp0.k1;

/* compiled from: Effects.kt */
public final class z implements r0 {

    /* renamed from: a  reason: collision with root package name */
    private final p<j0, c<? super k>, Object> f14276a;

    /* renamed from: b  reason: collision with root package name */
    private final j0 f14277b;

    /* renamed from: c  reason: collision with root package name */
    private k1 f14278c;

    public z(CoroutineContext coroutineContext, p<? super j0, ? super c<? super k>, ? extends Object> pVar) {
        kotlin.jvm.internal.p.j(coroutineContext, "parentCoroutineContext");
        kotlin.jvm.internal.p.j(pVar, "task");
        this.f14276a = pVar;
        this.f14277b = k0.a(coroutineContext);
    }

    public void b() {
        k1 k1Var = this.f14278c;
        if (k1Var != null) {
            p1.f(k1Var, "Old job was still running!", (Throwable) null, 2, (Object) null);
        }
        this.f14278c = j.d(this.f14277b, (CoroutineContext) null, (CoroutineStart) null, this.f14276a, 3, (Object) null);
    }

    public void f() {
        k1 k1Var = this.f14278c;
        if (k1Var != null) {
            k1.a.a(k1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f14278c = null;
    }

    public void g() {
        k1 k1Var = this.f14278c;
        if (k1Var != null) {
            k1.a.a(k1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f14278c = null;
    }
}
