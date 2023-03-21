package in.swiggy.android.tejas.feature.google.directionscache.repository;

import bp0.g;
import bp0.k;
import com.newrelic.agent.android.util.SafeJsonPrimitive;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsResponse;
import in.swiggy.android.tejas.network.utils.NetworkBoundResourceKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.flow.e;
import lp0.q;
import os.u;

@d(c = "in.swiggy.android.tejas.feature.google.directionscache.repository.DirectionsRepositoryImpl$getDirections$lambda-5$$inlined$networkBoundResource$default$2", f = "DirectionsRepositoryImpl.kt", l = {78}, m = "invokeSuspend")
/* renamed from: in.swiggy.android.tejas.feature.google.directionscache.repository.DirectionsRepositoryImpl$getDirections$lambda-5$$inlined$networkBoundResource$default$2  reason: invalid class name */
/* compiled from: NetworkBoundResource.kt */
public final class DirectionsRepositoryImpl$getDirections$lambda5$$inlined$networkBoundResource$default$2 extends SuspendLambda implements q<e<? super Response<? extends DirectionsResponse>>, Throwable, c<? super k>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public DirectionsRepositoryImpl$getDirections$lambda5$$inlined$networkBoundResource$default$2(c cVar) {
        super(3, cVar);
    }

    public final Object invoke(e<? super Response<? extends DirectionsResponse>> eVar, Throwable th2, c<? super k> cVar) {
        DirectionsRepositoryImpl$getDirections$lambda5$$inlined$networkBoundResource$default$2 r02 = new DirectionsRepositoryImpl$getDirections$lambda5$$inlined$networkBoundResource$default$2(cVar);
        r02.L$0 = eVar;
        r02.L$1 = th2;
        return r02.invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.label;
        if (i11 == 0) {
            g.b(obj);
            Throwable th2 = (Throwable) this.L$1;
            u.b(NetworkBoundResourceKt.NBR_TAG, "flow catch " + th2.getMessage() + SafeJsonPrimitive.NULL_CHAR + th2);
            Response.Failure failure = new Response.Failure(new Error.UnhandledExceptionError(th2, th2.getMessage()), (Boolean) null, (Object) null, (Integer) null, (String) null, 30, (i) null);
            this.label = 1;
            if (((e) this.L$0).emit(failure, this) == d11) {
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
