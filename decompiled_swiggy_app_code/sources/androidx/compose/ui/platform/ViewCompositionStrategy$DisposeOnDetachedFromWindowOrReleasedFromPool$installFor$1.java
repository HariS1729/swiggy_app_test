package androidx.compose.ui.platform;

import androidx.compose.ui.platform.ViewCompositionStrategy;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import u2.b;

/* compiled from: ViewCompositionStrategy.android.kt */
final class ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AbstractComposeView f7179a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.a f7180b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b f7181c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1(AbstractComposeView abstractComposeView, ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.a aVar, b bVar) {
        super(0);
        this.f7179a = abstractComposeView;
        this.f7180b = aVar;
        this.f7181c = bVar;
    }

    public final void invoke() {
        this.f7179a.removeOnAttachStateChangeListener(this.f7180b);
        u2.a.e(this.f7179a, this.f7181c);
    }
}
