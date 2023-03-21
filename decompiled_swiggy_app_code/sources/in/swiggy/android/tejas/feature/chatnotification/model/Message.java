package in.swiggy.android.tejas.feature.chatnotification.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: ChatNotificationRequestBody.kt */
public final class Message {
    @SerializedName("parts")
    private final List<Part> parts;

    public Message(List<Part> list) {
        p.j(list, "parts");
        this.parts = list;
    }

    public static /* synthetic */ Message copy$default(Message message, List<Part> list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = message.parts;
        }
        return message.copy(list);
    }

    public final List<Part> component1() {
        return this.parts;
    }

    public final Message copy(List<Part> list) {
        p.j(list, "parts");
        return new Message(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Message) && p.e(this.parts, ((Message) obj).parts);
    }

    public final List<Part> getParts() {
        return this.parts;
    }

    public int hashCode() {
        return this.parts.hashCode();
    }

    public String toString() {
        return "Message(parts=" + this.parts + ')';
    }
}
