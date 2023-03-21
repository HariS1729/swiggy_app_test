package a0;

import a2.l;
import androidx.compose.ui.unit.LayoutDirection;
import d2.e;
import java.util.List;
import kotlin.jvm.internal.p;
import p1.b;
import p1.c0;
import p1.o;
import p1.x;
import p1.y;
import u1.i;

/* compiled from: TextLayoutHelper.kt */
public final class r {
    public static final boolean a(y yVar, b bVar, c0 c0Var, List<b.C0163b<o>> list, int i11, boolean z11, int i12, e eVar, LayoutDirection layoutDirection, i.b bVar2, long j) {
        p.j(yVar, "$this$canReuse");
        p.j(bVar, "text");
        p.j(c0Var, "style");
        p.j(list, "placeholders");
        p.j(eVar, "density");
        p.j(layoutDirection, "layoutDirection");
        p.j(bVar2, "fontFamilyResolver");
        x k = yVar.k();
        if (yVar.v().i().b() || !p.e(k.j(), bVar) || !k.i().A(c0Var) || !p.e(k.g(), list) || k.e() != i11 || k.h() != z11 || !l.d(k.f(), i12) || !p.e(k.b(), eVar) || k.d() != layoutDirection || !p.e(k.c(), bVar2) || d2.b.p(j) != d2.b.p(k.a())) {
            return false;
        }
        if (!z11 && !l.d(i12, l.f950a.b())) {
            return true;
        }
        if (d2.b.n(j) == d2.b.n(k.a()) && d2.b.m(j) == d2.b.m(k.a())) {
            return true;
        }
        return false;
    }
}
