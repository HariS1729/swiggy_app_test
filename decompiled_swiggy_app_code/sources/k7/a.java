package k7;

import bp0.k;
import com.afollestad.materialdialogs.MaterialDialog;
import java.util.List;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: DialogCallbackExt.kt */
public final class a {
    public static final void a(List<l<MaterialDialog, k>> list, MaterialDialog materialDialog) {
        p.k(list, "$this$invokeAll");
        p.k(materialDialog, "dialog");
        for (l<MaterialDialog, k> invoke : list) {
            invoke.invoke(materialDialog);
        }
    }
}
