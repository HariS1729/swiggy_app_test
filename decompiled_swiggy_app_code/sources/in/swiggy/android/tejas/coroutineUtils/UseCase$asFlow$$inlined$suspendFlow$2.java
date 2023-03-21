package in.swiggy.android.tejas.coroutineUtils;

import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.f;
import lp0.q;

@d(c = "in.swiggy.android.commons.utils.GeneralUtilsKt$suspendFlow$2", f = "GeneralUtils.kt", l = {152}, m = "invokeSuspend")
/* compiled from: GeneralUtils.kt */
public final class UseCase$asFlow$$inlined$suspendFlow$2 extends SuspendLambda implements q<e<? super R>, Throwable, c<? super k>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    public UseCase$asFlow$$inlined$suspendFlow$2(c cVar) {
        super(3, cVar);
    }

    public final Object invoke(e<? super R> eVar, Throwable th2, c<? super k> cVar) {
        UseCase$asFlow$$inlined$suspendFlow$2 useCase$asFlow$$inlined$suspendFlow$2 = new UseCase$asFlow$$inlined$suspendFlow$2(cVar);
        useCase$asFlow$$inlined$suspendFlow$2.L$0 = eVar;
        return useCase$asFlow$$inlined$suspendFlow$2.invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.label;
        if (i11 == 0) {
            g.b(obj);
            kotlinx.coroutines.flow.d q = f.q();
            this.label = 1;
            if (f.o((e) this.L$0, q, this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return k.f22762a;
    }
}
