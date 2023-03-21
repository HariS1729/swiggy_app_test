package bm0;

import android.animation.ValueAnimator;
import in.swiggy.android.view.onboarding.OnboardingButton;
import iz.c00;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c00 f12639a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ OnboardingButton f12640b;

    public /* synthetic */ a(c00 c002, OnboardingButton onboardingButton) {
        this.f12639a = c002;
        this.f12640b = onboardingButton;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        OnboardingButton.K(this.f12639a, this.f12640b, valueAnimator);
    }
}
