package in.swiggy.android.tejas.coroutines.coroutinespolling;

import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.chathead.ChatResponse;
import in.swiggy.android.tejas.feature.chathead.models.ChatHeadResponse;
import kotlinx.coroutines.flow.e;
import yp0.q;

/* compiled from: Collect.kt */
public final class ChatCoroutinesPoller$getChatV3Polling$1$invokeSuspend$$inlined$collect$1 implements e<ChatResponse<? extends SwiggyApiResponse<ChatHeadResponse>>> {
    final /* synthetic */ q $$this$channelFlow$inlined;

    public ChatCoroutinesPoller$getChatV3Polling$1$invokeSuspend$$inlined$collect$1(q qVar) {
        this.$$this$channelFlow$inlined = qVar;
    }

    public Object emit(ChatResponse<? extends SwiggyApiResponse<ChatHeadResponse>> chatResponse, c<? super k> cVar) {
        Object m11 = this.$$this$channelFlow$inlined.m(chatResponse, cVar);
        return m11 == b.d() ? m11 : k.f22762a;
    }
}
