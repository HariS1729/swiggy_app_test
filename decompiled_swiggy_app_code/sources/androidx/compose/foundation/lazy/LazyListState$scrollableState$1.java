package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: LazyListState.kt */
final class LazyListState$scrollableState$1 extends Lambda implements l<Float, Float> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LazyListState f4067a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyListState$scrollableState$1(LazyListState lazyListState) {
        super(1);
        this.f4067a = lazyListState;
    }

    public final Float a(float f11) {
        return Float.valueOf(-this.f4067a.t(-f11));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).floatValue());
    }
}
