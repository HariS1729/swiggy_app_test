package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.node.LayoutNode;
import k1.t;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import lp0.l;
import m0.b;

/* compiled from: AndroidView.android.kt */
final class AndroidView_androidKt$AndroidView$1 extends Lambda implements a<LayoutNode> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f7735a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.runtime.a f7736b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NestedScrollDispatcher f7737c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l<Context, T> f7738d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ b f7739e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f7740f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ t<ViewFactoryHolder<T>> f7741g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidView_androidKt$AndroidView$1(Context context, androidx.compose.runtime.a aVar, NestedScrollDispatcher nestedScrollDispatcher, l<? super Context, ? extends T> lVar, b bVar, String str, t<ViewFactoryHolder<T>> tVar) {
        super(0);
        this.f7735a = context;
        this.f7736b = aVar;
        this.f7737c = nestedScrollDispatcher;
        this.f7738d = lVar;
        this.f7739e = bVar;
        this.f7740f = str;
        this.f7741g = tVar;
    }

    /* renamed from: a */
    public final LayoutNode invoke() {
        View typedView$ui_release;
        ViewFactoryHolder viewFactoryHolder = new ViewFactoryHolder(this.f7735a, this.f7736b, this.f7737c);
        viewFactoryHolder.setFactory(this.f7738d);
        b bVar = this.f7739e;
        SparseArray sparseArray = null;
        Object c11 = bVar != null ? bVar.c(this.f7740f) : null;
        if (c11 instanceof SparseArray) {
            sparseArray = (SparseArray) c11;
        }
        if (!(sparseArray == null || (typedView$ui_release = viewFactoryHolder.getTypedView$ui_release()) == null)) {
            typedView$ui_release.restoreHierarchyState(sparseArray);
        }
        this.f7741g.b(viewFactoryHolder);
        return viewFactoryHolder.getLayoutNode();
    }
}
