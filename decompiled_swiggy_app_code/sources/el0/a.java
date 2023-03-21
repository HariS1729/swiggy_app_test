package el0;

import com.swiggy.pos.service.grpc.v1.TrackServiceResponseV3;
import in.swiggy.android.tejas.feature.trackv3.TrackResponseV3;

/* compiled from: ITrackV3ResponseHandler.kt */
public interface a {
    void a(TrackResponseV3<TrackServiceResponseV3> trackResponseV3);

    String jobName();
}
