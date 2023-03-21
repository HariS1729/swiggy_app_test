package androidx.compose.material;

import bp0.g;
import bp0.k;
import defpackage.y1;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "androidx.compose.material.SwipeableState$snapInternalToOffset$2", f = "Swipeable.kt", l = {}, m = "invokeSuspend")
/* compiled from: Swipeable.kt */
final class SwipeableState$snapInternalToOffset$2 extends SuspendLambda implements p<y1.h, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f5537a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f5538b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f5539c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SwipeableState<T> f5540d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableState$snapInternalToOffset$2(float f11, SwipeableState<T> swipeableState, c<? super SwipeableState$snapInternalToOffset$2> cVar) {
        super(2, cVar);
        this.f5539c = f11;
        this.f5540d = swipeableState;
    }

    /* renamed from: a */
    public final Object invoke(y1.h hVar, c<? super k> cVar) {
        return ((SwipeableState$snapInternalToOffset$2) create(hVar, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        SwipeableState$snapInternalToOffset$2 swipeableState$snapInternalToOffset$2 = new SwipeableState$snapInternalToOffset$2(this.f5539c, this.f5540d, cVar);
        swipeableState$snapInternalToOffset$2.f5538b = obj;
        return swipeableState$snapInternalToOffset$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.f5537a == 0) {
            g.b(obj);
            ((y1.h) this.f5538b).a(this.f5539c - ((Number) this.f5540d.f5500g.getValue()).floatValue());
            return k.f22762a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
