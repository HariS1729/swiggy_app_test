package bt;

import android.view.View;
import in.swiggy.android.commonsFeature.views.CommonToolTipView;
import in.swiggy.android.tejas.oldapi.models.ToolTipContent;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ToolTipContent f12646a;

    public /* synthetic */ b(ToolTipContent toolTipContent) {
        this.f12646a = toolTipContent;
    }

    public final void onClick(View view) {
        CommonToolTipView.m(this.f12646a, view);
    }
}
