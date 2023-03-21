package in.swiggy.android.tejas.feature.home.grid.transformers.fliptext;

import com.swiggy.gandalf.widgets.v2.Dimension;
import com.swiggy.gandalf.widgets.v2.ItemStyle;
import i20.t;
import in.swiggy.android.tejas.feature.listing.grid.transformer.ProtoDimensionUtil;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: DynamicFliptextItemStyleTransformer.kt */
public final class DynamicFliptextItemStyleTransformer implements ITransformer<ItemStyle, in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle> {
    private final ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension> dimensionTransformer;

    public DynamicFliptextItemStyleTransformer(ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension> iTransformer) {
        p.j(iTransformer, "dimensionTransformer");
        this.dimensionTransformer = iTransformer;
    }

    public final boolean checkIsInvalidReference(in.swiggy.android.tejas.feature.listing.grid.model.Dimension dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension dimension2) {
        p.j(dimension, "wDimen");
        p.j(dimension2, "hDimen");
        ProtoDimensionUtil protoDimensionUtil = ProtoDimensionUtil.INSTANCE;
        return protoDimensionUtil.isTypeInvalid(dimension, dimension2) || protoDimensionUtil.isRelativeInvalid(dimension, dimension2) || protoDimensionUtil.isRelativeLoop(dimension, dimension2);
    }

    public in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle transform(ItemStyle itemStyle) {
        p.j(itemStyle, t.V);
        if (p.e(itemStyle, ItemStyle.getDefaultInstance())) {
            return null;
        }
        ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension> iTransformer = this.dimensionTransformer;
        Dimension width = itemStyle.getWidth();
        p.i(width, "t.width");
        in.swiggy.android.tejas.feature.listing.grid.model.Dimension transform = iTransformer.transform(width);
        ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension> iTransformer2 = this.dimensionTransformer;
        Dimension height = itemStyle.getHeight();
        p.i(height, "t.height");
        in.swiggy.android.tejas.feature.listing.grid.model.Dimension transform2 = iTransformer2.transform(height);
        if (transform == null || transform2 == null || checkIsInvalidReference(transform, transform)) {
            return null;
        }
        return new in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle(transform, transform2);
    }
}
