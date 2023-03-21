package androidx.compose.foundation.gestures;

import bp0.g;
import bp0.k;
import defpackage.y1;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", f = "Scrollable.kt", l = {445}, m = "invokeSuspend")
/* compiled from: Scrollable.kt */
final class ScrollDraggableState$drag$2 extends SuspendLambda implements p<y1.p, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f3457a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f3458b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ScrollDraggableState f3459c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ p<y1.l, c<? super k>, Object> f3460d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollDraggableState$drag$2(ScrollDraggableState scrollDraggableState, p<? super y1.l, ? super c<? super k>, ? extends Object> pVar, c<? super ScrollDraggableState$drag$2> cVar) {
        super(2, cVar);
        this.f3459c = scrollDraggableState;
        this.f3460d = pVar;
    }

    /* renamed from: a */
    public final Object invoke(y1.p pVar, c<? super k> cVar) {
        return ((ScrollDraggableState$drag$2) create(pVar, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        ScrollDraggableState$drag$2 scrollDraggableState$drag$2 = new ScrollDraggableState$drag$2(this.f3459c, this.f3460d, cVar);
        scrollDraggableState$drag$2.f3458b = obj;
        return scrollDraggableState$drag$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f3457a;
        if (i11 == 0) {
            g.b(obj);
            this.f3459c.c((y1.p) this.f3458b);
            p<y1.l, c<? super k>, Object> pVar = this.f3460d;
            ScrollDraggableState scrollDraggableState = this.f3459c;
            this.f3457a = 1;
            if (pVar.invoke(scrollDraggableState, this) == d11) {
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
