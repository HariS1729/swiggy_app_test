package bg0;

import android.animation.ValueAnimator;
import cg0.t;
import com.google.android.gms.maps.model.LatLng;
import in.swiggy.android.swiggylocation.animator.MarkerPositionAnimator;
import rj.g;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f12621a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f12622b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ LatLng f12623c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ LatLng f12624d;

    public /* synthetic */ b(g gVar, t tVar, LatLng latLng, LatLng latLng2) {
        this.f12621a = gVar;
        this.f12622b = tVar;
        this.f12623c = latLng;
        this.f12624d = latLng2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        MarkerPositionAnimator.p(this.f12621a, this.f12622b, this.f12623c, this.f12624d, valueAnimator);
    }
}
