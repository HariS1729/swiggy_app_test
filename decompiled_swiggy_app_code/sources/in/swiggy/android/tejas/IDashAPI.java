package in.swiggy.android.tejas;

import ao0.d;
import ao0.s;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.api.models.SwiggyBaseResponse;
import in.swiggy.android.tejas.feature.feedback.FeedbackRequestBody;
import in.swiggy.android.tejas.feature.order.model.network.serialized.DashSerializedOrderResponse;
import in.swiggy.android.tejas.feature.statusupdate.model.OrderStatusUpdateRequest;
import in.swiggy.android.tejas.feature.timeline.model.TimelineResponseData;
import in.swiggy.android.tejas.feature.tracking.model.network.TrackingResponse;
import java.util.Map;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

/* compiled from: IDashAPI.kt */
public interface IDashAPI {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String DISMISS_RATING_API = "/api/v1/dash/rating/dismiss";
    public static final String LAUNCH_API = "/api/v1/dash/launch";
    public static final String OCS_PATH = "/api/v1/dash/oms/order/{id}/context";
    public static final String ORDER_HISTORY_SERVICE_API = "/api/v1/order/history";
    public static final String ORDER_STATUS_API = "/api/v1/dash/oms/order-job/{orderjob}/status";
    public static final String RATING_API = "/api/v1/dash/rating";
    public static final String SERVICEABILITY_URL = "/api/v1/dash/serviceable/status";
    public static final String TIMELINE_API = "/api/v1/timeline/orderjob/{orderJobID}";
    public static final String TIMELINE_BY_USER_TYPE_API = "/api/v1/timeline/{timelineUserType}/tracking/{trackingId}";
    public static final String TRACKING_API = "/api/v1/tracking/orderjob/{id}";

    /* compiled from: IDashAPI.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String DISMISS_RATING_API = "/api/v1/dash/rating/dismiss";
        public static final String LAUNCH_API = "/api/v1/dash/launch";
        public static final String OCS_PATH = "/api/v1/dash/oms/order/{id}/context";
        public static final String ORDER_HISTORY_SERVICE_API = "/api/v1/order/history";
        public static final String ORDER_STATUS_API = "/api/v1/dash/oms/order-job/{orderjob}/status";
        public static final String RATING_API = "/api/v1/dash/rating";
        public static final String SERVICEABILITY_URL = "/api/v1/dash/serviceable/status";
        public static final String TIMELINE_API = "/api/v1/timeline/orderjob/{orderJobID}";
        public static final String TIMELINE_BY_USER_TYPE_API = "/api/v1/timeline/{timelineUserType}/tracking/{trackingId}";
        public static final String TRACKING_API = "/api/v1/tracking/orderjob/{id}";

        private Companion() {
        }
    }

    /* compiled from: IDashAPI.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ d getTimeline$default(IDashAPI iDashAPI, String str, Long l11, String str2, Boolean bool, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    l11 = null;
                }
                if ((i11 & 4) != 0) {
                    str2 = null;
                }
                if ((i11 & 8) != 0) {
                    bool = null;
                }
                return iDashAPI.getTimeline(str, l11, str2, bool);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTimeline");
        }

        public static /* synthetic */ d getTimelineByUserType$default(IDashAPI iDashAPI, String str, String str2, Long l11, String str3, Boolean bool, int i11, Object obj) {
            if (obj == null) {
                return iDashAPI.getTimelineByUserType(str, str2, (i11 & 4) != 0 ? null : l11, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : bool);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTimelineByUserType");
        }

        public static /* synthetic */ d updateOrderStatus$default(IDashAPI iDashAPI, String str, OrderStatusUpdateRequest orderStatusUpdateRequest, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    orderStatusUpdateRequest = null;
                }
                return iDashAPI.updateOrderStatus(str, orderStatusUpdateRequest);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateOrderStatus");
        }
    }

    @GET("/api/v1/dash/serviceable/status")
    d<Response<SwiggyApiResponse<String>>> checkServiceability(@Query("storeId") String str, @Query("lat") double d11, @Query("lng") double d12);

    @POST("/api/v1/dash/rating/dismiss")
    s<Response<SwiggyApiResponse>> dismissDashRating(@Body Map<String, Long> map);

    @GET("/api/v1/dash/oms/order/{id}/context/ORDER_GROUP")
    d<Response<DashSerializedOrderResponse>> getOrderByGroupId(@Path("id") String str);

    @GET("/api/v1/dash/oms/order/{id}/context/ORDER")
    d<Response<DashSerializedOrderResponse>> getOrderById(@Path("id") String str);

    @GET("/api/v1/dash/oms/order/{id}/context/ORDER_JOB")
    d<Response<DashSerializedOrderResponse>> getOrderByJobId(@Path("id") String str);

    @GET("/api/v1/timeline/orderjob/{orderJobID}")
    d<SwiggyApiResponse<TimelineResponseData>> getTimeline(@Path("orderJobID") String str, @Query("updatedAt") Long l11, @Query("timelineVersion") String str2, @Query("popupInfoShown") Boolean bool);

    @GET("/api/v1/timeline/{timelineUserType}/tracking/{trackingId}")
    d<SwiggyApiResponse<TimelineResponseData>> getTimelineByUserType(@Path("timelineUserType") String str, @Path("trackingId") String str2, @Query("updatedAt") Long l11, @Query("timelineVersion") String str3, @Query("popupInfoShown") Boolean bool);

    @GET("/api/v1/tracking/orderjob/{id}")
    d<Response<SwiggyApiResponse<TrackingResponse>>> getTrackingData(@Path("id") String str);

    @POST("/api/v1/dash/rating")
    d<Response<SwiggyApiResponse>> sendFeedback(@Body FeedbackRequestBody feedbackRequestBody);

    @GET
    d<SwiggyBaseResponse> trackPixelUrl(@Url String str);

    @POST("/api/v1/dash/oms/order-job/{orderjob}/status")
    d<SwiggyApiResponse<Object>> updateOrderStatus(@Path("orderjob") String str, @Body OrderStatusUpdateRequest orderStatusUpdateRequest);
}
