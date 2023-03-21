package androidx.compose.ui.platform;

import android.view.RenderNode;
import kotlin.jvm.internal.p;

/* compiled from: RenderNodeApi23.android.kt */
final class z0 {

    /* renamed from: a  reason: collision with root package name */
    public static final z0 f7400a = new z0();

    private z0() {
    }

    public final void a(RenderNode renderNode) {
        p.j(renderNode, "renderNode");
        renderNode.destroyDisplayListData();
    }
}
