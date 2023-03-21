package in.swiggy.android.tejas.feature.home.grid.transformers.socialproof.v1;

import com.swiggy.gandalf.home.protobuf.Dimension;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class TickerStyleTransformer_Factory implements e<TickerStyleTransformer> {
    private final Provider<ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension>> dimensionTransformerProvider;

    public TickerStyleTransformer_Factory(Provider<ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension>> provider) {
        this.dimensionTransformerProvider = provider;
    }

    public static TickerStyleTransformer_Factory create(Provider<ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension>> provider) {
        return new TickerStyleTransformer_Factory(provider);
    }

    public static TickerStyleTransformer newInstance(ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension> iTransformer) {
        return new TickerStyleTransformer(iTransformer);
    }

    public TickerStyleTransformer get() {
        return newInstance(this.dimensionTransformerProvider.get());
    }
}
