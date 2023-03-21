package in.swiggy.android.tejas.feature.launch.aggregated;

import bs.a;
import com.xiaomi.mipush.sdk.Constants;
import fp0.c;
import in.swiggy.android.tejas.ResponseTransformerManager;
import in.swiggy.android.tejas.api.IErrorChecker;
import in.swiggy.android.tejas.coroutineUtils.FlowErrorTransformer;
import in.swiggy.android.tejas.coroutineUtils.FlowExceptionTransformer;
import in.swiggy.android.tejas.coroutineUtils.FlowModelTransformer;
import in.swiggy.android.tejas.oldapi.network.requests.PostableAggregatedLaunchRequest;
import in.swiggy.android.tejas.oldapi.network.requests.PostableLaunchRequest;
import in.swiggy.android.tejas.oldapi.network.responses.track.TrackableOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.f;
import wp0.u0;

/* compiled from: AggregateLaunchPoller.kt */
public final class AggregateLaunchPoller {
    public static final Companion Companion = new Companion((i) null);
    private static final String TAG = "AggregateLaunchPoller";
    /* access modifiers changed from: private */
    public final IAggregatedCoroutineLaunchAPI api;
    /* access modifiers changed from: private */
    public AggregatedLaunchResponse existingResponse;

    /* compiled from: AggregateLaunchPoller.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public AggregateLaunchPoller(IAggregatedCoroutineLaunchAPI iAggregatedCoroutineLaunchAPI) {
        p.j(iAggregatedCoroutineLaunchAPI, "api");
        this.api = iAggregatedCoroutineLaunchAPI;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r0 = (r0 = r0.getFoodLaunchData()).getData();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean acceptNewResponse(in.swiggy.android.tejas.Response<in.swiggy.android.tejas.feature.launch.aggregated.AggregatedLaunchResponse> r9) {
        /*
            r8 = this;
            in.swiggy.android.tejas.feature.launch.aggregated.AggregatedLaunchResponse r0 = r8.existingResponse
            r1 = 1
            if (r0 == 0) goto L_0x0104
            r2 = 0
            if (r0 != 0) goto L_0x000a
        L_0x0008:
            r0 = r2
            goto L_0x001c
        L_0x000a:
            in.swiggy.android.tejas.api.models.SwiggyApiResponse r0 = r0.getFoodLaunchData()
            if (r0 != 0) goto L_0x0011
            goto L_0x0008
        L_0x0011:
            java.lang.Object r0 = r0.getData()
            in.swiggy.android.tejas.oldapi.network.responses.LaunchData r0 = (in.swiggy.android.tejas.oldapi.network.responses.LaunchData) r0
            if (r0 != 0) goto L_0x001a
            goto L_0x0008
        L_0x001a:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.mSettingsList
        L_0x001c:
            if (r0 != 0) goto L_0x0020
            goto L_0x0104
        L_0x0020:
            boolean r0 = r9 instanceof in.swiggy.android.tejas.Response.Success
            r3 = 0
            if (r0 != 0) goto L_0x0026
            return r3
        L_0x0026:
            in.swiggy.android.tejas.feature.launch.aggregated.AggregatedLaunchResponse r4 = r8.existingResponse
            r5 = 10
            if (r4 != 0) goto L_0x002e
        L_0x002c:
            r6 = r2
            goto L_0x0067
        L_0x002e:
            in.swiggy.android.tejas.api.models.SwiggyApiResponse r4 = r4.getFoodLaunchData()
            if (r4 != 0) goto L_0x0035
            goto L_0x002c
        L_0x0035:
            java.lang.Object r4 = r4.getData()
            in.swiggy.android.tejas.oldapi.network.responses.LaunchData r4 = (in.swiggy.android.tejas.oldapi.network.responses.LaunchData) r4
            if (r4 != 0) goto L_0x003e
            goto L_0x002c
        L_0x003e:
            in.swiggy.android.tejas.oldapi.network.responses.LaunchTrackOrderData r4 = r4.mTrackOrderData
            if (r4 != 0) goto L_0x0043
            goto L_0x002c
        L_0x0043:
            java.util.List<in.swiggy.android.tejas.oldapi.network.responses.track.TrackableOrder> r4 = r4.mTrackOrderList
            if (r4 != 0) goto L_0x0048
            goto L_0x002c
        L_0x0048:
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.l.u(r4, r5)
            r6.<init>(r7)
            java.util.Iterator r4 = r4.iterator()
        L_0x0055:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0067
            java.lang.Object r7 = r4.next()
            in.swiggy.android.tejas.oldapi.network.responses.track.TrackableOrder r7 = (in.swiggy.android.tejas.oldapi.network.responses.track.TrackableOrder) r7
            java.lang.String r7 = r7.mOrderId
            r6.add(r7)
            goto L_0x0055
        L_0x0067:
            if (r0 == 0) goto L_0x006d
            r4 = r9
            in.swiggy.android.tejas.Response$Success r4 = (in.swiggy.android.tejas.Response.Success) r4
            goto L_0x006e
        L_0x006d:
            r4 = r2
        L_0x006e:
            if (r4 != 0) goto L_0x0072
        L_0x0070:
            r7 = r2
            goto L_0x00b4
        L_0x0072:
            java.lang.Object r4 = r4.getResponse()
            in.swiggy.android.tejas.feature.launch.aggregated.AggregatedLaunchResponse r4 = (in.swiggy.android.tejas.feature.launch.aggregated.AggregatedLaunchResponse) r4
            if (r4 != 0) goto L_0x007b
            goto L_0x0070
        L_0x007b:
            in.swiggy.android.tejas.api.models.SwiggyApiResponse r4 = r4.getFoodLaunchData()
            if (r4 != 0) goto L_0x0082
            goto L_0x0070
        L_0x0082:
            java.lang.Object r4 = r4.getData()
            in.swiggy.android.tejas.oldapi.network.responses.LaunchData r4 = (in.swiggy.android.tejas.oldapi.network.responses.LaunchData) r4
            if (r4 != 0) goto L_0x008b
            goto L_0x0070
        L_0x008b:
            in.swiggy.android.tejas.oldapi.network.responses.LaunchTrackOrderData r4 = r4.mTrackOrderData
            if (r4 != 0) goto L_0x0090
            goto L_0x0070
        L_0x0090:
            java.util.List<in.swiggy.android.tejas.oldapi.network.responses.track.TrackableOrder> r4 = r4.mTrackOrderList
            if (r4 != 0) goto L_0x0095
            goto L_0x0070
        L_0x0095:
            java.util.ArrayList r7 = new java.util.ArrayList
            int r5 = kotlin.collections.l.u(r4, r5)
            r7.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x00a2:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00b4
            java.lang.Object r5 = r4.next()
            in.swiggy.android.tejas.oldapi.network.responses.track.TrackableOrder r5 = (in.swiggy.android.tejas.oldapi.network.responses.track.TrackableOrder) r5
            java.lang.String r5 = r5.mOrderId
            r7.add(r5)
            goto L_0x00a2
        L_0x00b4:
            boolean r4 = kotlin.jvm.internal.p.e(r6, r7)
            r4 = r4 ^ r1
            in.swiggy.android.tejas.feature.launch.aggregated.AggregatedLaunchResponse r5 = r8.existingResponse
            if (r5 != 0) goto L_0x00bf
        L_0x00bd:
            r5 = r2
            goto L_0x00d3
        L_0x00bf:
            in.swiggy.android.tejas.api.models.SwiggyApiResponse r5 = r5.getDashLaunchData()
            if (r5 != 0) goto L_0x00c6
            goto L_0x00bd
        L_0x00c6:
            java.lang.Object r5 = r5.getData()
            in.swiggy.android.tejas.feature.launch.model.network.LaunchResponse r5 = (in.swiggy.android.tejas.feature.launch.model.network.LaunchResponse) r5
            if (r5 != 0) goto L_0x00cf
            goto L_0x00bd
        L_0x00cf:
            in.swiggy.android.tejas.feature.launch.model.network.OrderItem r5 = r5.getLastActiveOrder()
        L_0x00d3:
            if (r0 == 0) goto L_0x00d8
            in.swiggy.android.tejas.Response$Success r9 = (in.swiggy.android.tejas.Response.Success) r9
            goto L_0x00d9
        L_0x00d8:
            r9 = r2
        L_0x00d9:
            if (r9 != 0) goto L_0x00dc
            goto L_0x00f9
        L_0x00dc:
            java.lang.Object r9 = r9.getResponse()
            in.swiggy.android.tejas.feature.launch.aggregated.AggregatedLaunchResponse r9 = (in.swiggy.android.tejas.feature.launch.aggregated.AggregatedLaunchResponse) r9
            if (r9 != 0) goto L_0x00e5
            goto L_0x00f9
        L_0x00e5:
            in.swiggy.android.tejas.api.models.SwiggyApiResponse r9 = r9.getDashLaunchData()
            if (r9 != 0) goto L_0x00ec
            goto L_0x00f9
        L_0x00ec:
            java.lang.Object r9 = r9.getData()
            in.swiggy.android.tejas.feature.launch.model.network.LaunchResponse r9 = (in.swiggy.android.tejas.feature.launch.model.network.LaunchResponse) r9
            if (r9 != 0) goto L_0x00f5
            goto L_0x00f9
        L_0x00f5:
            in.swiggy.android.tejas.feature.launch.model.network.OrderItem r2 = r9.getLastActiveOrder()
        L_0x00f9:
            boolean r9 = kotlin.jvm.internal.p.e(r5, r2)
            r9 = r9 ^ r1
            if (r4 != 0) goto L_0x0104
            if (r9 == 0) goto L_0x0103
            goto L_0x0104
        L_0x0103:
            r1 = 0
        L_0x0104:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.launch.aggregated.AggregateLaunchPoller.acceptNewResponse(in.swiggy.android.tejas.Response):boolean");
    }

    public static /* synthetic */ d fireAggregatedLaunchApi$default(AggregateLaunchPoller aggregateLaunchPoller, PostableAggregatedLaunchRequest postableAggregatedLaunchRequest, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        return aggregateLaunchPoller.fireAggregatedLaunchApi(postableAggregatedLaunchRequest, z11, z12);
    }

