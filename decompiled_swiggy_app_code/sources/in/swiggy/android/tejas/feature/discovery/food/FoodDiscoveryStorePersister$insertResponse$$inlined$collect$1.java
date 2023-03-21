package in.swiggy.android.tejas.feature.discovery.food;

import android.content.SharedPreferences;
import bp0.k;
import com.google.gson.Gson;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.feature.dropboxStore.DropboxGsonUtils;
import in.swiggy.android.tejas.feature.dropboxStore.models.home.DiscoveryStoreResponse;
import in.swiggy.android.tejas.feature.dropboxStore.models.home.StoreTTL;
import in.swiggy.android.tejas.feature.home.model.configs.FoodDiscoveryRequestParams;
import in.swiggy.android.tejas.feature.listing.ListingResponse;
import js.a;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.e;

@Instrumented
/* compiled from: Collect.kt */
public final class FoodDiscoveryStorePersister$insertResponse$$inlined$collect$1 implements e<Response<? extends ListingResponse>> {
    final /* synthetic */ FoodDiscoveryRequestParams $key$inlined;
    final /* synthetic */ FoodDiscoveryStorePersister this$0;

    public FoodDiscoveryStorePersister$insertResponse$$inlined$collect$1(FoodDiscoveryRequestParams foodDiscoveryRequestParams, FoodDiscoveryStorePersister foodDiscoveryStorePersister) {
        this.$key$inlined = foodDiscoveryRequestParams;
        this.this$0 = foodDiscoveryStorePersister;
    }

    public Object emit(Response<? extends ListingResponse> response, c<? super k> cVar) {
        DiscoveryStoreResponse discoveryStoreResponse;
        Response response2 = response;
        if (response2 instanceof Response.Success) {
            discoveryStoreResponse = new DiscoveryStoreResponse((ListingResponse) ((Response.Success) response2).getResponse(), (Error) null, new StoreTTL(System.currentTimeMillis(), this.$key$inlined.getTtl()));
        } else if (response2 instanceof Response.Failure) {
            discoveryStoreResponse = new DiscoveryStoreResponse((ListingResponse) null, ((Response.Failure) response2).getError(), new StoreTTL(System.currentTimeMillis(), this.$key$inlined.getTtl()));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        SharedPreferences access$getSharedPreferences$p = this.this$0.sharedPreferences;
        String access$getFormattedKey = this.this$0.getFormattedKey(this.$key$inlined);
        Gson listingGson = DropboxGsonUtils.INSTANCE.getListingGson();
        a.b(access$getSharedPreferences$p, access$getFormattedKey, !(listingGson instanceof Gson) ? listingGson.toJson((Object) discoveryStoreResponse) : GsonInstrumentation.toJson(listingGson, (Object) discoveryStoreResponse));
        return k.f22762a;
    }
}
