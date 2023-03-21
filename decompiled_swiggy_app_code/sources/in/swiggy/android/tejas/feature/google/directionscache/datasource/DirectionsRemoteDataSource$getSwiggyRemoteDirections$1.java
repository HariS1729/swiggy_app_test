package in.swiggy.android.tejas.feature.google.directionscache.datasource;

import bp0.g;
import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsRequest;
import in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsResponse;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.f;
import lp0.p;

@d(c = "in.swiggy.android.tejas.feature.google.directionscache.datasource.DirectionsRemoteDataSource$getSwiggyRemoteDirections$1", f = "DirectionsRemoteDataSource.kt", l = {}, m = "invokeSuspend")
/* compiled from: DirectionsRemoteDataSource.kt */
final class DirectionsRemoteDataSource$getSwiggyRemoteDirections$1 extends SuspendLambda implements p<Response<? extends DirectionsResponse>, c<? super kotlinx.coroutines.flow.d<? extends Response<? extends DirectionsResponse>>>, Object> {
    final /* synthetic */ DirectionsRequest $request;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DirectionsRemoteDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DirectionsRemoteDataSource$getSwiggyRemoteDirections$1(DirectionsRemoteDataSource directionsRemoteDataSource, DirectionsRequest directionsRequest, c<? super DirectionsRemoteDataSource$getSwiggyRemoteDirections$1> cVar) {
        super(2, cVar);
        this.this$0 = directionsRemoteDataSource;
        this.$request = directionsRequest;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        DirectionsRemoteDataSource$getSwiggyRemoteDirections$1 directionsRemoteDataSource$getSwiggyRemoteDirections$1 = new DirectionsRemoteDataSource$getSwiggyRemoteDirections$1(this.this$0, this.$request, cVar);
        directionsRemoteDataSource$getSwiggyRemoteDirections$1.L$0 = obj;
        return directionsRemoteDataSource$getSwiggyRemoteDirections$1;
    }

    public final Object invoke(Response<DirectionsResponse> response, c<? super kotlinx.coroutines.flow.d<? extends Response<DirectionsResponse>>> cVar) {
        return ((DirectionsRemoteDataSource$getSwiggyRemoteDirections$1) create(response, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.label == 0) {
            g.b(obj);
            Response response = (Response) this.L$0;
            if (response instanceof Response.Failure) {
                return this.this$0.getGoogleRemoteDirections(this.$request);
            }
            return f.y(response);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
