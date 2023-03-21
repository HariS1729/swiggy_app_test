package in.swiggy.android.tejas.feature.discovery.food;

import fp0.c;
import in.swiggy.android.tejas.feature.dropboxStore.models.home.StoreTTL;
import in.swiggy.android.tejas.feature.home.model.configs.FoodDiscoveryRequestParams;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "in.swiggy.android.tejas.feature.discovery.food.FoodDiscoveryStorePersister", f = "FoodDiscoveryStorePersister.kt", l = {184}, m = "deleteIfExpired")
/* compiled from: FoodDiscoveryStorePersister.kt */
final class FoodDiscoveryStorePersister$deleteIfExpired$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FoodDiscoveryStorePersister this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FoodDiscoveryStorePersister$deleteIfExpired$1(FoodDiscoveryStorePersister foodDiscoveryStorePersister, c<? super FoodDiscoveryStorePersister$deleteIfExpired$1> cVar) {
        super(cVar);
        this.this$0 = foodDiscoveryStorePersister;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.deleteIfExpired((StoreTTL) null, (FoodDiscoveryRequestParams) null, (c<? super Boolean>) this);
    }
}
