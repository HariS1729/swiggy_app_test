package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import d1.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import t0.f;

/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$previewKeyEventToDeselectOnBack$1 extends Lambda implements l<b, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextFieldState f4447a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TextFieldSelectionManager f4448b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$previewKeyEventToDeselectOnBack$1(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        super(1);
        this.f4447a = textFieldState;
        this.f4448b = textFieldSelectionManager;
    }

    public final Boolean a(KeyEvent keyEvent) {
        p.j(keyEvent, "keyEvent");
        boolean z11 = true;
        if (this.f4447a.c() != HandleState.Selection || !a0.b.a(keyEvent)) {
            z11 = false;
        } else {
            TextFieldSelectionManager.q(this.f4448b, (f) null, 1, (Object) null);
        }
        return Boolean.valueOf(z11);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((b) obj).f());
    }
}
