package androidx.compose.ui.platform;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import bp0.k;
import kotlin.jvm.internal.p;
import lp0.a;

/* compiled from: ViewCompositionStrategy.android.kt */
public final class ViewCompositionStrategy_androidKt {
    /* access modifiers changed from: private */
    public static final a<k> c(AbstractComposeView abstractComposeView, Lifecycle lifecycle) {
        if (lifecycle.b().compareTo(Lifecycle.State.DESTROYED) > 0) {
            l1 l1Var = new l1(abstractComposeView);
            lifecycle.a(l1Var);
            return new ViewCompositionStrategy_androidKt$installForLifecycle$2(lifecycle, l1Var);
        }
        throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + lifecycle + "is already destroyed").toString());
    }

    /* access modifiers changed from: private */
    public static final void d(AbstractComposeView abstractComposeView, r rVar, Lifecycle.Event event) {
        p.j(abstractComposeView, "$view");
        p.j(rVar, "<anonymous parameter 0>");
        p.j(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            abstractComposeView.e();
        }
    }
}
