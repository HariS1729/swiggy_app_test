package in.swiggy.android.tejas.feature.home.model.multicreative;

import in.swiggy.android.tejas.feature.home.model.AutoscrollConfig;
import in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle;
import in.swiggy.android.tejas.feature.listing.grid.model.Padding;
import in.swiggy.android.tejas.feature.listing.navigation.model.TabEntity;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: MulticreativeInfo.kt */
public final class MulticreativeInfo {
    private final AutoscrollConfig imageScrollConfig;
    private final List<MultiCreativeCard> items;
    private final ItemStyle style;
    private final List<TabEntity> tabs;
    private final Padding widgetPadding;

    public MulticreativeInfo(List<? extends MultiCreativeCard> list, List<TabEntity> list2, ItemStyle itemStyle, AutoscrollConfig autoscrollConfig, Padding padding) {
        p.j(list, "items");
        p.j(list2, "tabs");
        this.items = list;
        this.tabs = list2;
        this.style = itemStyle;
        this.imageScrollConfig = autoscrollConfig;
        this.widgetPadding = padding;
    }

    public final AutoscrollConfig getImageScrollConfig() {
        return this.imageScrollConfig;
    }

    public final List<MultiCreativeCard> getItems() {
        return this.items;
    }

    public final ItemStyle getStyle() {
        return this.style;
    }

    public final List<TabEntity> getTabs() {
        return this.tabs;
    }

    public final Padding getWidgetPadding() {
        return this.widgetPadding;
    }
}
