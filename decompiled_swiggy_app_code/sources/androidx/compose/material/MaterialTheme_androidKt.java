package androidx.compose.material;

import bp0.k;
import e0.g;
import e0.s0;
import lp0.p;

/* compiled from: MaterialTheme.android.kt */
public final class MaterialTheme_androidKt {
    public static final void a(p<? super g, ? super Integer, k> pVar, g gVar, int i11) {
        int i12;
        kotlin.jvm.internal.p.j(pVar, "content");
        g t = gVar.t(-1558451989);
        if ((i11 & 14) == 0) {
            i12 = (t.k(pVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((2 ^ (i12 & 11)) != 0 || !t.b()) {
            pVar.invoke(t, Integer.valueOf(i12 & 14));
        } else {
            t.h();
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new MaterialTheme_androidKt$PlatformMaterialTheme$1(pVar, i11));
        }
    }
}
