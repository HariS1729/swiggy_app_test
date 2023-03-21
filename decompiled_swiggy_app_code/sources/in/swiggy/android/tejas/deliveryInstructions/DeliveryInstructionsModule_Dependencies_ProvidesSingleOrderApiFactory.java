package in.swiggy.android.tejas.deliveryInstructions;

import in.swiggy.android.tejas.deliveryInstructions.api.ISingleOrderApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class DeliveryInstructionsModule_Dependencies_ProvidesSingleOrderApiFactory implements e<ISingleOrderApi> {
    private final Provider<Retrofit> retrofitProvider;

    public DeliveryInstructionsModule_Dependencies_ProvidesSingleOrderApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static DeliveryInstructionsModule_Dependencies_ProvidesSingleOrderApiFactory create(Provider<Retrofit> provider) {
        return new DeliveryInstructionsModule_Dependencies_ProvidesSingleOrderApiFactory(provider);
    }

    public static ISingleOrderApi providesSingleOrderApi(Retrofit retrofit) {
        return (ISingleOrderApi) i.e(DeliveryInstructionsModule.Dependencies.providesSingleOrderApi(retrofit));
    }

    public ISingleOrderApi get() {
        return providesSingleOrderApi(this.retrofitProvider.get());
    }
}
