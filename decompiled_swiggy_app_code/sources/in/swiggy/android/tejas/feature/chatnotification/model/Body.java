package in.swiggy.android.tejas.feature.chatnotification.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ChatNotificationRequestBody.kt */
public final class Body {
    @SerializedName("messageId")
    private final String messageId;
    @SerializedName("selection")
    private final String selection;
    @SerializedName("text")
    private final String text;

    public Body() {
        this((String) null, (String) null, (String) null, 7, (i) null);
    }

    public Body(String str, String str2, String str3) {
        this.text = str;
        this.messageId = str2;
        this.selection = str3;
    }

    public static /* synthetic */ Body copy$default(Body body, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = body.text;
        }
        if ((i11 & 2) != 0) {
            str2 = body.messageId;
        }
        if ((i11 & 4) != 0) {
            str3 = body.selection;
        }
        return body.copy(str, str2, str3);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.messageId;
    }

    public final String component3() {
        return this.selection;
    }

    public final Body copy(String str, String str2, String str3) {
        return new Body(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Body)) {
            return false;
        }
        Body body = (Body) obj;
        return p.e(this.text, body.text) && p.e(this.messageId, body.messageId) && p.e(this.selection, body.selection);
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getSelection() {
        return this.selection;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.messageId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.selection;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return hashCode2 + i11;
    }

    public String toString() {
        return "Body(text=" + this.text + ", messageId=" + this.messageId + ", selection=" + this.selection + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Body(String str, String str2, String str3, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }
}
