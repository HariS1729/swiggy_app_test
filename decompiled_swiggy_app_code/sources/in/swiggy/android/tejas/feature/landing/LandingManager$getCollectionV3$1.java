package in.swiggy.android.tejas.feature.landing;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "in.swiggy.android.tejas.feature.landing.LandingManager", f = "LandingManager.kt", l = {35}, m = "getCollectionV3")
/* compiled from: LandingManager.kt */
final class LandingManager$getCollectionV3$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LandingManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LandingManager$getCollectionV3$1(LandingManager landingManager, c<? super LandingManager$getCollectionV3$1> cVar) {
        super(cVar);
        this.this$0 = landingManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getCollectionV3((String) null, (String) null, (String) null, (Object) null, this);
    }
}
