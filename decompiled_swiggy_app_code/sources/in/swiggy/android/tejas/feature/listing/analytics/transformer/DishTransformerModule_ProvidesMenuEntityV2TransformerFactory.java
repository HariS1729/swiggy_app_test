package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import com.swiggy.presentation.food.v2.Dish;
import in.swiggy.android.tejas.feature.listing.dish.model.MenuItemV2Entity;
import in.swiggy.android.tejas.feature.listing.dish.transformer.MenuEntityV2Transformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DishTransformerModule_ProvidesMenuEntityV2TransformerFactory implements e<ITransformer<Dish, MenuItemV2Entity>> {
    private final Provider<MenuEntityV2Transformer> menuEntityV2TransformerProvider;

    public DishTransformerModule_ProvidesMenuEntityV2TransformerFactory(Provider<MenuEntityV2Transformer> provider) {
        this.menuEntityV2TransformerProvider = provider;
    }

    public static DishTransformerModule_ProvidesMenuEntityV2TransformerFactory create(Provider<MenuEntityV2Transformer> provider) {
        return new DishTransformerModule_ProvidesMenuEntityV2TransformerFactory(provider);
    }

    public static ITransformer<Dish, MenuItemV2Entity> providesMenuEntityV2Transformer(MenuEntityV2Transformer menuEntityV2Transformer) {
        return (ITransformer) i.e(DishTransformerModule.providesMenuEntityV2Transformer(menuEntityV2Transformer));
    }

    public ITransformer<Dish, MenuItemV2Entity> get() {
        return providesMenuEntityV2Transformer(this.menuEntityV2TransformerProvider.get());
    }
}
