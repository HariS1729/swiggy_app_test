package androidx.compose.foundation.gestures;

import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import d2.u;
import defpackage.y1;
import f1.d;
import f1.v;
import fp0.c;
import g1.g;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.l;
import lp0.q;
import t0.f;
import wp0.j0;
import yp0.w;

/* compiled from: Draggable.kt */
public final class DraggableKt {
    public static final y1.j a(l<? super Float, k> lVar) {
        p.j(lVar, "onDelta");
        return new DefaultDraggableState(lVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: androidx.compose.foundation.gestures.Orientation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: g1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: e0.d1<? extends lp0.a<java.lang.Boolean>>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: e0.d1<? extends lp0.l<? super f1.v, java.lang.Boolean>>} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object f(f1.d r9, e0.d1<? extends lp0.l<? super f1.v, java.lang.Boolean>> r10, e0.d1<? extends lp0.a<java.lang.Boolean>> r11, g1.g r12, androidx.compose.foundation.gestures.Orientation r13, fp0.c<? super kotlin.Pair<f1.v, java.lang.Float>> r14) {
        /*
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1 r0 = (androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1) r0
            int r1 = r0.f3365g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f3365g = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1 r0 = new androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1
            r0.<init>(r14)
        L_0x0018:
            r14 = r0
            java.lang.Object r0 = r14.f3364f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r14.f3365g
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L_0x0078
            if (r2 == r7) goto L_0x005c
            if (r2 == r6) goto L_0x004b
            if (r2 == r5) goto L_0x0042
            if (r2 != r4) goto L_0x003a
            java.lang.Object r9 = r14.f3359a
            kotlin.jvm.internal.Ref$FloatRef r9 = (kotlin.jvm.internal.Ref$FloatRef) r9
            bp0.g.b(r0)
            goto L_0x0129
        L_0x003a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0042:
            java.lang.Object r9 = r14.f3359a
            kotlin.jvm.internal.Ref$FloatRef r9 = (kotlin.jvm.internal.Ref$FloatRef) r9
            bp0.g.b(r0)
            goto L_0x010c
        L_0x004b:
            java.lang.Object r9 = r14.f3361c
            androidx.compose.foundation.gestures.Orientation r9 = (androidx.compose.foundation.gestures.Orientation) r9
            java.lang.Object r10 = r14.f3360b
            g1.g r10 = (g1.g) r10
            java.lang.Object r11 = r14.f3359a
            f1.d r11 = (f1.d) r11
            bp0.g.b(r0)
            goto L_0x00df
        L_0x005c:
            java.lang.Object r9 = r14.f3363e
            r13 = r9
            androidx.compose.foundation.gestures.Orientation r13 = (androidx.compose.foundation.gestures.Orientation) r13
            java.lang.Object r9 = r14.f3362d
            r12 = r9
            g1.g r12 = (g1.g) r12
            java.lang.Object r9 = r14.f3361c
            r11 = r9
            e0.d1 r11 = (e0.d1) r11
            java.lang.Object r9 = r14.f3360b
            r10 = r9
            e0.d1 r10 = (e0.d1) r10
            java.lang.Object r9 = r14.f3359a
            f1.d r9 = (f1.d) r9
            bp0.g.b(r0)
            goto L_0x0090
        L_0x0078:
            bp0.g.b(r0)
            androidx.compose.ui.input.pointer.PointerEventPass r0 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
            r14.f3359a = r9
            r14.f3360b = r10
            r14.f3361c = r11
            r14.f3362d = r12
            r14.f3363e = r13
            r14.f3365g = r7
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.f(r9, r0, r3, r14)
            if (r0 != r1) goto L_0x0090
            return r1
        L_0x0090:
            f1.v r0 = (f1.v) r0
            java.lang.Object r10 = r10.getValue()
            lp0.l r10 = (lp0.l) r10
            java.lang.Object r10 = r10.invoke(r0)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x00a6
            goto L_0x0137
        L_0x00a6:
            java.lang.Object r10 = r11.getValue()
            lp0.a r10 = (lp0.a) r10
            java.lang.Object r10 = r10.invoke()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00c9
            r0.a()
            g1.h.b(r12, r0)
            r9 = 0
            java.lang.Float r9 = kotlin.coroutines.jvm.internal.a.c(r9)
            kotlin.Pair r8 = bp0.h.a(r0, r9)
            goto L_0x0137
        L_0x00c9:
            r14.f3359a = r9
            r14.f3360b = r12
            r14.f3361c = r13
            r14.f3362d = r8
            r14.f3363e = r8
            r14.f3365g = r6
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.d(r9, r3, r14)
            if (r0 != r1) goto L_0x00dc
            return r1
        L_0x00dc:
            r11 = r9
            r10 = r12
            r9 = r13
        L_0x00df:
            f1.v r0 = (f1.v) r0
            g1.h.b(r10, r0)
            kotlin.jvm.internal.Ref$FloatRef r2 = new kotlin.jvm.internal.Ref$FloatRef
            r2.<init>()
            androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$postPointerSlop$1 r13 = new androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$postPointerSlop$1
            r13.<init>(r10, r2)
            androidx.compose.foundation.gestures.Orientation r10 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r9 != r10) goto L_0x010f
            long r3 = r0.e()
            int r12 = r0.k()
            r14.f3359a = r2
            r14.f3360b = r8
            r14.f3361c = r8
            r14.f3365g = r5
            r9 = r11
            r10 = r3
            java.lang.Object r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.g(r9, r10, r12, r13, r14)
            if (r0 != r1) goto L_0x010b
            return r1
        L_0x010b:
            r9 = r2
        L_0x010c:
            f1.v r0 = (f1.v) r0
            goto L_0x012b
        L_0x010f:
            long r5 = r0.e()
            int r12 = r0.k()
            r14.f3359a = r2
            r14.f3360b = r8
            r14.f3361c = r8
            r14.f3365g = r4
            r9 = r11
            r10 = r5
            java.lang.Object r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.d(r9, r10, r12, r13, r14)
            if (r0 != r1) goto L_0x0128
            return r1
        L_0x0128:
            r9 = r2
        L_0x0129:
            f1.v r0 = (f1.v) r0
        L_0x012b:
            if (r0 == 0) goto L_0x0137
            float r9 = r9.f25663a
            java.lang.Float r9 = kotlin.coroutines.jvm.internal.a.c(r9)
            kotlin.Pair r8 = bp0.h.a(r0, r9)
        L_0x0137:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.f(f1.d, e0.d1, e0.d1, g1.g, androidx.compose.foundation.gestures.Orientation, fp0.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final Object g(d dVar, Pair<v, Float> pair, g gVar, w<? super y1.g> wVar, boolean z11, Orientation orientation, c<? super Boolean> cVar) {
        float floatValue = pair.d().floatValue();
        v c11 = pair.c();
        long q = f.q(c11.f(), f.s(n(floatValue, orientation), Math.signum(l(c11.f(), orientation))));
        wVar.e(new y1.g.c(q, (i) null));
        if (z11) {
            floatValue *= (float) -1;
        }
        wVar.e(new y1.g.b(floatValue, q, (i) null));
        DraggableKt$awaitDrag$dragTick$1 draggableKt$awaitDrag$dragTick$1 = new DraggableKt$awaitDrag$dragTick$1(gVar, orientation, wVar, z11);
        if (orientation == Orientation.Vertical) {
            return DragGestureDetectorKt.n(dVar, c11.e(), draggableKt$awaitDrag$dragTick$1, cVar);
        }
        return DragGestureDetectorKt.k(dVar, c11.e(), draggableKt$awaitDrag$dragTick$1, cVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: lp0.l<androidx.compose.ui.platform.n0, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: androidx.compose.foundation.gestures.DraggableKt$draggable$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.compose.foundation.gestures.DraggableKt$draggable$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r1v8, types: [lp0.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p0.d h(p0.d r16, lp0.p<? super e0.g, ? super java.lang.Integer, ? extends defpackage.y1.m> r17, lp0.l<? super f1.v, java.lang.Boolean> r18, androidx.compose.foundation.gestures.Orientation r19, boolean r20, u.k r21, lp0.a<java.lang.Boolean> r22, lp0.q<? super wp0.j0, ? super t0.f, ? super fp0.c<? super bp0.k>, ? extends java.lang.Object> r23, lp0.q<? super wp0.j0, ? super java.lang.Float, ? super fp0.c<? super bp0.k>, ? extends java.lang.Object> r24, boolean r25) {
        /*
            r0 = r16
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.p.j(r0, r1)
            java.lang.String r1 = "stateFactory"
            r12 = r17
            kotlin.jvm.internal.p.j(r12, r1)
            java.lang.String r1 = "canDrag"
            r13 = r18
            kotlin.jvm.internal.p.j(r13, r1)
            java.lang.String r1 = "orientation"
            r14 = r19
            kotlin.jvm.internal.p.j(r14, r1)
            java.lang.String r1 = "startDragImmediately"
            r15 = r22
            kotlin.jvm.internal.p.j(r15, r1)
            java.lang.String r1 = "onDragStarted"
            r11 = r23
            kotlin.jvm.internal.p.j(r11, r1)
            java.lang.String r1 = "onDragStopped"
            r10 = r24
            kotlin.jvm.internal.p.j(r10, r1)
            boolean r1 = androidx.compose.ui.platform.InspectableValueKt.c()
            if (r1 == 0) goto L_0x0050
            androidx.compose.foundation.gestures.DraggableKt$draggable$$inlined$debugInspectorInfo$1 r1 = new androidx.compose.foundation.gestures.DraggableKt$draggable$$inlined$debugInspectorInfo$1
            r2 = r1
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r25
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0054
        L_0x0050:
            lp0.l r1 = androidx.compose.ui.platform.InspectableValueKt.a()
        L_0x0054:
            androidx.compose.foundation.gestures.DraggableKt$draggable$9 r11 = new androidx.compose.foundation.gestures.DraggableKt$draggable$9
            r2 = r11
            r3 = r17
            r4 = r21
            r5 = r22
            r6 = r18
            r7 = r23
            r8 = r24
            r9 = r19
            r10 = r20
            r12 = r11
            r11 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            p0.d r0 = androidx.compose.ui.ComposedModifierKt.c(r0, r1, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.h(p0.d, lp0.p, lp0.l, androidx.compose.foundation.gestures.Orientation, boolean, u.k, lp0.a, lp0.q, lp0.q, boolean):p0.d");
    }

    public static final p0.d i(p0.d dVar, y1.j jVar, Orientation orientation, boolean z11, u.k kVar, boolean z12, q<? super j0, ? super f, ? super c<? super k>, ? extends Object> qVar, q<? super j0, ? super Float, ? super c<? super k>, ? extends Object> qVar2, boolean z13) {
        y1.j jVar2 = jVar;
        p.j(dVar, "<this>");
        p.j(jVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        p.j(orientation, "orientation");
        q<? super j0, ? super f, ? super c<? super k>, ? extends Object> qVar3 = qVar;
        p.j(qVar3, "onDragStarted");
        q<? super j0, ? super Float, ? super c<? super k>, ? extends Object> qVar4 = qVar2;
        p.j(qVar4, "onDragStopped");
        return h(dVar, new DraggableKt$draggable$3(jVar), DraggableKt$draggable$4.f3375a, orientation, z11, kVar, new DraggableKt$draggable$5(z12), qVar3, qVar4, z13);
    }

    public static /* synthetic */ p0.d j(p0.d dVar, lp0.p pVar, l lVar, Orientation orientation, boolean z11, u.k kVar, a aVar, q qVar, q qVar2, boolean z12, int i11, Object obj) {
        int i12 = i11;
        return h(dVar, pVar, lVar, orientation, (i12 & 8) != 0 ? true : z11, (i12 & 16) != 0 ? null : kVar, aVar, (i12 & 64) != 0 ? new DraggableKt$draggable$6((c<? super DraggableKt$draggable$6>) null) : qVar, (i12 & 128) != 0 ? new DraggableKt$draggable$7((c<? super DraggableKt$draggable$7>) null) : qVar2, (i12 & 256) != 0 ? false : z12);
    }

    public static /* synthetic */ p0.d k(p0.d dVar, y1.j jVar, Orientation orientation, boolean z11, u.k kVar, boolean z12, q qVar, q qVar2, boolean z13, int i11, Object obj) {
        int i12 = i11;
        return i(dVar, jVar, orientation, (i12 & 4) != 0 ? true : z11, (i12 & 8) != 0 ? null : kVar, (i12 & 16) != 0 ? false : z12, (i12 & 32) != 0 ? new DraggableKt$draggable$1((c<? super DraggableKt$draggable$1>) null) : qVar, (i12 & 64) != 0 ? new DraggableKt$draggable$2((c<? super DraggableKt$draggable$2>) null) : qVar2, (i12 & 128) != 0 ? false : z13);
    }

    /* access modifiers changed from: private */
    public static final float l(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? f.n(j) : f.m(j);
    }

    /* access modifiers changed from: private */
    public static final float m(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? u.i(j) : u.h(j);
    }

    private static final long n(float f11, Orientation orientation) {
        return orientation == Orientation.Vertical ? t0.g.a(0.0f, f11) : t0.g.a(f11, 0.0f);
    }
}
