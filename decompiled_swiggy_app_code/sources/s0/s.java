package s0;

import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import k1.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;

/* compiled from: FocusTransactions.kt */
public final class s {

    /* compiled from: FocusTransactions.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16594a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.Captured.ordinal()] = 2;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f16594a = iArr;
        }
    }

    public static final void a(FocusModifier focusModifier) {
        p.j(focusModifier, "<this>");
        int i11 = a.f16594a[focusModifier.i().ordinal()];
        if (i11 == 3) {
            focusModifier.v(FocusStateImpl.Inactive);
        } else if (i11 == 4) {
            focusModifier.v(FocusStateImpl.ActiveParent);
        }
    }

    private static final boolean b(FocusModifier focusModifier) {
        FocusModifier j = focusModifier.j();
        if (j == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (!d(j, false, 1, (Object) null)) {
            return false;
        } else {
            focusModifier.w((FocusModifier) null);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean c(androidx.compose.ui.focus.FocusModifier r3, boolean r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.p.j(r3, r0)
            androidx.compose.ui.focus.FocusStateImpl r0 = r3.i()
            int[] r1 = s0.s.a.f16594a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 0
            r2 = 1
            switch(r0) {
                case 1: goto L_0x003e;
                case 2: goto L_0x0036;
                case 3: goto L_0x0043;
                case 4: goto L_0x0028;
                case 5: goto L_0x001c;
                case 6: goto L_0x0043;
                default: goto L_0x0016;
            }
        L_0x0016:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L_0x001c:
            boolean r4 = b(r3)
            if (r4 == 0) goto L_0x0034
            androidx.compose.ui.focus.FocusStateImpl r4 = androidx.compose.ui.focus.FocusStateImpl.Inactive
            r3.v(r4)
            goto L_0x0043
        L_0x0028:
            boolean r4 = b(r3)
            if (r4 == 0) goto L_0x0034
            androidx.compose.ui.focus.FocusStateImpl r4 = androidx.compose.ui.focus.FocusStateImpl.Deactivated
            r3.v(r4)
            goto L_0x0043
        L_0x0034:
            r4 = 0
            goto L_0x0044
        L_0x0036:
            if (r4 == 0) goto L_0x0044
            androidx.compose.ui.focus.FocusStateImpl r0 = androidx.compose.ui.focus.FocusStateImpl.Inactive
            r3.v(r0)
            goto L_0x0044
        L_0x003e:
            androidx.compose.ui.focus.FocusStateImpl r4 = androidx.compose.ui.focus.FocusStateImpl.Inactive
            r3.v(r4)
        L_0x0043:
            r4 = 1
        L_0x0044:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.s.c(androidx.compose.ui.focus.FocusModifier, boolean):boolean");
    }

    public static /* synthetic */ boolean d(FocusModifier focusModifier, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return c(focusModifier, z11);
    }

    public static final void e(FocusModifier focusModifier) {
        LayoutNode j12;
        q t02;
        f focusManager;
        p.j(focusModifier, "<this>");
        int i11 = a.f16594a[focusModifier.i().ordinal()];
        if (i11 == 1 || i11 == 2) {
            LayoutNodeWrapper m11 = focusModifier.m();
            if (!(m11 == null || (j12 = m11.j1()) == null || (t02 = j12.t0()) == null || (focusManager = t02.getFocusManager()) == null)) {
                focusManager.b(true);
            }
            focusModifier.v(FocusStateImpl.Deactivated);
        } else if (i11 == 5) {
            focusModifier.v(FocusStateImpl.DeactivatedParent);
        } else if (i11 == 6) {
            focusModifier.v(FocusStateImpl.Deactivated);
        }
    }

    private static final void f(FocusModifier focusModifier) {
        FocusStateImpl focusStateImpl;
        switch (a.f16594a[focusModifier.i().ordinal()]) {
            case 1:
            case 5:
            case 6:
                focusStateImpl = FocusStateImpl.Active;
                break;
            case 2:
                focusStateImpl = FocusStateImpl.Captured;
                break;
            case 3:
            case 4:
                throw new IllegalStateException("Granting focus to a deactivated node.".toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
        focusModifier.v(focusStateImpl);
    }

    private static final boolean g(FocusModifier focusModifier, FocusModifier focusModifier2) {
        focusModifier.w(focusModifier2);
        f(focusModifier2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = r0.j1();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(androidx.compose.ui.focus.FocusModifier r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.p.j(r2, r0)
            androidx.compose.ui.node.LayoutNodeWrapper r0 = r2.m()
            if (r0 == 0) goto L_0x0016
            androidx.compose.ui.node.LayoutNode r0 = r0.j1()
            if (r0 == 0) goto L_0x0016
            k1.q r0 = r0.t0()
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r0 != 0) goto L_0x001e
            r0 = 1
            r2.u(r0)
            return
        L_0x001e:
            androidx.compose.ui.focus.FocusStateImpl r0 = r2.i()
            int[] r1 = s0.s.a.f16594a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x004c;
                case 2: goto L_0x004c;
                case 3: goto L_0x004c;
                case 4: goto L_0x004c;
                case 5: goto L_0x0042;
                case 6: goto L_0x002e;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x004f
        L_0x002e:
            androidx.compose.ui.focus.FocusModifier r0 = r2.n()
            if (r0 == 0) goto L_0x0038
            i(r0, r2)
            goto L_0x004f
        L_0x0038:
            boolean r0 = j(r2)
            if (r0 == 0) goto L_0x004f
            f(r2)
            goto L_0x004f
        L_0x0042:
            boolean r0 = b(r2)
            if (r0 == 0) goto L_0x004f
            f(r2)
            goto L_0x004f
        L_0x004c:
            k(r2)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.s.h(androidx.compose.ui.focus.FocusModifier):void");
    }

    private static final boolean i(FocusModifier focusModifier, FocusModifier focusModifier2) {
        if (focusModifier.e().h(focusModifier2)) {
            switch (a.f16594a[focusModifier.i().ordinal()]) {
                case 1:
                    focusModifier.v(FocusStateImpl.ActiveParent);
                    return g(focusModifier, focusModifier2);
                case 2:
                    return false;
                case 3:
                    a(focusModifier);
                    boolean i11 = i(focusModifier, focusModifier2);
                    e(focusModifier);
                    return i11;
                case 4:
                    if (focusModifier.j() == null) {
                        return g(focusModifier, focusModifier2);
                    }
                    if (b(focusModifier)) {
                        return g(focusModifier, focusModifier2);
                    }
                    return false;
                case 5:
                    if (b(focusModifier)) {
                        return g(focusModifier, focusModifier2);
                    }
                    return false;
                case 6:
                    FocusModifier n = focusModifier.n();
                    if (n == null && j(focusModifier)) {
                        focusModifier.v(FocusStateImpl.Active);
                        return i(focusModifier, focusModifier2);
                    } else if (n == null || !i(n, focusModifier)) {
                        return false;
                    } else {
                        return i(focusModifier, focusModifier2);
                    }
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
    }

    private static final boolean j(FocusModifier focusModifier) {
        LayoutNode j12;
        q t02;
        LayoutNodeWrapper m11 = focusModifier.m();
        if (m11 != null && (j12 = m11.j1()) != null && (t02 = j12.t0()) != null) {
            return t02.requestFocus();
        }
        throw new IllegalStateException("Owner not initialized.".toString());
    }

    public static final void k(FocusModifier focusModifier) {
        p.j(focusModifier, "<this>");
        d f11 = focusModifier.f();
        if (f11 != null) {
            f11.f();
        }
    }
}
