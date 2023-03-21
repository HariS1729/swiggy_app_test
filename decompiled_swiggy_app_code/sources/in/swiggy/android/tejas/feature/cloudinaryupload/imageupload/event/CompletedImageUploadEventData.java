package in.swiggy.android.tejas.feature.cloudinaryupload.imageupload.event;

import in.swiggy.android.tejas.feature.cloudinaryupload.imageupload.data.ImageUploadData;
import in.swiggy.android.tejas.feature.tracking.cards.typeadapter.CardTypeAdapterFactory;
import kotlin.jvm.internal.p;
import os.i;

/* compiled from: CompletedImageUploadEventData.kt */
public final class CompletedImageUploadEventData extends ImageUploadEventData {
    private final i<ImageUploadData, Exception> data;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompletedImageUploadEventData(String str, i<ImageUploadData, Exception> iVar) {
        super(str);
        p.j(str, "fileUriBeingUploaded");
        p.j(iVar, CardTypeAdapterFactory.DATA);
        this.data = iVar;
    }

    public final i<ImageUploadData, Exception> getData() {
        return this.data;
    }
}
