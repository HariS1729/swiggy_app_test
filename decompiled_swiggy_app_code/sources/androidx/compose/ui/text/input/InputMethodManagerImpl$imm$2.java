package androidx.compose.ui.text.input;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: InputMethodManager.kt */
final class InputMethodManagerImpl$imm$2 extends Lambda implements a<InputMethodManager> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f7611a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InputMethodManagerImpl$imm$2(Context context) {
        super(0);
        this.f7611a = context;
    }

    /* renamed from: a */
    public final InputMethodManager invoke() {
        Object systemService = this.f7611a.getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }
}
