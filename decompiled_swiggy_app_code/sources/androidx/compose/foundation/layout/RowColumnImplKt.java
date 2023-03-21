package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.e;
import defpackage.a2;
import i1.e0;
import i1.i;
import i1.t;
import java.util.List;
import lp0.p;
import lp0.q;
import lp0.s;

/* compiled from: RowColumnImpl.kt */
public final class RowColumnImplKt {
    /* access modifiers changed from: private */
    public static final int A(e0 e0Var, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? e0Var.A0() : e0Var.e0();
    }

    /* access modifiers changed from: private */
    public static final q<List<? extends i>, Integer, Integer, Integer> a(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.f3729a.a();
        }
        return IntrinsicMeasureBlocks.f3729a.e();
    }

    /* access modifiers changed from: private */
    public static final q<List<? extends i>, Integer, Integer, Integer> b(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.f3729a.b();
        }
        return IntrinsicMeasureBlocks.f3729a.f();
    }

    /* access modifiers changed from: private */
    public static final q<List<? extends i>, Integer, Integer, Integer> c(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.f3729a.c();
        }
        return IntrinsicMeasureBlocks.f3729a.g();
    }

    /* access modifiers changed from: private */
    public static final q<List<? extends i>, Integer, Integer, Integer> d(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.f3729a.d();
        }
        return IntrinsicMeasureBlocks.f3729a.h();
    }

    /* access modifiers changed from: private */
    public static final a2.i q(a2.r rVar) {
        if (rVar != null) {
            return rVar.a();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final a2.r r(i iVar) {
        Object p11 = iVar.p();
        if (p11 instanceof a2.r) {
            return (a2.r) p11;
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final boolean s(a2.r rVar) {
        if (rVar != null) {
            return rVar.b();
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final float t(a2.r rVar) {
        if (rVar != null) {
            return rVar.c();
        }
        return 0.0f;
    }

    private static final int u(List<? extends i> list, p<? super i, ? super Integer, Integer> pVar, p<? super i, ? super Integer, Integer> pVar2, int i11, int i12) {
        boolean z11 = true;
        int min = Math.min((list.size() - 1) * i12, i11);
        int size = list.size();
        float f11 = 0.0f;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            i iVar = (i) list.get(i14);
            float t = t(r(iVar));
            if (t == 0.0f) {
                int min2 = Math.min(pVar.invoke(iVar, Integer.MAX_VALUE).intValue(), i11 - min);
                min += min2;
                i13 = Math.max(i13, pVar2.invoke(iVar, Integer.valueOf(min2)).intValue());
            } else if (t > 0.0f) {
                f11 += t;
            }
        }
        if (f11 != 0.0f) {
            z11 = false;
        }
        int c11 = z11 ? 0 : i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : c.c(((float) Math.max(i11 - min, 0)) / f11);
        int size2 = list.size();
        for (int i15 = 0; i15 < size2; i15++) {
            i iVar2 = (i) list.get(i15);
            float t11 = t(r(iVar2));
            if (t11 > 0.0f) {
                i13 = Math.max(i13, pVar2.invoke(iVar2, Integer.valueOf(c11 != Integer.MAX_VALUE ? c.c(((float) c11) * t11) : Integer.MAX_VALUE)).intValue());
            }
        }
        return i13;
    }

    private static final int v(List<? extends i> list, p<? super i, ? super Integer, Integer> pVar, int i11, int i12) {
        int size = list.size();
        int i13 = 0;
        int i14 = 0;
        float f11 = 0.0f;
        int i15 = 0;
        while (true) {
            boolean z11 = true;
            if (i13 >= size) {
                return c.c(((float) i14) * f11) + i15 + ((list.size() - 1) * i12);
            }
            i iVar = (i) list.get(i13);
            float t = t(r(iVar));
            int intValue = pVar.invoke(iVar, Integer.valueOf(i11)).intValue();
            if (t != 0.0f) {
                z11 = false;
            }
            if (z11) {
                i15 += intValue;
            } else if (t > 0.0f) {
                f11 += t;
                i14 = Math.max(i14, c.c(((float) intValue) / t));
            }
            i13++;
        }
    }

    /* access modifiers changed from: private */
    public static final int w(List<? extends i> list, p<? super i, ? super Integer, Integer> pVar, p<? super i, ? super Integer, Integer> pVar2, int i11, int i12, LayoutOrientation layoutOrientation, LayoutOrientation layoutOrientation2) {
        if (layoutOrientation == layoutOrientation2) {
            return v(list, pVar, i11, i12);
        }
        return u(list, pVar2, pVar, i11, i12);
    }

    /* access modifiers changed from: private */
    public static final boolean x(a2.r rVar) {
        a2.i q = q(rVar);
        if (q != null) {
            return q.c();
        }
        return false;
    }

    public static final t y(LayoutOrientation layoutOrientation, s<? super Integer, ? super int[], ? super LayoutDirection, ? super e, ? super int[], k> sVar, float f11, SizeMode sizeMode, a2.i iVar) {
        kotlin.jvm.internal.p.j(layoutOrientation, "orientation");
        kotlin.jvm.internal.p.j(sVar, "arrangement");
        kotlin.jvm.internal.p.j(sizeMode, "crossAxisSize");
        kotlin.jvm.internal.p.j(iVar, "crossAxisAlignment");
        return new RowColumnImplKt$rowColumnMeasurePolicy$1(layoutOrientation, f11, sizeMode, sVar, iVar);
    }

    /* access modifiers changed from: private */
    public static final int z(e0 e0Var, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? e0Var.e0() : e0Var.A0();
    }
}
