package in.swiggy.android.tejas.feature.home.model;

import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeConfig;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: HomeResponse.kt */
public final class HomeResponse {
    private final Integer cacheExpiryTime;
    private final List<ListingCard> cards;
    private final boolean fallbackToListing;
    private final boolean firstOffsetRequest;
    private final List<HomeConfig> homeConfigList;
    private final PaginationResponse paginationResponse;
    private final String requestId;
    private final RibbonConfig ribbonConfig;

    public HomeResponse(Integer num, boolean z11, PaginationResponse paginationResponse2, RibbonConfig ribbonConfig2, List<? extends ListingCard> list, boolean z12, List<? extends HomeConfig> list2, String str) {
        p.j(paginationResponse2, "paginationResponse");
        p.j(ribbonConfig2, "ribbonConfig");
        p.j(list, "cards");
        p.j(list2, "homeConfigList");
        p.j(str, "requestId");
        this.cacheExpiryTime = num;
        this.firstOffsetRequest = z11;
        this.paginationResponse = paginationResponse2;
        this.ribbonConfig = ribbonConfig2;
        this.cards = list;
        this.fallbackToListing = z12;
        this.homeConfigList = list2;
        this.requestId = str;
    }

    public static /* synthetic */ HomeResponse copy$default(HomeResponse homeResponse, Integer num, boolean z11, PaginationResponse paginationResponse2, RibbonConfig ribbonConfig2, List list, boolean z12, List list2, String str, int i11, Object obj) {
        HomeResponse homeResponse2 = homeResponse;
        int i12 = i11;
        return homeResponse.copy((i12 & 1) != 0 ? homeResponse2.cacheExpiryTime : num, (i12 & 2) != 0 ? homeResponse2.firstOffsetRequest : z11, (i12 & 4) != 0 ? homeResponse2.paginationResponse : paginationResponse2, (i12 & 8) != 0 ? homeResponse2.ribbonConfig : ribbonConfig2, (i12 & 16) != 0 ? homeResponse2.cards : list, (i12 & 32) != 0 ? homeResponse2.fallbackToListing : z12, (i12 & 64) != 0 ? homeResponse2.homeConfigList : list2, (i12 & 128) != 0 ? homeResponse2.requestId : str);
    }

    public final Integer component1() {
        return this.cacheExpiryTime;
    }

    public final boolean component2() {
        return this.firstOffsetRequest;
    }

    public final PaginationResponse component3() {
        return this.paginationResponse;
    }

    public final RibbonConfig component4() {
        return this.ribbonConfig;
    }

    public final List<ListingCard> component5() {
        return this.cards;
    }

    public final boolean component6() {
        return this.fallbackToListing;
    }

    public final List<HomeConfig> component7() {
        return this.homeConfigList;
    }

    public final String component8() {
        return this.requestId;
    }

    public final HomeResponse copy(Integer num, boolean z11, PaginationResponse paginationResponse2, RibbonConfig ribbonConfig2, List<? extends ListingCard> list, boolean z12, List<? extends HomeConfig> list2, String str) {
        p.j(paginationResponse2, "paginationResponse");
        p.j(ribbonConfig2, "ribbonConfig");
        p.j(list, "cards");
        List<? extends HomeConfig> list3 = list2;
        p.j(list3, "homeConfigList");
        String str2 = str;
        p.j(str2, "requestId");
        return new HomeResponse(num, z11, paginationResponse2, ribbonConfig2, list, z12, list3, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeResponse)) {
            return false;
        }
        HomeResponse homeResponse = (HomeResponse) obj;
        return p.e(this.cacheExpiryTime, homeResponse.cacheExpiryTime) && this.firstOffsetRequest == homeResponse.firstOffsetRequest && p.e(this.paginationResponse, homeResponse.paginationResponse) && p.e(this.ribbonConfig, homeResponse.ribbonConfig) && p.e(this.cards, homeResponse.cards) && this.fallbackToListing == homeResponse.fallbackToListing && p.e(this.homeConfigList, homeResponse.homeConfigList) && p.e(this.requestId, homeResponse.requestId);
    }

    public final Integer getCacheExpiryTime() {
        return this.cacheExpiryTime;
    }

    public final List<ListingCard> getCards() {
        return this.cards;
    }

    public final boolean getFallbackToListing() {
        return this.fallbackToListing;
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

    public final RibbonConfig getRibbonConfig() {
        return this.ribbonConfig;
    }

    public int hashCode() {
        Integer num = this.cacheExpiryTime;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        boolean z11 = this.firstOffsetRequest;
        boolean z12 = true;
        if (z11) {
            z11 = true;
        }
        int hashCode2 = (((((((hashCode + (z11 ? 1 : 0)) * 31) + this.paginationResponse.hashCode()) * 31) + this.ribbonConfig.hashCode()) * 31) + this.cards.hashCode()) * 31;
        boolean z13 = this.fallbackToListing;
        if (!z13) {
            z12 = z13;
        }
        return ((((hashCode2 + (z12 ? 1 : 0)) * 31) + this.homeConfigList.hashCode()) * 31) + this.requestId.hashCode();
    }

    public String toString() {
        return "HomeResponse(cacheExpiryTime=" + this.cacheExpiryTime + ", firstOffsetRequest=" + this.firstOffsetRequest + ", paginationResponse=" + this.paginationResponse + ", ribbonConfig=" + this.ribbonConfig + ", cards=" + this.cards + ", fallbackToListing=" + this.fallbackToListing + ", homeConfigList=" + this.homeConfigList + ", requestId=" + this.requestId + ')';
    }
}
