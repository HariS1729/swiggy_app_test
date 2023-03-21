package in.swiggy.android.tejas.feature.dataplatform.model;

import bs.a;
import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import kotlin.jvm.internal.p;

/* compiled from: MessageHeader.kt */
public final class MessageHeader {
    @SerializedName("appName")
    private final String appName;
    @SerializedName("eventId")
    private final int eventId;
    @SerializedName("name")
    private final String name;
    @SerializedName("schemaVersion")
    private final String schemaVersion;
    @SerializedName("timestamp")
    private final long timestamp;
    @SerializedName("uuid")
    private final String uuid;

    public MessageHeader(int i11, String str, String str2, long j, String str3, String str4) {
        p.j(str, AnalyticsAttribute.UUID_ATTRIBUTE);
        p.j(str2, AnalyticsAttribute.APP_NAME_ATTRIBUTE);
        p.j(str3, "schemaVersion");
        p.j(str4, "name");
        this.eventId = i11;
        this.uuid = str;
        this.appName = str2;
        this.timestamp = j;
        this.schemaVersion = str3;
        this.name = str4;
    }

    public static /* synthetic */ MessageHeader copy$default(MessageHeader messageHeader, int i11, String str, String str2, long j, String str3, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = messageHeader.eventId;
        }
        if ((i12 & 2) != 0) {
            str = messageHeader.uuid;
        }
        String str5 = str;
        if ((i12 & 4) != 0) {
            str2 = messageHeader.appName;
        }
        String str6 = str2;
        if ((i12 & 8) != 0) {
            j = messageHeader.timestamp;
        }
        long j11 = j;
        if ((i12 & 16) != 0) {
            str3 = messageHeader.schemaVersion;
        }
        String str7 = str3;
        if ((i12 & 32) != 0) {
            str4 = messageHeader.name;
        }
        return messageHeader.copy(i11, str5, str6, j11, str7, str4);
    }

    public final int component1() {
        return this.eventId;
    }

    public final String component2() {
        return this.uuid;
    }

    public final String component3() {
        return this.appName;
    }

    public final long component4() {
        return this.timestamp;
    }

    public final String component5() {
        return this.schemaVersion;
    }

    public final String component6() {
        return this.name;
    }

    public final MessageHeader copy(int i11, String str, String str2, long j, String str3, String str4) {
        p.j(str, AnalyticsAttribute.UUID_ATTRIBUTE);
        p.j(str2, AnalyticsAttribute.APP_NAME_ATTRIBUTE);
        p.j(str3, "schemaVersion");
        String str5 = str4;
        p.j(str5, "name");
        return new MessageHeader(i11, str, str2, j, str3, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageHeader)) {
            return false;
        }
        MessageHeader messageHeader = (MessageHeader) obj;
        return this.eventId == messageHeader.eventId && p.e(this.uuid, messageHeader.uuid) && p.e(this.appName, messageHeader.appName) && this.timestamp == messageHeader.timestamp && p.e(this.schemaVersion, messageHeader.schemaVersion) && p.e(this.name, messageHeader.name);
    }

    public final String getAppName() {
        return this.appName;
    }

    public final int getEventId() {
        return this.eventId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSchemaVersion() {
        return this.schemaVersion;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return (((((((((this.eventId * 31) + this.uuid.hashCode()) * 31) + this.appName.hashCode()) * 31) + a.a(this.timestamp)) * 31) + this.schemaVersion.hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "MessageHeader(eventId=" + this.eventId + ", uuid=" + this.uuid + ", appName=" + this.appName + ", timestamp=" + this.timestamp + ", schemaVersion=" + this.schemaVersion + ", name=" + this.name + ')';
    }
}
