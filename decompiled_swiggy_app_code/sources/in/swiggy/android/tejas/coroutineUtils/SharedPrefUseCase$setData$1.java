package in.swiggy.android.tejas.coroutineUtils;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "in.swiggy.android.tejas.coroutineUtils.SharedPrefUseCase", f = "SharedPrefUseCase.kt", l = {55}, m = "setData")
/* compiled from: SharedPrefUseCase.kt */
final class SharedPrefUseCase$setData$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SharedPrefUseCase<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SharedPrefUseCase$setData$1(SharedPrefUseCase<T> sharedPrefUseCase, c<? super SharedPrefUseCase$setData$1> cVar) {
        super(cVar);
        this.this$0 = sharedPrefUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.setData((String) null, null, this);
    }
}
