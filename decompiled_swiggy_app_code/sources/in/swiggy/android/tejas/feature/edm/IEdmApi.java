package in.swiggy.android.tejas.feature.edm;

import ao0.d;
import in.swiggy.android.tejas.api.models.SwiggyBaseResponse;
import in.swiggy.android.tejas.feature.edm.model.EdmPostableRating;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: IEdmApi.kt */
public interface IEdmApi {
    @POST("api/v1/ratings/order")
    d<Response<SwiggyBaseResponse>> postEdmRating(@Body EdmPostableRating edmPostableRating);
}
