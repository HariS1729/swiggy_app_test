package androidx.compose.foundation.gestures;

import bp0.g;
import bp0.k;
import f1.v;
import fp0.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1", f = "DragGestureDetector.kt", l = {277}, m = "invokeSuspend")
/* compiled from: DragGestureDetector.kt */
final class DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1 extends RestrictedSuspendLambda implements p<f1.d, c<? super v>, Object> {

    /* renamed from: b  reason: collision with root package name */
    int f3310b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f3311c;

    DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1(c<? super DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1> cVar) {
        super(2, cVar);
    }

    /* renamed from: a */
    public final Object invoke(f1.d dVar, c<? super v> cVar) {
        return ((DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1) create(dVar, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1 dragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1 = new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1(cVar);
        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1.f3311c = obj;
        return dragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f3310b;
        if (i11 == 0) {
            g.b(obj);
            this.f3310b = 1;
            obj = TapGestureDetectorKt.d((f1.d) this.f3311c, false, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
