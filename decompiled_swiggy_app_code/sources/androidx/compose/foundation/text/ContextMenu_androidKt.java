package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import bp0.k;
import e0.g;
import e0.s0;
import lp0.p;

/* compiled from: ContextMenu.android.kt */
public final class ContextMenu_androidKt {
    public static final void a(TextFieldSelectionManager textFieldSelectionManager, p<? super g, ? super Integer, k> pVar, g gVar, int i11) {
        int i12;
        kotlin.jvm.internal.p.j(textFieldSelectionManager, "manager");
        kotlin.jvm.internal.p.j(pVar, "content");
        g t = gVar.t(-1985516685);
        if ((i11 & 112) == 0) {
            i12 = (t.k(pVar) ? 32 : 16) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 81) != 16 || !t.b()) {
            pVar.invoke(t, Integer.valueOf((i12 >> 3) & 14));
        } else {
            t.h();
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new ContextMenu_androidKt$ContextMenuArea$1(textFieldSelectionManager, pVar, i11));
        }
    }
}
