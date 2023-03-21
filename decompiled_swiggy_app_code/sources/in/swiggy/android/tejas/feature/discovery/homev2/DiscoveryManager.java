package in.swiggy.android.tejas.feature.discovery.homev2;

import android.content.SharedPreferences;
import bp0.k;
import dc.e;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.IErrorChecker;
import in.swiggy.android.tejas.feature.dropboxStore.interfaces.IStoreManager;
import in.swiggy.android.tejas.feature.dropboxStore.interfaces.IStorePersister;
import in.swiggy.android.tejas.feature.dropboxStore.models.home.StoreTTL;
import in.swiggy.android.tejas.feature.home.IDiscoveryAPI;
import in.swiggy.android.tejas.feature.home.IDiscoveryJsonApi;
import in.swiggy.android.tejas.feature.home.model.configs.DiscoveryRequestParams;
import in.swiggy.android.tejas.feature.listing.ListingResponse;
import in.swiggy.android.tejas.feature.listing.ListingTransformers;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import os.a;

/* compiled from: DiscoveryManager.kt */
public final class DiscoveryManager implements IStoreManager<IDiscoveryAPI, DiscoveryRequestParams, d<? extends Response<? extends ListingResponse>>> {
    public static final Companion Companion = new Companion((i) null);
    public static final String DISCOVERY_API_PATH = "/api/v2/home";
    private final /* synthetic */ DiscoveryStoreManager $$delegate_0;
    private final a appBuildDetails;
    private final Map<String, ITransformer<?, ?>> discoveryTransformersMap;
    private final IErrorChecker<com.swiggy.gandalf.widgets.v2.Response> errorChecker;
    private final IDiscoveryJsonApi jsonApi;
    private final IDiscoveryAPI protoApi;

    /* compiled from: DiscoveryManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public DiscoveryManager(IDiscoveryAPI iDiscoveryAPI, IDiscoveryJsonApi iDiscoveryJsonApi, a aVar, IErrorChecker<com.swiggy.gandalf.widgets.v2.Response> iErrorChecker, @ListingTransformers Map<String, ITransformer<?, ?>> map, SharedPreferences sharedPreferences, IStorePersister<DiscoveryRequestParams, d<Response<ListingResponse>>, StoreTTL> iStorePersister) {
        IDiscoveryAPI iDiscoveryAPI2 = iDiscoveryAPI;
        IDiscoveryJsonApi iDiscoveryJsonApi2 = iDiscoveryJsonApi;
        a aVar2 = aVar;
        IErrorChecker<com.swiggy.gandalf.widgets.v2.Response> iErrorChecker2 = iErrorChecker;
        Map<String, ITransformer<?, ?>> map2 = map;
        p.j(iDiscoveryAPI, "protoApi");
        p.j(iDiscoveryJsonApi, "jsonApi");
        p.j(aVar, "appBuildDetails");
        p.j(iErrorChecker, "errorChecker");
        p.j(map, "discoveryTransformersMap");
        SharedPreferences sharedPreferences2 = sharedPreferences;
        p.j(sharedPreferences2, "sharedPreferences");
        IStorePersister<DiscoveryRequestParams, d<Response<ListingResponse>>, StoreTTL> iStorePersister2 = iStorePersister;
        p.j(iStorePersister2, "discoveryStorePersister");
        this.protoApi = iDiscoveryAPI2;
        this.jsonApi = iDiscoveryJsonApi2;
        this.appBuildDetails = aVar2;
        this.errorChecker = iErrorChecker2;
        this.discoveryTransformersMap = map2;
        this.$$delegate_0 = new DiscoveryStoreManager(iDiscoveryAPI2, iDiscoveryJsonApi2, aVar2, iErrorChecker2, map2, sharedPreferences2, iStorePersister2);
    }

    public Object deleteAllResponse(c<? super k> cVar) {
        return this.$$delegate_0.deleteAllResponse(cVar);
    }

    public Object deleteResponse(DiscoveryRequestParams discoveryRequestParams, c<? super k> cVar) {
        return this.$$delegate_0.deleteResponse(discoveryRequestParams, cVar);
    }

    public Object enableCache(long j, c<? super Boolean> cVar) {
        return this.$$delegate_0.enableCache(j, cVar);
    }

    public Object forceEnableCache(boolean z11, c<? super k> cVar) {
        return this.$$delegate_0.forceEnableCache(z11, cVar);
    }

    public Object forceEnableStoreCache(boolean z11, c<? super k> cVar) {
        return this.$$delegate_0.forceEnableStoreCache(z11, cVar);
    }

    public Object getAPIResponse(DiscoveryRequestParams discoveryRequestParams, c<? super d<? extends Response<ListingResponse>>> cVar) {
        return this.$$delegate_0.getAPIResponse(discoveryRequestParams, cVar);
    }

    public Object getActiveAPIResponse(IDiscoveryAPI iDiscoveryAPI, DiscoveryRequestParams discoveryRequestParams, c<? super d<? extends Response<ListingResponse>>> cVar) {
        return this.$$delegate_0.getActiveAPIResponse(iDiscoveryAPI, discoveryRequestParams, cVar);
    }

    public final Object getHomeListing(DiscoveryRequestParams discoveryRequestParams, c<? super d<? extends Response<ListingResponse>>> cVar) {
        return getAPIResponse(discoveryRequestParams, cVar);
    }

    public Object getStore(IDiscoveryAPI iDiscoveryAPI, DiscoveryRequestParams discoveryRequestParams, c<? super e<DiscoveryRequestParams, d<Response<ListingResponse>>>> cVar) {
        return this.$$delegate_0.getStore(iDiscoveryAPI, discoveryRequestParams, cVar);
    }
}
