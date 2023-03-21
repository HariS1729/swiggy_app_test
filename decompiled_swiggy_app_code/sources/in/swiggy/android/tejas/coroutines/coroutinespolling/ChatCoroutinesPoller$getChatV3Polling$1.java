package in.swiggy.android.tejas.coroutines.coroutinespolling;

import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.chathead.ChatResponse;
import in.swiggy.android.tejas.feature.chathead.models.ChatHeadResponse;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import yp0.q;

@d(c = "in.swiggy.android.tejas.coroutines.coroutinespolling.ChatCoroutinesPoller$getChatV3Polling$1", f = "ChatCoroutinesPoller.kt", l = {32, 25}, m = "invokeSuspend")
/* compiled from: ChatCoroutinesPoller.kt */
final class ChatCoroutinesPoller$getChatV3Polling$1 extends SuspendLambda implements p<q<? super ChatResponse<? extends SwiggyApiResponse<ChatHeadResponse>>>, c<? super k>, Object> {
    final /* synthetic */ long $delay;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatCoroutinesPoller this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChatCoroutinesPoller$getChatV3Polling$1(ChatCoroutinesPoller chatCoroutinesPoller, long j, c<? super ChatCoroutinesPoller$getChatV3Polling$1> cVar) {
        super(2, cVar);
        this.this$0 = chatCoroutinesPoller;
        this.$delay = j;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        ChatCoroutinesPoller$getChatV3Polling$1 chatCoroutinesPoller$getChatV3Polling$1 = new ChatCoroutinesPoller$getChatV3Polling$1(this.this$0, this.$delay, cVar);
        chatCoroutinesPoller$getChatV3Polling$1.L$0 = obj;
        return chatCoroutinesPoller$getChatV3Polling$1;
    }

    public final Object invoke(q<? super ChatResponse<SwiggyApiResponse<ChatHeadResponse>>> qVar, c<? super k> cVar) {
        return ((ChatCoroutinesPoller$getChatV3Polling$1) create(qVar, cVar)).invokeSuspend(k.f22762a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0029
            if (r1 == r3) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            java.lang.Object r1 = r9.L$0
            yp0.q r1 = (yp0.q) r1
            bp0.g.b(r10)
            r10 = r1
            goto L_0x0030
        L_0x0017:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x001f:
            java.lang.Object r1 = r9.L$0
            yp0.q r1 = (yp0.q) r1
            bp0.g.b(r10)
            r10 = r1
            r1 = r9
            goto L_0x0051
        L_0x0029:
            bp0.g.b(r10)
            java.lang.Object r10 = r9.L$0
            yp0.q r10 = (yp0.q) r10
        L_0x0030:
            r1 = r9
        L_0x0031:
            boolean r4 = r10.i()
            if (r4 != 0) goto L_0x0064
            in.swiggy.android.tejas.coroutines.coroutinespolling.ChatCoroutinesPoller r4 = r1.this$0
            in.swiggy.android.tejas.feature.chathead.ChatManager r4 = r4.chatManager
            kotlinx.coroutines.flow.d r4 = r4.getChatDetails()
            in.swiggy.android.tejas.coroutines.coroutinespolling.ChatCoroutinesPoller$getChatV3Polling$1$invokeSuspend$$inlined$collect$1 r5 = new in.swiggy.android.tejas.coroutines.coroutinespolling.ChatCoroutinesPoller$getChatV3Polling$1$invokeSuspend$$inlined$collect$1
            r5.<init>(r10)
            r1.L$0 = r10
            r1.label = r3
            java.lang.Object r4 = r4.collect(r5, r1)
            if (r4 != r0) goto L_0x0051
            return r0
        L_0x0051:
            long r4 = r1.$delay
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0031
            r1.L$0 = r10
            r1.label = r2
            java.lang.Object r4 = wp0.q0.a(r4, r1)
            if (r4 != r0) goto L_0x0031
            return r0
        L_0x0064:
            bp0.k r10 = bp0.k.f22762a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.coroutines.coroutinespolling.ChatCoroutinesPoller$getChatV3Polling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
