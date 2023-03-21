package y1;

import android.text.Spannable;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import d2.e;
import d2.r;
import d2.t;
import java.util.List;
import p1.b;
import p1.o;
import p1.p;
import s1.h;

/* compiled from: PlaceholderExtensions.android.kt */
public final class c {
    private static final int a(long j) {
        long g11 = r.g(j);
        t.a aVar = t.f14026b;
        if (t.g(g11, aVar.b())) {
            return 0;
        }
        return t.g(g11, aVar.a()) ? 1 : 2;
    }

    private static final int b(int i11) {
        p.a aVar = p.f16157a;
        if (p.i(i11, aVar.a())) {
            return 0;
        }
        if (p.i(i11, aVar.g())) {
            return 1;
        }
        if (p.i(i11, aVar.b())) {
            return 2;
        }
        if (p.i(i11, aVar.c())) {
            return 3;
        }
        if (p.i(i11, aVar.f())) {
            return 4;
        }
        if (p.i(i11, aVar.d())) {
            return 5;
        }
        if (p.i(i11, aVar.e())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
    }

    private static final void c(Spannable spannable, o oVar, int i11, int i12, e eVar) {
        SpannableExtensions_androidKt.r(spannable, new h(r.h(oVar.c()), a(oVar.c()), r.h(oVar.a()), a(oVar.a()), eVar.u0() * eVar.getDensity(), b(oVar.b())), i11, i12);
    }

    public static final void d(Spannable spannable, List<b.C0163b<o>> list, e eVar) {
        kotlin.jvm.internal.p.j(spannable, "<this>");
        kotlin.jvm.internal.p.j(list, "placeholders");
        kotlin.jvm.internal.p.j(eVar, "density");
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            b.C0163b bVar = list.get(i11);
            c(spannable, (o) bVar.a(), bVar.b(), bVar.c(), eVar);
        }
    }
}
