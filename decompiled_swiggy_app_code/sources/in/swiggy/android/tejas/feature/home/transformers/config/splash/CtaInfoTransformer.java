package in.swiggy.android.tejas.feature.home.transformers.config.splash;

import com.swiggy.gandalf.widgets.v2.Cta;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.pageconfig.splash.CTAInfo;
import in.swiggy.android.tejas.feature.home.model.pageconfig.splash.MetaInfo;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: CtaInfoTransformer.kt */
public final class CtaInfoTransformer implements ITransformer<Cta, CTAInfo> {
    private final ITransformer<Cta.CtaMeta, MetaInfo> metaInfoTransformer;

    public CtaInfoTransformer(ITransformer<Cta.CtaMeta, MetaInfo> iTransformer) {
        p.j(iTransformer, "metaInfoTransformer");
        this.metaInfoTransformer = iTransformer;
    }

    public CTAInfo transform(Cta cta) {
        p.j(cta, t.V);
        String link = cta.getLink();
        String text = cta.getText();
        String type = cta.getType();
        ITransformer<Cta.CtaMeta, MetaInfo> iTransformer = this.metaInfoTransformer;
        Cta.CtaMeta metaInfo = cta.getMetaInfo();
        p.i(metaInfo, "t.metaInfo");
        return new CTAInfo(link, text, type, iTransformer.transform(metaInfo));
    }
}
