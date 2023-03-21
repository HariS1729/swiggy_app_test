package in.swiggy.android.tejas.coroutineUtils;

import fp0.c;
import in.swiggy.android.commons.utils.DispatchProviderKt;
import in.swiggy.android.tejas.feature.chathead.ChatResponse;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.f;

/* compiled from: ChatFlowUseCase.kt */
public abstract class ChatFlowUseCase<P, R> {
    private final CoroutineDispatcher coroutineDispatcher;

    public ChatFlowUseCase() {
        this((CoroutineDispatcher) null, 1, (i) null);
    }

    public ChatFlowUseCase(CoroutineDispatcher coroutineDispatcher2) {
        p.j(coroutineDispatcher2, "coroutineDispatcher");
        this.coroutineDispatcher = coroutineDispatcher2;
    }

    /* access modifiers changed from: protected */
    public abstract d<ChatResponse<R>> execute(P p11);

    public CoroutineDispatcher getCoroutineDispatcher() {
        return this.coroutineDispatcher;
    }

    public final d<ChatResponse<R>> invoke(P p11) {
        return f.A(f.f(f.D(execute(p11), new ChatFlowUseCase$invoke$1((c<? super ChatFlowUseCase$invoke$1>) null)), new ChatFlowUseCase$invoke$2((c<? super ChatFlowUseCase$invoke$2>) null)), getCoroutineDispatcher());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChatFlowUseCase(CoroutineDispatcher coroutineDispatcher2, int i11, i iVar) {
        this((i11 & 1) != 0 ? DispatchProviderKt.a().D() : coroutineDispatcher2);
    }
}
