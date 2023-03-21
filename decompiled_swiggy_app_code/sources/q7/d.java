package q7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import androidx.core.content.res.h;
import com.afollestad.materialdialogs.MaterialDialog;
import kotlin.jvm.internal.p;

/* compiled from: Fonts.kt */
public final class d {
    public static final Typeface a(MaterialDialog materialDialog, Integer num, Integer num2) {
        p.k(materialDialog, "$this$font");
        e.f16390a.b("font", num2, num);
        if (num != null) {
            return c(materialDialog.e(), num.intValue());
        }
        if (num2 != null) {
            TypedArray obtainStyledAttributes = materialDialog.e().getTheme().obtainStyledAttributes(new int[]{num2.intValue()});
            try {
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId == 0) {
                    return null;
                }
                Typeface c11 = c(materialDialog.e(), resourceId);
                obtainStyledAttributes.recycle();
                return c11;
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public static /* synthetic */ Typeface b(MaterialDialog materialDialog, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        if ((i11 & 2) != 0) {
            num2 = null;
        }
        return a(materialDialog, num, num2);
    }

    private static final Typeface c(Context context, int i11) {
        try {
            return h.g(context, i11);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }
}
