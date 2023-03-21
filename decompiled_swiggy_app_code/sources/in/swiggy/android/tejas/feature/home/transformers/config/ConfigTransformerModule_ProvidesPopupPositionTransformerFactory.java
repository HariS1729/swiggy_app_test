package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.widgets.v2.VideoPopup;
import in.swiggy.android.tejas.feature.home.model.pageconfig.PopupPosition;
import in.swiggy.android.tejas.feature.home.transformers.config.video.PopupPositionTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ConfigTransformerModule_ProvidesPopupPositionTransformerFactory implements e<ITransformer<VideoPopup.Position, PopupPosition>> {
    private final Provider<PopupPositionTransformer> popupPositionTransformerProvider;

    public ConfigTransformerModule_ProvidesPopupPositionTransformerFactory(Provider<PopupPositionTransformer> provider) {
        this.popupPositionTransformerProvider = provider;
    }

    public static ConfigTransformerModule_ProvidesPopupPositionTransformerFactory create(Provider<PopupPositionTransformer> provider) {
        return new ConfigTransformerModule_ProvidesPopupPositionTransformerFactory(provider);
    }

    public static ITransformer<VideoPopup.Position, PopupPosition> providesPopupPositionTransformer(PopupPositionTransformer popupPositionTransformer) {
        return (ITransformer) i.e(ConfigTransformerModule.providesPopupPositionTransformer(popupPositionTransformer));
    }

    public ITransformer<VideoPopup.Position, PopupPosition> get() {
        return providesPopupPositionTransformer(this.popupPositionTransformerProvider.get());
    }
}
