package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.widgets.v2.VideoPopup;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeVideoPopup;
import in.swiggy.android.tejas.feature.home.transformers.config.video.VideoPopupConfigTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ConfigTransformerModule_ProvidesVideoPopupConfigTransformerFactory implements e<ITransformer<VideoPopup, HomeVideoPopup>> {
    private final Provider<VideoPopupConfigTransformer> videoPopupConfigTransformerProvider;

    public ConfigTransformerModule_ProvidesVideoPopupConfigTransformerFactory(Provider<VideoPopupConfigTransformer> provider) {
        this.videoPopupConfigTransformerProvider = provider;
    }

    public static ConfigTransformerModule_ProvidesVideoPopupConfigTransformerFactory create(Provider<VideoPopupConfigTransformer> provider) {
        return new ConfigTransformerModule_ProvidesVideoPopupConfigTransformerFactory(provider);
    }

    public static ITransformer<VideoPopup, HomeVideoPopup> providesVideoPopupConfigTransformer(VideoPopupConfigTransformer videoPopupConfigTransformer) {
        return (ITransformer) i.e(ConfigTransformerModule.providesVideoPopupConfigTransformer(videoPopupConfigTransformer));
    }

    public ITransformer<VideoPopup, HomeVideoPopup> get() {
        return providesVideoPopupConfigTransformer(this.videoPopupConfigTransformerProvider.get());
    }
}
