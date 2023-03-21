package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import androidx.appcompat.R;

/* compiled from: AppCompatRatingBar */
public class n extends RatingBar {

    /* renamed from: a  reason: collision with root package name */
    private final m f2217a;

    public n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ratingBarStyle);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        Bitmap b11 = this.f2217a.b();
        if (b11 != null) {
            setMeasuredDimension(View.resolveSizeAndState(b11.getWidth() * getNumStars(), i11, 0), getMeasuredHeight());
        }
    }

    public n(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        j0.a(this, getContext());
        m mVar = new m(this);
        this.f2217a = mVar;
        mVar.c(attributeSet, i11);
    }
}
