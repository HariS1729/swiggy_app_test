package androidx.compose.ui.layout;

import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import bp0.k;
import e0.g;
import e0.t0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;
import p0.d;

/* compiled from: Layout.kt */
final class LayoutKt$materializerOf$1 extends Lambda implements q<t0<ComposeUiNode>, g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f6731a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LayoutKt$materializerOf$1(d dVar) {
        super(3);
        this.f6731a = dVar;
    }

    public final void a(g gVar, g gVar2, int i11) {
        p.j(gVar, "$this$null");
        d e11 = ComposedModifierKt.e(gVar2, this.f6731a);
        gVar.E(509942095);
        Updater.c(Updater.a(gVar), e11, ComposeUiNode.J.e());
        gVar.P();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a(((t0) obj).f(), (g) obj2, ((Number) obj3).intValue());
        return k.f22762a;
    }
}
