package in.swiggy.android.tejas.coroutineUtils;

import fp0.c;
import in.swiggy.android.commons.utils.DispatchProviderKt;
import in.swiggy.android.tejas.feature.trackv3.TrackResponseV3;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.f;

/* compiled from: TrackV3FlowUseCase.kt */
public abstract class TrackV3FlowUseCase<P, R> {
    private final CoroutineDispatcher coroutineDispatcher;

    public TrackV3FlowUseCase() {
        this((CoroutineDispatcher) null, 1, (i) null);
    }

    public TrackV3FlowUseCase(CoroutineDispatcher coroutineDispatcher2) {
        p.j(coroutineDispatcher2, "coroutineDispatcher");
        this.coroutineDispatcher = coroutineDispatcher2;
    }

    /* access modifiers changed from: protected */
    public abstract d<TrackResponseV3<R>> execute(P p11);

    public CoroutineDispatcher getCoroutineDispatcher() {
        return this.coroutineDispatcher;
    }

    public final d<TrackResponseV3<R>> invoke(P p11) {
        return f.A(f.f(f.D(execute(p11), new TrackV3FlowUseCase$invoke$1((c<? super TrackV3FlowUseCase$invoke$1>) null)), new TrackV3FlowUseCase$invoke$2((c<? super TrackV3FlowUseCase$invoke$2>) null)), getCoroutineDispatcher());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TrackV3FlowUseCase(CoroutineDispatcher coroutineDispatcher2, int i11, i iVar) {
        this((i11 & 1) != 0 ? DispatchProviderKt.a().D() : coroutineDispatcher2);
    }
}
