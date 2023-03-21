package in.swiggy.android.tejas.coroutineUtils;

import bp0.g;
import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.ResponseTransformerManager;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.i;
import lp0.p;
import okhttp3.ResponseBody;
import wp0.j0;

@d(c = "in.swiggy.android.tejas.coroutineUtils.UseCase$invoke$2", f = "UseCase.kt", l = {22}, m = "invokeSuspend")
/* compiled from: UseCase.kt */
final class UseCase$invoke$2 extends SuspendLambda implements p<j0, c<? super Response<? extends R>>, Object> {
    final /* synthetic */ P $parameters;
    int label;
    final /* synthetic */ UseCase<P, R> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UseCase$invoke$2(UseCase<? super P, R> useCase, P p11, c<? super UseCase$invoke$2> cVar) {
        super(2, cVar);
        this.this$0 = useCase;
        this.$parameters = p11;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new UseCase$invoke$2(this.this$0, this.$parameters, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super Response<? extends R>> cVar) {
        return ((UseCase$invoke$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Response.Success success;
        Object d11 = b.d();
        int i11 = this.label;
        if (i11 == 0) {
            g.b(obj);
            UseCase<P, R> useCase = this.this$0;
            P p11 = this.$parameters;
            this.label = 1;
            obj = useCase.execute(p11, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Object obj2 = obj;
        if (obj2 == null) {
            success = null;
        } else {
            success = new Response.Success(obj2, (Boolean) null, (Integer) null, 6, (i) null);
        }
        return success == null ? ResponseTransformerManager.buildFailureResponse$default(ResponseTransformerManager.INSTANCE, (retrofit2.Response) null, (Object) null, (ResponseBody) null, ResponseTransformerManager.MESSAGE_NULL_RESPONSE_BODY, 7, (Object) null) : success;
    }
}
