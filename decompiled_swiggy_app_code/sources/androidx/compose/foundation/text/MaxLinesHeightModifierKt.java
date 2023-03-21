package androidx.compose.foundation.text;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.internal.p;
import p0.d;
import p1.c0;

/* compiled from: MaxLinesHeightModifier.kt */
public final class MaxLinesHeightModifierKt {
    public static final d a(d dVar, int i11, c0 c0Var) {
        p.j(dVar, "<this>");
        p.j(c0Var, "textStyle");
        return ComposedModifierKt.c(dVar, InspectableValueKt.c() ? new MaxLinesHeightModifierKt$maxLinesHeight$$inlined$debugInspectorInfo$1(i11, c0Var) : InspectableValueKt.a(), new MaxLinesHeightModifierKt$maxLinesHeight$2(i11, c0Var));
    }
}
