package androidx.compose.ui.platform.accessibility;

import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.core.view.accessibility.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;
import n1.b;
import n1.j;
import t0.f;
import t0.g;

/* compiled from: CollectionInfo.kt */
public final class CollectionInfoKt {
    private static final boolean a(List<SemanticsNode> list) {
        List list2;
        long j;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            list2 = k.j();
        } else {
            list2 = new ArrayList();
            SemanticsNode semanticsNode = list.get(0);
            int l11 = k.l(list);
            int i11 = 0;
            while (i11 < l11) {
                i11++;
                SemanticsNode semanticsNode2 = list.get(i11);
                SemanticsNode semanticsNode3 = semanticsNode2;
                SemanticsNode semanticsNode4 = semanticsNode;
                list2.add(f.d(g.a(Math.abs(f.m(semanticsNode4.f().g()) - f.m(semanticsNode3.f().g())), Math.abs(f.n(semanticsNode4.f().g()) - f.n(semanticsNode3.f().g())))));
                semanticsNode = semanticsNode2;
            }
        }
        if (list2.size() == 1) {
            j = ((f) s.W(list2)).u();
        } else if (!list2.isEmpty()) {
            Object W = s.W(list2);
            int l12 = k.l(list2);
            if (1 <= l12) {
                int i12 = 1;
                while (true) {
                    W = f.d(f.r(((f) W).u(), ((f) list2.get(i12)).u()));
                    if (i12 == l12) {
                        break;
                    }
                    i12++;
                }
            }
            j = ((f) W).u();
        } else {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        if (f.f(j) < f.e(j)) {
            return true;
        }
        return false;
    }

    public static final boolean b(SemanticsNode semanticsNode) {
        p.j(semanticsNode, "<this>");
        j h11 = semanticsNode.h();
        SemanticsProperties semanticsProperties = SemanticsProperties.f7428a;
        return (SemanticsConfigurationKt.a(h11, semanticsProperties.a()) == null && SemanticsConfigurationKt.a(semanticsNode.h(), semanticsProperties.t()) == null) ? false : true;
    }

    private static final boolean c(b bVar) {
        return bVar.b() < 0 || bVar.a() < 0;
    }

    public static final void d(SemanticsNode semanticsNode, c cVar) {
        int i11;
        p.j(semanticsNode, "node");
        p.j(cVar, "info");
        j h11 = semanticsNode.h();
        SemanticsProperties semanticsProperties = SemanticsProperties.f7428a;
        b bVar = (b) SemanticsConfigurationKt.a(h11, semanticsProperties.a());
        if (bVar != null) {
            cVar.e0(f(bVar));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (SemanticsConfigurationKt.a(semanticsNode.h(), semanticsProperties.t()) != null) {
            List<SemanticsNode> o11 = semanticsNode.o();
            int size = o11.size();
            for (int i12 = 0; i12 < size; i12++) {
                SemanticsNode semanticsNode2 = o11.get(i12);
                if (semanticsNode2.h().c(SemanticsProperties.f7428a.u())) {
                    arrayList.add(semanticsNode2);
                }
            }
        }
        int i13 = 1;
        if (!arrayList.isEmpty()) {
            boolean a11 = a(arrayList);
            if (a11) {
                i11 = 1;
            } else {
                i11 = arrayList.size();
            }
            if (a11) {
                i13 = arrayList.size();
            }
            cVar.e0(c.b.a(i11, i13, false, 0));
        }
    }

    public static final void e(SemanticsNode semanticsNode, c cVar) {
        p.j(semanticsNode, "node");
        p.j(cVar, "info");
        j h11 = semanticsNode.h();
        SemanticsProperties semanticsProperties = SemanticsProperties.f7428a;
        n1.c cVar2 = (n1.c) SemanticsConfigurationKt.a(h11, semanticsProperties.b());
        if (cVar2 != null) {
            cVar.f0(g(cVar2, semanticsNode));
        }
        SemanticsNode m11 = semanticsNode.m();
        if (m11 != null && SemanticsConfigurationKt.a(m11.h(), semanticsProperties.t()) != null) {
            b bVar = (b) SemanticsConfigurationKt.a(m11.h(), semanticsProperties.a());
            if ((bVar == null || !c(bVar)) && semanticsNode.h().c(semanticsProperties.u())) {
                ArrayList arrayList = new ArrayList();
                List<SemanticsNode> o11 = m11.o();
                int size = o11.size();
                for (int i11 = 0; i11 < size; i11++) {
                    SemanticsNode semanticsNode2 = o11.get(i11);
                    if (semanticsNode2.h().c(SemanticsProperties.f7428a.u())) {
                        arrayList.add(semanticsNode2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    boolean a11 = a(arrayList);
                    int size2 = arrayList.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        SemanticsNode semanticsNode3 = (SemanticsNode) arrayList.get(i12);
                        if (semanticsNode3.i() == semanticsNode.i()) {
                            c.C0047c b11 = c.C0047c.b(a11 ? 0 : i12, 1, a11 ? i12 : 0, 1, false, ((Boolean) semanticsNode3.h().h(SemanticsProperties.f7428a.u(), CollectionInfoKt$setCollectionItemInfo$2$itemInfo$1.f7265a)).booleanValue());
                            if (b11 != null) {
                                cVar.f0(b11);
                            }
                        }
                    }
                }
            }
        }
    }

    private static final c.b f(b bVar) {
        return c.b.a(bVar.b(), bVar.a(), false, 0);
    }

    private static final c.C0047c g(n1.c cVar, SemanticsNode semanticsNode) {
        return c.C0047c.b(cVar.c(), cVar.d(), cVar.a(), cVar.b(), false, ((Boolean) semanticsNode.h().h(SemanticsProperties.f7428a.u(), CollectionInfoKt$toAccessibilityCollectionItemInfo$1.f7266a)).booleanValue());
    }
}
