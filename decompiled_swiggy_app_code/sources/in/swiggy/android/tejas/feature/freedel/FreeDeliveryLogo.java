package in.swiggy.android.tejas.feature.freedel;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: FreeDeliveryLogo.kt */
public final class FreeDeliveryLogo implements Serializable {
    @SerializedName("logo")
    private final String logo;
    @SerializedName("text")
    private final String text;

    public FreeDeliveryLogo() {
        this((String) null, (String) null, 3, (i) null);
    }

    public FreeDeliveryLogo(String str, String str2) {
        this.text = str;
        this.logo = str2;
    }

    public static /* synthetic */ FreeDeliveryLogo copy$default(FreeDeliveryLogo freeDeliveryLogo, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = freeDeliveryLogo.text;
        }
        if ((i11 & 2) != 0) {
            str2 = freeDeliveryLogo.logo;
        }
        return freeDeliveryLogo.copy(str, str2);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.logo;
    }

    public final FreeDeliveryLogo copy(String str, String str2) {
        return new FreeDeliveryLogo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreeDeliveryLogo)) {
            return false;
        }
        FreeDeliveryLogo freeDeliveryLogo = (FreeDeliveryLogo) obj;
        return p.e(this.text, freeDeliveryLogo.text) && p.e(this.logo, freeDeliveryLogo.logo);
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.logo;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return hashCode + i11;
    }

    public String toString() {
        return "FreeDeliveryLogo(text=" + this.text + ", logo=" + this.logo + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FreeDeliveryLogo(String str, String str2, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
