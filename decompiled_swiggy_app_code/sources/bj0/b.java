package bj0;

import go0.h;
import in.swiggy.android.tejas.feature.order.DashOrderManager;
import in.swiggy.android.tejas.feature.order.model.network.serialized.DashSerializedOrderResponse;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DashOrderManager f12631a;

    public /* synthetic */ b(DashOrderManager dashOrderManager) {
        this.f12631a = dashOrderManager;
    }

    public final Object apply(Object obj) {
        return DashOrderManager.m45getOrderByJobId$lambda8(this.f12631a, (DashSerializedOrderResponse) obj);
    }
}
