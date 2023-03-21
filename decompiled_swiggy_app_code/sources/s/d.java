package s;

import androidx.compose.foundation.gestures.Orientation;
import d2.b;
import kotlin.jvm.internal.p;

/* compiled from: CheckScrollableContainerConstraints.kt */
public final class d {
    public static final void a(long j, Orientation orientation) {
        p.j(orientation, "orientation");
        boolean z11 = true;
        if (orientation == Orientation.Vertical) {
            if (b.m(j) == Integer.MAX_VALUE) {
                z11 = false;
            }
            if (!z11) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
            }
            return;
        }
        if (b.n(j) == Integer.MAX_VALUE) {
            z11 = false;
        }
        if (!z11) {
            throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
        }
    }
}
