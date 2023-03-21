package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventPass;
import bp0.k;
import defpackage.y1;
import f1.d;
import f1.d0;
import f1.v;
import fp0.c;
import lp0.l;
import lp0.q;
import t0.f;
import wp0.k0;

/* compiled from: TapGestureDetector.kt */
public final class TapGestureDetectorKt {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final q<y1.n, f, c<? super k>, Object> f3545a = new TapGestureDetectorKt$NoPressGesture$1((c<? super TapGestureDetectorKt$NoPressGesture$1>) null);

    public static final Object d(d dVar, boolean z11, c<? super v> cVar) {
        return f(dVar, PointerEventPass.Main, z11, cVar);
    }

    public static /* synthetic */ Object e(d dVar, boolean z11, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return d(dVar, z11, cVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0076 A[SYNTHETIC] */
    public static final java.lang.Object f(f1.d r9, androidx.compose.ui.input.pointer.PointerEventPass r10, boolean r11, fp0.c<? super f1.v> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1) r0
            int r1 = r0.f3551e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f3551e = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1
            r0.<init>(r12)
        L_0x0018:
            java.lang.Object r12 = r0.f3550d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f3551e
            r3 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            boolean r9 = r0.f3549c
            java.lang.Object r10 = r0.f3548b
            androidx.compose.ui.input.pointer.PointerEventPass r10 = (androidx.compose.ui.input.pointer.PointerEventPass) r10
            java.lang.Object r11 = r0.f3547a
            f1.d r11 = (f1.d) r11
            bp0.g.b(r12)
            r8 = r11
            r11 = r9
            r9 = r8
            goto L_0x0050
        L_0x0036:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003e:
            bp0.g.b(r12)
        L_0x0041:
            r0.f3547a = r9
            r0.f3548b = r10
            r0.f3549c = r11
            r0.f3551e = r3
            java.lang.Object r12 = r9.r0(r10, r0)
            if (r12 != r1) goto L_0x0050
            return r1
        L_0x0050:
            f1.n r12 = (f1.n) r12
            java.util.List r2 = r12.c()
            int r4 = r2.size()
            r5 = 0
            r6 = 0
        L_0x005c:
            if (r6 >= r4) goto L_0x0076
            java.lang.Object r7 = r2.get(r6)
            f1.v r7 = (f1.v) r7
            if (r11 == 0) goto L_0x006b
            boolean r7 = f1.o.a(r7)
            goto L_0x006f
        L_0x006b:
            boolean r7 = f1.o.b(r7)
        L_0x006f:
            if (r7 != 0) goto L_0x0073
            r2 = 0
            goto L_0x0077
        L_0x0073:
            int r6 = r6 + 1
            goto L_0x005c
        L_0x0076:
            r2 = 1
        L_0x0077:
            if (r2 == 0) goto L_0x0041
            java.util.List r9 = r12.c()
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.f(f1.d, androidx.compose.ui.input.pointer.PointerEventPass, boolean, fp0.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final Object g(d dVar, v vVar, c<? super v> cVar) {
        return dVar.w0(dVar.getViewConfiguration().c(), new TapGestureDetectorKt$awaitSecondDown$2(vVar, (c<? super TapGestureDetectorKt$awaitSecondDown$2>) null), cVar);
    }

    /* access modifiers changed from: private */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052 A[LOOP:0: B:17:0x0050->B:18:0x0052, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007a A[EDGE_INSN: B:30:0x007a->B:25:0x007a ?: BREAK  , SYNTHETIC] */
    public static final java.lang.Object h(f1.d r8, fp0.c<? super bp0.k> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1) r0
            int r1 = r0.f3558c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f3558c = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.f3557b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f3558c
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r8 = r0.f3556a
            f1.d r8 = (f1.d) r8
            bp0.g.b(r9)
            goto L_0x0044
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            bp0.g.b(r9)
        L_0x0038:
            r0.f3556a = r8
            r0.f3558c = r3
            r9 = 0
            java.lang.Object r9 = f1.c.a(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L_0x0044
            return r1
        L_0x0044:
            f1.n r9 = (f1.n) r9
            java.util.List r2 = r9.c()
            int r4 = r2.size()
            r5 = 0
            r6 = 0
        L_0x0050:
            if (r6 >= r4) goto L_0x005e
            java.lang.Object r7 = r2.get(r6)
            f1.v r7 = (f1.v) r7
            r7.a()
            int r6 = r6 + 1
            goto L_0x0050
        L_0x005e:
            java.util.List r9 = r9.c()
            int r2 = r9.size()
            r4 = 0
        L_0x0067:
            if (r4 >= r2) goto L_0x007a
            java.lang.Object r6 = r9.get(r4)
            f1.v r6 = (f1.v) r6
            boolean r6 = r6.g()
            if (r6 == 0) goto L_0x0077
            r5 = 1
            goto L_0x007a
        L_0x0077:
            int r4 = r4 + 1
            goto L_0x0067
        L_0x007a:
            if (r5 != 0) goto L_0x0038
            bp0.k r8 = bp0.k.f22762a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.h(f1.d, fp0.c):java.lang.Object");
    }

    public static final Object i(d0 d0Var, q<? super y1.n, ? super f, ? super c<? super k>, ? extends Object> qVar, l<? super f, k> lVar, c<? super k> cVar) {
        Object d11 = ForEachGestureKt.d(d0Var, new TapGestureDetectorKt$detectTapAndPress$2(new PressGestureScopeImpl(d0Var), qVar, lVar, (c<? super TapGestureDetectorKt$detectTapAndPress$2>) null), cVar);
        return d11 == b.d() ? d11 : k.f22762a;
    }

    public static final Object j(d0 d0Var, l<? super f, k> lVar, l<? super f, k> lVar2, q<? super y1.n, ? super f, ? super c<? super k>, ? extends Object> qVar, l<? super f, k> lVar3, c<? super k> cVar) {
        Object e11 = k0.e(new TapGestureDetectorKt$detectTapGestures$2(d0Var, qVar, lVar2, lVar, lVar3, (c<? super TapGestureDetectorKt$detectTapGestures$2>) null), cVar);
        return e11 == b.d() ? e11 : k.f22762a;
    }

    public static /* synthetic */ Object k(d0 d0Var, l lVar, l lVar2, q<y1.n, f, c<? super k>, Object> qVar, l lVar3, c cVar, int i11, Object obj) {
        l lVar4 = (i11 & 1) != 0 ? null : lVar;
        l lVar5 = (i11 & 2) != 0 ? null : lVar2;
        if ((i11 & 4) != 0) {
            qVar = f3545a;
        }
        return j(d0Var, lVar4, lVar5, qVar, (i11 & 8) != 0 ? null : lVar3, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00df A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0071 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00dc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object l(f1.d r13, fp0.c<? super f1.v> r14) {
        /*
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$1) r0
            int r1 = r0.f3623c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f3623c = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$1
            r0.<init>(r14)
        L_0x0018:
            java.lang.Object r14 = r0.f3622b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f3623c
            r3 = 0
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 == r6) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            java.lang.Object r13 = r0.f3621a
            f1.d r13 = (f1.d) r13
            bp0.g.b(r14)
            goto L_0x00be
        L_0x0033:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003b:
            java.lang.Object r13 = r0.f3621a
            f1.d r13 = (f1.d) r13
            bp0.g.b(r14)
            goto L_0x0053
        L_0x0043:
            bp0.g.b(r14)
        L_0x0046:
            androidx.compose.ui.input.pointer.PointerEventPass r14 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            r0.f3621a = r13
            r0.f3623c = r6
            java.lang.Object r14 = r13.r0(r14, r0)
            if (r14 != r1) goto L_0x0053
            return r1
        L_0x0053:
            f1.n r14 = (f1.n) r14
            java.util.List r2 = r14.c()
            int r7 = r2.size()
            r8 = 0
        L_0x005e:
            if (r8 >= r7) goto L_0x0071
            java.lang.Object r9 = r2.get(r8)
            f1.v r9 = (f1.v) r9
            boolean r9 = f1.o.c(r9)
            if (r9 != 0) goto L_0x006e
            r2 = 0
            goto L_0x0072
        L_0x006e:
            int r8 = r8 + 1
            goto L_0x005e
        L_0x0071:
            r2 = 1
        L_0x0072:
            if (r2 == 0) goto L_0x007d
            java.util.List r13 = r14.c()
            java.lang.Object r13 = r13.get(r5)
            return r13
        L_0x007d:
            java.util.List r14 = r14.c()
            int r2 = r14.size()
            r7 = 0
        L_0x0086:
            if (r7 >= r2) goto L_0x00ad
            java.lang.Object r8 = r14.get(r7)
            f1.v r8 = (f1.v) r8
            boolean r9 = r8.m()
            if (r9 != 0) goto L_0x00a5
            long r9 = r13.a()
            long r11 = r13.d0()
            boolean r8 = f1.o.f(r8, r9, r11)
            if (r8 == 0) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            r8 = 0
            goto L_0x00a6
        L_0x00a5:
            r8 = 1
        L_0x00a6:
            if (r8 == 0) goto L_0x00aa
            r14 = 1
            goto L_0x00ae
        L_0x00aa:
            int r7 = r7 + 1
            goto L_0x0086
        L_0x00ad:
            r14 = 0
        L_0x00ae:
            if (r14 == 0) goto L_0x00b1
            return r3
        L_0x00b1:
            androidx.compose.ui.input.pointer.PointerEventPass r14 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r0.f3621a = r13
            r0.f3623c = r4
            java.lang.Object r14 = r13.r0(r14, r0)
            if (r14 != r1) goto L_0x00be
            return r1
        L_0x00be:
            f1.n r14 = (f1.n) r14
            java.util.List r14 = r14.c()
            int r2 = r14.size()
            r7 = 0
        L_0x00c9:
            if (r7 >= r2) goto L_0x00dc
            java.lang.Object r8 = r14.get(r7)
            f1.v r8 = (f1.v) r8
            boolean r8 = r8.m()
            if (r8 == 0) goto L_0x00d9
            r14 = 1
            goto L_0x00dd
        L_0x00d9:
            int r7 = r7 + 1
            goto L_0x00c9
        L_0x00dc:
            r14 = 0
        L_0x00dd:
            if (r14 == 0) goto L_0x0046
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.l(f1.d, fp0.c):java.lang.Object");
    }
}
