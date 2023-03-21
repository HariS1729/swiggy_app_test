package androidx.compose.ui.node;

import bp0.h;
import i1.g0;
import i1.q;
import i1.z;
import k1.b;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p0.d;

/* compiled from: LayoutNode.kt */
final class LayoutNode$modifier$outerWrapper$1 extends Lambda implements p<d.b, LayoutNodeWrapper, LayoutNodeWrapper> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LayoutNode f6861a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LayoutNode$modifier$outerWrapper$1(LayoutNode layoutNode) {
        super(2);
        this.f6861a = layoutNode;
    }

    /* renamed from: a */
    public final LayoutNodeWrapper invoke(d.b bVar, LayoutNodeWrapper layoutNodeWrapper) {
        kotlin.jvm.internal.p.j(bVar, "mod");
        kotlin.jvm.internal.p.j(layoutNodeWrapper, "toWrap");
        if (bVar instanceof g0) {
            ((g0) bVar).B(this.f6861a);
        }
        b.i(layoutNodeWrapper.e1(), layoutNodeWrapper, bVar);
        if (bVar instanceof z) {
            this.f6861a.r0().b(h.a(layoutNodeWrapper, bVar));
        }
        b bVar2 = layoutNodeWrapper;
        if (bVar instanceof q) {
            q qVar = (q) bVar;
            b w11 = this.f6861a.n1(layoutNodeWrapper, qVar);
            if (w11 == null) {
                w11 = new b(layoutNodeWrapper, qVar);
            }
            b bVar3 = w11;
            bVar3.E1();
            bVar2 = bVar3;
        }
        b.h(bVar2.e1(), bVar2, bVar);
        return bVar2;
    }
}
