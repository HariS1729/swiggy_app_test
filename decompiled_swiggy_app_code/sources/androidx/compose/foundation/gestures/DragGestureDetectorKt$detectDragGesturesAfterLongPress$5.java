package androidx.compose.foundation.gestures;

import bp0.k;
import f1.d0;
import f1.v;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.a;
import lp0.l;
import lp0.p;
import t0.f;

@d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", l = {276, 280, 284}, m = "invokeSuspend")
/* compiled from: DragGestureDetector.kt */
final class DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 extends SuspendLambda implements p<d0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f3297a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f3298b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l<f, k> f3299c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a<k> f3300d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ a<k> f3301e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ p<v, f, k> f3302f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(l<? super f, k> lVar, a<k> aVar, a<k> aVar2, p<? super v, ? super f, k> pVar, c<? super DragGestureDetectorKt$detectDragGesturesAfterLongPress$5> cVar) {
        super(2, cVar);
        this.f3299c = lVar;
        this.f3300d = aVar;
        this.f3301e = aVar2;
        this.f3302f = pVar;
    }

    /* renamed from: a */
    public final Object invoke(d0 d0Var, c<? super k> cVar) {
        return ((DragGestureDetectorKt$detectDragGesturesAfterLongPress$5) create(d0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(this.f3299c, this.f3300d, this.f3301e, this.f3302f, cVar);
        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.f3298b = obj;
        return dragGestureDetectorKt$detectDragGesturesAfterLongPress$5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d A[Catch:{ CancellationException -> 0x0017 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r11.f3297a
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 == r5) goto L_0x0029
            if (r1 == r4) goto L_0x0021
            if (r1 != r3) goto L_0x0019
            bp0.g.b(r12)     // Catch:{ CancellationException -> 0x0017 }
            goto L_0x0082
        L_0x0017:
            r12 = move-exception
            goto L_0x0085
        L_0x0019:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0021:
            java.lang.Object r1 = r11.f3298b
            f1.d0 r1 = (f1.d0) r1
            bp0.g.b(r12)     // Catch:{ CancellationException -> 0x0017 }
            goto L_0x0058
        L_0x0029:
            java.lang.Object r1 = r11.f3298b
            f1.d0 r1 = (f1.d0) r1
            bp0.g.b(r12)
            goto L_0x004b
        L_0x0031:
            bp0.g.b(r12)
            java.lang.Object r12 = r11.f3298b
            f1.d0 r12 = (f1.d0) r12
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1 r1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1
            r1.<init>(r2)
            r11.f3298b = r12
            r11.f3297a = r5
            java.lang.Object r1 = r12.s0(r1, r11)
            if (r1 != r0) goto L_0x0048
            return r0
        L_0x0048:
            r10 = r1
            r1 = r12
            r12 = r10
        L_0x004b:
            f1.v r12 = (f1.v) r12
            r11.f3298b = r1     // Catch:{ CancellationException -> 0x0017 }
            r11.f3297a = r4     // Catch:{ CancellationException -> 0x0017 }
            java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.e(r1, r12, r11)     // Catch:{ CancellationException -> 0x0017 }
            if (r12 != r0) goto L_0x0058
            return r0
        L_0x0058:
            r5 = r12
            f1.v r5 = (f1.v) r5     // Catch:{ CancellationException -> 0x0017 }
            if (r5 == 0) goto L_0x0082
            lp0.l<t0.f, bp0.k> r12 = r11.f3299c     // Catch:{ CancellationException -> 0x0017 }
            long r6 = r5.f()     // Catch:{ CancellationException -> 0x0017 }
            t0.f r4 = t0.f.d(r6)     // Catch:{ CancellationException -> 0x0017 }
            r12.invoke(r4)     // Catch:{ CancellationException -> 0x0017 }
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1 r12 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1     // Catch:{ CancellationException -> 0x0017 }
            lp0.a<bp0.k> r6 = r11.f3301e     // Catch:{ CancellationException -> 0x0017 }
            lp0.a<bp0.k> r7 = r11.f3300d     // Catch:{ CancellationException -> 0x0017 }
            lp0.p<f1.v, t0.f, bp0.k> r8 = r11.f3302f     // Catch:{ CancellationException -> 0x0017 }
            r9 = 0
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ CancellationException -> 0x0017 }
            r11.f3298b = r2     // Catch:{ CancellationException -> 0x0017 }
            r11.f3297a = r3     // Catch:{ CancellationException -> 0x0017 }
            java.lang.Object r12 = r1.s0(r12, r11)     // Catch:{ CancellationException -> 0x0017 }
            if (r12 != r0) goto L_0x0082
            return r0
        L_0x0082:
            bp0.k r12 = bp0.k.f22762a
            return r12
        L_0x0085:
            lp0.a<bp0.k> r0 = r11.f3300d
            r0.invoke()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
