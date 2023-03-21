package in.swiggy.android.tejas.feature.dataplatform.model;

import com.google.gson.annotations.SerializedName;
import in.swiggy.android.tejas.feature.dataplatform.model.MessageEvent;
import kotlin.jvm.internal.p;

/* compiled from: Message.kt */
public final class Message<T extends MessageEvent> {
    @SerializedName("event")
    private final T event;
    @SerializedName("header")
    private final MessageHeader header;

    public Message(MessageHeader messageHeader, T t) {
        p.j(messageHeader, "header");
        p.j(t, "event");
        this.header = messageHeader;
        this.event = t;
    }

    public static /* synthetic */ Message copy$default(Message message, MessageHeader messageHeader, T t, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            messageHeader = message.header;
        }
        if ((i11 & 2) != 0) {
            t = message.event;
        }
        return message.copy(messageHeader, t);
    }

    public final MessageHeader component1() {
        return this.header;
    }

    public final T component2() {
        return this.event;
    }

    public final Message<T> copy(MessageHeader messageHeader, T t) {
        p.j(messageHeader, "header");
        p.j(t, "event");
        return new Message<>(messageHeader, t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        return p.e(this.header, message.header) && p.e(this.event, message.event);
    }

    public final T getEvent() {
        return this.event;
    }

    public final MessageHeader getHeader() {
        return this.header;
    }

    public int hashCode() {
        return (this.header.hashCode() * 31) + this.event.hashCode();
    }

    public String toString() {
        return "Message(header=" + this.header + ", event=" + this.event + ')';
    }
}
