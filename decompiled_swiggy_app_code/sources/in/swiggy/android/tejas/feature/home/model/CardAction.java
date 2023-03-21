package in.swiggy.android.tejas.feature.home.model;

import com.google.gson.annotations.SerializedName;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import kotlin.jvm.internal.p;

/* compiled from: CardAction.kt */
public final class CardAction {
    @SerializedName("cta")
    private final CTA cta;

    public CardAction(CTA cta2) {
        p.j(cta2, "cta");
        this.cta = cta2;
    }

    public final CTA getCta() {
        return this.cta;
    }
}
