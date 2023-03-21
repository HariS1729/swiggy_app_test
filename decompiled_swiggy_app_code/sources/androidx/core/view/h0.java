package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* compiled from: ViewPropertyAnimatorCompat */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<View> f9511a;

    /* renamed from: b  reason: collision with root package name */
    Runnable f9512b = null;

    /* renamed from: c  reason: collision with root package name */
    Runnable f9513c = null;

    /* renamed from: d  reason: collision with root package name */
    int f9514d = -1;

    /* compiled from: ViewPropertyAnimatorCompat */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i0 f9515a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f9516b;

        a(i0 i0Var, View view) {
            this.f9515a = i0Var;
            this.f9516b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f9515a.a(this.f9516b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f9515a.b(this.f9516b);
        }

        public void onAnimationStart(Animator animator) {
            this.f9515a.c(this.f9516b);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat */
    static class b {
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    h0(View view) {
        this.f9511a = new WeakReference<>(view);
    }

    private void i(View view, i0 i0Var) {
        if (i0Var != null) {
            view.animate().setListener(new a(i0Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public h0 b(float f11) {
        View view = (View) this.f9511a.get();
        if (view != null) {
            view.animate().alpha(f11);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f9511a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f9511a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public h0 f(long j) {
        View view = (View) this.f9511a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public h0 g(Interpolator interpolator) {
        View view = (View) this.f9511a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public h0 h(i0 i0Var) {
        View view = (View) this.f9511a.get();
        if (view != null) {
            i(view, i0Var);
        }
        return this;
    }

    public h0 j(long j) {
        View view = (View) this.f9511a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public h0 k(k0 k0Var) {
        View view = (View) this.f9511a.get();
        if (view != null) {
            g0 g0Var = null;
            if (k0Var != null) {
                g0Var = new g0(k0Var, view);
            }
            b.a(view.animate(), g0Var);
        }
        return this;
    }

    public void l() {
        View view = (View) this.f9511a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public h0 m(float f11) {
        View view = (View) this.f9511a.get();
        if (view != null) {
            view.animate().translationX(f11);
        }
        return this;
    }

    public h0 n(float f11) {
        View view = (View) this.f9511a.get();
        if (view != null) {
            view.animate().translationY(f11);
        }
        return this;
    }
}
