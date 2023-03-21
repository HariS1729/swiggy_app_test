package in.swiggy.android.tejas.feature.home.grid.transformers.remotelottie;

import com.swiggy.gandalf.widgets.v2.Analytics;
import com.swiggy.gandalf.widgets.v2.Cta;
import com.swiggy.gandalf.widgets.v2.FrequencyCapping;
import com.swiggy.gandalf.widgets.v2.ImageInfoLayoutCard;
import com.swiggy.gandalf.widgets.v2.LotteInfoLayoutCard;
import i20.t;
import in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieEntity;
import in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieItem;
import in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieProperties;
import in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieRepeatMode;
import in.swiggy.android.tejas.feature.listing.accessibility.models.AccessibilityData;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: RemoteLottieItemTransformer.kt */
public final class RemoteLottieItemTransformer implements ITransformer<LotteInfoLayoutCard.LotteCardInfo, RemoteLottieEntity> {
    private final ITransformer<ImageInfoLayoutCard.Accessibility, AccessibilityData> accessibilityTransformer;
    private final ITransformer<Analytics, AnalyticsData> analytics;
    private final ITransformer<Cta, CTA> ctaTransformer;
    private final ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping> frequencyCappingTransformer;

    public RemoteLottieItemTransformer(ITransformer<Analytics, AnalyticsData> iTransformer, ITransformer<Cta, CTA> iTransformer2, ITransformer<ImageInfoLayoutCard.Accessibility, AccessibilityData> iTransformer3, ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping> iTransformer4) {
        p.j(iTransformer, "analytics");
        p.j(iTransformer2, "ctaTransformer");
        p.j(iTransformer3, "accessibilityTransformer");
        p.j(iTransformer4, "frequencyCappingTransformer");
        this.analytics = iTransformer;
        this.ctaTransformer = iTransformer2;
        this.accessibilityTransformer = iTransformer3;
        this.frequencyCappingTransformer = iTransformer4;
    }

    public final ITransformer<ImageInfoLayoutCard.Accessibility, AccessibilityData> getAccessibilityTransformer() {
        return this.accessibilityTransformer;
    }

    public final ITransformer<Analytics, AnalyticsData> getAnalytics() {
        return this.analytics;
    }

    public final ITransformer<Cta, CTA> getCtaTransformer() {
        return this.ctaTransformer;
    }

    public final ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping> getFrequencyCappingTransformer() {
        return this.frequencyCappingTransformer;
    }

    public final RemoteLottieRepeatMode validLottieRepeatMode(LotteInfoLayoutCard.LotteRepeatMode lotteRepeatMode) {
        p.j(lotteRepeatMode, "lotteRepeatMode");
        if (p.e(lotteRepeatMode.name(), LotteInfoLayoutCard.LotteRepeatMode.LOTTE_REPEAT_MODE_INVALID.name()) || p.e(lotteRepeatMode.name(), LotteInfoLayoutCard.LotteRepeatMode.UNRECOGNIZED.name())) {
            return RemoteLottieRepeatMode.valueOf(RemoteLottieRepeatMode.LOTTE_REPEAT_MODE_RESTART.name());
        }
        return RemoteLottieRepeatMode.valueOf(lotteRepeatMode.name());
    }

    public RemoteLottieEntity transform(LotteInfoLayoutCard.LotteCardInfo lotteCardInfo) {
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
        RemoteLottieProperties remoteLottieProperties2 = remoteLottieProperties;
        ITransformer<Analytics, AnalyticsData> iTransformer = this.analytics;
        Analytics analytics2 = lotteCardInfo.getAnalytics();
        p.i(analytics2, "t.analytics");
        ITransformer<Cta, CTA> iTransformer2 = this.ctaTransformer;
        Cta action = lotteCardInfo.getAction();
        p.i(action, "t.action");
        CTA transform = iTransformer2.transform(action);
        ITransformer<ImageInfoLayoutCard.Accessibility, AccessibilityData> iTransformer3 = this.accessibilityTransformer;
        ImageInfoLayoutCard.Accessibility accessibility = lotteCardInfo.getAccessibility();
        p.i(accessibility, "t.accessibility");
        String id2 = lotteCardInfo.getId();
        p.i(id2, "t.id");
        String lotteUrl = lotteCardInfo.getLotteUrl();
        p.i(lotteUrl, "t.lotteUrl");
        String entityType = lotteCardInfo.getEntityType();
        boolean isFrequencyCappingEnabled = lotteCardInfo.getIsFrequencyCappingEnabled();
        String thumbnail = lotteCardInfo.getThumbnail();
        ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping> iTransformer4 = this.frequencyCappingTransformer;
        FrequencyCapping frequencyCapping = lotteCardInfo.getFrequencyCapping();
        p.i(frequencyCapping, "t.frequencyCapping");
        return new RemoteLottieEntity(new RemoteLottieItem(id2, lotteUrl, remoteLottieProperties2, transform, iTransformer.transform(analytics2), entityType, isFrequencyCappingEnabled, thumbnail, iTransformer3.transform(accessibility), iTransformer4.transform(frequencyCapping)));
    }
}
