package androidx.compose.foundation.text;

import a0.s;
import bp0.k;
import i1.m;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$CoreTextField$decorationBoxModifier$1 extends Lambda implements l<m, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextFieldState f4384a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$decorationBoxModifier$1(TextFieldState textFieldState) {
        super(1);
        this.f4384a = textFieldState;
    }

    public final void a(m mVar) {
        p.j(mVar, "it");
        s g11 = this.f4384a.g();
        if (g11 != null) {
            g11.l(mVar);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((m) obj);
        return k.f22762a;
    }
}
