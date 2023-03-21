package in.swiggy.android.tejas.feature.cloudinaryupload;

import ao0.s;
import in.swiggy.android.tejas.feature.cloudinaryupload.imageupload.data.GenerateTokenApiResponse;
import java.util.Map;
import okhttp3.MultipartBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: ICloudinaryApi.kt */
public interface ICloudinaryApi {
    @GET("https://stores.swiggy.com/generate-token")
    s<GenerateTokenApiResponse> generateSigningToken(@Query("timestamp") long j, @Query("upload_preset") String str);

    @POST("https://api.cloudinary.com/v1_1/swiggy/image/upload")
    s<Map<Object, Object>> uploadImage(@Body MultipartBody multipartBody);
}
