package in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup;

import com.swiggy.gandalf.widgets.v2.CPPopupWidget;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.TextStyle;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class TextLineTransformer_Factory implements e<TextLineTransformer> {
    private final Provider<ITransformer<CPPopupWidget.TextStyle, TextStyle>> textStyleTransformerProvider;

    public TextLineTransformer_Factory(Provider<ITransformer<CPPopupWidget.TextStyle, TextStyle>> provider) {
        this.textStyleTransformerProvider = provider;
    }

    public static TextLineTransformer_Factory create(Provider<ITransformer<CPPopupWidget.TextStyle, TextStyle>> provider) {
        return new TextLineTransformer_Factory(provider);
    }

    public static TextLineTransformer newInstance(ITransformer<CPPopupWidget.TextStyle, TextStyle> iTransformer) {
        return new TextLineTransformer(iTransformer);
    }

    public TextLineTransformer get() {
        return newInstance(this.textStyleTransformerProvider.get());
    }
}
