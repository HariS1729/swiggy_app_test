package in.swiggy.android.tejas.feature.listing.accessibility.transformers;

import com.swiggy.gandalf.widgets.v2.ImageInfoLayoutCard;
import i20.t;
import in.swiggy.android.tejas.feature.listing.accessibility.models.AccessibilityData;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: AccessibilityTransformer.kt */
public final class AccessibilityTransformer implements ITransformer<ImageInfoLayoutCard.Accessibility, AccessibilityData> {
    public AccessibilityData transform(ImageInfoLayoutCard.Accessibility accessibility) {
        p.j(accessibility, t.V);
        String altText = accessibility.getAltText();
        boolean z11 = false;
        if (!(altText == null || o.A(altText))) {
            String altTextCta = accessibility.getAltTextCta();
            if (altTextCta == null || o.A(altTextCta)) {
                z11 = true;
            }
            if (!z11) {
                String altText2 = accessibility.getAltText();
                p.i(altText2, "t.altText");
                String altTextCta2 = accessibility.getAltTextCta();
                p.i(altTextCta2, "t.altTextCta");
                return new AccessibilityData(altText2, altTextCta2);
            }
        }
        return null;
    }
}
