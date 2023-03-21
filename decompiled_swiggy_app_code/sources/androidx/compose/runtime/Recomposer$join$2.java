package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.a;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
/* compiled from: Recomposer.kt */
final class Recomposer$join$2 extends SuspendLambda implements p<Recomposer.State, c<? super Boolean>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f6060a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f6061b;

    Recomposer$join$2(c<? super Recomposer$join$2> cVar) {
        super(2, cVar);
    }

    /* renamed from: a */
    public final Object invoke(Recomposer.State state, c<? super Boolean> cVar) {
        return ((Recomposer$join$2) create(state, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2(cVar);
        recomposer$join$2.f6061b = obj;
        return recomposer$join$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.f6060a == 0) {
            g.b(obj);
            return a.a(((Recomposer.State) this.f6061b) == Recomposer.State.ShutDown);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