    public final d<AggregatedLaunchResponse> fireAggregatedLaunchApi(PostableAggregatedLaunchRequest postableAggregatedLaunchRequest, boolean z11, boolean z12) {
        PostableAggregatedLaunchRequest postableAggregatedLaunchRequest2 = postableAggregatedLaunchRequest;
        p.j(postableAggregatedLaunchRequest2, "aggregatedLaunchRequest");
        this.existingResponse = null;
        return f.A(f.x(new AggregateLaunchPoller$fireAggregatedLaunchApi$$inlined$transform$1(new AggregateLaunchPoller$fireAggregatedLaunchApi$$inlined$filter$1(ResponseTransformerManager.buildResponse$default(ResponseTransformerManager.INSTANCE, f.x(new AggregateLaunchPoller$fireAggregatedLaunchApi$pollingFlow$1(this, z12, new PollingConfig(0, (Integer) null, z11, postableAggregatedLaunchRequest2, 3, (i) null), (c<? super AggregateLaunchPoller$fireAggregatedLaunchApi$pollingFlow$1>) null)), false, (IErrorChecker) null, (FlowModelTransformer) null, (FlowErrorTransformer) null, (FlowExceptionTransformer) null, 62, (Object) null), this), (c) null, this)), u0.b());
    }

    /* compiled from: AggregateLaunchPoller.kt */
    private static final class PollingConfig {
        private boolean continuePoll;
        private long delay;
        private Integer errorCount;
        private PostableAggregatedLaunchRequest launchRequest;

