package androidx.compose.foundation;

import androidx.compose.runtime.saveable.RememberSaveableKt;
import com.newrelic.agent.android.agentdata.HexAttribute;
import defpackage.y1;
import e0.g;
import kotlin.jvm.internal.p;
import p0.d;

/* compiled from: Scroll.kt */
public final class ScrollKt {
    public static final ScrollState a(int i11, g gVar, int i12, int i13) {
        gVar.E(-1464256199);
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        ScrollState scrollState = (ScrollState) RememberSaveableKt.b(new Object[0], ScrollState.f3154f.a(), (String) null, new ScrollKt$rememberScrollState$1(i11), gVar, 72, 4);
        gVar.P();
        return scrollState;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: lp0.l<androidx.compose.ui.platform.n0, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: androidx.compose.foundation.ScrollKt$scroll$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.compose.foundation.ScrollKt$scroll$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r0v1, types: [lp0.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final p0.d b(p0.d r8, androidx.compose.foundation.ScrollState r9, boolean r10, defpackage.y1.k r11, boolean r12, boolean r13) {
        /*
            boolean r0 = androidx.compose.ui.platform.InspectableValueKt.c()
            if (r0 == 0) goto L_0x0012
            androidx.compose.foundation.ScrollKt$scroll$$inlined$debugInspectorInfo$1 r0 = new androidx.compose.foundation.ScrollKt$scroll$$inlined$debugInspectorInfo$1
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0016
        L_0x0012:
            lp0.l r0 = androidx.compose.ui.platform.InspectableValueKt.a()
        L_0x0016:
            androidx.compose.foundation.ScrollKt$scroll$2 r7 = new androidx.compose.foundation.ScrollKt$scroll$2
            r1 = r7
            r2 = r13
            r3 = r9
            r4 = r12
            r5 = r11
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            p0.d r8 = androidx.compose.ui.ComposedModifierKt.c(r8, r0, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ScrollKt.b(p0.d, androidx.compose.foundation.ScrollState, boolean, y1$k, boolean, boolean):p0.d");
    }

    public static final d c(d dVar, ScrollState scrollState, boolean z11, y1.k kVar, boolean z12) {
        p.j(dVar, "<this>");
        p.j(scrollState, HexAttribute.HEX_ATTR_THREAD_STATE);
        return b(dVar, scrollState, z12, kVar, z11, true);
    }

    public static /* synthetic */ d d(d dVar, ScrollState scrollState, boolean z11, y1.k kVar, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            kVar = null;
        }
        if ((i11 & 8) != 0) {
            z12 = false;
        }
        return c(dVar, scrollState, z11, kVar, z12);
    }
}
