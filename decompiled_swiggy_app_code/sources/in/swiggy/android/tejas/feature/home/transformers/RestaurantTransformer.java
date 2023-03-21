package in.swiggy.android.tejas.feature.home.transformers;

import com.google.protobuf.ProtocolStringList;
import com.swiggy.gandalf.home.protobuf.AggregatedDiscountInfoDTO;
import com.swiggy.gandalf.home.protobuf.CtaDto;
import com.swiggy.gandalf.home.protobuf.Fee;
import com.swiggy.gandalf.home.protobuf.RestaurantHomeDto;
import com.swiggy.gandalf.home.protobuf.RestaurantImageBadgeDto;
import com.swiggy.gandalf.home.protobuf.RestaurantTextBadgeDto;
import com.swiggy.gandalf.home.protobuf.RibbonHomeData;
import i20.t;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import in.swiggy.android.tejas.feature.listing.restaurant.model.CollectionMetadata;
import in.swiggy.android.tejas.feature.listing.restaurant.model.RestaurantEntity;
import in.swiggy.android.tejas.oldapi.models.FeeDetail;
import in.swiggy.android.tejas.oldapi.models.enums.HeaderTypeV2;
import in.swiggy.android.tejas.oldapi.models.restaurant.AggregatedDiscountInfo;
import in.swiggy.android.tejas.oldapi.models.restaurant.AggregatedDiscountInfoShortDesc;
import in.swiggy.android.tejas.oldapi.models.restaurant.AggregatedDiscountInfoV3;
import in.swiggy.android.tejas.oldapi.models.restaurant.Badges;
import in.swiggy.android.tejas.oldapi.models.restaurant.ImageBadge;
import in.swiggy.android.tejas.oldapi.models.restaurant.Restaurant;
import in.swiggy.android.tejas.oldapi.models.restaurant.RestaurantFee;
import in.swiggy.android.tejas.oldapi.models.restaurant.RibbonData;
import in.swiggy.android.tejas.oldapi.models.restaurant.RibbonInfo;
import in.swiggy.android.tejas.oldapi.models.restaurant.TextBadge;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: RestaurantTransformer.kt */
public final class RestaurantTransformer implements ITransformer<RestaurantHomeDto, RestaurantEntity> {
    private final CTATransformer ctaTransformer;

    public RestaurantTransformer(CTATransformer cTATransformer) {
        p.j(cTATransformer, "ctaTransformer");
        this.ctaTransformer = cTATransformer;
    }

