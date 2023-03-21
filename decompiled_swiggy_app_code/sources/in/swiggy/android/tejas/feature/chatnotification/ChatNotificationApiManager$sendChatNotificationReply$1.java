package in.swiggy.android.tejas.feature.chatnotification;

import fp0.c;
import in.swiggy.android.tejas.feature.chatnotification.model.ChatNotificationRequestBody;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "in.swiggy.android.tejas.feature.chatnotification.ChatNotificationApiManager", f = "ChatNotificationApiManager.kt", l = {32}, m = "sendChatNotificationReply")
/* compiled from: ChatNotificationApiManager.kt */
final class ChatNotificationApiManager$sendChatNotificationReply$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatNotificationApiManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChatNotificationApiManager$sendChatNotificationReply$1(ChatNotificationApiManager chatNotificationApiManager, c<? super ChatNotificationApiManager$sendChatNotificationReply$1> cVar) {
        super(cVar);
        this.this$0 = chatNotificationApiManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.sendChatNotificationReply((String) null, (ChatNotificationRequestBody) null, (String) null, this);
    }
}
