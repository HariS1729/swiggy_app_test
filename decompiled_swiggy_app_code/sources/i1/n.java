package i1;

import androidx.compose.ui.node.LayoutNodeWrapper;
import kotlin.jvm.internal.p;
import t0.f;
import t0.g;
import t0.h;

/* compiled from: LayoutCoordinates.kt */
public final class n {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = i1.l.a(r0, r4, false, 2, (java.lang.Object) null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final t0.h a(i1.m r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.p.j(r4, r0)
            i1.m r0 = r4.s()
            if (r0 == 0) goto L_0x0014
            r1 = 0
            r2 = 2
            r3 = 0
            t0.h r0 = i1.l.a(r0, r4, r1, r2, r3)
            if (r0 != 0) goto L_0x002c
        L_0x0014:
            t0.h r0 = new t0.h
            long r1 = r4.a()
            int r1 = d2.p.g(r1)
            float r1 = (float) r1
            long r2 = r4.a()
            int r4 = d2.p.f(r2)
            float r4 = (float) r4
            r2 = 0
            r0.<init>(r2, r2, r1, r4)
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.n.a(i1.m):t0.h");
    }

    public static final h b(m mVar) {
        p.j(mVar, "<this>");
        return l.a(d(mVar), mVar, false, 2, (Object) null);
    }

    public static final h c(m mVar) {
        p.j(mVar, "<this>");
        m d11 = d(mVar);
        h b11 = b(mVar);
        long b12 = d11.b(g.a(b11.i(), b11.l()));
        long b13 = d11.b(g.a(b11.j(), b11.l()));
        long b14 = d11.b(g.a(b11.j(), b11.e()));
        long b15 = d11.b(g.a(b11.i(), b11.e()));
        return new h(c.h(f.m(b12), f.m(b13), f.m(b15), f.m(b14)), c.h(f.n(b12), f.n(b13), f.n(b15), f.n(b14)), c.f(f.m(b12), f.m(b13), f.m(b15), f.m(b14)), c.f(f.n(b12), f.n(b13), f.n(b15), f.n(b14)));
    }

    public static final m d(m mVar) {
        m mVar2;
        p.j(mVar, "<this>");
        m s11 = mVar.s();
        while (true) {
            m mVar3 = s11;
            mVar2 = mVar;
            mVar = mVar3;
            if (mVar == null) {
                break;
            }
            s11 = mVar.s();
        }
        LayoutNodeWrapper layoutNodeWrapper = mVar2 instanceof LayoutNodeWrapper ? (LayoutNodeWrapper) mVar2 : null;
        if (layoutNodeWrapper == null) {
            return mVar2;
        }
        LayoutNodeWrapper s12 = layoutNodeWrapper.s1();
        while (true) {
            LayoutNodeWrapper layoutNodeWrapper2 = s12;
            LayoutNodeWrapper layoutNodeWrapper3 = layoutNodeWrapper;
            layoutNodeWrapper = layoutNodeWrapper2;
            if (layoutNodeWrapper == null) {
                return layoutNodeWrapper3;
            }
            s12 = layoutNodeWrapper.s1();
        }
    }

    public static final long e(m mVar) {
        p.j(mVar, "<this>");
        return mVar.t(f.f16662b.c());
    }

    public static final long f(m mVar) {
        p.j(mVar, "<this>");
        return mVar.b(f.f16662b.c());
    }
}
