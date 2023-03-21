package in.swiggy.android.tejas.feature.cart;

import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.agentdata.HexAttribute;
import kotlin.jvm.internal.p;

/* compiled from: CancellationMessage.kt */
public final class CancellationMessage {
    @SerializedName("message")
    private final Message message;

    public CancellationMessage(Message message2) {
        p.j(message2, HexAttribute.HEX_ATTR_MESSAGE);
        this.message = message2;
    }

    public static /* synthetic */ CancellationMessage copy$default(CancellationMessage cancellationMessage, Message message2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            message2 = cancellationMessage.message;
        }
        return cancellationMessage.copy(message2);
    }

    public final Message component1() {
        return this.message;
    }

    public final CancellationMessage copy(Message message2) {
        p.j(message2, HexAttribute.HEX_ATTR_MESSAGE);
        return new CancellationMessage(message2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CancellationMessage) && p.e(this.message, ((CancellationMessage) obj).message);
    }

    public final Message getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    public String toString() {
        return "CancellationMessage(message=" + this.message + ')';
    }
}
