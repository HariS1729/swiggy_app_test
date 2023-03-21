package in.swiggy.android.tejas.feature.home.model.multicreative;

import in.swiggy.android.tejas.feature.listing.grid.model.GridHeaderData;

/* compiled from: MultiCreativeWidget.kt */
public final class MultiCreativeWidget {
    private final GridHeaderData header;
    private final MulticreativeInfo info;

    public MultiCreativeWidget(GridHeaderData gridHeaderData, MulticreativeInfo multicreativeInfo) {
        this.header = gridHeaderData;
        this.info = multicreativeInfo;
    }

    public final GridHeaderData getHeader() {
        return this.header;
    }

    public final MulticreativeInfo getInfo() {
        return this.info;
    }
}
