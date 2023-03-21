package in.swiggy.android.tejas.feature.home.grid.transformers.footer;

import in.swiggy.android.tejas.feature.listing.label.transformer.LabelTransformer;
import javax.inject.Provider;
import qq.e;

public final class GridFooterTransformer_Factory implements e<GridFooterTransformer> {
    private final Provider<LabelTransformer> labelTransformerProvider;

    public GridFooterTransformer_Factory(Provider<LabelTransformer> provider) {
        this.labelTransformerProvider = provider;
    }

    public static GridFooterTransformer_Factory create(Provider<LabelTransformer> provider) {
        return new GridFooterTransformer_Factory(provider);
    }

    public static GridFooterTransformer newInstance(LabelTransformer labelTransformer) {
        return new GridFooterTransformer(labelTransformer);
    }

    public GridFooterTransformer get() {
        return newInstance(this.labelTransformerProvider.get());
    }
}
