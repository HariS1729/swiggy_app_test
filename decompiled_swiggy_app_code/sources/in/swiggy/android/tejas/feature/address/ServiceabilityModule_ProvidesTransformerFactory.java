package in.swiggy.android.tejas.feature.address;

import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.address.transformer.ServiceabilityTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ServiceabilityModule_ProvidesTransformerFactory implements e<ITransformer<SwiggyApiResponse<String>, Boolean>> {
    private final Provider<ServiceabilityTransformer> serviceabilityTransformerProvider;

    public ServiceabilityModule_ProvidesTransformerFactory(Provider<ServiceabilityTransformer> provider) {
        this.serviceabilityTransformerProvider = provider;
    }

    public static ServiceabilityModule_ProvidesTransformerFactory create(Provider<ServiceabilityTransformer> provider) {
        return new ServiceabilityModule_ProvidesTransformerFactory(provider);
    }

    public static ITransformer<SwiggyApiResponse<String>, Boolean> providesTransformer(ServiceabilityTransformer serviceabilityTransformer) {
        return (ITransformer) i.e(ServiceabilityModule.providesTransformer(serviceabilityTransformer));
    }

    public ITransformer<SwiggyApiResponse<String>, Boolean> get() {
        return providesTransformer(this.serviceabilityTransformerProvider.get());
    }
}
