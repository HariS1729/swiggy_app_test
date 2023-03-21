package bt;

import android.view.View;
import in.swiggy.android.commonsFeature.views.CommonToolTipView;
import in.swiggy.android.tejas.oldapi.models.ToolTipContent;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ToolTipContent f12648a;

    public /* synthetic */ d(ToolTipContent toolTipContent) {
        this.f12648a = toolTipContent;
    }

    public final void onClick(View view) {
        CommonToolTipView.l(this.f12648a, view);
    }
}
