package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$TextFieldCursorHandle$3 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextFieldSelectionManager f4445a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f4446b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$TextFieldCursorHandle$3(TextFieldSelectionManager textFieldSelectionManager, int i11) {
        super(2);
        this.f4445a = textFieldSelectionManager;
        this.f4446b = i11;
    }

    public final void a(g gVar, int i11) {
        CoreTextFieldKt.d(this.f4445a, gVar, this.f4446b | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
