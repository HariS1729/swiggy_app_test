package in.swiggy.android.tejas.feature.home.grid.model.stores;

import in.swiggy.android.tejas.feature.listing.grid.model.GridWidgetItem;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: GridStoresSection.kt */
public final class GridStoresSection extends GridWidgetItem {
    private final List<StoresEntity> info;

    public GridStoresSection(List<StoresEntity> list) {
        p.j(list, "info");
        this.info = list;
    }

    public final List<StoresEntity> getInfo() {
        return this.info;
    }

    public int getItemsCount() {
        return this.info.size();
    }
}
