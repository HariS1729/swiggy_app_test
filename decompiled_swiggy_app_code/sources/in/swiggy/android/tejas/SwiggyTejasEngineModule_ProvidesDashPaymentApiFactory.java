package in.swiggy.android.tejas;

import in.swiggy.android.tejas.payment.IDashPaymentApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class SwiggyTejasEngineModule_ProvidesDashPaymentApiFactory implements e<IDashPaymentApi> {
    private final Provider<Retrofit> retrofitProvider;

    public SwiggyTejasEngineModule_ProvidesDashPaymentApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static SwiggyTejasEngineModule_ProvidesDashPaymentApiFactory create(Provider<Retrofit> provider) {
        return new SwiggyTejasEngineModule_ProvidesDashPaymentApiFactory(provider);
    }

    public static IDashPaymentApi providesDashPaymentApi(Retrofit retrofit) {
        return (IDashPaymentApi) i.e(SwiggyTejasEngineModule.INSTANCE.providesDashPaymentApi(retrofit));
    }

    public IDashPaymentApi get() {
        return providesDashPaymentApi(this.retrofitProvider.get());
    }
}