        public PollingConfig(long j, Integer num, boolean z11, PostableAggregatedLaunchRequest postableAggregatedLaunchRequest) {
            p.j(postableAggregatedLaunchRequest, "launchRequest");
            this.delay = j;
            this.errorCount = num;
            this.continuePoll = z11;
            this.launchRequest = postableAggregatedLaunchRequest;
        }

        private final void convertToTrackOnlyRequest() {
            List<TrackableOrder> trackOrderList;
            Map f11 = x.f();
            PostableLaunchRequest foodRequest = this.launchRequest.getFoodRequest();
            ArrayList arrayList = null;
            if (!(foodRequest == null || (trackOrderList = foodRequest.getTrackOrderList()) == null)) {
                arrayList = new ArrayList(l.u(trackOrderList, 10));
                for (TrackableOrder trackableOrder : trackOrderList) {
                    arrayList.add(trackableOrder.mOrderId);
                }
            }
            this.launchRequest = new PostableAggregatedLaunchRequest(new PostableLaunchRequest(f11, arrayList), this.launchRequest.getDashRequest());
        }

        public static /* synthetic */ PollingConfig copy$default(PollingConfig pollingConfig, long j, Integer num, boolean z11, PostableAggregatedLaunchRequest postableAggregatedLaunchRequest, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j = pollingConfig.delay;
            }
            long j11 = j;
            if ((i11 & 2) != 0) {
                num = pollingConfig.errorCount;
            }
            Integer num2 = num;
            if ((i11 & 4) != 0) {
                z11 = pollingConfig.continuePoll;
            }
            boolean z12 = z11;
            if ((i11 & 8) != 0) {
                postableAggregatedLaunchRequest = pollingConfig.launchRequest;
            }
            return pollingConfig.copy(j11, num2, z12, postableAggregatedLaunchRequest);
        }

