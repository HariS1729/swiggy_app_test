package androidx.compose.foundation;

import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: Scroll.kt */
final class ScrollState$scrollableState$1 extends Lambda implements l<Float, Float> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ScrollState f3163a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollState$scrollableState$1(ScrollState scrollState) {
        super(1);
        this.f3163a = scrollState;
    }

    public final Float a(float f11) {
        float j = ((float) this.f3163a.j()) + f11 + this.f3163a.f3159d;
        float l11 = l.l(j, 0.0f, (float) this.f3163a.i());
        boolean z11 = !(j == l11);
        float j11 = l11 - ((float) this.f3163a.j());
        int c11 = c.c(j11);
        ScrollState scrollState = this.f3163a;
        scrollState.l(scrollState.j() + c11);
        this.f3163a.f3159d = j11 - ((float) c11);
        if (z11) {
            f11 = j11;
        }
        return Float.valueOf(f11);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).floatValue());
    }
}
