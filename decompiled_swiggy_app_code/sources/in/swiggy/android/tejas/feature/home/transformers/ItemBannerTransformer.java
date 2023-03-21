package in.swiggy.android.tejas.feature.home.transformers;

import com.swiggy.gandalf.home.protobuf.BannerCarouselDto;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.DynamicData;
import in.swiggy.android.tejas.feature.home.model.ItemBanner;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.feature.listing.cta.model.CtaMetaInfo;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ItemBannerTransformer.kt */
public final class ItemBannerTransformer implements ITransformer<BannerCarouselDto.CarouselCardItem, ItemBanner> {
    private final DynamicDataTransformer dataTransformer;

    public ItemBannerTransformer(DynamicDataTransformer dynamicDataTransformer) {
        p.j(dynamicDataTransformer, "dataTransformer");
        this.dataTransformer = dynamicDataTransformer;
    }

    public ItemBanner transform(BannerCarouselDto.CarouselCardItem carouselCardItem) {
        p.j(carouselCardItem, t.V);
        DynamicDataTransformer dynamicDataTransformer = this.dataTransformer;
        List<BannerCarouselDto.DynamicData> dynamicDataList = carouselCardItem.getDynamicDataList();
        p.i(dynamicDataList, "t.dynamicDataList");
        List<DynamicData> transform = dynamicDataTransformer.transform(dynamicDataList);
        String id2 = carouselCardItem.getId();
        p.i(id2, "t.id");
        String imageId = carouselCardItem.getImageId();
        p.i(imageId, "t.imageId");
        String link = carouselCardItem.getAction().getLink();
        String text = carouselCardItem.getAction().getText();
        String type = carouselCardItem.getAction().getType();
        p.i(type, "t.action.type");
        CTA cta = new CTA(link, text, type, (CtaMetaInfo) null, 8, (i) null);
        String adTrackingId = carouselCardItem.getAdTrackingId();
        p.i(adTrackingId, "t.adTrackingId");
        String entityType = carouselCardItem.getEntityType();
        p.i(entityType, "t.entityType");
        String entityId = carouselCardItem.getEntityId();
        p.i(entityId, "t.entityId");
        return new ItemBanner(id2, imageId, cta, transform, adTrackingId, entityType, entityId);
    }
}
