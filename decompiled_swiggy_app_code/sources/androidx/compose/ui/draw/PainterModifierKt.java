package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.painter.Painter;
import i1.c;
import p0.a;
import p0.d;
import u0.e0;

/* compiled from: PainterModifier.kt */
public final class PainterModifierKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: lp0.l<androidx.compose.ui.platform.n0, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: androidx.compose.ui.draw.PainterModifierKt$paint$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.compose.ui.draw.PainterModifierKt$paint$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p0.d a(p0.d r9, androidx.compose.ui.graphics.painter.Painter r10, boolean r11, p0.a r12, i1.c r13, float r14, u0.e0 r15) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.p.j(r9, r0)
            java.lang.String r0 = "painter"
            kotlin.jvm.internal.p.j(r10, r0)
            java.lang.String r0 = "alignment"
            kotlin.jvm.internal.p.j(r12, r0)
            java.lang.String r0 = "contentScale"
            kotlin.jvm.internal.p.j(r13, r0)
            androidx.compose.ui.draw.PainterModifier r0 = new androidx.compose.ui.draw.PainterModifier
            boolean r1 = androidx.compose.ui.platform.InspectableValueKt.c()
            if (r1 == 0) goto L_0x0029
            androidx.compose.ui.draw.PainterModifierKt$paint$$inlined$debugInspectorInfo$1 r1 = new androidx.compose.ui.draw.PainterModifierKt$paint$$inlined$debugInspectorInfo$1
            r2 = r1
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x002d
        L_0x0029:
            lp0.l r1 = androidx.compose.ui.platform.InspectableValueKt.a()
        L_0x002d:
            r8 = r1
            r1 = r0
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            p0.d r9 = r9.N(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.draw.PainterModifierKt.a(p0.d, androidx.compose.ui.graphics.painter.Painter, boolean, p0.a, i1.c, float, u0.e0):p0.d");
    }

    public static /* synthetic */ d b(d dVar, Painter painter, boolean z11, a aVar, c cVar, float f11, e0 e0Var, int i11, Object obj) {
        boolean z12 = (i11 & 2) != 0 ? true : z11;
        if ((i11 & 4) != 0) {
            aVar = a.f16019a.e();
        }
        a aVar2 = aVar;
        if ((i11 & 8) != 0) {
            cVar = c.f14864a.f();
        }
        c cVar2 = cVar;
        float f12 = (i11 & 16) != 0 ? 1.0f : f11;
        if ((i11 & 32) != 0) {
            e0Var = null;
        }
        return a(dVar, painter, z12, aVar2, cVar2, f12, e0Var);
    }
}
