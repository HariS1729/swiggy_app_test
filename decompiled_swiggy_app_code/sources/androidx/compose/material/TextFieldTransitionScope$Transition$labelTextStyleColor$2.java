package androidx.compose.material;

import androidx.compose.animation.core.Transition;
import defpackage.v1;
import e0.g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;
import u0.d0;

/* compiled from: TextFieldImpl.kt */
final class TextFieldTransitionScope$Transition$labelTextStyleColor$2 extends Lambda implements q<Transition.b<InputPhase>, g, Integer, v1.a0<d0>> {

    /* renamed from: a  reason: collision with root package name */
    public static final TextFieldTransitionScope$Transition$labelTextStyleColor$2 f5725a = new TextFieldTransitionScope$Transition$labelTextStyleColor$2();

    TextFieldTransitionScope$Transition$labelTextStyleColor$2() {
        super(3);
    }

    public final v1.a0<d0> a(Transition.b<InputPhase> bVar, g gVar, int i11) {
        p.j(bVar, "$this$animateColor");
        gVar.E(337282516);
        v1.p0 i12 = v1.h.i(150, 0, (v1.y) null, 6, (Object) null);
        gVar.P();
        return i12;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((Transition.b) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
