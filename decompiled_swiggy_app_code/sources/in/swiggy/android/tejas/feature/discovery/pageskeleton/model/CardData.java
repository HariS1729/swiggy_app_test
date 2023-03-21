package in.swiggy.android.tejas.feature.discovery.pageskeleton.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: SkeletonJsonResponse.kt */
public final class CardData {
    @SerializedName("category")
    private final String category;
    @SerializedName("cta")
    private final Cta cta;
    @SerializedName("options")
    private final List<Option> options;
    @SerializedName("placeholder")
    private final String placeholder;
    @SerializedName("type")
    private final String type;

    public CardData(String str, List<Option> list, String str2, String str3, Cta cta2) {
        p.j(str, "type");
        this.type = str;
        this.options = list;
        this.placeholder = str2;
        this.category = str3;
        this.cta = cta2;
    }

    public static /* synthetic */ CardData copy$default(CardData cardData, String str, List<Option> list, String str2, String str3, Cta cta2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cardData.type;
        }
        if ((i11 & 2) != 0) {
            list = cardData.options;
        }
        List<Option> list2 = list;
        if ((i11 & 4) != 0) {
            str2 = cardData.placeholder;
        }
        String str4 = str2;
        if ((i11 & 8) != 0) {
            str3 = cardData.category;
        }
        String str5 = str3;
        if ((i11 & 16) != 0) {
            cta2 = cardData.cta;
        }
        return cardData.copy(str, list2, str4, str5, cta2);
    }

    public final String component1() {
        return this.type;
    }

    public final List<Option> component2() {
        return this.options;
    }

    public final String component3() {
        return this.placeholder;
    }

    public final String component4() {
        return this.category;
    }

    public final Cta component5() {
        return this.cta;
    }

    public final CardData copy(String str, List<Option> list, String str2, String str3, Cta cta2) {
        p.j(str, "type");
        return new CardData(str, list, str2, str3, cta2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardData)) {
            return false;
        }
        CardData cardData = (CardData) obj;
        return p.e(this.type, cardData.type) && p.e(this.options, cardData.options) && p.e(this.placeholder, cardData.placeholder) && p.e(this.category, cardData.category) && p.e(this.cta, cardData.cta);
    }

    public final String getCategory() {
        return this.category;
    }

    public final Cta getCta() {
        return this.cta;
    }

    public final List<Option> getOptions() {
        return this.options;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        List<Option> list = this.options;
        int i11 = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.placeholder;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.category;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Cta cta2 = this.cta;
        if (cta2 != null) {
            i11 = cta2.hashCode();
        }
        return hashCode4 + i11;
    }

    public String toString() {
        return "CardData(type=" + this.type + ", options=" + this.options + ", placeholder=" + this.placeholder + ", category=" + this.category + ", cta=" + this.cta + ')';
    }
}
