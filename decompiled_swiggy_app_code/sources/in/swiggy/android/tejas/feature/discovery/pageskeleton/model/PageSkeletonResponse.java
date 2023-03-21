package in.swiggy.android.tejas.feature.discovery.pageskeleton.model;

import in.swiggy.android.tejas.feature.listing.ListingCardEntity;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: PageSkeletonResponse.kt */
public final class PageSkeletonResponse {
    private final boolean enableFoodPrefetch;
    private final List<ListingCardEntity<?>> results;
    private final UxVersion uxVersion;

    public PageSkeletonResponse(List<? extends ListingCardEntity<?>> list, UxVersion uxVersion2, boolean z11) {
        p.j(uxVersion2, "uxVersion");
        this.results = list;
        this.uxVersion = uxVersion2;
        this.enableFoodPrefetch = z11;
    }

    public static /* synthetic */ PageSkeletonResponse copy$default(PageSkeletonResponse pageSkeletonResponse, List<ListingCardEntity<?>> list, UxVersion uxVersion2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = pageSkeletonResponse.results;
        }
        if ((i11 & 2) != 0) {
            uxVersion2 = pageSkeletonResponse.uxVersion;
        }
        if ((i11 & 4) != 0) {
            z11 = pageSkeletonResponse.enableFoodPrefetch;
        }
        return pageSkeletonResponse.copy(list, uxVersion2, z11);
    }

    public final List<ListingCardEntity<?>> component1() {
        return this.results;
    }

    public final UxVersion component2() {
        return this.uxVersion;
    }

    public final boolean component3() {
        return this.enableFoodPrefetch;
    }

    public final PageSkeletonResponse copy(List<? extends ListingCardEntity<?>> list, UxVersion uxVersion2, boolean z11) {
        p.j(uxVersion2, "uxVersion");
        return new PageSkeletonResponse(list, uxVersion2, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageSkeletonResponse)) {
            return false;
        }
        PageSkeletonResponse pageSkeletonResponse = (PageSkeletonResponse) obj;
        return p.e(this.results, pageSkeletonResponse.results) && this.uxVersion == pageSkeletonResponse.uxVersion && this.enableFoodPrefetch == pageSkeletonResponse.enableFoodPrefetch;
    }

    public final boolean getEnableFoodPrefetch() {
        return this.enableFoodPrefetch;
    }

    public final List<ListingCardEntity<?>> getResults() {
        return this.results;
    }

    public final UxVersion getUxVersion() {
        return this.uxVersion;
    }

    public int hashCode() {
        List<ListingCardEntity<?>> list = this.results;
        int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.uxVersion.hashCode()) * 31;
        boolean z11 = this.enableFoodPrefetch;
        if (z11) {
            z11 = true;
        }
        return hashCode + (z11 ? 1 : 0);
    }

    public String toString() {
        return "PageSkeletonResponse(results=" + this.results + ", uxVersion=" + this.uxVersion + ", enableFoodPrefetch=" + this.enableFoodPrefetch + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PageSkeletonResponse(List list, UxVersion uxVersion2, boolean z11, int i11, i iVar) {
        this(list, uxVersion2, (i11 & 4) != 0 ? false : z11);
    }
}
