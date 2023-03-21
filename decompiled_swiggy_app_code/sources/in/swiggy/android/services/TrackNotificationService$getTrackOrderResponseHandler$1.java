package in.swiggy.android.services;

import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.oldapi.network.responses.handlers.TrackOrderResponseHandler;
import in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData;
import js.c;
import kotlin.jvm.internal.p;
import pl0.k;

/* compiled from: TrackNotificationService.kt */
public final class TrackNotificationService$getTrackOrderResponseHandler$1 extends TrackOrderResponseHandler {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TrackNotificationService f18690a;

    TrackNotificationService$getTrackOrderResponseHandler$1(TrackNotificationService trackNotificationService) {
        this.f18690a = trackNotificationService;
    }

    public void handleOnSuccess(SwiggyApiResponse<? extends TrackOrderResponseData> swiggyApiResponse) {
        p.j(swiggyApiResponse, "trackOrderResponse");
        c.n(swiggyApiResponse, this.f18690a.f18688i, this.f18690a.getContext(), new TrackNotificationService$getTrackOrderResponseHandler$1$handleOnSuccess$1(this.f18690a));
        TrackOrderResponseData trackOrderResponseData = (TrackOrderResponseData) swiggyApiResponse.getData();
        if (trackOrderResponseData != null) {
            this.f18690a.q(trackOrderResponseData);
        }
    }

    public void onComplete(SwiggyApiResponse<? extends TrackOrderResponseData> swiggyApiResponse) {
        p.j(swiggyApiResponse, "response");
    }

    public void onOrderCanceled(SwiggyApiResponse<? extends TrackOrderResponseData> swiggyApiResponse) {
        p.j(swiggyApiResponse, "trackOrderResponse");
        onOrderDelivered(swiggyApiResponse);
    }

    public void onOrderDelivered(SwiggyApiResponse<? extends TrackOrderResponseData> swiggyApiResponse) {
        p.j(swiggyApiResponse, "trackOrderResponse");
        if (((TrackOrderResponseData) swiggyApiResponse.getData()) != null) {
            TrackNotificationService trackNotificationService = this.f18690a;
            trackNotificationService.l().edit().putString("latest-track_response", swiggyApiResponse.toString()).apply();
            trackNotificationService.z();
            TrackNotificationService.f18680l.l(swiggyApiResponse, trackNotificationService);
        }
        k.i(this.f18690a);
    }

    public void onOtherErrors(SwiggyApiResponse<? extends TrackOrderResponseData> swiggyApiResponse) {
        p.j(swiggyApiResponse, "trackOrderResponse");
        onOrderDelivered(swiggyApiResponse);
    }
}
