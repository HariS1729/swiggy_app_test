package in.swiggy.android.tejas.feature.crosssell;

import fp0.c;
import in.swiggy.android.tejas.feature.crosssell.model.CrossSellRequestBody;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "in.swiggy.android.tejas.feature.crosssell.CrossSellManager", f = "CrossSellManager.kt", l = {31}, m = "getCrossSellCollection")
/* compiled from: CrossSellManager.kt */
final class CrossSellManager$getCrossSellCollection$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CrossSellManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CrossSellManager$getCrossSellCollection$1(CrossSellManager crossSellManager, c<? super CrossSellManager$getCrossSellCollection$1> cVar) {
        super(cVar);
        this.this$0 = crossSellManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getCrossSellCollection(0.0d, 0.0d, (CrossSellRequestBody) null, this);
    }
}
