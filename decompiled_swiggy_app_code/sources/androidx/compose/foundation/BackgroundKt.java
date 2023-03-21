package androidx.compose.foundation;

import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import p0.d;
import u0.c1;
import u0.d0;
import u0.j1;
import u0.u;

/* compiled from: Background.kt */
public final class BackgroundKt {
    public static final d a(d dVar, u uVar, j1 j1Var, float f11) {
        p.j(dVar, "<this>");
        p.j(uVar, "brush");
        p.j(j1Var, "shape");
        return dVar.N(new a((d0) null, uVar, f11, j1Var, InspectableValueKt.c() ? new BackgroundKt$background$$inlined$debugInspectorInfo$1(f11, uVar, j1Var) : InspectableValueKt.a(), 1, (i) null));
    }

    public static /* synthetic */ d b(d dVar, u uVar, j1 j1Var, float f11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j1Var = c1.a();
        }
        if ((i11 & 4) != 0) {
            f11 = 1.0f;
        }
        return a(dVar, uVar, j1Var, f11);
    }

    public static final d c(d dVar, long j, j1 j1Var) {
        p.j(dVar, "$this$background");
        p.j(j1Var, "shape");
        return dVar.N(new a(d0.h(j), (u) null, 0.0f, j1Var, InspectableValueKt.c() ? new BackgroundKt$backgroundbw27NRU$$inlined$debugInspectorInfo$1(j, j1Var) : InspectableValueKt.a(), 6, (i) null));
    }

    public static /* synthetic */ d d(d dVar, long j, j1 j1Var, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j1Var = c1.a();
        }
        return c(dVar, j, j1Var);
    }
}
