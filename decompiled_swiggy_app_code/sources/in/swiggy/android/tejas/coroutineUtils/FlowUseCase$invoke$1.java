package in.swiggy.android.tejas.coroutineUtils;

import bp0.g;
import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.error.Error;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.flow.e;
import lp0.q;

@d(c = "in.swiggy.android.tejas.coroutineUtils.FlowUseCase$invoke$1", f = "FlowUseCase.kt", l = {16}, m = "invokeSuspend")
/* compiled from: FlowUseCase.kt */
final class FlowUseCase$invoke$1 extends SuspendLambda implements q<e<? super Response<? extends R>>, Throwable, c<? super k>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    FlowUseCase$invoke$1(c<? super FlowUseCase$invoke$1> cVar) {
        super(3, cVar);
    }

    public final Object invoke(e<? super Response<? extends R>> eVar, Throwable th2, c<? super k> cVar) {
        FlowUseCase$invoke$1 flowUseCase$invoke$1 = new FlowUseCase$invoke$1(cVar);
        flowUseCase$invoke$1.L$0 = eVar;
        flowUseCase$invoke$1.L$1 = th2;
        return flowUseCase$invoke$1.invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.label;
        if (i11 == 0) {
            g.b(obj);
            Response failure$default = Response.Companion.failure$default(Response.Companion, new Error.UnhandledExceptionError((Throwable) this.L$1, (String) null, 2, (i) null), (Boolean) null, (Object) null, (Integer) null, (String) null, 30, (Object) null);
            this.L$0 = null;
            this.label = 1;
            if (((e) this.L$0).emit(failure$default, this) == d11) {
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
