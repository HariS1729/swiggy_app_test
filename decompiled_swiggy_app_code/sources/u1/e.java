package u1;

import kotlin.jvm.internal.p;
import u1.v;

/* compiled from: AndroidFontUtils.android.kt */
public final class e {
    public static final v a(v.a aVar) {
        p.j(aVar, "<this>");
        return aVar.j();
    }

    public static final int b(boolean z11, boolean z12) {
        if (z12 && z11) {
            return 3;
        }
        if (z11) {
            return 1;
        }
        return z12 ? 2 : 0;
    }

    public static final int c(v vVar, int i11) {
        p.j(vVar, "fontWeight");
        return b(vVar.compareTo(a(v.f16949b)) >= 0, s.f(i11, s.f16939b.a()));
    }
}
