package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* compiled from: AnimationUtilsCompat */
public class d {
    public static Interpolator a(Context context, int i11) throws Resources.NotFoundException {
        return AnimationUtils.loadInterpolator(context, i11);
    }
}
