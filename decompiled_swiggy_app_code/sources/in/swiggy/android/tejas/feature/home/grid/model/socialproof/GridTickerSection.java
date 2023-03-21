package in.swiggy.android.tejas.feature.home.grid.model.socialproof;

import in.swiggy.android.tejas.feature.listing.grid.model.GridWidgetItem;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: GridTickerSection.kt */
public final class GridTickerSection extends GridWidgetItem {
    private final List<TickerEntity> items;
    private final TickerStyle style;

    public GridTickerSection(List<TickerEntity> list, TickerStyle tickerStyle) {
        p.j(list, "items");
        p.j(tickerStyle, "style");
        this.items = list;
        this.style = tickerStyle;
    }

    public final List<TickerEntity> getItems() {
        return this.items;
    }

    public int getItemsCount() {
        return this.items.size();
    }

    public final TickerStyle getStyle() {
        return this.style;
    }
}
