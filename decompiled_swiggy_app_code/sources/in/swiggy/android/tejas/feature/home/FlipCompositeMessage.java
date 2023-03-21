package in.swiggy.android.tejas.feature.home;

import com.newrelic.agent.android.agentdata.HexAttribute;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import kotlin.jvm.internal.p;

/* compiled from: FlipCompositeMessage.kt */
public final class FlipCompositeMessage {
    private CTA cta;
    private String message;

    public FlipCompositeMessage(String str, CTA cta2) {
        p.j(str, HexAttribute.HEX_ATTR_MESSAGE);
        p.j(cta2, "cta");
        this.message = str;
        this.cta = cta2;
    }

    public final CTA getCta() {
        return this.cta;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setCta(CTA cta2) {
        p.j(cta2, "<set-?>");
        this.cta = cta2;
    }

    public final void setMessage(String str) {
        p.j(str, "<set-?>");
        this.message = str;
    }
}
