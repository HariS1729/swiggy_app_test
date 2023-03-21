package bg0;

import android.animation.ValueAnimator;
import in.swiggy.android.swiggylocation.animator.MarkerPositionAnimator;
import rj.g;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f12625a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MarkerPositionAnimator f12626b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ float f12627c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ float f12628d;

    public /* synthetic */ c(g gVar, MarkerPositionAnimator markerPositionAnimator, float f11, float f12) {
        this.f12625a = gVar;
        this.f12626b = markerPositionAnimator;
        this.f12627c = f11;
        this.f12628d = f12;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        MarkerPositionAnimator.q(this.f12625a, this.f12626b, this.f12627c, this.f12628d, valueAnimator);
    }
}
