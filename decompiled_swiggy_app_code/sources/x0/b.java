package x0;

import d2.l;
import d2.q;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import u0.h0;
import u0.l0;

/* compiled from: BitmapPainter.kt */
public final class b {
    public static final a a(l0 l0Var, long j, long j11, int i11) {
        p.j(l0Var, "image");
        a aVar = new a(l0Var, j, j11, (i) null);
        aVar.n(i11);
        return aVar;
    }

    public static /* synthetic */ a b(l0 l0Var, long j, long j11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            j = l.f14010b.a();
        }
        long j12 = j;
        if ((i12 & 4) != 0) {
            j11 = q.a(l0Var.getWidth(), l0Var.getHeight());
        }
        long j13 = j11;
        if ((i12 & 8) != 0) {
            i11 = h0.f16791a.a();
        }
        return a(l0Var, j12, j13, i11);
    }
}
