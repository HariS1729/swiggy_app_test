package in.swiggy.android.tejas.feature.auth.api;

import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.auth.models.OtpVerifyRequest;
import in.swiggy.android.tejas.oldapi.network.responses.UserResponseData;
import kotlinx.coroutines.flow.d;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: IOtpVerifyApi.kt */
public interface IOtpVerifyApi {
    @POST("api/v2/app/login/verify")
    d<Response<SwiggyApiResponse<UserResponseData>>> verifyOtp(@Header("manufacturer") String str, @Header("model-name") String str2, @Body OtpVerifyRequest otpVerifyRequest, @Query("otp_source") String str3);

    @POST("api/v3/app/login/verify")
    d<Response<SwiggyApiResponse<UserResponseData>>> verifyOtpV3(@Header("manufacturer") String str, @Header("model-name") String str2, @Body OtpVerifyRequest otpVerifyRequest, @Query("otp_source") String str3);
}
