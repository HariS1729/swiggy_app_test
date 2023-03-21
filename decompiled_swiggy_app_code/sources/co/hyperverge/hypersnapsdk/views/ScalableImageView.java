package co.hyperverge.hypersnapsdk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import z5.f;

public class ScalableImageView extends ImageView {
    public ScalableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        if (getDrawable() != null) {
            int b11 = f.b(getContext(), 120.0f);
            if (f.l(getContext())) {
                b11 = f.b(getContext(), 100.0f);
            }
            setMeasuredDimension(b11, b11);
            return;
        }
        super.onMeasure(i11, i12);
    }
}
