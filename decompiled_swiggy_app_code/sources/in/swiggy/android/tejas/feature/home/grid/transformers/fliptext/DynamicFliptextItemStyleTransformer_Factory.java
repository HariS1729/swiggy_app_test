package in.swiggy.android.tejas.feature.home.grid.transformers.fliptext;

import com.swiggy.gandalf.widgets.v2.Dimension;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class DynamicFliptextItemStyleTransformer_Factory implements e<DynamicFliptextItemStyleTransformer> {
    private final Provider<ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension>> dimensionTransformerProvider;

    public DynamicFliptextItemStyleTransformer_Factory(Provider<ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension>> provider) {
        this.dimensionTransformerProvider = provider;
    }

    public static DynamicFliptextItemStyleTransformer_Factory create(Provider<ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension>> provider) {
        return new DynamicFliptextItemStyleTransformer_Factory(provider);
    }

    public static DynamicFliptextItemStyleTransformer newInstance(ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension> iTransformer) {
        return new DynamicFliptextItemStyleTransformer(iTransformer);
    }

    public DynamicFliptextItemStyleTransformer get() {
        return newInstance(this.dimensionTransformerProvider.get());
    }
}
