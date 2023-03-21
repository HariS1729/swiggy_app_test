package in.swiggy.android.tejas.feature.chatnotification.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ChatNotificationResponseBody.kt */
public final class ChatNotificationResponseBody {
    @SerializedName("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f20217id;

    public ChatNotificationResponseBody() {
        this((String) null, 1, (i) null);
    }

    public ChatNotificationResponseBody(String str) {
        this.f20217id = str;
    }

    public static /* synthetic */ ChatNotificationResponseBody copy$default(ChatNotificationResponseBody chatNotificationResponseBody, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = chatNotificationResponseBody.f20217id;
        }
        return chatNotificationResponseBody.copy(str);
    }

    public final String component1() {
        return this.f20217id;
    }

    public final ChatNotificationResponseBody copy(String str) {
        return new ChatNotificationResponseBody(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatNotificationResponseBody) && p.e(this.f20217id, ((ChatNotificationResponseBody) obj).f20217id);
    }

    public final String getId() {
        return this.f20217id;
    }

    public int hashCode() {
        String str = this.f20217id;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "ChatNotificationResponseBody(id=" + this.f20217id + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChatNotificationResponseBody(String str, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str);
    }
}
