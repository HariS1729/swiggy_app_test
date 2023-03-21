package i7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.internal.main.DialogLayout;

/* compiled from: DialogBehavior.kt */
public interface a {
    int a(boolean z11);

    DialogLayout b(ViewGroup viewGroup);

    void c(MaterialDialog materialDialog);

    void d(MaterialDialog materialDialog);

    ViewGroup e(Context context, Window window, LayoutInflater layoutInflater, MaterialDialog materialDialog);

    void f(DialogLayout dialogLayout, int i11, float f11);

    void g(Context context, Window window, DialogLayout dialogLayout, Integer num);

    boolean onDismiss();
}
