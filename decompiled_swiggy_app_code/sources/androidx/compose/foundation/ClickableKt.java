package androidx.compose.foundation;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import defpackage.y1;
import e0.d1;
import e0.g;
import e0.h0;
import e0.s0;
import e0.u;
import fp0.c;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.l;
import p0.d;
import s.h;
import u.k;
import u.n;
import wp0.k0;

/* compiled from: Clickable.kt */
public final class ClickableKt {
    public static final void a(k kVar, h0<n> h0Var, g gVar, int i11) {
        int i12;
        p.j(kVar, "interactionSource");
        p.j(h0Var, "pressedInteraction");
        g t = gVar.t(1761107222);
        if ((i11 & 14) == 0) {
            i12 = (t.k(kVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= t.k(h0Var) ? 32 : 16;
        }
        if ((i12 & 91) != 18 || !t.b()) {
            t.E(511388516);
            boolean k = t.k(h0Var) | t.k(kVar);
            Object F = t.F();
            if (k || F == g.f14172a.a()) {
                F = new ClickableKt$PressedInteractionSourceDisposableEffect$1$1(h0Var, kVar);
                t.y(F);
            }
            t.P();
            u.b(kVar, (l) F, t, i12 & 14);
        } else {
            t.h();
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new ClickableKt$PressedInteractionSourceDisposableEffect$2(kVar, h0Var, i11));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: lp0.l<androidx.compose.ui.platform.n0, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r0v4, types: [lp0.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p0.d b(p0.d r9, u.k r10, s.h r11, boolean r12, java.lang.String r13, n1.g r14, lp0.a<bp0.k> r15) {
        /*
            java.lang.String r0 = "$this$clickable"
            kotlin.jvm.internal.p.j(r9, r0)
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.p.j(r10, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.p.j(r15, r0)
            boolean r0 = androidx.compose.ui.platform.InspectableValueKt.c()
            if (r0 == 0) goto L_0x0022
            androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$debugInspectorInfo$1 r0 = new androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$debugInspectorInfo$1
            r1 = r0
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r11
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x0026
        L_0x0022:
            lp0.l r0 = androidx.compose.ui.platform.InspectableValueKt.a()
        L_0x0026:
            androidx.compose.foundation.ClickableKt$clickable$4 r8 = new androidx.compose.foundation.ClickableKt$clickable$4
            r1 = r8
            r2 = r15
            r3 = r12
            r4 = r10
            r5 = r11
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            p0.d r9 = androidx.compose.ui.ComposedModifierKt.c(r9, r0, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt.b(p0.d, u.k, s.h, boolean, java.lang.String, n1.g, lp0.a):p0.d");
    }

    public static /* synthetic */ d c(d dVar, k kVar, h hVar, boolean z11, String str, n1.g gVar, a aVar, int i11, Object obj) {
        return b(dVar, kVar, hVar, (i11 & 4) != 0 ? true : z11, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : gVar, aVar);
    }

    public static final d d(d dVar, boolean z11, String str, n1.g gVar, a<bp0.k> aVar) {
        p.j(dVar, "$this$clickable");
        p.j(aVar, "onClick");
        return ComposedModifierKt.c(dVar, InspectableValueKt.c() ? new ClickableKt$clickableXHw0xAI$$inlined$debugInspectorInfo$1(z11, str, gVar, aVar) : InspectableValueKt.a(), new ClickableKt$clickable$2(z11, str, gVar, aVar));
    }

    public static /* synthetic */ d e(d dVar, boolean z11, String str, n1.g gVar, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            gVar = null;
        }
        return d(dVar, z11, str, gVar, aVar);
    }

    public static final d f(d dVar, d dVar2, k kVar, h hVar, boolean z11, String str, n1.g gVar, String str2, a<bp0.k> aVar, a<bp0.k> aVar2) {
        d dVar3 = dVar2;
        k kVar2 = kVar;
        boolean z12 = z11;
        a<bp0.k> aVar3 = aVar2;
        d dVar4 = dVar;
        p.j(dVar, "$this$genericClickableWithoutGesture");
        p.j(dVar2, "gestureModifiers");
        p.j(kVar, "interactionSource");
        p.j(aVar3, "onClick");
        h hVar2 = hVar;
        return FocusableKt.e(HoverableKt.a(IndicationKt.b(h(g(dVar, gVar, str, aVar, str2, z11, aVar2), z11, aVar3), kVar, hVar), kVar, z11), z11, kVar).N(dVar2);
    }

    private static final d g(d dVar, n1.g gVar, String str, a<bp0.k> aVar, String str2, boolean z11, a<bp0.k> aVar2) {
        return SemanticsModifierKt.b(dVar, true, new ClickableKt$genericClickableWithoutGesture$clickSemantics$1(gVar, str, aVar, str2, z11, aVar2));
    }

    private static final d h(d dVar, boolean z11, a<bp0.k> aVar) {
        return KeyInputModifierKt.b(dVar, new ClickableKt$genericClickableWithoutGesture$detectClickFromKey$1(z11, aVar));
    }

    public static final Object i(y1.n nVar, long j, k kVar, h0<n> h0Var, d1<? extends a<Boolean>> d1Var, c<? super bp0.k> cVar) {
        Object e11 = k0.e(new ClickableKt$handlePressInteraction$2(nVar, j, kVar, h0Var, d1Var, (c<? super ClickableKt$handlePressInteraction$2>) null), cVar);
        return e11 == b.d() ? e11 : bp0.k.f22762a;
    }
}
