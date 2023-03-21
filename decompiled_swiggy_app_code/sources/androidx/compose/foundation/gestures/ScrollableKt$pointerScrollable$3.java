package androidx.compose.foundation.gestures;

import e0.d1;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: Scrollable.kt */
final class ScrollableKt$pointerScrollable$3 extends Lambda implements a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d1<ScrollingLogic> f3494a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollableKt$pointerScrollable$3(d1<ScrollingLogic> d1Var) {
        super(0);
        this.f3494a = d1Var;
    }

    /* renamed from: a */
    public final Boolean invoke() {
        return Boolean.valueOf(this.f3494a.getValue().i());
    }
}
