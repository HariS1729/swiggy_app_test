package in.swiggy.android.tejas.feature.discovery.food;

import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.feature.home.model.configs.FoodDiscoveryRequestParams;
import in.swiggy.android.tejas.feature.listing.ListingResponse;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "in.swiggy.android.tejas.feature.discovery.food.FoodDiscoveryStorePersister", f = "FoodDiscoveryStorePersister.kt", l = {108, 111}, m = "loadResponse")
/* compiled from: FoodDiscoveryStorePersister.kt */
final class FoodDiscoveryStorePersister$loadResponse$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FoodDiscoveryStorePersister this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FoodDiscoveryStorePersister$loadResponse$1(FoodDiscoveryStorePersister foodDiscoveryStorePersister, c<? super FoodDiscoveryStorePersister$loadResponse$1> cVar) {
        super(cVar);
        this.this$0 = foodDiscoveryStorePersister;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadResponse((FoodDiscoveryRequestParams) null, (c<? super kotlinx.coroutines.flow.d<? extends Response<ListingResponse>>>) this);
    }
}
