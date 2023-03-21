package androidx.compose.material;

import androidx.compose.animation.core.Transition;
import defpackage.v1;
import e0.g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;

/* compiled from: TextFieldImpl.kt */
final class TextFieldTransitionScope$Transition$placeholderOpacity$2 extends Lambda implements q<Transition.b<InputPhase>, g, Integer, v1.a0<Float>> {

    /* renamed from: a  reason: collision with root package name */
    public static final TextFieldTransitionScope$Transition$placeholderOpacity$2 f5726a = new TextFieldTransitionScope$Transition$placeholderOpacity$2();

    TextFieldTransitionScope$Transition$placeholderOpacity$2() {
        super(3);
    }

    public final v1.a0<Float> a(Transition.b<InputPhase> bVar, g gVar, int i11) {
        v1.a0<Float> a0Var;
        p.j(bVar, "$this$animateFloat");
        gVar.E(337281409);
        InputPhase inputPhase = InputPhase.Focused;
        InputPhase inputPhase2 = InputPhase.UnfocusedEmpty;
        if (bVar.a(inputPhase, inputPhase2)) {
            a0Var = v1.h.i(67, 0, v1.z.c(), 2, (Object) null);
        } else if (bVar.a(inputPhase2, inputPhase) || bVar.a(InputPhase.UnfocusedNotEmpty, inputPhase2)) {
            a0Var = v1.h.h(83, 67, v1.z.c());
        } else {
            a0Var = v1.h.g(0.0f, 0.0f, (Object) null, 7, (Object) null);
        }
        gVar.P();
        return a0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((Transition.b) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
