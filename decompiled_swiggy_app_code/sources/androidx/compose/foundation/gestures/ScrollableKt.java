package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import com.newrelic.agent.android.agentdata.HexAttribute;
import defpackage.y1;
import e0.a1;
import e0.d1;
import e0.g;
import e0.h0;
import e1.b;
import j1.c;
import j1.f;
import kotlin.jvm.internal.p;
import lp0.q;
import p0.d;
import s.l;
import u.k;

/* compiled from: Scrollable.kt */
public final class ScrollableKt {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final y1.p f3471a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final f<Boolean> f3472b = c.a(ScrollableKt$ModifierLocalScrollableContainer$1.f3480a);

    /* compiled from: Scrollable.kt */
    public static final class a implements y1.p {
        a() {
        }

        public float a(float f11) {
            return f11;
        }
    }

    /* access modifiers changed from: private */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    public static final java.lang.Object d(f1.d r5, fp0.c<? super f1.n> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = (androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1) r0
            int r1 = r0.f3483c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f3483c = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = new androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f3482b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f3483c
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.f3481a
            f1.d r5 = (f1.d) r5
            bp0.g.b(r6)
            goto L_0x0044
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            bp0.g.b(r6)
        L_0x0038:
            r0.f3481a = r5
            r0.f3483c = r3
            r6 = 0
            java.lang.Object r6 = f1.c.a(r5, r6, r0, r3, r6)
            if (r6 != r1) goto L_0x0044
            return r1
        L_0x0044:
            f1.n r6 = (f1.n) r6
            int r2 = r6.f()
            f1.p$a r4 = f1.p.f14519a
            int r4 = r4.f()
            boolean r2 = f1.p.i(r2, r4)
            if (r2 == 0) goto L_0x0038
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.d(f1.d, fp0.c):java.lang.Object");
    }

    public static final f<Boolean> e() {
        return f3472b;
    }

    private static final d f(d dVar, d1<ScrollingLogic> d1Var, y1.o oVar) {
        return SuspendingPointerInputFilterKt.b(dVar, d1Var, oVar, new ScrollableKt$mouseWheelScroll$1(oVar, d1Var, (fp0.c<? super ScrollableKt$mouseWheelScroll$1>) null));
    }

    /* access modifiers changed from: private */
    public static final d g(d dVar, k kVar, Orientation orientation, boolean z11, y1.r rVar, y1.k kVar2, l lVar, boolean z12, g gVar, int i11) {
        g gVar2 = gVar;
        gVar2.E(-2012025036);
        gVar2.E(-1730187034);
        y1.k a11 = kVar2 == null ? b.f3627a.a(gVar2, 6) : kVar2;
        gVar.P();
        gVar2.E(-492369756);
        Object F = gVar.F();
        g.a aVar = g.f14172a;
        if (F == aVar.a()) {
            F = j.e(new NestedScrollDispatcher(), (a1) null, 2, (Object) null);
            gVar2.y(F);
        }
        gVar.P();
        h0 h0Var = (h0) F;
        d1 m11 = androidx.compose.runtime.g.m(new ScrollingLogic(orientation, z11, h0Var, rVar, a11, lVar), gVar2, 0);
        Boolean valueOf = Boolean.valueOf(z12);
        gVar2.E(1157296644);
        boolean k = gVar2.k(valueOf);
        Object F2 = gVar.F();
        if (k || F2 == aVar.a()) {
            F2 = k(m11, z12);
            gVar2.y(F2);
        } else {
            boolean z13 = z12;
        }
        gVar.P();
        b bVar = (b) F2;
        gVar2.E(-492369756);
        Object F3 = gVar.F();
        if (F3 == aVar.a()) {
            F3 = new ScrollDraggableState(m11);
            gVar2.y(F3);
        }
        gVar.P();
        d a12 = NestedScrollModifierKt.a(f(DraggableKt.j(dVar, new ScrollableKt$pointerScrollable$1((ScrollDraggableState) F3), ScrollableKt$pointerScrollable$2.f3493a, orientation, z12, kVar, new ScrollableKt$pointerScrollable$3(m11), (q) null, new ScrollableKt$pointerScrollable$4(h0Var, m11, (fp0.c<? super ScrollableKt$pointerScrollable$4>) null), false, 64, (Object) null), m11, y1.f.a(gVar2, 0)), bVar, (NestedScrollDispatcher) h0Var.getValue());
        gVar.P();
        return a12;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: lp0.l<androidx.compose.ui.platform.n0, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.compose.foundation.gestures.ScrollableKt$scrollable$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.compose.foundation.gestures.ScrollableKt$scrollable$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r1v4, types: [lp0.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p0.d h(p0.d r13, defpackage.y1.r r14, androidx.compose.foundation.gestures.Orientation r15, s.l r16, boolean r17, boolean r18, defpackage.y1.k r19, u.k r20) {
        /*
            r0 = r13
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.p.j(r13, r1)
            java.lang.String r1 = "state"
            r10 = r14
            kotlin.jvm.internal.p.j(r14, r1)
            java.lang.String r1 = "orientation"
            r11 = r15
            kotlin.jvm.internal.p.j(r15, r1)
            boolean r1 = androidx.compose.ui.platform.InspectableValueKt.c()
            if (r1 == 0) goto L_0x002b
            androidx.compose.foundation.gestures.ScrollableKt$scrollable$$inlined$debugInspectorInfo$1 r1 = new androidx.compose.foundation.gestures.ScrollableKt$scrollable$$inlined$debugInspectorInfo$1
            r2 = r1
            r3 = r15
            r4 = r14
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x002f
        L_0x002b:
            lp0.l r1 = androidx.compose.ui.platform.InspectableValueKt.a()
        L_0x002f:
            androidx.compose.foundation.gestures.ScrollableKt$scrollable$2 r12 = new androidx.compose.foundation.gestures.ScrollableKt$scrollable$2
            r2 = r12
            r3 = r15
            r4 = r14
            r5 = r18
            r6 = r20
            r7 = r19
            r8 = r16
            r9 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            p0.d r0 = androidx.compose.ui.ComposedModifierKt.c(r13, r1, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.h(p0.d, y1$r, androidx.compose.foundation.gestures.Orientation, s.l, boolean, boolean, y1$k, u.k):p0.d");
    }

    public static final d i(d dVar, y1.r rVar, Orientation orientation, boolean z11, boolean z12, y1.k kVar, k kVar2) {
        p.j(dVar, "<this>");
        p.j(rVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        p.j(orientation, "orientation");
        return h(dVar, rVar, orientation, (l) null, z11, z12, kVar, kVar2);
    }

    public static /* synthetic */ d j(d dVar, y1.r rVar, Orientation orientation, boolean z11, boolean z12, y1.k kVar, k kVar2, int i11, Object obj) {
        return i(dVar, rVar, orientation, (i11 & 4) != 0 ? true : z11, (i11 & 8) != 0 ? false : z12, (i11 & 16) != 0 ? null : kVar, (i11 & 32) != 0 ? null : kVar2);
    }

    private static final b k(d1<ScrollingLogic> d1Var, boolean z11) {
        return new ScrollableKt$scrollableNestedScrollConnection$1(z11, d1Var);
    }
}
