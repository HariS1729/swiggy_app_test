package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.widgets.v2.Videos;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeVideoPopup;
import in.swiggy.android.tejas.feature.home.transformers.config.video.VideoTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ConfigTransformerModule_ProvidesVideoTransformerFactory implements e<ITransformer<Videos, HomeVideoPopup.Videos>> {
    private final Provider<VideoTransformer> videoTransformerProvider;

    public ConfigTransformerModule_ProvidesVideoTransformerFactory(Provider<VideoTransformer> provider) {
        this.videoTransformerProvider = provider;
    }

    public static ConfigTransformerModule_ProvidesVideoTransformerFactory create(Provider<VideoTransformer> provider) {
        return new ConfigTransformerModule_ProvidesVideoTransformerFactory(provider);
    }

    public static ITransformer<Videos, HomeVideoPopup.Videos> providesVideoTransformer(VideoTransformer videoTransformer) {
        return (ITransformer) i.e(ConfigTransformerModule.providesVideoTransformer(videoTransformer));
    }

    public ITransformer<Videos, HomeVideoPopup.Videos> get() {
        return providesVideoTransformer(this.videoTransformerProvider.get());
    }
}
