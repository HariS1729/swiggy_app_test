package in.swiggy.android.tejas.feature.home.grid.transformers.stores;

import com.swiggy.presentation.stores.v1.StoreServiceabilityInfo;
import i20.t;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: StoreServiceabilityInfoTransformer.kt */
public final class StoreServiceabilityInfoTransformer implements ITransformer<StoreServiceabilityInfo, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreServiceabilityInfo> {
    public in.swiggy.android.tejas.feature.home.grid.model.stores.StoreServiceabilityInfo transform(StoreServiceabilityInfo storeServiceabilityInfo) {
        p.j(storeServiceabilityInfo, t.V);
        if (p.e(storeServiceabilityInfo, StoreServiceabilityInfo.getDefaultInstance())) {
            return null;
        }
        String serviceability = storeServiceabilityInfo.getServiceability();
        p.i(serviceability, "t.serviceability");
        StoreServiceabilityInfo.NonServiceableReason nonServiceableReason = storeServiceabilityInfo.getNonServiceableReason();
        p.i(nonServiceableReason, "t.nonServiceableReason");
        String lastMileDistanceString = storeServiceabilityInfo.getLastMileDistanceString();
        p.i(lastMileDistanceString, "t.lastMileDistanceString");
        String slaString = storeServiceabilityInfo.getSlaString();
        p.i(slaString, "t.slaString");
        return new in.swiggy.android.tejas.feature.home.grid.model.stores.StoreServiceabilityInfo(serviceability, nonServiceableReason, lastMileDistanceString, slaString);
    }
}
