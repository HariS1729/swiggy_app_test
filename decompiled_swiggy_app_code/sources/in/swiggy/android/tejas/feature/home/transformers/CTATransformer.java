package in.swiggy.android.tejas.feature.home.transformers;

import com.swiggy.gandalf.home.protobuf.CtaDto;
import i20.t;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.feature.listing.cta.model.CtaMetaInfo;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: CTATransformer.kt */
public final class CTATransformer implements ITransformer<CtaDto.CTADto, CTA> {
    public CTA transform(CtaDto.CTADto cTADto) {
        p.j(cTADto, t.V);
        if (p.e(cTADto, CtaDto.CTADto.getDefaultInstance())) {
            return null;
        }
        String link = cTADto.getLink();
        String text = cTADto.getText();
        String type = cTADto.getType();
        p.i(type, "t.type");
        return new CTA(link, text, type, (CtaMetaInfo) null, 8, (i) null);
    }
}
