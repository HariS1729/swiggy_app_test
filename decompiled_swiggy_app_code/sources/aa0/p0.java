package aa0;

import android.widget.PopupWindow;
import in.swiggy.android.fragmentservices.impl.SearchControllerComponentService;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class p0 implements PopupWindow.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchControllerComponentService f1036a;

    public /* synthetic */ p0(SearchControllerComponentService searchControllerComponentService) {
        this.f1036a = searchControllerComponentService;
    }

    public final void onDismiss() {
        SearchControllerComponentService.za(this.f1036a);
    }
}
