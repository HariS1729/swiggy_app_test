package in.swiggy.android.tejas.feature.home.transformers.config.video;

import com.swiggy.gandalf.widgets.v2.VideoPopup;
import com.swiggy.gandalf.widgets.v2.Videos;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeVideoPopup;
import in.swiggy.android.tejas.feature.home.model.pageconfig.PopupPosition;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: VideoPopupConfigTransformer.kt */
public final class VideoPopupConfigTransformer implements ITransformer<VideoPopup, HomeVideoPopup> {
    private final ITransformer<VideoPopup.Position, PopupPosition> positionTransformer;
    private final ITransformer<Videos, HomeVideoPopup.Videos> videosTransformer;

    public VideoPopupConfigTransformer(ITransformer<VideoPopup.Position, PopupPosition> iTransformer, ITransformer<Videos, HomeVideoPopup.Videos> iTransformer2) {
        p.j(iTransformer, "positionTransformer");
        p.j(iTransformer2, "videosTransformer");
        this.positionTransformer = iTransformer;
        this.videosTransformer = iTransformer2;
    }

    public HomeVideoPopup transform(VideoPopup videoPopup) {
        p.j(videoPopup, t.V);
        ITransformer<VideoPopup.Position, PopupPosition> iTransformer = this.positionTransformer;
        VideoPopup.Position position = videoPopup.getPosition();
        p.i(position, "t.position");
        PopupPosition transform = iTransformer.transform(position);
        if (transform == null) {
            transform = PopupPosition.BOTTOM_LEFT;
        }
        ArrayList arrayList = new ArrayList();
        List<Videos> videosList = videoPopup.getVideosList();
        p.i(videosList, "t.videosList");
        for (Videos videos : videosList) {
            ITransformer<Videos, HomeVideoPopup.Videos> iTransformer2 = this.videosTransformer;
            p.i(videos, "video");
            HomeVideoPopup.Videos transform2 = iTransformer2.transform(videos);
            if (transform2 != null) {
                arrayList.add(transform2);
            }
        }
        return new HomeVideoPopup(transform, arrayList);
    }
}
