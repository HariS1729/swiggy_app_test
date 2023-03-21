package in.swiggy.android.tejas.feature.home.model.multicreative;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import kotlin.jvm.internal.p;

/* compiled from: VideoCard.kt */
public final class VideoCard extends MultiCreativeCard {
    private final AnalyticsData analytics;
    private final boolean autoPlay;
    private final String entityType;

    /* renamed from: id  reason: collision with root package name */
    private final String f20247id;
    private final boolean mute;
    private final boolean showVideoMuteButton;
    private final String thumbnail;
    private final String videoId;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ VideoCard(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, boolean r17, boolean r18, boolean r19, in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData r20, int r21, kotlin.jvm.internal.i r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r16
        L_0x000b:
            r1 = r0 & 16
            r3 = 0
            if (r1 == 0) goto L_0x0012
            r8 = 0
            goto L_0x0014
        L_0x0012:
            r8 = r17
        L_0x0014:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x001b
            r1 = 1
            r9 = 1
            goto L_0x001d
        L_0x001b:
            r9 = r18
        L_0x001d:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0023
            r10 = 0
            goto L_0x0025
        L_0x0023:
            r10 = r19
        L_0x0025:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x002b
            r11 = r2
            goto L_0x002d
        L_0x002b:
            r11 = r20
        L_0x002d:
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.home.model.multicreative.VideoCard.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData, int, kotlin.jvm.internal.i):void");
    }

    public final AnalyticsData getAnalytics() {
        return this.analytics;
    }

    public final boolean getAutoPlay() {
        return this.autoPlay;
    }

    public final String getEntityType() {
        return this.entityType;
    }

    public final String getId() {
        return this.f20247id;
    }

    public final boolean getMute() {
        return this.mute;
    }

    public final boolean getShowVideoMuteButton() {
        return this.showVideoMuteButton;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public VideoCard(String str, String str2, String str3, String str4, boolean z11, boolean z12, boolean z13, AnalyticsData analyticsData) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "thumbnail");
        p.j(str3, "videoId");
        this.f20247id = str;
        this.thumbnail = str2;
        this.videoId = str3;
        this.entityType = str4;
        this.autoPlay = z11;
        this.mute = z12;
        this.showVideoMuteButton = z13;
        this.analytics = analyticsData;
    }
}
