package c;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import bp0.k;
import e0.g;
import kotlin.jvm.internal.i;
import lp0.p;

/* compiled from: ComponentActivity.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final ViewGroup.LayoutParams f12664a = new ViewGroup.LayoutParams(-2, -2);

    public static final void a(ComponentActivity componentActivity, androidx.compose.runtime.a aVar, p<? super g, ? super Integer, k> pVar) {
        kotlin.jvm.internal.p.j(componentActivity, "<this>");
        kotlin.jvm.internal.p.j(pVar, "content");
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(16908290)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(aVar);
            composeView.setContent(pVar);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity, (AttributeSet) null, 0, 6, (i) null);
        composeView2.setParentCompositionContext(aVar);
        composeView2.setContent(pVar);
        c(componentActivity);
        componentActivity.setContentView(composeView2, f12664a);
    }

    public static /* synthetic */ void b(ComponentActivity componentActivity, androidx.compose.runtime.a aVar, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = null;
        }
        a(componentActivity, aVar, pVar);
    }

    private static final void c(ComponentActivity componentActivity) {
        View decorView = componentActivity.getWindow().getDecorView();
        kotlin.jvm.internal.p.i(decorView, "window.decorView");
        if (q0.a(decorView) == null) {
            q0.b(decorView, componentActivity);
        }
        if (r0.a(decorView) == null) {
            r0.b(decorView, componentActivity);
        }
        if (ViewTreeSavedStateRegistryOwner.a(decorView) == null) {
            ViewTreeSavedStateRegistryOwner.b(decorView, componentActivity);
        }
    }
}
