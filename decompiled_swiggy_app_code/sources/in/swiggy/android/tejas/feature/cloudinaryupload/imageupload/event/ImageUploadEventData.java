package in.swiggy.android.tejas.feature.cloudinaryupload.imageupload.event;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.p;

/* compiled from: ImageUploadEventData.kt */
public class ImageUploadEventData {
    @SerializedName("fileUriBeingUploaded")
    private final String fileUriBeingUploaded;

    public ImageUploadEventData(String str) {
        p.j(str, "fileUriBeingUploaded");
        this.fileUriBeingUploaded = str;
    }

    public final String getFileUriBeingUploaded() {
        return this.fileUriBeingUploaded;
    }
}
