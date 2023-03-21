package ag0;

import android.animation.ValueAnimator;
import rj.g;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f1094a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f1095b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ float f1096c;

    public /* synthetic */ b(g gVar, float f11, float f12) {
        this.f1094a = gVar;
        this.f1095b = f11;
        this.f1096c = f12;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        d.i(this.f1094a, this.f1095b, this.f1096c, valueAnimator);
    }
}
