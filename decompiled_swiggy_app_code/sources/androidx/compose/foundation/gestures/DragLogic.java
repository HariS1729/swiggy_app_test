package androidx.compose.foundation.gestures;

import bp0.k;
import e0.h0;
import fp0.c;
import kotlin.jvm.internal.p;
import lp0.q;
import t0.f;
import u.b;
import wp0.j0;

/* compiled from: Draggable.kt */
final class DragLogic {

    /* renamed from: a  reason: collision with root package name */
    private final q<j0, f, c<? super k>, Object> f3328a;

    /* renamed from: b  reason: collision with root package name */
    private final q<j0, Float, c<? super k>, Object> f3329b;

    /* renamed from: c  reason: collision with root package name */
    private final h0<b> f3330c;

    /* renamed from: d  reason: collision with root package name */
    private final u.k f3331d;

    public DragLogic(q<? super j0, ? super f, ? super c<? super k>, ? extends Object> qVar, q<? super j0, ? super Float, ? super c<? super k>, ? extends Object> qVar2, h0<b> h0Var, u.k kVar) {
        p.j(qVar, "onDragStarted");
        p.j(qVar2, "onDragStopped");
        p.j(h0Var, "dragStartInteraction");
        this.f3328a = qVar;
        this.f3329b = qVar2;
        this.f3330c = h0Var;
        this.f3331d = kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(wp0.j0 r8, fp0.c<? super bp0.k> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.DragLogic$processDragCancel$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.foundation.gestures.DragLogic$processDragCancel$1 r0 = (androidx.compose.foundation.gestures.DragLogic$processDragCancel$1) r0
            int r1 = r0.f3336e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f3336e = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.DragLogic$processDragCancel$1 r0 = new androidx.compose.foundation.gestures.DragLogic$processDragCancel$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f3334c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f3336e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            bp0.g.b(r9)
            goto L_0x0080
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            java.lang.Object r8 = r0.f3333b
            wp0.j0 r8 = (wp0.j0) r8
            java.lang.Object r2 = r0.f3332a
            androidx.compose.foundation.gestures.DragLogic r2 = (androidx.compose.foundation.gestures.DragLogic) r2
            bp0.g.b(r9)
            goto L_0x0065
        L_0x0041:
            bp0.g.b(r9)
            e0.h0<u.b> r9 = r7.f3330c
            java.lang.Object r9 = r9.getValue()
            u.b r9 = (u.b) r9
            if (r9 == 0) goto L_0x006b
            u.k r2 = r7.f3331d
            if (r2 == 0) goto L_0x0064
            u.a r6 = new u.a
            r6.<init>(r9)
            r0.f3332a = r7
            r0.f3333b = r8
            r0.f3336e = r4
            java.lang.Object r9 = r2.c(r6, r0)
            if (r9 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r2 = r7
        L_0x0065:
            e0.h0<u.b> r9 = r2.f3330c
            r9.setValue(r5)
            goto L_0x006c
        L_0x006b:
            r2 = r7
        L_0x006c:
            lp0.q<wp0.j0, java.lang.Float, fp0.c<? super bp0.k>, java.lang.Object> r9 = r2.f3329b
            r2 = 0
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.a.c(r2)
            r0.f3332a = r5
            r0.f3333b = r5
            r0.f3336e = r3
            java.lang.Object r8 = r9.invoke(r8, r2, r0)
            if (r8 != r1) goto L_0x0080
            return r1
        L_0x0080:
            bp0.k r8 = bp0.k.f22762a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragLogic.a(wp0.j0, fp0.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(wp0.j0 r9, defpackage.y1.g.c r10, fp0.c<? super bp0.k> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.gestures.DragLogic$processDragStart$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.foundation.gestures.DragLogic$processDragStart$1 r0 = (androidx.compose.foundation.gestures.DragLogic$processDragStart$1) r0
            int r1 = r0.f3343g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f3343g = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.DragLogic$processDragStart$1 r0 = new androidx.compose.foundation.gestures.DragLogic$processDragStart$1
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f3341e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f3343g
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x005f
            if (r2 == r5) goto L_0x004c
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            bp0.g.b(r11)
            goto L_0x00c6
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            java.lang.Object r9 = r0.f3340d
            u.b r9 = (u.b) r9
            java.lang.Object r10 = r0.f3339c
            y1$g$c r10 = (defpackage.y1.g.c) r10
            java.lang.Object r2 = r0.f3338b
            wp0.j0 r2 = (wp0.j0) r2
            java.lang.Object r4 = r0.f3337a
            androidx.compose.foundation.gestures.DragLogic r4 = (androidx.compose.foundation.gestures.DragLogic) r4
            bp0.g.b(r11)
            goto L_0x00a2
        L_0x004c:
            java.lang.Object r9 = r0.f3339c
            y1$g$c r9 = (defpackage.y1.g.c) r9
            java.lang.Object r10 = r0.f3338b
            wp0.j0 r10 = (wp0.j0) r10
            java.lang.Object r2 = r0.f3337a
            androidx.compose.foundation.gestures.DragLogic r2 = (androidx.compose.foundation.gestures.DragLogic) r2
            bp0.g.b(r11)
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x0085
        L_0x005f:
            bp0.g.b(r11)
            e0.h0<u.b> r11 = r8.f3330c
            java.lang.Object r11 = r11.getValue()
            u.b r11 = (u.b) r11
            if (r11 == 0) goto L_0x0084
            u.k r2 = r8.f3331d
            if (r2 == 0) goto L_0x0084
            u.a r6 = new u.a
            r6.<init>(r11)
            r0.f3337a = r8
            r0.f3338b = r9
            r0.f3339c = r10
            r0.f3343g = r5
            java.lang.Object r11 = r2.c(r6, r0)
            if (r11 != r1) goto L_0x0084
            return r1
        L_0x0084:
            r2 = r8
        L_0x0085:
            u.b r11 = new u.b
            r11.<init>()
            u.k r5 = r2.f3331d
            if (r5 == 0) goto L_0x00a5
            r0.f3337a = r2
            r0.f3338b = r9
            r0.f3339c = r10
            r0.f3340d = r11
            r0.f3343g = r4
            java.lang.Object r4 = r5.c(r11, r0)
            if (r4 != r1) goto L_0x009f
            return r1
        L_0x009f:
            r4 = r2
            r2 = r9
            r9 = r11
        L_0x00a2:
            r11 = r9
            r9 = r2
            r2 = r4
        L_0x00a5:
            e0.h0<u.b> r4 = r2.f3330c
            r4.setValue(r11)
            lp0.q<wp0.j0, t0.f, fp0.c<? super bp0.k>, java.lang.Object> r11 = r2.f3328a
            long r4 = r10.a()
            t0.f r10 = t0.f.d(r4)
            r2 = 0
            r0.f3337a = r2
            r0.f3338b = r2
            r0.f3339c = r2
            r0.f3340d = r2
            r0.f3343g = r3
            java.lang.Object r9 = r11.invoke(r9, r10, r0)
            if (r9 != r1) goto L_0x00c6
            return r1
        L_0x00c6:
            bp0.k r9 = bp0.k.f22762a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragLogic.b(wp0.j0, y1$g$c, fp0.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(wp0.j0 r9, defpackage.y1.g.d r10, fp0.c<? super bp0.k> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.gestures.DragLogic$processDragStop$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.foundation.gestures.DragLogic$processDragStop$1 r0 = (androidx.compose.foundation.gestures.DragLogic$processDragStop$1) r0
            int r1 = r0.f3349f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f3349f = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.DragLogic$processDragStop$1 r0 = new androidx.compose.foundation.gestures.DragLogic$processDragStop$1
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f3347d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f3349f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0048
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            bp0.g.b(r11)
            goto L_0x008e
        L_0x002d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0035:
            java.lang.Object r9 = r0.f3346c
            y1$g$d r9 = (defpackage.y1.g.d) r9
            java.lang.Object r10 = r0.f3345b
            wp0.j0 r10 = (wp0.j0) r10
            java.lang.Object r2 = r0.f3344a
            androidx.compose.foundation.gestures.DragLogic r2 = (androidx.compose.foundation.gestures.DragLogic) r2
            bp0.g.b(r11)
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x006e
        L_0x0048:
            bp0.g.b(r11)
            e0.h0<u.b> r11 = r8.f3330c
            java.lang.Object r11 = r11.getValue()
            u.b r11 = (u.b) r11
            if (r11 == 0) goto L_0x0074
            u.k r2 = r8.f3331d
            if (r2 == 0) goto L_0x006d
            u.c r6 = new u.c
            r6.<init>(r11)
            r0.f3344a = r8
            r0.f3345b = r9
            r0.f3346c = r10
            r0.f3349f = r4
            java.lang.Object r11 = r2.c(r6, r0)
            if (r11 != r1) goto L_0x006d
            return r1
        L_0x006d:
            r2 = r8
        L_0x006e:
            e0.h0<u.b> r11 = r2.f3330c
            r11.setValue(r5)
            goto L_0x0075
        L_0x0074:
            r2 = r8
        L_0x0075:
            lp0.q<wp0.j0, java.lang.Float, fp0.c<? super bp0.k>, java.lang.Object> r11 = r2.f3329b
            float r10 = r10.a()
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.a.c(r10)
            r0.f3344a = r5
            r0.f3345b = r5
            r0.f3346c = r5
            r0.f3349f = r3
            java.lang.Object r9 = r11.invoke(r9, r10, r0)
            if (r9 != r1) goto L_0x008e
            return r1
        L_0x008e:
            bp0.k r9 = bp0.k.f22762a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragLogic.c(wp0.j0, y1$g$d, fp0.c):java.lang.Object");
    }
}
