package in.swiggy.android.tejas.feature.dropboxStore.dagger;

import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.feature.discovery.food.FoodDiscoveryStoreFlushManager;
import in.swiggy.android.tejas.feature.discovery.food.FoodDiscoveryStorePersister;
import in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStoreFlushManager;
import in.swiggy.android.tejas.feature.discovery.homev2.DiscoveryStorePersister;
import in.swiggy.android.tejas.feature.dropboxStore.interfaces.IStorePersister;
import in.swiggy.android.tejas.feature.dropboxStore.models.home.StoreTTL;
import in.swiggy.android.tejas.feature.home.dropboxpersister.HomeStoreFlushManager;
import in.swiggy.android.tejas.feature.home.dropboxpersister.HomeStorePersister;
import in.swiggy.android.tejas.feature.home.model.HomeResponse;
import in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams;
import in.swiggy.android.tejas.feature.home.model.configs.FoodDiscoveryRequestParams;
import in.swiggy.android.tejas.feature.home.model.configs.HomeRequestParams;
import in.swiggy.android.tejas.feature.listing.ListingResponse;
import in.swiggy.android.tejas.flush.SharedPrefFlushManager;
import kotlinx.coroutines.flow.d;

/* compiled from: DropboxStoreModule.kt */
public interface DropboxStoreModule {
    IStorePersister<DiscoveryRequestParams, d<Response<ListingResponse>>, StoreTTL> bindDiscoveryStorePersister(DiscoveryStorePersister discoveryStorePersister);

    IStorePersister<FoodDiscoveryRequestParams, d<Response<ListingResponse>>, StoreTTL> bindFoodDiscoveryStorePersister(FoodDiscoveryStorePersister foodDiscoveryStorePersister);

    IStorePersister<HomeRequestParams, d<Response<HomeResponse>>, StoreTTL> bindHomeStorePersister(HomeStorePersister homeStorePersister);

    @DiscoveryFlushManager
    SharedPrefFlushManager providesDiscoveryStoreFlushManager(DiscoveryStoreFlushManager discoveryStoreFlushManager);

    @FoodDiscoveryFlushManager
    SharedPrefFlushManager providesFoodDiscoveryStoreFlushManager(FoodDiscoveryStoreFlushManager foodDiscoveryStoreFlushManager);

    @HomeFlushManager
    SharedPrefFlushManager providesHomeStoreFlushManager(HomeStoreFlushManager homeStoreFlushManager);
}
