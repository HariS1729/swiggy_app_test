package androidx.compose.foundation.gestures;

import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.q;
import t0.f;
import wp0.j0;

@d(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$1", f = "Draggable.kt", l = {}, m = "invokeSuspend")
/* compiled from: Draggable.kt */
final class DraggableKt$draggable$1 extends SuspendLambda implements q<j0, f, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f3372a;

    DraggableKt$draggable$1(c<? super DraggableKt$draggable$1> cVar) {
        super(3, cVar);
    }

    public final Object a(j0 j0Var, long j, c<? super k> cVar) {
        return new DraggableKt$draggable$1(cVar).invokeSuspend(k.f22762a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((j0) obj, ((f) obj2).u(), (c) obj3);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.f3372a == 0) {
            g.b(obj);
            return k.f22762a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
