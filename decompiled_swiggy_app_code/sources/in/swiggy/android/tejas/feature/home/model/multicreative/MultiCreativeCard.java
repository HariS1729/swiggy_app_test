package in.swiggy.android.tejas.feature.home.model.multicreative;

import in.swiggy.android.tejas.feature.listing.cta.model.CTA;

/* compiled from: MultiCreativeCard.kt */
public abstract class MultiCreativeCard {
    private CallOut callOut;
    private CTA cta;
    private String subTitle;
    private String title;

    public final CallOut getCallOut() {
        return this.callOut;
    }

    public final CTA getCta() {
        return this.cta;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setCallOut(CallOut callOut2) {
        this.callOut = callOut2;
    }

    public final void setCta(CTA cta2) {
        this.cta = cta2;
    }

    public final void setSubTitle(String str) {
        this.subTitle = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
