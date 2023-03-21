package in.swiggy.android.tejas.feature.home.transformers.config.video;

import com.swiggy.gandalf.widgets.v2.VideoPopup;
import com.swiggy.gandalf.widgets.v2.Videos;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeVideoPopup;
import in.swiggy.android.tejas.feature.home.model.pageconfig.PopupPosition;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class VideoPopupConfigTransformer_Factory implements e<VideoPopupConfigTransformer> {
    private final Provider<ITransformer<VideoPopup.Position, PopupPosition>> positionTransformerProvider;
    private final Provider<ITransformer<Videos, HomeVideoPopup.Videos>> videosTransformerProvider;

    public VideoPopupConfigTransformer_Factory(Provider<ITransformer<VideoPopup.Position, PopupPosition>> provider, Provider<ITransformer<Videos, HomeVideoPopup.Videos>> provider2) {
        this.positionTransformerProvider = provider;
        this.videosTransformerProvider = provider2;
    }

    public static VideoPopupConfigTransformer_Factory create(Provider<ITransformer<VideoPopup.Position, PopupPosition>> provider, Provider<ITransformer<Videos, HomeVideoPopup.Videos>> provider2) {
        return new VideoPopupConfigTransformer_Factory(provider, provider2);
    }

    public static VideoPopupConfigTransformer newInstance(ITransformer<VideoPopup.Position, PopupPosition> iTransformer, ITransformer<Videos, HomeVideoPopup.Videos> iTransformer2) {
        return new VideoPopupConfigTransformer(iTransformer, iTransformer2);
    }

    public VideoPopupConfigTransformer get() {
        return newInstance(this.positionTransformerProvider.get(), this.videosTransformerProvider.get());
    }
}
