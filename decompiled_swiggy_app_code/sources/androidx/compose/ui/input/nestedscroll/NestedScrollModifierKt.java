package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import e1.b;
import kotlin.jvm.internal.p;
import p0.d;

/* compiled from: NestedScrollModifier.kt */
public final class NestedScrollModifierKt {
    public static final d a(d dVar, b bVar, NestedScrollDispatcher nestedScrollDispatcher) {
        p.j(dVar, "<this>");
        p.j(bVar, "connection");
        return ComposedModifierKt.c(dVar, InspectableValueKt.c() ? new NestedScrollModifierKt$nestedScroll$$inlined$debugInspectorInfo$1(bVar, nestedScrollDispatcher) : InspectableValueKt.a(), new NestedScrollModifierKt$nestedScroll$2(nestedScrollDispatcher, bVar));
    }
}
