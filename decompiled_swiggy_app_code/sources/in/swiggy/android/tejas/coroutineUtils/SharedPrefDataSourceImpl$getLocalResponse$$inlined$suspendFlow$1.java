package in.swiggy.android.tejas.coroutineUtils;

import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import lp0.p;

@d(c = "in.swiggy.android.tejas.coroutineUtils.SharedPrefDataSourceImpl$getLocalResponse$$inlined$suspendFlow$1", f = "SharedPrefDataSourceImpl.kt", l = {218, 218}, m = "invokeSuspend")
/* compiled from: GeneralUtils.kt */
public final class SharedPrefDataSourceImpl$getLocalResponse$$inlined$suspendFlow$1 extends SuspendLambda implements p<e<? super RESP>, c<? super k>, Object> {
    final /* synthetic */ SharedPrefParams $parameters$inlined;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SharedPrefDataSourceImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedPrefDataSourceImpl$getLocalResponse$$inlined$suspendFlow$1(c cVar, SharedPrefDataSourceImpl sharedPrefDataSourceImpl, SharedPrefParams sharedPrefParams) {
        super(2, cVar);
        this.this$0 = sharedPrefDataSourceImpl;
        this.$parameters$inlined = sharedPrefParams;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        SharedPrefDataSourceImpl$getLocalResponse$$inlined$suspendFlow$1 sharedPrefDataSourceImpl$getLocalResponse$$inlined$suspendFlow$1 = new SharedPrefDataSourceImpl$getLocalResponse$$inlined$suspendFlow$1(cVar, this.this$0, this.$parameters$inlined);
        sharedPrefDataSourceImpl$getLocalResponse$$inlined$suspendFlow$1.L$0 = obj;
        return sharedPrefDataSourceImpl$getLocalResponse$$inlined$suspendFlow$1;
    }

    public final Object invoke(e<? super RESP> eVar, c<? super k> cVar) {
        return ((SharedPrefDataSourceImpl$getLocalResponse$$inlined$suspendFlow$1) create(eVar, cVar)).invokeSuspend(k.f22762a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.flow.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            bp0.g.b(r6)
            goto L_0x0045
        L_0x0012:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x001a:
            java.lang.Object r1 = r5.L$0
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.e) r1
            bp0.g.b(r6)
            goto L_0x0039
        L_0x0022:
            bp0.g.b(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.e) r1
            in.swiggy.android.tejas.coroutineUtils.SharedPrefDataSourceImpl r6 = r5.this$0
            in.swiggy.android.tejas.coroutineUtils.SharedPrefParams r4 = r5.$parameters$inlined
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = r6.execute(r4, r5)
            if (r6 != r0) goto L_0x0039
            return r0
        L_0x0039:
            r3 = 0
            r5.L$0 = r3
            r5.label = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L_0x0045
            return r0
        L_0x0045:
            bp0.k r6 = bp0.k.f22762a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.coroutineUtils.SharedPrefDataSourceImpl$getLocalResponse$$inlined$suspendFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
