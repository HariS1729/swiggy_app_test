package in.swiggy.android.tejas.feature.home.grid.model.stores;

import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: DiscountInfo.kt */
public final class DiscountInfo {
    private final List<Discount> discounts;
    private final String header;

    public DiscountInfo(String str, List<Discount> list) {
        p.j(str, "header");
        p.j(list, "discounts");
        this.header = str;
        this.discounts = list;
    }

    public static /* synthetic */ DiscountInfo copy$default(DiscountInfo discountInfo, String str, List<Discount> list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = discountInfo.header;
        }
        if ((i11 & 2) != 0) {
            list = discountInfo.discounts;
        }
        return discountInfo.copy(str, list);
    }

    public final String component1() {
        return this.header;
    }

    public final List<Discount> component2() {
        return this.discounts;
    }

    public final DiscountInfo copy(String str, List<Discount> list) {
        p.j(str, "header");
        p.j(list, "discounts");
        return new DiscountInfo(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscountInfo)) {
            return false;
        }
        DiscountInfo discountInfo = (DiscountInfo) obj;
        return p.e(this.header, discountInfo.header) && p.e(this.discounts, discountInfo.discounts);
    }

    public final List<Discount> getDiscounts() {
        return this.discounts;
    }

    public final String getHeader() {
        return this.header;
    }

    public int hashCode() {
        return (this.header.hashCode() * 31) + this.discounts.hashCode();
    }

    public String toString() {
        return "DiscountInfo(header=" + this.header + ", discounts=" + this.discounts + ')';
    }
}
