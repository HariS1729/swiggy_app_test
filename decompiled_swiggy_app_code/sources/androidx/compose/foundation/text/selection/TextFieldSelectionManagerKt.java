package androidx.compose.foundation.text.selection;

import a0.o;
import a0.s;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import b0.j;
import bp0.k;
import e0.g;
import e0.s0;
import fp0.c;
import i1.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;
import p0.d;
import p1.a0;
import p1.y;
import t0.f;
import t0.h;

/* compiled from: TextFieldSelectionManager.kt */
public final class TextFieldSelectionManagerKt {

    /* compiled from: TextFieldSelectionManager.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4769a;

        static {
            int[] iArr = new int[Handle.values().length];
            iArr[Handle.Cursor.ordinal()] = 1;
            iArr[Handle.SelectionStart.ordinal()] = 2;
            iArr[Handle.SelectionEnd.ordinal()] = 3;
            f4769a = iArr;
        }
    }

    public static final void a(boolean z11, ResolvedTextDirection resolvedTextDirection, TextFieldSelectionManager textFieldSelectionManager, g gVar, int i11) {
        p.j(resolvedTextDirection, "direction");
        p.j(textFieldSelectionManager, "manager");
        g t = gVar.t(-1344558920);
        Boolean valueOf = Boolean.valueOf(z11);
        t.E(511388516);
        boolean k = t.k(valueOf) | t.k(textFieldSelectionManager);
        Object F = t.F();
        if (k || F == g.f14172a.a()) {
            F = textFieldSelectionManager.I(z11);
            t.y(F);
        }
        t.P();
        o oVar = (o) F;
        long z12 = textFieldSelectionManager.z(z11);
        boolean m11 = a0.m(textFieldSelectionManager.H().g());
        d c11 = SuspendingPointerInputFilterKt.c(d.f16037h0, oVar, new TextFieldSelectionManagerKt$TextFieldSelectionHandle$1(oVar, (c<? super TextFieldSelectionManagerKt$TextFieldSelectionHandle$1>) null));
        int i12 = i11 << 3;
        AndroidSelectionHandles_androidKt.c(z12, z11, resolvedTextDirection, m11, c11, (lp0.p<? super g, ? super Integer, k>) null, t, 196608 | (i12 & 112) | (i12 & 896));
        s0 v = t.v();
        if (v != null) {
            v.a(new TextFieldSelectionManagerKt$TextFieldSelectionHandle$2(z11, resolvedTextDirection, textFieldSelectionManager, i11));
        }
    }

    public static final long b(TextFieldSelectionManager textFieldSelectionManager, long j) {
        int i11;
        s g11;
        y i12;
        m f11;
        s g12;
        m c11;
        TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
        p.j(textFieldSelectionManager, "manager");
        if (textFieldSelectionManager.H().h().length() == 0) {
            return f.f16662b.b();
        }
        Handle w11 = textFieldSelectionManager.w();
        int i13 = w11 == null ? -1 : a.f4769a[w11.ordinal()];
        if (i13 == -1) {
            return f.f16662b.b();
        }
        if (i13 == 1 || i13 == 2) {
            i11 = a0.n(textFieldSelectionManager.H().g());
        } else if (i13 == 3) {
            i11 = a0.i(textFieldSelectionManager.H().g());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int n = l.n(textFieldSelectionManager.C().b(i11), StringsKt__StringsKt.a0(textFieldSelectionManager.H().h()));
        TextFieldState E = textFieldSelectionManager.E();
        if (E == null || (g11 = E.g()) == null || (i12 = g11.i()) == null) {
            return f.f16662b.b();
        }
        long g13 = i12.c(n).g();
        TextFieldState E2 = textFieldSelectionManager.E();
        if (E2 == null || (f11 = E2.f()) == null) {
            return f.f16662b.b();
        }
        TextFieldState E3 = textFieldSelectionManager.E();
        if (E3 == null || (g12 = E3.g()) == null || (c11 = g12.c()) == null) {
            return f.f16662b.b();
        }
        f u11 = textFieldSelectionManager.u();
        if (u11 == null) {
            return f.f16662b.b();
        }
        float m11 = f.m(c11.r(f11, u11.u()));
        int p11 = i12.p(n);
        int t = i12.t(p11);
        int n11 = i12.n(p11, true);
        boolean z11 = a0.n(textFieldSelectionManager.H().g()) > a0.i(textFieldSelectionManager.H().g());
        float a11 = b0.p.a(i12, t, true, z11);
        float a12 = b0.p.a(i12, n11, false, z11);
        float l11 = l.l(m11, Math.min(a11, a12), Math.max(a11, a12));
        if (Math.abs(m11 - l11) > ((float) (d2.p.g(j) / 2))) {
            return f.f16662b.b();
        }
        return f11.r(c11, t0.g.a(l11, f.n(g13)));
    }

    public static final boolean c(TextFieldSelectionManager textFieldSelectionManager, boolean z11) {
        m f11;
        h b11;
        p.j(textFieldSelectionManager, "<this>");
        TextFieldState E = textFieldSelectionManager.E();
        if (E == null || (f11 = E.f()) == null || (b11 = j.b(f11)) == null) {
            return false;
        }
        return j.a(b11, textFieldSelectionManager.z(z11));
    }
}
