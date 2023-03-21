package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.swiggy.gandalf.widgets.v2.Cta;
import com.swiggy.gandalf.widgets.v2.ImageInfoLayoutCard;
import com.swiggy.gandalf.widgets.v2.LotteInfoLayoutCard;
import com.swiggy.gandalf.widgets.v2.MultiTypeCreativeInfoWithStyle;
import com.swiggy.gandalf.widgets.v2.VideoCardInfo;
import in.swiggy.android.tejas.feature.home.model.multicreative.CallOut;
import in.swiggy.android.tejas.feature.home.model.multicreative.ImageCard;
import in.swiggy.android.tejas.feature.home.model.multicreative.LottieCard;
import in.swiggy.android.tejas.feature.home.model.multicreative.VideoCard;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class MultiCreativeCardFactory_Factory implements e<MultiCreativeCardFactory> {
    private final Provider<ITransformer<MultiTypeCreativeInfoWithStyle.Callout, CallOut>> callOutTransformerProvider;
    private final Provider<ITransformer<Cta, CTA>> ctaTransformerProvider;
    private final Provider<ITransformer<ImageInfoLayoutCard.ImageCardInfo, ImageCard>> imageCardTransformerProvider;
    private final Provider<ITransformer<LotteInfoLayoutCard.LotteCardInfo, LottieCard>> lottieCardTransformerProvider;
    private final Provider<ITransformer<VideoCardInfo, VideoCard>> videoCardTransformerProvider;

    public MultiCreativeCardFactory_Factory(Provider<ITransformer<ImageInfoLayoutCard.ImageCardInfo, ImageCard>> provider, Provider<ITransformer<LotteInfoLayoutCard.LotteCardInfo, LottieCard>> provider2, Provider<ITransformer<VideoCardInfo, VideoCard>> provider3, Provider<ITransformer<Cta, CTA>> provider4, Provider<ITransformer<MultiTypeCreativeInfoWithStyle.Callout, CallOut>> provider5) {
        this.imageCardTransformerProvider = provider;
        this.lottieCardTransformerProvider = provider2;
        this.videoCardTransformerProvider = provider3;
        this.ctaTransformerProvider = provider4;
        this.callOutTransformerProvider = provider5;
    }

    public static MultiCreativeCardFactory_Factory create(Provider<ITransformer<ImageInfoLayoutCard.ImageCardInfo, ImageCard>> provider, Provider<ITransformer<LotteInfoLayoutCard.LotteCardInfo, LottieCard>> provider2, Provider<ITransformer<VideoCardInfo, VideoCard>> provider3, Provider<ITransformer<Cta, CTA>> provider4, Provider<ITransformer<MultiTypeCreativeInfoWithStyle.Callout, CallOut>> provider5) {
        return new MultiCreativeCardFactory_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static MultiCreativeCardFactory newInstance(ITransformer<ImageInfoLayoutCard.ImageCardInfo, ImageCard> iTransformer, ITransformer<LotteInfoLayoutCard.LotteCardInfo, LottieCard> iTransformer2, ITransformer<VideoCardInfo, VideoCard> iTransformer3, ITransformer<Cta, CTA> iTransformer4, ITransformer<MultiTypeCreativeInfoWithStyle.Callout, CallOut> iTransformer5) {
        return new MultiCreativeCardFactory(iTransformer, iTransformer2, iTransformer3, iTransformer4, iTransformer5);
    }

    public MultiCreativeCardFactory get() {
        return newInstance(this.imageCardTransformerProvider.get(), this.lottieCardTransformerProvider.get(), this.videoCardTransformerProvider.get(), this.ctaTransformerProvider.get(), this.callOutTransformerProvider.get());
    }
}
