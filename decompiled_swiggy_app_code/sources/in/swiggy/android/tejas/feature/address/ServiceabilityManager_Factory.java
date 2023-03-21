package in.swiggy.android.tejas.feature.address;

import in.swiggy.android.tejas.IDashAPI;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class ServiceabilityManager_Factory implements e<ServiceabilityManager> {
    private final Provider<IDashAPI> apiProvider;
    private final Provider<ITransformer<SwiggyApiResponse<String>, Boolean>> transformerProvider;

    public ServiceabilityManager_Factory(Provider<IDashAPI> provider, Provider<ITransformer<SwiggyApiResponse<String>, Boolean>> provider2) {
        this.apiProvider = provider;
        this.transformerProvider = provider2;
    }

    public static ServiceabilityManager_Factory create(Provider<IDashAPI> provider, Provider<ITransformer<SwiggyApiResponse<String>, Boolean>> provider2) {
        return new ServiceabilityManager_Factory(provider, provider2);
    }

    public static ServiceabilityManager newInstance(IDashAPI iDashAPI, ITransformer<SwiggyApiResponse<String>, Boolean> iTransformer) {
        return new ServiceabilityManager(iDashAPI, iTransformer);
    }

    public ServiceabilityManager get() {
        return newInstance(this.apiProvider.get(), this.transformerProvider.get());
    }
}
