package androidx.compose.ui.input.key;

import androidx.compose.ui.platform.InspectableValueKt;
import d1.b;
import d1.e;
import j1.c;
import j1.f;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.d;

/* compiled from: KeyInputModifier.kt */
public final class KeyInputModifierKt {

    /* renamed from: a  reason: collision with root package name */
    private static final f<e> f6599a = c.a(KeyInputModifierKt$ModifierLocalKeyInput$1.f6602a);

    public static final f<e> a() {
        return f6599a;
    }

    public static final d b(d dVar, l<? super b, Boolean> lVar) {
        p.j(dVar, "<this>");
        p.j(lVar, "onKeyEvent");
        l keyInputModifierKt$onKeyEvent$$inlined$debugInspectorInfo$1 = InspectableValueKt.c() ? new KeyInputModifierKt$onKeyEvent$$inlined$debugInspectorInfo$1(lVar) : InspectableValueKt.a();
        d.a aVar = d.f16037h0;
        return InspectableValueKt.b(dVar, keyInputModifierKt$onKeyEvent$$inlined$debugInspectorInfo$1, new e(lVar, (l<? super b, Boolean>) null));
    }

    public static final d c(d dVar, l<? super b, Boolean> lVar) {
        p.j(dVar, "<this>");
        p.j(lVar, "onPreviewKeyEvent");
        l keyInputModifierKt$onPreviewKeyEvent$$inlined$debugInspectorInfo$1 = InspectableValueKt.c() ? new KeyInputModifierKt$onPreviewKeyEvent$$inlined$debugInspectorInfo$1(lVar) : InspectableValueKt.a();
        d.a aVar = d.f16037h0;
        return InspectableValueKt.b(dVar, keyInputModifierKt$onPreviewKeyEvent$$inlined$debugInspectorInfo$1, new e((l<? super b, Boolean>) null, lVar));
    }
}
