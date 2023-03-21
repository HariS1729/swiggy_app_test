package in.swiggy.android.tejas.feature.home.model;

import in.swiggy.android.tejas.feature.listing.pagination.model.PageOffset;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: PaginationResponse.kt */
public final class PaginationResponse {
    private final boolean isNextPageAvailable;
    private final String nextPageId;
    private final PageOffset pageOffset;
    private final int paginationPosition;

    public PaginationResponse(boolean z11, String str, int i11, PageOffset pageOffset2) {
        this.isNextPageAvailable = z11;
        this.nextPageId = str;
        this.paginationPosition = i11;
        this.pageOffset = pageOffset2;
    }

    public static /* synthetic */ PaginationResponse copy$default(PaginationResponse paginationResponse, boolean z11, String str, int i11, PageOffset pageOffset2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = paginationResponse.isNextPageAvailable;
        }
        if ((i12 & 2) != 0) {
            str = paginationResponse.nextPageId;
        }
        if ((i12 & 4) != 0) {
            i11 = paginationResponse.paginationPosition;
        }
        if ((i12 & 8) != 0) {
            pageOffset2 = paginationResponse.pageOffset;
        }
        return paginationResponse.copy(z11, str, i11, pageOffset2);
    }

    public final boolean component1() {
        return this.isNextPageAvailable;
    }

    public final String component2() {
        return this.nextPageId;
    }

    public final int component3() {
        return this.paginationPosition;
    }

    public final PageOffset component4() {
        return this.pageOffset;
    }

    public final PaginationResponse copy(boolean z11, String str, int i11, PageOffset pageOffset2) {
        return new PaginationResponse(z11, str, i11, pageOffset2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaginationResponse)) {
            return false;
        }
        PaginationResponse paginationResponse = (PaginationResponse) obj;
        return this.isNextPageAvailable == paginationResponse.isNextPageAvailable && p.e(this.nextPageId, paginationResponse.nextPageId) && this.paginationPosition == paginationResponse.paginationPosition && p.e(this.pageOffset, paginationResponse.pageOffset);
    }

    public final String getNextPageId() {
        return this.nextPageId;
    }

    public final PageOffset getPageOffset() {
        return this.pageOffset;
    }

    public final int getPaginationPosition() {
        return this.paginationPosition;
    }

    public int hashCode() {
        boolean z11 = this.isNextPageAvailable;
        if (z11) {
            z11 = true;
        }
        int i11 = (z11 ? 1 : 0) * true;
        String str = this.nextPageId;
        int i12 = 0;
        int hashCode = (((i11 + (str == null ? 0 : str.hashCode())) * 31) + this.paginationPosition) * 31;
        PageOffset pageOffset2 = this.pageOffset;
        if (pageOffset2 != null) {
            i12 = pageOffset2.hashCode();
        }
        return hashCode + i12;
    }

    public final boolean isNextPageAvailable() {
        return this.isNextPageAvailable;
    }

    public String toString() {
        return "PaginationResponse(isNextPageAvailable=" + this.isNextPageAvailable + ", nextPageId=" + this.nextPageId + ", paginationPosition=" + this.paginationPosition + ", pageOffset=" + this.pageOffset + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaginationResponse(boolean z11, String str, int i11, PageOffset pageOffset2, int i12, i iVar) {
        this(z11, str, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? null : pageOffset2);
    }
}
