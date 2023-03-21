package in.swiggy.android.tejas.deliveryInstructions;

import in.swiggy.android.tejas.deliveryInstructions.api.IEditOrderApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class DeliveryInstructionsModule_Dependencies_ProvidesEditOrderApiFactory implements e<IEditOrderApi> {
    private final Provider<Retrofit> retrofitProvider;

    public DeliveryInstructionsModule_Dependencies_ProvidesEditOrderApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static DeliveryInstructionsModule_Dependencies_ProvidesEditOrderApiFactory create(Provider<Retrofit> provider) {
        return new DeliveryInstructionsModule_Dependencies_ProvidesEditOrderApiFactory(provider);
    }

    public static IEditOrderApi providesEditOrderApi(Retrofit retrofit) {
        return (IEditOrderApi) i.e(DeliveryInstructionsModule.Dependencies.providesEditOrderApi(retrofit));
    }

    public IEditOrderApi get() {
        return providesEditOrderApi(this.retrofitProvider.get());
    }
}
