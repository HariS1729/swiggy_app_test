package in.swiggy.android.tejas.feature.auth.di;

import in.swiggy.android.tejas.api.ApiEndPointType;
import in.swiggy.android.tejas.feature.auth.api.IOtpVerifyApi;
import in.swiggy.android.tejas.feature.auth.repository.LoginRepoImpl;
import in.swiggy.android.tejas.feature.auth.repository.LoginRepository;
import in.swiggy.android.tejas.qualifiers.retrofit.RetrofitDevApi;
import kotlin.jvm.internal.p;
import retrofit2.Retrofit;

/* compiled from: LoginModule.kt */
public final class LoginModule {
    public static final LoginModule INSTANCE = new LoginModule();

    private LoginModule() {
    }

    public final LoginRepository loginRepo(IOtpVerifyApi iOtpVerifyApi) {
        p.j(iOtpVerifyApi, "otpVerifyApi");
        return new LoginRepoImpl(iOtpVerifyApi);
    }

    public final IOtpVerifyApi otpVerifyApi(@RetrofitDevApi(apiType = ApiEndPointType.PROFILE_API) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        return (IOtpVerifyApi) retrofit.create(IOtpVerifyApi.class);
    }
}
