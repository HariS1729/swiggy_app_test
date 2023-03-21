package androidx.compose.ui.graphics;

import bp0.k;
import i1.e0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: GraphicsLayerModifier.kt */
final class BlockGraphicsLayerModifier$measure$1 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e0 f6412a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BlockGraphicsLayerModifier f6413b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BlockGraphicsLayerModifier$measure$1(e0 e0Var, BlockGraphicsLayerModifier blockGraphicsLayerModifier) {
        super(1);
        this.f6412a = e0Var;
        this.f6413b = blockGraphicsLayerModifier;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        e0.a.v(aVar, this.f6412a, 0, 0, 0.0f, this.f6413b.f6411b, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
