package androidx.compose.ui.platform;

import android.view.RenderNode;
import kotlin.jvm.internal.p;

/* compiled from: RenderNodeApi23.android.kt */
final class b1 {

    /* renamed from: a  reason: collision with root package name */
    public static final b1 f7273a = new b1();

    private b1() {
    }

    public final int a(RenderNode renderNode) {
        p.j(renderNode, "renderNode");
        return renderNode.getAmbientShadowColor();
    }

    public final int b(RenderNode renderNode) {
        p.j(renderNode, "renderNode");
        return renderNode.getSpotShadowColor();
    }

    public final void c(RenderNode renderNode, int i11) {
        p.j(renderNode, "renderNode");
        renderNode.setAmbientShadowColor(i11);
    }

    public final void d(RenderNode renderNode, int i11) {
        p.j(renderNode, "renderNode");
        renderNode.setSpotShadowColor(i11);
    }
}
