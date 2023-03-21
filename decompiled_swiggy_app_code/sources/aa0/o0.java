package aa0;

import android.view.View;
import in.swiggy.android.fragmentservices.impl.SearchControllerComponentService;
import in.swiggy.android.supertooltips.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class o0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f1032a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SearchControllerComponentService f1033b;

    public /* synthetic */ o0(a aVar, SearchControllerComponentService searchControllerComponentService) {
        this.f1032a = aVar;
        this.f1033b = searchControllerComponentService;
    }

    public final void onClick(View view) {
        SearchControllerComponentService.va(this.f1032a, this.f1033b, view);
    }
}
