package v5;

import java.util.Map;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Url;

/* compiled from: ApiInterface */
public interface b {
    @POST
    @Multipart
    Call<ResponseBody> a(@Url String str, @HeaderMap Map<String, String> map, @Part MultipartBody.Part part, @Part MultipartBody.Part part2, @PartMap Map<String, RequestBody> map2, @Part("isBackCamera") RequestBody requestBody);

    @POST
    @Multipart
    Call<ResponseBody> b(@Url String str, @HeaderMap Map<String, String> map, @Part MultipartBody.Part part, @PartMap Map<String, RequestBody> map2);

    @POST
    @Multipart
    Call<ResponseBody> c(@Url String str, @HeaderMap Map<String, String> map, @Part MultipartBody.Part part, @Part MultipartBody.Part part2, @PartMap Map<String, RequestBody> map2);

    @POST
    @Multipart
    Call<ResponseBody> d(@Url String str, @HeaderMap Map<String, String> map, @Part MultipartBody.Part part, @Part MultipartBody.Part part2, @PartMap Map<String, RequestBody> map2);

    @GET
    Call<ResponseBody> e(@Url String str, @HeaderMap Map<String, String> map);

    @POST
    @Multipart
    Call<ResponseBody> f(@Url String str, @HeaderMap Map<String, String> map, @Part MultipartBody.Part part, @PartMap Map<String, RequestBody> map2, @Part("isBackCamera") RequestBody requestBody);
}
