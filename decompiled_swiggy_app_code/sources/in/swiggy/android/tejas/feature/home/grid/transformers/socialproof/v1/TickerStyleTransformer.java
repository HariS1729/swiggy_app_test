package in.swiggy.android.tejas.feature.home.grid.transformers.socialproof.v1;

import com.swiggy.gandalf.home.protobuf.Dimension;
import com.swiggy.gandalf.home.protobuf.TickerLayoutCard;
import i20.t;
import in.swiggy.android.tejas.feature.home.grid.model.socialproof.TickerStyle;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: TickerStyleTransformer.kt */
public final class TickerStyleTransformer implements ITransformer<TickerLayoutCard.ItemStyle, TickerStyle> {
    private final ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension> dimensionTransformer;

    public TickerStyleTransformer(ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension> iTransformer) {
        p.j(iTransformer, "dimensionTransformer");
        this.dimensionTransformer = iTransformer;
    }

    public final boolean isWidthValid(Dimension dimension) {
        p.j(dimension, "width");
        if (p.e(dimension.getType().name(), Dimension.Type.TYPE_RELATIVE.name())) {
            return !p.e(dimension.getReference().name(), Dimension.RelativeDimensionReference.UNRECOGNIZED.name()) && !p.e(dimension.getReference().name(), Dimension.RelativeDimensionReference.RELATIVE_DIMENSION_REFERENCE_HEIGHT.name());
        }
        return true;
    }

    public TickerStyle transform(TickerLayoutCard.ItemStyle itemStyle) {
        p.j(itemStyle, t.V);
        ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension> iTransformer = this.dimensionTransformer;
        Dimension width = itemStyle.getWidth();
        p.i(width, "t.width");
        in.swiggy.android.tejas.feature.listing.grid.model.Dimension transform = iTransformer.transform(width);
        if (transform == null) {
            return null;
        }
        int numOfLines = itemStyle.getNumOfLines();
        Dimension width2 = itemStyle.getWidth();
        p.i(width2, "t.width");
        boolean isWidthValid = isWidthValid(width2);
        boolean z11 = numOfLines > 0;
        if (!isWidthValid || !z11) {
            return null;
        }
        return new TickerStyle(transform, numOfLines);
    }
}
