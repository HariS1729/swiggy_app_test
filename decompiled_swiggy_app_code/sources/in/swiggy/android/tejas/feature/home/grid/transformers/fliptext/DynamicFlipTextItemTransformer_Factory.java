package in.swiggy.android.tejas.feature.home.grid.transformers.fliptext;

import com.swiggy.gandalf.widgets.v2.Cta;
import com.swiggy.gandalf.widgets.v2.LotteCardInfo;
import in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieItem;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class DynamicFlipTextItemTransformer_Factory implements e<DynamicFlipTextItemTransformer> {
    private final Provider<ITransformer<Cta, CTA>> ctaTransformerProvider;
    private final Provider<ITransformer<LotteCardInfo, RemoteLottieItem>> dynamicFlipTextLottieTransformerProvider;

    public DynamicFlipTextItemTransformer_Factory(Provider<ITransformer<LotteCardInfo, RemoteLottieItem>> provider, Provider<ITransformer<Cta, CTA>> provider2) {
        this.dynamicFlipTextLottieTransformerProvider = provider;
        this.ctaTransformerProvider = provider2;
    }

    public static DynamicFlipTextItemTransformer_Factory create(Provider<ITransformer<LotteCardInfo, RemoteLottieItem>> provider, Provider<ITransformer<Cta, CTA>> provider2) {
        return new DynamicFlipTextItemTransformer_Factory(provider, provider2);
    }

    public static DynamicFlipTextItemTransformer newInstance(ITransformer<LotteCardInfo, RemoteLottieItem> iTransformer, ITransformer<Cta, CTA> iTransformer2) {
        return new DynamicFlipTextItemTransformer(iTransformer, iTransformer2);
    }

    public DynamicFlipTextItemTransformer get() {
        return newInstance(this.dynamicFlipTextLottieTransformerProvider.get(), this.ctaTransformerProvider.get());
    }
}
