package di0;

import android.view.View;
import dt.c;
import kotlin.jvm.internal.p;

/* compiled from: LynxBindingAdapters.kt */
public final class o {
    public static final void a(View view, String str) {
        p.j(view, "view");
        if (str != null) {
            view.setBackgroundColor(c.f(str, 0, 1, (Object) null));
        }
    }
}
