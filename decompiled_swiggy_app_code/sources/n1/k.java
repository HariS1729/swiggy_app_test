package n1;

import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import i1.n;
import k1.i;
import k1.q;
import kotlin.jvm.internal.p;
import t0.h;

/* compiled from: SemanticsEntity.kt */
public final class k extends i<k, l> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(LayoutNodeWrapper layoutNodeWrapper, l lVar) {
        super(layoutNodeWrapper, lVar);
        p.j(layoutNodeWrapper, "wrapped");
        p.j(lVar, "modifier");
    }

    private final boolean k() {
        return SemanticsConfigurationKt.a(((l) c()).A0(), i.f15789a.h()) != null;
    }

    public void g() {
        super.g();
        q t02 = a().t0();
        if (t02 != null) {
            t02.q();
        }
    }

    public void h() {
        super.h();
        q t02 = a().t0();
        if (t02 != null) {
            t02.q();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n1.j j() {
        /*
            r4 = this;
            k1.i r0 = r4.d()
            n1.k r0 = (n1.k) r0
            r1 = 0
            if (r0 != 0) goto L_0x0060
            androidx.compose.ui.node.LayoutNodeWrapper r0 = r4.b()
            androidx.compose.ui.node.LayoutNodeWrapper r0 = r0.r1()
            if (r0 == 0) goto L_0x0083
        L_0x0013:
            if (r0 == 0) goto L_0x002a
            k1.i[] r2 = r0.e1()
            k1.b$a r3 = k1.b.f15323a
            int r3 = r3.f()
            boolean r2 = k1.b.m(r2, r3)
            if (r2 != 0) goto L_0x002a
            androidx.compose.ui.node.LayoutNodeWrapper r0 = r0.r1()
            goto L_0x0013
        L_0x002a:
            if (r0 == 0) goto L_0x0083
            k1.i[] r0 = r0.e1()
            k1.b$a r2 = k1.b.f15323a
            int r2 = r2.f()
            k1.i r0 = k1.b.n(r0, r2)
            n1.k r0 = (n1.k) r0
            if (r0 == 0) goto L_0x0083
            androidx.compose.ui.node.LayoutNodeWrapper r2 = r0.b()
        L_0x0042:
            if (r2 == 0) goto L_0x0083
            if (r0 == 0) goto L_0x0047
            goto L_0x0068
        L_0x0047:
            androidx.compose.ui.node.LayoutNodeWrapper r2 = r2.r1()
            if (r2 == 0) goto L_0x005e
            k1.i[] r0 = r2.e1()
            k1.b$a r3 = k1.b.f15323a
            int r3 = r3.f()
            k1.i r0 = k1.b.n(r0, r3)
            n1.k r0 = (n1.k) r0
            goto L_0x0042
        L_0x005e:
            r0 = r1
            goto L_0x0042
        L_0x0060:
            androidx.compose.ui.node.LayoutNodeWrapper r2 = r0.b()
        L_0x0064:
            if (r2 == 0) goto L_0x0083
            if (r0 == 0) goto L_0x006a
        L_0x0068:
            r1 = r0
            goto L_0x0083
        L_0x006a:
            androidx.compose.ui.node.LayoutNodeWrapper r2 = r2.r1()
            if (r2 == 0) goto L_0x0081
            k1.i[] r0 = r2.e1()
            k1.b$a r3 = k1.b.f15323a
            int r3 = r3.f()
            k1.i r0 = k1.b.n(r0, r3)
            n1.k r0 = (n1.k) r0
            goto L_0x0064
        L_0x0081:
            r0 = r1
            goto L_0x0064
        L_0x0083:
            if (r1 == 0) goto L_0x00ac
            p0.d r0 = r4.c()
            n1.l r0 = (n1.l) r0
            n1.j r0 = r0.A0()
            boolean r0 = r0.k()
            if (r0 == 0) goto L_0x0096
            goto L_0x00ac
        L_0x0096:
            p0.d r0 = r4.c()
            n1.l r0 = (n1.l) r0
            n1.j r0 = r0.A0()
            n1.j r0 = r0.f()
            n1.j r1 = r1.j()
            r0.b(r1)
            return r0
        L_0x00ac:
            p0.d r0 = r4.c()
            n1.l r0 = (n1.l) r0
            n1.j r0 = r0.A0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.k.j():n1.j");
    }

    public final h l() {
        if (!f()) {
            return h.f16667e.a();
        }
        if (!k()) {
            return n.b(b());
        }
        return b().T1();
    }

    public String toString() {
        return super.toString() + " id: " + ((l) c()).getId() + " config: " + ((l) c()).A0();
    }
}
