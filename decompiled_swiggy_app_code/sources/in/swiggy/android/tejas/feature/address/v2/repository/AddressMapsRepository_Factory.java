package in.swiggy.android.tejas.feature.address.v2.repository;

import in.swiggy.android.tejas.coroutineUtils.ModelTransformer;
import in.swiggy.android.tejas.feature.address.v2.api.IAddressMapsJsonApi;
import in.swiggy.android.tejas.feature.address.v2.api.IAddressMapsProtoApi;
import java.util.Map;
import javax.inject.Provider;
import os.a;
import qq.e;

public final class AddressMapsRepository_Factory implements e<AddressMapsRepository> {
    private final Provider<IAddressMapsJsonApi> addressJsonApiProvider;
    private final Provider<IAddressMapsProtoApi> addressProtoApiProvider;
    private final Provider<a> appBuildDetailsProvider;
    private final Provider<Map<Class<? extends ModelTransformer>, ModelTransformer>> transformersProvider;

    public AddressMapsRepository_Factory(Provider<Map<Class<? extends ModelTransformer>, ModelTransformer>> provider, Provider<a> provider2, Provider<IAddressMapsProtoApi> provider3, Provider<IAddressMapsJsonApi> provider4) {
        this.transformersProvider = provider;
        this.appBuildDetailsProvider = provider2;
        this.addressProtoApiProvider = provider3;
        this.addressJsonApiProvider = provider4;
    }

    public static AddressMapsRepository_Factory create(Provider<Map<Class<? extends ModelTransformer>, ModelTransformer>> provider, Provider<a> provider2, Provider<IAddressMapsProtoApi> provider3, Provider<IAddressMapsJsonApi> provider4) {
        return new AddressMapsRepository_Factory(provider, provider2, provider3, provider4);
    }

    public static AddressMapsRepository newInstance(Map<Class<? extends ModelTransformer>, ModelTransformer> map, a aVar, IAddressMapsProtoApi iAddressMapsProtoApi, IAddressMapsJsonApi iAddressMapsJsonApi) {
        return new AddressMapsRepository(map, aVar, iAddressMapsProtoApi, iAddressMapsJsonApi);
    }

    public AddressMapsRepository get() {
        return newInstance(this.transformersProvider.get(), this.appBuildDetailsProvider.get(), this.addressProtoApiProvider.get(), this.addressJsonApiProvider.get());
    }
}
