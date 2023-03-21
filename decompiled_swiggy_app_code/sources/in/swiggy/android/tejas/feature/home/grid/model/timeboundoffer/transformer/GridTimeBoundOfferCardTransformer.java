package in.swiggy.android.tejas.feature.home.grid.model.timeboundoffer.transformer;

import com.swiggy.gandalf.home.protobuf.Dimension;
import com.swiggy.gandalf.home.protobuf.GridWidget;
import com.swiggy.presentation.food.v2.OfferInfo;
import com.swiggy.presentation.food.v2.OfferWidgetBanner;
import com.swiggy.presentation.food.v2.Style;
import i20.t;
import in.swiggy.android.tejas.feature.home.grid.model.timeboundoffer.model.GridTimeBoundOfferSection;
import in.swiggy.android.tejas.feature.home.grid.model.timeboundoffer.model.OfferBannerType;
import in.swiggy.android.tejas.feature.home.grid.model.timeboundoffer.model.TimeBoundOffer;
import in.swiggy.android.tejas.feature.home.grid.model.timeboundoffer.model.TimeBoundOfferCardEntity;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import in.swiggy.android.tejas.feature.listing.grid.model.Dimension;
import in.swiggy.android.tejas.feature.listing.grid.model.DimensionReference;
import in.swiggy.android.tejas.feature.listing.grid.model.DimensionType;
import in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: GridTimeBoundOfferCardTransformer.kt */
public final class GridTimeBoundOfferCardTransformer implements ITransformer<OfferWidgetBanner, GridTimeBoundOfferSection> {
    private final ITransformer<OfferInfo, TimeBoundOffer> timeBoundOfferEntityTransformer;

    public GridTimeBoundOfferCardTransformer(ITransformer<OfferInfo, TimeBoundOffer> iTransformer) {
        p.j(iTransformer, "timeBoundOfferEntityTransformer");
        this.timeBoundOfferEntityTransformer = iTransformer;
    }

    private final boolean checkIsInvalidReference(GridWidget gridWidget, Dimension dimension, Dimension dimension2) {
        return isTypeInvalid(dimension, dimension2) || isRelativeInvalid(dimension, dimension2) || isRelativeLoop(dimension, dimension2) || isViewPortGreaterThenColumn(gridWidget, dimension) || isContainerValueGreaterThanOne(dimension, dimension2);
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

    private final boolean isViewPortGreaterThenColumn(GridWidget gridWidget, in.swiggy.android.tejas.feature.listing.grid.model.Dimension dimension) {
        if (!p.e(dimension.getType().name(), Dimension.Type.TYPE_RELATIVE.name()) || p.e(dimension.getReference().name(), Dimension.RelativeDimensionReference.RELATIVE_DIMENSION_REFERENCE_HEIGHT.name()) || p.e(dimension.getReference().name(), Dimension.RelativeDimensionReference.RELATIVE_DIMENSION_REFERENCE_INVALID.name()) || ((int) (((float) 1) / dimension.getValue())) <= gridWidget.getLayout().getColumns()) {
            return false;
        }
        return true;
    }

    public final ITransformer<OfferInfo, TimeBoundOffer> getTimeBoundOfferEntityTransformer() {
        return this.timeBoundOfferEntityTransformer;
    }

    public final OfferBannerType validOfferBannerType(com.swiggy.presentation.food.v2.OfferBannerType offerBannerType) {
        p.j(offerBannerType, "offerBannerType");
        if (p.e(offerBannerType.name(), com.swiggy.presentation.food.v2.OfferBannerType.OFFER_BANNER_TYPE_INVALID.name())) {
            return OfferBannerType.valueOf(OfferBannerType.OFFER_BANNER_TYPE_SMALL.name());
        }
        return OfferBannerType.valueOf(offerBannerType.name());
    }

    public GridTimeBoundOfferSection transform(OfferWidgetBanner offerWidgetBanner) {
        p.j(offerWidgetBanner, t.V);
        if (p.e(offerWidgetBanner, OfferWidgetBanner.getDefaultInstance())) {
            return null;
        }
        Style style = offerWidgetBanner.getStyle();
        ArrayList arrayList = new ArrayList();
        ITransformer<OfferInfo, TimeBoundOffer> iTransformer = this.timeBoundOfferEntityTransformer;
        OfferInfo offerInfo = offerWidgetBanner.getOfferInfo();
        p.i(offerInfo, "t.offerInfo");
        TimeBoundOffer transform = iTransformer.transform(offerInfo);
        com.swiggy.presentation.food.v2.OfferBannerType widgetType = offerWidgetBanner.getWidgetType();
        p.i(widgetType, "t.widgetType");
        OfferBannerType validOfferBannerType = validOfferBannerType(widgetType);
        if (transform != null) {
            arrayList.add(new TimeBoundOfferCardEntity(transform, (AnalyticsData) null, validOfferBannerType, 2, (i) null));
        }
        return new GridTimeBoundOfferSection(arrayList, new ItemStyle(new in.swiggy.android.tejas.feature.listing.grid.model.Dimension(DimensionType.valueOf(style.getWidth().getType().name()), style.getWidth().getValue(), DimensionReference.valueOf(style.getWidth().getReference().name())), new in.swiggy.android.tejas.feature.listing.grid.model.Dimension(DimensionType.valueOf(style.getHeight().getType().name()), style.getHeight().getValue(), DimensionReference.valueOf(style.getHeight().getReference().name()))));
    }
}
