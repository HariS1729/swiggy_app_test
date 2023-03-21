package in.swiggy.android.tejas.feature.address.v2.api.transformer;

import bp0.g;
import bp0.k;
import com.swiggy.locationplatform.centraladdressservice.v1.GetAddressesResponse;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.address.model.AllAddress;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.a;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import lp0.p;

@d(c = "in.swiggy.android.tejas.feature.address.v2.api.transformer.GetAddressesResponseTransformer$execute$1", f = "GetAddressesResponseTransformer.kt", l = {22}, m = "invokeSuspend")
/* compiled from: GetAddressesResponseTransformer.kt */
final class GetAddressesResponseTransformer$execute$1 extends SuspendLambda implements p<e<? super Response<? extends SwiggyApiResponse<AllAddress>>>, c<? super k>, Object> {
    final /* synthetic */ GetAddressesResponse $parameters;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GetAddressesResponseTransformer$execute$1(GetAddressesResponse getAddressesResponse, c<? super GetAddressesResponseTransformer$execute$1> cVar) {
        super(2, cVar);
        this.$parameters = getAddressesResponse;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        GetAddressesResponseTransformer$execute$1 getAddressesResponseTransformer$execute$1 = new GetAddressesResponseTransformer$execute$1(this.$parameters, cVar);
        getAddressesResponseTransformer$execute$1.L$0 = obj;
        return getAddressesResponseTransformer$execute$1;
    }

    public final Object invoke(e<? super Response<SwiggyApiResponse<AllAddress>>> eVar, c<? super k> cVar) {
        return ((GetAddressesResponseTransformer$execute$1) create(eVar, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.label;
        if (i11 == 0) {
            g.b(obj);
            Response success$default = Response.Companion.success$default(Response.Companion, new SwiggyApiResponse(a.d(0), (String) null, new AllAddress((ArrayList) AddressTranformerUtilsKt.convertGetAddressResponse(this.$parameters))), (Boolean) null, (Integer) null, 6, (Object) null);
            this.label = 1;
            if (((e) this.L$0).emit(success$default, this) == d11) {
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
