package in.swiggy.android.tejas.feature.home.grid.model.socialproof;

import in.swiggy.android.tejas.feature.listing.grid.model.Dimension;
import kotlin.jvm.internal.p;

/* compiled from: TickerStyle.kt */
public final class TickerStyle {
    private final int noOfLines;
    private final Dimension width;

    public TickerStyle(Dimension dimension, int i11) {
        p.j(dimension, "width");
        this.width = dimension;
        this.noOfLines = i11;
    }

    public final int getNoOfLines() {
        return this.noOfLines;
    }

    public final Dimension getWidth() {
        return this.width;
    }
}
