package androidx.compose.material;

import androidx.compose.animation.core.Transition;
import defpackage.v1;
import e0.g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;

/* compiled from: TextFieldImpl.kt */
final class TextFieldTransitionScope$Transition$labelProgress$2 extends Lambda implements q<Transition.b<InputPhase>, g, Integer, v1.a0<Float>> {

    /* renamed from: a  reason: collision with root package name */
    public static final TextFieldTransitionScope$Transition$labelProgress$2 f5724a = new TextFieldTransitionScope$Transition$labelProgress$2();

    TextFieldTransitionScope$Transition$labelProgress$2() {
        super(3);
    }

    public final v1.a0<Float> a(Transition.b<InputPhase> bVar, g gVar, int i11) {
        p.j(bVar, "$this$animateFloat");
        gVar.E(337280605);
        v1.p0 i12 = v1.h.i(150, 0, (v1.y) null, 6, (Object) null);
        gVar.P();
        return i12;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((Transition.b) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
