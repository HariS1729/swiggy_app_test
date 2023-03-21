package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import com.swiggy.presentation.food.v2.DishInfo;
import in.swiggy.android.tejas.feature.listing.dish.transformer.MenuOfferTagListTransformer;
import in.swiggy.android.tejas.oldapi.models.menu.ItemLevelOfferTags;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DishTransformerModule_ProvidesDishOfferTagListFactory implements e<ITransformer<DishInfo, List<ItemLevelOfferTags>>> {
    private final Provider<MenuOfferTagListTransformer> menuOfferTagListTransformerProvider;

    public DishTransformerModule_ProvidesDishOfferTagListFactory(Provider<MenuOfferTagListTransformer> provider) {
        this.menuOfferTagListTransformerProvider = provider;
    }

    public static DishTransformerModule_ProvidesDishOfferTagListFactory create(Provider<MenuOfferTagListTransformer> provider) {
        return new DishTransformerModule_ProvidesDishOfferTagListFactory(provider);
    }

    public static ITransformer<DishInfo, List<ItemLevelOfferTags>> providesDishOfferTagList(MenuOfferTagListTransformer menuOfferTagListTransformer) {
        return (ITransformer) i.e(DishTransformerModule.providesDishOfferTagList(menuOfferTagListTransformer));
    }

    public ITransformer<DishInfo, List<ItemLevelOfferTags>> get() {
        return providesDishOfferTagList(this.menuOfferTagListTransformerProvider.get());
    }
}
