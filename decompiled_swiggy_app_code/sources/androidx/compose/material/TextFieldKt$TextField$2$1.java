package androidx.compose.material;

import androidx.compose.ui.text.input.TextFieldValue;
import bp0.k;
import e0.h0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: TextField.kt */
final class TextFieldKt$TextField$2$1 extends Lambda implements l<TextFieldValue, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f5630a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l<String, k> f5631b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h0<TextFieldValue> f5632c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldKt$TextField$2$1(String str, l<? super String, k> lVar, h0<TextFieldValue> h0Var) {
        super(1);
        this.f5630a = str;
        this.f5631b = lVar;
        this.f5632c = h0Var;
    }

    public final void a(TextFieldValue textFieldValue) {
        p.j(textFieldValue, "it");
        TextFieldKt.e(this.f5632c, textFieldValue);
        if (!p.e(this.f5630a, textFieldValue.h())) {
            this.f5631b.invoke(textFieldValue.h());
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((TextFieldValue) obj);
        return k.f22762a;
    }
}
