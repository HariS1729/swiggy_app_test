package bt;

import android.view.View;
import android.view.ViewTreeObserver;
import in.swiggy.android.commonsFeature.views.CommonToolTipView;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CommonToolTipView f12650a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f12651b;

    public /* synthetic */ f(CommonToolTipView commonToolTipView, View view) {
        this.f12650a = commonToolTipView;
        this.f12651b = view;
    }

    public final void onGlobalLayout() {
        this.f12650a.j(this.f12651b);
    }
}
