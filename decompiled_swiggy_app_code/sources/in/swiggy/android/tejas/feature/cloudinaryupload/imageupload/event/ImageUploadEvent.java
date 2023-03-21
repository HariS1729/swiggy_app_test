package in.swiggy.android.tejas.feature.cloudinaryupload.imageupload.event;

import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import in.swiggy.android.tejas.feature.tracking.cards.typeadapter.CardTypeAdapterFactory;
import kotlin.jvm.internal.p;

/* compiled from: ImageUploadEvent.kt */
public final class ImageUploadEvent extends Event<ImageUploadEventData> {
    private final int imageUUID;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageUploadEvent(String str, int i11, ImageUploadEventData imageUploadEventData) {
        super(str, imageUploadEventData);
        p.j(str, AnalyticsAttribute.EVENT_TYPE_ATTRIBUTE);
        p.j(imageUploadEventData, CardTypeAdapterFactory.DATA);
        this.imageUUID = i11;
    }

    public final int getImageUUID() {
        return this.imageUUID;
    }
}
