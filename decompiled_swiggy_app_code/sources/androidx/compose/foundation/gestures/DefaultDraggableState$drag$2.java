package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import bp0.g;
import bp0.k;
import defpackage.y1;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2", f = "Draggable.kt", l = {427}, m = "invokeSuspend")
/* compiled from: Draggable.kt */
final class DefaultDraggableState$drag$2 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f3211a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DefaultDraggableState f3212b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MutatePriority f3213c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ p<y1.h, c<? super k>, Object> f3214d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultDraggableState$drag$2(DefaultDraggableState defaultDraggableState, MutatePriority mutatePriority, p<? super y1.h, ? super c<? super k>, ? extends Object> pVar, c<? super DefaultDraggableState$drag$2> cVar) {
        super(2, cVar);
        this.f3212b = defaultDraggableState;
        this.f3213c = mutatePriority;
        this.f3214d = pVar;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new DefaultDraggableState$drag$2(this.f3212b, this.f3213c, this.f3214d, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((DefaultDraggableState$drag$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f3211a;
        if (i11 == 0) {
            g.b(obj);
            MutatorMutex c11 = this.f3212b.f3209c;
            y1.h b11 = this.f3212b.f3208b;
            MutatePriority mutatePriority = this.f3213c;
            p<y1.h, c<? super k>, Object> pVar = this.f3214d;
            this.f3211a = 1;
            if (c11.f(b11, mutatePriority, pVar, this) == d11) {
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
