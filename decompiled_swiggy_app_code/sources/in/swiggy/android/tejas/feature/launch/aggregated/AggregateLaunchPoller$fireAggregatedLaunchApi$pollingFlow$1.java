package in.swiggy.android.tejas.feature.launch.aggregated;

import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.feature.launch.aggregated.AggregateLaunchPoller;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import lp0.p;
import retrofit2.Response;

@d(c = "in.swiggy.android.tejas.feature.launch.aggregated.AggregateLaunchPoller$fireAggregatedLaunchApi$pollingFlow$1", f = "AggregateLaunchPoller.kt", l = {42, 43, 51}, m = "invokeSuspend")
/* compiled from: AggregateLaunchPoller.kt */
final class AggregateLaunchPoller$fireAggregatedLaunchApi$pollingFlow$1 extends SuspendLambda implements p<e<? super Response<AggregatedLaunchResponse>>, c<? super k>, Object> {
    final /* synthetic */ boolean $checkSwiggyOneFUPBreach;
    final /* synthetic */ AggregateLaunchPoller.PollingConfig $pollingConfig;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AggregateLaunchPoller this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AggregateLaunchPoller$fireAggregatedLaunchApi$pollingFlow$1(AggregateLaunchPoller aggregateLaunchPoller, boolean z11, AggregateLaunchPoller.PollingConfig pollingConfig, c<? super AggregateLaunchPoller$fireAggregatedLaunchApi$pollingFlow$1> cVar) {
        super(2, cVar);
        this.this$0 = aggregateLaunchPoller;
        this.$checkSwiggyOneFUPBreach = z11;
        this.$pollingConfig = pollingConfig;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        AggregateLaunchPoller$fireAggregatedLaunchApi$pollingFlow$1 aggregateLaunchPoller$fireAggregatedLaunchApi$pollingFlow$1 = new AggregateLaunchPoller$fireAggregatedLaunchApi$pollingFlow$1(this.this$0, this.$checkSwiggyOneFUPBreach, this.$pollingConfig, cVar);
        aggregateLaunchPoller$fireAggregatedLaunchApi$pollingFlow$1.L$0 = obj;
        return aggregateLaunchPoller$fireAggregatedLaunchApi$pollingFlow$1;
    }

    public final Object invoke(e<? super Response<AggregatedLaunchResponse>> eVar, c<? super k> cVar) {
        return ((AggregateLaunchPoller$fireAggregatedLaunchApi$pollingFlow$1) create(eVar, cVar)).invokeSuspend(k.f22762a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r9.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0040
            if (r1 == r4) goto L_0x0030
            if (r1 == r3) goto L_0x0025
            if (r1 != r2) goto L_0x001d
            java.lang.Object r1 = r9.L$0
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.e) r1
            bp0.g.b(r10)
            r5 = r1
            r1 = r0
            r0 = r9
            goto L_0x00a2
        L_0x001d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0025:
            java.lang.Object r1 = r9.L$0
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.e) r1
            bp0.g.b(r10)     // Catch:{ Exception -> 0x003b }
            r5 = r1
            r1 = r0
            r0 = r9
            goto L_0x0074
        L_0x0030:
            java.lang.Object r1 = r9.L$0
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.e) r1
            bp0.g.b(r10)     // Catch:{ Exception -> 0x003b }
            r5 = r1
            r1 = r0
            r0 = r9
            goto L_0x0067
        L_0x003b:
            r10 = move-exception
            r5 = r1
            r1 = r0
            r0 = r9
            goto L_0x007e
        L_0x0040:
            bp0.g.b(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.flow.e r10 = (kotlinx.coroutines.flow.e) r10
            r1 = r10
            r10 = r9
        L_0x0049:
            in.swiggy.android.tejas.feature.launch.aggregated.AggregateLaunchPoller r5 = r10.this$0     // Catch:{ Exception -> 0x0078 }
            in.swiggy.android.tejas.feature.launch.aggregated.IAggregatedCoroutineLaunchAPI r5 = r5.api     // Catch:{ Exception -> 0x0078 }
            boolean r6 = r10.$checkSwiggyOneFUPBreach     // Catch:{ Exception -> 0x0078 }
            in.swiggy.android.tejas.feature.launch.aggregated.AggregateLaunchPoller$PollingConfig r7 = r10.$pollingConfig     // Catch:{ Exception -> 0x0078 }
            in.swiggy.android.tejas.oldapi.network.requests.PostableAggregatedLaunchRequest r7 = r7.getLaunchRequest()     // Catch:{ Exception -> 0x0078 }
            r10.L$0 = r1     // Catch:{ Exception -> 0x0078 }
            r10.label = r4     // Catch:{ Exception -> 0x0078 }
            java.lang.Object r5 = r5.getAggregatedLaunchData(r6, r7, r10)     // Catch:{ Exception -> 0x0078 }
            if (r5 != r0) goto L_0x0062
            return r0
        L_0x0062:
            r8 = r0
            r0 = r10
            r10 = r5
            r5 = r1
            r1 = r8
        L_0x0067:
            retrofit2.Response r10 = (retrofit2.Response) r10     // Catch:{ Exception -> 0x0076 }
            r0.L$0 = r5     // Catch:{ Exception -> 0x0076 }
            r0.label = r3     // Catch:{ Exception -> 0x0076 }
            java.lang.Object r10 = r5.emit(r10, r0)     // Catch:{ Exception -> 0x0076 }
            if (r10 != r1) goto L_0x0074
            return r1
        L_0x0074:
            r10 = 1
            goto L_0x0084
        L_0x0076:
            r10 = move-exception
            goto L_0x007e
        L_0x0078:
            r5 = move-exception
            r8 = r0
            r0 = r10
            r10 = r5
            r5 = r1
            r1 = r8
        L_0x007e:
            java.lang.String r6 = "AggregateLaunchPoller"
            os.u.h(r6, r10)
            r10 = 0
        L_0x0084:
            in.swiggy.android.tejas.feature.launch.aggregated.AggregateLaunchPoller$PollingConfig r6 = r0.$pollingConfig
            r6.update(r10)
            in.swiggy.android.tejas.feature.launch.aggregated.AggregateLaunchPoller$PollingConfig r10 = r0.$pollingConfig
            boolean r10 = r10.pollImmediate()
            if (r10 != 0) goto L_0x00a2
            in.swiggy.android.tejas.feature.launch.aggregated.AggregateLaunchPoller$PollingConfig r10 = r0.$pollingConfig
            long r6 = r10.getDelay()
            r0.L$0 = r5
            r0.label = r2
            java.lang.Object r10 = wp0.q0.a(r6, r0)
            if (r10 != r1) goto L_0x00a2
            return r1
        L_0x00a2:
            r10 = r0
            r0 = r1
            r1 = r5
            in.swiggy.android.tejas.feature.launch.aggregated.AggregateLaunchPoller$PollingConfig r5 = r10.$pollingConfig
            boolean r5 = r5.getContinuePoll()
            if (r5 != 0) goto L_0x0049
            bp0.k r10 = bp0.k.f22762a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.launch.aggregated.AggregateLaunchPoller$fireAggregatedLaunchApi$pollingFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
