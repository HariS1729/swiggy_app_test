package in.swiggy.android.tejas.feature.launch.aggregated;

import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.Response;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.e;

/* compiled from: SafeCollector.common.kt */
public final class AggregateLaunchPoller$fireAggregatedLaunchApi$$inlined$filter$1 implements d<Response<? extends AggregatedLaunchResponse>> {
    final /* synthetic */ d $this_unsafeTransform$inlined;
    final /* synthetic */ AggregateLaunchPoller this$0;

    public AggregateLaunchPoller$fireAggregatedLaunchApi$$inlined$filter$1(d dVar, AggregateLaunchPoller aggregateLaunchPoller) {
        this.$this_unsafeTransform$inlined = dVar;
        this.this$0 = aggregateLaunchPoller;
    }

    public Object collect(final e eVar, c cVar) {
        d dVar = this.$this_unsafeTransform$inlined;
        final AggregateLaunchPoller aggregateLaunchPoller = this.this$0;
        Object collect = dVar.collect(new e<Response<? extends AggregatedLaunchResponse>>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r6, fp0.c r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof in.swiggy.android.tejas.feature.launch.aggregated.AggregateLaunchPoller$fireAggregatedLaunchApi$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    in.swiggy.android.tejas.feature.launch.aggregated.AggregateLaunchPoller$fireAggregatedLaunchApi$$inlined$filter$1$2$1 r0 = (in.swiggy.android.tejas.feature.launch.aggregated.AggregateLaunchPoller$fireAggregatedLaunchApi$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    in.swiggy.android.tejas.feature.launch.aggregated.AggregateLaunchPoller$fireAggregatedLaunchApi$$inlined$filter$1$2$1 r0 = new in.swiggy.android.tejas.feature.launch.aggregated.AggregateLaunchPoller$fireAggregatedLaunchApi$$inlined$filter$1$2$1
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    bp0.g.b(r7)
                    goto L_0x004a
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    bp0.g.b(r7)
                    kotlinx.coroutines.flow.e r7 = r4
                    r2 = r6
                    in.swiggy.android.tejas.Response r2 = (in.swiggy.android.tejas.Response) r2
                    in.swiggy.android.tejas.feature.launch.aggregated.AggregateLaunchPoller r4 = r2
                    boolean r2 = r4.acceptNewResponse(r2)
                    if (r2 == 0) goto L_0x004a
                    r0.label = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x004a
                    return r1
                L_0x004a:
                    bp0.k r6 = bp0.k.f22762a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.launch.aggregated.AggregateLaunchPoller$fireAggregatedLaunchApi$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, fp0.c):java.lang.Object");
            }
        }, cVar);
        if (collect == b.d()) {
            return collect;
        }
        return k.f22762a;
    }
}
