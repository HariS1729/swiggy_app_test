package in.swiggy.android.tejas.coroutineUtils;

import in.swiggy.android.commons.utils.DispatchProviderKt;
import in.swiggy.android.tejas.error.Error;

/* compiled from: FlowTransformers.kt */
public abstract class FlowErrorTransformer<P, R extends Error> extends FlowUseCase<P, R> {
    public FlowErrorTransformer() {
        super(DispatchProviderKt.a().getDefault());
    }
}
