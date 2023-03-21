package q7;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import kotlin.jvm.internal.p;

/* compiled from: Dimens.kt */
public final class c {
    public static final float a(View view, int i11) {
        p.k(view, "$this$dp");
        Resources resources = view.getResources();
        p.f(resources, "resources");
        return TypedValue.applyDimension(1, (float) i11, resources.getDisplayMetrics());
    }
}
