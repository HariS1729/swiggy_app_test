package in.swiggy.android.tejas.feature.home.grid.model.fliptext;

import in.swiggy.android.tejas.feature.listing.grid.model.GridWidgetItem;
import in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: DynamicFlipTextSection.kt */
public final class DynamicFlipTextSection extends GridWidgetItem {
    private final List<DynamicFlipTextEntity> info;
    private final ItemStyle itemStyle;

    public DynamicFlipTextSection(List<DynamicFlipTextEntity> list, ItemStyle itemStyle2) {
        p.j(list, "info");
        p.j(itemStyle2, "itemStyle");
        this.info = list;
        this.itemStyle = itemStyle2;
    }

    public final List<DynamicFlipTextEntity> getInfo() {
        return this.info;
    }

    public final ItemStyle getItemStyle() {
        return this.itemStyle;
    }

    public int getItemsCount() {
        return this.info.size();
    }
}
