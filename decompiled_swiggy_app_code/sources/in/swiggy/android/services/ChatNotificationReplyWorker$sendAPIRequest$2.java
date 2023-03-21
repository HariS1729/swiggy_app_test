package in.swiggy.android.services;

import bp0.g;
import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.chatnotification.model.ChatNotificationResponseBody;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "in.swiggy.android.services.ChatNotificationReplyWorker$sendAPIRequest$2", f = "ChatNotificationReplyWorker.kt", l = {}, m = "invokeSuspend")
/* compiled from: ChatNotificationReplyWorker.kt */
final class ChatNotificationReplyWorker$sendAPIRequest$2 extends SuspendLambda implements p<Response<? extends SwiggyApiResponse<ChatNotificationResponseBody>>, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f18590a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f18591b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ChatNotificationReplyWorker f18592c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChatNotificationReplyWorker$sendAPIRequest$2(ChatNotificationReplyWorker chatNotificationReplyWorker, c<? super ChatNotificationReplyWorker$sendAPIRequest$2> cVar) {
        super(2, cVar);
        this.f18592c = chatNotificationReplyWorker;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        ChatNotificationReplyWorker$sendAPIRequest$2 chatNotificationReplyWorker$sendAPIRequest$2 = new ChatNotificationReplyWorker$sendAPIRequest$2(this.f18592c, cVar);
        chatNotificationReplyWorker$sendAPIRequest$2.f18591b = obj;
        return chatNotificationReplyWorker$sendAPIRequest$2;
    }

    public final Object invoke(Response<SwiggyApiResponse<ChatNotificationResponseBody>> response, c<? super k> cVar) {
        return ((ChatNotificationReplyWorker$sendAPIRequest$2) create(response, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.f18590a == 0) {
            g.b(obj);
            if (((Response) this.f18591b) instanceof Response.Success) {
                this.f18592c.a0(true);
            } else {
                this.f18592c.a0(false);
            }
            return k.f22762a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
