package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.SelectionAdjustment;
import kotlin.jvm.internal.p;
import p1.a0;
import p1.y;

/* compiled from: SelectionAdjustment.kt */
public final class SelectionAdjustment$Companion$Word$1 implements SelectionAdjustment {
    SelectionAdjustment$Companion$Word$1() {
    }

    public long a(y yVar, long j, int i11, boolean z11, a0 a0Var) {
        p.j(yVar, "textLayoutResult");
        return SelectionAdjustment.Companion.f4704a.b(yVar, j, new SelectionAdjustment$Companion$Word$1$adjust$1(yVar));
    }
}
