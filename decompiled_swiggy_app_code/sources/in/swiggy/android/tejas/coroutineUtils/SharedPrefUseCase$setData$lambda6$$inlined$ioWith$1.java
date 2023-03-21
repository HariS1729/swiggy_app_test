package in.swiggy.android.tejas.coroutineUtils;

import android.content.SharedPreferences;
import bp0.g;
import bp0.k;
import com.google.gson.Gson;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import fp0.c;
import in.swiggy.android.tejas.utils.GsonUtil;
import js.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "in.swiggy.android.tejas.coroutineUtils.SharedPrefUseCase$setData$lambda-6$$inlined$ioWith$1", f = "SharedPrefUseCase.kt", l = {}, m = "invokeSuspend")
@Instrumented
/* renamed from: in.swiggy.android.tejas.coroutineUtils.SharedPrefUseCase$setData$lambda-6$$inlined$ioWith$1  reason: invalid class name */
/* compiled from: DispatchProvider.kt */
public final class SharedPrefUseCase$setData$lambda6$$inlined$ioWith$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {
    final /* synthetic */ String $key$inlined;
    final /* synthetic */ SharedPrefUseCase $this_runCatching$inlined;
    final /* synthetic */ Object $value$inlined;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedPrefUseCase$setData$lambda6$$inlined$ioWith$1(c cVar, SharedPrefUseCase sharedPrefUseCase, String str, Object obj) {
        super(2, cVar);
        this.$this_runCatching$inlined = sharedPrefUseCase;
        this.$key$inlined = str;
        this.$value$inlined = obj;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        SharedPrefUseCase$setData$lambda6$$inlined$ioWith$1 r02 = new SharedPrefUseCase$setData$lambda6$$inlined$ioWith$1(cVar, this.$this_runCatching$inlined, this.$key$inlined, this.$value$inlined);
        r02.L$0 = obj;
        return r02;
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((SharedPrefUseCase$setData$lambda6$$inlined$ioWith$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        k kVar;
        Object unused = b.d();
        if (this.label == 0) {
            g.b(obj);
            j0 j0Var = (j0) this.L$0;
            SharedPreferences access$getSharedPreferences$p = this.$this_runCatching$inlined.sharedPreferences;
            if (this.$this_runCatching$inlined.clazz == null) {
                kVar = null;
            } else {
                String str = this.$key$inlined;
                Gson gson = GsonUtil.getGson();
                Object obj2 = this.$value$inlined;
                String json = !(gson instanceof Gson) ? gson.toJson(obj2) : GsonInstrumentation.toJson(gson, obj2);
                if (json != null) {
                    a.b(access$getSharedPreferences$p, str, json);
                    kVar = k.f22762a;
                } else {
                    throw new IllegalArgumentException(kotlin.jvm.internal.p.s("invalid data type ", this.$this_runCatching$inlined.clazz));
                }
            }
            if (kVar == null) {
                a.b(access$getSharedPreferences$p, this.$key$inlined, this.$value$inlined);
            }
            return k.f22762a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
