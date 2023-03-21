package in.swiggy.android.tejas.feature.auth;

import in.swiggy.android.tejas.feature.auth.repository.LoginRepository;
import javax.inject.Provider;
import qq.e;

public final class OtpVerifyUseCase_Factory implements e<OtpVerifyUseCase> {
    private final Provider<LoginRepository> loginRepoProvider;

    public OtpVerifyUseCase_Factory(Provider<LoginRepository> provider) {
        this.loginRepoProvider = provider;
    }

    public static OtpVerifyUseCase_Factory create(Provider<LoginRepository> provider) {
        return new OtpVerifyUseCase_Factory(provider);
    }

    public static OtpVerifyUseCase newInstance(LoginRepository loginRepository) {
        return new OtpVerifyUseCase(loginRepository);
    }

    public OtpVerifyUseCase get() {
        return newInstance(this.loginRepoProvider.get());
    }
}
