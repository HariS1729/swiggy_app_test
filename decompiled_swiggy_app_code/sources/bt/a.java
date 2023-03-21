package bt;

import android.view.View;
import in.swiggy.android.commonsFeature.views.CommonToolTipView;
import in.swiggy.android.tejas.oldapi.models.ToolTipContent;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ToolTipContent f12645a;

    public /* synthetic */ a(ToolTipContent toolTipContent) {
        this.f12645a = toolTipContent;
    }

    public final void onClick(View view) {
        CommonToolTipView.n(this.f12645a, view);
    }
}
