package androidx.compose.foundation;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.internal.p;
import p0.d;
import u.k;

/* compiled from: Hoverable.kt */
public final class HoverableKt {
    public static final d a(d dVar, k kVar, boolean z11) {
        p.j(dVar, "<this>");
        p.j(kVar, "interactionSource");
        return ComposedModifierKt.c(dVar, InspectableValueKt.c() ? new HoverableKt$hoverable$$inlined$debugInspectorInfo$1(kVar, z11) : InspectableValueKt.a(), new HoverableKt$hoverable$2(kVar, z11));
    }
}
