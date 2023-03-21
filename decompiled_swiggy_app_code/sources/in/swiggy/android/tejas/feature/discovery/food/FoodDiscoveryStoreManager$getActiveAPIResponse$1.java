package in.swiggy.android.tejas.feature.discovery.food;

import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.feature.home.IDiscoveryAPI;
import in.swiggy.android.tejas.feature.home.model.configs.FoodDiscoveryRequestParams;
import in.swiggy.android.tejas.feature.listing.ListingResponse;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "in.swiggy.android.tejas.feature.discovery.food.FoodDiscoveryStoreManager", f = "FoodDiscoveryStoreManager.kt", l = {141}, m = "getActiveAPIResponse")
/* compiled from: FoodDiscoveryStoreManager.kt */
final class FoodDiscoveryStoreManager$getActiveAPIResponse$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FoodDiscoveryStoreManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FoodDiscoveryStoreManager$getActiveAPIResponse$1(FoodDiscoveryStoreManager foodDiscoveryStoreManager, c<? super FoodDiscoveryStoreManager$getActiveAPIResponse$1> cVar) {
        super(cVar);
        this.this$0 = foodDiscoveryStoreManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getActiveAPIResponse((IDiscoveryAPI) null, (FoodDiscoveryRequestParams) null, (c<? super kotlinx.coroutines.flow.d<? extends Response<ListingResponse>>>) this);
    }
}
