package in.swiggy.android.tejas.feature.appBlocking;

import in.swiggy.android.tejas.feature.appBlocking.api.IClonedAppWhiteListApi;
import in.swiggy.android.tejas.feature.appBlocking.api.IClonedAppWhitelistJsonApi;
import javax.inject.Provider;
import os.a;
import qq.e;

public final class AppBlockingRepository_Factory implements e<AppBlockingRepository> {
    private final Provider<a> appBuildDetailsProvider;
    private final Provider<IClonedAppWhitelistJsonApi> jsonApiProvider;
    private final Provider<IClonedAppWhiteListApi> protoApiProvider;

    public AppBlockingRepository_Factory(Provider<a> provider, Provider<IClonedAppWhiteListApi> provider2, Provider<IClonedAppWhitelistJsonApi> provider3) {
        this.appBuildDetailsProvider = provider;
        this.protoApiProvider = provider2;
        this.jsonApiProvider = provider3;
    }

    public static AppBlockingRepository_Factory create(Provider<a> provider, Provider<IClonedAppWhiteListApi> provider2, Provider<IClonedAppWhitelistJsonApi> provider3) {
        return new AppBlockingRepository_Factory(provider, provider2, provider3);
    }

    public static AppBlockingRepository newInstance(a aVar, IClonedAppWhiteListApi iClonedAppWhiteListApi, IClonedAppWhitelistJsonApi iClonedAppWhitelistJsonApi) {
        return new AppBlockingRepository(aVar, iClonedAppWhiteListApi, iClonedAppWhitelistJsonApi);
    }

    public AppBlockingRepository get() {
        return newInstance(this.appBuildDetailsProvider.get(), this.protoApiProvider.get(), this.jsonApiProvider.get());
    }
}
