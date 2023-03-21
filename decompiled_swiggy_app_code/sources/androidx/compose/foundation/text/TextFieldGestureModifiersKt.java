package androidx.compose.foundation.text;

import a0.o;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import fp0.c;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.d;
import s0.r;
import u.k;

/* compiled from: TextFieldGestureModifiers.kt */
public final class TextFieldGestureModifiersKt {
    public static final d a(d dVar, o oVar, boolean z11) {
        p.j(dVar, "<this>");
        p.j(oVar, "observer");
        return z11 ? SuspendingPointerInputFilterKt.c(dVar, oVar, new TextFieldGestureModifiersKt$longPressDragGestureFilter$1(oVar, (c<? super TextFieldGestureModifiersKt$longPressDragGestureFilter$1>) null)) : dVar;
    }

    public static final d b(d dVar, b0.c cVar, boolean z11) {
        p.j(dVar, "<this>");
        p.j(cVar, "observer");
        return z11 ? SuspendingPointerInputFilterKt.c(d.f16037h0, cVar, new TextFieldGestureModifiersKt$mouseDragGestureDetector$1(cVar, (c<? super TextFieldGestureModifiersKt$mouseDragGestureDetector$1>) null)) : dVar;
    }

    public static final d c(d dVar, boolean z11, s0.o oVar, k kVar, l<? super r, bp0.k> lVar) {
        p.j(dVar, "<this>");
        p.j(oVar, "focusRequester");
        p.j(lVar, "onFocusChanged");
        return FocusableKt.c(FocusChangedModifierKt.a(FocusRequesterModifierKt.a(dVar, oVar), lVar), z11, kVar);
    }
}
