package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p0.d;

/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$CoreTextFieldRootBox$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f4434a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TextFieldSelectionManager f4435b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f4436c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f4437d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextFieldRootBox$2(d dVar, TextFieldSelectionManager textFieldSelectionManager, p<? super g, ? super Integer, k> pVar, int i11) {
        super(2);
        this.f4434a = dVar;
        this.f4435b = textFieldSelectionManager;
        this.f4436c = pVar;
        this.f4437d = i11;
    }

    public final void a(g gVar, int i11) {
        CoreTextFieldKt.b(this.f4434a, this.f4435b, this.f4436c, gVar, this.f4437d | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
