package in.swiggy.android.tejas.feature.home.grid.model.stores;

import kotlin.jvm.internal.p;

/* compiled from: Discount.kt */
public final class Discount {
    private final String description;
    private final String discountType;
    private final String shortDescription;

    public Discount(String str, String str2, String str3) {
        p.j(str, "description");
        p.j(str2, "shortDescription");
        p.j(str3, "discountType");
        this.description = str;
        this.shortDescription = str2;
        this.discountType = str3;
    }

    public static /* synthetic */ Discount copy$default(Discount discount, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = discount.description;
        }
        if ((i11 & 2) != 0) {
            str2 = discount.shortDescription;
        }
        if ((i11 & 4) != 0) {
            str3 = discount.discountType;
        }
        return discount.copy(str, str2, str3);
    }

    public final String component1() {
        return this.description;
    }

    public final String component2() {
        return this.shortDescription;
    }

    public final String component3() {
        return this.discountType;
    }

    public final Discount copy(String str, String str2, String str3) {
        p.j(str, "description");
        p.j(str2, "shortDescription");
        p.j(str3, "discountType");
        return new Discount(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Discount)) {
            return false;
        }
        Discount discount = (Discount) obj;
        return p.e(this.description, discount.description) && p.e(this.shortDescription, discount.shortDescription) && p.e(this.discountType, discount.discountType);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDiscountType() {
        return this.discountType;
    }

    public final String getShortDescription() {
        return this.shortDescription;
    }

    public int hashCode() {
        return (((this.description.hashCode() * 31) + this.shortDescription.hashCode()) * 31) + this.discountType.hashCode();
    }

    public String toString() {
        return "Discount(description=" + this.description + ", shortDescription=" + this.shortDescription + ", discountType=" + this.discountType + ')';
    }
}
