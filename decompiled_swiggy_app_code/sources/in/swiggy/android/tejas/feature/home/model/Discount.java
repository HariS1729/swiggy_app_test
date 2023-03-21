package in.swiggy.android.tejas.feature.home.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.jvm.internal.p;

/* compiled from: Discount.kt */
public final class Discount implements Serializable {
    @SerializedName("title")
    private final String title;

    public Discount(String str) {
        p.j(str, "title");
        this.title = str;
    }

    public static /* synthetic */ Discount copy$default(Discount discount, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = discount.title;
        }
        return discount.copy(str);
    }

    public final String component1() {
        return this.title;
    }

    public final Discount copy(String str) {
        p.j(str, "title");
        return new Discount(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Discount) && p.e(this.title, ((Discount) obj).title);
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode();
    }

    public String toString() {
        return "Discount(title=" + this.title + ')';
    }
}
