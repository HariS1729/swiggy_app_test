package bj0;

import go0.h;
import in.swiggy.android.tejas.feature.order.DashOrderManager;
import in.swiggy.android.tejas.feature.order.model.network.serialized.DashSerializedOrderResponse;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DashOrderManager f12630a;

    public /* synthetic */ a(DashOrderManager dashOrderManager) {
        this.f12630a = dashOrderManager;
    }

    public final Object apply(Object obj) {
        return DashOrderManager.m39getOrderByGroupId$lambda2(this.f12630a, (DashSerializedOrderResponse) obj);
    }
}
