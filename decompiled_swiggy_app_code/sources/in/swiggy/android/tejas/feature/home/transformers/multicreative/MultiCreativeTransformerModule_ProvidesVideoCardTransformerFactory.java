package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.swiggy.gandalf.widgets.v2.VideoCardInfo;
import in.swiggy.android.tejas.feature.home.model.multicreative.VideoCard;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class MultiCreativeTransformerModule_ProvidesVideoCardTransformerFactory implements e<ITransformer<VideoCardInfo, VideoCard>> {
    private final Provider<VideoCardTransformer> videoCardTransformerProvider;

    public MultiCreativeTransformerModule_ProvidesVideoCardTransformerFactory(Provider<VideoCardTransformer> provider) {
        this.videoCardTransformerProvider = provider;
    }

    public static MultiCreativeTransformerModule_ProvidesVideoCardTransformerFactory create(Provider<VideoCardTransformer> provider) {
        return new MultiCreativeTransformerModule_ProvidesVideoCardTransformerFactory(provider);
    }

    public static ITransformer<VideoCardInfo, VideoCard> providesVideoCardTransformer(VideoCardTransformer videoCardTransformer) {
        return (ITransformer) i.e(MultiCreativeTransformerModule.providesVideoCardTransformer(videoCardTransformer));
    }

    public ITransformer<VideoCardInfo, VideoCard> get() {
        return providesVideoCardTransformer(this.videoCardTransformerProvider.get());
    }
}
