package in.swiggy.android.tejas.feature.auth.repository;

import in.swiggy.android.tejas.feature.auth.api.IOtpVerifyApi;
import javax.inject.Provider;
import qq.e;

public final class LoginRepoImpl_Factory implements e<LoginRepoImpl> {
    private final Provider<IOtpVerifyApi> otpVerifyApiProvider;

    public LoginRepoImpl_Factory(Provider<IOtpVerifyApi> provider) {
        this.otpVerifyApiProvider = provider;
    }

    public static LoginRepoImpl_Factory create(Provider<IOtpVerifyApi> provider) {
        return new LoginRepoImpl_Factory(provider);
    }

    public static LoginRepoImpl newInstance(IOtpVerifyApi iOtpVerifyApi) {
        return new LoginRepoImpl(iOtpVerifyApi);
    }

    public LoginRepoImpl get() {
        return newInstance(this.otpVerifyApiProvider.get());
    }
}
