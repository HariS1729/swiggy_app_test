package in.swiggy.android.tejas.coroutineUtils;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "in.swiggy.android.tejas.coroutineUtils.UseCase", f = "UseCase.kt", l = {21}, m = "invoke")
/* compiled from: UseCase.kt */
final class UseCase$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UseCase<P, R> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UseCase$invoke$1(UseCase<? super P, R> useCase, c<? super UseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = useCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, this);
    }
}
