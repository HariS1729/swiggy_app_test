package androidx.core.view;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class o0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f9587a;

    public /* synthetic */ o0(View view) {
        this.f9587a = view;
    }

    public final void run() {
        ((InputMethodManager) this.f9587a.getContext().getSystemService("input_method")).showSoftInput(this.f9587a, 0);
    }
}
