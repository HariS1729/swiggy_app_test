package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.TextFieldValue;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: BasicTextField.kt */
final class BasicTextFieldKt$BasicTextField$7$1 extends Lambda implements l<TextFieldValue, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextFieldValue f4251a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l<TextFieldValue, k> f4252b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BasicTextFieldKt$BasicTextField$7$1(TextFieldValue textFieldValue, l<? super TextFieldValue, k> lVar) {
        super(1);
        this.f4251a = textFieldValue;
        this.f4252b = lVar;
    }

    public final void a(TextFieldValue textFieldValue) {
        p.j(textFieldValue, "it");
        if (!p.e(this.f4251a, textFieldValue)) {
            this.f4252b.invoke(textFieldValue);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((TextFieldValue) obj);
        return k.f22762a;
    }
}
