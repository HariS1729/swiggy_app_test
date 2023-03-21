package in.swiggy.android.tejas.feature.home.grid.transformers.stores;

import com.swiggy.gandalf.home.protobuf.Cta;
import i20.t;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.feature.listing.cta.model.CtaMetaInfo;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: HomeCtaTransformer.kt */
public final class HomeCtaTransformer implements ITransformer<Cta, CTA> {
    public CTA transform(Cta cta) {
        p.j(cta, t.V);
        if (p.e(cta, Cta.getDefaultInstance())) {
            return null;
        }
        String link = cta.getLink();
        String text = cta.getText();
        String type = cta.getType();
        p.i(type, "t.type");
        return new CTA(link, text, type, (CtaMetaInfo) null, 8, (i) null);
    }
}
