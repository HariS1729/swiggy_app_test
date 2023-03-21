package androidx.compose.foundation.text;

import a0.o;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import bp0.k;
import f1.d0;
import fp0.c;
import wp0.k0;

/* compiled from: LongPressTextDragObserver.kt */
public final class LongPressTextDragObserverKt {
    public static final Object c(d0 d0Var, o oVar, c<? super k> cVar) {
        Object e11 = k0.e(new LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(d0Var, oVar, (c<? super LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2>) null), cVar);
        return e11 == b.d() ? e11 : k.f22762a;
    }

    public static final Object d(d0 d0Var, o oVar, c<? super k> cVar) {
        Object i11 = DragGestureDetectorKt.i(d0Var, new LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$2(oVar), new LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$3(oVar), new LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$4(oVar), new LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$5(oVar), cVar);
        return i11 == b.d() ? i11 : k.f22762a;
    }

    /* access modifiers changed from: private */
    public static final Object e(d0 d0Var, o oVar, c<? super k> cVar) {
        Object h11 = DragGestureDetectorKt.h(d0Var, new LongPressTextDragObserverKt$detectDragGesturesWithObserver$2(oVar), new LongPressTextDragObserverKt$detectDragGesturesWithObserver$3(oVar), new LongPressTextDragObserverKt$detectDragGesturesWithObserver$4(oVar), new LongPressTextDragObserverKt$detectDragGesturesWithObserver$5(oVar), cVar);
        return h11 == b.d() ? h11 : k.f22762a;
    }

    /* access modifiers changed from: private */
    public static final Object f(d0 d0Var, o oVar, c<? super k> cVar) {
        Object d11 = ForEachGestureKt.d(d0Var, new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(oVar, (c<? super LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2>) null), cVar);
        return d11 == b.d() ? d11 : k.f22762a;
    }
}
