package androidx.compose.ui.platform;

import androidx.compose.ui.platform.ViewCompositionStrategy;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: ViewCompositionStrategy.android.kt */
final class ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AbstractComposeView f7185a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.a f7186b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1(AbstractComposeView abstractComposeView, ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.a aVar) {
        super(0);
        this.f7185a = abstractComposeView;
        this.f7186b = aVar;
    }

    public final void invoke() {
        this.f7185a.removeOnAttachStateChangeListener(this.f7186b);
    }
}
