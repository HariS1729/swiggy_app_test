package in.swiggy.android.tejas.feature.cloudinaryupload.imageupload.data;

import bs.a;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.p;

/* compiled from: CloudinarySignature.kt */
public final class CloudinarySignature {
    @SerializedName("timestamp")
    private final long timestamp;
    @SerializedName("token")
    private final String token;
    @SerializedName("uploadPreset")
    private final String uploadPreset;

    public CloudinarySignature(String str, long j, String str2) {
        p.j(str, "token");
        this.token = str;
        this.timestamp = j;
        this.uploadPreset = str2;
    }

    public static /* synthetic */ CloudinarySignature copy$default(CloudinarySignature cloudinarySignature, String str, long j, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cloudinarySignature.token;
        }
        if ((i11 & 2) != 0) {
            j = cloudinarySignature.timestamp;
        }
        if ((i11 & 4) != 0) {
            str2 = cloudinarySignature.uploadPreset;
        }
        return cloudinarySignature.copy(str, j, str2);
    }

    public final String component1() {
        return this.token;
    }

    public final long component2() {
        return this.timestamp;
    }

    public final String component3() {
        return this.uploadPreset;
    }

    public final CloudinarySignature copy(String str, long j, String str2) {
        p.j(str, "token");
        return new CloudinarySignature(str, j, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudinarySignature)) {
            return false;
        }
        CloudinarySignature cloudinarySignature = (CloudinarySignature) obj;
        return p.e(this.token, cloudinarySignature.token) && this.timestamp == cloudinarySignature.timestamp && p.e(this.uploadPreset, cloudinarySignature.uploadPreset);
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getUploadPreset() {
        return this.uploadPreset;
    }

    public int hashCode() {
        int hashCode = ((this.token.hashCode() * 31) + a.a(this.timestamp)) * 31;
        String str = this.uploadPreset;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CloudinarySignature(token=" + this.token + ", timestamp=" + this.timestamp + ", uploadPreset=" + this.uploadPreset + ')';
    }
}
