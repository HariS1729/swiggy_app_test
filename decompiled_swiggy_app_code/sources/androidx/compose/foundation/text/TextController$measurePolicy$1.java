package androidx.compose.foundation.text;

import a0.n;
import androidx.compose.ui.layout.AlignmentLineKt;
import b0.k;
import d2.c;
import d2.l;
import d2.m;
import i1.i;
import i1.j;
import i1.r;
import i1.t;
import i1.u;
import i1.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.p;
import p1.y;
import t0.h;

/* compiled from: CoreText.kt */
public final class TextController$measurePolicy$1 implements t {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextController f4515a;

    TextController$measurePolicy$1(TextController textController) {
        this.f4515a = textController;
    }

    public int a(j jVar, List<? extends i> list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        return d2.p.f(n.m(this.f4515a.k().h(), c.a(0, i11, 0, Integer.MAX_VALUE), jVar.getLayoutDirection(), (y) null, 4, (Object) null).A());
    }

    public int b(j jVar, List<? extends i> list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        return d2.p.f(n.m(this.f4515a.k().h(), c.a(0, i11, 0, Integer.MAX_VALUE), jVar.getLayoutDirection(), (y) null, 4, (Object) null).A());
    }

    public int c(j jVar, List<? extends i> list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        this.f4515a.k().h().n(jVar.getLayoutDirection());
        return this.f4515a.k().h().e();
    }

    public u d(w wVar, List<? extends r> list, long j) {
        int i11;
        Pair pair;
        k a11;
        w wVar2 = wVar;
        List<? extends r> list2 = list;
        p.j(wVar2, "$this$measure");
        p.j(list2, "measurables");
        y c11 = this.f4515a.k().c();
        y l11 = this.f4515a.k().h().l(j, wVar.getLayoutDirection(), c11);
        if (!p.e(c11, l11)) {
            this.f4515a.k().d().invoke(l11);
            if (c11 != null) {
                TextController textController = this.f4515a;
                if (!p.e(c11.k().j(), l11.k().j()) && (a11 = textController.f4497b) != null) {
                    a11.g(textController.k().g());
                }
            }
        }
        this.f4515a.k().k(l11);
        if (list.size() >= l11.z().size()) {
            List<h> z11 = l11.z();
            ArrayList arrayList = new ArrayList(z11.size());
            int size = z11.size();
            int i12 = 0;
            while (i12 < size) {
                h hVar = z11.get(i12);
                if (hVar != null) {
                    i11 = size;
                    pair = new Pair(((r) list2.get(i12)).N(c.b(0, (int) ((float) Math.floor((double) hVar.n())), 0, (int) ((float) Math.floor((double) hVar.h())), 5, (Object) null)), l.b(m.a(c.c(hVar.i()), c.c(hVar.l()))));
                } else {
                    i11 = size;
                    pair = null;
                }
                if (pair != null) {
                    arrayList.add(pair);
                }
                i12++;
                size = i11;
            }
            return wVar2.x0(d2.p.g(l11.A()), d2.p.f(l11.A()), x.i(bp0.h.a(AlignmentLineKt.a(), Integer.valueOf(c.c(l11.g()))), bp0.h.a(AlignmentLineKt.b(), Integer.valueOf(c.c(l11.j())))), new TextController$measurePolicy$1$measure$2(arrayList));
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public int e(j jVar, List<? extends i> list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        this.f4515a.k().h().n(jVar.getLayoutDirection());
        return this.f4515a.k().h().c();
    }
}
