package in.swiggy.android.tejas.coroutineUtils;

import in.swiggy.android.commons.utils.DispatchProviderKt;

/* compiled from: FlowTransformers.kt */
public abstract class FlowModelTransformer<P, R> extends FlowUseCase<P, R> implements ModelTransformer {
    public FlowModelTransformer() {
        super(DispatchProviderKt.a().getDefault());
    }
}
