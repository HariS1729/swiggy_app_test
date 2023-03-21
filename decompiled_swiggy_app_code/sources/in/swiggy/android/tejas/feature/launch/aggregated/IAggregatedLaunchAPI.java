package in.swiggy.android.tejas.feature.launch.aggregated;

import ao0.d;
import in.swiggy.android.tejas.oldapi.network.requests.PostableAggregatedLaunchRequest;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* compiled from: IAggregatedLaunchAPI.kt */
public interface IAggregatedLaunchAPI {
    @POST("api/v2/launch")
    @Headers({"Content-Encoding:gzip"})
    d<Response<AggregatedLaunchResponse>> getAggregatedLaunchData(@Body PostableAggregatedLaunchRequest postableAggregatedLaunchRequest);

    @POST("api/v2/launch")
    @Headers({"Content-Encoding:gzip"})
    d<Response<AggregatedLaunchResponse>> getAggregatedLaunchData(@Header("swiggy_one_abuse_breach") boolean z11, @Body PostableAggregatedLaunchRequest postableAggregatedLaunchRequest);
}
