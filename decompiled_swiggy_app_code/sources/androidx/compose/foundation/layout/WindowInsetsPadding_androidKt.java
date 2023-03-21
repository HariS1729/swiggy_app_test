package androidx.compose.foundation.layout;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.internal.p;
import p0.d;

/* compiled from: WindowInsetsPadding.android.kt */
public final class WindowInsetsPadding_androidKt {
    public static final d a(d dVar) {
        p.j(dVar, "<this>");
        return ComposedModifierKt.c(dVar, InspectableValueKt.c() ? new WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.a(), new WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$windowInsetsPadding$1());
    }

    public static final d b(d dVar) {
        p.j(dVar, "<this>");
        return ComposedModifierKt.c(dVar, InspectableValueKt.c() ? new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.a(), new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1());
    }
}
