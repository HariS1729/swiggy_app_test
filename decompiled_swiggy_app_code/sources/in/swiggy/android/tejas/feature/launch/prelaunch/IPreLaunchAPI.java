package in.swiggy.android.tejas.feature.launch.prelaunch;

import ao0.d;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.oldapi.network.requests.PostablePreLaunchRequest;
import in.swiggy.android.tejas.oldapi.network.responses.PreLaunchData;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: IPreLaunchAPI.kt */
public interface IPreLaunchAPI {
    @POST("api/v1/config/preLaunch")
    d<SwiggyApiResponse<PreLaunchData>> getPreLaunchData(@Body PostablePreLaunchRequest postablePreLaunchRequest);
}
