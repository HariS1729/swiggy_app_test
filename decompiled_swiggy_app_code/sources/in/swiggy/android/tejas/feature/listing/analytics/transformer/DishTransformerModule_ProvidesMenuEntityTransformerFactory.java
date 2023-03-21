package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import com.swiggy.presentation.food.v2.Dish;
import in.swiggy.android.tejas.feature.listing.dish.model.MenuItemEntity;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DishTransformerModule_ProvidesMenuEntityTransformerFactory implements e<ITransformer<Dish, MenuItemEntity>> {
    private final Provider<MenuEntityTransformer> menuEntityTransformerProvider;

    public DishTransformerModule_ProvidesMenuEntityTransformerFactory(Provider<MenuEntityTransformer> provider) {
        this.menuEntityTransformerProvider = provider;
    }

    public static DishTransformerModule_ProvidesMenuEntityTransformerFactory create(Provider<MenuEntityTransformer> provider) {
        return new DishTransformerModule_ProvidesMenuEntityTransformerFactory(provider);
    }

    public static ITransformer<Dish, MenuItemEntity> providesMenuEntityTransformer(MenuEntityTransformer menuEntityTransformer) {
        return (ITransformer) i.e(DishTransformerModule.providesMenuEntityTransformer(menuEntityTransformer));
    }

    public ITransformer<Dish, MenuItemEntity> get() {
        return providesMenuEntityTransformer(this.menuEntityTransformerProvider.get());
    }
}
