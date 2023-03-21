package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import com.swiggy.presentation.food.v2.ItemInfoTag;
import in.swiggy.android.tejas.feature.menu.health.model.Info;
import in.swiggy.android.tejas.feature.menu.health.transformer.MenuItemInfoTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DishTransformerModule_ProvidesMenuItemInfoTagFactory implements e<ITransformer<ItemInfoTag, Info>> {
    private final Provider<MenuItemInfoTransformer> menuItemInfoTransformerProvider;

    public DishTransformerModule_ProvidesMenuItemInfoTagFactory(Provider<MenuItemInfoTransformer> provider) {
        this.menuItemInfoTransformerProvider = provider;
    }

    public static DishTransformerModule_ProvidesMenuItemInfoTagFactory create(Provider<MenuItemInfoTransformer> provider) {
        return new DishTransformerModule_ProvidesMenuItemInfoTagFactory(provider);
    }

    public static ITransformer<ItemInfoTag, Info> providesMenuItemInfoTag(MenuItemInfoTransformer menuItemInfoTransformer) {
        return (ITransformer) i.e(DishTransformerModule.providesMenuItemInfoTag(menuItemInfoTransformer));
    }

    public ITransformer<ItemInfoTag, Info> get() {
        return providesMenuItemInfoTag(this.menuItemInfoTransformerProvider.get());
    }
}
