package r2;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;
import kotlin.jvm.internal.p;
import org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject;

/* compiled from: ThemeUtils.kt */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f16454a = new f();

    private f() {
    }

    public static final void a(Resources.Theme theme, View view) {
        p.j(theme, "theme");
        p.j(view, "decor");
        c(theme, view, (TypedValue) null, 4, (Object) null);
    }

    public static final void b(Resources.Theme theme, View view, TypedValue typedValue) {
        p.j(theme, "theme");
        p.j(view, "decor");
        p.j(typedValue, PDPrintFieldAttributeObject.ROLE_TV);
        int i11 = (!theme.resolveAttribute(16844000, typedValue, true) || typedValue.data == 0) ? 0 : 8;
        if (theme.resolveAttribute(16844140, typedValue, true) && typedValue.data != 0) {
            i11 |= 16;
        }
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        p.g(windowInsetsController);
        windowInsetsController.setSystemBarsAppearance(i11, 24);
    }

    public static /* synthetic */ void c(Resources.Theme theme, View view, TypedValue typedValue, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            typedValue = new TypedValue();
        }
        b(theme, view, typedValue);
    }
}
