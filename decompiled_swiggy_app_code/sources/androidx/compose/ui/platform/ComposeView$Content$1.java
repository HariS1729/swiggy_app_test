package androidx.compose.ui.platform;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: ComposeView.android.kt */
final class ComposeView$Content$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ComposeView f7102a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f7103b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposeView$Content$1(ComposeView composeView, int i11) {
        super(2);
        this.f7102a = composeView;
        this.f7103b = i11;
    }

    public final void a(g gVar, int i11) {
        this.f7102a.a(gVar, this.f7103b | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
