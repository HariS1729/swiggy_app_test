package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.LayoutDirection;
import d2.h;
import defpackage.a2;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import p0.d;

/* compiled from: Padding.kt */
public final class PaddingKt {
    public static final a2.p a(float f11) {
        return new a2.q(f11, f11, f11, f11, (i) null);
    }

    public static final a2.p b(float f11, float f12) {
        return new a2.q(f11, f12, f11, f12, (i) null);
    }

    public static /* synthetic */ a2.p c(float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = h.n((float) 0);
        }
        if ((i11 & 2) != 0) {
            f12 = h.n((float) 0);
        }
        return b(f11, f12);
    }

    public static final a2.p d(float f11, float f12, float f13, float f14) {
        return new a2.q(f11, f12, f13, f14, (i) null);
    }

    public static /* synthetic */ a2.p e(float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = h.n((float) 0);
        }
        if ((i11 & 2) != 0) {
            f12 = h.n((float) 0);
        }
        if ((i11 & 4) != 0) {
            f13 = h.n((float) 0);
        }
        if ((i11 & 8) != 0) {
            f14 = h.n((float) 0);
        }
        return d(f11, f12, f13, f14);
    }

    public static final float f(a2.p pVar, LayoutDirection layoutDirection) {
        p.j(pVar, "<this>");
        p.j(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return pVar.c(layoutDirection);
        }
        return pVar.b(layoutDirection);
    }

    public static final float g(a2.p pVar, LayoutDirection layoutDirection) {
        p.j(pVar, "<this>");
        p.j(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return pVar.b(layoutDirection);
        }
        return pVar.c(layoutDirection);
    }

    public static final d h(d dVar, a2.p pVar) {
        p.j(dVar, "<this>");
        p.j(pVar, "paddingValues");
        return dVar.N(new PaddingValuesModifier(pVar, InspectableValueKt.c() ? new PaddingKt$padding$$inlined$debugInspectorInfo$1(pVar) : InspectableValueKt.a()));
    }

    public static final d i(d dVar, float f11) {
        p.j(dVar, "$this$padding");
        return dVar.N(new PaddingModifier(f11, f11, f11, f11, true, InspectableValueKt.c() ? new PaddingKt$padding3ABfNKs$$inlined$debugInspectorInfo$1(f11) : InspectableValueKt.a(), (i) null));
    }

    public static final d j(d dVar, float f11, float f12) {
        p.j(dVar, "$this$padding");
        return dVar.N(new PaddingModifier(f11, f12, f11, f12, true, InspectableValueKt.c() ? new PaddingKt$paddingVpY3zN4$$inlined$debugInspectorInfo$1(f11, f12) : InspectableValueKt.a(), (i) null));
    }

    public static /* synthetic */ d k(d dVar, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = h.n((float) 0);
        }
        if ((i11 & 2) != 0) {
            f12 = h.n((float) 0);
        }
        return j(dVar, f11, f12);
    }

    public static final d l(d dVar, float f11, float f12, float f13, float f14) {
        p.j(dVar, "$this$padding");
        return dVar.N(new PaddingModifier(f11, f12, f13, f14, true, InspectableValueKt.c() ? new PaddingKt$paddingqDBjuR0$$inlined$debugInspectorInfo$1(f11, f12, f13, f14) : InspectableValueKt.a(), (i) null));
    }

    public static /* synthetic */ d m(d dVar, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = h.n((float) 0);
        }
        if ((i11 & 2) != 0) {
            f12 = h.n((float) 0);
        }
        if ((i11 & 4) != 0) {
            f13 = h.n((float) 0);
        }
        if ((i11 & 8) != 0) {
            f14 = h.n((float) 0);
        }
        return l(dVar, f11, f12, f13, f14);
    }
}
