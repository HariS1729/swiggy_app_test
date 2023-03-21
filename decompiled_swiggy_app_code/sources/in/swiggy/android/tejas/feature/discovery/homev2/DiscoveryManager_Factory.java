package in.swiggy.android.tejas.feature.discovery.homev2;

import android.content.SharedPreferences;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.IErrorChecker;
import in.swiggy.android.tejas.feature.dropboxStore.interfaces.IStorePersister;
import in.swiggy.android.tejas.feature.dropboxStore.models.home.StoreTTL;
import in.swiggy.android.tejas.feature.home.IDiscoveryAPI;
import in.swiggy.android.tejas.feature.home.IDiscoveryJsonApi;
import in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams;
import in.swiggy.android.tejas.feature.listing.ListingResponse;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.Map;
import javax.inject.Provider;
import kotlinx.coroutines.flow.d;
import os.a;
import qq.e;

public final class DiscoveryManager_Factory implements e<DiscoveryManager> {
    private final Provider<a> appBuildDetailsProvider;
    private final Provider<IStorePersister<DiscoveryRequestParams, d<Response<ListingResponse>>, StoreTTL>> discoveryStorePersisterProvider;
    private final Provider<Map<String, ITransformer<?, ?>>> discoveryTransformersMapProvider;
    private final Provider<IErrorChecker<com.swiggy.gandalf.widgets.v2.Response>> errorCheckerProvider;
    private final Provider<IDiscoveryJsonApi> jsonApiProvider;
    private final Provider<IDiscoveryAPI> protoApiProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public DiscoveryManager_Factory(Provider<IDiscoveryAPI> provider, Provider<IDiscoveryJsonApi> provider2, Provider<a> provider3, Provider<IErrorChecker<com.swiggy.gandalf.widgets.v2.Response>> provider4, Provider<Map<String, ITransformer<?, ?>>> provider5, Provider<SharedPreferences> provider6, Provider<IStorePersister<DiscoveryRequestParams, d<Response<ListingResponse>>, StoreTTL>> provider7) {
        this.protoApiProvider = provider;
        this.jsonApiProvider = provider2;
        this.appBuildDetailsProvider = provider3;
        this.errorCheckerProvider = provider4;
        this.discoveryTransformersMapProvider = provider5;
        this.sharedPreferencesProvider = provider6;
        this.discoveryStorePersisterProvider = provider7;
    }

    public static DiscoveryManager_Factory create(Provider<IDiscoveryAPI> provider, Provider<IDiscoveryJsonApi> provider2, Provider<a> provider3, Provider<IErrorChecker<com.swiggy.gandalf.widgets.v2.Response>> provider4, Provider<Map<String, ITransformer<?, ?>>> provider5, Provider<SharedPreferences> provider6, Provider<IStorePersister<DiscoveryRequestParams, d<Response<ListingResponse>>, StoreTTL>> provider7) {
        return new DiscoveryManager_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static DiscoveryManager newInstance(IDiscoveryAPI iDiscoveryAPI, IDiscoveryJsonApi iDiscoveryJsonApi, a aVar, IErrorChecker<com.swiggy.gandalf.widgets.v2.Response> iErrorChecker, Map<String, ITransformer<?, ?>> map, SharedPreferences sharedPreferences, IStorePersister<DiscoveryRequestParams, d<Response<ListingResponse>>, StoreTTL> iStorePersister) {
        return new DiscoveryManager(iDiscoveryAPI, iDiscoveryJsonApi, aVar, iErrorChecker, map, sharedPreferences, iStorePersister);
    }

    public DiscoveryManager get() {
        return newInstance(this.protoApiProvider.get(), this.jsonApiProvider.get(), this.appBuildDetailsProvider.get(), this.errorCheckerProvider.get(), this.discoveryTransformersMapProvider.get(), this.sharedPreferencesProvider.get(), this.discoveryStorePersisterProvider.get());
    }
}
