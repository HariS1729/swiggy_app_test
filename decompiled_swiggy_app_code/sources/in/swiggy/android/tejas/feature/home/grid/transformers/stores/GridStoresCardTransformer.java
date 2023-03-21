package in.swiggy.android.tejas.feature.home.grid.transformers.stores;

import com.swiggy.gandalf.widgets.v2.Analytics;
import com.swiggy.gandalf.widgets.v2.Cta;
import com.swiggy.presentation.stores.v1.Store;
import com.swiggy.presentation.stores.v1.StoreInfo;
import com.swiggy.presentation.stores.v1.StoresInfoWithStyle;
import i20.t;
import in.swiggy.android.tejas.feature.home.grid.model.stores.GridStoresSection;
import in.swiggy.android.tejas.feature.home.grid.model.stores.Stores;
import in.swiggy.android.tejas.feature.home.grid.model.stores.StoresEntity;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: GridStoresCardTransformer.kt */
public final class GridStoresCardTransformer implements ITransformer<StoresInfoWithStyle, GridStoresSection> {
    private final ITransformer<Analytics, AnalyticsData> analytics;
    private final ITransformer<Cta, CTA> ctaTransformer;
    private final ITransformer<StoreInfo, Stores> storeInfoTransformer;

    public GridStoresCardTransformer(ITransformer<StoreInfo, Stores> iTransformer, ITransformer<Analytics, AnalyticsData> iTransformer2, ITransformer<Cta, CTA> iTransformer3) {
        p.j(iTransformer, "storeInfoTransformer");
        p.j(iTransformer2, "analytics");
        p.j(iTransformer3, "ctaTransformer");
        this.storeInfoTransformer = iTransformer;
        this.analytics = iTransformer2;
        this.ctaTransformer = iTransformer3;
    }

    public final ITransformer<Analytics, AnalyticsData> getAnalytics() {
        return this.analytics;
    }

    public final ITransformer<Cta, CTA> getCtaTransformer() {
        return this.ctaTransformer;
    }

    public final ITransformer<StoreInfo, Stores> getStoreInfoTransformer() {
        return this.storeInfoTransformer;
    }

    public GridStoresSection transform(StoresInfoWithStyle storesInfoWithStyle) {
        p.j(storesInfoWithStyle, t.V);
        ArrayList arrayList = new ArrayList();
        List<Store> storesList = storesInfoWithStyle.getStoresList();
        p.i(storesList, "t.storesList");
        int i11 = 0;
        for (T next : storesList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                k.t();
            }
            Store store = (Store) next;
            ITransformer<StoreInfo, Stores> storeInfoTransformer2 = getStoreInfoTransformer();
            StoreInfo info = store.getInfo();
            p.i(info, "store.info");
            Stores transform = storeInfoTransformer2.transform(info);
            ITransformer<Analytics, AnalyticsData> analytics2 = getAnalytics();
            Analytics analytics3 = store.getAnalytics();
            p.i(analytics3, "store.analytics");
            AnalyticsData transform2 = analytics2.transform(analytics3);
            ITransformer<Cta, CTA> ctaTransformer2 = getCtaTransformer();
            Cta cta = store.getCta();
            p.i(cta, "store.cta");
            CTA transform3 = ctaTransformer2.transform(cta);
            if (transform != null) {
                arrayList.add(new StoresEntity(transform, transform2, transform3));
            }
            i11 = i12;
        }
        return new GridStoresSection(arrayList);
    }
}
