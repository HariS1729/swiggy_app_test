package bj0;

import go0.h;
import in.swiggy.android.tejas.feature.order.DashOrderManager;
import in.swiggy.android.tejas.feature.order.model.network.serialized.DashSerializedOrderResponse;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DashOrderManager f12632a;

    public /* synthetic */ c(DashOrderManager dashOrderManager) {
        this.f12632a = dashOrderManager;
    }

    public final Object apply(Object obj) {
        return DashOrderManager.m42getOrderById$lambda5(this.f12632a, (DashSerializedOrderResponse) obj);
    }
}
