package in.swiggy.android.tejas.feature.chathead;

import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.chathead.api.IChatApi;
import in.swiggy.android.tejas.feature.chathead.models.ChatHeadResponse;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;

/* compiled from: ChatManager.kt */
public final class ChatManager {
    public static final Companion Companion = new Companion((i) null);
    public static final int NOT_OK_STATUS_CODE = 1;
    public static final int OK_STATUS_CODE = 0;
    public static final int SESSION_INVALID = 999;
    private final IChatApi chatApi;

    /* compiled from: ChatManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public ChatManager(IChatApi iChatApi) {
        p.j(iChatApi, "chatApi");
        this.chatApi = iChatApi;
    }

    public final d<ChatResponse<SwiggyApiResponse<ChatHeadResponse>>> getChatDetails() {
        return new ChatManager$getChatDetails$$inlined$map$1(this.chatApi.getChatDetails());
    }
}
