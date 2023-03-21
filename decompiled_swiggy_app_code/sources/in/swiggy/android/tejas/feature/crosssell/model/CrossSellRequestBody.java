package in.swiggy.android.tejas.feature.crosssell.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: CrossSellRequestBody.kt */
public final class CrossSellRequestBody {
    @SerializedName("items")
    private final List<CrossSellRequestItem> crossSellRequestItems;
    @SerializedName("restaurant_id")
    private final String restaurantId;
    @SerializedName("theme")
    private final String theme;

    public CrossSellRequestBody(String str, List<CrossSellRequestItem> list, String str2) {
        p.j(str, "restaurantId");
        p.j(list, "crossSellRequestItems");
        this.restaurantId = str;
        this.crossSellRequestItems = list;
        this.theme = str2;
    }

    public static /* synthetic */ CrossSellRequestBody copy$default(CrossSellRequestBody crossSellRequestBody, String str, List<CrossSellRequestItem> list, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = crossSellRequestBody.restaurantId;
        }
        if ((i11 & 2) != 0) {
            list = crossSellRequestBody.crossSellRequestItems;
        }
        if ((i11 & 4) != 0) {
            str2 = crossSellRequestBody.theme;
        }
        return crossSellRequestBody.copy(str, list, str2);
    }

    public final String component1() {
        return this.restaurantId;
    }

    public final List<CrossSellRequestItem> component2() {
        return this.crossSellRequestItems;
    }

    public final String component3() {
        return this.theme;
    }

    public final CrossSellRequestBody copy(String str, List<CrossSellRequestItem> list, String str2) {
        p.j(str, "restaurantId");
        p.j(list, "crossSellRequestItems");
        return new CrossSellRequestBody(str, list, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrossSellRequestBody)) {
            return false;
        }
        CrossSellRequestBody crossSellRequestBody = (CrossSellRequestBody) obj;
        return p.e(this.restaurantId, crossSellRequestBody.restaurantId) && p.e(this.crossSellRequestItems, crossSellRequestBody.crossSellRequestItems) && p.e(this.theme, crossSellRequestBody.theme);
    }

    public final List<CrossSellRequestItem> getCrossSellRequestItems() {
        return this.crossSellRequestItems;
    }

    public final String getRestaurantId() {
        return this.restaurantId;
    }

    public final String getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int hashCode = ((this.restaurantId.hashCode() * 31) + this.crossSellRequestItems.hashCode()) * 31;
        String str = this.theme;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CrossSellRequestBody(restaurantId=" + this.restaurantId + ", crossSellRequestItems=" + this.crossSellRequestItems + ", theme=" + this.theme + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CrossSellRequestBody(String str, List list, String str2, int i11, i iVar) {
        this(str, list, (i11 & 4) != 0 ? null : str2);
    }
}
