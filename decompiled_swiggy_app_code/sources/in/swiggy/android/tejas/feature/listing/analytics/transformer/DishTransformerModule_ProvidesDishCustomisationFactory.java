package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import com.swiggy.presentation.food.v2.DishCustomisation;
import in.swiggy.android.tejas.feature.listing.dish.transformer.DishCustomisationTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DishTransformerModule_ProvidesDishCustomisationFactory implements e<ITransformer<DishCustomisation, in.swiggy.android.tejas.oldapi.models.menu.DishCustomisation>> {
    private final Provider<DishCustomisationTransformer> dishCustomisationTransformerProvider;

    public DishTransformerModule_ProvidesDishCustomisationFactory(Provider<DishCustomisationTransformer> provider) {
        this.dishCustomisationTransformerProvider = provider;
    }

    public static DishTransformerModule_ProvidesDishCustomisationFactory create(Provider<DishCustomisationTransformer> provider) {
        return new DishTransformerModule_ProvidesDishCustomisationFactory(provider);
    }

    public static ITransformer<DishCustomisation, in.swiggy.android.tejas.oldapi.models.menu.DishCustomisation> providesDishCustomisation(DishCustomisationTransformer dishCustomisationTransformer) {
        return (ITransformer) i.e(DishTransformerModule.providesDishCustomisation(dishCustomisationTransformer));
    }

    public ITransformer<DishCustomisation, in.swiggy.android.tejas.oldapi.models.menu.DishCustomisation> get() {
        return providesDishCustomisation(this.dishCustomisationTransformerProvider.get());
    }
}
