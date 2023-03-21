package androidx.compose.foundation;

import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: Scroll.kt */
final class ScrollKt$scroll$2$semantics$1$accessibilityScrollState$1 extends Lambda implements a<Float> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ScrollState f3152a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollKt$scroll$2$semantics$1$accessibilityScrollState$1(ScrollState scrollState) {
        super(0);
        this.f3152a = scrollState;
    }

    /* renamed from: a */
    public final Float invoke() {
        return Float.valueOf((float) this.f3152a.j());
    }
}
