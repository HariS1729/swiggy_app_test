package in.swiggy.android.tejas;

import bp0.g;
import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.error.Error;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import lp0.p;

@d(c = "in.swiggy.android.tejas.ResponseTransformerManager$buildResponse$lambda-3$$inlined$transform$1", f = "ResponseTransformerManager.kt", l = {223}, m = "invokeSuspend")
/* renamed from: in.swiggy.android.tejas.ResponseTransformerManager$buildResponse$lambda-3$$inlined$transform$1  reason: invalid class name */
/* compiled from: Emitters.kt */
public final class ResponseTransformerManager$buildResponse$lambda3$$inlined$transform$1 extends SuspendLambda implements p<e<? super Response<? extends M>>, c<? super k>, Object> {
    final /* synthetic */ kotlinx.coroutines.flow.d $this_transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ResponseTransformerManager$buildResponse$lambda3$$inlined$transform$1(kotlinx.coroutines.flow.d dVar, c cVar) {
        super(2, cVar);
        this.$this_transform = dVar;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        ResponseTransformerManager$buildResponse$lambda3$$inlined$transform$1 r02 = new ResponseTransformerManager$buildResponse$lambda3$$inlined$transform$1(this.$this_transform, cVar);
        r02.L$0 = obj;
        return r02;
    }

    public final Object invoke(e<? super Response<? extends M>> eVar, c<? super k> cVar) {
        return ((ResponseTransformerManager$buildResponse$lambda3$$inlined$transform$1) create(eVar, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.label;
        if (i11 == 0) {
            g.b(obj);
            final e eVar = (e) this.L$0;
            kotlinx.coroutines.flow.d dVar = this.$this_transform;
            AnonymousClass1 r32 = new e<Response<? extends Error>>() {
                public Object emit(Object obj, c cVar) {
                    Object emit = eVar.emit((Response.Failure) ((Response) obj), cVar);
                    return emit == b.d() ? emit : k.f22762a;
                }
            };
            this.label = 1;
            if (dVar.collect(r32, this) == d11) {
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
