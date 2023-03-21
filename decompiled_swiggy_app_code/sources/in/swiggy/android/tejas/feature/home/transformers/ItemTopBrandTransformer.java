package in.swiggy.android.tejas.feature.home.transformers;

import com.swiggy.gandalf.home.protobuf.PopularBrandsDto;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.ItemTopBrand;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.feature.listing.cta.model.CtaMetaInfo;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ItemTopBrandTransformer.kt */
public final class ItemTopBrandTransformer implements ITransformer<PopularBrandsDto.Card, ItemTopBrand> {
    public ItemTopBrand transform(PopularBrandsDto.Card card) {
        p.j(card, t.V);
        String id2 = card.getId();
        p.i(id2, "it.id");
        String title = card.getTitle();
        p.i(title, "it.title");
        String subtitle = card.getSubtitle();
        p.i(subtitle, "it.subtitle");
        String imageId = card.getImageId();
        p.i(imageId, "it.imageId");
        String link = card.getAction().getLink();
        String text = card.getAction().getText();
        String type = card.getAction().getType();
        p.i(type, "t.action.type");
        CTA cta = new CTA(link, text, type, (CtaMetaInfo) null, 8, (i) null);
        String adTrackingId = card.getAdTrackingId();
        p.i(adTrackingId, "t.adTrackingId");
        String entityType = card.getEntityType();
        p.i(entityType, "t.entityType");
        String entityId = card.getEntityId();
        p.i(entityId, "t.entityId");
        return new ItemTopBrand(id2, title, subtitle, imageId, cta, adTrackingId, entityType, entityId);
    }
}
