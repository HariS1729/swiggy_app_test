package in.swiggy.android.tejas.feature.address.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import os.g0;

@Instrumented
/* compiled from: SndAddressModels.kt */
public final class PostableUpdateAddress extends AddressInfo {
    @SerializedName("address_id")
    private String addressId;
    private String userId;

    public PostableUpdateAddress() {
        this((String) null, (String) null, 3, (i) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PostableUpdateAddress(String str, String str2, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ PostableUpdateAddress copy$default(PostableUpdateAddress postableUpdateAddress, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = postableUpdateAddress.addressId;
        }
        if ((i11 & 2) != 0) {
            str2 = postableUpdateAddress.getUserId();
        }
        return postableUpdateAddress.copy(str, str2);
    }

    public final String component1() {
        return this.addressId;
    }

    public final String component2() {
        return getUserId();
    }

    public final PostableUpdateAddress copy(String str, String str2) {
        return new PostableUpdateAddress(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostableUpdateAddress)) {
            return false;
        }
        PostableUpdateAddress postableUpdateAddress = (PostableUpdateAddress) obj;
        return p.e(this.addressId, postableUpdateAddress.addressId) && p.e(getUserId(), postableUpdateAddress.getUserId());
    }

    public final String getAddressId() {
        return this.addressId;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.addressId;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        if (getUserId() != null) {
            i11 = getUserId().hashCode();
        }
        return hashCode + i11;
    }

    public final void setAddressId(String str) {
        this.addressId = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String toString() {
        Gson i11 = g0.i();
        String json = !(i11 instanceof Gson) ? i11.toJson((Object) this) : GsonInstrumentation.toJson(i11, (Object) this);
        p.i(json, "getGson().toJson(this)");
        return json;
    }

    public PostableUpdateAddress(String str, String str2) {
        super((i) null);
        this.addressId = str;
        this.userId = str2;
    }
}
