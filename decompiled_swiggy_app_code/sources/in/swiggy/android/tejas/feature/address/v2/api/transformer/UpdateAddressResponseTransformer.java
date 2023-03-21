package in.swiggy.android.tejas.feature.address.v2.api.transformer;

import com.swiggy.locationplatform.centraladdressservice.v1.UpdateAddressResponse;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.coroutineUtils.FlowModelTransformer;
import in.swiggy.android.tejas.feature.address.model.AddAddressData;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.f;

/* compiled from: UpdateAddressResponseTransformer.kt */
public final class UpdateAddressResponseTransformer extends FlowModelTransformer<UpdateAddressResponse, SwiggyApiResponse<AddAddressData>> {
    /* access modifiers changed from: protected */
    public d<Response<SwiggyApiResponse<AddAddressData>>> execute(UpdateAddressResponse updateAddressResponse) {
        p.j(updateAddressResponse, "parameters");
        return f.x(new UpdateAddressResponseTransformer$execute$1(updateAddressResponse, (c<? super UpdateAddressResponseTransformer$execute$1>) null));
    }
}
