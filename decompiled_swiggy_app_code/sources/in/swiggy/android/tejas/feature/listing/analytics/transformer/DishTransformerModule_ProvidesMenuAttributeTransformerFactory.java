package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import com.swiggy.presentation.food.v2.DishAttribute;
import in.swiggy.android.tejas.oldapi.models.menu.MenuAttributes;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class DishTransformerModule_ProvidesMenuAttributeTransformerFactory implements e<ITransformer<DishAttribute, MenuAttributes>> {
    private final Provider<MenuAttributeTransformer> menuAttributeTransformerProvider;

    public DishTransformerModule_ProvidesMenuAttributeTransformerFactory(Provider<MenuAttributeTransformer> provider) {
        this.menuAttributeTransformerProvider = provider;
    }

    public static DishTransformerModule_ProvidesMenuAttributeTransformerFactory create(Provider<MenuAttributeTransformer> provider) {
        return new DishTransformerModule_ProvidesMenuAttributeTransformerFactory(provider);
    }

    public static ITransformer<DishAttribute, MenuAttributes> providesMenuAttributeTransformer(MenuAttributeTransformer menuAttributeTransformer) {
        return (ITransformer) i.e(DishTransformerModule.providesMenuAttributeTransformer(menuAttributeTransformer));
    }

    public ITransformer<DishAttribute, MenuAttributes> get() {
        return providesMenuAttributeTransformer(this.menuAttributeTransformerProvider.get());
    }
}
