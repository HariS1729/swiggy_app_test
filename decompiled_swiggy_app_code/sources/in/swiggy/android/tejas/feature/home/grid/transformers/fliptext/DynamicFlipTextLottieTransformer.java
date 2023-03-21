package in.swiggy.android.tejas.feature.home.grid.transformers.fliptext;

import com.swiggy.gandalf.widgets.v2.Analytics;
import com.swiggy.gandalf.widgets.v2.Cta;
import com.swiggy.gandalf.widgets.v2.LotteCardInfo;
import i20.t;
import in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieItem;
import in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieProperties;
import in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieRepeatMode;
import in.swiggy.android.tejas.feature.home.model.FrequencyCapping;
import in.swiggy.android.tejas.feature.listing.accessibility.models.AccessibilityData;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: DynamicFlipTextLottieTransformer.kt */
public final class DynamicFlipTextLottieTransformer implements ITransformer<LotteCardInfo, RemoteLottieItem> {
    private final ITransformer<Analytics, AnalyticsData> analytics;
    private final ITransformer<Cta, CTA> ctaTransformer;

    public DynamicFlipTextLottieTransformer(ITransformer<Analytics, AnalyticsData> iTransformer, ITransformer<Cta, CTA> iTransformer2) {
        p.j(iTransformer, "analytics");
        p.j(iTransformer2, "ctaTransformer");
        this.analytics = iTransformer;
        this.ctaTransformer = iTransformer2;
    }

    public final ITransformer<Analytics, AnalyticsData> getAnalytics() {
        return this.analytics;
    }

    public final ITransformer<Cta, CTA> getCtaTransformer() {
        return this.ctaTransformer;
    }

    public final RemoteLottieRepeatMode validLottieRepeatMode(LotteCardInfo.LotteRepeatMode lotteRepeatMode) {
        p.j(lotteRepeatMode, "lotteRepeatMode");
        if (p.e(lotteRepeatMode.name(), LotteCardInfo.LotteRepeatMode.LOTTE_REPEAT_MODE_INVALID.name()) || p.e(lotteRepeatMode.name(), LotteCardInfo.LotteRepeatMode.UNRECOGNIZED.name())) {
            return RemoteLottieRepeatMode.valueOf(RemoteLottieRepeatMode.LOTTE_REPEAT_MODE_RESTART.name());
        }
        return RemoteLottieRepeatMode.valueOf(lotteRepeatMode.name());
    }

    public RemoteLottieItem transform(LotteCardInfo lotteCardInfo) {
        LotteCardInfo lotteCardInfo2 = lotteCardInfo;
        p.j(lotteCardInfo2, t.V);
        if (p.e(lotteCardInfo2, LotteCardInfo.getDefaultInstance())) {
            return null;
        }
        RemoteLottieProperties remoteLottieProperties = new RemoteLottieProperties(-1, RemoteLottieRepeatMode.valueOf(RemoteLottieRepeatMode.LOTTE_REPEAT_MODE_RESTART.name()));
        if (!p.e(lotteCardInfo.getLotteStyle(), LotteCardInfo.LotteStyle.getDefaultInstance())) {
            int repeatCount = (int) lotteCardInfo.getLotteStyle().getRepeatCount();
            if (repeatCount > 0) {
                repeatCount--;
            }
            LotteCardInfo.LotteRepeatMode repeatMode = lotteCardInfo.getLotteStyle().getRepeatMode();
            p.i(repeatMode, "t.lotteStyle.repeatMode");
            remoteLottieProperties = new RemoteLottieProperties(repeatCount, validLottieRepeatMode(repeatMode));
        }
        String id2 = lotteCardInfo.getId();
        p.i(id2, "t.id");
        String lotteUrl = lotteCardInfo.getLotteUrl();
        p.i(lotteUrl, "t.lotteUrl");
        return new RemoteLottieItem(id2, lotteUrl, remoteLottieProperties, (CTA) null, (AnalyticsData) null, (String) null, false, (String) null, (AccessibilityData) null, (FrequencyCapping) null, 1016, (i) null);
    }
}
