package in.swiggy.android.tejas.feature.chathead.polling;

import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.chathead.ChatResponse;
import in.swiggy.android.tejas.feature.chathead.models.ChatHeadResponse;

/* compiled from: IChatResponseHandler.kt */
public interface IChatResponseHandler {
    void handleChatResponse(ChatResponse<SwiggyApiResponse<ChatHeadResponse>> chatResponse);

    String jobName();
}
