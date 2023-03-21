package v5;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;
import u5.b;

/* compiled from: RemoteConfigApiInterface */
public interface e {
    @GET
    Call<b> a(@Url String str);

    @GET
    Call<co.hyperverge.hypersnapsdk.b.e> b(@Url String str);
}
