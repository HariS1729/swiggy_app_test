package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.swiggy.gandalf.widgets.v2.Analytics;
import com.swiggy.gandalf.widgets.v2.LotteInfoLayoutCard;
import i20.t;
import in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieProperties;
import in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieRepeatMode;
import in.swiggy.android.tejas.feature.home.model.multicreative.LottieCard;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: LottieCardTransformer.kt */
public final class LottieCardTransformer implements ITransformer<LotteInfoLayoutCard.LotteCardInfo, LottieCard> {
    private final ITransformer<Analytics, AnalyticsData> analyticsTransformer;

    public LottieCardTransformer(ITransformer<Analytics, AnalyticsData> iTransformer) {
        p.j(iTransformer, "analyticsTransformer");
        this.analyticsTransformer = iTransformer;
    }

    public final RemoteLottieRepeatMode validLottieRepeatMode(LotteInfoLayoutCard.LotteRepeatMode lotteRepeatMode) {
        p.j(lotteRepeatMode, "lotteRepeatMode");
        if (p.e(lotteRepeatMode.name(), LotteInfoLayoutCard.LotteRepeatMode.LOTTE_REPEAT_MODE_INVALID.name()) || p.e(lotteRepeatMode.name(), LotteInfoLayoutCard.LotteRepeatMode.UNRECOGNIZED.name())) {
            return RemoteLottieRepeatMode.valueOf(RemoteLottieRepeatMode.LOTTE_REPEAT_MODE_RESTART.name());
        }
        return RemoteLottieRepeatMode.valueOf(lotteRepeatMode.name());
    }

    public LottieCard transform(LotteInfoLayoutCard.LotteCardInfo lotteCardInfo) {
        p.j(lotteCardInfo, t.V);
        if (p.e(lotteCardInfo, LotteInfoLayoutCard.LotteCardInfo.getDefaultInstance())) {
            return null;
        }
        RemoteLottieProperties remoteLottieProperties = new RemoteLottieProperties(-1, RemoteLottieRepeatMode.valueOf(RemoteLottieRepeatMode.LOTTE_REPEAT_MODE_RESTART.name()));
        if (!p.e(lotteCardInfo.getLotteStyle(), LotteInfoLayoutCard.LotteStyle.getDefaultInstance())) {
            int repeatCount = (int) lotteCardInfo.getLotteStyle().getRepeatCount();
            if (repeatCount > 0) {
                repeatCount--;
            }
            LotteInfoLayoutCard.LotteRepeatMode repeatMode = lotteCardInfo.getLotteStyle().getRepeatMode();
            p.i(repeatMode, "t.lotteStyle.repeatMode");
            remoteLottieProperties = new RemoteLottieProperties(repeatCount, validLottieRepeatMode(repeatMode));
        }
        String id2 = lotteCardInfo.getId();
        p.i(id2, "t.id");
        String lotteUrl = lotteCardInfo.getLotteUrl();
        p.i(lotteUrl, "t.lotteUrl");
        String entityType = lotteCardInfo.getEntityType();
        boolean isFrequencyCappingEnabled = lotteCardInfo.getIsFrequencyCappingEnabled();
        ITransformer<Analytics, AnalyticsData> iTransformer = this.analyticsTransformer;
        Analytics analytics = lotteCardInfo.getAnalytics();
        p.i(analytics, "t.analytics");
        return new LottieCard(id2, lotteUrl, remoteLottieProperties, entityType, isFrequencyCappingEnabled, iTransformer.transform(analytics));
    }
}
