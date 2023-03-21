package in.swiggy.android.tejas;

import bp0.g;
import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.IErrorChecker;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.coroutineUtils.FlowErrorTransformer;
import in.swiggy.android.tejas.coroutineUtils.FlowModelTransformer;
import in.swiggy.android.tejas.error.Error;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.a;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.f;
import lp0.p;
import retrofit2.Response;

@d(c = "in.swiggy.android.tejas.ResponseTransformerManager$buildResponse$$inlined$transform$1", f = "ResponseTransformerManager.kt", l = {223}, m = "invokeSuspend")
/* compiled from: Emitters.kt */
public final class ResponseTransformerManager$buildResponse$$inlined$transform$1 extends SuspendLambda implements p<e<? super Response<? extends M>>, c<? super k>, Object> {
    final /* synthetic */ IErrorChecker $errorChecker$inlined;
    final /* synthetic */ FlowErrorTransformer $errorTransformer$inlined;
    final /* synthetic */ boolean $isSwiggyApi$inlined;
    final /* synthetic */ FlowModelTransformer $modelTransformer$inlined;
    final /* synthetic */ kotlinx.coroutines.flow.d $this_transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ResponseTransformerManager$buildResponse$$inlined$transform$1(kotlinx.coroutines.flow.d dVar, c cVar, boolean z11, FlowErrorTransformer flowErrorTransformer, IErrorChecker iErrorChecker, FlowModelTransformer flowModelTransformer) {
        super(2, cVar);
        this.$this_transform = dVar;
        this.$isSwiggyApi$inlined = z11;
        this.$errorTransformer$inlined = flowErrorTransformer;
        this.$errorChecker$inlined = iErrorChecker;
        this.$modelTransformer$inlined = flowModelTransformer;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        ResponseTransformerManager$buildResponse$$inlined$transform$1 responseTransformerManager$buildResponse$$inlined$transform$1 = new ResponseTransformerManager$buildResponse$$inlined$transform$1(this.$this_transform, cVar, this.$isSwiggyApi$inlined, this.$errorTransformer$inlined, this.$errorChecker$inlined, this.$modelTransformer$inlined);
        responseTransformerManager$buildResponse$$inlined$transform$1.L$0 = obj;
        return responseTransformerManager$buildResponse$$inlined$transform$1;
    }

    public final Object invoke(e<? super Response<? extends M>> eVar, c<? super k> cVar) {
        return ((ResponseTransformerManager$buildResponse$$inlined$transform$1) create(eVar, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.label;
        if (i11 == 0) {
            g.b(obj);
            final e eVar = (e) this.L$0;
            kotlinx.coroutines.flow.d dVar = this.$this_transform;
            final boolean z11 = this.$isSwiggyApi$inlined;
            final FlowErrorTransformer flowErrorTransformer = this.$errorTransformer$inlined;
            final IErrorChecker iErrorChecker = this.$errorChecker$inlined;
            final FlowModelTransformer flowModelTransformer = this.$modelTransformer$inlined;
            AnonymousClass1 r32 = new e<Response<R>>() {
                public Object emit(Object obj, c cVar) {
                    e eVar = eVar;
                    Response response = (Response) obj;
                    Object body = response.body();
                    int code = response.code();
                    if (z11 && (response.code() == 503 || response.code() == 403)) {
                        Object emit = eVar.emit(new Response.Failure(new Error.InternalError((String) null, (String) null, (Integer) null, 7, (i) null), (Boolean) null, (Object) null, (Integer) null, (String) null, 30, (i) null), cVar);
                        if (emit == b.d()) {
                            return emit;
                        }
                    } else if (z11 && response.code() == 429) {
                        Object emit2 = eVar.emit(new Response.Failure(new Error.ThrottleError(), (Boolean) null, (Object) null, (Integer) null, (String) null, 30, (i) null), cVar);
                        if (emit2 == b.d()) {
                            return emit2;
                        }
                    } else if (body == null || !response.isSuccessful()) {
                        Object emit3 = eVar.emit(ResponseTransformerManager.buildFailureResponse$default(ResponseTransformerManager.INSTANCE, response, body, response.errorBody(), (String) null, 8, (Object) null), cVar);
                        if (emit3 == b.d()) {
                            return emit3;
                        }
                    } else {
                        if (flowErrorTransformer != null) {
                            IErrorChecker iErrorChecker = iErrorChecker;
                            if (js.c.h(iErrorChecker == null ? null : a.a(iErrorChecker.shouldCheckForErrors(body)))) {
                                Object o11 = f.o(eVar, f.x(new ResponseTransformerManager$buildResponse$lambda3$$inlined$transform$1(flowErrorTransformer.invoke(body), (c) null)), cVar);
                                if (o11 == b.d()) {
                                    return o11;
                                }
                            }
                        }
                        FlowModelTransformer flowModelTransformer = flowModelTransformer;
                        if (flowModelTransformer != null) {
                            Object o12 = f.o(eVar, flowModelTransformer.invoke(body), cVar);
                            if (o12 == b.d()) {
                                return o12;
                            }
                        } else if (body instanceof SwiggyApiResponse) {
                            SwiggyApiResponse swiggyApiResponse = (SwiggyApiResponse) body;
                            if (swiggyApiResponse.isResponseOk()) {
                                Object emit4 = eVar.emit(Response.Companion.success$default(Response.Companion, body, (Boolean) null, a.d(code), 2, (Object) null), cVar);
                                if (emit4 == b.d()) {
                                    return emit4;
                                }
                            } else {
                                Object emit5 = eVar.emit(Response.Companion.failure$default(Response.Companion, new Error.UnhandledExceptionError((Throwable) null, swiggyApiResponse.getStatusMessage(), 1, (i) null), (Boolean) null, body, a.d(code), (String) null, 18, (Object) null), cVar);
                                if (emit5 == b.d()) {
                                    return emit5;
                                }
                            }
                        } else {
                            Object emit6 = eVar.emit(Response.Companion.success$default(Response.Companion, body, (Boolean) null, a.d(code), 2, (Object) null), cVar);
                            if (emit6 == b.d()) {
                                return emit6;
                            }
                        }
                    }
                    return k.f22762a;
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
