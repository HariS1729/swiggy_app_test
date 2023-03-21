package androidx.compose.ui.semantics;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import bp0.k;
import kotlin.jvm.internal.p;
import lp0.l;
import n1.q;
import p0.d;

/* compiled from: SemanticsModifier.kt */
public final class SemanticsModifierKt {
    public static final d a(d dVar, l<? super q, k> lVar) {
        p.j(dVar, "<this>");
        p.j(lVar, "properties");
        return ComposedModifierKt.c(dVar, InspectableValueKt.c() ? new SemanticsModifierKt$clearAndSetSemantics$$inlined$debugInspectorInfo$1(lVar) : InspectableValueKt.a(), new SemanticsModifierKt$clearAndSetSemantics$2(lVar));
    }

    public static final d b(d dVar, boolean z11, l<? super q, k> lVar) {
        p.j(dVar, "<this>");
        p.j(lVar, "properties");
        return ComposedModifierKt.c(dVar, InspectableValueKt.c() ? new SemanticsModifierKt$semantics$$inlined$debugInspectorInfo$1(z11, lVar) : InspectableValueKt.a(), new SemanticsModifierKt$semantics$2(z11, lVar));
    }

    public static /* synthetic */ d c(d dVar, boolean z11, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return b(dVar, z11, lVar);
    }
}
