package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.TextFieldValue;
import bp0.k;
import e0.h0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: BasicTextField.kt */
final class BasicTextFieldKt$BasicTextField$3$1 extends Lambda implements l<TextFieldValue, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<String, k> f4233a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h0<TextFieldValue> f4234b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h0<String> f4235c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BasicTextFieldKt$BasicTextField$3$1(l<? super String, k> lVar, h0<TextFieldValue> h0Var, h0<String> h0Var2) {
        super(1);
        this.f4233a = lVar;
        this.f4234b = h0Var;
        this.f4235c = h0Var2;
    }

    public final void a(TextFieldValue textFieldValue) {
        p.j(textFieldValue, "newTextFieldValueState");
        BasicTextFieldKt.d(this.f4234b, textFieldValue);
        boolean z11 = !p.e(BasicTextFieldKt.e(this.f4235c), textFieldValue.h());
        BasicTextFieldKt.f(this.f4235c, textFieldValue.h());
        if (z11) {
            this.f4233a.invoke(textFieldValue.h());
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((TextFieldValue) obj);
        return k.f22762a;
    }
}
