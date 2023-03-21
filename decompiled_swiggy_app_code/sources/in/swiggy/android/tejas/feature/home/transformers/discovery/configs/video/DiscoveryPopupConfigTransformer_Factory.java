package in.swiggy.android.tejas.feature.home.transformers.discovery.configs.video;

import com.swiggy.gandalf.widgets.v2.VideoPopup;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeVideoPopup;
import in.swiggy.android.tejas.feature.home.transformers.config.dynamicpopup.PopUpWidgetTransformer;
import in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup.BottomBarPopupTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class DiscoveryPopupConfigTransformer_Factory implements e<DiscoveryPopupConfigTransformer> {
    private final Provider<BottomBarPopupTransformer> bottomBarPopupTransformerProvider;
    private final Provider<PopUpWidgetTransformer> popUpWidgetTransformerProvider;
    private final Provider<ITransformer<VideoPopup, HomeVideoPopup>> videoTransformerProvider;

    public DiscoveryPopupConfigTransformer_Factory(Provider<ITransformer<VideoPopup, HomeVideoPopup>> provider, Provider<PopUpWidgetTransformer> provider2, Provider<BottomBarPopupTransformer> provider3) {
        this.videoTransformerProvider = provider;
        this.popUpWidgetTransformerProvider = provider2;
        this.bottomBarPopupTransformerProvider = provider3;
    }

    public static DiscoveryPopupConfigTransformer_Factory create(Provider<ITransformer<VideoPopup, HomeVideoPopup>> provider, Provider<PopUpWidgetTransformer> provider2, Provider<BottomBarPopupTransformer> provider3) {
        return new DiscoveryPopupConfigTransformer_Factory(provider, provider2, provider3);
    }

    public static DiscoveryPopupConfigTransformer newInstance(ITransformer<VideoPopup, HomeVideoPopup> iTransformer, PopUpWidgetTransformer popUpWidgetTransformer, BottomBarPopupTransformer bottomBarPopupTransformer) {
        return new DiscoveryPopupConfigTransformer(iTransformer, popUpWidgetTransformer, bottomBarPopupTransformer);
    }

    public DiscoveryPopupConfigTransformer get() {
        return newInstance(this.videoTransformerProvider.get(), this.popUpWidgetTransformerProvider.get(), this.bottomBarPopupTransformerProvider.get());
    }
}
