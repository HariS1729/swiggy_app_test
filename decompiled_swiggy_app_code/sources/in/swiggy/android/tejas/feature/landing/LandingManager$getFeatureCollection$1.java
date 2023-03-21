package in.swiggy.android.tejas.feature.landing;

import fp0.c;
import in.swiggy.android.tejas.feature.listing.pagination.model.PageOffset;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "in.swiggy.android.tejas.feature.landing.LandingManager", f = "LandingManager.kt", l = {24}, m = "getFeatureCollection")
/* compiled from: LandingManager.kt */
final class LandingManager$getFeatureCollection$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LandingManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LandingManager$getFeatureCollection$1(LandingManager landingManager, c<? super LandingManager$getFeatureCollection$1> cVar) {
        super(cVar);
        this.this$0 = landingManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getFeatureCollection((String) null, 0.0d, 0.0d, (Integer) null, (PageOffset) null, (Object) null, (String) null, this);
    }
}
