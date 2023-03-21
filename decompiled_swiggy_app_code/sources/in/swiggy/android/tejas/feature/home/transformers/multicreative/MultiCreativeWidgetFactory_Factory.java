package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.swiggy.gandalf.widgets.v2.MultiTypeCreativeInfoWithStyle;
import in.swiggy.android.tejas.feature.home.model.multicreative.MulticreativeInfo;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class MultiCreativeWidgetFactory_Factory implements e<MultiCreativeWidgetFactory> {
    private final Provider<ITransformer<MultiTypeCreativeInfoWithStyle, MulticreativeInfo>> multiCreativeWidgetTransformerProvider;

    public MultiCreativeWidgetFactory_Factory(Provider<ITransformer<MultiTypeCreativeInfoWithStyle, MulticreativeInfo>> provider) {
        this.multiCreativeWidgetTransformerProvider = provider;
    }

    public static MultiCreativeWidgetFactory_Factory create(Provider<ITransformer<MultiTypeCreativeInfoWithStyle, MulticreativeInfo>> provider) {
        return new MultiCreativeWidgetFactory_Factory(provider);
    }

    public static MultiCreativeWidgetFactory newInstance(ITransformer<MultiTypeCreativeInfoWithStyle, MulticreativeInfo> iTransformer) {
        return new MultiCreativeWidgetFactory(iTransformer);
    }

    public MultiCreativeWidgetFactory get() {
        return newInstance(this.multiCreativeWidgetTransformerProvider.get());
    }
}
