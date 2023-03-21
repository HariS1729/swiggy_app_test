package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.widgets.v2.CreativeType;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.BottomBarPopupCardType;
import in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup.CreativeTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ConfigTransformerModule_ProvidesCreativeTransformerFactory implements e<ITransformer<CreativeType, BottomBarPopupCardType>> {
    private final Provider<CreativeTransformer> creativeTransformerProvider;

    public ConfigTransformerModule_ProvidesCreativeTransformerFactory(Provider<CreativeTransformer> provider) {
        this.creativeTransformerProvider = provider;
    }

    public static ConfigTransformerModule_ProvidesCreativeTransformerFactory create(Provider<CreativeTransformer> provider) {
        return new ConfigTransformerModule_ProvidesCreativeTransformerFactory(provider);
    }

    public static ITransformer<CreativeType, BottomBarPopupCardType> providesCreativeTransformer(CreativeTransformer creativeTransformer) {
        return (ITransformer) i.e(ConfigTransformerModule.providesCreativeTransformer(creativeTransformer));
    }

    public ITransformer<CreativeType, BottomBarPopupCardType> get() {
        return providesCreativeTransformer(this.creativeTransformerProvider.get());
    }
}
