package in.swiggy.android.tejas.feature.address.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: PostableCheckServiceability.kt */
public final class PostableCheckServiceability {
    @SerializedName("cart_id")
    private String cart_id;
    @SerializedName("lat")
    private double lat;
    @SerializedName("lng")
    private double lng;

    public PostableCheckServiceability(double d11, double d12, String str) {
        this.lat = d11;
        this.lng = d12;
        this.cart_id = str;
    }

    public static /* synthetic */ PostableCheckServiceability copy$default(PostableCheckServiceability postableCheckServiceability, double d11, double d12, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = postableCheckServiceability.lat;
        }
        double d13 = d11;
        if ((i11 & 2) != 0) {
            d12 = postableCheckServiceability.lng;
        }
        double d14 = d12;
        if ((i11 & 4) != 0) {
            str = postableCheckServiceability.cart_id;
        }
        return postableCheckServiceability.copy(d13, d14, str);
    }

    public final double component1() {
        return this.lat;
    }

    public final double component2() {
        return this.lng;
    }

    public final String component3() {
        return this.cart_id;
    }

    public final PostableCheckServiceability copy(double d11, double d12, String str) {
        return new PostableCheckServiceability(d11, d12, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostableCheckServiceability)) {
            return false;
        }
        PostableCheckServiceability postableCheckServiceability = (PostableCheckServiceability) obj;
        return p.e(Double.valueOf(this.lat), Double.valueOf(postableCheckServiceability.lat)) && p.e(Double.valueOf(this.lng), Double.valueOf(postableCheckServiceability.lng)) && p.e(this.cart_id, postableCheckServiceability.cart_id);
    }

    public final String getCart_id() {
        return this.cart_id;
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLng() {
        return this.lng;
    }

    public int hashCode() {
        int a11 = ((Double.doubleToLongBits(this.lat) * 31) + Double.doubleToLongBits(this.lng)) * 31;
        String str = this.cart_id;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    public final void setCart_id(String str) {
        this.cart_id = str;
    }

    public final void setLat(double d11) {
        this.lat = d11;
    }

    public final void setLng(double d11) {
        this.lng = d11;
    }

    public String toString() {
        return "PostableCheckServiceability(lat=" + this.lat + ", lng=" + this.lng + ", cart_id=" + this.cart_id + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PostableCheckServiceability(double d11, double d12, String str, int i11, i iVar) {
        this(d11, d12, (i11 & 4) != 0 ? null : str);
    }
}
