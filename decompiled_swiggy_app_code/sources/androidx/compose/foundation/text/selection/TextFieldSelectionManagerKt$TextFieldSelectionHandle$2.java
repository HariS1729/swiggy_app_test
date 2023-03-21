package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.style.ResolvedTextDirection;
import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: TextFieldSelectionManager.kt */
final class TextFieldSelectionManagerKt$TextFieldSelectionHandle$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f4765a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ResolvedTextDirection f4766b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TextFieldSelectionManager f4767c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f4768d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManagerKt$TextFieldSelectionHandle$2(boolean z11, ResolvedTextDirection resolvedTextDirection, TextFieldSelectionManager textFieldSelectionManager, int i11) {
        super(2);
        this.f4765a = z11;
        this.f4766b = resolvedTextDirection;
        this.f4767c = textFieldSelectionManager;
        this.f4768d = i11;
    }

    public final void a(g gVar, int i11) {
        TextFieldSelectionManagerKt.a(this.f4765a, this.f4766b, this.f4767c, gVar, this.f4768d | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
