package in.swiggy.android.tejas.feature.home.transformers.discovery.configs.splash;

import com.swiggy.gandalf.widgets.v2.FrequencyCapping;
import com.swiggy.gandalf.widgets.v2.TextBanner;
import in.swiggy.android.tejas.feature.home.model.pageconfig.splash.WidgetInfo;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class DiscoverySplashConfigTransformer_Factory implements e<DiscoverySplashConfigTransformer> {
    private final Provider<ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping>> frequencyCappingTransformerProvider;
    private final Provider<ITransformer<TextBanner, WidgetInfo>> splashWidgetTransformerProvider;

    public DiscoverySplashConfigTransformer_Factory(Provider<ITransformer<TextBanner, WidgetInfo>> provider, Provider<ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping>> provider2) {
        this.splashWidgetTransformerProvider = provider;
        this.frequencyCappingTransformerProvider = provider2;
    }

    public static DiscoverySplashConfigTransformer_Factory create(Provider<ITransformer<TextBanner, WidgetInfo>> provider, Provider<ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping>> provider2) {
        return new DiscoverySplashConfigTransformer_Factory(provider, provider2);
    }

    public static DiscoverySplashConfigTransformer newInstance(ITransformer<TextBanner, WidgetInfo> iTransformer, ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping> iTransformer2) {
        return new DiscoverySplashConfigTransformer(iTransformer, iTransformer2);
    }

    public DiscoverySplashConfigTransformer get() {
        return newInstance(this.splashWidgetTransformerProvider.get(), this.frequencyCappingTransformerProvider.get());
    }
}
