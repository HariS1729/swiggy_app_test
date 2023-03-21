package coil.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.jvm.internal.p;

/* compiled from: ImageViewTarget.kt */
public class ImageViewTarget extends GenericViewTarget<ImageView> {

    /* renamed from: b  reason: collision with root package name */
    private final ImageView f13685b;

    public Drawable a() {
        return c().getDrawable();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageViewTarget) && p.e(c(), ((ImageViewTarget) obj).c());
    }

    public void h(Drawable drawable) {
        c().setImageDrawable(drawable);
    }

    public int hashCode() {
        return c().hashCode();
    }

    /* renamed from: k */
    public ImageView c() {
        return this.f13685b;
    }
}
