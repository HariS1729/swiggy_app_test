package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.internal.p;
import p0.d;

/* compiled from: AspectRatio.kt */
public final class AspectRatioKt {
    public static final d a(d dVar, float f11, boolean z11) {
        p.j(dVar, "<this>");
        return dVar.N(new AspectRatioModifier(f11, z11, InspectableValueKt.c() ? new AspectRatioKt$aspectRatio$$inlined$debugInspectorInfo$1(f11, z11) : InspectableValueKt.a()));
    }

    public static /* synthetic */ d b(d dVar, float f11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return a(dVar, f11, z11);
    }
}
