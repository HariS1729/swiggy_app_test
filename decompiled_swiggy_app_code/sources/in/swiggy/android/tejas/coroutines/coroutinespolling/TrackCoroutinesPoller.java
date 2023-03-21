package in.swiggy.android.tejas.coroutines.coroutinespolling;

import com.swiggy.pos.service.grpc.v1.TrackDeliveryPartnerResponseV3;
import com.swiggy.pos.service.grpc.v1.TrackServiceResponseV3;
import fp0.c;
import in.swiggy.android.tejas.feature.trackv3.TrackPollerInput;
import in.swiggy.android.tejas.feature.trackv3.TrackResponseV3;
import in.swiggy.android.tejas.feature.trackv3.TrackV3Manager;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.f;

/* compiled from: TrackCoroutinesPoller.kt */
public final class TrackCoroutinesPoller {
    /* access modifiers changed from: private */
    public boolean fetchDeliveryInstructions;
    /* access modifiers changed from: private */
    public final TrackV3Manager trackV3Manager;

    public TrackCoroutinesPoller(TrackV3Manager trackV3Manager2) {
        p.j(trackV3Manager2, "trackV3Manager");
        this.trackV3Manager = trackV3Manager2;
    }

    public final d<TrackResponseV3<TrackDeliveryPartnerResponseV3>> getTrackV3DePolling(long j, String str) {
        p.j(str, "input");
        return f.h(new TrackCoroutinesPoller$getTrackV3DePolling$1(this, str, j, (c<? super TrackCoroutinesPoller$getTrackV3DePolling$1>) null));
    }

    public final d<TrackResponseV3<TrackServiceResponseV3>> getTrackV3OrderPolling(long j, TrackPollerInput trackPollerInput) {
        p.j(trackPollerInput, "input");
        this.fetchDeliveryInstructions = trackPollerInput.getForceFetchDelInstructions();
        return f.h(new TrackCoroutinesPoller$getTrackV3OrderPolling$1(this, trackPollerInput, j, (c<? super TrackCoroutinesPoller$getTrackV3OrderPolling$1>) null));
    }
}
