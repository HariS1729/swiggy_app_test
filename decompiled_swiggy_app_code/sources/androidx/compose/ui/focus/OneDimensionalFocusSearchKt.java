package androidx.compose.ui.focus;

import f0.e;
import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;
import lp0.l;
import rp0.f;
import s0.b;
import s0.t;

/* compiled from: OneDimensionalFocusSearch.kt */
public final class OneDimensionalFocusSearchKt {

    /* compiled from: OneDimensionalFocusSearch.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6401a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 2;
            iArr[FocusStateImpl.Active.ordinal()] = 3;
            iArr[FocusStateImpl.Captured.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f6401a = iArr;
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator {
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
            r2 = r2.j1();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int compare(T r2, T r3) {
            /*
                r1 = this;
                androidx.compose.ui.focus.FocusModifier r2 = (androidx.compose.ui.focus.FocusModifier) r2
                androidx.compose.ui.node.LayoutNodeWrapper r2 = r2.m()
                r0 = 0
                if (r2 == 0) goto L_0x0018
                androidx.compose.ui.node.LayoutNode r2 = r2.j1()
                if (r2 == 0) goto L_0x0018
                int r2 = r2.v0()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                goto L_0x0019
            L_0x0018:
                r2 = r0
            L_0x0019:
                androidx.compose.ui.focus.FocusModifier r3 = (androidx.compose.ui.focus.FocusModifier) r3
                androidx.compose.ui.node.LayoutNodeWrapper r3 = r3.m()
                if (r3 == 0) goto L_0x002f
                androidx.compose.ui.node.LayoutNode r3 = r3.j1()
                if (r3 == 0) goto L_0x002f
                int r3 = r3.v0()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            L_0x002f:
                int r2 = ep0.b.c(r2, r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.OneDimensionalFocusSearchKt.b.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029 A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final boolean b(androidx.compose.ui.focus.FocusModifier r6, lp0.l<? super androidx.compose.ui.focus.FocusModifier, java.lang.Boolean> r7) {
        /*
            androidx.compose.ui.focus.FocusStateImpl r0 = r6.i()
            int[] r1 = androidx.compose.ui.focus.OneDimensionalFocusSearchKt.a.f6401a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r2 = 0
            r3 = 1
            switch(r0) {
                case 1: goto L_0x0030;
                case 2: goto L_0x0030;
                case 3: goto L_0x002b;
                case 4: goto L_0x002b;
                case 5: goto L_0x002b;
                case 6: goto L_0x0017;
                default: goto L_0x0011;
            }
        L_0x0011:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L_0x0017:
            boolean r0 = g(r6, r7)
            if (r0 != 0) goto L_0x0029
            java.lang.Object r6 = r7.invoke(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0086
        L_0x0029:
            r2 = 1
            goto L_0x0086
        L_0x002b:
            boolean r2 = g(r6, r7)
            goto L_0x0086
        L_0x0030:
            androidx.compose.ui.focus.FocusModifier r0 = r6.j()
            java.lang.String r4 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L_0x0087
            androidx.compose.ui.focus.FocusStateImpl r5 = r0.i()
            int r5 = r5.ordinal()
            r1 = r1[r5]
            switch(r1) {
                case 1: goto L_0x0073;
                case 2: goto L_0x0060;
                case 3: goto L_0x0055;
                case 4: goto L_0x0055;
                case 5: goto L_0x004b;
                case 6: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L_0x004b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = r4.toString()
            r6.<init>(r7)
            throw r6
        L_0x0055:
            s0.b$a r1 = s0.b.f16557b
            int r1 = r1.f()
            boolean r2 = d(r6, r0, r1, r7)
            goto L_0x0086
        L_0x0060:
            boolean r1 = b(r0, r7)
            if (r1 != 0) goto L_0x0029
            s0.b$a r1 = s0.b.f16557b
            int r1 = r1.f()
            boolean r6 = d(r6, r0, r1, r7)
            if (r6 == 0) goto L_0x0086
            goto L_0x0029
        L_0x0073:
            boolean r6 = b(r0, r7)
            if (r6 != 0) goto L_0x0029
            java.lang.Object r6 = r7.invoke(r0)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0086
            goto L_0x0029
        L_0x0086:
            return r2
        L_0x0087:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = r4.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.OneDimensionalFocusSearchKt.b(androidx.compose.ui.focus.FocusModifier, lp0.l):boolean");
    }

    private static final boolean c(FocusModifier focusModifier, l<? super FocusModifier, Boolean> lVar) {
        switch (a.f6401a[focusModifier.i().ordinal()]) {
            case 1:
            case 2:
                FocusModifier j = focusModifier.j();
                if (j != null) {
                    return c(j, lVar) || d(focusModifier, j, s0.b.f16557b.d(), lVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            case 3:
            case 4:
            case 5:
                return h(focusModifier, lVar);
            case 6:
                return lVar.invoke(focusModifier).booleanValue();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final boolean d(FocusModifier focusModifier, FocusModifier focusModifier2, int i11, l<? super FocusModifier, Boolean> lVar) {
        if (i(focusModifier, focusModifier2, i11, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) s0.a.a(focusModifier, i11, new OneDimensionalFocusSearchKt$generateAndSearchChildren$1(focusModifier, focusModifier2, i11, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean e(FocusModifier focusModifier) {
        return focusModifier.n() == null;
    }

    public static final boolean f(FocusModifier focusModifier, int i11, l<? super FocusModifier, Boolean> lVar) {
        p.j(focusModifier, "$this$oneDimensionalFocusSearch");
        p.j(lVar, "onFound");
        b.a aVar = s0.b.f16557b;
        if (s0.b.l(i11, aVar.d())) {
            return c(focusModifier, lVar);
        }
        if (s0.b.l(i11, aVar.f())) {
            return b(focusModifier, lVar);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
    }

    private static final boolean g(FocusModifier focusModifier, l<? super FocusModifier, Boolean> lVar) {
        j(focusModifier.e());
        e<FocusModifier> e11 = focusModifier.e();
        int m11 = e11.m();
        if (m11 <= 0) {
            return false;
        }
        int i11 = m11 - 1;
        Object[] l11 = e11.l();
        do {
            FocusModifier focusModifier2 = (FocusModifier) l11[i11];
            if (t.g(focusModifier2) && b(focusModifier2, lVar)) {
                return true;
            }
            i11--;
        } while (i11 >= 0);
        return false;
    }

    private static final boolean h(FocusModifier focusModifier, l<? super FocusModifier, Boolean> lVar) {
        j(focusModifier.e());
        e<FocusModifier> e11 = focusModifier.e();
        int m11 = e11.m();
        if (m11 > 0) {
            Object[] l11 = e11.l();
            int i11 = 0;
            do {
                FocusModifier focusModifier2 = (FocusModifier) l11[i11];
                if (t.g(focusModifier2) && c(focusModifier2, lVar)) {
                    return true;
                }
                i11++;
            } while (i11 < m11);
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final boolean i(FocusModifier focusModifier, FocusModifier focusModifier2, int i11, l<? super FocusModifier, Boolean> lVar) {
        if (focusModifier.i() == FocusStateImpl.ActiveParent || focusModifier.i() == FocusStateImpl.DeactivatedParent) {
            j(focusModifier.e());
            b.a aVar = s0.b.f16557b;
            if (s0.b.l(i11, aVar.d())) {
                e<FocusModifier> e11 = focusModifier.e();
                f fVar = new f(0, e11.m() - 1);
                int f11 = fVar.f();
                int g11 = fVar.g();
                if (f11 <= g11) {
                    boolean z11 = false;
                    while (true) {
                        if (z11) {
                            FocusModifier focusModifier3 = (FocusModifier) e11.l()[f11];
                            if (t.g(focusModifier3) && c(focusModifier3, lVar)) {
                                return true;
                            }
                        }
                        if (p.e(e11.l()[f11], focusModifier2)) {
                            z11 = true;
                        }
                        if (f11 == g11) {
                            break;
                        }
                        f11++;
                    }
                }
            } else if (s0.b.l(i11, aVar.f())) {
                e<FocusModifier> e12 = focusModifier.e();
                f fVar2 = new f(0, e12.m() - 1);
                int f12 = fVar2.f();
                int g12 = fVar2.g();
                if (f12 <= g12) {
                    boolean z12 = false;
                    while (true) {
                        if (z12) {
                            FocusModifier focusModifier4 = (FocusModifier) e12.l()[g12];
                            if (t.g(focusModifier4) && b(focusModifier4, lVar)) {
                                return true;
                            }
                        }
                        if (p.e(e12.l()[g12], focusModifier2)) {
                            z12 = true;
                        }
                        if (g12 == f12) {
                            break;
                        }
                        g12--;
                    }
                }
            } else {
                throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
            }
            if (s0.b.l(i11, s0.b.f16557b.d()) || focusModifier.i() == FocusStateImpl.DeactivatedParent || e(focusModifier)) {
                return false;
            }
            return lVar.invoke(focusModifier).booleanValue();
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
    }

    private static final void j(e<FocusModifier> eVar) {
        eVar.y(new b());
    }
}
