package in.swiggy.android.tejas.coroutineUtils;

import fp0.c;
import in.swiggy.android.commons.utils.DispatchProviderKt;
import in.swiggy.android.tejas.Response;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.f;

/* compiled from: FlowUseCase.kt */
public abstract class FlowUseCase<P, R> {
    private final CoroutineDispatcher coroutineDispatcher;

    public FlowUseCase() {
        this((CoroutineDispatcher) null, 1, (i) null);
    }

    public FlowUseCase(CoroutineDispatcher coroutineDispatcher2) {
        p.j(coroutineDispatcher2, "coroutineDispatcher");
        this.coroutineDispatcher = coroutineDispatcher2;
    }

    /* access modifiers changed from: protected */
    public abstract d<Response<R>> execute(P p11);

    public CoroutineDispatcher getCoroutineDispatcher() {
        return this.coroutineDispatcher;
    }

    public final d<Response<R>> invoke(P p11) {
        return f.A(f.f(execute(p11), new FlowUseCase$invoke$1((c<? super FlowUseCase$invoke$1>) null)), getCoroutineDispatcher());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowUseCase(CoroutineDispatcher coroutineDispatcher2, int i11, i iVar) {
        this((i11 & 1) != 0 ? DispatchProviderKt.a().D() : coroutineDispatcher2);
    }
}
