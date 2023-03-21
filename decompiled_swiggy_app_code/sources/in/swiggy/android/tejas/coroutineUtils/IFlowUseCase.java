package in.swiggy.android.tejas.coroutineUtils;

import in.swiggy.android.tejas.Response;
import kotlinx.coroutines.flow.d;

/* compiled from: IFlowUseCase.kt */
public interface IFlowUseCase<P, R> {
    d<R> asFlow(P p11);

    d<Response<R>> asResponseFlow(P p11);
}
