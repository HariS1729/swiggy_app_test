package in.swiggy.android.tejas.feature.crosssell;

import com.swiggy.gandalf.widgets.v2.Response;
import in.swiggy.android.tejas.feature.crosssell.model.CrossSellResponse;
import in.swiggy.android.tejas.feature.crosssell.transformers.CrossSellTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class CrossSellTransformerModule_ProvidesCrossSellTransformerFactory implements e<ITransformer<Response, CrossSellResponse>> {
    private final Provider<CrossSellTransformer> crossSellTransformerProvider;

    public CrossSellTransformerModule_ProvidesCrossSellTransformerFactory(Provider<CrossSellTransformer> provider) {
        this.crossSellTransformerProvider = provider;
    }

    public static CrossSellTransformerModule_ProvidesCrossSellTransformerFactory create(Provider<CrossSellTransformer> provider) {
        return new CrossSellTransformerModule_ProvidesCrossSellTransformerFactory(provider);
    }

    public static ITransformer<Response, CrossSellResponse> providesCrossSellTransformer(CrossSellTransformer crossSellTransformer) {
        return (ITransformer) i.e(CrossSellTransformerModule.providesCrossSellTransformer(crossSellTransformer));
    }

    public ITransformer<Response, CrossSellResponse> get() {
        return providesCrossSellTransformer(this.crossSellTransformerProvider.get());
    }
}
