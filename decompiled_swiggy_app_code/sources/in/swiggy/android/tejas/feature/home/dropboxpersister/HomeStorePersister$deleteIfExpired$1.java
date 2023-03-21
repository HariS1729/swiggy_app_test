package in.swiggy.android.tejas.feature.home.dropboxpersister;

import fp0.c;
import in.swiggy.android.tejas.feature.dropboxStore.models.home.StoreTTL;
import in.swiggy.android.tejas.feature.home.model.configs.HomeRequestParams;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "in.swiggy.android.tejas.feature.home.dropboxpersister.HomeStorePersister", f = "HomeStorePersister.kt", l = {146}, m = "deleteIfExpired")
/* compiled from: HomeStorePersister.kt */
final class HomeStorePersister$deleteIfExpired$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeStorePersister this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HomeStorePersister$deleteIfExpired$1(HomeStorePersister homeStorePersister, c<? super HomeStorePersister$deleteIfExpired$1> cVar) {
        super(cVar);
        this.this$0 = homeStorePersister;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.deleteIfExpired((StoreTTL) null, (HomeRequestParams) null, (c<? super Boolean>) this);
    }
}
