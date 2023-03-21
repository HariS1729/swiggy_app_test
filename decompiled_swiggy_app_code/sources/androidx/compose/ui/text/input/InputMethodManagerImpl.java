package androidx.compose.ui.text.input;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import bp0.f;
import in.juspay.hyper.constants.LogCategory;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.p;
import v1.o;

/* compiled from: InputMethodManager.kt */
public final class InputMethodManagerImpl implements o {

    /* renamed from: a  reason: collision with root package name */
    private final f f7610a;

    public InputMethodManagerImpl(Context context) {
        p.j(context, LogCategory.CONTEXT);
        this.f7610a = b.a(LazyThreadSafetyMode.NONE, new InputMethodManagerImpl$imm$2(context));
    }

    private final InputMethodManager f() {
        return (InputMethodManager) this.f7610a.getValue();
    }

    public void a(View view) {
        p.j(view, "view");
        f().showSoftInput(view, 0);
    }

    public void b(IBinder iBinder) {
        f().hideSoftInputFromWindow(iBinder, 0);
    }

    public void c(View view, int i11, int i12, int i13, int i14) {
        p.j(view, "view");
        f().updateSelection(view, i11, i12, i13, i14);
    }

    public void d(View view, int i11, ExtractedText extractedText) {
        p.j(view, "view");
        p.j(extractedText, "extractedText");
        f().updateExtractedText(view, i11, extractedText);
    }

    public void e(View view) {
        p.j(view, "view");
        f().restartInput(view);
    }
}
