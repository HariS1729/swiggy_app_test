package in.swiggy.android.tejas.feature.home.transformers.config.splash;

import com.swiggy.gandalf.widgets.v2.Cta;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.pageconfig.splash.MetaInfo;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: MetaInfoTransformer.kt */
public final class MetaInfoTransformer implements ITransformer<Cta.CtaMeta, MetaInfo> {
    public MetaInfo transform(Cta.CtaMeta ctaMeta) {
        p.j(ctaMeta, t.V);
        return new MetaInfo(ctaMeta.getCtaTextColor(), ctaMeta.getCtaBgColor());
    }
}
