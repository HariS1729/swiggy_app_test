package androidx.compose.material;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: Swipeable.kt */
final class SwipeableState$latestNonEmptyAnchorsFlow$1 extends Lambda implements a<Map<Float, ? extends T>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SwipeableState<T> f5530a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableState$latestNonEmptyAnchorsFlow$1(SwipeableState<T> swipeableState) {
        super(0);
        this.f5530a = swipeableState;
    }

    /* renamed from: a */
    public final Map<Float, T> invoke() {
        return this.f5530a.l();
    }
}
