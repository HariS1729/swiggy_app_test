package in.swiggy.android.tejas.feature.discovery.pageskeleton.model;

import com.google.gson.annotations.SerializedName;
import in.swiggy.android.tejas.payment.model.payment.models.PaymentType;
import kotlin.jvm.internal.p;

/* compiled from: SkeletonJsonResponse.kt */
public final class Card {
    @SerializedName("card")
    private final CardData card;

    public Card(CardData cardData) {
        p.j(cardData, PaymentType.CARD_GROUP);
        this.card = cardData;
    }

    public static /* synthetic */ Card copy$default(Card card2, CardData cardData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cardData = card2.card;
        }
        return card2.copy(cardData);
    }

    public final CardData component1() {
        return this.card;
    }

    public final Card copy(CardData cardData) {
        p.j(cardData, PaymentType.CARD_GROUP);
        return new Card(cardData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Card) && p.e(this.card, ((Card) obj).card);
    }

    public final CardData getCard() {
        return this.card;
    }

    public int hashCode() {
        return this.card.hashCode();
    }

    public String toString() {
        return "Card(card=" + this.card + ')';
    }
}
