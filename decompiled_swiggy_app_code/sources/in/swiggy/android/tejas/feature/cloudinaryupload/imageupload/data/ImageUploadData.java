package in.swiggy.android.tejas.feature.cloudinaryupload.imageupload.data;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.p;

/* compiled from: ImageUploadData.kt */
public final class ImageUploadData {
    @SerializedName("cloudUrl")
    private final String cloudUrl;
    @SerializedName("publicId")
    private final String publicId;

    public ImageUploadData(String str, String str2) {
        p.j(str, "cloudUrl");
        p.j(str2, "publicId");
        this.cloudUrl = str;
        this.publicId = str2;
    }

    public static /* synthetic */ ImageUploadData copy$default(ImageUploadData imageUploadData, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = imageUploadData.cloudUrl;
        }
        if ((i11 & 2) != 0) {
            str2 = imageUploadData.publicId;
        }
        return imageUploadData.copy(str, str2);
    }

    public final String component1() {
        return this.cloudUrl;
    }

    public final String component2() {
        return this.publicId;
    }

    public final ImageUploadData copy(String str, String str2) {
        p.j(str, "cloudUrl");
        p.j(str2, "publicId");
        return new ImageUploadData(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageUploadData)) {
            return false;
        }
        ImageUploadData imageUploadData = (ImageUploadData) obj;
        return p.e(this.cloudUrl, imageUploadData.cloudUrl) && p.e(this.publicId, imageUploadData.publicId);
    }

    public final String getCloudUrl() {
        return this.cloudUrl;
    }

    public final String getPublicId() {
        return this.publicId;
    }

    public int hashCode() {
        return (this.cloudUrl.hashCode() * 31) + this.publicId.hashCode();
    }

    public String toString() {
        return "ImageUploadData(cloudUrl=" + this.cloudUrl + ", publicId=" + this.publicId + ')';
    }
}
