package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PointerIcon;

/* compiled from: PointerIconCompat */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private final PointerIcon f9605a;

    /* compiled from: PointerIconCompat */
    static class a {
        static PointerIcon a(Bitmap bitmap, float f11, float f12) {
            return PointerIcon.create(bitmap, f11, f12);
        }

        static PointerIcon b(Context context, int i11) {
            return PointerIcon.getSystemIcon(context, i11);
        }

        static PointerIcon c(Resources resources, int i11) {
            return PointerIcon.load(resources, i11);
        }
    }

    private x(PointerIcon pointerIcon) {
        this.f9605a = pointerIcon;
    }

    public static x b(Context context, int i11) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new x(a.b(context, i11));
        }
        return new x((PointerIcon) null);
    }

    public Object a() {
        return this.f9605a;
    }
}