    public RestaurantEntity transform(RestaurantHomeDto restaurantHomeDto) {
        p.j(restaurantHomeDto, t.V);
        String header = restaurantHomeDto.getAggregatedDiscountInfoV2().getHeader();
        ArrayList arrayList = new ArrayList();
        List<AggregatedDiscountInfoDTO.DiscountMeta> shortDescriptionListList = restaurantHomeDto.getAggregatedDiscountInfoV2().getShortDescriptionListList();
        p.i(shortDescriptionListList, "it.aggregatedDiscountInf….shortDescriptionListList");
        for (AggregatedDiscountInfoDTO.DiscountMeta discountMeta : shortDescriptionListList) {
            AggregatedDiscountInfoShortDesc aggregatedDiscountInfoShortDesc = new AggregatedDiscountInfoShortDesc();
            String meta = discountMeta.getMeta();
            p.i(meta, "discountMeta.meta");
            aggregatedDiscountInfoShortDesc.setMetaInfo(meta);
            String discountType = discountMeta.getDiscountType();
            p.i(discountType, "discountMeta.discountType");
            aggregatedDiscountInfoShortDesc.setDiscountType(discountType);
            String operationType = discountMeta.getOperationType();
            p.i(operationType, "discountMeta.operationType");
            aggregatedDiscountInfoShortDesc.setOperationType(operationType);
            arrayList.add(aggregatedDiscountInfoShortDesc);
        }
        ArrayList arrayList2 = new ArrayList();
        List<AggregatedDiscountInfoDTO.DiscountMeta> descriptionListList = restaurantHomeDto.getAggregatedDiscountInfoV2().getDescriptionListList();
        p.i(descriptionListList, "it.aggregatedDiscountInfoV2.descriptionListList");
        for (AggregatedDiscountInfoDTO.DiscountMeta discountMeta2 : descriptionListList) {
            AggregatedDiscountInfoShortDesc aggregatedDiscountInfoShortDesc2 = new AggregatedDiscountInfoShortDesc();
            String meta2 = discountMeta2.getMeta();
            p.i(meta2, "discountMeta.meta");
            aggregatedDiscountInfoShortDesc2.setMetaInfo(meta2);
            String discountType2 = discountMeta2.getDiscountType();
            p.i(discountType2, "discountMeta.discountType");
            aggregatedDiscountInfoShortDesc2.setDiscountType(discountType2);
            String operationType2 = discountMeta2.getOperationType();
            p.i(operationType2, "discountMeta.operationType");
            aggregatedDiscountInfoShortDesc2.setOperationType(operationType2);
            arrayList2.add(aggregatedDiscountInfoShortDesc2);
        }
        AggregatedDiscountInfo aggregatedDiscountInfo = new AggregatedDiscountInfo();
        aggregatedDiscountInfo.setHeader(header);
        aggregatedDiscountInfo.setShortDescription(arrayList);
        aggregatedDiscountInfo.setLongDescription(arrayList2);
        aggregatedDiscountInfo.setHeaderType(restaurantHomeDto.getAggregatedDiscountInfoV2().getHeaderType().getNumber());
        aggregatedDiscountInfo.setSubHeader(restaurantHomeDto.getAggregatedDiscountInfoV2().getSubHeader());
        aggregatedDiscountInfo.setSuperDelFee(restaurantHomeDto.getAggregatedDiscountInfoV2().getSuperFreeDel());
        AggregatedDiscountInfoV3 aggregatedDiscountInfoV3 = new AggregatedDiscountInfoV3();
        aggregatedDiscountInfoV3.setHeader(restaurantHomeDto.getAggregatedDiscountInfoV3().getHeader());
        aggregatedDiscountInfoV3.setSubHeader(restaurantHomeDto.getAggregatedDiscountInfoV3().getSubHeader());
        aggregatedDiscountInfoV3.setDiscountTag(restaurantHomeDto.getAggregatedDiscountInfoV3().getDiscountTag());
        aggregatedDiscountInfoV3.setHeaderType(HeaderTypeV2.HEADER_TYPE_V2_INVALID);
        ArrayList arrayList3 = new ArrayList();
        List<RibbonHomeData> ribbonList = restaurantHomeDto.getRibbonList();
        p.i(ribbonList, "it.ribbonList");
        for (RibbonHomeData ribbonHomeData : ribbonList) {
            RibbonInfo ribbonInfo = new RibbonInfo();
            ribbonInfo.mType = ribbonHomeData.getType();
            RibbonData ribbonData = new RibbonData();
            ribbonData.mText = ribbonHomeData.getRibbonMetaData().getText();
            ribbonInfo.mRibbonData = ribbonData;
            arrayList3.add(ribbonInfo);
        }
        String[] strArr = new String[restaurantHomeDto.getCuisinesList().size()];
        ProtocolStringList cuisinesList = restaurantHomeDto.getCuisinesList();
        p.i(cuisinesList, "it.cuisinesList");
        boolean z11 = false;
        int i11 = 0;
        for (Object next : cuisinesList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                k.t();
            }
            strArr[i11] = (String) next;
            i11 = i12;
        }
        ArrayList arrayList4 = new ArrayList();
        List<Fee> feesList = restaurantHomeDto.getRestaurantFeeDetails().getFeesList();
        p.i(feesList, "it.restaurantFeeDetails.feesList");
        for (Fee fee : feesList) {
            FeeDetail feeDetail = new FeeDetail();
            feeDetail.mType = fee.getName();
            feeDetail.mFeeCost = (double) fee.getFee();
            arrayList4.add(feeDetail);
        }
        RestaurantFee restaurantFee = null;
        String message = restaurantHomeDto.getRestaurantFeeDetails().getMessage();
        if (message == null || o.A(message)) {
            z11 = true;
        }
        if (!z11) {
            restaurantFee = new RestaurantFee();
            restaurantFee.icon = restaurantHomeDto.getRestaurantFeeDetails().getIcon();
            restaurantFee.message = restaurantHomeDto.getRestaurantFeeDetails().getMessage();
            restaurantFee.feeDetailsList = arrayList4;
        }
        ArrayList arrayList5 = new ArrayList();
        List<RestaurantImageBadgeDto> imageBadgesList = restaurantHomeDto.getBadges().getImageBadgesList();
        p.i(imageBadgesList, "it.badges.imageBadgesList");
        for (RestaurantImageBadgeDto restaurantImageBadgeDto : imageBadgesList) {
            arrayList5.add(new ImageBadge(restaurantImageBadgeDto.getImageId(), restaurantImageBadgeDto.getDescription()));
        }
        ArrayList arrayList6 = new ArrayList();
        List<RestaurantTextBadgeDto> textBadgesList = restaurantHomeDto.getBadges().getTextBadgesList();
        p.i(textBadgesList, "it.badges.textBadgesList");
        for (RestaurantTextBadgeDto restaurantTextBadgeDto : textBadgesList) {
            arrayList6.add(new TextBadge(restaurantTextBadgeDto.getIconId(), restaurantTextBadgeDto.getShortDescription(), restaurantTextBadgeDto.getDescription(), restaurantTextBadgeDto.getFontColor()));
        }
        ArrayList arrayList7 = new ArrayList();
        List<RestaurantTextBadgeDto> textExtendedBadgesList = restaurantHomeDto.getBadges().getTextExtendedBadgesList();
        p.i(textExtendedBadgesList, "it.badges.textExtendedBadgesList");
        for (RestaurantTextBadgeDto restaurantTextBadgeDto2 : textExtendedBadgesList) {
            arrayList7.add(new TextBadge(restaurantTextBadgeDto2.getIconId(), restaurantTextBadgeDto2.getShortDescription(), restaurantTextBadgeDto2.getDescription(), restaurantTextBadgeDto2.getFontColor()));
        }
        Badges badges = new Badges(arrayList5, arrayList6, arrayList7);
        Restaurant restaurant = new Restaurant();
        restaurant.mId = restaurantHomeDto.getId();
        restaurant.mName = restaurantHomeDto.getName();
        restaurant.mImagePath = restaurantHomeDto.getCloudinaryImageId();
        restaurant.mCuisinesList = strArr;
        restaurant.mSlaString = restaurantHomeDto.getSlaString();
        restaurant.averageRating = restaurantHomeDto.getAvgRating();
        restaurant.mCostForTwoString = restaurantHomeDto.getCostForTwo();
        restaurant.isFavourite = restaurantHomeDto.getFavourite();
        restaurant.mAggregatedDiscountInfo = aggregatedDiscountInfo;
        restaurant.mAggregatedDiscountInfoV3 = aggregatedDiscountInfoV3;
        restaurant.isPromoted = restaurantHomeDto.getIsPromoted();
        restaurant.adTrackingID = restaurantHomeDto.getAdTrackingId();
        restaurant.isUnserviceable = restaurantHomeDto.getUnserviceable();
        restaurant.mIsOpen = restaurantHomeDto.getRestaurantAvailability().getOpened();
        restaurant.mRibbonsList = arrayList3;
        restaurant.feeDetails = restaurantFee;
        restaurant.restaurantBadges = badges;
        restaurant.hasSurge = restaurantHomeDto.getHasSurge();
        restaurant.newAreaName = restaurantHomeDto.getAreaName();
        restaurant.lastMileTravelString = restaurantHomeDto.getLastMileTravelString();
        CTATransformer cTATransformer = this.ctaTransformer;
        CtaDto.CTADto cta = restaurantHomeDto.getCta();
        p.i(cta, "t.cta");
        return new RestaurantEntity(restaurant, (AnalyticsData) null, cTATransformer.transform(cta), (CollectionMetadata) null, (String) null, false, 58, (i) null);
    }
}
