package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectableValueKt;
import d2.e;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.d;

/* compiled from: Offset.kt */
public final class OffsetKt {
    public static final d a(d dVar, l<? super e, d2.l> lVar) {
        p.j(dVar, "<this>");
        p.j(lVar, "offset");
        return dVar.N(new OffsetPxModifier(lVar, true, InspectableValueKt.c() ? new OffsetKt$offset$$inlined$debugInspectorInfo$1(lVar) : InspectableValueKt.a()));
    }
}
