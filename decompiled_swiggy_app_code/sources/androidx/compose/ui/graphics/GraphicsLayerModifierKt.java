package androidx.compose.ui.graphics;

import androidx.compose.ui.platform.InspectableValueKt;
import bp0.k;
import com.truecaller.android.sdk.TruecallerSdkScope;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import kotlin.jvm.internal.p;
import lp0.l;
import okhttp3.internal.http2.Settings;
import p0.d;
import u0.c1;
import u0.d1;
import u0.j0;
import u0.j1;
import u0.k0;
import u0.q1;

/* compiled from: GraphicsLayerModifier.kt */
public final class GraphicsLayerModifierKt {
    public static final d a(d dVar, l<? super j0, k> lVar) {
        p.j(dVar, "<this>");
        p.j(lVar, RenderingDetails.TYPE_BLOCK);
        return dVar.N(new BlockGraphicsLayerModifier(lVar, InspectableValueKt.c() ? new GraphicsLayerModifierKt$graphicsLayer$$inlined$debugInspectorInfo$1(lVar) : InspectableValueKt.a()));
    }

    public static final /* synthetic */ d b(d dVar, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j, j1 j1Var, boolean z11, d1 d1Var) {
        float f22 = f11;
        p.j(dVar, "$this$graphicsLayer");
        p.j(j1Var, "shape");
        return d(dVar, f11, f12, f13, f14, f15, f16, f17, f18, f19, f21, j, j1Var, z11, d1Var, k0.a(), k0.a());
    }

    public static /* synthetic */ d c(d dVar, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j, j1 j1Var, boolean z11, d1 d1Var, int i11, Object obj) {
        int i12 = i11;
        float f22 = 1.0f;
        float f23 = (i12 & 1) != 0 ? 1.0f : f11;
        float f24 = (i12 & 2) != 0 ? 1.0f : f12;
        if ((i12 & 4) == 0) {
            f22 = f13;
        }
        float f25 = 0.0f;
        float f26 = (i12 & 8) != 0 ? 0.0f : f14;
        float f27 = (i12 & 16) != 0 ? 0.0f : f15;
        float f28 = (i12 & 32) != 0 ? 0.0f : f16;
        float f29 = (i12 & 64) != 0 ? 0.0f : f17;
        float f31 = (i12 & 128) != 0 ? 0.0f : f18;
        if ((i12 & 256) == 0) {
            f25 = f19;
        }
        return b(dVar, f23, f24, f22, f26, f27, f28, f29, f31, f25, (i12 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? 8.0f : f21, (i12 & 1024) != 0 ? q1.f16858b.a() : j, (i12 & 2048) != 0 ? c1.a() : j1Var, (i12 & 4096) != 0 ? false : z11, (i12 & 8192) != 0 ? null : d1Var);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: lp0.l<androidx.compose.ui.platform.n0, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.compose.ui.graphics.GraphicsLayerModifierKt$graphicsLayer-pANQ8Wg$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.compose.ui.graphics.GraphicsLayerModifierKt$graphicsLayer-pANQ8Wg$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p0.d d(p0.d r24, float r25, float r26, float r27, float r28, float r29, float r30, float r31, float r32, float r33, float r34, long r35, u0.j1 r37, boolean r38, u0.d1 r39, long r40, long r42) {
        /*
            r0 = r24
            java.lang.String r1 = "$this$graphicsLayer"
            kotlin.jvm.internal.p.j(r0, r1)
            java.lang.String r1 = "shape"
            r15 = r37
            kotlin.jvm.internal.p.j(r15, r1)
            boolean r1 = androidx.compose.ui.platform.InspectableValueKt.c()
            if (r1 == 0) goto L_0x003b
            androidx.compose.ui.graphics.GraphicsLayerModifierKt$graphicsLayer-pANQ8Wg$$inlined$debugInspectorInfo$1 r1 = new androidx.compose.ui.graphics.GraphicsLayerModifierKt$graphicsLayer-pANQ8Wg$$inlined$debugInspectorInfo$1
            r2 = r1
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r9 = r31
            r10 = r32
            r11 = r33
            r12 = r34
            r13 = r35
            r15 = r37
            r16 = r38
            r17 = r39
            r18 = r40
            r20 = r42
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r20)
            goto L_0x003f
        L_0x003b:
            lp0.l r1 = androidx.compose.ui.platform.InspectableValueKt.a()
        L_0x003f:
            r22 = r1
            androidx.compose.ui.graphics.SimpleGraphicsLayerModifier r1 = new androidx.compose.ui.graphics.SimpleGraphicsLayerModifier
            r2 = r1
            r23 = 0
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r9 = r31
            r10 = r32
            r11 = r33
            r12 = r34
            r13 = r35
            r15 = r37
            r16 = r38
            r17 = r39
            r18 = r40
            r20 = r42
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r20, r22, r23)
            p0.d r0 = r0.N(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.GraphicsLayerModifierKt.d(p0.d, float, float, float, float, float, float, float, float, float, float, long, u0.j1, boolean, u0.d1, long, long):p0.d");
    }

    public static /* synthetic */ d e(d dVar, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j, j1 j1Var, boolean z11, d1 d1Var, long j11, long j12, int i11, Object obj) {
        int i12 = i11;
        float f22 = 1.0f;
        float f23 = (i12 & 1) != 0 ? 1.0f : f11;
        float f24 = (i12 & 2) != 0 ? 1.0f : f12;
        if ((i12 & 4) == 0) {
            f22 = f13;
        }
        float f25 = 0.0f;
        float f26 = (i12 & 8) != 0 ? 0.0f : f14;
        float f27 = (i12 & 16) != 0 ? 0.0f : f15;
        float f28 = (i12 & 32) != 0 ? 0.0f : f16;
        float f29 = (i12 & 64) != 0 ? 0.0f : f17;
        float f31 = (i12 & 128) != 0 ? 0.0f : f18;
        if ((i12 & 256) == 0) {
            f25 = f19;
        }
        return d(dVar, f23, f24, f22, f26, f27, f28, f29, f31, f25, (i12 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? 8.0f : f21, (i12 & 1024) != 0 ? q1.f16858b.a() : j, (i12 & 2048) != 0 ? c1.a() : j1Var, (i12 & 4096) != 0 ? false : z11, (i12 & 8192) != 0 ? null : d1Var, (i12 & 16384) != 0 ? k0.a() : j11, (i12 & 32768) != 0 ? k0.a() : j12);
    }

    public static final d f(d dVar) {
        d dVar2 = dVar;
        p.j(dVar2, "<this>");
        return InspectableValueKt.c() ? dVar2.N(e(d.f16037h0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (j1) null, false, (d1) null, 0, 0, Settings.DEFAULT_INITIAL_WINDOW_SIZE, (Object) null)) : dVar2;
    }
}
