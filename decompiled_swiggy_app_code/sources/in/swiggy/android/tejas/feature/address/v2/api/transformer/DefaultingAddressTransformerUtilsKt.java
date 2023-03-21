package in.swiggy.android.tejas.feature.address.v2.api.transformer;

import com.swiggy.locationplatform.centraladdressservice.v1.EnrichedAddress;
import com.swiggy.locationplatform.centraladdressservice.v1.GetDefaultedAddressesResponse;
import in.swiggy.android.tejas.feature.address.model.DefaultingAddressInfo;
import in.swiggy.android.tejas.feature.address.model.GetAddressDefaultingResponseData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: DefaultingAddressTransformerUtils.kt */
public final class DefaultingAddressTransformerUtilsKt {
    public static final GetAddressDefaultingResponseData convertGetDefaultingAddressResponse(GetDefaultedAddressesResponse getDefaultedAddressesResponse) {
        p.j(getDefaultedAddressesResponse, "addressResponse");
        int number = getDefaultedAddressesResponse.getDefaultingType().getNumber();
        DefaultingAddressInfo defaultingAddressInfo = new DefaultingAddressInfo(Double.valueOf(getDefaultedAddressesResponse.getDefaultingInfo().getDefaultInstanceForType().getProximityWeight()));
        ArrayList arrayList = new ArrayList();
        List<EnrichedAddress> addressesList = getDefaultedAddressesResponse.getAddressesList();
        p.i(addressesList, "addressResponse.addressesList");
        for (EnrichedAddress enrichedAddress : addressesList) {
            p.i(enrichedAddress, "it");
            arrayList.add(AddressTranformerUtilsKt.getLocalAddressFromCAS(enrichedAddress));
        }
        return new GetAddressDefaultingResponseData(number, defaultingAddressInfo, arrayList);
    }
}
