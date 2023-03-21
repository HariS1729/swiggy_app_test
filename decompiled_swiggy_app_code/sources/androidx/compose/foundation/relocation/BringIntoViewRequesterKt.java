package androidx.compose.foundation.relocation;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.internal.p;
import y.d;

/* compiled from: BringIntoViewRequester.kt */
public final class BringIntoViewRequesterKt {
    public static final d a() {
        return new BringIntoViewRequesterImpl();
    }

    public static final p0.d b(p0.d dVar, d dVar2) {
        p.j(dVar, "<this>");
        p.j(dVar2, "bringIntoViewRequester");
        return ComposedModifierKt.c(dVar, InspectableValueKt.c() ? new BringIntoViewRequesterKt$bringIntoViewRequester$$inlined$debugInspectorInfo$1(dVar2) : InspectableValueKt.a(), new BringIntoViewRequesterKt$bringIntoViewRequester$2(dVar2));
    }
}
