package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.TextFieldValue;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: CoreTextField.kt */
final class TextFieldState$onValueChange$1 extends Lambda implements l<TextFieldValue, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextFieldState f4640a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldState$onValueChange$1(TextFieldState textFieldState) {
        super(1);
        this.f4640a = textFieldState;
    }

    public final void a(TextFieldValue textFieldValue) {
        p.j(textFieldValue, "it");
        if (!p.e(textFieldValue.h(), this.f4640a.q().k().g())) {
            this.f4640a.r(HandleState.None);
        }
        this.f4640a.n.invoke(textFieldValue);
        this.f4640a.k().invalidate();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((TextFieldValue) obj);
        return k.f22762a;
    }
}
