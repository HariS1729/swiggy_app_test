package in.swiggy.android.tejas.feature.home.grid.transformers.socialproof.v2;

import com.swiggy.gandalf.widgets.v2.Cta;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class ItemTickerTransformer_Factory implements e<ItemTickerTransformer> {
    private final Provider<ITransformer<Cta, CTA>> ctaTransformerProvider;

    public ItemTickerTransformer_Factory(Provider<ITransformer<Cta, CTA>> provider) {
        this.ctaTransformerProvider = provider;
    }

    public static ItemTickerTransformer_Factory create(Provider<ITransformer<Cta, CTA>> provider) {
        return new ItemTickerTransformer_Factory(provider);
    }

    public static ItemTickerTransformer newInstance(ITransformer<Cta, CTA> iTransformer) {
        return new ItemTickerTransformer(iTransformer);
    }

    public ItemTickerTransformer get() {
        return newInstance(this.ctaTransformerProvider.get());
    }
}
