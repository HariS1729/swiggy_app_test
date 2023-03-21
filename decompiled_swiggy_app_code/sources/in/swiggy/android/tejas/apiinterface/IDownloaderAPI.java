package in.swiggy.android.tejas.apiinterface;

import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

@Deprecated
public interface IDownloaderAPI {
    @Streaming
    Response<ResponseBody> downloadFileByUrl(@Url String str);

    Response<ResponseBody> hitAppsFlyerPixel(@Url String str);
}
