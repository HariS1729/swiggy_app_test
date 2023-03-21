package in.swiggy.android.tejas.feature.home.grid.transformers.stores;

import com.swiggy.gandalf.home.protobuf.Cta;
import com.swiggy.presentation.stores.v1.DiscountInfo;
import com.swiggy.presentation.stores.v1.StoreDocument;
import com.swiggy.presentation.stores.v1.StoreInfo;
import com.swiggy.presentation.stores.v1.StoreOrderability;
import com.swiggy.presentation.stores.v1.StoreServiceabilityInfo;
import com.swiggy.presentation.stores.v1.StoresInfoWithStyle;
import in.swiggy.android.tejas.feature.home.grid.model.stores.GridStoresSection;
import in.swiggy.android.tejas.feature.home.grid.model.stores.Stores;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: StoreTransformerModule.kt */
public final class StoreTransformerModule {
    public static final StoreTransformerModule INSTANCE = new StoreTransformerModule();

    private StoreTransformerModule() {
    }

    public static final ITransformer<DiscountInfo, in.swiggy.android.tejas.feature.home.grid.model.stores.DiscountInfo> providesDiscountInfoTransformer(StoreDiscountInfoTransformer storeDiscountInfoTransformer) {
        p.j(storeDiscountInfoTransformer, "storeDiscountInfoTransformer");
        return storeDiscountInfoTransformer;
    }

    public static final ITransformer<StoreDocument, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreDocument> providesDocumentTransformer(StoreDocumentTransformer storeDocumentTransformer) {
        p.j(storeDocumentTransformer, "storeDocumentTransformer");
        return storeDocumentTransformer;
    }

    public static final ITransformer<StoresInfoWithStyle, GridStoresSection> providesGridStoresTransformer(GridStoresCardTransformer gridStoresCardTransformer) {
        p.j(gridStoresCardTransformer, "gridStoresSectionTransformer");
        return gridStoresCardTransformer;
    }

    public static final ITransformer<Cta, CTA> providesHomeCtaTransformer(HomeCtaTransformer homeCtaTransformer) {
        p.j(homeCtaTransformer, "homeCtaTransformer");
        return homeCtaTransformer;
    }

    public static final ITransformer<StoreOrderability, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreOrderability> providesOrderabilityTransformer(StoreOrderabilityTransformer storeOrderabilityTransformer) {
        p.j(storeOrderabilityTransformer, "storeOrderabilityTransformer");
        return storeOrderabilityTransformer;
    }

    public static final ITransformer<StoreServiceabilityInfo, in.swiggy.android.tejas.feature.home.grid.model.stores.StoreServiceabilityInfo> providesServiceabilityTransformer(StoreServiceabilityInfoTransformer storeServiceabilityInfoTransformer) {
        p.j(storeServiceabilityInfoTransformer, "storeServiceabilityInfoTransformer");
        return storeServiceabilityInfoTransformer;
    }

    public static final ITransformer<StoreInfo, Stores> providesStoreInfoTransformer(StoreInfoTransformer storeInfoTransformer) {
        p.j(storeInfoTransformer, "storeInfoTransformer");
        return storeInfoTransformer;
    }
}
