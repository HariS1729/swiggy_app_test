package in.swiggy.android.tejas.feature.home.dropboxpersister;

import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.feature.home.model.HomeResponse;
import in.swiggy.android.tejas.feature.home.model.configs.HomeRequestParams;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "in.swiggy.android.tejas.feature.home.dropboxpersister.HomeStorePersister", f = "HomeStorePersister.kt", l = {83, 85}, m = "loadResponse")
/* compiled from: HomeStorePersister.kt */
final class HomeStorePersister$loadResponse$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeStorePersister this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HomeStorePersister$loadResponse$1(HomeStorePersister homeStorePersister, c<? super HomeStorePersister$loadResponse$1> cVar) {
        super(cVar);
        this.this$0 = homeStorePersister;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadResponse((HomeRequestParams) null, (c<? super kotlinx.coroutines.flow.d<? extends Response<HomeResponse>>>) this);
    }
}
