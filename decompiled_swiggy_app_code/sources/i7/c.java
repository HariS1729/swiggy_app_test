package i7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.WhichButton;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import in.juspay.hyper.constants.LogCategory;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.p;
import q7.e;
import q7.f;

/* compiled from: DialogBehavior.kt */
public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final c f15131a = new c();

    /* compiled from: DialogBehavior.kt */
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DialogActionButton f15132a;

        a(DialogActionButton dialogActionButton) {
            this.f15132a = dialogActionButton;
        }

        public final void run() {
            this.f15132a.requestFocus();
        }
    }

    /* compiled from: DialogBehavior.kt */
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DialogActionButton f15133a;

        b(DialogActionButton dialogActionButton) {
            this.f15133a = dialogActionButton;
        }

        public final void run() {
            this.f15133a.requestFocus();
        }
    }

    private c() {
    }

    public int a(boolean z11) {
        if (z11) {
            return R.style.MD_Dark;
        }
        return R.style.MD_Light;
    }

    public DialogLayout b(ViewGroup viewGroup) {
        p.k(viewGroup, "root");
        return (DialogLayout) viewGroup;
    }

    public void c(MaterialDialog materialDialog) {
        p.k(materialDialog, "dialog");
        DialogActionButton a11 = j7.a.a(materialDialog, WhichButton.NEGATIVE);
        if (f.e(a11)) {
            a11.post(new a(a11));
            return;
        }
        DialogActionButton a12 = j7.a.a(materialDialog, WhichButton.POSITIVE);
        if (f.e(a12)) {
            a12.post(new b(a12));
        }
    }

    public void d(MaterialDialog materialDialog) {
        p.k(materialDialog, "dialog");
    }

    @SuppressLint({"InflateParams"})
    public ViewGroup e(Context context, Window window, LayoutInflater layoutInflater, MaterialDialog materialDialog) {
        p.k(context, "creatingContext");
        p.k(window, "dialogWindow");
        p.k(layoutInflater, "layoutInflater");
        p.k(materialDialog, "dialog");
        View inflate = layoutInflater.inflate(R.layout.md_dialog_base, (ViewGroup) null, false);
        if (inflate != null) {
            return (ViewGroup) inflate;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public void f(DialogLayout dialogLayout, int i11, float f11) {
        p.k(dialogLayout, "view");
        dialogLayout.setCornerRadii(new float[]{f11, f11, f11, f11, 0.0f, 0.0f, 0.0f, 0.0f});
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(f11);
        gradientDrawable.setColor(i11);
        dialogLayout.setBackground(gradientDrawable);
    }

    public void g(Context context, Window window, DialogLayout dialogLayout, Integer num) {
        p.k(context, LogCategory.CONTEXT);
        p.k(window, "window");
        p.k(dialogLayout, "view");
        if (num == null || num.intValue() != 0) {
            window.setSoftInputMode(16);
            WindowManager windowManager = window.getWindowManager();
            if (windowManager != null) {
                Resources resources = context.getResources();
                Pair<Integer, Integer> d11 = e.f16390a.d(windowManager);
                int intValue = d11.a().intValue();
                dialogLayout.setMaxHeight(d11.b().intValue() - (resources.getDimensionPixelSize(R.dimen.md_dialog_vertical_margin) * 2));
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = Math.min(num != null ? num.intValue() : resources.getDimensionPixelSize(R.dimen.md_dialog_max_width), intValue - (resources.getDimensionPixelSize(R.dimen.md_dialog_horizontal_margin) * 2));
                window.setAttributes(layoutParams);
            }
        }
    }

    public boolean onDismiss() {
        return false;
    }
}
