package in.swiggy.android.tejas.feature.launch.aggregated;

import fp0.c;
import in.swiggy.android.tejas.oldapi.network.requests.PostableAggregatedLaunchRequest;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* compiled from: IAggregatedCoroutineLaunchAPI.kt */
public interface IAggregatedCoroutineLaunchAPI {
    @POST("api/v2/launch")
    @Headers({"Content-Encoding:gzip"})
    Object getAggregatedLaunchData(@Body PostableAggregatedLaunchRequest postableAggregatedLaunchRequest, c<? super Response<AggregatedLaunchResponse>> cVar);

    @POST("api/v2/launch")
    @Headers({"Content-Encoding:gzip"})
    Object getAggregatedLaunchData(@Header("swiggy_one_abuse_breach") boolean z11, @Body PostableAggregatedLaunchRequest postableAggregatedLaunchRequest, c<? super Response<AggregatedLaunchResponse>> cVar);
}
