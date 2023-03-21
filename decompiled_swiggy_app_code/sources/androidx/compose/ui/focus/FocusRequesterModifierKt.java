package androidx.compose.ui.focus;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import j1.c;
import j1.f;
import kotlin.jvm.internal.p;
import p0.d;
import s0.o;
import s0.q;

/* compiled from: FocusRequesterModifier.kt */
public final class FocusRequesterModifierKt {

    /* renamed from: a  reason: collision with root package name */
    private static final f<q> f6396a = c.a(FocusRequesterModifierKt$ModifierLocalFocusRequester$1.f6398a);

    public static final d a(d dVar, o oVar) {
        p.j(dVar, "<this>");
        p.j(oVar, "focusRequester");
        return ComposedModifierKt.c(dVar, InspectableValueKt.c() ? new FocusRequesterModifierKt$focusRequester$$inlined$debugInspectorInfo$1(oVar) : InspectableValueKt.a(), new FocusRequesterModifierKt$focusRequester$2(oVar));
    }

    public static final f<q> b() {
        return f6396a;
    }
}
