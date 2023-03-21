package in.swiggy.android.tejas.feature.home.transformers.config.splash;

import com.swiggy.gandalf.widgets.v2.Cta;
import com.swiggy.gandalf.widgets.v2.RichText;
import in.swiggy.android.tejas.feature.home.model.pageconfig.splash.CTAInfo;
import in.swiggy.android.tejas.feature.home.model.pageconfig.splash.TextInfo;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class SplashWidgetTransformer_Factory implements e<SplashWidgetTransformer> {
    private final Provider<ITransformer<Cta, CTAInfo>> ctaInfoTransformerProvider;
    private final Provider<ITransformer<RichText, TextInfo>> textInfoTransformerProvider;

    public SplashWidgetTransformer_Factory(Provider<ITransformer<RichText, TextInfo>> provider, Provider<ITransformer<Cta, CTAInfo>> provider2) {
        this.textInfoTransformerProvider = provider;
        this.ctaInfoTransformerProvider = provider2;
    }

    public static SplashWidgetTransformer_Factory create(Provider<ITransformer<RichText, TextInfo>> provider, Provider<ITransformer<Cta, CTAInfo>> provider2) {
        return new SplashWidgetTransformer_Factory(provider, provider2);
    }

    public static SplashWidgetTransformer newInstance(ITransformer<RichText, TextInfo> iTransformer, ITransformer<Cta, CTAInfo> iTransformer2) {
        return new SplashWidgetTransformer(iTransformer, iTransformer2);
    }

    public SplashWidgetTransformer get() {
        return newInstance(this.textInfoTransformerProvider.get(), this.ctaInfoTransformerProvider.get());
    }
}
