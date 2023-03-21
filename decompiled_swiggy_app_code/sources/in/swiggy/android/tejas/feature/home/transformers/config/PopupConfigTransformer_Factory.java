package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.widgets.v2.VideoPopup;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeVideoPopup;
import in.swiggy.android.tejas.feature.home.transformers.config.dynamicpopup.PopUpWidgetTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class PopupConfigTransformer_Factory implements e<PopupConfigTransformer> {
    private final Provider<PopUpWidgetTransformer> popUpWidgetTransformerProvider;
    private final Provider<ITransformer<VideoPopup, HomeVideoPopup>> videoTransformerProvider;

    public PopupConfigTransformer_Factory(Provider<ITransformer<VideoPopup, HomeVideoPopup>> provider, Provider<PopUpWidgetTransformer> provider2) {
        this.videoTransformerProvider = provider;
        this.popUpWidgetTransformerProvider = provider2;
    }

    public static PopupConfigTransformer_Factory create(Provider<ITransformer<VideoPopup, HomeVideoPopup>> provider, Provider<PopUpWidgetTransformer> provider2) {
        return new PopupConfigTransformer_Factory(provider, provider2);
    }

    public static PopupConfigTransformer newInstance(ITransformer<VideoPopup, HomeVideoPopup> iTransformer, PopUpWidgetTransformer popUpWidgetTransformer) {
        return new PopupConfigTransformer(iTransformer, popUpWidgetTransformer);
    }

    public PopupConfigTransformer get() {
        return newInstance(this.videoTransformerProvider.get(), this.popUpWidgetTransformerProvider.get());
    }
}
