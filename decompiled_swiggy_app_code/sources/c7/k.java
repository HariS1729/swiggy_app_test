package c7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.size.Scale;
import com.truecaller.android.sdk.TruecallerSdkScope;
import kotlin.jvm.internal.p;
import o6.d;
import y6.b;
import y6.g;

/* compiled from: DrawableUtils.kt */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f12862a = new k();

    private k() {
    }

    private final boolean b(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == a.e(config);
    }

    private final boolean c(boolean z11, Bitmap bitmap, g gVar, Scale scale) {
        if (z11) {
            return true;
        }
        if (d.c(bitmap.getWidth(), bitmap.getHeight(), b.a(gVar) ? bitmap.getWidth() : i.z(gVar.b(), scale), b.a(gVar) ? bitmap.getHeight() : i.z(gVar.a(), scale), scale) == 1.0d) {
            return true;
        }
        return false;
    }

    public final Bitmap a(Drawable drawable, Bitmap.Config config, g gVar, Scale scale, boolean z11) {
        int i11;
        int i12;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (b(bitmap, config) && c(z11, bitmap, gVar, scale)) {
                return bitmap;
            }
        }
        Drawable mutate = drawable.mutate();
        int p11 = i.p(mutate);
        int i13 = TruecallerSdkScope.FOOTER_TYPE_MANUALLY;
        if (p11 <= 0) {
            p11 = TruecallerSdkScope.FOOTER_TYPE_MANUALLY;
        }
        int i14 = i.i(mutate);
        if (i14 > 0) {
            i13 = i14;
        }
        if (b.a(gVar)) {
            i11 = p11;
        } else {
            i11 = i.z(gVar.b(), scale);
        }
        if (b.a(gVar)) {
            i12 = i13;
        } else {
            i12 = i.z(gVar.a(), scale);
        }
        double c11 = d.c(p11, i13, i11, i12, scale);
        int b11 = c.b(((double) p11) * c11);
        int b12 = c.b(c11 * ((double) i13));
        Bitmap createBitmap = Bitmap.createBitmap(b11, b12, a.e(config));
        p.i(createBitmap, "createBitmap(width, height, config)");
        Rect bounds = mutate.getBounds();
        int i15 = bounds.left;
        int i16 = bounds.top;
        int i17 = bounds.right;
        int i18 = bounds.bottom;
        mutate.setBounds(0, 0, b11, b12);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i15, i16, i17, i18);
        return createBitmap;
    }
}
