package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;
import lp0.l;
import n1.a;
import n1.i;
import n1.n;
import t0.h;
import u0.b1;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {
    /* access modifiers changed from: private */
    public static final boolean j(a<?> aVar, Object obj) {
        if (aVar == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar2 = (a) obj;
        if (!p.e(aVar.b(), aVar2.b())) {
            return false;
        }
        if (aVar.a() != null || aVar2.a() == null) {
            return aVar.a() == null || aVar2.a() != null;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final boolean k(SemanticsNode semanticsNode) {
        return SemanticsConfigurationKt.a(semanticsNode.h(), SemanticsProperties.f7428a.d()) == null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        r3 = r3.j();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean l(androidx.compose.ui.semantics.SemanticsNode r3) {
        /*
            boolean r0 = t(r3)
            r1 = 1
            if (r0 == 0) goto L_0x001e
            n1.j r0 = r3.s()
            androidx.compose.ui.semantics.SemanticsProperties r2 = androidx.compose.ui.semantics.SemanticsProperties.f7428a
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.g()
            java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r2)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.p.e(r0, r2)
            if (r0 != 0) goto L_0x001e
            return r1
        L_0x001e:
            androidx.compose.ui.node.LayoutNode r3 = r3.k()
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1 r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1.f7039a
            androidx.compose.ui.node.LayoutNode r3 = n(r3, r0)
            r0 = 0
            if (r3 == 0) goto L_0x004c
            n1.k r3 = androidx.compose.ui.semantics.a.j(r3)
            if (r3 == 0) goto L_0x0048
            n1.j r3 = r3.j()
            if (r3 == 0) goto L_0x0048
            androidx.compose.ui.semantics.SemanticsProperties r2 = androidx.compose.ui.semantics.SemanticsProperties.f7428a
            androidx.compose.ui.semantics.SemanticsPropertyKey r2 = r2.g()
            java.lang.Object r3 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r3, r2)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r3 = kotlin.jvm.internal.p.e(r3, r2)
            goto L_0x0049
        L_0x0048:
            r3 = 0
        L_0x0049:
            if (r3 != 0) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r1 = 0
        L_0x004d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.l(androidx.compose.ui.semantics.SemanticsNode):boolean");
    }

    public static final c1 m(List<c1> list, int i11) {
        p.j(list, "<this>");
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (list.get(i12).d() == i11) {
                return list.get(i12);
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final LayoutNode n(LayoutNode layoutNode, l<? super LayoutNode, Boolean> lVar) {
        for (LayoutNode u02 = layoutNode.u0(); u02 != null; u02 = u02.u0()) {
            if (lVar.invoke(u02).booleanValue()) {
                return u02;
            }
        }
        return null;
    }

    public static final Map<Integer, d1> o(n nVar) {
        p.j(nVar, "<this>");
        SemanticsNode a11 = nVar.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (a11.k().g() && a11.k().L0()) {
            Region region = new Region();
            region.set(b1.a(a11.f()));
            p(region, a11, linkedHashMap, a11);
        }
        return linkedHashMap;
    }

    private static final void p(Region region, SemanticsNode semanticsNode, Map<Integer, d1> map, SemanticsNode semanticsNode2) {
        int i11;
        h hVar;
        i1.p j;
        boolean z11 = false;
        boolean z12 = !semanticsNode2.k().g() || !semanticsNode2.k().L0();
        if (region.isEmpty() && semanticsNode2.i() != semanticsNode.i()) {
            return;
        }
        if (!z12 || semanticsNode2.t()) {
            Rect a11 = b1.a(semanticsNode2.r());
            Region region2 = new Region();
            region2.set(a11);
            if (semanticsNode2.i() == semanticsNode.i()) {
                i11 = -1;
            } else {
                i11 = semanticsNode2.i();
            }
            if (region2.op(region, region2, Region.Op.INTERSECT)) {
                Integer valueOf = Integer.valueOf(i11);
                Rect bounds = region2.getBounds();
                p.i(bounds, "region.bounds");
                map.put(valueOf, new d1(semanticsNode2, bounds));
                List<SemanticsNode> o11 = semanticsNode2.o();
                for (int size = o11.size() - 1; -1 < size; size--) {
                    p(region, semanticsNode, map, o11.get(size));
                }
                region.op(a11, region, Region.Op.REVERSE_DIFFERENCE);
            } else if (semanticsNode2.t()) {
                SemanticsNode m11 = semanticsNode2.m();
                if (!(m11 == null || (j = m11.j()) == null || !j.g())) {
                    z11 = true;
                }
                if (z11) {
                    hVar = m11.f();
                } else {
                    hVar = new h(0.0f, 0.0f, 10.0f, 10.0f);
                }
                map.put(Integer.valueOf(i11), new d1(semanticsNode2, b1.a(hVar)));
            } else if (i11 == -1) {
                Integer valueOf2 = Integer.valueOf(i11);
                Rect bounds2 = region2.getBounds();
                p.i(bounds2, "region.bounds");
                map.put(valueOf2, new d1(semanticsNode2, bounds2));
            }
        }
    }

    /* access modifiers changed from: private */
    public static final boolean q(SemanticsNode semanticsNode) {
        return semanticsNode.h().c(SemanticsProperties.f7428a.p());
    }

    /* access modifiers changed from: private */
    public static final boolean r(SemanticsNode semanticsNode) {
        return semanticsNode.h().c(SemanticsProperties.f7428a.q());
    }

    /* access modifiers changed from: private */
    public static final boolean s(SemanticsNode semanticsNode) {
        return semanticsNode.j().getLayoutDirection() == LayoutDirection.Rtl;
    }

    /* access modifiers changed from: private */
    public static final boolean t(SemanticsNode semanticsNode) {
        return semanticsNode.s().c(i.f15789a.p());
    }

    /* access modifiers changed from: private */
    public static final boolean u(SemanticsNode semanticsNode, AndroidComposeViewAccessibilityDelegateCompat.g gVar) {
        Iterator<Map.Entry<SemanticsPropertyKey<?>, Object>> it2 = gVar.b().iterator();
        while (it2.hasNext()) {
            if (!semanticsNode.h().c((SemanticsPropertyKey) it2.next().getKey())) {
                return true;
            }
        }
        return false;
    }
}
