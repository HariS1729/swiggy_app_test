package in.swiggy.android.tejas.feature.home.transformers.config;

import in.swiggy.android.tejas.feature.home.transformers.config.video.VideoIdTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ConfigTransformerModule_ProvidesVideoIdTransformerFactory implements e<ITransformer<String, String>> {
    private final Provider<VideoIdTransformer> videoIdTransformerProvider;

    public ConfigTransformerModule_ProvidesVideoIdTransformerFactory(Provider<VideoIdTransformer> provider) {
        this.videoIdTransformerProvider = provider;
    }

    public static ConfigTransformerModule_ProvidesVideoIdTransformerFactory create(Provider<VideoIdTransformer> provider) {
        return new ConfigTransformerModule_ProvidesVideoIdTransformerFactory(provider);
    }

    public static ITransformer<String, String> providesVideoIdTransformer(VideoIdTransformer videoIdTransformer) {
        return (ITransformer) i.e(ConfigTransformerModule.providesVideoIdTransformer(videoIdTransformer));
    }

    public ITransformer<String, String> get() {
        return providesVideoIdTransformer(this.videoIdTransformerProvider.get());
    }
}
