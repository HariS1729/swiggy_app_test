package in.swiggy.android.tejas.feature.launch.model.network;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: LaunchResponse.kt */
public final class LaunchResponse {
    @SerializedName("last_active_order")
    private OrderItem lastActiveOrder;
    @SerializedName("last_completed_order")
    private FeedbackResponse lastCompletedOrder;

    public LaunchResponse() {
        this((OrderItem) null, (FeedbackResponse) null, 3, (i) null);
    }

    public LaunchResponse(OrderItem orderItem, FeedbackResponse feedbackResponse) {
        this.lastActiveOrder = orderItem;
        this.lastCompletedOrder = feedbackResponse;
    }

    public static /* synthetic */ LaunchResponse copy$default(LaunchResponse launchResponse, OrderItem orderItem, FeedbackResponse feedbackResponse, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            orderItem = launchResponse.lastActiveOrder;
        }
        if ((i11 & 2) != 0) {
            feedbackResponse = launchResponse.lastCompletedOrder;
        }
        return launchResponse.copy(orderItem, feedbackResponse);
    }

    public final OrderItem component1() {
        return this.lastActiveOrder;
    }

    public final FeedbackResponse component2() {
        return this.lastCompletedOrder;
    }

    public final LaunchResponse copy(OrderItem orderItem, FeedbackResponse feedbackResponse) {
        return new LaunchResponse(orderItem, feedbackResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LaunchResponse)) {
            return false;
        }
        LaunchResponse launchResponse = (LaunchResponse) obj;
        return p.e(this.lastActiveOrder, launchResponse.lastActiveOrder) && p.e(this.lastCompletedOrder, launchResponse.lastCompletedOrder);
    }

    public final OrderItem getLastActiveOrder() {
        return this.lastActiveOrder;
    }

    public final FeedbackResponse getLastCompletedOrder() {
        return this.lastCompletedOrder;
    }

    public int hashCode() {
        OrderItem orderItem = this.lastActiveOrder;
        int i11 = 0;
        int hashCode = (orderItem == null ? 0 : orderItem.hashCode()) * 31;
        FeedbackResponse feedbackResponse = this.lastCompletedOrder;
        if (feedbackResponse != null) {
            i11 = feedbackResponse.hashCode();
        }
        return hashCode + i11;
    }

    public final void setLastActiveOrder(OrderItem orderItem) {
        this.lastActiveOrder = orderItem;
    }

    public final void setLastCompletedOrder(FeedbackResponse feedbackResponse) {
        this.lastCompletedOrder = feedbackResponse;
    }

    public String toString() {
        return "LaunchResponse(lastActiveOrder=" + this.lastActiveOrder + ", lastCompletedOrder=" + this.lastCompletedOrder + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LaunchResponse(OrderItem orderItem, FeedbackResponse feedbackResponse, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : orderItem, (i11 & 2) != 0 ? null : feedbackResponse);
    }
}
