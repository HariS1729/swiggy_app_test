package in.swiggy.android.tejas.feature.discovery.pageskeleton.model;

import com.google.gson.annotations.SerializedName;
import in.swiggy.android.tejas.payment.model.payment.models.PaymentType;
import kotlin.jvm.internal.p;

/* compiled from: SkeletonJsonResponse.kt */
public final class CardInfo {
    @SerializedName("card")
    private final Card card;

    public CardInfo(Card card2) {
        p.j(card2, PaymentType.CARD_GROUP);
        this.card = card2;
    }

    public static /* synthetic */ CardInfo copy$default(CardInfo cardInfo, Card card2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            card2 = cardInfo.card;
        }
        return cardInfo.copy(card2);
    }

    public final Card component1() {
        return this.card;
    }

    public final CardInfo copy(Card card2) {
        p.j(card2, PaymentType.CARD_GROUP);
        return new CardInfo(card2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardInfo) && p.e(this.card, ((CardInfo) obj).card);
    }

    public final Card getCard() {
        return this.card;
    }

    public int hashCode() {
        return this.card.hashCode();
    }

    public String toString() {
        return "CardInfo(card=" + this.card + ')';
    }
}
