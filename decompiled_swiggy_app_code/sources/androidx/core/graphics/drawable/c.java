package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

/* compiled from: RoundedBitmapDrawable21 */
class c extends d {
    protected c(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    /* access modifiers changed from: package-private */
    public void c(int i11, int i12, int i13, Rect rect, Rect rect2) {
        Gravity.apply(i11, i12, i13, rect, rect2, 0);
    }

    public void getOutline(Outline outline) {
        g();
        outline.setRoundRect(this.f9264h, b());
    }
}
