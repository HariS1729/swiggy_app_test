package in.swiggy.android.tejas.coroutineUtils;

import android.content.SharedPreferences;
import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "in.swiggy.android.tejas.coroutineUtils.SharedPrefUseCase$clearData$$inlined$ioWith$1", f = "SharedPrefUseCase.kt", l = {}, m = "invokeSuspend")
/* compiled from: DispatchProvider.kt */
public final class SharedPrefUseCase$clearData$$inlined$ioWith$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {
    final /* synthetic */ String $key$inlined;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SharedPrefUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedPrefUseCase$clearData$$inlined$ioWith$1(c cVar, SharedPrefUseCase sharedPrefUseCase, String str) {
        super(2, cVar);
        this.this$0 = sharedPrefUseCase;
        this.$key$inlined = str;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        SharedPrefUseCase$clearData$$inlined$ioWith$1 sharedPrefUseCase$clearData$$inlined$ioWith$1 = new SharedPrefUseCase$clearData$$inlined$ioWith$1(cVar, this.this$0, this.$key$inlined);
        sharedPrefUseCase$clearData$$inlined$ioWith$1.L$0 = obj;
        return sharedPrefUseCase$clearData$$inlined$ioWith$1;
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((SharedPrefUseCase$clearData$$inlined$ioWith$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.label == 0) {
            g.b(obj);
            j0 j0Var = (j0) this.L$0;
            SharedPreferences.Editor edit = this.this$0.sharedPreferences.edit();
            kotlin.jvm.internal.p.i(edit, "editor");
            String str = this.$key$inlined;
            if ((str == null ? null : edit.remove(str)) == null) {
                edit.clear();
            }
            edit.apply();
            return k.f22762a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
