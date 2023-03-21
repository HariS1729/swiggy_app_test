package bg0;

import android.animation.ValueAnimator;
import in.swiggy.android.swiggylocation.animator.MarkerPositionAnimator;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MarkerPositionAnimator f12620a;

    public /* synthetic */ a(MarkerPositionAnimator markerPositionAnimator) {
        this.f12620a = markerPositionAnimator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        MarkerPositionAnimator.i(this.f12620a, valueAnimator);
    }
}
