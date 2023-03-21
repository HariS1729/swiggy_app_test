package in.swiggy.android.tejas.feature.home.dropboxpersister;

import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "in.swiggy.android.tejas.feature.home.dropboxpersister.HomeStorePersister$deleteAllResponse$2", f = "HomeStorePersister.kt", l = {}, m = "invokeSuspend")
/* compiled from: HomeStorePersister.kt */
final class HomeStorePersister$deleteAllResponse$2 extends SuspendLambda implements p<j0, c<? super k>, Object> {
    int label;
    final /* synthetic */ HomeStorePersister this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HomeStorePersister$deleteAllResponse$2(HomeStorePersister homeStorePersister, c<? super HomeStorePersister$deleteAllResponse$2> cVar) {
        super(2, cVar);
        this.this$0 = homeStorePersister;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new HomeStorePersister$deleteAllResponse$2(this.this$0, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((HomeStorePersister$deleteAllResponse$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.label == 0) {
            g.b(obj);
            this.this$0.homeStoreFlushManager.clearCache();
            return k.f22762a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