        private final void incrementDelay() {
            long j = this.delay;
            this.delay = j == 0 ? 30000 : j * ((long) 2);
        }

        public final long component1() {
            return this.delay;
        }

        public final Integer component2() {
            return this.errorCount;
        }

        public final boolean component3() {
            return this.continuePoll;
        }

        public final PostableAggregatedLaunchRequest component4() {
            return this.launchRequest;
        }

        public final PollingConfig copy(long j, Integer num, boolean z11, PostableAggregatedLaunchRequest postableAggregatedLaunchRequest) {
            p.j(postableAggregatedLaunchRequest, "launchRequest");
            return new PollingConfig(j, num, z11, postableAggregatedLaunchRequest);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PollingConfig)) {
                return false;
            }
            PollingConfig pollingConfig = (PollingConfig) obj;
            return this.delay == pollingConfig.delay && p.e(this.errorCount, pollingConfig.errorCount) && this.continuePoll == pollingConfig.continuePoll && p.e(this.launchRequest, pollingConfig.launchRequest);
        }

        public final boolean getContinuePoll() {
            return this.continuePoll;
        }

        public final long getDelay() {
            return this.delay;
        }

        public final Integer getErrorCount() {
            return this.errorCount;
        }

        public final PostableAggregatedLaunchRequest getLaunchRequest() {
            return this.launchRequest;
        }

        public int hashCode() {
            int a11 = a.a(this.delay) * 31;
            Integer num = this.errorCount;
            int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
            boolean z11 = this.continuePoll;
            if (z11) {
                z11 = true;
            }
            return ((hashCode + (z11 ? 1 : 0)) * 31) + this.launchRequest.hashCode();
        }

        public final boolean pollImmediate() {
            rp0.f fVar = new rp0.f(1, 2);
            Integer num = this.errorCount;
            return num != null && fVar.l(num.intValue());
        }

        public final void setContinuePoll(boolean z11) {
            this.continuePoll = z11;
        }

        public final void setDelay(long j) {
            this.delay = j;
        }

        public final void setErrorCount(Integer num) {
            this.errorCount = num;
        }

        public final void setLaunchRequest(PostableAggregatedLaunchRequest postableAggregatedLaunchRequest) {
            p.j(postableAggregatedLaunchRequest, "<set-?>");
            this.launchRequest = postableAggregatedLaunchRequest;
        }

        public String toString() {
            return "PollingConfig(delay=" + this.delay + ", errorCount=" + this.errorCount + ", continuePoll=" + this.continuePoll + ", launchRequest=" + this.launchRequest + ')';
        }

        public final void update(boolean z11) {
            boolean z12 = true;
            Integer num = null;
            if (z11) {
                convertToTrackOnlyRequest();
                incrementDelay();
            } else {
                Integer num2 = this.errorCount;
                int intValue = (num2 == null ? 0 : num2.intValue()) + 1;
                if (intValue > 2) {
                    incrementDelay();
                } else {
                    num = Integer.valueOf(intValue);
                }
            }
            this.errorCount = num;
            if (this.delay >= Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL) {
                z12 = false;
            }
            this.continuePoll = z12;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PollingConfig(long j, Integer num, boolean z11, PostableAggregatedLaunchRequest postableAggregatedLaunchRequest, int i11, i iVar) {
            this((i11 & 1) != 0 ? 0 : j, (i11 & 2) != 0 ? null : num, z11, postableAggregatedLaunchRequest);
        }
    }
}
