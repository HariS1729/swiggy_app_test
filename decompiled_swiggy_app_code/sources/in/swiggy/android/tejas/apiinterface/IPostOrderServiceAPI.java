package in.swiggy.android.tejas.apiinterface;

import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.api.models.SwiggyBaseResponse;
import in.swiggy.android.tejas.feature.chathead.models.ChatHeadResponse;
import in.swiggy.android.tejas.oldapi.models.BooleanReference;
import in.swiggy.android.tejas.oldapi.models.CheckFeedback;
import in.swiggy.android.tejas.oldapi.models.help.ConversationsResponse;
import in.swiggy.android.tejas.oldapi.models.help.OrderIssues;
import in.swiggy.android.tejas.oldapi.models.help.RecentOrderHelpResponseData;
import in.swiggy.android.tejas.oldapi.models.order.OrderList;
import in.swiggy.android.tejas.oldapi.models.track.PostableTrackCards;
import in.swiggy.android.tejas.oldapi.models.track.cards.TrackCardListResponseData;
import in.swiggy.android.tejas.oldapi.models.tracknew.DeliveryDetails;
import in.swiggy.android.tejas.oldapi.models.tracknew.TrackOrderResponseDataNew;
import in.swiggy.android.tejas.oldapi.network.requests.LogHelpInteractionRequest;
import in.swiggy.android.tejas.oldapi.network.requests.PostableFeedbackRatings;
import in.swiggy.android.tejas.oldapi.network.requests.PostableRedeemOrder;
import in.swiggy.android.tejas.oldapi.network.responses.HelpBaseResponse;
import in.swiggy.android.tejas.oldapi.network.responses.RedeemOrderResponseData;
import in.swiggy.android.tejas.oldapi.network.responses.SingleOrderResponseData;
import in.swiggy.android.tejas.oldapi.network.responses.track.TrackCafeOrderResponseData;
import in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData;
import retrofit2.http.Body;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

@Deprecated
public interface IPostOrderServiceAPI {
    SwiggyBaseResponse cancelOrder(@Path("order_id") String str);

    SwiggyApiResponse<CheckFeedback> checkFeedback();

    SwiggyBaseResponse fireTrackPixelUrl(@Url String str);

    SwiggyApiResponse<TrackCafeOrderResponseData> getCafeTrackedOrder(@Query("order_id") String str);

    SwiggyApiResponse<TrackCafeOrderResponseData> getCafeTrackedOrderPolling(@Query("order_id") String str, int i11);

    SwiggyApiResponse<ChatHeadResponse> getChatConversations(@Query("conversationStatus") String str);

    HelpBaseResponse<ConversationsResponse> getConversations(@Query("offset") int i11, @Query("limit") int i12);

    SwiggyApiResponse<DeliveryDetails> getDEDetailsByOrderId(@Query("order_id") String str);

    HelpBaseResponse<RecentOrderHelpResponseData> getHelpSupport();

    HelpBaseResponse<OrderIssues> getIssueTypeDetails(@Path("issueType") String str);

    HelpBaseResponse<ConversationsResponse> getOpenConversations(@Query("offset") int i11, @Query("limit") int i12, @Query("status") String str);

    SwiggyApiResponse<TrackOrderResponseDataNew> getOrderByIdNew(@Path("orderId") String str, @Query("track_delivery") boolean z11);

    HelpBaseResponse<OrderIssues> getOrderIssues(@Query("orderId") String str);

    SwiggyApiResponse<OrderList> getOrders(@Query("size") int i11, @Query("order_id") String str);

    SwiggyApiResponse<SingleOrderResponseData> getSingleOrderByOrderKey(@Query("order_key") String str);

    SwiggyApiResponse<TrackCardListResponseData> getTrackCardList(@Body PostableTrackCards postableTrackCards);

    SwiggyApiResponse<DeliveryDetails> getTrackedDEPollingNew(@Query("order_id") String str, long j);

    SwiggyApiResponse<TrackOrderResponseData> getTrackedOrder(@Query("order_id") String str);

    SwiggyApiResponse<TrackOrderResponseData> getTrackedOrderPolling(@Query("order_id") String str, int i11);

    SwiggyApiResponse<TrackOrderResponseDataNew> getTrackedOrderPollingNew(@Path("order_id") String str, @Query("track_delivery") BooleanReference booleanReference, long j);

    SwiggyBaseResponse logContactUsInteraction(@Body LogHelpInteractionRequest logHelpInteractionRequest);

    SwiggyApiResponse<RedeemOrderResponseData> redeemOrder(@Body PostableRedeemOrder postableRedeemOrder);

    SwiggyBaseResponse sendFeedbackRatings(@Body PostableFeedbackRatings postableFeedbackRatings);
}
