package in.swiggy.android.tejas.feature.dataplatform;

import in.swiggy.android.tejas.feature.dataplatform.api.IMessageApi;
import javax.inject.Provider;
import qq.e;

public final class DataPlatformManager_Factory implements e<DataPlatformManager> {
    private final Provider<IMessageApi> apiProvider;

    public DataPlatformManager_Factory(Provider<IMessageApi> provider) {
        this.apiProvider = provider;
    }

    public static DataPlatformManager_Factory create(Provider<IMessageApi> provider) {
        return new DataPlatformManager_Factory(provider);
    }

    public static DataPlatformManager newInstance(IMessageApi iMessageApi) {
        return new DataPlatformManager(iMessageApi);
    }

    public DataPlatformManager get() {
        return newInstance(this.apiProvider.get());
    }
}
