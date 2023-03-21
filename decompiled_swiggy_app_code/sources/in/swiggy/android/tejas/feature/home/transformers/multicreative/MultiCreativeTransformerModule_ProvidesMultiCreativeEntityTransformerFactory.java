package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.swiggy.gandalf.widgets.v2.MultiTypeCreativeWidget;
import in.swiggy.android.tejas.feature.home.model.multicreative.MultiCreativeEntity;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class MultiCreativeTransformerModule_ProvidesMultiCreativeEntityTransformerFactory implements e<ITransformer<MultiTypeCreativeWidget, MultiCreativeEntity>> {
    private final Provider<MultiCreativeEntityTransformer> multiCreativeEntityTransformerProvider;

    public MultiCreativeTransformerModule_ProvidesMultiCreativeEntityTransformerFactory(Provider<MultiCreativeEntityTransformer> provider) {
        this.multiCreativeEntityTransformerProvider = provider;
    }

    public static MultiCreativeTransformerModule_ProvidesMultiCreativeEntityTransformerFactory create(Provider<MultiCreativeEntityTransformer> provider) {
        return new MultiCreativeTransformerModule_ProvidesMultiCreativeEntityTransformerFactory(provider);
    }

    public static ITransformer<MultiTypeCreativeWidget, MultiCreativeEntity> providesMultiCreativeEntityTransformer(MultiCreativeEntityTransformer multiCreativeEntityTransformer) {
        return (ITransformer) i.e(MultiCreativeTransformerModule.providesMultiCreativeEntityTransformer(multiCreativeEntityTransformer));
    }

    public ITransformer<MultiTypeCreativeWidget, MultiCreativeEntity> get() {
        return providesMultiCreativeEntityTransformer(this.multiCreativeEntityTransformerProvider.get());
    }
}
