package androidx.compose.material;

import androidx.compose.ui.text.input.TextFieldValue;
import bp0.k;
import e0.h0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: OutlinedTextField.kt */
final class OutlinedTextFieldKt$OutlinedTextField$2$1 extends Lambda implements l<TextFieldValue, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f5116a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l<String, k> f5117b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h0<TextFieldValue> f5118c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OutlinedTextFieldKt$OutlinedTextField$2$1(String str, l<? super String, k> lVar, h0<TextFieldValue> h0Var) {
        super(1);
        this.f5116a = str;
        this.f5117b = lVar;
        this.f5118c = h0Var;
    }

    public final void a(TextFieldValue textFieldValue) {
        p.j(textFieldValue, "it");
        OutlinedTextFieldKt.e(this.f5118c, textFieldValue);
        if (!p.e(this.f5116a, textFieldValue.h())) {
            this.f5117b.invoke(textFieldValue.h());
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((TextFieldValue) obj);
        return k.f22762a;
    }
}
