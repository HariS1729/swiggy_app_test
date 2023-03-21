package in.swiggy.android.tejas.feature.edm.model;

import com.google.gson.annotations.SerializedName;
import in.swiggy.android.tejas.feature.listing.base.BaseCard;
import kotlin.jvm.internal.i;

/* compiled from: EdmRatingCard.kt */
public final class EdmRatingCard extends BaseCard {
    @SerializedName("data")
    private final EdmRatingCardData data;

    public EdmRatingCard() {
        this((EdmRatingCardData) null, 1, (i) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EdmRatingCard(EdmRatingCardData edmRatingCardData, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : edmRatingCardData);
    }

    public final EdmRatingCardData getData() {
        return this.data;
    }

    public EdmRatingCard(EdmRatingCardData edmRatingCardData) {
        this.data = edmRatingCardData;
    }
}
