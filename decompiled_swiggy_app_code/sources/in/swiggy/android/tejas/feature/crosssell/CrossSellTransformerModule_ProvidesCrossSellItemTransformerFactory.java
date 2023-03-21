package in.swiggy.android.tejas.feature.crosssell;

import com.swiggy.presentation.food.v2.MenuItem;
import in.swiggy.android.tejas.feature.menu.health.model.CrossSellMenuItemEntity;
import in.swiggy.android.tejas.feature.menu.health.transformer.CrossSellItemTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class CrossSellTransformerModule_ProvidesCrossSellItemTransformerFactory implements e<ITransformer<MenuItem, CrossSellMenuItemEntity>> {
    private final Provider<CrossSellItemTransformer> crossSellItemTransformerProvider;

    public CrossSellTransformerModule_ProvidesCrossSellItemTransformerFactory(Provider<CrossSellItemTransformer> provider) {
        this.crossSellItemTransformerProvider = provider;
    }

    public static CrossSellTransformerModule_ProvidesCrossSellItemTransformerFactory create(Provider<CrossSellItemTransformer> provider) {
        return new CrossSellTransformerModule_ProvidesCrossSellItemTransformerFactory(provider);
    }

    public static ITransformer<MenuItem, CrossSellMenuItemEntity> providesCrossSellItemTransformer(CrossSellItemTransformer crossSellItemTransformer) {
        return (ITransformer) i.e(CrossSellTransformerModule.providesCrossSellItemTransformer(crossSellItemTransformer));
    }

    public ITransformer<MenuItem, CrossSellMenuItemEntity> get() {
        return providesCrossSellItemTransformer(this.crossSellItemTransformerProvider.get());
    }
}
