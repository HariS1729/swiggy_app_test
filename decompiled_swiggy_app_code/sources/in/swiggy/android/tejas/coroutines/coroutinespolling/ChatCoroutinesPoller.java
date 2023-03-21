package in.swiggy.android.tejas.coroutines.coroutinespolling;

import fp0.c;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.chathead.ChatManager;
import in.swiggy.android.tejas.feature.chathead.ChatResponse;
import in.swiggy.android.tejas.feature.chathead.models.ChatHeadResponse;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.f;

/* compiled from: ChatCoroutinesPoller.kt */
public final class ChatCoroutinesPoller {
    /* access modifiers changed from: private */
    public final ChatManager chatManager;

    public ChatCoroutinesPoller(ChatManager chatManager2) {
        p.j(chatManager2, "chatManager");
        this.chatManager = chatManager2;
    }

    public final d<ChatResponse<SwiggyApiResponse<ChatHeadResponse>>> getChatV3Polling(long j) {
        return f.h(new ChatCoroutinesPoller$getChatV3Polling$1(this, j, (c<? super ChatCoroutinesPoller$getChatV3Polling$1>) null));
    }
}
