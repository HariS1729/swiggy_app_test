package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.transition.b0;

/* compiled from: TranslationAnimationCreator */
class j0 {

    /* compiled from: TranslationAnimationCreator */
    private static class a extends AnimatorListenerAdapter implements b0.g {

        /* renamed from: a  reason: collision with root package name */
        private final View f11946a;

        /* renamed from: b  reason: collision with root package name */
        private final View f11947b;

        /* renamed from: c  reason: collision with root package name */
        private final int f11948c;

        /* renamed from: d  reason: collision with root package name */
        private final int f11949d;

        /* renamed from: e  reason: collision with root package name */
        private int[] f11950e;

        /* renamed from: f  reason: collision with root package name */
        private float f11951f;

        /* renamed from: g  reason: collision with root package name */
        private float f11952g;

        /* renamed from: h  reason: collision with root package name */
        private final float f11953h;

        /* renamed from: i  reason: collision with root package name */
        private final float f11954i;

        a(View view, View view2, int i11, int i12, float f11, float f12) {
            this.f11947b = view;
            this.f11946a = view2;
            this.f11948c = i11 - Math.round(view.getTranslationX());
            this.f11949d = i12 - Math.round(view.getTranslationY());
            this.f11953h = f11;
            this.f11954i = f12;
            int i13 = R.id.transition_position;
            int[] iArr = (int[]) view2.getTag(i13);
            this.f11950e = iArr;
            if (iArr != null) {
                view2.setTag(i13, (Object) null);
            }
        }

        public void a(b0 b0Var) {
        }

        public void b(b0 b0Var) {
        }

        public void c(b0 b0Var) {
        }

        public void d(b0 b0Var) {
            this.f11947b.setTranslationX(this.f11953h);
            this.f11947b.setTranslationY(this.f11954i);
            b0Var.d0(this);
        }

        public void e(b0 b0Var) {
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f11950e == null) {
                this.f11950e = new int[2];
            }
            this.f11950e[0] = Math.round(((float) this.f11948c) + this.f11947b.getTranslationX());
            this.f11950e[1] = Math.round(((float) this.f11949d) + this.f11947b.getTranslationY());
            this.f11946a.setTag(R.id.transition_position, this.f11950e);
        }

        public void onAnimationPause(Animator animator) {
            this.f11951f = this.f11947b.getTranslationX();
            this.f11952g = this.f11947b.getTranslationY();
            this.f11947b.setTranslationX(this.f11953h);
            this.f11947b.setTranslationY(this.f11954i);
        }

        public void onAnimationResume(Animator animator) {
            this.f11947b.setTranslationX(this.f11951f);
            this.f11947b.setTranslationY(this.f11952g);
        }
    }

    static Animator a(View view, h0 h0Var, int i11, int i12, float f11, float f12, float f13, float f14, TimeInterpolator timeInterpolator, b0 b0Var) {
        float f15;
        float f16;
        View view2 = view;
        h0 h0Var2 = h0Var;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) h0Var2.f11936b.getTag(R.id.transition_position);
        if (iArr != null) {
            f15 = ((float) (iArr[0] - i11)) + translationX;
            f16 = ((float) (iArr[1] - i12)) + translationY;
        } else {
            f15 = f11;
            f16 = f12;
        }
        int round = i11 + Math.round(f15 - translationX);
        int round2 = i12 + Math.round(f16 - translationY);
        view.setTranslationX(f15);
        view.setTranslationY(f16);
        if (f15 == f13 && f16 == f14) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f15, f13}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f16, f14})});
        a aVar = new a(view, h0Var2.f11936b, round, round2, translationX, translationY);
        b0Var.b(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        a.a(ofPropertyValuesHolder, aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
