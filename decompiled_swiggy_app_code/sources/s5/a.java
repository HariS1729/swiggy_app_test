package s5;

import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: MixPanelApiInterface */
public interface a {
    @POST("#past-events-batch")
    @Headers({"Accept: text/plain", "Content-Type: application/x-www-form-urlencoded"})
    Call<Object> a(@Query("data") String str);
}
