package in.swiggy.android.tejas.feature.discovery.magiccart.transformer;

import bp0.g;
import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.error.Error;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import lp0.p;

@d(c = "in.swiggy.android.tejas.feature.discovery.magiccart.transformer.MagicCartErrorTransformer$execute$1", f = "MagicCartErrorTransformer.kt", l = {28}, m = "invokeSuspend")
/* compiled from: MagicCartErrorTransformer.kt */
final class MagicCartErrorTransformer$execute$1 extends SuspendLambda implements p<e<? super Response<? extends Error>>, c<? super k>, Object> {
    final /* synthetic */ com.swiggy.gandalf.widgets.v2.Response $parameters;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MagicCartErrorTransformer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MagicCartErrorTransformer$execute$1(MagicCartErrorTransformer magicCartErrorTransformer, com.swiggy.gandalf.widgets.v2.Response response, c<? super MagicCartErrorTransformer$execute$1> cVar) {
        super(2, cVar);
        this.this$0 = magicCartErrorTransformer;
        this.$parameters = response;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        MagicCartErrorTransformer$execute$1 magicCartErrorTransformer$execute$1 = new MagicCartErrorTransformer$execute$1(this.this$0, this.$parameters, cVar);
        magicCartErrorTransformer$execute$1.L$0 = obj;
        return magicCartErrorTransformer$execute$1;
    }

    public final Object invoke(e<? super Response<? extends Error>> eVar, c<? super k> cVar) {
        return ((MagicCartErrorTransformer$execute$1) create(eVar, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.label;
        if (i11 == 0) {
            g.b(obj);
            Response failure$default = Response.Companion.failure$default(Response.Companion, this.this$0.transform(this.$parameters), (Boolean) null, (Object) null, (Integer) null, (String) null, 30, (Object) null);
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
