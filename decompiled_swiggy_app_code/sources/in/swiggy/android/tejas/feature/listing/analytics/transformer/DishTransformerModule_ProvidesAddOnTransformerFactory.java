package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import com.swiggy.presentation.food.v2.AddonChoice;
import in.swiggy.android.tejas.feature.listing.dish.transformer.AddonTransformer;
import in.swiggy.android.tejas.oldapi.models.menu.Addon;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DishTransformerModule_ProvidesAddOnTransformerFactory implements e<ITransformer<AddonChoice, Addon>> {
    private final Provider<AddonTransformer> addonTransformerProvider;

    public DishTransformerModule_ProvidesAddOnTransformerFactory(Provider<AddonTransformer> provider) {
        this.addonTransformerProvider = provider;
    }

    public static DishTransformerModule_ProvidesAddOnTransformerFactory create(Provider<AddonTransformer> provider) {
        return new DishTransformerModule_ProvidesAddOnTransformerFactory(provider);
    }

    public static ITransformer<AddonChoice, Addon> providesAddOnTransformer(AddonTransformer addonTransformer) {
        return (ITransformer) i.e(DishTransformerModule.providesAddOnTransformer(addonTransformer));
    }

    public ITransformer<AddonChoice, Addon> get() {
        return providesAddOnTransformer(this.addonTransformerProvider.get());
    }
}
