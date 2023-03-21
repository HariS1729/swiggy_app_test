package in.swiggy.android.supertooltips;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

public class ToolTipRelativeLayout extends RelativeLayout {
    public ToolTipRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public a a(ToolTip toolTip, View view) {
        removeAllViews();
        a aVar = new a(getContext());
        aVar.d(toolTip, view);
        addView(aVar);
        return aVar;
    }
}
