package in.swiggy.android.tejas.feature.home.grid.transformers.remotelottie;

import com.swiggy.gandalf.widgets.v2.Dimension;
import com.swiggy.gandalf.widgets.v2.LotteInfoLayoutCard;
import i20.t;
import in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle;
import in.swiggy.android.tejas.feature.listing.grid.transformer.ProtoDimensionUtil;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: RemoteLottieItemStyleTransformer.kt */
public final class RemoteLottieItemStyleTransformer implements ITransformer<LotteInfoLayoutCard.ItemStyle, ItemStyle> {
    private final ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension> dimensionTransformer;

    public RemoteLottieItemStyleTransformer(ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension> iTransformer) {
        p.j(iTransformer, "dimensionTransformer");
        this.dimensionTransformer = iTransformer;
    }

    public final boolean checkIsInvalidReference(in.swiggy.android.tejas.feature.listing.grid.model.Dimension dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension dimension2) {
        p.j(dimension, "wDimen");
        p.j(dimension2, "hDimen");
        ProtoDimensionUtil protoDimensionUtil = ProtoDimensionUtil.INSTANCE;
        return protoDimensionUtil.isTypeInvalid(dimension, dimension2) || protoDimensionUtil.isRelativeInvalid(dimension, dimension2) || protoDimensionUtil.isRelativeLoop(dimension, dimension2);
    }

    public ItemStyle transform(LotteInfoLayoutCard.ItemStyle itemStyle) {
        p.j(itemStyle, t.V);
        if (p.e(itemStyle, LotteInfoLayoutCard.ItemStyle.getDefaultInstance())) {
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
        return new ItemStyle(transform, transform2);
    }
}
