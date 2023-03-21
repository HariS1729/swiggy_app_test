package q7;

import android.graphics.Color;
import com.afollestad.materialdialogs.MaterialDialog;
import kotlin.jvm.internal.p;

/* compiled from: Colors.kt */
public final class a {
    public static final int a(int i11, float f11) {
        return Color.argb((int) (((float) 255) * f11), Color.red(i11), Color.green(i11), Color.blue(i11));
    }

    public static final int b(MaterialDialog materialDialog, Integer num, Integer num2, lp0.a<Integer> aVar) {
        p.k(materialDialog, "$this$resolveColor");
        return e.f16390a.i(materialDialog.e(), num, num2, aVar);
    }

    public static /* synthetic */ int c(MaterialDialog materialDialog, Integer num, Integer num2, lp0.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        if ((i11 & 2) != 0) {
            num2 = null;
        }
        if ((i11 & 4) != 0) {
            aVar = null;
        }
        return b(materialDialog, num, num2, aVar);
    }
}
