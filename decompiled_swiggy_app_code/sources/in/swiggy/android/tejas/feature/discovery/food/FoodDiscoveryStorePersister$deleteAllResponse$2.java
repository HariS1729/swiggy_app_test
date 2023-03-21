package in.swiggy.android.tejas.feature.discovery.food;

import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "in.swiggy.android.tejas.feature.discovery.food.FoodDiscoveryStorePersister$deleteAllResponse$2", f = "FoodDiscoveryStorePersister.kt", l = {}, m = "invokeSuspend")
/* compiled from: FoodDiscoveryStorePersister.kt */
final class FoodDiscoveryStorePersister$deleteAllResponse$2 extends SuspendLambda implements p<j0, c<? super k>, Object> {
    int label;
    final /* synthetic */ FoodDiscoveryStorePersister this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FoodDiscoveryStorePersister$deleteAllResponse$2(FoodDiscoveryStorePersister foodDiscoveryStorePersister, c<? super FoodDiscoveryStorePersister$deleteAllResponse$2> cVar) {
        super(2, cVar);
        this.this$0 = foodDiscoveryStorePersister;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new FoodDiscoveryStorePersister$deleteAllResponse$2(this.this$0, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((FoodDiscoveryStorePersister$deleteAllResponse$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.label == 0) {
            g.b(obj);
            this.this$0.discoveryStoreFlushManager.clearCache();
            return k.f22762a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
