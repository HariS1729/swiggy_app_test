package in.swiggy.android.tejas.apiinterface;

import fp0.c;
import in.swiggy.android.tejas.api.models.SwiggyBaseResponse;
import in.swiggy.android.tejas.oldapi.network.requests.PostableDeviceAddSPNS;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: ISpnsApi.kt */
public interface ISpnsApi {
    @POST("analytics/transactional/device/add/")
    Object registerDeviceSPNS(@Body PostableDeviceAddSPNS postableDeviceAddSPNS, c<? super Response<SwiggyBaseResponse>> cVar);
}
