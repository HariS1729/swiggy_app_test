package androidx.compose.ui.input.rotary;

import androidx.compose.ui.platform.InspectableValueKt;
import c1.b;
import h1.a;
import j1.c;
import j1.f;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.d;

/* compiled from: RotaryInputModifier.kt */
public final class RotaryInputModifierKt {

    /* renamed from: a  reason: collision with root package name */
    private static final f<b<a>> f6711a = c.a(RotaryInputModifierKt$ModifierLocalRotaryScrollParent$1.f6713a);

    private static final l<c1.a, Boolean> a(l<? super a, Boolean> lVar) {
        return new RotaryInputModifierKt$focusAwareCallback$1(lVar);
    }

    public static final f<b<a>> b() {
        return f6711a;
    }

    public static final d c(d dVar, l<? super a, Boolean> lVar) {
        p.j(dVar, "<this>");
        p.j(lVar, "onRotaryScrollEvent");
        l rotaryInputModifierKt$onRotaryScrollEvent$$inlined$debugInspectorInfo$1 = InspectableValueKt.c() ? new RotaryInputModifierKt$onRotaryScrollEvent$$inlined$debugInspectorInfo$1(lVar) : InspectableValueKt.a();
        d.a aVar = d.f16037h0;
        return InspectableValueKt.b(dVar, rotaryInputModifierKt$onRotaryScrollEvent$$inlined$debugInspectorInfo$1, new b(a(lVar), (l<? super c1.a, Boolean>) null, f6711a));
    }
}
