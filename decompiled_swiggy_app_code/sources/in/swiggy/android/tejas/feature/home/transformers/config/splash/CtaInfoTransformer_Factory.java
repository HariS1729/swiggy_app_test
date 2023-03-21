package in.swiggy.android.tejas.feature.home.transformers.config.splash;

import com.swiggy.gandalf.widgets.v2.Cta;
import in.swiggy.android.tejas.feature.home.model.pageconfig.splash.MetaInfo;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class CtaInfoTransformer_Factory implements e<CtaInfoTransformer> {
    private final Provider<ITransformer<Cta.CtaMeta, MetaInfo>> metaInfoTransformerProvider;

    public CtaInfoTransformer_Factory(Provider<ITransformer<Cta.CtaMeta, MetaInfo>> provider) {
        this.metaInfoTransformerProvider = provider;
    }

    public static CtaInfoTransformer_Factory create(Provider<ITransformer<Cta.CtaMeta, MetaInfo>> provider) {
        return new CtaInfoTransformer_Factory(provider);
    }

    public static CtaInfoTransformer newInstance(ITransformer<Cta.CtaMeta, MetaInfo> iTransformer) {
        return new CtaInfoTransformer(iTransformer);
    }

    public CtaInfoTransformer get() {
        return newInstance(this.metaInfoTransformerProvider.get());
    }
}
