package in.swiggy.android.tejas.feature.launch.aggregated;

import bp0.g;
import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.Response;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import lp0.p;

@d(c = "in.swiggy.android.tejas.feature.launch.aggregated.AggregateLaunchPoller$fireAggregatedLaunchApi$$inlined$transform$1", f = "AggregateLaunchPoller.kt", l = {223}, m = "invokeSuspend")
/* compiled from: Emitters.kt */
public final class AggregateLaunchPoller$fireAggregatedLaunchApi$$inlined$transform$1 extends SuspendLambda implements p<e<? super AggregatedLaunchResponse>, c<? super k>, Object> {
    final /* synthetic */ kotlinx.coroutines.flow.d $this_transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AggregateLaunchPoller this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AggregateLaunchPoller$fireAggregatedLaunchApi$$inlined$transform$1(kotlinx.coroutines.flow.d dVar, c cVar, AggregateLaunchPoller aggregateLaunchPoller) {
        super(2, cVar);
        this.$this_transform = dVar;
        this.this$0 = aggregateLaunchPoller;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        AggregateLaunchPoller$fireAggregatedLaunchApi$$inlined$transform$1 aggregateLaunchPoller$fireAggregatedLaunchApi$$inlined$transform$1 = new AggregateLaunchPoller$fireAggregatedLaunchApi$$inlined$transform$1(this.$this_transform, cVar, this.this$0);
        aggregateLaunchPoller$fireAggregatedLaunchApi$$inlined$transform$1.L$0 = obj;
        return aggregateLaunchPoller$fireAggregatedLaunchApi$$inlined$transform$1;
    }

    public final Object invoke(e<? super AggregatedLaunchResponse> eVar, c<? super k> cVar) {
        return ((AggregateLaunchPoller$fireAggregatedLaunchApi$$inlined$transform$1) create(eVar, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.label;
        if (i11 == 0) {
            g.b(obj);
            final e eVar = (e) this.L$0;
            kotlinx.coroutines.flow.d dVar = this.$this_transform;
            final AggregateLaunchPoller aggregateLaunchPoller = this.this$0;
            AnonymousClass1 r32 = new e<Response<? extends AggregatedLaunchResponse>>() {
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: in.swiggy.android.tejas.feature.launch.aggregated.AggregatedLaunchResponse} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Object emit(java.lang.Object r7, fp0.c r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof in.swiggy.android.tejas.feature.launch.aggregated.AggregateLaunchPoller$fireAggregatedLaunchApi$$inlined$transform$1.AnonymousClass1.AnonymousClass1
                        if (r0 == 0) goto L_0x0013
                        r0 = r8
                        in.swiggy.android.tejas.feature.launch.aggregated.AggregateLaunchPoller$fireAggregatedLaunchApi$$inlined$transform$1$1$1 r0 = (in.swiggy.android.tejas.feature.launch.aggregated.AggregateLaunchPoller$fireAggregatedLaunchApi$$inlined$transform$1.AnonymousClass1.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L_0x0018
                    L_0x0013:
                        in.swiggy.android.tejas.feature.launch.aggregated.AggregateLaunchPoller$fireAggregatedLaunchApi$$inlined$transform$1$1$1 r0 = new in.swiggy.android.tejas.feature.launch.aggregated.AggregateLaunchPoller$fireAggregatedLaunchApi$$inlined$transform$1$1$1
                        r0.<init>(r6, r8)
                    L_0x0018:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        bp0.g.b(r8)
                        goto L_0x0062
                    L_0x0029:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L_0x0031:
                        bp0.g.b(r8)
                        kotlinx.coroutines.flow.e r8 = r6
                        in.swiggy.android.tejas.Response r7 = (in.swiggy.android.tejas.Response) r7
                        in.swiggy.android.tejas.feature.launch.aggregated.AggregateLaunchPoller r2 = r4
                        boolean r4 = r7 instanceof in.swiggy.android.tejas.Response.Success
                        r5 = 0
                        if (r4 == 0) goto L_0x0042
                        in.swiggy.android.tejas.Response$Success r7 = (in.swiggy.android.tejas.Response.Success) r7
                        goto L_0x0043
                    L_0x0042:
                        r7 = r5
                    L_0x0043:
                        if (r7 != 0) goto L_0x0046
                        goto L_0x004d
                    L_0x0046:
                        java.lang.Object r7 = r7.getResponse()
                        r5 = r7
                        in.swiggy.android.tejas.feature.launch.aggregated.AggregatedLaunchResponse r5 = (in.swiggy.android.tejas.feature.launch.aggregated.AggregatedLaunchResponse) r5
                    L_0x004d:
                        r2.existingResponse = r5
                        in.swiggy.android.tejas.feature.launch.aggregated.AggregateLaunchPoller r7 = r4
                        in.swiggy.android.tejas.feature.launch.aggregated.AggregatedLaunchResponse r7 = r7.existingResponse
                        if (r7 != 0) goto L_0x0059
                        goto L_0x0062
                    L_0x0059:
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L_0x0062
                        return r1
                    L_0x0062:
                        bp0.k r7 = bp0.k.f22762a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.launch.aggregated.AggregateLaunchPoller$fireAggregatedLaunchApi$$inlined$transform$1.AnonymousClass1.emit(java.lang.Object, fp0.c):java.lang.Object");
                }
            };
            this.label = 1;
            if (dVar.collect(r32, this) == d11) {
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
