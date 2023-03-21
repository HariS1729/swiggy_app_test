package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import bp0.k;
import d2.e;
import k1.t;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: AndroidView.android.kt */
final class AndroidView_androidKt$AndroidView$2$2 extends Lambda implements p<LayoutNode, e, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t<ViewFactoryHolder<T>> f7743a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidView_androidKt$AndroidView$2$2(t<ViewFactoryHolder<T>> tVar) {
        super(2);
        this.f7743a = tVar;
    }

    public final void a(LayoutNode layoutNode, e eVar) {
        kotlin.jvm.internal.p.j(layoutNode, "$this$set");
        kotlin.jvm.internal.p.j(eVar, "it");
        ViewFactoryHolder<T> a11 = this.f7743a.a();
        kotlin.jvm.internal.p.g(a11);
        a11.setDensity(eVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((LayoutNode) obj, (e) obj2);
        return k.f22762a;
    }
}
