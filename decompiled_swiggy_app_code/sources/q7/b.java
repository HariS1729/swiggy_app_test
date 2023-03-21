package q7;

import android.graphics.Typeface;
import android.os.IBinder;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.afollestad.materialdialogs.internal.message.DialogContentLayout;
import k7.a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.p;

/* compiled from: Dialogs.kt */
public final class b {
    public static final void a(MaterialDialog materialDialog) {
        IBinder iBinder;
        p.k(materialDialog, "$this$hideKeyboard");
        Object systemService = materialDialog.e().getSystemService("input_method");
        if (systemService != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            View currentFocus = materialDialog.getCurrentFocus();
            if (currentFocus != null) {
                iBinder = currentFocus.getWindowToken();
            } else {
                iBinder = materialDialog.d().getWindowToken();
            }
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    public static final void b(MaterialDialog materialDialog, TextView textView, Integer num, CharSequence charSequence, int i11, Typeface typeface, Integer num2, Float f11) {
        p.k(materialDialog, "$this$populateText");
        p.k(textView, "textView");
        if (charSequence == null) {
            charSequence = e.r(e.f16390a, materialDialog, num, Integer.valueOf(i11), false, 8, (Object) null);
        }
        if (charSequence != null) {
            ViewParent parent = textView.getParent();
            if (parent != null) {
                ((View) parent).setVisibility(0);
                textView.setVisibility(0);
                textView.setText(charSequence);
                if (typeface != null) {
                    textView.setTypeface(typeface);
                }
                e.h(e.f16390a, textView, materialDialog.e(), num2, (Integer) null, 4, (Object) null);
                if (f11 != null) {
                    textView.setTextSize(0, f11.floatValue());
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
        textView.setVisibility(8);
    }

    public static /* synthetic */ void c(MaterialDialog materialDialog, TextView textView, Integer num, CharSequence charSequence, int i11, Typeface typeface, Integer num2, Float f11, int i12, Object obj) {
        b(materialDialog, textView, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? null : charSequence, (i12 & 8) != 0 ? 0 : i11, typeface, (i12 & 32) != 0 ? null : num2, (i12 & 64) != 0 ? null : f11);
    }

    public static final void d(MaterialDialog materialDialog) {
        p.k(materialDialog, "$this$preShow");
        Object obj = materialDialog.b().get("md.custom_view_no_vertical_padding");
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        boolean e11 = p.e((Boolean) obj, Boolean.TRUE);
        a.a(materialDialog.c(), materialDialog);
        DialogLayout d11 = materialDialog.d();
        if (d11.getTitleLayout().b() && !e11) {
            d11.getContentLayout().c(d11.getFrameMarginVertical$core(), d11.getFrameMarginVertical$core());
        }
        if (f.e(l7.a.a(materialDialog))) {
            DialogContentLayout.d(d11.getContentLayout(), 0, 0, 1, (Object) null);
        } else if (d11.getContentLayout().b()) {
            DialogContentLayout.f(d11.getContentLayout(), 0, d11.getFrameMarginVerticalLess$core(), 1, (Object) null);
        }
    }
}
