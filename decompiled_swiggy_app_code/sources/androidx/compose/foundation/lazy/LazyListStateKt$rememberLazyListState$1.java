package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: LazyListState.kt */
final class LazyListStateKt$rememberLazyListState$1 extends Lambda implements a<LazyListState> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f4068a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f4069b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyListStateKt$rememberLazyListState$1(int i11, int i12) {
        super(0);
        this.f4068a = i11;
        this.f4069b = i12;
    }

    /* renamed from: a */
    public final LazyListState invoke() {
        return new LazyListState(this.f4068a, this.f4069b);
    }
}
