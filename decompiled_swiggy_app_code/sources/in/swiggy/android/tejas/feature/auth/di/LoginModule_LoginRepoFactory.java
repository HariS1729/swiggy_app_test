package in.swiggy.android.tejas.feature.auth.di;

import in.swiggy.android.tejas.feature.auth.api.IOtpVerifyApi;
import in.swiggy.android.tejas.feature.auth.repository.LoginRepository;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class LoginModule_LoginRepoFactory implements e<LoginRepository> {
    private final Provider<IOtpVerifyApi> otpVerifyApiProvider;

    public LoginModule_LoginRepoFactory(Provider<IOtpVerifyApi> provider) {
        this.otpVerifyApiProvider = provider;
    }

    public static LoginModule_LoginRepoFactory create(Provider<IOtpVerifyApi> provider) {
        return new LoginModule_LoginRepoFactory(provider);
    }

    public static LoginRepository loginRepo(IOtpVerifyApi iOtpVerifyApi) {
        return (LoginRepository) i.e(LoginModule.INSTANCE.loginRepo(iOtpVerifyApi));
    }

    public LoginRepository get() {
        return loginRepo(this.otpVerifyApiProvider.get());
    }
}
