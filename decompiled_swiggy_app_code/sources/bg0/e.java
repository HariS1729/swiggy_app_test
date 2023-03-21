package bg0;

import android.animation.ValueAnimator;
import in.swiggy.android.swiggylocation.animator.PolyLineAnimator;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PolyLineAnimator f12629a;

    public /* synthetic */ e(PolyLineAnimator polyLineAnimator) {
        this.f12629a = polyLineAnimator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        PolyLineAnimator.d(this.f12629a, valueAnimator);
    }
}
