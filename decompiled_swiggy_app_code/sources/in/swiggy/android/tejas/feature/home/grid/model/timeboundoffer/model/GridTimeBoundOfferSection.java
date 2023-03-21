package in.swiggy.android.tejas.feature.home.grid.model.timeboundoffer.model;

import in.swiggy.android.tejas.feature.listing.grid.model.GridWidgetItem;
import in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: GridTimeBoundOfferSection.kt */
public final class GridTimeBoundOfferSection extends GridWidgetItem {
    private final List<TimeBoundOfferCardEntity> info;
    private final ItemStyle style;

    public GridTimeBoundOfferSection(List<TimeBoundOfferCardEntity> list, ItemStyle itemStyle) {
        p.j(list, "info");
        p.j(itemStyle, "style");
        this.info = list;
        this.style = itemStyle;
    }

    public final List<TimeBoundOfferCardEntity> getInfo() {
        return this.info;
    }

    public int getItemsCount() {
        int i11 = 0;
        for (TimeBoundOfferCardEntity data : this.info) {
            if (!o.A(data.getData().getHeader())) {
                i11++;
            }
        }
        return i11;
    }

    public final ItemStyle getStyle() {
        return this.style;
    }
}
