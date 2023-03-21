package in.swiggy.android.tejas.coroutineUtils;

import in.swiggy.android.commons.utils.DispatchProviderKt;
import java.lang.Throwable;

/* compiled from: FlowTransformers.kt */
public abstract class FlowExceptionTransformer<P extends Throwable, M> extends FlowUseCase<P, M> {
    public FlowExceptionTransformer() {
        super(DispatchProviderKt.a().getDefault());
    }
}
