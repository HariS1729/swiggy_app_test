package in.swiggy.android.tejas.feature.auth.di;

import in.swiggy.android.tejas.feature.auth.api.IOtpVerifyApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class LoginModule_OtpVerifyApiFactory implements e<IOtpVerifyApi> {
    private final Provider<Retrofit> retrofitProvider;

    public LoginModule_OtpVerifyApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static LoginModule_OtpVerifyApiFactory create(Provider<Retrofit> provider) {
        return new LoginModule_OtpVerifyApiFactory(provider);
    }

    public static IOtpVerifyApi otpVerifyApi(Retrofit retrofit) {
        return (IOtpVerifyApi) i.e(LoginModule.INSTANCE.otpVerifyApi(retrofit));
    }

    public IOtpVerifyApi get() {
        return otpVerifyApi(this.retrofitProvider.get());
    }
}
