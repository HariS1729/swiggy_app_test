package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import bp0.k;
import k1.t;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p0.d;

/* compiled from: AndroidView.android.kt */
final class AndroidView_androidKt$AndroidView$2$1 extends Lambda implements p<LayoutNode, d, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t<ViewFactoryHolder<T>> f7742a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidView_androidKt$AndroidView$2$1(t<ViewFactoryHolder<T>> tVar) {
        super(2);
        this.f7742a = tVar;
    }

    public final void a(LayoutNode layoutNode, d dVar) {
        kotlin.jvm.internal.p.j(layoutNode, "$this$set");
        kotlin.jvm.internal.p.j(dVar, "it");
        ViewFactoryHolder<T> a11 = this.f7742a.a();
        kotlin.jvm.internal.p.g(a11);
        a11.setModifier(dVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((LayoutNode) obj, (d) obj2);
        return k.f22762a;
    }
}
