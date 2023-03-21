package x1;

import a2.f;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import d2.e;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.p;
import p1.b;
import p1.c0;
import p1.j;
import p1.o;
import p1.u;
import u1.i;
import w1.a;

/* compiled from: AndroidParagraphIntrinsics.android.kt */
public final class d {
    public static final j a(String str, c0 c0Var, List<b.C0163b<u>> list, List<b.C0163b<o>> list2, e eVar, i.b bVar) {
        p.j(str, "text");
        p.j(c0Var, "style");
        p.j(list, "spanStyles");
        p.j(list2, "placeholders");
        p.j(eVar, "density");
        p.j(bVar, "fontFamilyResolver");
        return new AndroidParagraphIntrinsics(str, c0Var, list, list2, bVar, eVar);
    }

    public static final int b(f fVar, w1.f fVar2) {
        Locale locale;
        int l11 = fVar != null ? fVar.l() : f.f920b.a();
        f.a aVar = f.f920b;
        if (!f.i(l11, aVar.b())) {
            if (!f.i(l11, aVar.c())) {
                if (f.i(l11, aVar.d())) {
                    return 0;
                }
                if (f.i(l11, aVar.e())) {
                    return 1;
                }
                if (f.i(l11, aVar.a())) {
                    if (fVar2 == null || (locale = ((a) fVar2.c(0).a()).b()) == null) {
                        locale = Locale.getDefault();
                    }
                    int a11 = androidx.core.text.f.a(locale);
                    if (a11 == 0 || a11 != 1) {
                        return 2;
                    }
                } else {
                    throw new IllegalStateException("Invalid TextDirection.".toString());
                }
            }
            return 3;
        }
        return 2;
    }
}
