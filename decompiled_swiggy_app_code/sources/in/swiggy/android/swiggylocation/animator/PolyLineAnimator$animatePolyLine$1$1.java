package in.swiggy.android.swiggylocation.animator;

import android.animation.ValueAnimator;
import bp0.k;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import rj.i;

/* compiled from: PolyLineAnimator.kt */
final class PolyLineAnimator$animatePolyLine$1$1 extends Lambda implements p<i, List<? extends LatLng>, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ValueAnimator f18800a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PolyLineAnimator$animatePolyLine$1$1(ValueAnimator valueAnimator) {
        super(2);
        this.f18800a = valueAnimator;
    }

    public final void a(i iVar, List<LatLng> list) {
        kotlin.jvm.internal.p.j(iVar, "polyline");
        kotlin.jvm.internal.p.j(list, "points");
        List<LatLng> a11 = iVar.a();
        int size = a11.size();
        Object animatedValue = this.f18800a.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = (((Integer) animatedValue).intValue() * list.size()) / 100;
        if (size < intValue) {
            a11.addAll(list.subList(size, intValue));
            iVar.h(a11);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((i) obj, (List) obj2);
        return k.f22762a;
    }
}
