package androidx.compose.ui.graphics;

import androidx.compose.ui.platform.n0;
import bp0.k;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: InspectableValue.kt */
public final class GraphicsLayerModifierKt$graphicsLayer$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l f6414a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GraphicsLayerModifierKt$graphicsLayer$$inlined$debugInspectorInfo$1(l lVar) {
        super(1);
        this.f6414a = lVar;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("graphicsLayer");
        n0Var.a().b(RenderingDetails.TYPE_BLOCK, this.f6414a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
