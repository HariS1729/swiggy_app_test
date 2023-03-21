package in.swiggy.android.tejas.coroutineUtils;

import bp0.g;
import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.feature.chathead.ChatResponse;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import lp0.q;

@d(c = "in.swiggy.android.tejas.coroutineUtils.ChatFlowUseCase$invoke$1", f = "ChatFlowUseCase.kt", l = {17}, m = "invokeSuspend")
/* compiled from: ChatFlowUseCase.kt */
final class ChatFlowUseCase$invoke$1 extends SuspendLambda implements q<e<? super ChatResponse<? extends R>>, Throwable, c<? super k>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    ChatFlowUseCase$invoke$1(c<? super ChatFlowUseCase$invoke$1> cVar) {
        super(3, cVar);
    }

    public final Object invoke(e<? super ChatResponse<? extends R>> eVar, Throwable th2, c<? super k> cVar) {
        ChatFlowUseCase$invoke$1 chatFlowUseCase$invoke$1 = new ChatFlowUseCase$invoke$1(cVar);
        chatFlowUseCase$invoke$1.L$0 = eVar;
        chatFlowUseCase$invoke$1.L$1 = th2;
        return chatFlowUseCase$invoke$1.invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.label;
        if (i11 == 0) {
            g.b(obj);
            ChatResponse.OnJobComplete onJobComplete = new ChatResponse.OnJobComplete((Throwable) this.L$1);
            this.L$0 = null;
            this.label = 1;
            if (((e) this.L$0).emit(onJobComplete, this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return k.f22762a;
    }
}
