package in.swiggy.android.tejas.feature.auth.repository;

import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.auth.models.OtpVerifyData;
import in.swiggy.android.tejas.oldapi.network.responses.UserResponseData;
import kotlinx.coroutines.flow.d;

/* compiled from: LoginRepository.kt */
public interface LoginRepository {
    d<Response<SwiggyApiResponse<UserResponseData>>> verifyOtp(OtpVerifyData otpVerifyData);

    d<Response<SwiggyApiResponse<UserResponseData>>> verifyOtpV3(OtpVerifyData otpVerifyData);
}
