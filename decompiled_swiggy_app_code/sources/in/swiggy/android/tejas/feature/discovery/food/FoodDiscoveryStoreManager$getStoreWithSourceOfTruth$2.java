package in.swiggy.android.tejas.feature.discovery.food;

import bp0.g;
import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.feature.dropboxStore.interfaces.IStorePersister;
import in.swiggy.android.tejas.feature.home.model.configs.FoodDiscoveryRequestParams;
import in.swiggy.android.tejas.feature.listing.ListingResponse;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "in.swiggy.android.tejas.feature.discovery.food.FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$2", f = "FoodDiscoveryStoreManager.kt", l = {186, 186}, m = "invokeSuspend")
/* compiled from: FoodDiscoveryStoreManager.kt */
final class FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$2 extends SuspendLambda implements p<FoodDiscoveryRequestParams, c<? super kotlinx.coroutines.flow.d<? extends Response<? extends ListingResponse>>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FoodDiscoveryStoreManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$2(FoodDiscoveryStoreManager foodDiscoveryStoreManager, c<? super FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$2> cVar) {
        super(2, cVar);
        this.this$0 = foodDiscoveryStoreManager;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$2 foodDiscoveryStoreManager$getStoreWithSourceOfTruth$2 = new FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$2(this.this$0, cVar);
        foodDiscoveryStoreManager$getStoreWithSourceOfTruth$2.L$0 = obj;
        return foodDiscoveryStoreManager$getStoreWithSourceOfTruth$2;
    }

    public final Object invoke(FoodDiscoveryRequestParams foodDiscoveryRequestParams, c<? super kotlinx.coroutines.flow.d<? extends Response<ListingResponse>>> cVar) {
        return ((FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$2) create(foodDiscoveryRequestParams, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        FoodDiscoveryRequestParams foodDiscoveryRequestParams;
        Object d11 = b.d();
        int i11 = this.label;
        if (i11 == 0) {
            g.b(obj);
            foodDiscoveryRequestParams = (FoodDiscoveryRequestParams) this.L$0;
            IStorePersister access$getFoodDiscoveryStorePersister$p = this.this$0.foodDiscoveryStorePersister;
            this.L$0 = foodDiscoveryRequestParams;
            this.label = 1;
            if (access$getFoodDiscoveryStorePersister$p.clearCacheIfExpired(this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            foodDiscoveryRequestParams = (FoodDiscoveryRequestParams) this.L$0;
            g.b(obj);
        } else if (i11 == 2) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        IStorePersister access$getFoodDiscoveryStorePersister$p2 = this.this$0.foodDiscoveryStorePersister;
        this.L$0 = null;
        this.label = 2;
        obj = access$getFoodDiscoveryStorePersister$p2.loadResponse(foodDiscoveryRequestParams, this);
        return obj == d11 ? d11 : obj;
    }
}
