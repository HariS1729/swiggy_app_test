package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.swiggy.gandalf.widgets.v2.ImageInfoLayoutCard;
import in.swiggy.android.tejas.feature.home.model.multicreative.ImageCard;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class MultiCreativeTransformerModule_ProvidesImageCardTransformerFactory implements e<ITransformer<ImageInfoLayoutCard.ImageCardInfo, ImageCard>> {
    private final Provider<ImageCardTransformer> imageCardTransformerProvider;

    public MultiCreativeTransformerModule_ProvidesImageCardTransformerFactory(Provider<ImageCardTransformer> provider) {
        this.imageCardTransformerProvider = provider;
    }

    public static MultiCreativeTransformerModule_ProvidesImageCardTransformerFactory create(Provider<ImageCardTransformer> provider) {
        return new MultiCreativeTransformerModule_ProvidesImageCardTransformerFactory(provider);
    }

    public static ITransformer<ImageInfoLayoutCard.ImageCardInfo, ImageCard> providesImageCardTransformer(ImageCardTransformer imageCardTransformer) {
        return (ITransformer) i.e(MultiCreativeTransformerModule.providesImageCardTransformer(imageCardTransformer));
    }

    public ITransformer<ImageInfoLayoutCard.ImageCardInfo, ImageCard> get() {
        return providesImageCardTransformer(this.imageCardTransformerProvider.get());
    }
}
