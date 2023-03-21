package in.swiggy.android.tejas.feature.detipping;

import fp0.c;
import in.swiggy.android.tejas.feature.detipping.dataType.DeTipPostOrderRequest;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "in.swiggy.android.tejas.feature.detipping.DeTipPostOrderManager", f = "DeTipPostOrderManager.kt", l = {23}, m = "fetchCartKeyForDETip1")
/* compiled from: DeTipPostOrderManager.kt */
final class DeTipPostOrderManager$fetchCartKeyForDETip1$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeTipPostOrderManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DeTipPostOrderManager$fetchCartKeyForDETip1$1(DeTipPostOrderManager deTipPostOrderManager, c<? super DeTipPostOrderManager$fetchCartKeyForDETip1$1> cVar) {
        super(cVar);
        this.this$0 = deTipPostOrderManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchCartKeyForDETip1((DeTipPostOrderRequest) null, this);
    }
}
