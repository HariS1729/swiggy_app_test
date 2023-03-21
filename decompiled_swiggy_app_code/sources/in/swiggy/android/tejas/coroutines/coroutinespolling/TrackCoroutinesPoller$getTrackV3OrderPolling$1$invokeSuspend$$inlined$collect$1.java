package in.swiggy.android.tejas.coroutines.coroutinespolling;

import bp0.k;
import com.swiggy.pos.service.grpc.v1.TrackServiceResponseV3;
import fp0.c;
import in.swiggy.android.tejas.feature.trackv3.TrackResponseV3;
import kotlinx.coroutines.flow.e;
import yp0.q;

/* compiled from: Collect.kt */
public final class TrackCoroutinesPoller$getTrackV3OrderPolling$1$invokeSuspend$$inlined$collect$1 implements e<TrackResponseV3<? extends TrackServiceResponseV3>> {
    final /* synthetic */ q $$this$channelFlow$inlined;

    public TrackCoroutinesPoller$getTrackV3OrderPolling$1$invokeSuspend$$inlined$collect$1(q qVar) {
        this.$$this$channelFlow$inlined = qVar;
    }

    public Object emit(TrackResponseV3<? extends TrackServiceResponseV3> trackResponseV3, c<? super k> cVar) {
        Object m11 = this.$$this$channelFlow$inlined.m(trackResponseV3, cVar);
        return m11 == b.d() ? m11 : k.f22762a;
    }
}
