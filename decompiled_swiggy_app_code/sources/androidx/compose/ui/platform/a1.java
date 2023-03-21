package androidx.compose.ui.platform;

import android.view.RenderNode;
import kotlin.jvm.internal.p;

/* compiled from: RenderNodeApi23.android.kt */
final class a1 {

    /* renamed from: a  reason: collision with root package name */
    public static final a1 f7262a = new a1();

    private a1() {
    }

    public final void a(RenderNode renderNode) {
        p.j(renderNode, "renderNode");
        renderNode.discardDisplayList();
    }
}
