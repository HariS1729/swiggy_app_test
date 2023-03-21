package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k0 f9509a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f9510b;

    public /* synthetic */ g0(k0 k0Var, View view) {
        this.f9509a = k0Var;
        this.f9510b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f9509a.a(this.f9510b);
    }
}
