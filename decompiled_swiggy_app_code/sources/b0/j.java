package b0;

import i1.m;
import i1.n;
import kotlin.jvm.internal.p;
import t0.f;
import t0.h;
import t0.i;

/* compiled from: SelectionManager.kt */
public final class j {
    public static final boolean a(h hVar, long j) {
        p.j(hVar, "$this$containsInclusive");
        float i11 = hVar.i();
        float j11 = hVar.j();
        float m11 = f.m(j);
        if (i11 <= m11 && m11 <= j11) {
            float l11 = hVar.l();
            float e11 = hVar.e();
            float n = f.n(j);
            if (l11 <= n && n <= e11) {
                return true;
            }
        }
        return false;
    }

    public static final h b(m mVar) {
        p.j(mVar, "<this>");
        h c11 = n.c(mVar);
        return i.a(mVar.I(c11.m()), mVar.I(c11.f()));
    }
}
