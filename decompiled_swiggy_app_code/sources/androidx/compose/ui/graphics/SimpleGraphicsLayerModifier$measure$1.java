package androidx.compose.ui.graphics;

import bp0.k;
import i1.e0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: GraphicsLayerModifier.kt */
final class SimpleGraphicsLayerModifier$measure$1 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e0 f6440a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SimpleGraphicsLayerModifier f6441b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SimpleGraphicsLayerModifier$measure$1(e0 e0Var, SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
        super(1);
        this.f6440a = e0Var;
        this.f6441b = simpleGraphicsLayerModifier;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        e0.a.v(aVar, this.f6440a, 0, 0, 0.0f, this.f6441b.q, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
