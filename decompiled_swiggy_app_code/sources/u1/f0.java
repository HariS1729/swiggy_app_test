package u1;

import android.graphics.Typeface;
import kotlin.jvm.internal.p;

/* compiled from: PlatformTypefaces.kt */
final class f0 implements d0 {
    private final Typeface c(String str, v vVar, int i11) {
        boolean z11 = false;
        if (s.f(i11, s.f16939b.b()) && p.e(vVar, v.f16949b.f())) {
            if (str == null || str.length() == 0) {
                Typeface typeface = Typeface.DEFAULT;
                p.i(typeface, "DEFAULT");
                return typeface;
            }
        }
        int c11 = e.c(vVar, i11);
        if (str == null || str.length() == 0) {
            z11 = true;
        }
        if (z11) {
            Typeface defaultFromStyle = Typeface.defaultFromStyle(c11);
            p.i(defaultFromStyle, "{\n            Typeface.d…le(targetStyle)\n        }");
            return defaultFromStyle;
        }
        Typeface create = Typeface.create(str, c11);
        p.i(create, "{\n            Typeface.c…y, targetStyle)\n        }");
        return create;
    }

    private final Typeface d(String str, v vVar, int i11) {
        boolean z11 = true;
        if (str.length() == 0) {
            return null;
        }
        Typeface c11 = c(str, vVar, i11);
        if (p.e(c11, Typeface.create(Typeface.DEFAULT, e.c(vVar, i11))) || p.e(c11, c((String) null, vVar, i11))) {
            z11 = false;
        }
        if (z11) {
            return c11;
        }
        return null;
    }

    public Typeface a(x xVar, v vVar, int i11) {
        p.j(xVar, "name");
        p.j(vVar, "fontWeight");
        Typeface d11 = d(g0.b(xVar.f(), vVar), vVar, i11);
        return d11 == null ? c(xVar.f(), vVar, i11) : d11;
    }

    public Typeface b(v vVar, int i11) {
        p.j(vVar, "fontWeight");
        return c((String) null, vVar, i11);
    }
}
