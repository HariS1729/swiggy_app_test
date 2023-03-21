package in.swiggy.android.services;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "in.swiggy.android.services.ChatNotificationReplyWorker", f = "ChatNotificationReplyWorker.kt", l = {75, 75, 82}, m = "sendAPIRequest")
/* compiled from: ChatNotificationReplyWorker.kt */
final class ChatNotificationReplyWorker$sendAPIRequest$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f18585a;

    /* renamed from: b  reason: collision with root package name */
    Object f18586b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f18587c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ChatNotificationReplyWorker f18588d;

    /* renamed from: e  reason: collision with root package name */
    int f18589e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChatNotificationReplyWorker$sendAPIRequest$1(ChatNotificationReplyWorker chatNotificationReplyWorker, c<? super ChatNotificationReplyWorker$sendAPIRequest$1> cVar) {
        super(cVar);
        this.f18588d = chatNotificationReplyWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.f18587c = obj;
        this.f18589e |= Integer.MIN_VALUE;
        return this.f18588d.Z(this);
    }
}
