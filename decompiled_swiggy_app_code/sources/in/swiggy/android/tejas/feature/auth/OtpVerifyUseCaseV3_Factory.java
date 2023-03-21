package in.swiggy.android.tejas.feature.auth;

import in.swiggy.android.tejas.feature.auth.repository.LoginRepository;
import javax.inject.Provider;
import qq.e;

public final class OtpVerifyUseCaseV3_Factory implements e<OtpVerifyUseCaseV3> {
    private final Provider<LoginRepository> loginRepoProvider;

    public OtpVerifyUseCaseV3_Factory(Provider<LoginRepository> provider) {
        this.loginRepoProvider = provider;
    }

    public static OtpVerifyUseCaseV3_Factory create(Provider<LoginRepository> provider) {
        return new OtpVerifyUseCaseV3_Factory(provider);
    }

    public static OtpVerifyUseCaseV3 newInstance(LoginRepository loginRepository) {
        return new OtpVerifyUseCaseV3(loginRepository);
    }

    public OtpVerifyUseCaseV3 get() {
        return newInstance(this.loginRepoProvider.get());
    }
}
