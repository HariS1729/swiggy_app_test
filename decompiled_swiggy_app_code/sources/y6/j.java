package y6;

import android.view.View;
import coil.size.ViewSizeResolver;

/* compiled from: ViewSizeResolver.kt */
public final class j {
    public static final <T extends View> ViewSizeResolver<T> a(T t, boolean z11) {
        return new f(t, z11);
    }

    public static /* synthetic */ ViewSizeResolver b(View view, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return a(view, z11);
    }
}
