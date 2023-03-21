package in.swiggy.android.tejas.feature.cloudinaryupload.imageupload.event;

import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import kotlin.jvm.internal.p;

/* compiled from: Event.kt */
public class Event<T> {
    @SerializedName("data")
    private final T data;
    @SerializedName("eventType")
    private final String eventType;

    public Event(String str, T t) {
        p.j(str, AnalyticsAttribute.EVENT_TYPE_ATTRIBUTE);
        this.eventType = str;
        this.data = t;
    }

    public final T getData() {
        return this.data;
    }

    public final String getEventType() {
        return this.eventType;
    }
}
