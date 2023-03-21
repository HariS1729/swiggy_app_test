package coil.request;

import android.view.View;
import c7.i;
import fp0.c;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineStart;
import wp0.g1;
import wp0.k1;
import wp0.n0;
import wp0.u0;
import x6.h;
import x6.p;

/* compiled from: ViewTargetRequestManager.kt */
public final class ViewTargetRequestManager implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f13670a;

    /* renamed from: b  reason: collision with root package name */
    private p f13671b;

    /* renamed from: c  reason: collision with root package name */
    private k1 f13672c;

    /* renamed from: d  reason: collision with root package name */
    private ViewTargetRequestDelegate f13673d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13674e;

    public ViewTargetRequestManager(View view) {
        this.f13670a = view;
    }

    public final synchronized void a() {
        k1 k1Var = this.f13672c;
        if (k1Var != null) {
            k1.a.a(k1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f13672c = j.d(g1.f29466a, u0.c().N0(), (CoroutineStart) null, new ViewTargetRequestManager$dispose$1(this, (c<? super ViewTargetRequestManager$dispose$1>) null), 2, (Object) null);
        this.f13671b = null;
    }

    public final synchronized p b(n0<? extends h> n0Var) {
        p pVar = this.f13671b;
        if (pVar == null || !i.r() || !this.f13674e) {
            k1 k1Var = this.f13672c;
            if (k1Var != null) {
                k1.a.a(k1Var, (CancellationException) null, 1, (Object) null);
            }
            this.f13672c = null;
            p pVar2 = new p(this.f13670a, n0Var);
            this.f13671b = pVar2;
            return pVar2;
        }
        this.f13674e = false;
        pVar.a(n0Var);
        return pVar;
    }

    public final void c(ViewTargetRequestDelegate viewTargetRequestDelegate) {
        ViewTargetRequestDelegate viewTargetRequestDelegate2 = this.f13673d;
        if (viewTargetRequestDelegate2 != null) {
            viewTargetRequestDelegate2.f();
        }
        this.f13673d = viewTargetRequestDelegate;
    }

    public void onViewAttachedToWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f13673d;
        if (viewTargetRequestDelegate != null) {
            this.f13674e = true;
            viewTargetRequestDelegate.g();
        }
    }

    public void onViewDetachedFromWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f13673d;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.f();
        }
    }
}
