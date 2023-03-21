package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import com.swiggy.presentation.food.v2.DishInfo;
import in.swiggy.android.tejas.feature.listing.dish.transformer.MenuItemTransformer;
import in.swiggy.android.tejas.oldapi.models.menu.MenuItem;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DishTransformerModule_ProvidesMenuItemTransformerFactory implements e<ITransformer<DishInfo, MenuItem>> {
    private final Provider<MenuItemTransformer> menuItemTransformerProvider;

    public DishTransformerModule_ProvidesMenuItemTransformerFactory(Provider<MenuItemTransformer> provider) {
        this.menuItemTransformerProvider = provider;
    }

    public static DishTransformerModule_ProvidesMenuItemTransformerFactory create(Provider<MenuItemTransformer> provider) {
        return new DishTransformerModule_ProvidesMenuItemTransformerFactory(provider);
    }

    public static ITransformer<DishInfo, MenuItem> providesMenuItemTransformer(MenuItemTransformer menuItemTransformer) {
        return (ITransformer) i.e(DishTransformerModule.providesMenuItemTransformer(menuItemTransformer));
    }

    public ITransformer<DishInfo, MenuItem> get() {
        return providesMenuItemTransformer(this.menuItemTransformerProvider.get());
    }
}
