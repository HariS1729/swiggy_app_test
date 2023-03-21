package androidx.compose.foundation.gestures;

import androidx.compose.ui.platform.n1;
import bp0.k;
import d2.h;
import f1.d0;
import f1.g0;
import f1.n;
import f1.u;
import f1.v;
import fp0.c;
import java.util.List;
import lp0.a;
import lp0.l;
import lp0.p;
import t0.f;

/* compiled from: DragGestureDetector.kt */
public final class DragGestureDetectorKt {

    /* renamed from: a  reason: collision with root package name */
    private static final float f3236a;

    /* renamed from: b  reason: collision with root package name */
    private static final float f3237b;

    /* renamed from: c  reason: collision with root package name */
    private static final float f3238c;

    static {
        float n = h.n((float) 0.125d);
        f3236a = n;
        float n11 = h.n((float) 18);
        f3237b = n11;
        f3238c = n / n11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cb, code lost:
        if (f1.o.j(r11) != false) goto L_0x00cd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0091 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(f1.d r17, long r18, fp0.c<? super f1.v> r20) {
        /*
            r0 = r18
            r2 = r20
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1 r3 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1) r3
            int r4 = r3.f3242d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.f3242d = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.f3241c
            java.lang.Object r4 = kotlin.coroutines.intrinsics.b.d()
            int r5 = r3.f3242d
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x0043
            if (r5 != r6) goto L_0x003b
            java.lang.Object r0 = r3.f3240b
            kotlin.jvm.internal.Ref$LongRef r0 = (kotlin.jvm.internal.Ref$LongRef) r0
            java.lang.Object r1 = r3.f3239a
            f1.d r1 = (f1.d) r1
            bp0.g.b(r2)
            r16 = r1
            r1 = r0
            r0 = r16
            goto L_0x006c
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            bp0.g.b(r2)
            f1.n r2 = r17.p0()
            boolean r2 = l(r2, r0)
            if (r2 == 0) goto L_0x0051
            return r7
        L_0x0051:
            kotlin.jvm.internal.Ref$LongRef r2 = new kotlin.jvm.internal.Ref$LongRef
            r2.<init>()
            r2.f25665a = r0
            r0 = r17
        L_0x005a:
            r3.f3239a = r0
            r3.f3240b = r2
            r3.f3242d = r6
            java.lang.Object r1 = f1.c.a(r0, r7, r3, r6, r7)
            if (r1 != r4) goto L_0x0067
            return r4
        L_0x0067:
            r16 = r2
            r2 = r1
            r1 = r16
        L_0x006c:
            f1.n r2 = (f1.n) r2
            java.util.List r5 = r2.c()
            int r8 = r5.size()
            r9 = 0
            r10 = 0
        L_0x0078:
            if (r10 >= r8) goto L_0x0091
            java.lang.Object r11 = r5.get(r10)
            r12 = r11
            f1.v r12 = (f1.v) r12
            long r12 = r12.e()
            long r14 = r1.f25665a
            boolean r12 = f1.u.d(r12, r14)
            if (r12 == 0) goto L_0x008e
            goto L_0x0092
        L_0x008e:
            int r10 = r10 + 1
            goto L_0x0078
        L_0x0091:
            r11 = r7
        L_0x0092:
            f1.v r11 = (f1.v) r11
            if (r11 != 0) goto L_0x0098
            r11 = r7
            goto L_0x00cd
        L_0x0098:
            boolean r5 = f1.o.d(r11)
            if (r5 == 0) goto L_0x00c7
            java.util.List r2 = r2.c()
            int r5 = r2.size()
            r8 = 0
        L_0x00a7:
            if (r8 >= r5) goto L_0x00ba
            java.lang.Object r10 = r2.get(r8)
            r12 = r10
            f1.v r12 = (f1.v) r12
            boolean r12 = r12.g()
            if (r12 == 0) goto L_0x00b7
            goto L_0x00bb
        L_0x00b7:
            int r8 = r8 + 1
            goto L_0x00a7
        L_0x00ba:
            r10 = r7
        L_0x00bb:
            f1.v r10 = (f1.v) r10
            if (r10 != 0) goto L_0x00c0
            goto L_0x00cd
        L_0x00c0:
            long r8 = r10.e()
            r1.f25665a = r8
            goto L_0x00db
        L_0x00c7:
            boolean r2 = f1.o.j(r11)
            if (r2 == 0) goto L_0x00db
        L_0x00cd:
            if (r11 == 0) goto L_0x00d6
            boolean r0 = r11.m()
            if (r0 != 0) goto L_0x00d6
            goto L_0x00d7
        L_0x00d6:
            r6 = 0
        L_0x00d7:
            if (r6 == 0) goto L_0x00da
            r7 = r11
        L_0x00da:
            return r7
        L_0x00db:
            r2 = r1
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.c(f1.d, long, fp0.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(f1.d r19, long r20, int r22, lp0.p<? super f1.v, ? super java.lang.Float, bp0.k> r23, fp0.c<? super f1.v> r24) {
        /*
            r0 = r20
            r2 = r24
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 r3 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) r3
            int r4 = r3.f3250h
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.f3250h = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.f3249g
            java.lang.Object r4 = kotlin.coroutines.intrinsics.b.d()
            int r5 = r3.f3250h
            r7 = 2
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L_0x0073
            if (r5 == r8) goto L_0x0055
            if (r5 != r7) goto L_0x004d
            float r0 = r3.f3248f
            float r1 = r3.f3247e
            java.lang.Object r5 = r3.f3246d
            f1.v r5 = (f1.v) r5
            java.lang.Object r10 = r3.f3245c
            kotlin.jvm.internal.Ref$LongRef r10 = (kotlin.jvm.internal.Ref$LongRef) r10
            java.lang.Object r11 = r3.f3244b
            f1.d r11 = (f1.d) r11
            java.lang.Object r12 = r3.f3243a
            lp0.p r12 = (lp0.p) r12
            bp0.g.b(r2)
            r2 = r0
            r0 = r11
            r11 = r10
            r10 = r4
            r4 = r3
            r3 = r1
            r1 = r12
            goto L_0x015e
        L_0x004d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0055:
            float r0 = r3.f3248f
            float r1 = r3.f3247e
            java.lang.Object r5 = r3.f3245c
            kotlin.jvm.internal.Ref$LongRef r5 = (kotlin.jvm.internal.Ref$LongRef) r5
            java.lang.Object r10 = r3.f3244b
            f1.d r10 = (f1.d) r10
            java.lang.Object r11 = r3.f3243a
            lp0.p r11 = (lp0.p) r11
            bp0.g.b(r2)
            r18 = r3
            r3 = r0
            r0 = r10
            r10 = r4
            r4 = r1
            r1 = r11
            r11 = r5
            r5 = r18
            goto L_0x00ba
        L_0x0073:
            bp0.g.b(r2)
            f1.n r2 = r19.p0()
            boolean r2 = l(r2, r0)
            if (r2 == 0) goto L_0x0082
            goto L_0x0182
        L_0x0082:
            androidx.compose.ui.platform.n1 r2 = r19.getViewConfiguration()
            r5 = r22
            float r2 = m(r2, r5)
            kotlin.jvm.internal.Ref$LongRef r5 = new kotlin.jvm.internal.Ref$LongRef
            r5.<init>()
            r5.f25665a = r0
            r0 = r19
            r1 = r23
            r10 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = 0
        L_0x009c:
            r4.f3243a = r1
            r4.f3244b = r0
            r4.f3245c = r10
            r4.f3246d = r9
            r4.f3247e = r3
            r4.f3248f = r2
            r4.f3250h = r8
            java.lang.Object r11 = f1.c.a(r0, r9, r4, r8, r9)
            if (r11 != r5) goto L_0x00b1
            return r5
        L_0x00b1:
            r18 = r3
            r3 = r2
            r2 = r11
            r11 = r10
            r10 = r5
            r5 = r4
            r4 = r18
        L_0x00ba:
            f1.n r2 = (f1.n) r2
            java.util.List r12 = r2.c()
            int r13 = r12.size()
            r14 = 0
            r15 = 0
        L_0x00c6:
            if (r15 >= r13) goto L_0x00e3
            java.lang.Object r16 = r12.get(r15)
            r17 = r16
            f1.v r17 = (f1.v) r17
            long r8 = r17.e()
            long r6 = r11.f25665a
            boolean r6 = f1.u.d(r8, r6)
            if (r6 == 0) goto L_0x00dd
            goto L_0x00e5
        L_0x00dd:
            int r15 = r15 + 1
            r7 = 2
            r8 = 1
            r9 = 0
            goto L_0x00c6
        L_0x00e3:
            r16 = 0
        L_0x00e5:
            r6 = r16
            f1.v r6 = (f1.v) r6
            if (r6 != 0) goto L_0x00ed
            goto L_0x0164
        L_0x00ed:
            boolean r7 = r6.m()
            if (r7 == 0) goto L_0x00f5
            goto L_0x0164
        L_0x00f5:
            boolean r7 = f1.o.d(r6)
            if (r7 == 0) goto L_0x0129
            java.util.List r2 = r2.c()
            int r6 = r2.size()
        L_0x0103:
            if (r14 >= r6) goto L_0x0116
            java.lang.Object r7 = r2.get(r14)
            r8 = r7
            f1.v r8 = (f1.v) r8
            boolean r8 = r8.g()
            if (r8 == 0) goto L_0x0113
            goto L_0x0117
        L_0x0113:
            int r14 = r14 + 1
            goto L_0x0103
        L_0x0116:
            r7 = 0
        L_0x0117:
            f1.v r7 = (f1.v) r7
            if (r7 != 0) goto L_0x011c
            goto L_0x0164
        L_0x011c:
            long r6 = r7.e()
            r11.f25665a = r6
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r10
            r10 = r11
            r7 = 2
            goto L_0x0168
        L_0x0129:
            long r7 = r6.f()
            long r12 = r6.h()
            float r2 = t0.f.m(r7)
            float r7 = t0.f.m(r12)
            float r2 = r2 - r7
            float r2 = r2 + r3
            float r3 = java.lang.Math.abs(r2)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x016c
            androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r5.f3243a = r1
            r5.f3244b = r0
            r5.f3245c = r11
            r5.f3246d = r6
            r5.f3247e = r4
            r5.f3248f = r2
            r7 = 2
            r5.f3250h = r7
            java.lang.Object r3 = r0.r0(r3, r5)
            if (r3 != r10) goto L_0x015b
            return r10
        L_0x015b:
            r3 = r4
            r4 = r5
            r5 = r6
        L_0x015e:
            boolean r5 = r5.m()
            if (r5 == 0) goto L_0x0166
        L_0x0164:
            r9 = 0
            goto L_0x0182
        L_0x0166:
            r5 = r10
            r10 = r11
        L_0x0168:
            r8 = 1
            r9 = 0
            goto L_0x009c
        L_0x016c:
            r7 = 2
            float r3 = java.lang.Math.signum(r2)
            float r3 = r3 * r4
            float r2 = r2 - r3
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.a.c(r2)
            r1.invoke(r6, r2)
            boolean r2 = r6.m()
            if (r2 == 0) goto L_0x0183
            r9 = r6
        L_0x0182:
            return r9
        L_0x0183:
            r3 = r4
            r4 = r5
            r5 = r10
            r10 = r11
            r2 = 0
            goto L_0x0168
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.d(f1.d, long, int, lp0.p, fp0.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object e(f1.d0 r8, T r9, fp0.c<? super f1.v> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1) r0
            int r1 = r0.f3254d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f3254d = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.f3253c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f3254d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            java.lang.Object r8 = r0.f3252b
            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref$ObjectRef) r8
            java.lang.Object r9 = r0.f3251a
            f1.v r9 = (f1.v) r9
            bp0.g.b(r10)     // Catch:{ TimeoutCancellationException -> 0x0032 }
            goto L_0x006f
        L_0x0032:
            goto L_0x0066
        L_0x0034:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003c:
            bp0.g.b(r10)
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            r2.f25666a = r9
            androidx.compose.ui.platform.n1 r5 = r8.getViewConfiguration()
            long r5 = r5.d()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2 r7 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2     // Catch:{ TimeoutCancellationException -> 0x0065 }
            r7.<init>(r8, r2, r10, r3)     // Catch:{ TimeoutCancellationException -> 0x0065 }
            r0.f3251a = r9     // Catch:{ TimeoutCancellationException -> 0x0065 }
            r0.f3252b = r10     // Catch:{ TimeoutCancellationException -> 0x0065 }
            r0.f3254d = r4     // Catch:{ TimeoutCancellationException -> 0x0065 }
            java.lang.Object r8 = kotlinx.coroutines.TimeoutKt.c(r5, r7, r0)     // Catch:{ TimeoutCancellationException -> 0x0065 }
            if (r8 != r1) goto L_0x006f
            return r1
        L_0x0065:
            r8 = r10
        L_0x0066:
            T r8 = r8.f25666a
            f1.v r8 = (f1.v) r8
            if (r8 != 0) goto L_0x006e
            r3 = r9
            goto L_0x006f
        L_0x006e:
            r3 = r8
        L_0x006f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.e(f1.d0, f1.v, fp0.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ac A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ec A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00dd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object f(f1.d r19, long r20, int r22, lp0.p<? super f1.v, ? super t0.f, bp0.k> r23, fp0.c<? super f1.v> r24) {
        /*
            r0 = r20
            r2 = r24
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 r3 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1) r3
            int r4 = r3.f3272h
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.f3272h = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitPointerSlopOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.f3271g
            java.lang.Object r4 = kotlin.coroutines.intrinsics.b.d()
            int r5 = r3.f3272h
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x006f
            if (r5 == r7) goto L_0x0051
            if (r5 != r6) goto L_0x0049
            float r0 = r3.f3270f
            long r9 = r3.f3269e
            java.lang.Object r1 = r3.f3268d
            f1.v r1 = (f1.v) r1
            java.lang.Object r5 = r3.f3267c
            kotlin.jvm.internal.Ref$LongRef r5 = (kotlin.jvm.internal.Ref$LongRef) r5
            java.lang.Object r11 = r3.f3266b
            lp0.p r11 = (lp0.p) r11
            java.lang.Object r12 = r3.f3265a
            f1.d r12 = (f1.d) r12
            bp0.g.b(r2)
            r2 = r0
            r0 = r12
            r7 = 2
            goto L_0x0175
        L_0x0049:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0051:
            float r0 = r3.f3270f
            long r9 = r3.f3269e
            java.lang.Object r1 = r3.f3267c
            kotlin.jvm.internal.Ref$LongRef r1 = (kotlin.jvm.internal.Ref$LongRef) r1
            java.lang.Object r5 = r3.f3266b
            lp0.p r5 = (lp0.p) r5
            java.lang.Object r11 = r3.f3265a
            f1.d r11 = (f1.d) r11
            bp0.g.b(r2)
            r18 = r3
            r3 = r0
            r0 = r11
            r10 = r9
            r9 = r1
            r1 = r5
        L_0x006b:
            r5 = r4
            r4 = r18
            goto L_0x00b4
        L_0x006f:
            bp0.g.b(r2)
            f1.n r2 = r19.p0()
            boolean r2 = l(r2, r0)
            if (r2 == 0) goto L_0x007d
            return r8
        L_0x007d:
            t0.f$a r2 = t0.f.f16662b
            long r9 = r2.c()
            androidx.compose.ui.platform.n1 r2 = r19.getViewConfiguration()
            r5 = r22
            float r2 = m(r2, r5)
            kotlin.jvm.internal.Ref$LongRef r5 = new kotlin.jvm.internal.Ref$LongRef
            r5.<init>()
            r5.f25665a = r0
            r0 = r19
            r1 = r23
        L_0x0098:
            r3.f3265a = r0
            r3.f3266b = r1
            r3.f3267c = r5
            r3.f3268d = r8
            r3.f3269e = r9
            r3.f3270f = r2
            r3.f3272h = r7
            java.lang.Object r11 = f1.c.a(r0, r8, r3, r7, r8)
            if (r11 != r4) goto L_0x00ad
            return r4
        L_0x00ad:
            r18 = r3
            r3 = r2
            r2 = r11
            r10 = r9
            r9 = r5
            goto L_0x006b
        L_0x00b4:
            f1.n r2 = (f1.n) r2
            java.util.List r12 = r2.c()
            int r13 = r12.size()
            r15 = 0
        L_0x00bf:
            if (r15 >= r13) goto L_0x00dd
            java.lang.Object r16 = r12.get(r15)
            r17 = r16
            f1.v r17 = (f1.v) r17
            long r6 = r17.e()
            r17 = r15
            long r14 = r9.f25665a
            boolean r6 = f1.u.d(r6, r14)
            if (r6 == 0) goto L_0x00d8
            goto L_0x00df
        L_0x00d8:
            int r15 = r17 + 1
            r6 = 2
            r7 = 1
            goto L_0x00bf
        L_0x00dd:
            r16 = r8
        L_0x00df:
            r6 = r16
            f1.v r6 = (f1.v) r6
            if (r6 != 0) goto L_0x00e6
            return r8
        L_0x00e6:
            boolean r7 = r6.m()
            if (r7 == 0) goto L_0x00ed
            return r8
        L_0x00ed:
            boolean r7 = f1.o.d(r6)
            if (r7 == 0) goto L_0x0121
            java.util.List r2 = r2.c()
            int r6 = r2.size()
            r14 = 0
        L_0x00fc:
            if (r14 >= r6) goto L_0x010f
            java.lang.Object r7 = r2.get(r14)
            r12 = r7
            f1.v r12 = (f1.v) r12
            boolean r12 = r12.g()
            if (r12 == 0) goto L_0x010c
            goto L_0x0110
        L_0x010c:
            int r14 = r14 + 1
            goto L_0x00fc
        L_0x010f:
            r7 = r8
        L_0x0110:
            f1.v r7 = (f1.v) r7
            if (r7 != 0) goto L_0x0115
            return r8
        L_0x0115:
            long r6 = r7.e()
            r9.f25665a = r6
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r9
            r9 = r10
            goto L_0x017d
        L_0x0121:
            long r12 = f1.o.g(r6)
            long r10 = t0.f.r(r10, r12)
            float r2 = t0.f.k(r10)
            int r7 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r7 < 0) goto L_0x0152
            long r12 = t0.f.h(r10, r2)
            long r12 = t0.f.s(r12, r3)
            long r12 = t0.f.q(r10, r12)
            t0.f r2 = t0.f.d(r12)
            r1.invoke(r6, r2)
            boolean r2 = r6.m()
            if (r2 == 0) goto L_0x014c
            r14 = 1
            goto L_0x0153
        L_0x014c:
            t0.f$a r2 = t0.f.f16662b
            long r10 = r2.c()
        L_0x0152:
            r14 = 0
        L_0x0153:
            if (r14 == 0) goto L_0x0156
            return r6
        L_0x0156:
            androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r4.f3265a = r0
            r4.f3266b = r1
            r4.f3267c = r9
            r4.f3268d = r6
            r4.f3269e = r10
            r4.f3270f = r3
            r7 = 2
            r4.f3272h = r7
            java.lang.Object r2 = r0.r0(r2, r4)
            if (r2 != r5) goto L_0x016e
            return r5
        L_0x016e:
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r9
            r9 = r10
            r11 = r1
            r1 = r6
        L_0x0175:
            boolean r1 = r1.m()
            if (r1 == 0) goto L_0x017c
            return r8
        L_0x017c:
            r1 = r11
        L_0x017d:
            r6 = 2
            r7 = 1
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.f(f1.d, long, int, lp0.p, fp0.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object g(f1.d r19, long r20, int r22, lp0.p<? super f1.v, ? super java.lang.Float, bp0.k> r23, fp0.c<? super f1.v> r24) {
        /*
            r0 = r20
            r2 = r24
            boolean r3 = r2 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 r3 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) r3
            int r4 = r3.f3280h
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.f3280h = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 r3 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.f3279g
            java.lang.Object r4 = kotlin.coroutines.intrinsics.b.d()
            int r5 = r3.f3280h
            r7 = 2
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L_0x0073
            if (r5 == r8) goto L_0x0055
            if (r5 != r7) goto L_0x004d
            float r0 = r3.f3278f
            float r1 = r3.f3277e
            java.lang.Object r5 = r3.f3276d
            f1.v r5 = (f1.v) r5
            java.lang.Object r10 = r3.f3275c
            kotlin.jvm.internal.Ref$LongRef r10 = (kotlin.jvm.internal.Ref$LongRef) r10
            java.lang.Object r11 = r3.f3274b
            f1.d r11 = (f1.d) r11
            java.lang.Object r12 = r3.f3273a
            lp0.p r12 = (lp0.p) r12
            bp0.g.b(r2)
            r2 = r0
            r0 = r11
            r11 = r10
            r10 = r4
            r4 = r3
            r3 = r1
            r1 = r12
            goto L_0x015e
        L_0x004d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0055:
            float r0 = r3.f3278f
            float r1 = r3.f3277e
            java.lang.Object r5 = r3.f3275c
            kotlin.jvm.internal.Ref$LongRef r5 = (kotlin.jvm.internal.Ref$LongRef) r5
            java.lang.Object r10 = r3.f3274b
            f1.d r10 = (f1.d) r10
            java.lang.Object r11 = r3.f3273a
            lp0.p r11 = (lp0.p) r11
            bp0.g.b(r2)
            r18 = r3
            r3 = r0
            r0 = r10
            r10 = r4
            r4 = r1
            r1 = r11
            r11 = r5
            r5 = r18
            goto L_0x00ba
        L_0x0073:
            bp0.g.b(r2)
            f1.n r2 = r19.p0()
            boolean r2 = l(r2, r0)
            if (r2 == 0) goto L_0x0082
            goto L_0x0182
        L_0x0082:
            androidx.compose.ui.platform.n1 r2 = r19.getViewConfiguration()
            r5 = r22
            float r2 = m(r2, r5)
            kotlin.jvm.internal.Ref$LongRef r5 = new kotlin.jvm.internal.Ref$LongRef
            r5.<init>()
            r5.f25665a = r0
            r0 = r19
            r1 = r23
            r10 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = 0
        L_0x009c:
            r4.f3273a = r1
            r4.f3274b = r0
            r4.f3275c = r10
            r4.f3276d = r9
            r4.f3277e = r3
            r4.f3278f = r2
            r4.f3280h = r8
            java.lang.Object r11 = f1.c.a(r0, r9, r4, r8, r9)
            if (r11 != r5) goto L_0x00b1
            return r5
        L_0x00b1:
            r18 = r3
            r3 = r2
            r2 = r11
            r11 = r10
            r10 = r5
            r5 = r4
            r4 = r18
        L_0x00ba:
            f1.n r2 = (f1.n) r2
            java.util.List r12 = r2.c()
            int r13 = r12.size()
            r14 = 0
            r15 = 0
        L_0x00c6:
            if (r15 >= r13) goto L_0x00e3
            java.lang.Object r16 = r12.get(r15)
            r17 = r16
            f1.v r17 = (f1.v) r17
            long r8 = r17.e()
            long r6 = r11.f25665a
            boolean r6 = f1.u.d(r8, r6)
            if (r6 == 0) goto L_0x00dd
            goto L_0x00e5
        L_0x00dd:
            int r15 = r15 + 1
            r7 = 2
            r8 = 1
            r9 = 0
            goto L_0x00c6
        L_0x00e3:
            r16 = 0
        L_0x00e5:
            r6 = r16
            f1.v r6 = (f1.v) r6
            if (r6 != 0) goto L_0x00ed
            goto L_0x0164
        L_0x00ed:
            boolean r7 = r6.m()
            if (r7 == 0) goto L_0x00f5
            goto L_0x0164
        L_0x00f5:
            boolean r7 = f1.o.d(r6)
            if (r7 == 0) goto L_0x0129
            java.util.List r2 = r2.c()
            int r6 = r2.size()
        L_0x0103:
            if (r14 >= r6) goto L_0x0116
            java.lang.Object r7 = r2.get(r14)
            r8 = r7
            f1.v r8 = (f1.v) r8
            boolean r8 = r8.g()
            if (r8 == 0) goto L_0x0113
            goto L_0x0117
        L_0x0113:
            int r14 = r14 + 1
            goto L_0x0103
        L_0x0116:
            r7 = 0
        L_0x0117:
            f1.v r7 = (f1.v) r7
            if (r7 != 0) goto L_0x011c
            goto L_0x0164
        L_0x011c:
            long r6 = r7.e()
            r11.f25665a = r6
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r10
            r10 = r11
            r7 = 2
            goto L_0x0168
        L_0x0129:
            long r7 = r6.f()
            long r12 = r6.h()
            float r2 = t0.f.n(r7)
            float r7 = t0.f.n(r12)
            float r2 = r2 - r7
            float r2 = r2 + r3
            float r3 = java.lang.Math.abs(r2)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x016c
            androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r5.f3273a = r1
            r5.f3274b = r0
            r5.f3275c = r11
            r5.f3276d = r6
            r5.f3277e = r4
            r5.f3278f = r2
            r7 = 2
            r5.f3280h = r7
            java.lang.Object r3 = r0.r0(r3, r5)
            if (r3 != r10) goto L_0x015b
            return r10
        L_0x015b:
            r3 = r4
            r4 = r5
            r5 = r6
        L_0x015e:
            boolean r5 = r5.m()
            if (r5 == 0) goto L_0x0166
        L_0x0164:
            r9 = 0
            goto L_0x0182
        L_0x0166:
            r5 = r10
            r10 = r11
        L_0x0168:
            r8 = 1
            r9 = 0
            goto L_0x009c
        L_0x016c:
            r7 = 2
            float r3 = java.lang.Math.signum(r2)
            float r3 = r3 * r4
            float r2 = r2 - r3
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.a.c(r2)
            r1.invoke(r6, r2)
            boolean r2 = r6.m()
            if (r2 == 0) goto L_0x0183
            r9 = r6
        L_0x0182:
            return r9
        L_0x0183:
            r3 = r4
            r4 = r5
            r5 = r10
            r10 = r11
            r2 = 0
            goto L_0x0168
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.g(f1.d, long, int, lp0.p, fp0.c):java.lang.Object");
    }

    public static final Object h(d0 d0Var, l<? super f, k> lVar, a<k> aVar, a<k> aVar2, p<? super v, ? super f, k> pVar, c<? super k> cVar) {
        Object d11 = ForEachGestureKt.d(d0Var, new DragGestureDetectorKt$detectDragGestures$5(lVar, pVar, aVar2, aVar, (c<? super DragGestureDetectorKt$detectDragGestures$5>) null), cVar);
        return d11 == b.d() ? d11 : k.f22762a;
    }

    public static final Object i(d0 d0Var, l<? super f, k> lVar, a<k> aVar, a<k> aVar2, p<? super v, ? super f, k> pVar, c<? super k> cVar) {
        Object d11 = ForEachGestureKt.d(d0Var, new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(lVar, aVar2, aVar, pVar, (c<? super DragGestureDetectorKt$detectDragGesturesAfterLongPress$5>) null), cVar);
        return d11 == b.d() ? d11 : k.f22762a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object j(f1.d r4, long r5, lp0.l<? super f1.v, bp0.k> r7, fp0.c<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1) r0
            int r1 = r0.f3315d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f3315d = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.f3314c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f3315d
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r4 = r0.f3313b
            lp0.l r4 = (lp0.l) r4
            java.lang.Object r5 = r0.f3312a
            f1.d r5 = (f1.d) r5
            bp0.g.b(r8)
            r7 = r4
            r4 = r5
            goto L_0x004b
        L_0x0033:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003b:
            bp0.g.b(r8)
        L_0x003e:
            r0.f3312a = r4
            r0.f3313b = r7
            r0.f3315d = r3
            java.lang.Object r8 = c(r4, r5, r0)
            if (r8 != r1) goto L_0x004b
            return r1
        L_0x004b:
            f1.v r8 = (f1.v) r8
            if (r8 != 0) goto L_0x0055
            r4 = 0
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.a.a(r4)
            return r4
        L_0x0055:
            boolean r5 = f1.o.d(r8)
            if (r5 == 0) goto L_0x0060
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r4
        L_0x0060:
            r7.invoke(r8)
            long r5 = r8.e()
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.j(f1.d, long, lp0.l, fp0.c):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f5, code lost:
        if ((!(t0.f.m(f1.o.h(r13)) == 0.0f)) != false) goto L_0x00f7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0081 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ae A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object k(f1.d r18, long r19, lp0.l<? super f1.v, bp0.k> r21, fp0.c<? super java.lang.Boolean> r22) {
        /*
            r0 = r22
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1
            if (r1 == 0) goto L_0x0015
            r1 = r0
            androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1 r1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1) r1
            int r2 = r1.f3321f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f3321f = r2
            goto L_0x001a
        L_0x0015:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1 r1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$horizontalDrag$1
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.f3320e
            java.lang.Object r2 = kotlin.coroutines.intrinsics.b.d()
            int r3 = r1.f3321f
            r4 = 0
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x004c
            if (r3 != r6) goto L_0x0044
            java.lang.Object r3 = r1.f3319d
            kotlin.jvm.internal.Ref$LongRef r3 = (kotlin.jvm.internal.Ref$LongRef) r3
            java.lang.Object r7 = r1.f3318c
            f1.d r7 = (f1.d) r7
            java.lang.Object r8 = r1.f3317b
            f1.d r8 = (f1.d) r8
            java.lang.Object r9 = r1.f3316a
            lp0.l r9 = (lp0.l) r9
            bp0.g.b(r0)
            r16 = r2
            r2 = r1
            r1 = r9
            r9 = r7
            r7 = r16
            goto L_0x0088
        L_0x0044:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004c:
            bp0.g.b(r0)
            f1.n r0 = r18.p0()
            r7 = r19
            boolean r0 = l(r0, r7)
            if (r0 == 0) goto L_0x0061
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r5)
            goto L_0x0115
        L_0x0061:
            r0 = r18
            r3 = r2
            r2 = r1
            r1 = r21
        L_0x0067:
            kotlin.jvm.internal.Ref$LongRef r9 = new kotlin.jvm.internal.Ref$LongRef
            r9.<init>()
            r9.f25665a = r7
            r8 = r0
            r7 = r3
            r3 = r9
        L_0x0071:
            r2.f3316a = r1
            r2.f3317b = r0
            r2.f3318c = r8
            r2.f3319d = r3
            r2.f3321f = r6
            java.lang.Object r9 = f1.c.a(r8, r4, r2, r6, r4)
            if (r9 != r7) goto L_0x0082
            return r7
        L_0x0082:
            r16 = r8
            r8 = r0
            r0 = r9
            r9 = r16
        L_0x0088:
            f1.n r0 = (f1.n) r0
            java.util.List r10 = r0.c()
            int r11 = r10.size()
            r12 = 0
        L_0x0093:
            if (r12 >= r11) goto L_0x00ae
            java.lang.Object r13 = r10.get(r12)
            r14 = r13
            f1.v r14 = (f1.v) r14
            long r14 = r14.e()
            long r4 = r3.f25665a
            boolean r4 = f1.u.d(r14, r4)
            if (r4 == 0) goto L_0x00a9
            goto L_0x00af
        L_0x00a9:
            int r12 = r12 + 1
            r4 = 0
            r5 = 0
            goto L_0x0093
        L_0x00ae:
            r13 = 0
        L_0x00af:
            f1.v r13 = (f1.v) r13
            if (r13 != 0) goto L_0x00b5
            r13 = 0
            goto L_0x00f7
        L_0x00b5:
            boolean r4 = f1.o.d(r13)
            if (r4 == 0) goto L_0x00e4
            java.util.List r0 = r0.c()
            int r4 = r0.size()
            r5 = 0
        L_0x00c4:
            if (r5 >= r4) goto L_0x00d7
            java.lang.Object r10 = r0.get(r5)
            r11 = r10
            f1.v r11 = (f1.v) r11
            boolean r11 = r11.g()
            if (r11 == 0) goto L_0x00d4
            goto L_0x00d8
        L_0x00d4:
            int r5 = r5 + 1
            goto L_0x00c4
        L_0x00d7:
            r10 = 0
        L_0x00d8:
            f1.v r10 = (f1.v) r10
            if (r10 != 0) goto L_0x00dd
            goto L_0x00f7
        L_0x00dd:
            long r4 = r10.e()
            r3.f25665a = r4
            goto L_0x0127
        L_0x00e4:
            long r4 = f1.o.h(r13)
            float r0 = t0.f.m(r4)
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00f3
            r0 = 1
            goto L_0x00f4
        L_0x00f3:
            r0 = 0
        L_0x00f4:
            r0 = r0 ^ r6
            if (r0 == 0) goto L_0x0127
        L_0x00f7:
            if (r13 != 0) goto L_0x00ff
            r0 = 0
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r0)
            goto L_0x0115
        L_0x00ff:
            r0 = 0
            boolean r3 = r13.m()
            if (r3 == 0) goto L_0x010b
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r0)
            goto L_0x0115
        L_0x010b:
            boolean r3 = f1.o.d(r13)
            if (r3 == 0) goto L_0x0116
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r6)
        L_0x0115:
            return r0
        L_0x0116:
            r1.invoke(r13)
            long r3 = r13.e()
            r0 = r8
            r5 = 0
            r16 = r3
            r3 = r7
            r7 = r16
            r4 = 0
            goto L_0x0067
        L_0x0127:
            r0 = 0
            r0 = r8
            r8 = r9
            r4 = 0
            r5 = 0
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.k(f1.d, long, lp0.l, fp0.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final boolean l(n nVar, long j) {
        v vVar;
        List<v> c11 = nVar.c();
        int size = c11.size();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                vVar = null;
                break;
            }
            vVar = c11.get(i11);
            if (u.d(vVar.e(), j)) {
                break;
            }
            i11++;
        }
        v vVar2 = vVar;
        if (vVar2 != null && vVar2.g()) {
            z11 = true;
        }
        return true ^ z11;
    }

    public static final float m(n1 n1Var, int i11) {
        kotlin.jvm.internal.p.j(n1Var, "$this$pointerSlop");
        if (g0.g(i11, g0.f14488a.b())) {
            return n1Var.b() * f3238c;
        }
        return n1Var.b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f5, code lost:
        if ((!(t0.f.n(f1.o.h(r13)) == 0.0f)) != false) goto L_0x00f7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0081 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ae A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object n(f1.d r18, long r19, lp0.l<? super f1.v, bp0.k> r21, fp0.c<? super java.lang.Boolean> r22) {
        /*
            r0 = r22
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1
            if (r1 == 0) goto L_0x0015
            r1 = r0
            androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1 r1 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1) r1
            int r2 = r1.f3327f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f3327f = r2
            goto L_0x001a
        L_0x0015:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1 r1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$verticalDrag$1
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.f3326e
            java.lang.Object r2 = kotlin.coroutines.intrinsics.b.d()
            int r3 = r1.f3327f
            r4 = 0
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x004c
            if (r3 != r6) goto L_0x0044
            java.lang.Object r3 = r1.f3325d
            kotlin.jvm.internal.Ref$LongRef r3 = (kotlin.jvm.internal.Ref$LongRef) r3
            java.lang.Object r7 = r1.f3324c
            f1.d r7 = (f1.d) r7
            java.lang.Object r8 = r1.f3323b
            f1.d r8 = (f1.d) r8
            java.lang.Object r9 = r1.f3322a
            lp0.l r9 = (lp0.l) r9
            bp0.g.b(r0)
            r16 = r2
            r2 = r1
            r1 = r9
            r9 = r7
            r7 = r16
            goto L_0x0088
        L_0x0044:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004c:
            bp0.g.b(r0)
            f1.n r0 = r18.p0()
            r7 = r19
            boolean r0 = l(r0, r7)
            if (r0 == 0) goto L_0x0061
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r5)
            goto L_0x0115
        L_0x0061:
            r0 = r18
            r3 = r2
            r2 = r1
            r1 = r21
        L_0x0067:
            kotlin.jvm.internal.Ref$LongRef r9 = new kotlin.jvm.internal.Ref$LongRef
            r9.<init>()
            r9.f25665a = r7
            r8 = r0
            r7 = r3
            r3 = r9
        L_0x0071:
            r2.f3322a = r1
            r2.f3323b = r0
            r2.f3324c = r8
            r2.f3325d = r3
            r2.f3327f = r6
            java.lang.Object r9 = f1.c.a(r8, r4, r2, r6, r4)
            if (r9 != r7) goto L_0x0082
            return r7
        L_0x0082:
            r16 = r8
            r8 = r0
            r0 = r9
            r9 = r16
        L_0x0088:
            f1.n r0 = (f1.n) r0
            java.util.List r10 = r0.c()
            int r11 = r10.size()
            r12 = 0
        L_0x0093:
            if (r12 >= r11) goto L_0x00ae
            java.lang.Object r13 = r10.get(r12)
            r14 = r13
            f1.v r14 = (f1.v) r14
            long r14 = r14.e()
            long r4 = r3.f25665a
            boolean r4 = f1.u.d(r14, r4)
            if (r4 == 0) goto L_0x00a9
            goto L_0x00af
        L_0x00a9:
            int r12 = r12 + 1
            r4 = 0
            r5 = 0
            goto L_0x0093
        L_0x00ae:
            r13 = 0
        L_0x00af:
            f1.v r13 = (f1.v) r13
            if (r13 != 0) goto L_0x00b5
            r13 = 0
            goto L_0x00f7
        L_0x00b5:
            boolean r4 = f1.o.d(r13)
            if (r4 == 0) goto L_0x00e4
            java.util.List r0 = r0.c()
            int r4 = r0.size()
            r5 = 0
        L_0x00c4:
            if (r5 >= r4) goto L_0x00d7
            java.lang.Object r10 = r0.get(r5)
            r11 = r10
            f1.v r11 = (f1.v) r11
            boolean r11 = r11.g()
            if (r11 == 0) goto L_0x00d4
            goto L_0x00d8
        L_0x00d4:
            int r5 = r5 + 1
            goto L_0x00c4
        L_0x00d7:
            r10 = 0
        L_0x00d8:
            f1.v r10 = (f1.v) r10
            if (r10 != 0) goto L_0x00dd
            goto L_0x00f7
        L_0x00dd:
            long r4 = r10.e()
            r3.f25665a = r4
            goto L_0x0127
        L_0x00e4:
            long r4 = f1.o.h(r13)
            float r0 = t0.f.n(r4)
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00f3
            r0 = 1
            goto L_0x00f4
        L_0x00f3:
            r0 = 0
        L_0x00f4:
            r0 = r0 ^ r6
            if (r0 == 0) goto L_0x0127
        L_0x00f7:
            if (r13 != 0) goto L_0x00ff
            r0 = 0
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r0)
            goto L_0x0115
        L_0x00ff:
            r0 = 0
            boolean r3 = r13.m()
            if (r3 == 0) goto L_0x010b
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r0)
            goto L_0x0115
        L_0x010b:
            boolean r3 = f1.o.d(r13)
            if (r3 == 0) goto L_0x0116
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r6)
        L_0x0115:
            return r0
        L_0x0116:
            r1.invoke(r13)
            long r3 = r13.e()
            r0 = r8
            r5 = 0
            r16 = r3
            r3 = r7
            r7 = r16
            r4 = 0
            goto L_0x0067
        L_0x0127:
            r0 = 0
            r0 = r8
            r8 = r9
            r4 = 0
            r5 = 0
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.n(f1.d, long, lp0.l, fp0.c):java.lang.Object");
    }
}
