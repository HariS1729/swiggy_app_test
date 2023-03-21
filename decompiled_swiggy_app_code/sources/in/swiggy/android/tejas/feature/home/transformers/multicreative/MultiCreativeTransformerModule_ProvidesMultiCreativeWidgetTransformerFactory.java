package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.swiggy.gandalf.widgets.v2.MultiTypeCreativeInfoWithStyle;
import in.swiggy.android.tejas.feature.home.model.multicreative.MulticreativeInfo;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class MultiCreativeTransformerModule_ProvidesMultiCreativeWidgetTransformerFactory implements e<ITransformer<MultiTypeCreativeInfoWithStyle, MulticreativeInfo>> {
    private final Provider<MultiCreativeWidgetTransformer> multiCreativeWidgetTransformerProvider;

    public MultiCreativeTransformerModule_ProvidesMultiCreativeWidgetTransformerFactory(Provider<MultiCreativeWidgetTransformer> provider) {
        this.multiCreativeWidgetTransformerProvider = provider;
    }

    public static MultiCreativeTransformerModule_ProvidesMultiCreativeWidgetTransformerFactory create(Provider<MultiCreativeWidgetTransformer> provider) {
        return new MultiCreativeTransformerModule_ProvidesMultiCreativeWidgetTransformerFactory(provider);
    }

    public static ITransformer<MultiTypeCreativeInfoWithStyle, MulticreativeInfo> providesMultiCreativeWidgetTransformer(MultiCreativeWidgetTransformer multiCreativeWidgetTransformer) {
        return (ITransformer) i.e(MultiCreativeTransformerModule.providesMultiCreativeWidgetTransformer(multiCreativeWidgetTransformer));
    }

    public ITransformer<MultiTypeCreativeInfoWithStyle, MulticreativeInfo> get() {
        return providesMultiCreativeWidgetTransformer(this.multiCreativeWidgetTransformerProvider.get());
    }
}
