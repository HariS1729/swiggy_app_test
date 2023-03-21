package androidx.compose.ui.platform;

import android.view.Choreographer;
import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", l = {}, m = "invokeSuspend")
/* compiled from: AndroidUiDispatcher.android.kt */
final class AndroidUiDispatcher$Companion$Main$2$dispatcher$1 extends SuspendLambda implements p<j0, c<? super Choreographer>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f7087a;

    AndroidUiDispatcher$Companion$Main$2$dispatcher$1(c<? super AndroidUiDispatcher$Companion$Main$2$dispatcher$1> cVar) {
        super(2, cVar);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(cVar);
    }

    public final Object invoke(j0 j0Var, c<? super Choreographer> cVar) {
        return ((AndroidUiDispatcher$Companion$Main$2$dispatcher$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.f7087a == 0) {
            g.b(obj);
            return Choreographer.getInstance();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
