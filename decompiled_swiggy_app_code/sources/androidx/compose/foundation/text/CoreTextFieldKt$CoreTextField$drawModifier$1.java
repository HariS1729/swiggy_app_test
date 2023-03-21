package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.TextFieldValue;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import u0.x;
import v1.s;
import w0.f;

/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$CoreTextField$drawModifier$1 extends Lambda implements l<f, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextFieldState f4385a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TextFieldValue f4386b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ s f4387c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$drawModifier$1(TextFieldState textFieldState, TextFieldValue textFieldValue, s sVar) {
        super(1);
        this.f4385a = textFieldState;
        this.f4386b = textFieldValue;
        this.f4387c = sVar;
    }

    public final void a(f fVar) {
        p.j(fVar, "$this$drawBehind");
        a0.s g11 = this.f4385a.g();
        if (g11 != null) {
            TextFieldValue textFieldValue = this.f4386b;
            s sVar = this.f4387c;
            TextFieldState textFieldState = this.f4385a;
            x a11 = fVar.O().a();
            TextFieldDelegate.f4538a.c(a11, textFieldValue, sVar, g11.i(), textFieldState.l());
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((f) obj);
        return k.f22762a;
    }
}
