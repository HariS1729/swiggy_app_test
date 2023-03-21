package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import f0.e;
import java.util.ArrayList;
import java.util.List;
import k1.b;
import kotlin.jvm.internal.p;
import lp0.l;
import n1.g;
import n1.k;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: SemanticsNode.kt */
public final class a {
    /* access modifiers changed from: private */
    public static final int e(SemanticsNode semanticsNode) {
        return semanticsNode.i() + 2000000000;
    }

    /* access modifiers changed from: private */
    public static final LayoutNode f(LayoutNode layoutNode, l<? super LayoutNode, Boolean> lVar) {
        for (LayoutNode u02 = layoutNode.u0(); u02 != null; u02 = u02.u0()) {
            if (lVar.invoke(u02).booleanValue()) {
                return u02;
            }
        }
        return null;
    }

    private static final List<k> g(LayoutNode layoutNode, List<k> list) {
        e<LayoutNode> z02 = layoutNode.z0();
        int m11 = z02.m();
        if (m11 > 0) {
            int i11 = 0;
            Object[] l11 = z02.l();
            do {
                LayoutNode layoutNode2 = (LayoutNode) l11[i11];
                k j = j(layoutNode2);
                if (j != null) {
                    list.add(j);
                } else {
                    g(layoutNode2, list);
                }
                i11++;
            } while (i11 < m11);
        }
        return list;
    }

    static /* synthetic */ List h(LayoutNode layoutNode, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = new ArrayList();
        }
        return g(layoutNode, list);
    }

    public static final k i(LayoutNode layoutNode) {
        k kVar;
        p.j(layoutNode, "<this>");
        LayoutNodeWrapper s02 = layoutNode.s0();
        while (s02 != null && !b.m(s02.e1(), b.f15323a.f())) {
            s02 = s02.r1();
        }
        if (s02 == null || (kVar = (k) b.n(s02.e1(), b.f15323a.f())) == null) {
            return null;
        }
        LayoutNodeWrapper b11 = kVar.b();
        while (b11 != null) {
            while (kVar != null) {
                if (((n1.l) kVar.c()).A0().l()) {
                    return kVar;
                }
                kVar = (k) kVar.d();
            }
            b11 = b11.r1();
            kVar = b11 != null ? (k) b.n(b11.e1(), b.f15323a.f()) : null;
        }
        return null;
    }

    public static final k j(LayoutNode layoutNode) {
        k kVar;
        p.j(layoutNode, "<this>");
        LayoutNodeWrapper s02 = layoutNode.s0();
        while (s02 != null && !b.m(s02.e1(), b.f15323a.f())) {
            s02 = s02.r1();
        }
        if (s02 == null || (kVar = (k) b.n(s02.e1(), b.f15323a.f())) == null) {
            return null;
        }
        LayoutNodeWrapper b11 = kVar.b();
        while (b11 != null) {
            if (kVar != null) {
                return kVar;
            }
            b11 = b11.r1();
            kVar = b11 != null ? (k) b.n(b11.e1(), b.f15323a.f()) : null;
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final g k(SemanticsNode semanticsNode) {
        return (g) SemanticsConfigurationKt.a(semanticsNode.s(), SemanticsProperties.f7428a.s());
    }

    /* access modifiers changed from: private */
    public static final int l(SemanticsNode semanticsNode) {
        return semanticsNode.i() + Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
    }
}
