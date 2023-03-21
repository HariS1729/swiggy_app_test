package in.swiggy.android.tejas.apiinterface;

import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.launch.model.network.LaunchResponse;
import in.swiggy.android.tejas.oldapi.network.responses.orderhistory.OrderHistoryResponseData;
import retrofit2.http.Query;

@Deprecated
public interface IDashAppAPI {
    SwiggyApiResponse<LaunchResponse> getDashLaunchData();

    SwiggyApiResponse<OrderHistoryResponseData> getOrderHistory(@Query("order_type") String str, @Query("count") int i11, @Query("from_time") long j);
}
