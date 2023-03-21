package in.swiggy.android.services;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "in.swiggy.android.services.ChatNotificationReplyWorker", f = "ChatNotificationReplyWorker.kt", l = {57}, m = "doWork")
/* compiled from: ChatNotificationReplyWorker.kt */
final class ChatNotificationReplyWorker$doWork$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f18579a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ChatNotificationReplyWorker f18580b;

    /* renamed from: c  reason: collision with root package name */
    int f18581c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChatNotificationReplyWorker$doWork$1(ChatNotificationReplyWorker chatNotificationReplyWorker, c<? super ChatNotificationReplyWorker$doWork$1> cVar) {
        super(cVar);
        this.f18580b = chatNotificationReplyWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.f18579a = obj;
        this.f18581c |= Integer.MIN_VALUE;
        return this.f18580b.w(this);
    }
}
