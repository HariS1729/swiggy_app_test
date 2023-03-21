package androidx.compose.ui.platform;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.o;
import androidx.lifecycle.r;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l1 implements o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractComposeView f7320a;

    public /* synthetic */ l1(AbstractComposeView abstractComposeView) {
        this.f7320a = abstractComposeView;
    }

    public final void b(r rVar, Lifecycle.Event event) {
        ViewCompositionStrategy_androidKt.d(this.f7320a, rVar, event);
    }
}
