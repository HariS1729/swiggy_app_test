package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.r1;
import androidx.compose.ui.platform.s1;
import bp0.k;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: AndroidView.android.kt */
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements s1 {
    private T t;

    /* renamed from: u  reason: collision with root package name */
    private l<? super Context, ? extends T> f7761u;
    private l<? super T, k> v = AndroidView_androidKt.b();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewFactoryHolder(Context context, a aVar, NestedScrollDispatcher nestedScrollDispatcher) {
        super(context, aVar, nestedScrollDispatcher);
        p.j(context, LogCategory.CONTEXT);
        p.j(nestedScrollDispatcher, "dispatcher");
    }

    public final l<Context, T> getFactory() {
        return this.f7761u;
    }

    public /* bridge */ /* synthetic */ AbstractComposeView getSubCompositionView() {
        return r1.a(this);
    }

    public final T getTypedView$ui_release() {
        return this.t;
    }

    public final l<T, k> getUpdateBlock() {
        return this.v;
    }

    public View getViewRoot() {
        return this;
    }

    public final void setFactory(l<? super Context, ? extends T> lVar) {
        this.f7761u = lVar;
        if (lVar != null) {
            Context context = getContext();
            p.i(context, LogCategory.CONTEXT);
            T t11 = (View) lVar.invoke(context);
            this.t = t11;
            setView$ui_release(t11);
        }
    }

    public final void setTypedView$ui_release(T t11) {
        this.t = t11;
    }

    public final void setUpdateBlock(l<? super T, k> lVar) {
        p.j(lVar, "value");
        this.v = lVar;
        setUpdate(new ViewFactoryHolder$updateBlock$1(this));
    }
}
