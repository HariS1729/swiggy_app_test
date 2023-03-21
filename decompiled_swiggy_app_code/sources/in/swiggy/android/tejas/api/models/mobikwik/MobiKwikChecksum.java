package in.swiggy.android.tejas.api.models.mobikwik;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: MobiKwikChecksum.kt */
public final class MobiKwikChecksum {
    @SerializedName("checksum")
    private String mChecksum;
    @SerializedName("token")
    private String mToken;

    public MobiKwikChecksum() {
        this((String) null, (String) null, 3, (i) null);
    }

    public MobiKwikChecksum(String str, String str2) {
        this.mChecksum = str;
        this.mToken = str2;
    }

    public static /* synthetic */ MobiKwikChecksum copy$default(MobiKwikChecksum mobiKwikChecksum, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mobiKwikChecksum.mChecksum;
        }
        if ((i11 & 2) != 0) {
            str2 = mobiKwikChecksum.mToken;
        }
        return mobiKwikChecksum.copy(str, str2);
    }

    public final String component1() {
        return this.mChecksum;
    }

    public final String component2() {
        return this.mToken;
    }

    public final MobiKwikChecksum copy(String str, String str2) {
        return new MobiKwikChecksum(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobiKwikChecksum)) {
            return false;
        }
        MobiKwikChecksum mobiKwikChecksum = (MobiKwikChecksum) obj;
        return p.e(this.mChecksum, mobiKwikChecksum.mChecksum) && p.e(this.mToken, mobiKwikChecksum.mToken);
    }

    public final String getMChecksum() {
        return this.mChecksum;
    }

    public final String getMToken() {
        return this.mToken;
    }

    public int hashCode() {
        String str = this.mChecksum;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mToken;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return hashCode + i11;
    }

    public final void setMChecksum(String str) {
        this.mChecksum = str;
    }

    public final void setMToken(String str) {
        this.mToken = str;
    }

    public String toString() {
        return "MobiKwikChecksum(mChecksum=" + this.mChecksum + ", mToken=" + this.mToken + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MobiKwikChecksum(String str, String str2, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
