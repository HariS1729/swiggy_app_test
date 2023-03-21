package androidx.compose.foundation.gestures;

import e0.d1;
import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: ScrollableState.kt */
final class ScrollableStateKt$rememberScrollableState$1$1 extends Lambda implements l<Float, Float> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d1<l<Float, Float>> f3515a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollableStateKt$rememberScrollableState$1$1(d1<? extends l<? super Float, Float>> d1Var) {
        super(1);
        this.f3515a = d1Var;
    }

    public final Float a(float f11) {
        return (Float) this.f3515a.getValue().invoke(Float.valueOf(f11));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).floatValue());
    }
}
