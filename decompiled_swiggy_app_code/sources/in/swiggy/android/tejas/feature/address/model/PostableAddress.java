package in.swiggy.android.tejas.feature.address.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: SndAddressModels.kt */
public final class PostableAddress extends AddressInfo {
    private String userId;

    public PostableAddress() {
        this((String) null, 1, (i) null);
    }

    public PostableAddress(String str) {
        super((i) null);
        this.userId = str;
    }

    public static /* synthetic */ PostableAddress copy$default(PostableAddress postableAddress, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = postableAddress.getUserId();
        }
        return postableAddress.copy(str);
    }

    public final String component1() {
        return getUserId();
    }

    public final PostableAddress copy(String str) {
        return new PostableAddress(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PostableAddress) && p.e(getUserId(), ((PostableAddress) obj).getUserId());
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        if (getUserId() == null) {
            return 0;
        }
        return getUserId().hashCode();
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String toString() {
        return "PostableAddress(userId=" + getUserId() + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PostableAddress(String str, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str);
    }
}
