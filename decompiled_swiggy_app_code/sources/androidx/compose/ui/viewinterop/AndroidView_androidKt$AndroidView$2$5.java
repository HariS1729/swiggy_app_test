package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import bp0.k;
import k1.t;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import lp0.p;

/* compiled from: AndroidView.android.kt */
final class AndroidView_androidKt$AndroidView$2$5 extends Lambda implements p<LayoutNode, l<? super T, ? extends k>, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t<ViewFactoryHolder<T>> f7746a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidView_androidKt$AndroidView$2$5(t<ViewFactoryHolder<T>> tVar) {
        super(2);
        this.f7746a = tVar;
    }

    public final void a(LayoutNode layoutNode, l<? super T, k> lVar) {
        kotlin.jvm.internal.p.j(layoutNode, "$this$set");
        kotlin.jvm.internal.p.j(lVar, "it");
        ViewFactoryHolder<T> a11 = this.f7746a.a();
        kotlin.jvm.internal.p.g(a11);
        a11.setUpdateBlock(lVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((LayoutNode) obj, (l) obj2);
        return k.f22762a;
    }
}
