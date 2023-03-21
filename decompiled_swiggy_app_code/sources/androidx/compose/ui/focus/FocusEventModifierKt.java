package androidx.compose.ui.focus;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import bp0.k;
import j1.c;
import j1.f;
import kotlin.jvm.internal.p;
import lp0.l;
import s0.d;
import s0.r;

/* compiled from: FocusEventModifier.kt */
public final class FocusEventModifierKt {

    /* renamed from: a  reason: collision with root package name */
    private static final f<d> f6362a = c.a(FocusEventModifierKt$ModifierLocalFocusEvent$1.f6364a);

    public static final f<d> a() {
        return f6362a;
    }

    public static final p0.d b(p0.d dVar, l<? super r, k> lVar) {
        p.j(dVar, "<this>");
        p.j(lVar, "onFocusEvent");
        return ComposedModifierKt.c(dVar, InspectableValueKt.c() ? new FocusEventModifierKt$onFocusEvent$$inlined$debugInspectorInfo$1(lVar) : InspectableValueKt.a(), new FocusEventModifierKt$onFocusEvent$2(lVar));
    }
}
