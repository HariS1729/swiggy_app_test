package d2;

import android.content.Context;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.p;

/* compiled from: AndroidDensity.android.kt */
public final class a {
    public static final e a(Context context) {
        p.j(context, LogCategory.CONTEXT);
        return g.a(context.getResources().getDisplayMetrics().density, context.getResources().getConfiguration().fontScale);
    }
}
