package in.swiggy.android.tejas.feature.cancellation;

import com.google.gson.annotations.SerializedName;
import in.swiggy.android.tejas.feature.trackv3.responsedatatypes.NbaMetaDataType;
import kotlin.jvm.internal.p;

/* compiled from: CancelOnlyResponse.kt */
public final class CancelOnlyResponse {
    @SerializedName("cancellation_status")
    private final boolean cancellationStatus;
    @SerializedName("conversation_id")
    private final String conversationId;

    public CancelOnlyResponse(boolean z11, String str) {
        p.j(str, NbaMetaDataType.CONVERSATION_ID);
        this.cancellationStatus = z11;
        this.conversationId = str;
    }

    public static /* synthetic */ CancelOnlyResponse copy$default(CancelOnlyResponse cancelOnlyResponse, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = cancelOnlyResponse.cancellationStatus;
        }
        if ((i11 & 2) != 0) {
            str = cancelOnlyResponse.conversationId;
        }
        return cancelOnlyResponse.copy(z11, str);
    }

    public final boolean component1() {
        return this.cancellationStatus;
    }

    public final String component2() {
        return this.conversationId;
    }

    public final CancelOnlyResponse copy(boolean z11, String str) {
        p.j(str, NbaMetaDataType.CONVERSATION_ID);
        return new CancelOnlyResponse(z11, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelOnlyResponse)) {
            return false;
        }
        CancelOnlyResponse cancelOnlyResponse = (CancelOnlyResponse) obj;
        return this.cancellationStatus == cancelOnlyResponse.cancellationStatus && p.e(this.conversationId, cancelOnlyResponse.conversationId);
    }

    public final boolean getCancellationStatus() {
        return this.cancellationStatus;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public int hashCode() {
        boolean z11 = this.cancellationStatus;
        if (z11) {
            z11 = true;
        }
        return ((z11 ? 1 : 0) * true) + this.conversationId.hashCode();
    }

    public String toString() {
        return "CancelOnlyResponse(cancellationStatus=" + this.cancellationStatus + ", conversationId=" + this.conversationId + ')';
    }
}
