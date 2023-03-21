package androidx.compose.ui.window;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: AndroidPopup.android.kt */
final class PopupLayout$Content$4 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PopupLayout f7854a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f7855b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PopupLayout$Content$4(PopupLayout popupLayout, int i11) {
        super(2);
        this.f7854a = popupLayout;
        this.f7855b = i11;
    }

    public final void a(g gVar, int i11) {
        this.f7854a.a(gVar, this.f7855b | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
