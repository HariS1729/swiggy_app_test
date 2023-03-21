package in.swiggy.android.tejas.feature.cloudinaryupload.imageupload.event;

import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import in.swiggy.android.tejas.feature.tracking.cards.typeadapter.CardTypeAdapterFactory;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: BulkImageUploadEvent.kt */
public final class BulkImageUploadEvent extends Event<List<? extends ImageUploadEventData>> {
    private final int batchNo;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BulkImageUploadEvent(String str, int i11, List<? extends ImageUploadEventData> list) {
        super(str, list);
        p.j(str, AnalyticsAttribute.EVENT_TYPE_ATTRIBUTE);
        p.j(list, CardTypeAdapterFactory.DATA);
        this.batchNo = i11;
    }

    public final int getBatchNo() {
        return this.batchNo;
    }
}
