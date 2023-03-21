package in.swiggy.android.tejas;

import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.coroutineUtils.FlowExceptionTransformer;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import lp0.q;

@d(c = "in.swiggy.android.tejas.ResponseTransformerManager$buildResponse$4", f = "ResponseTransformerManager.kt", l = {104, 81}, m = "invokeSuspend")
/* compiled from: ResponseTransformerManager.kt */
final class ResponseTransformerManager$buildResponse$4 extends SuspendLambda implements q<e<? super Response<? extends M>>, Throwable, c<? super k>, Object> {
    final /* synthetic */ FlowExceptionTransformer<Throwable, M> $exceptionTransformer;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ResponseTransformerManager$buildResponse$4(FlowExceptionTransformer<? super Throwable, M> flowExceptionTransformer, c<? super ResponseTransformerManager$buildResponse$4> cVar) {
        super(3, cVar);
        this.$exceptionTransformer = flowExceptionTransformer;
    }

    public final Object invoke(e<? super Response<? extends M>> eVar, Throwable th2, c<? super k> cVar) {
        ResponseTransformerManager$buildResponse$4 responseTransformerManager$buildResponse$4 = new ResponseTransformerManager$buildResponse$4(this.$exceptionTransformer, cVar);
        responseTransformerManager$buildResponse$4.L$0 = eVar;
        responseTransformerManager$buildResponse$4.L$1 = th2;
        return responseTransformerManager$buildResponse$4.invokeSuspend(k.f22762a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r13.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0028
            if (r1 == r3) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            bp0.g.b(r14)
            goto L_0x0080
        L_0x0014:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x001c:
            java.lang.Object r1 = r13.L$1
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r3 = r13.L$0
            kotlinx.coroutines.flow.e r3 = (kotlinx.coroutines.flow.e) r3
            bp0.g.b(r14)
            goto L_0x0051
        L_0x0028:
            bp0.g.b(r14)
            java.lang.Object r14 = r13.L$0
            kotlinx.coroutines.flow.e r14 = (kotlinx.coroutines.flow.e) r14
            java.lang.Object r1 = r13.L$1
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            in.swiggy.android.tejas.coroutineUtils.FlowExceptionTransformer<java.lang.Throwable, M> r5 = r13.$exceptionTransformer
            if (r5 != 0) goto L_0x003a
            r3 = r14
            r14 = r4
            goto L_0x0053
        L_0x003a:
            kotlinx.coroutines.flow.d r5 = r5.invoke(r1)
            in.swiggy.android.tejas.ResponseTransformerManager$buildResponse$4$invokeSuspend$lambda-1$$inlined$collect$1 r6 = new in.swiggy.android.tejas.ResponseTransformerManager$buildResponse$4$invokeSuspend$lambda-1$$inlined$collect$1
            r6.<init>(r14)
            r13.L$0 = r14
            r13.L$1 = r1
            r13.label = r3
            java.lang.Object r3 = r5.collect(r6, r13)
            if (r3 != r0) goto L_0x0050
            return r0
        L_0x0050:
            r3 = r14
        L_0x0051:
            bp0.k r14 = bp0.k.f22762a
        L_0x0053:
            if (r14 != 0) goto L_0x0080
            in.swiggy.android.tejas.Response$Failure r14 = new in.swiggy.android.tejas.Response$Failure
            in.swiggy.android.tejas.error.Error$UnhandledExceptionError r6 = new in.swiggy.android.tejas.error.Error$UnhandledExceptionError
            java.lang.String r5 = r1.getMessage()
            if (r5 != 0) goto L_0x0065
            java.lang.String r5 = "exception-transformer-"
            java.lang.String r5 = kotlin.jvm.internal.p.s(r5, r1)
        L_0x0065:
            r6.<init>(r1, r5)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 30
            r12 = 0
            r5 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r13.L$0 = r4
            r13.L$1 = r4
            r13.label = r2
            java.lang.Object r14 = r3.emit(r14, r13)
            if (r14 != r0) goto L_0x0080
            return r0
        L_0x0080:
            bp0.k r14 = bp0.k.f22762a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.ResponseTransformerManager$buildResponse$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
