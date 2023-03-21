package b0;

import androidx.compose.foundation.text.selection.SelectionAdjustment;
import kotlin.jvm.internal.p;
import p1.a0;
import p1.b0;
import p1.y;

/* compiled from: TextFieldSelectionDelegate.kt */
public final class m {
    public static final long a(y yVar, int i11, int i12, a0 a0Var, boolean z11, SelectionAdjustment selectionAdjustment) {
        p.j(selectionAdjustment, "adjustment");
        if (yVar == null) {
            return b0.b(0, 0);
        }
        long b11 = b0.b(i11, i12);
        if (a0Var != null || !p.e(selectionAdjustment, SelectionAdjustment.f4703a.c())) {
            return selectionAdjustment.a(yVar, b11, -1, z11, a0Var);
        }
        return b11;
    }
}
