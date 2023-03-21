package s0;

import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.focus.OneDimensionalFocusSearchKt;
import androidx.compose.ui.focus.TwoDimensionalFocusSearchKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.unit.LayoutDirection;
import f0.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;
import lp0.l;
import s0.b;

/* compiled from: FocusTraversal.kt */
public final class t {

    /* compiled from: FocusTraversal.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16595a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f16596b;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Rtl.ordinal()] = 1;
            iArr[LayoutDirection.Ltr.ordinal()] = 2;
            f16595a = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            iArr2[FocusStateImpl.Active.ordinal()] = 1;
            iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr2[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr2[FocusStateImpl.Inactive.ordinal()] = 5;
            iArr2[FocusStateImpl.Deactivated.ordinal()] = 6;
            f16596b = iArr2;
        }
    }

    public static final e<FocusModifier> a(FocusModifier focusModifier) {
        boolean z11;
        p.j(focusModifier, "<this>");
        e<FocusModifier> e11 = focusModifier.e();
        int m11 = e11.m();
        int i11 = 0;
        if (m11 > 0) {
            Object[] l11 = e11.l();
            int i12 = 0;
            while (true) {
                if (!((FocusModifier) l11[i12]).i().isDeactivated()) {
                    i12++;
                    if (i12 >= m11) {
                        break;
                    }
                } else {
                    z11 = true;
                    break;
                }
            }
            z11 = false;
        } else {
            z11 = false;
        }
        if (!z11) {
            return focusModifier.e();
        }
        e<FocusModifier> eVar = new e<>(new FocusModifier[16], 0);
        e<FocusModifier> e12 = focusModifier.e();
        int m12 = e12.m();
        if (m12 > 0) {
            Object[] l12 = e12.l();
            do {
                FocusModifier focusModifier2 = (FocusModifier) l12[i11];
                if (!focusModifier2.i().isDeactivated()) {
                    eVar.b(focusModifier2);
                } else {
                    eVar.c(eVar.m(), a(focusModifier2));
                }
                i11++;
            } while (i11 < m12);
        }
        return eVar;
    }

    public static final FocusModifier b(FocusModifier focusModifier) {
        p.j(focusModifier, "<this>");
        switch (a.f16596b[focusModifier.i().ordinal()]) {
            case 1:
            case 2:
                return focusModifier;
            case 3:
            case 4:
                FocusModifier j = focusModifier.j();
                if (j != null) {
                    return b(j);
                }
                break;
            case 5:
            case 6:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    public static final FocusModifier c(FocusModifier focusModifier) {
        p.j(focusModifier, "<this>");
        FocusModifier n = focusModifier.n();
        if (n == null) {
            return null;
        }
        switch (a.f16596b[focusModifier.i().ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                return c(n);
            case 3:
                return focusModifier;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final d1.e d(FocusModifier focusModifier) {
        LayoutNode j12;
        p.j(focusModifier, "<this>");
        LayoutNodeWrapper m11 = focusModifier.m();
        d1.e eVar = null;
        if (m11 == null || (j12 = m11.j1()) == null) {
            return null;
        }
        e<d1.e> k = focusModifier.k();
        int m12 = k.m();
        if (m12 > 0) {
            int i11 = 0;
            Object[] l11 = k.l();
            do {
                d1.e eVar2 = (d1.e) l11[i11];
                if (p.e(eVar2.a(), j12)) {
                    eVar = h(eVar2, eVar);
                }
                i11++;
            } while (i11 < m12);
        }
        if (eVar != null) {
            return eVar;
        }
        return focusModifier.l();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = i1.n.d(r2).B(r2, false);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final t0.h e(androidx.compose.ui.focus.FocusModifier r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.p.j(r2, r0)
            androidx.compose.ui.node.LayoutNodeWrapper r2 = r2.m()
            if (r2 == 0) goto L_0x0016
            i1.m r0 = i1.n.d(r2)
            r1 = 0
            t0.h r2 = r0.B(r2, r1)
            if (r2 != 0) goto L_0x001c
        L_0x0016:
            t0.h$a r2 = t0.h.f16667e
            t0.h r2 = r2.a()
        L_0x001c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.t.e(androidx.compose.ui.focus.FocusModifier):t0.h");
    }

    public static final boolean f(FocusModifier focusModifier, int i11, LayoutDirection layoutDirection, l<? super FocusModifier, Boolean> lVar) {
        int i12;
        p.j(focusModifier, "$this$focusSearch");
        p.j(layoutDirection, "layoutDirection");
        p.j(lVar, "onFound");
        b.a aVar = b.f16557b;
        if (b.l(i11, aVar.d()) ? true : b.l(i11, aVar.f())) {
            return OneDimensionalFocusSearchKt.f(focusModifier, i11, lVar);
        }
        if (b.l(i11, aVar.c()) ? true : b.l(i11, aVar.g()) ? true : b.l(i11, aVar.h()) ? true : b.l(i11, aVar.a())) {
            return TwoDimensionalFocusSearchKt.r(focusModifier, i11, lVar);
        }
        if (b.l(i11, aVar.b())) {
            int i13 = a.f16595a[layoutDirection.ordinal()];
            if (i13 == 1) {
                i12 = aVar.c();
            } else if (i13 == 2) {
                i12 = aVar.g();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            FocusModifier b11 = b(focusModifier);
            if (b11 != null) {
                return TwoDimensionalFocusSearchKt.r(b11, i12, lVar);
            }
            return false;
        } else if (b.l(i11, aVar.e())) {
            FocusModifier b12 = b(focusModifier);
            FocusModifier c11 = b12 != null ? c(b12) : null;
            if (p.e(c11, focusModifier) || c11 == null) {
                return false;
            }
            return lVar.invoke(c11).booleanValue();
        } else {
            throw new IllegalStateException("Invalid FocusDirection".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r0 = r0.j1();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean g(androidx.compose.ui.focus.FocusModifier r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.p.j(r3, r0)
            androidx.compose.ui.node.LayoutNodeWrapper r0 = r3.m()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001b
            androidx.compose.ui.node.LayoutNode r0 = r0.j1()
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.g()
            if (r0 != r1) goto L_0x001b
            r0 = 1
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 == 0) goto L_0x0036
            androidx.compose.ui.node.LayoutNodeWrapper r3 = r3.m()
            if (r3 == 0) goto L_0x0032
            androidx.compose.ui.node.LayoutNode r3 = r3.j1()
            if (r3 == 0) goto L_0x0032
            boolean r3 = r3.L0()
            if (r3 != r1) goto L_0x0032
            r3 = 1
            goto L_0x0033
        L_0x0032:
            r3 = 0
        L_0x0033:
            if (r3 == 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r1 = 0
        L_0x0037:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.t.g(androidx.compose.ui.focus.FocusModifier):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x000e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final d1.e h(d1.e r3, d1.e r4) {
        /*
            if (r4 != 0) goto L_0x0003
            return r3
        L_0x0003:
            androidx.compose.ui.node.LayoutNode r0 = r3.a()
            r1 = r4
        L_0x0008:
            boolean r2 = kotlin.jvm.internal.p.e(r1, r3)
            if (r2 != 0) goto L_0x001f
            d1.e r1 = r1.c()
            if (r1 == 0) goto L_0x001e
            androidx.compose.ui.node.LayoutNode r2 = r1.a()
            boolean r2 = kotlin.jvm.internal.p.e(r2, r0)
            if (r2 != 0) goto L_0x0008
        L_0x001e:
            return r3
        L_0x001f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.t.h(d1.e, d1.e):d1.e");
    }
}
