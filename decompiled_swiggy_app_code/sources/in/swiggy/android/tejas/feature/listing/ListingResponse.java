package in.swiggy.android.tejas.feature.listing;

import in.swiggy.android.tejas.feature.home.model.PaginationResponse;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeConfig;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: ListingResponse.kt */
public final class ListingResponse {
    private final Integer cacheExpiryTime;
    private final boolean firstOffsetRequest;
    private final List<HomeConfig> homeConfigList;
    private final boolean isSwiggyNotPresent;
    private final PaginationResponse paginationResponse;
    private final String requestId;
    private final List<ListingCardEntity<?>> results;
    private final Long serverTimestamp;

    public ListingResponse(List<? extends ListingCardEntity<?>> list, PaginationResponse paginationResponse2, List<? extends HomeConfig> list2, Integer num, String str, Long l11, boolean z11, boolean z12) {
        p.j(list, "results");
        this.results = list;
        this.paginationResponse = paginationResponse2;
        this.homeConfigList = list2;
        this.cacheExpiryTime = num;
        this.requestId = str;
        this.serverTimestamp = l11;
        this.firstOffsetRequest = z11;
        this.isSwiggyNotPresent = z12;
    }

    public final Integer getCacheExpiryTime() {
        return this.cacheExpiryTime;
    }

    public final boolean getFirstOffsetRequest() {
        return this.firstOffsetRequest;
    }

    public final List<HomeConfig> getHomeConfigList() {
        return this.homeConfigList;
    }

    public final PaginationResponse getPaginationResponse() {
        return this.paginationResponse;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final List<ListingCardEntity<?>> getResults() {
        return this.results;
    }

    public final Long getServerTimestamp() {
        return this.serverTimestamp;
    }

    public final boolean isSwiggyNotPresent() {
        return this.isSwiggyNotPresent;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ListingResponse(java.util.List r13, in.swiggy.android.tejas.feature.home.model.PaginationResponse r14, java.util.List r15, java.lang.Integer r16, java.lang.String r17, java.lang.Long r18, boolean r19, boolean r20, int r21, kotlin.jvm.internal.i r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r5 = r2
            goto L_0x000a
        L_0x0009:
            r5 = r14
        L_0x000a:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0010
            r6 = r2
            goto L_0x0011
        L_0x0010:
            r6 = r15
        L_0x0011:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0017
            r8 = r2
            goto L_0x0019
        L_0x0017:
            r8 = r17
        L_0x0019:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x001f
            r9 = r2
            goto L_0x0021
        L_0x001f:
            r9 = r18
        L_0x0021:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0028
            r0 = 0
            r11 = 0
            goto L_0x002a
        L_0x0028:
            r11 = r20
        L_0x002a:
            r3 = r12
            r4 = r13
            r7 = r16
            r10 = r19
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.listing.ListingResponse.<init>(java.util.List, in.swiggy.android.tejas.feature.home.model.PaginationResponse, java.util.List, java.lang.Integer, java.lang.String, java.lang.Long, boolean, boolean, int, kotlin.jvm.internal.i):void");
    }
}
