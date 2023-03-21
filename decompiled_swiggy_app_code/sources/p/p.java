package p;

import android.view.ViewConfiguration;
import androidx.compose.ui.platform.CompositionLocalsKt;
import d2.e;
import defpackage.v1;
import e0.g;

/* compiled from: SplineBasedFloatDecayAnimationSpec.android.kt */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private static final float f16014a = ViewConfiguration.getScrollFriction();

    public static final float a() {
        return f16014a;
    }

    public static final <T> v1.u<T> b(g gVar, int i11) {
        gVar.E(-903108490);
        e eVar = (e) gVar.z(CompositionLocalsKt.e());
        Float valueOf = Float.valueOf(eVar.getDensity());
        gVar.E(-3686930);
        boolean k = gVar.k(valueOf);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            F = v1.w.a(new o(eVar));
            gVar.y(F);
        }
        gVar.P();
        v1.u<T> uVar = (v1.u) F;
        gVar.P();
        return uVar;
    }
}
