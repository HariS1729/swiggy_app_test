package androidx.compose.ui.platform;

import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import kotlin.jvm.internal.p;
import u0.d1;

/* compiled from: RenderNodeApi29.android.kt */
final class y0 {

    /* renamed from: a  reason: collision with root package name */
    public static final y0 f7396a = new y0();

    private y0() {
    }

    public final void a(RenderNode renderNode, d1 d1Var) {
        p.j(renderNode, "renderNode");
        renderNode.setRenderEffect((RenderEffect) null);
    }
}
