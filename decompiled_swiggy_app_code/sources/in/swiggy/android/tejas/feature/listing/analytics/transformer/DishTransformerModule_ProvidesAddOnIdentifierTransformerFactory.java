package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import com.swiggy.presentation.food.v2.AddonCombination;
import in.swiggy.android.tejas.feature.listing.dish.transformer.AddOnIdentifierTransformer;
import in.swiggy.android.tejas.oldapi.models.menu.AddOnIdentifier;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DishTransformerModule_ProvidesAddOnIdentifierTransformerFactory implements e<ITransformer<AddonCombination, AddOnIdentifier>> {
    private final Provider<AddOnIdentifierTransformer> addOnIdentifierTransformerProvider;

    public DishTransformerModule_ProvidesAddOnIdentifierTransformerFactory(Provider<AddOnIdentifierTransformer> provider) {
        this.addOnIdentifierTransformerProvider = provider;
    }

    public static DishTransformerModule_ProvidesAddOnIdentifierTransformerFactory create(Provider<AddOnIdentifierTransformer> provider) {
        return new DishTransformerModule_ProvidesAddOnIdentifierTransformerFactory(provider);
    }

    public static ITransformer<AddonCombination, AddOnIdentifier> providesAddOnIdentifierTransformer(AddOnIdentifierTransformer addOnIdentifierTransformer) {
        return (ITransformer) i.e(DishTransformerModule.providesAddOnIdentifierTransformer(addOnIdentifierTransformer));
    }

    public ITransformer<AddonCombination, AddOnIdentifier> get() {
        return providesAddOnIdentifierTransformer(this.addOnIdentifierTransformerProvider.get());
    }
}
