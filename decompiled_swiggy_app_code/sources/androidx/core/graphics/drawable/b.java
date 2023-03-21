package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.p;

/* compiled from: Drawable.kt */
public final class b {
    public static final Bitmap a(Drawable drawable, int i11, int i12, Bitmap.Config config) {
        p.j(drawable, "<this>");
        if (!(drawable instanceof BitmapDrawable) || !(config == null || ((BitmapDrawable) drawable).getBitmap().getConfig() == config)) {
            Rect bounds = drawable.getBounds();
            p.i(bounds, "bounds");
            int i13 = bounds.left;
            int i14 = bounds.top;
            int i15 = bounds.right;
            int i16 = bounds.bottom;
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(i11, i12, config);
            drawable.setBounds(0, 0, i11, i12);
            drawable.draw(new Canvas(createBitmap));
            drawable.setBounds(i13, i14, i15, i16);
            p.i(createBitmap, "bitmap");
            return createBitmap;
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
        if (i11 == bitmapDrawable.getBitmap().getWidth() && i12 == bitmapDrawable.getBitmap().getHeight()) {
            Bitmap bitmap = bitmapDrawable.getBitmap();
            p.i(bitmap, "bitmap");
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i11, i12, true);
        p.i(createScaledBitmap, "createScaledBitmap(bitmap, width, height, true)");
        return createScaledBitmap;
    }

    public static /* synthetic */ Bitmap b(Drawable drawable, int i11, int i12, Bitmap.Config config, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = drawable.getIntrinsicWidth();
        }
        if ((i13 & 2) != 0) {
            i12 = drawable.getIntrinsicHeight();
        }
        if ((i13 & 4) != 0) {
            config = null;
        }
        return a(drawable, i11, i12, config);
    }
}
