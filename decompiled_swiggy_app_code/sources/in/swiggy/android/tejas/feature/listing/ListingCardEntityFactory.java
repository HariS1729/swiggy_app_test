package in.swiggy.android.tejas.feature.listing;

import com.google.protobuf.Any;
import com.swiggy.gandalf.widgets.v2.Card;
import com.swiggy.gandalf.widgets.v2.Relevance;
import i20.t;
import in.swiggy.android.tejas.feature.listing.dish.model.MenuItemV2Entity;
import in.swiggy.android.tejas.feature.menu.health.model.MenuHealthItem;
import in.swiggy.android.tejas.feature.menu.health.model.MenuHealthItemEntity;
import in.swiggy.android.tejas.payment.model.payment.models.PaymentType;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: ListingCardEntityFactory.kt */
public final class ListingCardEntityFactory implements ITransformer<Card, List<? extends ListingCardEntity<?>>> {
    private final ITransformer<Any, List<ListingCardEntity<?>>> listingEntityFactory;
    private final ITransformer<Relevance, in.swiggy.android.tejas.feature.listing.relevance.model.Relevance> relevanceTransformer;

    public ListingCardEntityFactory(ITransformer<Relevance, in.swiggy.android.tejas.feature.listing.relevance.model.Relevance> iTransformer, ITransformer<Any, List<ListingCardEntity<?>>> iTransformer2) {
        p.j(iTransformer, "relevanceTransformer");
        p.j(iTransformer2, "listingEntityFactory");
        this.relevanceTransformer = iTransformer;
        this.listingEntityFactory = iTransformer2;
    }

    public List<ListingCardEntity<?>> transform(Card card) {
        MenuHealthItem data;
        p.j(card, t.V);
        Any card2 = card.getCard();
        ITransformer<Any, List<ListingCardEntity<?>>> iTransformer = this.listingEntityFactory;
        p.i(card2, PaymentType.CARD_GROUP);
        List<ListingCardEntity<?>> transform = iTransformer.transform(card2);
        ITransformer<Relevance, in.swiggy.android.tejas.feature.listing.relevance.model.Relevance> iTransformer2 = this.relevanceTransformer;
        Relevance relevance = card.getRelevance();
        p.i(relevance, "t.relevance");
        in.swiggy.android.tejas.feature.listing.relevance.model.Relevance transform2 = iTransformer2.transform(relevance);
        if (transform != null) {
            for (ListingCardEntity relevance2 : transform) {
                relevance2.setRelevance(transform2);
            }
        }
        MenuItemV2Entity menuItemV2Entity = null;
        if (transform != null) {
            ArrayList arrayList = new ArrayList();
            for (T next : transform) {
                if (next instanceof MenuHealthItemEntity) {
                    arrayList.add(next);
                }
            }
            MenuHealthItemEntity menuHealthItemEntity = (MenuHealthItemEntity) s.i0(arrayList);
            if (!(menuHealthItemEntity == null || (data = menuHealthItemEntity.getData()) == null)) {
                menuItemV2Entity = data.getMenuItem();
            }
        }
        if (menuItemV2Entity != null) {
            menuItemV2Entity.setLastItem(true);
        }
        return transform;
    }
}
