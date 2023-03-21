package in.swiggy.android.tejas.feature.home.grid.transformers.favourites;

import com.swiggy.gandalf.widgets.v2.Dimension;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class FavouriteItemStyleTransformer_Factory implements e<FavouriteItemStyleTransformer> {
    private final Provider<ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension>> dimensionTransformerProvider;

    public FavouriteItemStyleTransformer_Factory(Provider<ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension>> provider) {
        this.dimensionTransformerProvider = provider;
    }

    public static FavouriteItemStyleTransformer_Factory create(Provider<ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension>> provider) {
        return new FavouriteItemStyleTransformer_Factory(provider);
    }

    public static FavouriteItemStyleTransformer newInstance(ITransformer<Dimension, in.swiggy.android.tejas.feature.listing.grid.model.Dimension> iTransformer) {
        return new FavouriteItemStyleTransformer(iTransformer);
    }

    public FavouriteItemStyleTransformer get() {
        return newInstance(this.dimensionTransformerProvider.get());
    }
}
