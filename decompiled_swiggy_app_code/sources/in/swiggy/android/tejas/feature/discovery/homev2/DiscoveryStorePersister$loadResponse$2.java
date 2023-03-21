package in.swiggy.android.tejas.feature.discovery.homev2;

import bp0.g;
import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.feature.listing.ListingResponse;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.flow.e;
import lp0.p;

@d(c = "in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStorePersister$loadResponse$2", f = "DiscoveryStorePersister.kt", l = {96}, m = "invokeSuspend")
/* compiled from: DiscoveryStorePersister.kt */
final class DiscoveryStorePersister$loadResponse$2 extends SuspendLambda implements p<e<? super Response<? extends ListingResponse>>, c<? super k>, Object> {
    final /* synthetic */ Exception $e;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DiscoveryStorePersister$loadResponse$2(Exception exc, c<? super DiscoveryStorePersister$loadResponse$2> cVar) {
        super(2, cVar);
        this.$e = exc;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        DiscoveryStorePersister$loadResponse$2 discoveryStorePersister$loadResponse$2 = new DiscoveryStorePersister$loadResponse$2(this.$e, cVar);
        discoveryStorePersister$loadResponse$2.L$0 = obj;
        return discoveryStorePersister$loadResponse$2;
    }

    public final Object invoke(e<? super Response<ListingResponse>> eVar, c<? super k> cVar) {
        return ((DiscoveryStorePersister$loadResponse$2) create(eVar, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.label;
        if (i11 == 0) {
            g.b(obj);
            e eVar = (e) this.L$0;
            String message = this.$e.getMessage();
            if (message == null) {
                message = "json parsing error";
            }
            Response.Failure failure = new Response.Failure(new Error.UnhandledError(message, (Integer) null, (String) null, (String) null, (Throwable) null, 30, (i) null), (Boolean) null, (Object) null, (Integer) null, (String) null, 30, (i) null);
            this.label = 1;
            if (eVar.emit(failure, this) == d11) {
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
