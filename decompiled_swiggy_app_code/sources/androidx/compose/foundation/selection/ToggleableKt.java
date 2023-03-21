package androidx.compose.foundation.selection;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.state.ToggleableState;
import lp0.a;
import lp0.l;
import n1.g;
import p0.d;
import s.h;
import u.k;

/* compiled from: Toggleable.kt */
public final class ToggleableKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: lp0.l<androidx.compose.ui.platform.n0, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r0v4, types: [lp0.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p0.d a(p0.d r8, boolean r9, u.k r10, s.h r11, boolean r12, n1.g r13, lp0.l<? super java.lang.Boolean, bp0.k> r14) {
        /*
            java.lang.String r0 = "$this$toggleable"
            kotlin.jvm.internal.p.j(r8, r0)
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.p.j(r10, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.p.j(r14, r0)
            boolean r0 = androidx.compose.ui.platform.InspectableValueKt.c()
            if (r0 == 0) goto L_0x0022
            androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$debugInspectorInfo$1 r0 = new androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$debugInspectorInfo$1
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x0026
        L_0x0022:
            lp0.l r0 = androidx.compose.ui.platform.InspectableValueKt.a()
        L_0x0026:
            p0.d$a r1 = p0.d.f16037h0
            androidx.compose.ui.state.ToggleableState r2 = o1.a.a(r9)
            androidx.compose.foundation.selection.ToggleableKt$toggleable$4$1 r7 = new androidx.compose.foundation.selection.ToggleableKt$toggleable$4$1
            r7.<init>(r14, r9)
            r3 = r12
            r4 = r13
            r5 = r10
            r6 = r11
            p0.d r9 = b(r1, r2, r3, r4, r5, r6, r7)
            p0.d r8 = androidx.compose.ui.platform.InspectableValueKt.b(r8, r0, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.selection.ToggleableKt.a(p0.d, boolean, u.k, s.h, boolean, n1.g, lp0.l):p0.d");
    }

    private static final d b(d dVar, ToggleableState toggleableState, boolean z11, g gVar, k kVar, h hVar, a<bp0.k> aVar) {
        return ComposedModifierKt.d(dVar, (l) null, new ToggleableKt$toggleableImpl$1(aVar, z11, kVar, hVar, gVar, toggleableState), 1, (Object) null);
    }
}
