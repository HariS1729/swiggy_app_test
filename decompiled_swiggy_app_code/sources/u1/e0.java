package u1;

import android.graphics.Typeface;
import kotlin.jvm.internal.p;
import u1.s;

/* compiled from: PlatformTypefaces.kt */
final class e0 implements d0 {
    private final Typeface c(String str, v vVar, int i11) {
        Typeface typeface;
        s.a aVar = s.f16939b;
        if (s.f(i11, aVar.b()) && p.e(vVar, v.f16949b.f())) {
            if (str == null || str.length() == 0) {
                Typeface typeface2 = Typeface.DEFAULT;
                p.i(typeface2, "DEFAULT");
                return typeface2;
            }
        }
        if (str == null) {
            typeface = Typeface.DEFAULT;
        } else {
            typeface = Typeface.create(str, 0);
        }
        Typeface create = Typeface.create(typeface, vVar.s(), s.f(i11, aVar.a()));
        p.i(create, "create(\n            fami…ontStyle.Italic\n        )");
        return create;
    }

    public Typeface a(x xVar, v vVar, int i11) {
        p.j(xVar, "name");
        p.j(vVar, "fontWeight");
        return c(xVar.f(), vVar, i11);
    }

    public Typeface b(v vVar, int i11) {
        p.j(vVar, "fontWeight");
        return c((String) null, vVar, i11);
    }
}
