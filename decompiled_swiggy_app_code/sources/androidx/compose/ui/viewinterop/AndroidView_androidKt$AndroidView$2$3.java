package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import androidx.lifecycle.r;
import bp0.k;
import k1.t;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: AndroidView.android.kt */
final class AndroidView_androidKt$AndroidView$2$3 extends Lambda implements p<LayoutNode, r, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t<ViewFactoryHolder<T>> f7744a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidView_androidKt$AndroidView$2$3(t<ViewFactoryHolder<T>> tVar) {
        super(2);
        this.f7744a = tVar;
    }

    public final void a(LayoutNode layoutNode, r rVar) {
        kotlin.jvm.internal.p.j(layoutNode, "$this$set");
        kotlin.jvm.internal.p.j(rVar, "it");
        ViewFactoryHolder<T> a11 = this.f7744a.a();
        kotlin.jvm.internal.p.g(a11);
        a11.setLifecycleOwner(rVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((LayoutNode) obj, (r) obj2);
        return k.f22762a;
    }
}
