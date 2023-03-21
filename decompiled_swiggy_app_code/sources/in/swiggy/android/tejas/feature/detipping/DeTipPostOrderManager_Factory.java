package in.swiggy.android.tejas.feature.detipping;

import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.feature.detipping.api.IDeTipPostOrderApi;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class DeTipPostOrderManager_Factory implements e<DeTipPostOrderManager> {
    private final Provider<IDeTipPostOrderApi> deTipApiProvider;
    private final Provider<ITransformer<Throwable, Error>> exceptionTransformerProvider;

    public DeTipPostOrderManager_Factory(Provider<IDeTipPostOrderApi> provider, Provider<ITransformer<Throwable, Error>> provider2) {
        this.deTipApiProvider = provider;
        this.exceptionTransformerProvider = provider2;
    }

    public static DeTipPostOrderManager_Factory create(Provider<IDeTipPostOrderApi> provider, Provider<ITransformer<Throwable, Error>> provider2) {
        return new DeTipPostOrderManager_Factory(provider, provider2);
    }

    public static DeTipPostOrderManager newInstance(IDeTipPostOrderApi iDeTipPostOrderApi, ITransformer<Throwable, Error> iTransformer) {
        return new DeTipPostOrderManager(iDeTipPostOrderApi, iTransformer);
    }

    public DeTipPostOrderManager get() {
        return newInstance(this.deTipApiProvider.get(), this.exceptionTransformerProvider.get());
    }
}
