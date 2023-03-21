package in.swiggy.android.tejas.feature.chathead.polling;

import bp0.g;
import bp0.k;
import fp0.c;
import in.swiggy.android.commons.exceptions.NetworkConnectionException;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.feature.chathead.ChatResponse;
import in.swiggy.android.tejas.feature.chathead.models.ChatHeadResponse;
import java.net.ConnectException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.a;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.flow.e;
import lp0.r;
import wp0.q0;

@d(c = "in.swiggy.android.tejas.feature.chathead.polling.ChatPollingUseCase$execute$1", f = "ChatPollingUseCase.kt", l = {23, 26}, m = "invokeSuspend")
/* compiled from: ChatPollingUseCase.kt */
final class ChatPollingUseCase$execute$1 extends SuspendLambda implements r<e<? super ChatResponse<? extends SwiggyApiResponse<ChatHeadResponse>>>, Throwable, Long, c<? super Boolean>, Object> {
    final /* synthetic */ ChatPollingParams $parameters;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChatPollingUseCase$execute$1(ChatPollingParams chatPollingParams, c<? super ChatPollingUseCase$execute$1> cVar) {
        super(4, cVar);
        this.$parameters = chatPollingParams;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke((e<? super ChatResponse<SwiggyApiResponse<ChatHeadResponse>>>) (e) obj, (Throwable) obj2, ((Number) obj3).longValue(), (c<? super Boolean>) (c) obj4);
    }

    public final Object invoke(e<? super ChatResponse<SwiggyApiResponse<ChatHeadResponse>>> eVar, Throwable th2, long j, c<? super Boolean> cVar) {
        ChatPollingUseCase$execute$1 chatPollingUseCase$execute$1 = new ChatPollingUseCase$execute$1(this.$parameters, cVar);
        chatPollingUseCase$execute$1.L$0 = eVar;
        chatPollingUseCase$execute$1.L$1 = th2;
        return chatPollingUseCase$execute$1.invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.label;
        if (i11 == 0) {
            g.b(obj);
            e eVar = (e) this.L$0;
            Throwable th2 = (Throwable) this.L$1;
            if ((th2 instanceof NetworkConnectionException) || (th2 instanceof ConnectException)) {
                long pollingTimeInMillis = this.$parameters.getPollingTimeInMillis();
                this.L$0 = null;
                this.label = 1;
                if (q0.a(pollingTimeInMillis, this) == d11) {
                    return d11;
                }
                return a.a(true);
            }
            ChatResponse failure = ChatResponse.Companion.failure(new Error.InternalError("", (String) null, (Integer) null, 6, (i) null));
            this.L$0 = null;
            this.label = 2;
            if (eVar.emit(failure, this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
            return a.a(true);
        } else if (i11 == 2) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return a.a(false);
    }
}
