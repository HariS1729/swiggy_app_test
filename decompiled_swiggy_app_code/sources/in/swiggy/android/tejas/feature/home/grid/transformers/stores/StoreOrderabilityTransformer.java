package in.swiggy.android.tejas.feature.home.grid.transformers.stores;

import com.swiggy.presentation.stores.v1.StoreOrderability;
import com.swiggy.presentation.stores.v1.StoreServiceabilityInfo;
import i20.t;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: StoreOrderabilityTransformer.kt */
public final class StoreOrderabilityTransformer implements ITransformer<StoreOrderability, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreOrderability> {
    private final ITransformer<StoreServiceabilityInfo, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreServiceabilityInfo> searviceabilityTransformer;

    public StoreOrderabilityTransformer(ITransformer<StoreServiceabilityInfo, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreServiceabilityInfo> iTransformer) {
        p.j(iTransformer, "searviceabilityTransformer");
        this.searviceabilityTransformer = iTransformer;
    }

    public final ITransformer<StoreServiceabilityInfo, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreServiceabilityInfo> getSearviceabilityTransformer() {
        return this.searviceabilityTransformer;
    }

    public in.swiggy.android.tejas.feature.home.grid.model.stores.StoreOrderability transform(StoreOrderability storeOrderability) {
        p.j(storeOrderability, t.V);
        if (p.e(storeOrderability, StoreOrderability.getDefaultInstance())) {
            return null;
        }
        ITransformer<StoreServiceabilityInfo, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreServiceabilityInfo> iTransformer = this.searviceabilityTransformer;
        StoreServiceabilityInfo serviceabilityInfo = storeOrderability.getServiceabilityInfo();
        p.i(serviceabilityInfo, "t.serviceabilityInfo");
        String storeId = storeOrderability.getStoreId();
        p.i(storeId, "t.storeId");
        return new in.swiggy.android.tejas.feature.home.grid.model.stores.StoreOrderability(storeId, storeOrderability.getIsOrderable(), iTransformer.transform(serviceabilityInfo));
    }
}
