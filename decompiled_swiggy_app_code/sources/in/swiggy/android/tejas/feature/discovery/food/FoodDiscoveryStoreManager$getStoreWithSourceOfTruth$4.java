package in.swiggy.android.tejas.feature.discovery.food;

import bp0.g;
import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.feature.dropboxStore.interfaces.IStorePersister;
import in.swiggy.android.tejas.feature.home.model.configs.FoodDiscoveryRequestParams;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "in.swiggy.android.tejas.feature.discovery.food.FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$4", f = "FoodDiscoveryStoreManager.kt", l = {195}, m = "invokeSuspend")
/* compiled from: FoodDiscoveryStoreManager.kt */
final class FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$4 extends SuspendLambda implements p<FoodDiscoveryRequestParams, c<? super k>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FoodDiscoveryStoreManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$4(FoodDiscoveryStoreManager foodDiscoveryStoreManager, c<? super FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$4> cVar) {
        super(2, cVar);
        this.this$0 = foodDiscoveryStoreManager;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$4 foodDiscoveryStoreManager$getStoreWithSourceOfTruth$4 = new FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$4(this.this$0, cVar);
        foodDiscoveryStoreManager$getStoreWithSourceOfTruth$4.L$0 = obj;
        return foodDiscoveryStoreManager$getStoreWithSourceOfTruth$4;
    }

    public final Object invoke(FoodDiscoveryRequestParams foodDiscoveryRequestParams, c<? super k> cVar) {
        return ((FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$4) create(foodDiscoveryRequestParams, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.label;
        if (i11 == 0) {
            g.b(obj);
            IStorePersister access$getFoodDiscoveryStorePersister$p = this.this$0.foodDiscoveryStorePersister;
            this.label = 1;
            if (access$getFoodDiscoveryStorePersister$p.deleteResponse((FoodDiscoveryRequestParams) this.L$0, this) == d11) {
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
