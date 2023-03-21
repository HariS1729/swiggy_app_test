package in.swiggy.android.tejas.feature.helpcenter;

import ao0.d;
import retrofit2.Response;
import retrofit2.http.GET;

/* compiled from: IHelpCenterAPI.kt */
public interface IHelpCenterAPI {
    @GET("https://www.swiggy.com/mapi/help/resources")
    d<Response<WebResourceResponse>> getWebResourceList();
}
