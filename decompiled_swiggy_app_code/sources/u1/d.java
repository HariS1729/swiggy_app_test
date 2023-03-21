package u1;

import android.content.Context;
import android.os.Build;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.p;

/* compiled from: AndroidFontResolveInterceptor.android.kt */
public final class d {
    public static final c a(Context context) {
        p.j(context, LogCategory.CONTEXT);
        return new c(Build.VERSION.SDK_INT >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0);
    }
}
