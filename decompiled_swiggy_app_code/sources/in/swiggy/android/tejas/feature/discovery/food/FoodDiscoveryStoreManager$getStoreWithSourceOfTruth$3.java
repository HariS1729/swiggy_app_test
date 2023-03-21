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
import lp0.q;

@d(c = "in.swiggy.android.tejas.feature.discovery.food.FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$3", f = "FoodDiscoveryStoreManager.kt", l = {191}, m = "invokeSuspend")
/* compiled from: FoodDiscoveryStoreManager.kt */
final class FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$3 extends SuspendLambda implements q<FoodDiscoveryRequestParams, kotlinx.coroutines.flow.d<? extends Response<? extends ListingResponse>>, c<? super k>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ FoodDiscoveryStoreManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$3(FoodDiscoveryStoreManager foodDiscoveryStoreManager, c<? super FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$3> cVar) {
        super(3, cVar);
        this.this$0 = foodDiscoveryStoreManager;
    }

    public final Object invoke(FoodDiscoveryRequestParams foodDiscoveryRequestParams, kotlinx.coroutines.flow.d<? extends Response<ListingResponse>> dVar, c<? super k> cVar) {
        FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$3 foodDiscoveryStoreManager$getStoreWithSourceOfTruth$3 = new FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$3(this.this$0, cVar);
        foodDiscoveryStoreManager$getStoreWithSourceOfTruth$3.L$0 = foodDiscoveryRequestParams;
        foodDiscoveryStoreManager$getStoreWithSourceOfTruth$3.L$1 = dVar;
        return foodDiscoveryStoreManager$getStoreWithSourceOfTruth$3.invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.label;
        if (i11 == 0) {
            g.b(obj);
            IStorePersister access$getFoodDiscoveryStorePersister$p = this.this$0.foodDiscoveryStorePersister;
            this.L$0 = null;
            this.label = 1;
            if (access$getFoodDiscoveryStorePersister$p.insertResponse((FoodDiscoveryRequestParams) this.L$0, (kotlinx.coroutines.flow.d) this.L$1, this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return k.f22762a;
    }
}
