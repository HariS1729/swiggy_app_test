package in.swiggy.android.tejas.feature.discovery.magiccart.transformer;

import in.swiggy.android.tejas.feature.listing.dish.transformer.MenuEntityV2Transformer;
import in.swiggy.android.tejas.feature.listing.restaurant.transformer.RestaurantEntityTransformer;
import javax.inject.Provider;
import qq.e;

public final class MagicCartTransformer_Factory implements e<MagicCartTransformer> {
    private final Provider<MenuEntityV2Transformer> menuEntityTransformerProvider;
    private final Provider<RestaurantEntityTransformer> restaurantEntityTransformerProvider;

    public MagicCartTransformer_Factory(Provider<MenuEntityV2Transformer> provider, Provider<RestaurantEntityTransformer> provider2) {
        this.menuEntityTransformerProvider = provider;
        this.restaurantEntityTransformerProvider = provider2;
    }

    public static MagicCartTransformer_Factory create(Provider<MenuEntityV2Transformer> provider, Provider<RestaurantEntityTransformer> provider2) {
        return new MagicCartTransformer_Factory(provider, provider2);
    }

    public static MagicCartTransformer newInstance(MenuEntityV2Transformer menuEntityV2Transformer, RestaurantEntityTransformer restaurantEntityTransformer) {
        return new MagicCartTransformer(menuEntityV2Transformer, restaurantEntityTransformer);
    }

    public MagicCartTransformer get() {
        return newInstance(this.menuEntityTransformerProvider.get(), this.restaurantEntityTransformerProvider.get());
    }
}
