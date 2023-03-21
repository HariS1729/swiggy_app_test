package in.swiggy.android.tejas.feature.home.transformers;

import com.swiggy.gandalf.home.protobuf.BannerCarouselDto;
import com.swiggy.gandalf.home.protobuf.BrandStoriesDto;
import com.swiggy.gandalf.home.protobuf.CtaDto;
import com.swiggy.gandalf.home.protobuf.DashCardGroupDto;
import com.swiggy.gandalf.home.protobuf.LaunchCardGroupDto;
import com.swiggy.gandalf.home.protobuf.PopCardDto;
import com.swiggy.gandalf.home.protobuf.PopularBrandsDto;
import com.swiggy.gandalf.home.protobuf.RestaurantHomeDto;
import in.swiggy.android.tejas.feature.home.model.AssociatedParam;
import in.swiggy.android.tejas.feature.home.model.AutoscrollConfig;
import in.swiggy.android.tejas.feature.home.model.CardDash;
import in.swiggy.android.tejas.feature.home.model.DynamicData;
import in.swiggy.android.tejas.feature.home.model.ItemBanner;
import in.swiggy.android.tejas.feature.home.model.ItemBrandStory;
import in.swiggy.android.tejas.feature.home.model.ItemLaunch;
import in.swiggy.android.tejas.feature.home.model.ItemPop;
import in.swiggy.android.tejas.feature.home.model.ItemTopBrand;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.feature.listing.restaurant.model.RestaurantEntity;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;

/* compiled from: CardTransformerModule.kt */
public abstract class CardTransformerModule {
    public abstract ITransformer<List<BannerCarouselDto.DynamicData>, List<DynamicData>> bindsBannerDataTransformer(DynamicDataTransformer dynamicDataTransformer);

    public abstract ITransformer<List<BannerCarouselDto.AssociatedParams>, List<AssociatedParam>> bindsBannerParamsTransformer(BannerAssociatedParamTransformer bannerAssociatedParamTransformer);

    public abstract ITransformer<BrandStoriesDto.Card, ItemBrandStory> bindsBrandStoryItemTransformer(ItemBrandStoryTransformer itemBrandStoryTransformer);

    public abstract ITransformer<CtaDto.CTADto, CTA> bindsCTATransformer(CTATransformer cTATransformer);

    public abstract ITransformer<BannerCarouselDto, AutoscrollConfig> bindsCardBannerCarouselAutoScrollTransformer(AutoScrollTransformer autoScrollTransformer);

    public abstract ITransformer<BannerCarouselDto.CarouselCardItem, ItemBanner> bindsCarouselTransformer(ItemBannerTransformer itemBannerTransformer);

    public abstract ITransformer<DashCardGroupDto.DashCardItemData, CardDash> bindsDashCardTransformer(CardDashTransformer cardDashTransformer);

    public abstract ITransformer<LaunchCardGroupDto.LaunchCardItemData, ItemLaunch> bindsLaunchCardTransformer(ItemLaunchTransformer itemLaunchTransformer);

    public abstract ITransformer<PopCardDto.Card, ItemPop> bindsPopItemTransformer(ItemPopTransformer itemPopTransformer);

    public abstract ITransformer<RestaurantHomeDto, RestaurantEntity> bindsRestaurantTransformer(RestaurantTransformer restaurantTransformer);

    public abstract ITransformer<PopularBrandsDto.Card, ItemTopBrand> bindsTopBrandTransformer(ItemTopBrandTransformer itemTopBrandTransformer);
}
