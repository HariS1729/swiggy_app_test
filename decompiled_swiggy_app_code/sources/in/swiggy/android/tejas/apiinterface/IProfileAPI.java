package in.swiggy.android.tejas.apiinterface;

import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.api.models.SwiggyBaseResponse;
import in.swiggy.android.tejas.feature.address.model.AddAddressData;
import in.swiggy.android.tejas.feature.address.model.AllAddress;
import in.swiggy.android.tejas.oldapi.network.requests.EmptyPostableBody;
import in.swiggy.android.tejas.oldapi.network.requests.PostableEmailUpdate;
import in.swiggy.android.tejas.oldapi.network.requests.PostableLaunchRequest;
import in.swiggy.android.tejas.oldapi.network.requests.PostableMarkFavourite;
import in.swiggy.android.tejas.oldapi.network.requests.PostableMobileNumberEditOTP;
import in.swiggy.android.tejas.oldapi.network.requests.PostableSettingMessageRequest;
import in.swiggy.android.tejas.oldapi.network.requests.PostableSignInRequestV2;
import in.swiggy.android.tejas.oldapi.network.requests.PostableSignUpRequestV2;
import in.swiggy.android.tejas.oldapi.network.requests.PostableUpdatableAddress;
import in.swiggy.android.tejas.oldapi.network.responses.EmailUpdateParams;
import in.swiggy.android.tejas.oldapi.network.responses.LaunchData;
import in.swiggy.android.tejas.oldapi.network.responses.LoginCheckParams;
import in.swiggy.android.tejas.oldapi.network.responses.MobileEditCallAuthenticationData;
import in.swiggy.android.tejas.oldapi.network.responses.MobileNumberUpdateParams;
import in.swiggy.android.tejas.oldapi.network.responses.SettingsMessageResponse;
import in.swiggy.android.tejas.oldapi.network.responses.SuperDetailsResponseData;
import in.swiggy.android.tejas.oldapi.network.responses.UserResponseData;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Deprecated
public interface IProfileAPI {
    @FormUrlEncoded
    SwiggyApiResponse<UserResponseData> doSignIn(@Header("manufacturer") String str, @Header("model-name") String str2, @Field("otp") String str3, @Field("otp_source") String str4);

    SwiggyApiResponse<AllAddress> getAllAddresses();

    SwiggyBaseResponse getCallVerifyV2(@Query("mobile") String str);

    SwiggyApiResponse<LaunchData> getLaunchData(@Body PostableLaunchRequest postableLaunchRequest);

    SwiggyApiResponse<SettingsMessageResponse> getSettingsResponse(@Body PostableSettingMessageRequest postableSettingMessageRequest, @Query("silentSession") boolean z11);

    SwiggyApiResponse<SuperDetailsResponseData> getSuperDetails();

    SwiggyBaseResponse logOut();

    SwiggyApiResponse<LoginCheckParams> loginCheckV2(@Query("mobile") String str);

    SwiggyBaseResponse markFavourite(@Body PostableMarkFavourite postableMarkFavourite);

    SwiggyApiResponse<MobileEditCallAuthenticationData> mobileCallAuthenticationResponse(@Path("newNumber") String str, @Body EmptyPostableBody emptyPostableBody);

    SwiggyApiResponse<SwiggyBaseResponse> mobileEditOTPVerify(@Body PostableMobileNumberEditOTP postableMobileNumberEditOTP);

    SwiggyApiResponse<MobileNumberUpdateParams> mobileNumberUpdate(@Path("number") String str, @Body EmptyPostableBody emptyPostableBody);

    SwiggyApiResponse<UserResponseData> refreshProfile(@Header("manufacturer") String str, @Header("model-name") String str2, @Query("silentSession") boolean z11, @Query("optionalKeys") String str3);

    SwiggyBaseResponse sendOTPV2(@Query("mobile") String str);

    SwiggyBaseResponse setPasswordV2(@Body PostableSignInRequestV2 postableSignInRequestV2);

    SwiggyApiResponse<UserResponseData> signInV2(@Query("optionalKeys") String str, @Body PostableSignInRequestV2 postableSignInRequestV2);

    SwiggyBaseResponse signUpV2(@Body PostableSignUpRequestV2 postableSignUpRequestV2);

    SwiggyApiResponse<AddAddressData> updateAddress(@Body PostableUpdatableAddress postableUpdatableAddress);

    SwiggyApiResponse<EmailUpdateParams> updateEmail(@Body PostableEmailUpdate postableEmailUpdate);
}
