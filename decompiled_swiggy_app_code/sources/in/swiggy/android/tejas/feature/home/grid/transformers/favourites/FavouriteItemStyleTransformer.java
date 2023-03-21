package in.swiggy.android.tejas.feature.home.grid.transformers.favourites;

import com.swiggy.gandalf.widgets.v2.Dimension;
import com.swiggy.presentation.food.v2.Style;
import i20.t;
import in.swiggy.android.tejas.feature.listing.grid.model.FavouriteItemStyle;
import in.swiggy.android.tejas.feature.listing.grid.model.LayoutAlignment;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: FavouriteItemStyleTransformer.kt */
public final class FavouriteItemStyleTransformer implements ITransformer<Style, FavouriteItemStyle> {
    private final ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension> dimensionTransformer;

    public FavouriteItemStyleTransformer(ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension> iTransformer) {
        p.j(iTransformer, "dimensionTransformer");
        this.dimensionTransformer = iTransformer;
    }

    public final boolean isHeightValid(Dimension dimension) {
        p.j(dimension, "height");
        return !isInValidType(dimension);
    }

    public final boolean isInValidType(Dimension dimension) {
        p.j(dimension, "dimension");
        return p.e(dimension.getType().name(), Dimension.Type.TYPE_INVALID.name()) || p.e(dimension.getType().name(), Dimension.Type.UNRECOGNIZED.name());
    }

    public final boolean isWidthValid(Dimension dimension) {
        p.j(dimension, "width");
        return !isInValidType(dimension);
    }

    public final LayoutAlignment validLayoutAlignment(com.swiggy.presentation.food.v2.LayoutAlignment layoutAlignment) {
        p.j(layoutAlignment, "remoteLayoutAlignment");
        if (p.e(layoutAlignment.name(), com.swiggy.presentation.food.v2.LayoutAlignment.LAYOUT_ALIGNMENT_INVALID.name()) || p.e(layoutAlignment.name(), com.swiggy.presentation.food.v2.LayoutAlignment.UNRECOGNIZED.name())) {
            return LayoutAlignment.valueOf(com.swiggy.presentation.food.v2.LayoutAlignment.LAYOUT_ALIGNMENT_LEFT.name());
        }
        return LayoutAlignment.valueOf(layoutAlignment.name());
    }

    public FavouriteItemStyle transform(Style style) {
        p.j(style, t.V);
        if (p.e(style, Style.getDefaultInstance())) {
            return null;
        }
        ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension> iTransformer = this.dimensionTransformer;
        Dimension width = style.getWidth();
        p.i(width, "t.width");
        in.swiggy.android.tejas.feature.listing.grid.model.Dimension transform = iTransformer.transform(width);
        ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension> iTransformer2 = this.dimensionTransformer;
        Dimension height = style.getHeight();
        p.i(height, "t.height");
        in.swiggy.android.tejas.feature.listing.grid.model.Dimension transform2 = iTransformer2.transform(height);
        com.swiggy.presentation.food.v2.LayoutAlignment layoutAlignment = style.getLayoutAlignment();
        p.i(layoutAlignment, "t.layoutAlignment");
        LayoutAlignment validLayoutAlignment = validLayoutAlignment(layoutAlignment);
        if (!(transform == null || transform2 == null)) {
            Dimension width2 = style.getWidth();
            p.i(width2, "t.width");
            if (isWidthValid(width2)) {
                Dimension height2 = style.getHeight();
                p.i(height2, "t.height");
                if (isHeightValid(height2)) {
                    return new FavouriteItemStyle(transform, transform2, validLayoutAlignment);
                }
            }
        }
        return null;
    }
}
