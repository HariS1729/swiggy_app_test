package ag0;

import android.animation.ValueAnimator;
import cg0.t;
import com.google.android.gms.maps.model.LatLng;
import rj.g;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f1097a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f1098b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ LatLng f1099c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ LatLng f1100d;

    public /* synthetic */ c(g gVar, t tVar, LatLng latLng, LatLng latLng2) {
        this.f1097a = gVar;
        this.f1098b = tVar;
        this.f1099c = latLng;
        this.f1100d = latLng2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        d.h(this.f1097a, this.f1098b, this.f1099c, this.f1100d, valueAnimator);
    }
}
