package in.swiggy.android.tejas.feature.crosssell.model;

import in.swiggy.android.tejas.feature.listing.ListingCardEntity;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: CrossSellResponse.kt */
public final class CrossSellResponse {
    private final String crossSellMessage;
    private final String crossSellTitle;
    private final String crossSellType;
    private final List<ListingCardEntity<?>> results;

    public CrossSellResponse(List<? extends ListingCardEntity<?>> list, String str, String str2, String str3) {
        p.j(list, "results");
        this.results = list;
        this.crossSellTitle = str;
        this.crossSellMessage = str2;
        this.crossSellType = str3;
    }

    public static /* synthetic */ CrossSellResponse copy$default(CrossSellResponse crossSellResponse, List<ListingCardEntity<?>> list, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = crossSellResponse.results;
        }
        if ((i11 & 2) != 0) {
            str = crossSellResponse.crossSellTitle;
        }
        if ((i11 & 4) != 0) {
            str2 = crossSellResponse.crossSellMessage;
        }
        if ((i11 & 8) != 0) {
            str3 = crossSellResponse.crossSellType;
        }
        return crossSellResponse.copy(list, str, str2, str3);
    }

    public final List<ListingCardEntity<?>> component1() {
        return this.results;
    }

    public final String component2() {
        return this.crossSellTitle;
    }

    public final String component3() {
        return this.crossSellMessage;
    }

    public final String component4() {
        return this.crossSellType;
    }

    public final CrossSellResponse copy(List<? extends ListingCardEntity<?>> list, String str, String str2, String str3) {
        p.j(list, "results");
        return new CrossSellResponse(list, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrossSellResponse)) {
            return false;
        }
        CrossSellResponse crossSellResponse = (CrossSellResponse) obj;
        return p.e(this.results, crossSellResponse.results) && p.e(this.crossSellTitle, crossSellResponse.crossSellTitle) && p.e(this.crossSellMessage, crossSellResponse.crossSellMessage) && p.e(this.crossSellType, crossSellResponse.crossSellType);
    }

    public final String getCrossSellMessage() {
        return this.crossSellMessage;
    }

    public final String getCrossSellTitle() {
        return this.crossSellTitle;
    }

    public final String getCrossSellType() {
        return this.crossSellType;
    }

    public final List<ListingCardEntity<?>> getResults() {
        return this.results;
    }

    public int hashCode() {
        int hashCode = this.results.hashCode() * 31;
        String str = this.crossSellTitle;
        int i11 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.crossSellMessage;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.crossSellType;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return hashCode3 + i11;
    }

    public String toString() {
        return "CrossSellResponse(results=" + this.results + ", crossSellTitle=" + this.crossSellTitle + ", crossSellMessage=" + this.crossSellMessage + ", crossSellType=" + this.crossSellType + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CrossSellResponse(List list, String str, String str2, String str3, int i11, i iVar) {
        this(list, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3);
    }
}
