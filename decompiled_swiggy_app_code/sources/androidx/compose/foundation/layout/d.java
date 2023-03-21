package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.core.view.m0;
import androidx.core.view.n0;
import androidx.core.view.t;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: WindowInsets.android.kt */
final class d extends m0.b implements Runnable, t, View.OnAttachStateChangeListener {

    /* renamed from: c  reason: collision with root package name */
    private final WindowInsetsHolder f3901c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3902d;

    /* renamed from: e  reason: collision with root package name */
    private n0 f3903e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(WindowInsetsHolder windowInsetsHolder) {
        super(windowInsetsHolder.c() ^ true ? 1 : 0);
        p.j(windowInsetsHolder, "composeInsets");
        this.f3901c = windowInsetsHolder;
    }

    public n0 a(View view, n0 n0Var) {
        p.j(view, "view");
        p.j(n0Var, "insets");
        if (this.f3902d) {
            this.f3903e = n0Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
            return n0Var;
        }
        WindowInsetsHolder.h(this.f3901c, n0Var, 0, 2, (Object) null);
        if (!this.f3901c.c()) {
            return n0Var;
        }
        n0 n0Var2 = n0.f9558b;
        p.i(n0Var2, "CONSUMED");
        return n0Var2;
    }

    public void c(m0 m0Var) {
        p.j(m0Var, "animation");
        this.f3902d = false;
        n0 n0Var = this.f3903e;
        if (!(m0Var.a() == 0 || n0Var == null)) {
            this.f3901c.g(n0Var, m0Var.c());
        }
        this.f3903e = null;
        super.c(m0Var);
    }

    public void d(m0 m0Var) {
        p.j(m0Var, "animation");
        this.f3902d = true;
        super.d(m0Var);
    }

    public n0 e(n0 n0Var, List<m0> list) {
        p.j(n0Var, "insets");
        p.j(list, "runningAnimations");
        WindowInsetsHolder.h(this.f3901c, n0Var, 0, 2, (Object) null);
        if (!this.f3901c.c()) {
            return n0Var;
        }
        n0 n0Var2 = n0.f9558b;
        p.i(n0Var2, "CONSUMED");
        return n0Var2;
    }

    public m0.a f(m0 m0Var, m0.a aVar) {
        p.j(m0Var, "animation");
        p.j(aVar, "bounds");
        this.f3902d = false;
        m0.a f11 = super.f(m0Var, aVar);
        p.i(f11, "super.onStart(animation, bounds)");
        return f11;
    }

    public void onViewAttachedToWindow(View view) {
        p.j(view, "view");
        view.requestApplyInsets();
    }

    public void onViewDetachedFromWindow(View view) {
        p.j(view, "v");
    }

    public void run() {
        if (this.f3902d) {
            this.f3902d = false;
            n0 n0Var = this.f3903e;
            if (n0Var != null) {
                WindowInsetsHolder.h(this.f3901c, n0Var, 0, 2, (Object) null);
                this.f3903e = null;
            }
        }
    }
}
