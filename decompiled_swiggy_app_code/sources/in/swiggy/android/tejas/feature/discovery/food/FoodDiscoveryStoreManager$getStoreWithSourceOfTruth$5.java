package in.swiggy.android.tejas.feature.discovery.food;

import bp0.g;
import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.feature.dropboxStore.interfaces.IStorePersister;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.l;

@d(c = "in.swiggy.android.tejas.feature.discovery.food.FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$5", f = "FoodDiscoveryStoreManager.kt", l = {196}, m = "invokeSuspend")
/* compiled from: FoodDiscoveryStoreManager.kt */
final class FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$5 extends SuspendLambda implements l<c<? super k>, Object> {
    int label;
    final /* synthetic */ FoodDiscoveryStoreManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$5(FoodDiscoveryStoreManager foodDiscoveryStoreManager, c<? super FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$5> cVar) {
        super(1, cVar);
        this.this$0 = foodDiscoveryStoreManager;
    }

    public final c<k> create(c<?> cVar) {
        return new FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$5(this.this$0, cVar);
    }

    public final Object invoke(c<? super k> cVar) {
        return ((FoodDiscoveryStoreManager$getStoreWithSourceOfTruth$5) create(cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.label;
        if (i11 == 0) {
            g.b(obj);
            IStorePersister access$getFoodDiscoveryStorePersister$p = this.this$0.foodDiscoveryStorePersister;
            this.label = 1;
            if (access$getFoodDiscoveryStorePersister$p.deleteAllResponse(this) == d11) {
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
