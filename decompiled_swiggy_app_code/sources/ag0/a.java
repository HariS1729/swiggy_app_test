package ag0;

import android.animation.ValueAnimator;
import rj.g;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f1091a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f1092b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ float f1093c;

    public /* synthetic */ a(g gVar, float f11, float f12) {
        this.f1091a = gVar;
        this.f1092b = f11;
        this.f1093c = f12;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        d.f(this.f1091a, this.f1092b, this.f1093c, valueAnimator);
    }
}
