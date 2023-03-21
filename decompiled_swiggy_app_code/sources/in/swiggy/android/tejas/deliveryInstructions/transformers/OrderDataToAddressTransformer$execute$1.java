package in.swiggy.android.tejas.deliveryInstructions.transformers;

import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.oldapi.network.responses.SingleOrderResponseData;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import lp0.p;

@d(c = "in.swiggy.android.tejas.deliveryInstructions.transformers.OrderDataToAddressTransformer$execute$1", f = "OrderDataToAddressTransformer.kt", l = {23}, m = "invokeSuspend")
/* compiled from: OrderDataToAddressTransformer.kt */
final class OrderDataToAddressTransformer$execute$1 extends SuspendLambda implements p<e<? super Response<? extends SwiggyApiResponse<Address>>>, c<? super k>, Object> {
    final /* synthetic */ SwiggyApiResponse<SingleOrderResponseData> $parameters;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderDataToAddressTransformer$execute$1(SwiggyApiResponse<SingleOrderResponseData> swiggyApiResponse, c<? super OrderDataToAddressTransformer$execute$1> cVar) {
        super(2, cVar);
        this.$parameters = swiggyApiResponse;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        OrderDataToAddressTransformer$execute$1 orderDataToAddressTransformer$execute$1 = new OrderDataToAddressTransformer$execute$1(this.$parameters, cVar);
        orderDataToAddressTransformer$execute$1.L$0 = obj;
        return orderDataToAddressTransformer$execute$1;
    }

    public final Object invoke(e<? super Response<SwiggyApiResponse<Address>>> eVar, c<? super k> cVar) {
        return ((OrderDataToAddressTransformer$execute$1) create(eVar, cVar)).invokeSuspend(k.f22762a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        r1 = r1.getOrder();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r9.label
            r2 = 1
            if (r1 == 0) goto L_0x0017
            if (r1 != r2) goto L_0x000f
            bp0.g.b(r10)
            goto L_0x0051
        L_0x000f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0017:
            bp0.g.b(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.flow.e r10 = (kotlinx.coroutines.flow.e) r10
            in.swiggy.android.tejas.api.models.SwiggyApiResponse<in.swiggy.android.tejas.oldapi.network.responses.SingleOrderResponseData> r1 = r9.$parameters
            in.swiggy.android.tejas.Response$Companion r3 = in.swiggy.android.tejas.Response.Companion
            in.swiggy.android.tejas.api.models.SwiggyApiResponse r4 = new in.swiggy.android.tejas.api.models.SwiggyApiResponse
            r5 = 0
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
            java.lang.Object r1 = r1.getData()
            in.swiggy.android.tejas.oldapi.network.responses.SingleOrderResponseData r1 = (in.swiggy.android.tejas.oldapi.network.responses.SingleOrderResponseData) r1
            r6 = 0
            if (r1 != 0) goto L_0x0034
        L_0x0032:
            r1 = r6
            goto L_0x003d
        L_0x0034:
            in.swiggy.android.tejas.oldapi.models.order.Order r1 = r1.getOrder()
            if (r1 != 0) goto L_0x003b
            goto L_0x0032
        L_0x003b:
            in.swiggy.android.tejas.feature.address.model.Address r1 = r1.mDeliveryAddress
        L_0x003d:
            r4.<init>(r5, r6, r1)
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            in.swiggy.android.tejas.Response r1 = in.swiggy.android.tejas.Response.Companion.success$default(r3, r4, r5, r6, r7, r8)
            r9.label = r2
            java.lang.Object r10 = r10.emit(r1, r9)
            if (r10 != r0) goto L_0x0051
            return r0
        L_0x0051:
            bp0.k r10 = bp0.k.f22762a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.deliveryInstructions.transformers.OrderDataToAddressTransformer$execute$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
