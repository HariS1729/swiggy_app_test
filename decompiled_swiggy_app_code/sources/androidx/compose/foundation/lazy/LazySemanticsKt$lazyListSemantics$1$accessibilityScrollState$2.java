package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.Lambda;
import lp0.a;
import w.k;

/* compiled from: LazySemantics.kt */
final class LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$2 extends Lambda implements a<Float> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LazyListState f4077a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k f4078b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$2(LazyListState lazyListState, k kVar) {
        super(0);
        this.f4077a = lazyListState;
        this.f4078b = kVar;
    }

    /* renamed from: a */
    public final Float invoke() {
        float f11;
        float f12;
        if (this.f4077a.h()) {
            f12 = (float) this.f4078b.getItemCount();
            f11 = 1.0f;
        } else {
            f12 = (float) this.f4077a.i();
            f11 = ((float) this.f4077a.j()) / 100000.0f;
        }
        return Float.valueOf(f12 + f11);
    }
}
