package in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup;

import com.swiggy.gandalf.widgets.v2.CPPopupWidget;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.TextStyle;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class RenderableInfoTransformer_Factory implements e<RenderableInfoTransformer> {
    private final Provider<ITransformer<CPPopupWidget.TextStyle, TextStyle>> textStyleTransformerProvider;

    public RenderableInfoTransformer_Factory(Provider<ITransformer<CPPopupWidget.TextStyle, TextStyle>> provider) {
        this.textStyleTransformerProvider = provider;
    }

    public static RenderableInfoTransformer_Factory create(Provider<ITransformer<CPPopupWidget.TextStyle, TextStyle>> provider) {
        return new RenderableInfoTransformer_Factory(provider);
    }

    public static RenderableInfoTransformer newInstance(ITransformer<CPPopupWidget.TextStyle, TextStyle> iTransformer) {
        return new RenderableInfoTransformer(iTransformer);
    }

    public RenderableInfoTransformer get() {
        return newInstance(this.textStyleTransformerProvider.get());
    }
}
