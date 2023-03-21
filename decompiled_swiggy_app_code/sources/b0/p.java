package b0;

import p1.y;
import t0.g;

/* compiled from: TextSelectionDelegate.kt */
public final class p {
    public static final float a(y yVar, int i11, boolean z11, boolean z12) {
        kotlin.jvm.internal.p.j(yVar, "<this>");
        boolean z13 = false;
        if (yVar.b(((!z11 || z12) && (z11 || !z12)) ? Math.max(i11 - 1, 0) : i11) == yVar.x(i11)) {
            z13 = true;
        }
        return yVar.i(i11, z13);
    }

    public static final long b(y yVar, int i11, boolean z11, boolean z12) {
        kotlin.jvm.internal.p.j(yVar, "textLayoutResult");
        return g.a(a(yVar, i11, z11, z12), yVar.l(yVar.p(i11)));
    }
}
