package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$SelectionToolbarAndHandles$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextFieldSelectionManager f4438a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f4439b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f4440c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$SelectionToolbarAndHandles$2(TextFieldSelectionManager textFieldSelectionManager, boolean z11, int i11) {
        super(2);
        this.f4438a = textFieldSelectionManager;
        this.f4439b = z11;
        this.f4440c = i11;
    }

    public final void a(g gVar, int i11) {
        CoreTextFieldKt.c(this.f4438a, this.f4439b, gVar, this.f4440c | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
