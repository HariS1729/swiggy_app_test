package in.swiggy.android.tejas.deliveryInstructions.repository;

import in.swiggy.android.tejas.coroutineUtils.ModelTransformer;
import in.swiggy.android.tejas.deliveryInstructions.api.IEditOrderApi;
import in.swiggy.android.tejas.deliveryInstructions.api.ISingleOrderApi;
import java.util.Map;
import javax.inject.Provider;
import qq.e;

public final class DeliveryInstructionsUpdateRepo_Factory implements e<DeliveryInstructionsUpdateRepo> {
    private final Provider<IEditOrderApi> editOrderApiProvider;
    private final Provider<ISingleOrderApi> singleOrderApiProvider;
    private final Provider<Map<Class<? extends ModelTransformer>, ModelTransformer>> transformersProvider;

    public DeliveryInstructionsUpdateRepo_Factory(Provider<IEditOrderApi> provider, Provider<ISingleOrderApi> provider2, Provider<Map<Class<? extends ModelTransformer>, ModelTransformer>> provider3) {
        this.editOrderApiProvider = provider;
        this.singleOrderApiProvider = provider2;
        this.transformersProvider = provider3;
    }

    public static DeliveryInstructionsUpdateRepo_Factory create(Provider<IEditOrderApi> provider, Provider<ISingleOrderApi> provider2, Provider<Map<Class<? extends ModelTransformer>, ModelTransformer>> provider3) {
        return new DeliveryInstructionsUpdateRepo_Factory(provider, provider2, provider3);
    }

    public static DeliveryInstructionsUpdateRepo newInstance(IEditOrderApi iEditOrderApi, ISingleOrderApi iSingleOrderApi, Map<Class<? extends ModelTransformer>, ModelTransformer> map) {
        return new DeliveryInstructionsUpdateRepo(iEditOrderApi, iSingleOrderApi, map);
    }

    public DeliveryInstructionsUpdateRepo get() {
        return newInstance(this.editOrderApiProvider.get(), this.singleOrderApiProvider.get(), this.transformersProvider.get());
    }
}
