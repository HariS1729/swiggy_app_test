package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.swiggy.gandalf.widgets.v2.Analytics;
import com.swiggy.gandalf.widgets.v2.VideoCardInfo;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.multicreative.VideoCard;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: VideoCardTransformer.kt */
public final class VideoCardTransformer implements ITransformer<VideoCardInfo, VideoCard> {
    private final ITransformer<Analytics, AnalyticsData> analyticsTransformer;

    public VideoCardTransformer(ITransformer<Analytics, AnalyticsData> iTransformer) {
        p.j(iTransformer, "analyticsTransformer");
        this.analyticsTransformer = iTransformer;
    }

    public VideoCard transform(VideoCardInfo videoCardInfo) {
        p.j(videoCardInfo, t.V);
        String id2 = videoCardInfo.getId();
        p.i(id2, "t.id");
        String thumbnail = videoCardInfo.getThumbnail();
        p.i(thumbnail, "t.thumbnail");
        String videoId = videoCardInfo.getVideoId();
        p.i(videoId, "t.videoId");
        String entityType = videoCardInfo.getEntityType();
        boolean autoPlay = videoCardInfo.getAutoPlay();
        boolean mute = videoCardInfo.getMute();
        boolean showVideoMuteButton = videoCardInfo.getShowVideoMuteButton();
        ITransformer<Analytics, AnalyticsData> iTransformer = this.analyticsTransformer;
        Analytics analytics = videoCardInfo.getAnalytics();
        p.i(analytics, "t.analytics");
        return new VideoCard(id2, thumbnail, videoId, entityType, autoPlay, mute, showVideoMuteButton, iTransformer.transform(analytics));
    }
}
