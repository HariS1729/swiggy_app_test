package in.swiggy.android.tejas;

import in.swiggy.android.tejas.payment.IPaymentApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class SwiggyTejasEngineModule_ProvidesSwiggyDevApiFactory implements e<IPaymentApi> {
    private final Provider<Retrofit> retrofitProvider;

    public SwiggyTejasEngineModule_ProvidesSwiggyDevApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static SwiggyTejasEngineModule_ProvidesSwiggyDevApiFactory create(Provider<Retrofit> provider) {
        return new SwiggyTejasEngineModule_ProvidesSwiggyDevApiFactory(provider);
    }

    public static IPaymentApi providesSwiggyDevApi(Retrofit retrofit) {
        return (IPaymentApi) i.e(SwiggyTejasEngineModule.INSTANCE.providesSwiggyDevApi(retrofit));
    }

    public IPaymentApi get() {
        return providesSwiggyDevApi(this.retrofitProvider.get());
    }
}
