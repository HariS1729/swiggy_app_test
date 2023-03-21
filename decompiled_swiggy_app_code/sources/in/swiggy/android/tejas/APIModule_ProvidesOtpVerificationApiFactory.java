package in.swiggy.android.tejas;

import in.swiggy.android.tejas.feature.otpverification.IOtpVerificationApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class APIModule_ProvidesOtpVerificationApiFactory implements e<IOtpVerificationApi> {
    private final Provider<Retrofit> retrofitProvider;

    public APIModule_ProvidesOtpVerificationApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static APIModule_ProvidesOtpVerificationApiFactory create(Provider<Retrofit> provider) {
        return new APIModule_ProvidesOtpVerificationApiFactory(provider);
    }

    public static IOtpVerificationApi providesOtpVerificationApi(Retrofit retrofit) {
        return (IOtpVerificationApi) i.e(APIModule.providesOtpVerificationApi(retrofit));
    }

    public IOtpVerificationApi get() {
        return providesOtpVerificationApi(this.retrofitProvider.get());
    }
}
