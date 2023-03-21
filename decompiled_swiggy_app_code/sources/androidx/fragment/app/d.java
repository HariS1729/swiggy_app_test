package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.os.c;
import androidx.core.view.w;
import androidx.fragment.R;
import androidx.fragment.app.t;

/* compiled from: FragmentAnim */
class d {

    /* compiled from: FragmentAnim */
    class a implements c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f10460a;

        a(Fragment fragment) {
            this.f10460a = fragment;
        }

        public void e() {
            if (this.f10460a.getAnimatingAway() != null) {
                View animatingAway = this.f10460a.getAnimatingAway();
                this.f10460a.setAnimatingAway((View) null);
                animatingAway.clearAnimation();
            }
            this.f10460a.setAnimator((Animator) null);
        }
    }

    /* compiled from: FragmentAnim */
    class b implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f10461a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f10462b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t.g f10463c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.c f10464d;

        /* compiled from: FragmentAnim */
        class a implements Runnable {
            a() {
            }

            public void run() {
                if (b.this.f10462b.getAnimatingAway() != null) {
                    b.this.f10462b.setAnimatingAway((View) null);
                    b bVar = b.this;
                    bVar.f10463c.a(bVar.f10462b, bVar.f10464d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, t.g gVar, androidx.core.os.c cVar) {
            this.f10461a = viewGroup;
            this.f10462b = fragment;
            this.f10463c = gVar;
            this.f10464d = cVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f10461a.post(new a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: FragmentAnim */
    class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f10466a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f10467b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f10468c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ t.g f10469d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.c f10470e;

        c(ViewGroup viewGroup, View view, Fragment fragment, t.g gVar, androidx.core.os.c cVar) {
            this.f10466a = viewGroup;
            this.f10467b = view;
            this.f10468c = fragment;
            this.f10469d = gVar;
            this.f10470e = cVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f10466a.endViewTransition(this.f10467b);
            Animator animator2 = this.f10468c.getAnimator();
            this.f10468c.setAnimator((Animator) null);
            if (animator2 != null && this.f10466a.indexOfChild(this.f10467b) < 0) {
                this.f10469d.a(this.f10468c, this.f10470e);
            }
        }
    }

    static void a(Fragment fragment, C0063d dVar, t.g gVar) {
        View view = fragment.mView;
        ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        androidx.core.os.c cVar = new androidx.core.os.c();
        cVar.c(new a(fragment));
        gVar.b(fragment, cVar);
        if (dVar.f10471a != null) {
            e eVar = new e(dVar.f10471a, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, cVar));
            fragment.mView.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.f10472b;
        fragment.setAnimator(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, cVar));
        animator.setTarget(fragment.mView);
        animator.start();
    }

    private static int b(Fragment fragment, boolean z11, boolean z12) {
        if (z12) {
            if (z11) {
                return fragment.getPopEnterAnim();
            }
            return fragment.getPopExitAnim();
        } else if (z11) {
            return fragment.getEnterAnim();
        } else {
            return fragment.getExitAnim();
        }
    }

    static C0063d c(Context context, Fragment fragment, boolean z11, boolean z12) {
        int nextTransition = fragment.getNextTransition();
        int b11 = b(fragment, z11, z12);
        boolean z13 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i11 = R.id.visible_removing_fragment_view_tag;
            if (viewGroup.getTag(i11) != null) {
                fragment.mContainer.setTag(i11, (Object) null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z11, b11);
        if (onCreateAnimation != null) {
            return new C0063d(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z11, b11);
        if (onCreateAnimator != null) {
            return new C0063d(onCreateAnimator);
        }
        if (b11 == 0 && nextTransition != 0) {
            b11 = d(nextTransition, z11);
        }
        if (b11 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(b11));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, b11);
                    if (loadAnimation != null) {
                        return new C0063d(loadAnimation);
                    }
                    z13 = true;
                } catch (Resources.NotFoundException e11) {
                    throw e11;
                } catch (RuntimeException unused) {
                }
            }
            if (!z13) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, b11);
                    if (loadAnimator != null) {
                        return new C0063d(loadAnimator);
                    }
                } catch (RuntimeException e12) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, b11);
                        if (loadAnimation2 != null) {
                            return new C0063d(loadAnimation2);
                        }
                    } else {
                        throw e12;
                    }
                }
            }
        }
        return null;
    }

    private static int d(int i11, boolean z11) {
        if (i11 == 4097) {
            return z11 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
        }
        if (i11 == 4099) {
            return z11 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
        }
        if (i11 != 8194) {
            return -1;
        }
        return z11 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
    }

    /* renamed from: androidx.fragment.app.d$d  reason: collision with other inner class name */
    /* compiled from: FragmentAnim */
    static class C0063d {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f10471a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f10472b;

        C0063d(Animation animation) {
            this.f10471a = animation;
            this.f10472b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        C0063d(Animator animator) {
            this.f10471a = null;
            this.f10472b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* compiled from: FragmentAnim */
    static class e extends AnimationSet implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final ViewGroup f10473a;

        /* renamed from: b  reason: collision with root package name */
        private final View f10474b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f10475c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f10476d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f10477e = true;

        e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f10473a = viewGroup;
            this.f10474b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f10477e = true;
            if (this.f10475c) {
                return !this.f10476d;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f10475c = true;
                w.a(this.f10473a, this);
            }
            return true;
        }

        public void run() {
            if (this.f10475c || !this.f10477e) {
                this.f10473a.endViewTransition(this.f10474b);
                this.f10476d = true;
                return;
            }
            this.f10477e = false;
            this.f10473a.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation, float f11) {
            this.f10477e = true;
            if (this.f10475c) {
                return !this.f10476d;
            }
            if (!super.getTransformation(j, transformation, f11)) {
                this.f10475c = true;
                w.a(this.f10473a, this);
            }
            return true;
        }
    }
}
