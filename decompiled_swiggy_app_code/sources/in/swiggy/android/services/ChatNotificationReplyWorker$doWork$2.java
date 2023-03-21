package in.swiggy.android.services;

import androidx.work.ListenableWorker;
import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import os.u;
import wp0.j0;

@d(c = "in.swiggy.android.services.ChatNotificationReplyWorker$doWork$2", f = "ChatNotificationReplyWorker.kt", l = {60}, m = "invokeSuspend")
/* compiled from: ChatNotificationReplyWorker.kt */
final class ChatNotificationReplyWorker$doWork$2 extends SuspendLambda implements p<j0, c<? super ListenableWorker.a>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f18582a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f18583b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ChatNotificationReplyWorker f18584c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChatNotificationReplyWorker$doWork$2(ChatNotificationReplyWorker chatNotificationReplyWorker, c<? super ChatNotificationReplyWorker$doWork$2> cVar) {
        super(2, cVar);
        this.f18584c = chatNotificationReplyWorker;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        ChatNotificationReplyWorker$doWork$2 chatNotificationReplyWorker$doWork$2 = new ChatNotificationReplyWorker$doWork$2(this.f18584c, cVar);
        chatNotificationReplyWorker$doWork$2.f18583b = obj;
        return chatNotificationReplyWorker$doWork$2;
    }

    public final Object invoke(j0 j0Var, c<? super ListenableWorker.a> cVar) {
        return ((ChatNotificationReplyWorker$doWork$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f18582a;
        if (i11 == 0) {
            g.b(obj);
            this.f18584c.f18578m = (j0) this.f18583b;
            ChatNotificationReplyWorker chatNotificationReplyWorker = this.f18584c;
            this.f18582a = 1;
            if (chatNotificationReplyWorker.Z(this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            try {
                g.b(obj);
            } catch (Exception e11) {
                u.h("ChatNotificationReplyWorker", e11);
                return ListenableWorker.a.a();
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return ListenableWorker.a.c();
    }
}
