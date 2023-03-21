package androidx.compose.foundation.gestures;

import bp0.k;
import f1.d;
import f1.d0;
import f1.v;
import fp0.c;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: ForEachGesture.kt */
public final class ForEachGestureKt {
    public static final boolean a(d dVar) {
        p.j(dVar, "<this>");
        List<v> c11 = dVar.p0().c();
        int size = c11.size();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            } else if (c11.get(i11).g()) {
                z11 = true;
                break;
            } else {
                i11++;
            }
        }
        return !z11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (a(r7) == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (r4 == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
        return bp0.k.f22762a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a A[EDGE_INSN: B:27:0x006a->B:23:0x006a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(f1.d r7, fp0.c<? super bp0.k> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3) r0
            int r1 = r0.f3435c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f3435c = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.f3434b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f3435c
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r7 = r0.f3433a
            f1.d r7 = (f1.d) r7
            bp0.g.b(r8)
            goto L_0x004b
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            bp0.g.b(r8)
            boolean r8 = a(r7)
            if (r8 != 0) goto L_0x006c
        L_0x003e:
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r0.f3433a = r7
            r0.f3435c = r3
            java.lang.Object r8 = r7.r0(r8, r0)
            if (r8 != r1) goto L_0x004b
            return r1
        L_0x004b:
            f1.n r8 = (f1.n) r8
            java.util.List r8 = r8.c()
            int r2 = r8.size()
            r4 = 0
            r5 = 0
        L_0x0057:
            if (r5 >= r2) goto L_0x006a
            java.lang.Object r6 = r8.get(r5)
            f1.v r6 = (f1.v) r6
            boolean r6 = r6.g()
            if (r6 == 0) goto L_0x0067
            r4 = 1
            goto L_0x006a
        L_0x0067:
            int r5 = r5 + 1
            goto L_0x0057
        L_0x006a:
            if (r4 != 0) goto L_0x003e
        L_0x006c:
            bp0.k r7 = bp0.k.f22762a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.b(f1.d, fp0.c):java.lang.Object");
    }

    public static final Object c(d0 d0Var, c<? super k> cVar) {
        Object s02 = d0Var.s0(new ForEachGestureKt$awaitAllPointersUp$2((c<? super ForEachGestureKt$awaitAllPointersUp$2>) null), cVar);
        return s02 == b.d() ? s02 : k.f22762a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074 A[SYNTHETIC, Splitter:B:25:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0093 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(f1.d0 r8, lp0.p<? super f1.d0, ? super fp0.c<? super bp0.k>, ? extends java.lang.Object> r9, fp0.c<? super bp0.k> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1) r0
            int r1 = r0.f3440e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f3440e = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.f3439d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f3440e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0067
            if (r2 == r5) goto L_0x0055
            if (r2 == r4) goto L_0x0043
            if (r2 != r3) goto L_0x003b
            java.lang.Object r8 = r0.f3438c
            kotlin.coroutines.CoroutineContext r8 = (kotlin.coroutines.CoroutineContext) r8
            java.lang.Object r9 = r0.f3437b
            lp0.p r9 = (lp0.p) r9
            java.lang.Object r2 = r0.f3436a
            f1.d0 r2 = (f1.d0) r2
            bp0.g.b(r10)
            goto L_0x0052
        L_0x003b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0043:
            java.lang.Object r8 = r0.f3438c
            kotlin.coroutines.CoroutineContext r8 = (kotlin.coroutines.CoroutineContext) r8
            java.lang.Object r9 = r0.f3437b
            lp0.p r9 = (lp0.p) r9
            java.lang.Object r2 = r0.f3436a
            f1.d0 r2 = (f1.d0) r2
            bp0.g.b(r10)     // Catch:{ CancellationException -> 0x0065 }
        L_0x0052:
            r10 = r8
            r8 = r2
            goto L_0x006e
        L_0x0055:
            java.lang.Object r8 = r0.f3438c
            kotlin.coroutines.CoroutineContext r8 = (kotlin.coroutines.CoroutineContext) r8
            java.lang.Object r9 = r0.f3437b
            lp0.p r9 = (lp0.p) r9
            java.lang.Object r2 = r0.f3436a
            f1.d0 r2 = (f1.d0) r2
            bp0.g.b(r10)     // Catch:{ CancellationException -> 0x0065 }
            goto L_0x0085
        L_0x0065:
            r10 = move-exception
            goto L_0x0099
        L_0x0067:
            bp0.g.b(r10)
            kotlin.coroutines.CoroutineContext r10 = r0.getContext()
        L_0x006e:
            boolean r2 = wp0.n1.m(r10)
            if (r2 == 0) goto L_0x00af
            r0.f3436a = r8     // Catch:{ CancellationException -> 0x0094 }
            r0.f3437b = r9     // Catch:{ CancellationException -> 0x0094 }
            r0.f3438c = r10     // Catch:{ CancellationException -> 0x0094 }
            r0.f3440e = r5     // Catch:{ CancellationException -> 0x0094 }
            java.lang.Object r2 = r9.invoke(r8, r0)     // Catch:{ CancellationException -> 0x0094 }
            if (r2 != r1) goto L_0x0083
            return r1
        L_0x0083:
            r2 = r8
            r8 = r10
        L_0x0085:
            r0.f3436a = r2     // Catch:{ CancellationException -> 0x0065 }
            r0.f3437b = r9     // Catch:{ CancellationException -> 0x0065 }
            r0.f3438c = r8     // Catch:{ CancellationException -> 0x0065 }
            r0.f3440e = r4     // Catch:{ CancellationException -> 0x0065 }
            java.lang.Object r10 = c(r2, r0)     // Catch:{ CancellationException -> 0x0065 }
            if (r10 != r1) goto L_0x0052
            return r1
        L_0x0094:
            r2 = move-exception
            r7 = r2
            r2 = r8
            r8 = r10
            r10 = r7
        L_0x0099:
            boolean r6 = wp0.n1.m(r8)
            if (r6 == 0) goto L_0x00ae
            r0.f3436a = r2
            r0.f3437b = r9
            r0.f3438c = r8
            r0.f3440e = r3
            java.lang.Object r10 = c(r2, r0)
            if (r10 != r1) goto L_0x0052
            return r1
        L_0x00ae:
            throw r10
        L_0x00af:
            bp0.k r8 = bp0.k.f22762a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.d(f1.d0, lp0.p, fp0.c):java.lang.Object");
    }
}
