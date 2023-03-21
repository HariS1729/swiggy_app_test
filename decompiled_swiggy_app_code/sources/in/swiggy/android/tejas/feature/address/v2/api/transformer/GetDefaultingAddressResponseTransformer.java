package in.swiggy.android.tejas.feature.address.v2.api.transformer;

import com.swiggy.locationplatform.centraladdressservice.v1.GetDefaultedAddressesResponse;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.coroutineUtils.FlowModelTransformer;
import in.swiggy.android.tejas.feature.address.model.GetAddressDefaultingResponseData;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.f;

/* compiled from: GetDefaultingAddressResponseTransformer.kt */
public final class GetDefaultingAddressResponseTransformer extends FlowModelTransformer<GetDefaultedAddressesResponse, SwiggyApiResponse<GetAddressDefaultingResponseData>> {
    /* access modifiers changed from: protected */
    public d<Response<SwiggyApiResponse<GetAddressDefaultingResponseData>>> execute(GetDefaultedAddressesResponse getDefaultedAddressesResponse) {
        p.j(getDefaultedAddressesResponse, "parameters");
        return f.x(new GetDefaultingAddressResponseTransformer$execute$1(getDefaultedAddressesResponse, (c<? super GetDefaultingAddressResponseTransformer$execute$1>) null));
    }
}
