package in.swiggy.android.tejas.feature.home.transformers;

import com.swiggy.gandalf.home.protobuf.SmallFyiCard;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.CardFYISmall;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: CardFYISmallTransformer.kt */
public final class CardFYISmallTransformer implements ITransformer<SmallFyiCard, CardFYISmall> {
    public CardFYISmall transform(SmallFyiCard smallFyiCard) {
        p.j(smallFyiCard, t.V);
        String id2 = smallFyiCard.getId();
        String imageId = smallFyiCard.getImageId();
        String title = smallFyiCard.getTitle();
        p.i(title, "t.title");
        return new CardFYISmall(id2, imageId, title, smallFyiCard.getWidgetId());
    }
}
