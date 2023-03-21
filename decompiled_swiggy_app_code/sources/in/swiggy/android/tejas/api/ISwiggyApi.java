package in.swiggy.android.tejas.api;

import ao0.d;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.tracking.cards.model.CardList;
import in.swiggy.android.tejas.feature.tracking.cards.model.CardRequest;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: ISwiggyApi.kt */
public interface ISwiggyApi {
    @POST("api/v1/track/card")
    d<Response<SwiggyApiResponse<CardList>>> getTrackCardList(@Body CardRequest cardRequest);
}
