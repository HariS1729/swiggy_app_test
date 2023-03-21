package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import com.swiggy.presentation.food.v2.AddonGroup;
import in.swiggy.android.tejas.feature.listing.dish.transformer.AddonGroupTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DishTransformerModule_ProvidesAddOnGroupTransformerFactory implements e<ITransformer<AddonGroup, in.swiggy.android.tejas.oldapi.models.menu.AddonGroup>> {
    private final Provider<AddonGroupTransformer> addonGroupTransformerProvider;

    public DishTransformerModule_ProvidesAddOnGroupTransformerFactory(Provider<AddonGroupTransformer> provider) {
        this.addonGroupTransformerProvider = provider;
    }

    public static DishTransformerModule_ProvidesAddOnGroupTransformerFactory create(Provider<AddonGroupTransformer> provider) {
        return new DishTransformerModule_ProvidesAddOnGroupTransformerFactory(provider);
    }

    public static ITransformer<AddonGroup, in.swiggy.android.tejas.oldapi.models.menu.AddonGroup> providesAddOnGroupTransformer(AddonGroupTransformer addonGroupTransformer) {
        return (ITransformer) i.e(DishTransformerModule.providesAddOnGroupTransformer(addonGroupTransformer));
    }

    public ITransformer<AddonGroup, in.swiggy.android.tejas.oldapi.models.menu.AddonGroup> get() {
        return providesAddOnGroupTransformer(this.addonGroupTransformerProvider.get());
    }
}
