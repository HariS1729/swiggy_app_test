package androidx.compose.ui.input.pointer;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import f1.r;
import in.swiggy.android.tejas.feature.menu.MenuConstants;
import kotlin.jvm.internal.p;
import p0.d;

/* compiled from: PointerIcon.kt */
public final class PointerIconKt {
    public static final d a(d dVar, r rVar, boolean z11) {
        p.j(dVar, "<this>");
        p.j(rVar, MenuConstants.MENU_OFFER_ICON);
        return ComposedModifierKt.c(dVar, InspectableValueKt.c() ? new PointerIconKt$pointerHoverIcon$$inlined$debugInspectorInfo$1(rVar, z11) : InspectableValueKt.a(), new PointerIconKt$pointerHoverIcon$2(rVar, z11));
    }

    public static /* synthetic */ d b(d dVar, r rVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return a(dVar, rVar, z11);
    }
}
