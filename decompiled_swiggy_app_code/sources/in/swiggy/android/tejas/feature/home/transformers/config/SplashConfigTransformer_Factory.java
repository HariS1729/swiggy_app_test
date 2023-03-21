package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.widgets.v2.FrequencyCapping;
import com.swiggy.gandalf.widgets.v2.TextBanner;
import in.swiggy.android.tejas.feature.home.model.pageconfig.splash.WidgetInfo;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class SplashConfigTransformer_Factory implements e<SplashConfigTransformer> {
    private final Provider<ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping>> frequencyCappingTransformerProvider;
    private final Provider<ITransformer<TextBanner, WidgetInfo>> splashWidgetTransformerProvider;

    public SplashConfigTransformer_Factory(Provider<ITransformer<TextBanner, WidgetInfo>> provider, Provider<ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping>> provider2) {
        this.splashWidgetTransformerProvider = provider;
        this.frequencyCappingTransformerProvider = provider2;
    }

    public static SplashConfigTransformer_Factory create(Provider<ITransformer<TextBanner, WidgetInfo>> provider, Provider<ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping>> provider2) {
        return new SplashConfigTransformer_Factory(provider, provider2);
    }

    public static SplashConfigTransformer newInstance(ITransformer<TextBanner, WidgetInfo> iTransformer, ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping> iTransformer2) {
        return new SplashConfigTransformer(iTransformer, iTransformer2);
    }

    public SplashConfigTransformer get() {
        return newInstance(this.splashWidgetTransformerProvider.get(), this.frequencyCappingTransformerProvider.get());
    }
}
