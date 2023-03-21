package androidx.compose.foundation.text;

import androidx.compose.ui.ComposedModifierKt;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.d;
import t0.f;
import u.k;

/* compiled from: TextFieldPressGestureFilter.kt */
public final class TextFieldPressGestureFilterKt {
    public static final d a(d dVar, k kVar, boolean z11, l<? super f, bp0.k> lVar) {
        p.j(dVar, "<this>");
        p.j(lVar, "onTap");
        return z11 ? ComposedModifierKt.d(dVar, (l) null, new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1(lVar, kVar), 1, (Object) null) : dVar;
    }
}
