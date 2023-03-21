package in.swiggy.android.tejas.feature.chatnotification.model;

import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.agentdata.HexAttribute;
import kotlin.jvm.internal.p;

/* compiled from: ChatNotificationRequestBody.kt */
public final class ChatNotificationRequestBody {
    @SerializedName("message")
    private final Message message;

    public ChatNotificationRequestBody(Message message2) {
        p.j(message2, HexAttribute.HEX_ATTR_MESSAGE);
        this.message = message2;
    }

    public static /* synthetic */ ChatNotificationRequestBody copy$default(ChatNotificationRequestBody chatNotificationRequestBody, Message message2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            message2 = chatNotificationRequestBody.message;
        }
        return chatNotificationRequestBody.copy(message2);
    }

    public final Message component1() {
        return this.message;
    }

    public final ChatNotificationRequestBody copy(Message message2) {
        p.j(message2, HexAttribute.HEX_ATTR_MESSAGE);
        return new ChatNotificationRequestBody(message2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatNotificationRequestBody) && p.e(this.message, ((ChatNotificationRequestBody) obj).message);
    }

    public final Message getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    public String toString() {
        return "ChatNotificationRequestBody(message=" + this.message + ')';
    }
}
