package in.swiggy.android.tejas.feature.discovery.food;

import android.content.SharedPreferences;
import com.swiggy.gandalf.widgets.v2.Response;
import in.swiggy.android.tejas.api.IErrorChecker;
import in.swiggy.android.tejas.feature.dropboxStore.interfaces.IStorePersister;
import in.swiggy.android.tejas.feature.dropboxStore.models.home.StoreTTL;
import in.swiggy.android.tejas.feature.home.IDiscoveryAPI;
import in.swiggy.android.tejas.feature.home.IDiscoveryJsonApi;
import in.swiggy.android.tejas.feature.home.model.configs.FoodDiscoveryRequestParams;
import in.swiggy.android.tejas.feature.listing.ListingResponse;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.Map;
import javax.inject.Provider;
import kotlinx.coroutines.flow.d;
import os.a;
import qq.e;

public final class FoodDiscoveryManager_Factory implements e<FoodDiscoveryManager> {
    private final Provider<a> appBuildDetailsProvider;
    private final Provider<Map<String, ITransformer<?, ?>>> discoveryTransformersMapProvider;
    private final Provider<IErrorChecker<Response>> errorCheckerProvider;
    private final Provider<IStorePersister<FoodDiscoveryRequestParams, d<in.swiggy.android.tejas.Response<ListingResponse>>, StoreTTL>> foodDiscoveryStorePersisterProvider;
    private final Provider<IDiscoveryJsonApi> jsonApiProvider;
    private final Provider<IDiscoveryAPI> protoApiProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public FoodDiscoveryManager_Factory(Provider<IDiscoveryAPI> provider, Provider<IDiscoveryJsonApi> provider2, Provider<a> provider3, Provider<IErrorChecker<Response>> provider4, Provider<Map<String, ITransformer<?, ?>>> provider5, Provider<SharedPreferences> provider6, Provider<IStorePersister<FoodDiscoveryRequestParams, d<in.swiggy.android.tejas.Response<ListingResponse>>, StoreTTL>> provider7) {
        this.protoApiProvider = provider;
        this.jsonApiProvider = provider2;
        this.appBuildDetailsProvider = provider3;
        this.errorCheckerProvider = provider4;
        this.discoveryTransformersMapProvider = provider5;
        this.sharedPreferencesProvider = provider6;
        this.foodDiscoveryStorePersisterProvider = provider7;
    }

    public static FoodDiscoveryManager_Factory create(Provider<IDiscoveryAPI> provider, Provider<IDiscoveryJsonApi> provider2, Provider<a> provider3, Provider<IErrorChecker<Response>> provider4, Provider<Map<String, ITransformer<?, ?>>> provider5, Provider<SharedPreferences> provider6, Provider<IStorePersister<FoodDiscoveryRequestParams, d<in.swiggy.android.tejas.Response<ListingResponse>>, StoreTTL>> provider7) {
        return new FoodDiscoveryManager_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static FoodDiscoveryManager newInstance(IDiscoveryAPI iDiscoveryAPI, IDiscoveryJsonApi iDiscoveryJsonApi, a aVar, IErrorChecker<Response> iErrorChecker, Map<String, ITransformer<?, ?>> map, SharedPreferences sharedPreferences, IStorePersister<FoodDiscoveryRequestParams, d<in.swiggy.android.tejas.Response<ListingResponse>>, StoreTTL> iStorePersister) {
        return new FoodDiscoveryManager(iDiscoveryAPI, iDiscoveryJsonApi, aVar, iErrorChecker, map, sharedPreferences, iStorePersister);
    }

    public FoodDiscoveryManager get() {
        return newInstance(this.protoApiProvider.get(), this.jsonApiProvider.get(), this.appBuildDetailsProvider.get(), this.errorCheckerProvider.get(), this.discoveryTransformersMapProvider.get(), this.sharedPreferencesProvider.get(), this.foodDiscoveryStorePersisterProvider.get());
    }
}
