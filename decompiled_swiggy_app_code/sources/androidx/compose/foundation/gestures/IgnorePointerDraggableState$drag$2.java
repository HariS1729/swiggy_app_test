package androidx.compose.foundation.gestures;

import bp0.g;
import bp0.k;
import defpackage.y1;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "androidx.compose.foundation.gestures.IgnorePointerDraggableState$drag$2", f = "Draggable.kt", l = {478}, m = "invokeSuspend")
/* compiled from: Draggable.kt */
final class IgnorePointerDraggableState$drag$2 extends SuspendLambda implements p<y1.h, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f3443a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f3444b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ IgnorePointerDraggableState f3445c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ p<y1.l, c<? super k>, Object> f3446d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    IgnorePointerDraggableState$drag$2(IgnorePointerDraggableState ignorePointerDraggableState, p<? super y1.l, ? super c<? super k>, ? extends Object> pVar, c<? super IgnorePointerDraggableState$drag$2> cVar) {
        super(2, cVar);
        this.f3445c = ignorePointerDraggableState;
        this.f3446d = pVar;
    }

    /* renamed from: a */
    public final Object invoke(y1.h hVar, c<? super k> cVar) {
        return ((IgnorePointerDraggableState$drag$2) create(hVar, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        IgnorePointerDraggableState$drag$2 ignorePointerDraggableState$drag$2 = new IgnorePointerDraggableState$drag$2(this.f3445c, this.f3446d, cVar);
        ignorePointerDraggableState$drag$2.f3444b = obj;
        return ignorePointerDraggableState$drag$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f3443a;
        if (i11 == 0) {
            g.b(obj);
            this.f3445c.c((y1.h) this.f3444b);
            p<y1.l, c<? super k>, Object> pVar = this.f3446d;
            IgnorePointerDraggableState ignorePointerDraggableState = this.f3445c;
            this.f3443a = 1;
            if (pVar.invoke(ignorePointerDraggableState, this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return k.f22762a;
    }
}
