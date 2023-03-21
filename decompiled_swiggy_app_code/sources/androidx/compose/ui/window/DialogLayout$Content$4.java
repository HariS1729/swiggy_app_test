package androidx.compose.ui.window;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: AndroidDialog.android.kt */
final class DialogLayout$Content$4 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DialogLayout f7840a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f7841b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DialogLayout$Content$4(DialogLayout dialogLayout, int i11) {
        super(2);
        this.f7840a = dialogLayout;
        this.f7841b = i11;
    }

    public final void a(g gVar, int i11) {
        this.f7840a.a(gVar, this.f7841b | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
