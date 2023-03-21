package androidx.compose.foundation.gestures;

import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.q;
import wp0.j0;

@d(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$7", f = "Draggable.kt", l = {}, m = "invokeSuspend")
/* compiled from: Draggable.kt */
final class DraggableKt$draggable$7 extends SuspendLambda implements q<j0, Float, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f3378a;

    DraggableKt$draggable$7(c<? super DraggableKt$draggable$7> cVar) {
        super(3, cVar);
    }

    public final Object a(j0 j0Var, float f11, c<? super k> cVar) {
        return new DraggableKt$draggable$7(cVar).invokeSuspend(k.f22762a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((j0) obj, ((Number) obj2).floatValue(), (c) obj3);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.f3378a == 0) {
            g.b(obj);
            return k.f22762a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
