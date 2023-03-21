package androidx.compose.ui.viewinterop;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: AndroidView.android.kt */
final class ViewFactoryHolder$updateBlock$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ViewFactoryHolder<T> f7762a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ViewFactoryHolder$updateBlock$1(ViewFactoryHolder<T> viewFactoryHolder) {
        super(0);
        this.f7762a = viewFactoryHolder;
    }

    public final void invoke() {
        T typedView$ui_release = this.f7762a.getTypedView$ui_release();
        if (typedView$ui_release != null) {
            this.f7762a.getUpdateBlock().invoke(typedView$ui_release);
        }
    }
}
