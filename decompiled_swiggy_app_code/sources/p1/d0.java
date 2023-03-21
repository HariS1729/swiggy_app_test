package p1;

import a2.f;
import androidx.compose.ui.text.SpanStyleKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;

/* compiled from: TextStyle.kt */
public final class d0 {

    /* compiled from: TextStyle.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16078a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            f16078a = iArr;
        }
    }

    /* access modifiers changed from: private */
    public static final t b(r rVar, q qVar) {
        if (rVar == null && qVar == null) {
            return null;
        }
        return a.a(rVar, qVar);
    }

    public static final c0 c(c0 c0Var, c0 c0Var2, float f11) {
        p.j(c0Var, "start");
        p.j(c0Var2, "stop");
        return new c0(SpanStyleKt.b(c0Var.E(), c0Var2.E(), f11), n.a(c0Var.D(), c0Var2.D(), f11));
    }

    public static final c0 d(c0 c0Var, LayoutDirection layoutDirection) {
        p.j(c0Var, "style");
        p.j(layoutDirection, "direction");
        return new c0(SpanStyleKt.f(c0Var.u()), n.c(c0Var.r(), layoutDirection), c0Var.s());
    }

    public static final int e(LayoutDirection layoutDirection, f fVar) {
        p.j(layoutDirection, "layoutDirection");
        f.a aVar = f.f920b;
        if (fVar == null ? false : f.i(fVar.l(), aVar.a())) {
            int i11 = a.f16078a[layoutDirection.ordinal()];
            if (i11 == 1) {
                return aVar.b();
            }
            if (i11 == 2) {
                return aVar.c();
            }
            throw new NoWhenBranchMatchedException();
        } else if (fVar != null) {
            return fVar.l();
        } else {
            int i12 = a.f16078a[layoutDirection.ordinal()];
            if (i12 == 1) {
                return aVar.d();
            }
            if (i12 == 2) {
                return aVar.e();
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
