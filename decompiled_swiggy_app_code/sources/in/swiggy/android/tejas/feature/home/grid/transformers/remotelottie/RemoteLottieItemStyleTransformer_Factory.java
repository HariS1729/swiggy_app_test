package in.swiggy.android.tejas.feature.home.grid.transformers.remotelottie;

import com.swiggy.gandalf.widgets.v2.Dimension;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class RemoteLottieItemStyleTransformer_Factory implements e<RemoteLottieItemStyleTransformer> {
    private final Provider<ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension>> dimensionTransformerProvider;

    public RemoteLottieItemStyleTransformer_Factory(Provider<ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension>> provider) {
        this.dimensionTransformerProvider = provider;
    }

    public static RemoteLottieItemStyleTransformer_Factory create(Provider<ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension>> provider) {
        return new RemoteLottieItemStyleTransformer_Factory(provider);
    }

    public static RemoteLottieItemStyleTransformer newInstance(ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension> iTransformer) {
        return new RemoteLottieItemStyleTransformer(iTransformer);
    }

    public RemoteLottieItemStyleTransformer get() {
        return newInstance(this.dimensionTransformerProvider.get());
    }
}
