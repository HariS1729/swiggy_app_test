package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: LazySemantics.kt */
final class LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$1 extends Lambda implements a<Float> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LazyListState f4076a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$1(LazyListState lazyListState) {
        super(0);
        this.f4076a = lazyListState;
    }

    /* renamed from: a */
    public final Float invoke() {
        return Float.valueOf(((float) this.f4076a.i()) + (((float) this.f4076a.j()) / 100000.0f));
    }
}
