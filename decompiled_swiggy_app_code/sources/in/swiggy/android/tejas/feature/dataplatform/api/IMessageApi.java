package in.swiggy.android.tejas.feature.dataplatform.api;

import ao0.s;
import in.swiggy.android.tejas.feature.dataplatform.model.Message;
import in.swiggy.android.tejas.feature.dataplatform.model.MessageEvent;
import java.util.List;
import java.util.Map;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* compiled from: IMessageApi.kt */
public interface IMessageApi {
    @POST("/message-set")
    s<Response<Void>> sendBulkMessage(@Body List<Message<MessageEvent>> list);

    @GET("/client/metric/event/gtm")
    s<Response<Void>> sendGTMEvent(@Query("e") String str, @QueryMap Map<String, String> map);

    @POST("/message")
    s<Response<Void>> sendMessage(@Body Message<MessageEvent> message);
}
