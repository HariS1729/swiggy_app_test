package in.swiggy.android.tejas.feature.address.v2.api.transformer;

import com.swiggy.locationplatform.centraladdressservice.v1.CreateAddressResponse;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.coroutineUtils.FlowModelTransformer;
import in.swiggy.android.tejas.feature.address.model.AddAddressData;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.f;

/* compiled from: CreateAddressResponseTransformer.kt */
public final class CreateAddressResponseTransformer extends FlowModelTransformer<CreateAddressResponse, SwiggyApiResponse<AddAddressData>> {
    /* access modifiers changed from: protected */
    public d<Response<SwiggyApiResponse<AddAddressData>>> execute(CreateAddressResponse createAddressResponse) {
        p.j(createAddressResponse, "parameters");
        return f.x(new CreateAddressResponseTransformer$execute$1(createAddressResponse, (c<? super CreateAddressResponseTransformer$execute$1>) null));
    }
}
