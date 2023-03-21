package in.swiggy.android.tejas.feature.chathead.polling;

import fp0.c;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.coroutineUtils.ChatFlowUseCase;
import in.swiggy.android.tejas.coroutines.coroutinespolling.ChatCoroutinesPoller;
import in.swiggy.android.tejas.feature.chathead.ChatResponse;
import in.swiggy.android.tejas.feature.chathead.models.ChatHeadResponse;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.f;

/* compiled from: ChatPollingUseCase.kt */
public final class ChatPollingUseCase extends ChatFlowUseCase<ChatPollingParams, SwiggyApiResponse<ChatHeadResponse>> {
    private final ChatCoroutinesPoller chatCoroutinesPoller;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatPollingUseCase(ChatCoroutinesPoller chatCoroutinesPoller2) {
        super((CoroutineDispatcher) null, 1, (i) null);
        p.j(chatCoroutinesPoller2, "chatCoroutinesPoller");
        this.chatCoroutinesPoller = chatCoroutinesPoller2;
    }

    /* access modifiers changed from: protected */
    public d<ChatResponse<SwiggyApiResponse<ChatHeadResponse>>> execute(ChatPollingParams chatPollingParams) {
        p.j(chatPollingParams, "parameters");
        return f.H(this.chatCoroutinesPoller.getChatV3Polling(chatPollingParams.getPollingTimeInMillis()), new ChatPollingUseCase$execute$1(chatPollingParams, (c<? super ChatPollingUseCase$execute$1>) null));
    }
}
