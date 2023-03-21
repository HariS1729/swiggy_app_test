package in.swiggy.android.tejas.feature.crosssell.transformers;

import com.swiggy.gandalf.widgets.v2.Card;
import com.swiggy.gandalf.widgets.v2.CardInfo;
import com.swiggy.gandalf.widgets.v2.Response;
import com.swiggy.presentation.food.v2.ItemCrossSell;
import i20.t;
import in.swiggy.android.tejas.feature.crosssell.model.CrossSellResponse;
import in.swiggy.android.tejas.feature.listing.ListingCardEntity;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: CrossSellTransformer.kt */
public final class CrossSellTransformer implements ITransformer<Response, CrossSellResponse> {
    private final ITransformer<Card, List<ListingCardEntity<?>>> resultEntityFactory;

    /* compiled from: CrossSellTransformer.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardInfo.InfoCase.values().length];
            iArr[CardInfo.InfoCase.CARD.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CrossSellTransformer(ITransformer<Card, List<ListingCardEntity<?>>> iTransformer) {
        p.j(iTransformer, "resultEntityFactory");
        this.resultEntityFactory = iTransformer;
    }

    public CrossSellResponse transform(Response response) {
        p.j(response, t.V);
        ArrayList arrayList = new ArrayList();
        List<CardInfo> cardsList = response.getSuccess().getCardsList();
        p.i(cardsList, "t.success.cardsList");
        String str = null;
        String str2 = null;
        String str3 = null;
        for (CardInfo cardInfo : cardsList) {
            CardInfo.InfoCase infoCase = cardInfo.getInfoCase();
            if ((infoCase == null ? -1 : WhenMappings.$EnumSwitchMapping$0[infoCase.ordinal()]) == 1) {
                ITransformer<Card, List<ListingCardEntity<?>>> iTransformer = this.resultEntityFactory;
                Card card = cardInfo.getCard();
                p.i(card, "it.card");
                List<ListingCardEntity> transform = iTransformer.transform(card);
                if (transform != null) {
                    for (ListingCardEntity add : transform) {
                        arrayList.add(add);
                    }
                }
                if (cardInfo.getCard().getCard().is(ItemCrossSell.class)) {
                    ItemCrossSell itemCrossSell = (ItemCrossSell) cardInfo.getCard().getCard().unpack(ItemCrossSell.class);
                    String crossSellTitle = itemCrossSell.getCrossSellTitle();
                    String crossSellMessage = itemCrossSell.getCrossSellMessage();
                    str3 = itemCrossSell.getCrossSellType();
                    str = crossSellTitle;
                    str2 = crossSellMessage;
                }
            }
        }
        return new CrossSellResponse(arrayList, str, str2, str3);
    }
}
