package m1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Objects;
import kotlin.jvm.internal.p;
import u0.f;
import u0.l0;

/* compiled from: ImageResources.android.kt */
public final class c {
    public static final l0 a(l0.a aVar, Resources resources, int i11) {
        p.j(aVar, "<this>");
        p.j(resources, "res");
        Drawable drawable = resources.getDrawable(i11, (Resources.Theme) null);
        Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        p.i(bitmap, "res.getDrawable(id, null…as BitmapDrawable).bitmap");
        return f.c(bitmap);
    }
}
