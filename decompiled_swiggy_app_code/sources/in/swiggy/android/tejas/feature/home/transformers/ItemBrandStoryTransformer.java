package in.swiggy.android.tejas.feature.home.transformers;

import com.swiggy.gandalf.home.protobuf.BrandStoriesDto;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.ItemBrandStory;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.feature.listing.cta.model.CtaMetaInfo;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ItemBrandStoryTransformer.kt */
public final class ItemBrandStoryTransformer implements ITransformer<BrandStoriesDto.Card, ItemBrandStory> {
    public ItemBrandStory transform(BrandStoriesDto.Card card) {
        p.j(card, t.V);
        String id2 = card.getId();
        p.i(id2, "it.id");
        String creativeId = card.getCreativeId();
        p.i(creativeId, "it.creativeId");
        String description = card.getDescription();
        p.i(description, "it.description");
        String name = card.getRestaurant().getName();
        p.i(name, "it.restaurant.name");
        String slaString = card.getRestaurant().getSlaString();
        p.i(slaString, "it.restaurant.slaString");
        String costForTwoString = card.getRestaurant().getCostForTwoString();
        p.i(costForTwoString, "it.restaurant.costForTwoString");
        String totalRating = card.getRestaurant().getTotalRating();
        p.i(totalRating, "it.restaurant.totalRating");
        String link = card.getAction().getLink();
        String text = card.getAction().getText();
        String type = card.getAction().getType();
        p.i(type, "it.action.type");
        CTA cta = new CTA(link, text, type, (CtaMetaInfo) null, 8, (i) null);
        String adTrackingId = card.getAdTrackingId();
        p.i(adTrackingId, "t.adTrackingId");
        String entityType = card.getEntityType();
        p.i(entityType, "t.entityType");
        String entityId = card.getEntityId();
        p.i(entityId, "t.entityId");
        return new ItemBrandStory(id2, creativeId, description, name, slaString, costForTwoString, totalRating, cta, adTrackingId, entityType, entityId);
    }
}
