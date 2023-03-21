package in.swiggy.android.tejas.feature.home.model.multicreative;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ImageCard.kt */
public final class ImageCard extends MultiCreativeCard {
    private final AnalyticsData analytics;

    /* renamed from: id  reason: collision with root package name */
    private final String f20245id;
    private final String imageUrl;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImageCard(String str, String str2, AnalyticsData analyticsData, int i11, i iVar) {
        this(str, str2, (i11 & 4) != 0 ? null : analyticsData);
    }

    public final AnalyticsData getAnalytics() {
        return this.analytics;
    }

    public final String getId() {
        return this.f20245id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public ImageCard(String str, String str2, AnalyticsData analyticsData) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "imageUrl");
        this.f20245id = str;
        this.imageUrl = str2;
        this.analytics = analyticsData;
    }
}
