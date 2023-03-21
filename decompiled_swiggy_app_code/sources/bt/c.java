package bt;

import android.view.View;
import in.swiggy.android.commonsFeature.views.CommonToolTipView;
import in.swiggy.android.tejas.oldapi.models.ToolTipContent;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ToolTipContent f12647a;

    public /* synthetic */ c(ToolTipContent toolTipContent) {
        this.f12647a = toolTipContent;
    }

    public final void onClick(View view) {
        CommonToolTipView.k(this.f12647a, view);
    }
}
