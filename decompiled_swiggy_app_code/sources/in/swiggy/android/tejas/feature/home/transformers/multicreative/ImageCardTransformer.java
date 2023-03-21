package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.swiggy.gandalf.widgets.v2.Analytics;
import com.swiggy.gandalf.widgets.v2.ImageInfoLayoutCard;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.multicreative.ImageCard;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: ImageCardTransformer.kt */
public final class ImageCardTransformer implements ITransformer<ImageInfoLayoutCard.ImageCardInfo, ImageCard> {
    private final ITransformer<Analytics, AnalyticsData> analyticsTransformer;

    public ImageCardTransformer(ITransformer<Analytics, AnalyticsData> iTransformer) {
        p.j(iTransformer, "analyticsTransformer");
        this.analyticsTransformer = iTransformer;
    }

    public ImageCard transform(ImageInfoLayoutCard.ImageCardInfo imageCardInfo) {
        p.j(imageCardInfo, t.V);
        String id2 = imageCardInfo.getId();
        p.i(id2, "t.id");
        String imageId = imageCardInfo.getImageId();
        p.i(imageId, "t.imageId");
        ITransformer<Analytics, AnalyticsData> iTransformer = this.analyticsTransformer;
        Analytics analytics = imageCardInfo.getAnalytics();
        p.i(analytics, "t.analytics");
        return new ImageCard(id2, imageId, iTransformer.transform(analytics));
    }
}
