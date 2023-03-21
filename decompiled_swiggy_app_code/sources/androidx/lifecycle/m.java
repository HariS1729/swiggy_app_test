package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import in.juspay.hyper.constants.LogCategory;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.p;
import wp0.k1;

/* compiled from: LifecycleController.kt */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final Lifecycle f10767a;

    /* renamed from: b  reason: collision with root package name */
    private final Lifecycle.State f10768b;

    /* renamed from: c  reason: collision with root package name */
    private final f f10769c;

    /* renamed from: d  reason: collision with root package name */
    private final o f10770d;

    public m(Lifecycle lifecycle, Lifecycle.State state, f fVar, k1 k1Var) {
        p.j(lifecycle, LogCategory.LIFECYCLE);
        p.j(state, "minState");
        p.j(fVar, "dispatchQueue");
        p.j(k1Var, "parentJob");
        this.f10767a = lifecycle;
        this.f10768b = state;
        this.f10769c = fVar;
        l lVar = new l(this, k1Var);
        this.f10770d = lVar;
        if (lifecycle.b() == Lifecycle.State.DESTROYED) {
            k1.a.a(k1Var, (CancellationException) null, 1, (Object) null);
            b();
            return;
        }
        lifecycle.a(lVar);
    }

    /* access modifiers changed from: private */
    public static final void c(m mVar, k1 k1Var, r rVar, Lifecycle.Event event) {
        p.j(mVar, "this$0");
        p.j(k1Var, "$parentJob");
        p.j(rVar, "source");
        p.j(event, "<anonymous parameter 1>");
        if (rVar.getLifecycle().b() == Lifecycle.State.DESTROYED) {
            k1.a.a(k1Var, (CancellationException) null, 1, (Object) null);
            mVar.b();
        } else if (rVar.getLifecycle().b().compareTo(mVar.f10768b) < 0) {
            mVar.f10769c.h();
        } else {
            mVar.f10769c.i();
        }
    }

    public final void b() {
        this.f10767a.c(this.f10770d);
        this.f10769c.g();
    }
}
