package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: ContextMenu.android.kt */
final class ContextMenu_androidKt$ContextMenuArea$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextFieldSelectionManager f4324a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f4325b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f4326c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ContextMenu_androidKt$ContextMenuArea$1(TextFieldSelectionManager textFieldSelectionManager, p<? super g, ? super Integer, k> pVar, int i11) {
        super(2);
        this.f4324a = textFieldSelectionManager;
        this.f4325b = pVar;
        this.f4326c = i11;
    }

    public final void a(g gVar, int i11) {
        ContextMenu_androidKt.a(this.f4324a, this.f4325b, gVar, this.f4326c | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
