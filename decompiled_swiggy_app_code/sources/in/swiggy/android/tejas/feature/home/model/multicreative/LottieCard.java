package in.swiggy.android.tejas.feature.home.model.multicreative;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieProperties;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: LottieCard.kt */
public final class LottieCard extends MultiCreativeCard {
    private final AnalyticsData analytics;
    private String entityType;

    /* renamed from: id  reason: collision with root package name */
    private final String f20246id;
    private final boolean isFrequencyCappingEnabled;
    private final String lotteUrl;
    private final RemoteLottieProperties remoteLottieProperties;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LottieCard(String str, String str2, RemoteLottieProperties remoteLottieProperties2, String str3, boolean z11, AnalyticsData analyticsData, int i11, i iVar) {
        this(str, str2, remoteLottieProperties2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? null : analyticsData);
    }

    public final AnalyticsData getAnalytics() {
        return this.analytics;
    }

    public final String getEntityType() {
        return this.entityType;
    }

    public final String getId() {
        return this.f20246id;
    }

    public final String getLotteUrl() {
        return this.lotteUrl;
    }

    public final RemoteLottieProperties getRemoteLottieProperties() {
        return this.remoteLottieProperties;
    }

    public final boolean isFrequencyCappingEnabled() {
        return this.isFrequencyCappingEnabled;
    }

    public final void setEntityType(String str) {
        this.entityType = str;
    }

    public LottieCard(String str, String str2, RemoteLottieProperties remoteLottieProperties2, String str3, boolean z11, AnalyticsData analyticsData) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "lotteUrl");
        p.j(remoteLottieProperties2, "remoteLottieProperties");
        this.f20246id = str;
        this.lotteUrl = str2;
        this.remoteLottieProperties = remoteLottieProperties2;
        this.entityType = str3;
        this.isFrequencyCappingEnabled = z11;
        this.analytics = analyticsData;
    }
}
