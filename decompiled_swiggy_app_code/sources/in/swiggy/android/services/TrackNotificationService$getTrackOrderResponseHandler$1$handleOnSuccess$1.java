package in.swiggy.android.services;

import android.content.Context;
import bp0.k;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.orderhelp.OrderHelpTransformer;
import in.swiggy.android.tejas.oldapi.models.order.Order;
import in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;

/* compiled from: TrackNotificationService.kt */
final class TrackNotificationService$getTrackOrderResponseHandler$1$handleOnSuccess$1 extends Lambda implements q<SwiggyApiResponse<? extends TrackOrderResponseData>, Order, Context, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TrackNotificationService f18691a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TrackNotificationService$getTrackOrderResponseHandler$1$handleOnSuccess$1(TrackNotificationService trackNotificationService) {
        super(3);
        this.f18691a = trackNotificationService;
    }

    /* renamed from: a */
    public final k invoke(SwiggyApiResponse<? extends TrackOrderResponseData> swiggyApiResponse, Order order, Context context) {
        p.j(swiggyApiResponse, "trackOrderResponse1");
        p.j(order, OrderHelpTransformer.ISSUE_TYPE_ORDER);
        p.j(context, LogCategory.CONTEXT);
        if (((TrackOrderResponseData) swiggyApiResponse.getData()) == null) {
            return null;
        }
        this.f18691a.l().edit().putString("latest-track_response", swiggyApiResponse.toString()).apply();
        TrackNotificationService.f18680l.n(swiggyApiResponse, order, context);
        return k.f22762a;
    }
}
