package androidx.compose.animation;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import bp0.k;
import d2.p;
import defpackage.v1;
import p0.d;

/* compiled from: AnimationModifier.kt */
public final class AnimationModifierKt {
    public static final d a(d dVar, v1.a0<p> a0Var, lp0.p<? super p, ? super p, k> pVar) {
        kotlin.jvm.internal.p.j(dVar, "<this>");
        kotlin.jvm.internal.p.j(a0Var, "animationSpec");
        return ComposedModifierKt.c(dVar, InspectableValueKt.c() ? new AnimationModifierKt$animateContentSize$$inlined$debugInspectorInfo$1(a0Var, pVar) : InspectableValueKt.a(), new AnimationModifierKt$animateContentSize$2(pVar, a0Var));
    }

    public static /* synthetic */ d b(d dVar, v1.a0 a0Var, lp0.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            a0Var = v1.h.g(0.0f, 0.0f, (Object) null, 7, (Object) null);
        }
        if ((i11 & 2) != 0) {
            pVar = null;
        }
        return a(dVar, a0Var, pVar);
    }
}
