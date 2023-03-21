package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.swiggy.gandalf.home.protobuf.Dimension;
import com.swiggy.gandalf.widgets.v2.ImageInfoLayoutCard;
import in.swiggy.android.tejas.feature.listing.grid.model.Dimension;
import in.swiggy.android.tejas.feature.listing.grid.model.DimensionReference;
import in.swiggy.android.tejas.feature.listing.grid.model.DimensionType;
import in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: ItemStyleTransformer.kt */
public final class ItemStyleTransformer implements ITransformer<ImageInfoLayoutCard.ItemStyle, ItemStyle> {
    private final boolean checkIsInvalidReference(Dimension dimension, Dimension dimension2) {
        return isTypeInvalid(dimension, dimension2) || isRelativeInvalid(dimension, dimension2) || isRelativeLoop(dimension, dimension2) || isContainerValueGreaterThanOne(dimension, dimension2);
    }

    private final boolean isContainerValueGreaterThanOne(Dimension dimension, Dimension dimension2) {
        String name = dimension.getType().name();
        Dimension.Type type = Dimension.Type.TYPE_RELATIVE;
        if (!p.e(name, type.name()) || !p.e(dimension.getReference().name(), Dimension.RelativeDimensionReference.RELATIVE_DIMENSION_REFERENCE_CONTAINER_WIDTH.name()) || dimension.getValue() <= 1.0f) {
            return p.e(dimension2.getType().name(), type.name()) && p.e(dimension2.getReference().name(), Dimension.RelativeDimensionReference.RELATIVE_DIMENSION_REFERENCE_CONTAINER_WIDTH.name());
        }
        return true;
    }

    private final boolean isRelativeInvalid(in.swiggy.android.tejas.feature.listing.grid.model.Dimension dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension dimension2) {
        String name = dimension.getType().name();
        Dimension.Type type = Dimension.Type.TYPE_RELATIVE;
        if (p.e(name, type.name()) && (p.e(dimension.getReference().name(), Dimension.RelativeDimensionReference.UNRECOGNIZED.name()) || p.e(dimension.getReference().name(), Dimension.RelativeDimensionReference.RELATIVE_DIMENSION_REFERENCE_INVALID.name()))) {
            return true;
        }
        if (p.e(dimension2.getType().name(), type.name())) {
            return p.e(dimension2.getReference().name(), Dimension.RelativeDimensionReference.UNRECOGNIZED.name()) || p.e(dimension2.getReference().name(), Dimension.RelativeDimensionReference.RELATIVE_DIMENSION_REFERENCE_INVALID.name());
        }
        return false;
    }

    private final boolean isRelativeLoop(in.swiggy.android.tejas.feature.listing.grid.model.Dimension dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension dimension2) {
        String name = dimension.getType().name();
        Dimension.Type type = Dimension.Type.TYPE_RELATIVE;
        return p.e(name, type.name()) && p.e(dimension.getReference().name(), Dimension.RelativeDimensionReference.RELATIVE_DIMENSION_REFERENCE_HEIGHT.name()) && p.e(dimension2.getType().name(), type.name()) && p.e(dimension2.getReference().name(), Dimension.RelativeDimensionReference.RELATIVE_DIMENSION_REFERENCE_WIDTH.name());
    }

    private final boolean isTypeInvalid(in.swiggy.android.tejas.feature.listing.grid.model.Dimension dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension dimension2) {
        String name = dimension.getType().name();
        Dimension.Type type = Dimension.Type.TYPE_INVALID;
        if (p.e(name, type.name())) {
            return true;
        }
        String name2 = dimension.getType().name();
        Dimension.Type type2 = Dimension.Type.UNRECOGNIZED;
        return p.e(name2, type2.name()) || p.e(dimension2.getType().name(), type.name()) || p.e(dimension2.getType().name(), type2.name());
    }

    public ItemStyle transform(ImageInfoLayoutCard.ItemStyle itemStyle) {
        p.j(itemStyle, "style");
        in.swiggy.android.tejas.feature.listing.grid.model.Dimension dimension = new in.swiggy.android.tejas.feature.listing.grid.model.Dimension(DimensionType.valueOf(itemStyle.getWidth().getType().name()), itemStyle.getWidth().getValue(), DimensionReference.valueOf(itemStyle.getWidth().getReference().name()));
        in.swiggy.android.tejas.feature.listing.grid.model.Dimension dimension2 = new in.swiggy.android.tejas.feature.listing.grid.model.Dimension(DimensionType.valueOf(itemStyle.getHeight().getType().name()), itemStyle.getHeight().getValue(), DimensionReference.valueOf(itemStyle.getHeight().getReference().name()));
        if (checkIsInvalidReference(dimension, dimension2)) {
            return null;
        }
        return new ItemStyle(dimension, dimension2);
    }
}
