package in.swiggy.android.tejas.feature.home.grid.model.timeboundoffer.transformer;

import com.swiggy.presentation.food.v2.OfferInfo;
import i20.t;
import in.swiggy.android.tejas.feature.home.grid.model.timeboundoffer.model.TimeBoundOffer;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: TimBoundOfferEntityTransformer.kt */
public final class TimBoundOfferEntityTransformer implements ITransformer<OfferInfo, TimeBoundOffer> {
    public TimeBoundOffer transform(OfferInfo offerInfo) {
        p.j(offerInfo, t.V);
        if (p.e(offerInfo, OfferInfo.getDefaultInstance())) {
            return null;
        }
        String header = offerInfo.getHeader();
        p.i(header, "t.header");
        String description = offerInfo.getDescription();
        p.i(description, "t.description");
        String imageId = offerInfo.getImageId();
        p.i(imageId, "t.imageId");
        String expiryText = offerInfo.getExpiryText();
        p.i(expiryText, "t.expiryText");
        String expiryColor = offerInfo.getExpiryColor();
        p.i(expiryColor, "t.expiryColor");
        return new TimeBoundOffer(header, description, imageId, expiryText, expiryColor);
    }
}
