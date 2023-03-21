package in.swiggy.android.tejas.feature.address.v2.api.transformer;

import bp0.g;
import bp0.k;
import com.swiggy.locationplatform.centraladdressservice.v1.CreateAddressResponse;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.address.model.AddAddressData;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.a;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.flow.e;
import lp0.p;

@d(c = "in.swiggy.android.tejas.feature.address.v2.api.transformer.CreateAddressResponseTransformer$execute$1", f = "CreateAddressResponseTransformer.kt", l = {21}, m = "invokeSuspend")
/* compiled from: CreateAddressResponseTransformer.kt */
final class CreateAddressResponseTransformer$execute$1 extends SuspendLambda implements p<e<? super Response<? extends SwiggyApiResponse<AddAddressData>>>, c<? super k>, Object> {
    final /* synthetic */ CreateAddressResponse $parameters;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CreateAddressResponseTransformer$execute$1(CreateAddressResponse createAddressResponse, c<? super CreateAddressResponseTransformer$execute$1> cVar) {
        super(2, cVar);
        this.$parameters = createAddressResponse;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        CreateAddressResponseTransformer$execute$1 createAddressResponseTransformer$execute$1 = new CreateAddressResponseTransformer$execute$1(this.$parameters, cVar);
        createAddressResponseTransformer$execute$1.L$0 = obj;
        return createAddressResponseTransformer$execute$1;
    }

    public final Object invoke(e<? super Response<SwiggyApiResponse<AddAddressData>>> eVar, c<? super k> cVar) {
        return ((CreateAddressResponseTransformer$execute$1) create(eVar, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.label;
        if (i11 == 0) {
            g.b(obj);
            CreateAddressResponse createAddressResponse = this.$parameters;
            Response.Companion companion = Response.Companion;
            Integer d12 = a.d(0);
            AddAddressData addAddressData = r9;
            AddAddressData addAddressData2 = new AddAddressData(createAddressResponse.getId(), true, (Integer) null, (Integer) null, (Integer) null, false, 60, (i) null);
            Response success$default = Response.Companion.success$default(companion, new SwiggyApiResponse(d12, (String) null, addAddressData), (Boolean) null, (Integer) null, 6, (Object) null);
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
