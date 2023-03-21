package in.swiggy.android.tejas.feature.cloudinaryupload.imageupload.data;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.p;

/* compiled from: CloudinaryRequestDataWrapper.kt */
public final class CloudinaryRequestDataWrapper {
    @SerializedName("filePath")
    private final String filePath;
    @SerializedName("signature")
    private final CloudinarySignature signature;

    public CloudinaryRequestDataWrapper(CloudinarySignature cloudinarySignature, String str) {
        this.signature = cloudinarySignature;
        this.filePath = str;
    }

    public static /* synthetic */ CloudinaryRequestDataWrapper copy$default(CloudinaryRequestDataWrapper cloudinaryRequestDataWrapper, CloudinarySignature cloudinarySignature, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cloudinarySignature = cloudinaryRequestDataWrapper.signature;
        }
        if ((i11 & 2) != 0) {
            str = cloudinaryRequestDataWrapper.filePath;
        }
        return cloudinaryRequestDataWrapper.copy(cloudinarySignature, str);
    }

    public final CloudinarySignature component1() {
        return this.signature;
    }

    public final String component2() {
        return this.filePath;
    }

    public final CloudinaryRequestDataWrapper copy(CloudinarySignature cloudinarySignature, String str) {
        return new CloudinaryRequestDataWrapper(cloudinarySignature, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudinaryRequestDataWrapper)) {
            return false;
        }
        CloudinaryRequestDataWrapper cloudinaryRequestDataWrapper = (CloudinaryRequestDataWrapper) obj;
        return p.e(this.signature, cloudinaryRequestDataWrapper.signature) && p.e(this.filePath, cloudinaryRequestDataWrapper.filePath);
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final CloudinarySignature getSignature() {
        return this.signature;
    }

    public int hashCode() {
        CloudinarySignature cloudinarySignature = this.signature;
        int i11 = 0;
        int hashCode = (cloudinarySignature == null ? 0 : cloudinarySignature.hashCode()) * 31;
        String str = this.filePath;
        if (str != null) {
            i11 = str.hashCode();
        }
        return hashCode + i11;
    }

    public String toString() {
        return "CloudinaryRequestDataWrapper(signature=" + this.signature + ", filePath=" + this.filePath + ')';
    }
}
