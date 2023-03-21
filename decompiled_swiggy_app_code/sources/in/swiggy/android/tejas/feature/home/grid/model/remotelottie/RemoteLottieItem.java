package in.swiggy.android.tejas.feature.home.grid.model.remotelottie;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import in.swiggy.android.tejas.feature.home.model.FrequencyCapping;
import in.swiggy.android.tejas.feature.listing.accessibility.models.AccessibilityData;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import kotlin.jvm.internal.p;

/* compiled from: RemoteLottieItem.kt */
public final class RemoteLottieItem {
    private final AccessibilityData accessibility;
    private final AnalyticsData analytics;
    private final CTA ctaAction;
    private String entityType;
    private final FrequencyCapping frequencyCapping;

    /* renamed from: id  reason: collision with root package name */
    private final String f20232id;
    private final boolean isFrequencyCappingEnabled;
    private final String lotteUrl;
    private final RemoteLottieProperties remoteLottieProperties;
    private final String thumbnail;

    public RemoteLottieItem(String str, String str2, RemoteLottieProperties remoteLottieProperties2, CTA cta, AnalyticsData analyticsData, String str3, boolean z11, String str4, AccessibilityData accessibilityData, FrequencyCapping frequencyCapping2) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "lotteUrl");
        p.j(remoteLottieProperties2, "remoteLottieProperties");
        this.f20232id = str;
        this.lotteUrl = str2;
        this.remoteLottieProperties = remoteLottieProperties2;
        this.ctaAction = cta;
        this.analytics = analyticsData;
        this.entityType = str3;
        this.isFrequencyCappingEnabled = z11;
        this.thumbnail = str4;
        this.accessibility = accessibilityData;
        this.frequencyCapping = frequencyCapping2;
    }

    public final AccessibilityData getAccessibility() {
        return this.accessibility;
    }

    public final AnalyticsData getAnalytics() {
        return this.analytics;
    }

    public final CTA getCtaAction() {
        return this.ctaAction;
    }

    public final String getEntityType() {
        return this.entityType;
    }

    public final FrequencyCapping getFrequencyCapping() {
        return this.frequencyCapping;
    }

    public final String getId() {
        return this.f20232id;
    }

    public final String getLotteUrl() {
        return this.lotteUrl;
    }

    public final RemoteLottieProperties getRemoteLottieProperties() {
        return this.remoteLottieProperties;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final boolean isFrequencyCappingEnabled() {
        return this.isFrequencyCappingEnabled;
    }

    public final void setEntityType(String str) {
        this.entityType = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RemoteLottieItem(java.lang.String r15, java.lang.String r16, in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieProperties r17, in.swiggy.android.tejas.feature.listing.cta.model.CTA r18, in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData r19, java.lang.String r20, boolean r21, java.lang.String r22, in.swiggy.android.tejas.feature.listing.accessibility.models.AccessibilityData r23, in.swiggy.android.tejas.feature.home.model.FrequencyCapping r24, int r25, kotlin.jvm.internal.i r26) {
        /*
            r14 = this;
            r0 = r25
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r18
        L_0x000b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0011
            r8 = r2
            goto L_0x0013
        L_0x0011:
            r8 = r19
        L_0x0013:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0019
            r9 = r2
            goto L_0x001b
        L_0x0019:
            r9 = r20
        L_0x001b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0022
            r1 = 0
            r10 = 0
            goto L_0x0024
        L_0x0022:
            r10 = r21
        L_0x0024:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x002a
            r11 = r2
            goto L_0x002c
        L_0x002a:
            r11 = r22
        L_0x002c:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0032
            r12 = r2
            goto L_0x0034
        L_0x0032:
            r12 = r23
        L_0x0034:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x003a
            r13 = r2
            goto L_0x003c
        L_0x003a:
            r13 = r24
        L_0x003c:
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieItem.<init>(java.lang.String, java.lang.String, in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieProperties, in.swiggy.android.tejas.feature.listing.cta.model.CTA, in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData, java.lang.String, boolean, java.lang.String, in.swiggy.android.tejas.feature.listing.accessibility.models.AccessibilityData, in.swiggy.android.tejas.feature.home.model.FrequencyCapping, int, kotlin.jvm.internal.i):void");
    }
}
