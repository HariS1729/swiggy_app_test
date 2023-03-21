package androidx.compose.ui.focus;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import bp0.k;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.d;
import s0.r;

/* compiled from: FocusChangedModifier.kt */
public final class FocusChangedModifierKt {
    public static final d a(d dVar, l<? super r, k> lVar) {
        p.j(dVar, "<this>");
        p.j(lVar, "onFocusChanged");
        return ComposedModifierKt.c(dVar, InspectableValueKt.c() ? new FocusChangedModifierKt$onFocusChanged$$inlined$debugInspectorInfo$1(lVar) : InspectableValueKt.a(), new FocusChangedModifierKt$onFocusChanged$2(lVar));
    }
}
