package in.swiggy.android.tejas.feature.address.v2.api.transformer;

import com.swiggy.locationplatform.centraladdressservice.v1.GetAddressesResponse;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.coroutineUtils.FlowModelTransformer;
import in.swiggy.android.tejas.feature.address.model.AllAddress;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.f;

/* compiled from: GetAddressesResponseTransformer.kt */
public final class GetAddressesResponseTransformer extends FlowModelTransformer<GetAddressesResponse, SwiggyApiResponse<AllAddress>> {
    /* access modifiers changed from: protected */
    public d<Response<SwiggyApiResponse<AllAddress>>> execute(GetAddressesResponse getAddressesResponse) {
        p.j(getAddressesResponse, "parameters");
        return f.x(new GetAddressesResponseTransformer$execute$1(getAddressesResponse, (c<? super GetAddressesResponseTransformer$execute$1>) null));
    }
}
