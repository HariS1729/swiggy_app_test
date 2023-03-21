package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import com.swiggy.presentation.food.v2.DishInfo;
import in.swiggy.android.tejas.feature.listing.dish.transformer.MenuCategoryTagListTransformer;
import in.swiggy.android.tejas.feature.menu.health.model.MenuSpecialItemCategoryTags;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DishTransformerModule_ProvidesCategoryTagListFactory implements e<ITransformer<DishInfo, List<MenuSpecialItemCategoryTags>>> {
    private final Provider<MenuCategoryTagListTransformer> menuCategoryTagListTransformerProvider;

    public DishTransformerModule_ProvidesCategoryTagListFactory(Provider<MenuCategoryTagListTransformer> provider) {
        this.menuCategoryTagListTransformerProvider = provider;
    }

    public static DishTransformerModule_ProvidesCategoryTagListFactory create(Provider<MenuCategoryTagListTransformer> provider) {
        return new DishTransformerModule_ProvidesCategoryTagListFactory(provider);
    }

    public static ITransformer<DishInfo, List<MenuSpecialItemCategoryTags>> providesCategoryTagList(MenuCategoryTagListTransformer menuCategoryTagListTransformer) {
        return (ITransformer) i.e(DishTransformerModule.providesCategoryTagList(menuCategoryTagListTransformer));
    }

    public ITransformer<DishInfo, List<MenuSpecialItemCategoryTags>> get() {
        return providesCategoryTagList(this.menuCategoryTagListTransformerProvider.get());
    }
}
