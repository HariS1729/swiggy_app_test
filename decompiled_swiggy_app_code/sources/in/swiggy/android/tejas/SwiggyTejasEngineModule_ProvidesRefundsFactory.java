package in.swiggy.android.tejas;

import in.swiggy.android.tejas.payment.IRefundsAPI;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class SwiggyTejasEngineModule_ProvidesRefundsFactory implements e<IRefundsAPI> {
    private final Provider<Retrofit> retrofitProvider;

    public SwiggyTejasEngineModule_ProvidesRefundsFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static SwiggyTejasEngineModule_ProvidesRefundsFactory create(Provider<Retrofit> provider) {
        return new SwiggyTejasEngineModule_ProvidesRefundsFactory(provider);
    }

    public static IRefundsAPI providesRefunds(Retrofit retrofit) {
        return (IRefundsAPI) i.e(SwiggyTejasEngineModule.INSTANCE.providesRefunds(retrofit));
    }

    public IRefundsAPI get() {
        return providesRefunds(this.retrofitProvider.get());
    }
}
