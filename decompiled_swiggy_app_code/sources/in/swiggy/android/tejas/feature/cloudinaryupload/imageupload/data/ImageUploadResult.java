package in.swiggy.android.tejas.feature.cloudinaryupload.imageupload.data;

import in.swiggy.android.tejas.feature.tracking.cards.typeadapter.CardTypeAdapterFactory;
import kotlin.jvm.internal.p;
import os.i;

/* compiled from: ImageUploadResult.kt */
public final class ImageUploadResult {
    private final i<ImageUploadData, Exception> data;
    private final String fileUri;

    public ImageUploadResult(String str, i<ImageUploadData, Exception> iVar) {
        p.j(str, "fileUri");
        p.j(iVar, CardTypeAdapterFactory.DATA);
        this.fileUri = str;
        this.data = iVar;
    }

    public static /* synthetic */ ImageUploadResult copy$default(ImageUploadResult imageUploadResult, String str, i<ImageUploadData, Exception> iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = imageUploadResult.fileUri;
        }
        if ((i11 & 2) != 0) {
            iVar = imageUploadResult.data;
        }
        return imageUploadResult.copy(str, iVar);
    }

    public final String component1() {
        return this.fileUri;
    }

    public final i<ImageUploadData, Exception> component2() {
        return this.data;
    }

    public final ImageUploadResult copy(String str, i<ImageUploadData, Exception> iVar) {
        p.j(str, "fileUri");
        p.j(iVar, CardTypeAdapterFactory.DATA);
        return new ImageUploadResult(str, iVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageUploadResult)) {
            return false;
        }
        ImageUploadResult imageUploadResult = (ImageUploadResult) obj;
        return p.e(this.fileUri, imageUploadResult.fileUri) && p.e(this.data, imageUploadResult.data);
    }

    public final i<ImageUploadData, Exception> getData() {
        return this.data;
    }

    public final String getFileUri() {
        return this.fileUri;
    }

    public int hashCode() {
        return (this.fileUri.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        return "ImageUploadResult(fileUri=" + this.fileUri + ", data=" + this.data + ')';
    }
}
