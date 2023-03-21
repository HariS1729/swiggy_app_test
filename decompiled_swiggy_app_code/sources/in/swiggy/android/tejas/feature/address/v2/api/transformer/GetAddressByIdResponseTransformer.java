package in.swiggy.android.tejas.feature.address.v2.api.transformer;

import com.swiggy.locationplatform.centraladdressservice.v1.GetAddressByAddressIDResponse;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.coroutineUtils.FlowModelTransformer;
import in.swiggy.android.tejas.feature.address.model.Address;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.f;

/* compiled from: GetAddressByIdResponseTransformer.kt */
public final class GetAddressByIdResponseTransformer extends FlowModelTransformer<GetAddressByAddressIDResponse, SwiggyApiResponse<Address>> {
    /* access modifiers changed from: protected */
    public d<Response<SwiggyApiResponse<Address>>> execute(GetAddressByAddressIDResponse getAddressByAddressIDResponse) {
        p.j(getAddressByAddressIDResponse, "parameters");
        return f.x(new GetAddressByIdResponseTransformer$execute$1(getAddressByAddressIDResponse, (c<? super GetAddressByIdResponseTransformer$execute$1>) null));
    }
}
