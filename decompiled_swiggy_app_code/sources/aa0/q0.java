package aa0;

import android.widget.PopupWindow;
import in.swiggy.android.fragmentservices.impl.SearchControllerComponentService;
import lp0.l;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class q0 implements PopupWindow.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f1038a;

    public /* synthetic */ q0(l lVar) {
        this.f1038a = lVar;
    }

    public final void onDismiss() {
        SearchControllerComponentService.Ea(this.f1038a);
    }
}
