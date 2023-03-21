package in.swiggy.android.tejas.feature.discovery.food;

import bp0.g;
import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.feature.home.IDiscoveryAPI;
import in.swiggy.android.tejas.feature.home.model.configs.FoodDiscoveryRequestParams;
import in.swiggy.android.tejas.feature.listing.ListingResponse;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "in.swiggy.android.tejas.feature.discovery.food.FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$1", f = "FoodDiscoveryStoreManager.kt", l = {184}, m = "invokeSuspend")
/* compiled from: FoodDiscoveryStoreManager.kt */
final class FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$1 extends SuspendLambda implements p<FoodDiscoveryRequestParams, c<? super kotlinx.coroutines.flow.d<? extends Response<? extends ListingResponse>>>, Object> {
    final /* synthetic */ IDiscoveryAPI $api;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FoodDiscoveryStoreManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$1(FoodDiscoveryStoreManager foodDiscoveryStoreManager, IDiscoveryAPI iDiscoveryAPI, c<? super FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$1> cVar) {
        super(2, cVar);
        this.this$0 = foodDiscoveryStoreManager;
        this.$api = iDiscoveryAPI;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$1 foodDiscoveryStoreManager$getStoreWithSourceOfTruth$1 = new FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$1(this.this$0, this.$api, cVar);
        foodDiscoveryStoreManager$getStoreWithSourceOfTruth$1.L$0 = obj;
        return foodDiscoveryStoreManager$getStoreWithSourceOfTruth$1;
    }

    public final Object invoke(FoodDiscoveryRequestParams foodDiscoveryRequestParams, c<? super kotlinx.coroutines.flow.d<? extends Response<ListingResponse>>> cVar) {
        return ((FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$1) create(foodDiscoveryRequestParams, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.label;
        if (i11 == 0) {
            g.b(obj);
            FoodDiscoveryStoreManager foodDiscoveryStoreManager = this.this$0;
            IDiscoveryAPI iDiscoveryAPI = this.$api;
            this.label = 1;
            obj = foodDiscoveryStoreManager.getActiveAPIResponse(iDiscoveryAPI, (FoodDiscoveryRequestParams) this.L$0, (c<? super kotlinx.coroutines.flow.d<? extends Response<ListingResponse>>>) this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
