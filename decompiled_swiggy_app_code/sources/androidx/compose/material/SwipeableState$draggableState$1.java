package androidx.compose.material;

import bp0.k;
import c0.s;
import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: Swipeable.kt */
final class SwipeableState$draggableState$1 extends Lambda implements l<Float, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SwipeableState<T> f5529a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableState$draggableState$1(SwipeableState<T> swipeableState) {
        super(1);
        this.f5529a = swipeableState;
    }

    public final void a(float f11) {
        float floatValue = ((Number) this.f5529a.f5500g.getValue()).floatValue() + f11;
        float l11 = l.l(floatValue, this.f5529a.r(), this.f5529a.q());
        float f12 = floatValue - l11;
        s t = this.f5529a.t();
        this.f5529a.f5498e.setValue(Float.valueOf(l11 + (t == null ? 0.0f : t.a(f12))));
        this.f5529a.f5499f.setValue(Float.valueOf(f12));
        this.f5529a.f5500g.setValue(Float.valueOf(floatValue));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a(((Number) obj).floatValue());
        return k.f22762a;
    }
}
