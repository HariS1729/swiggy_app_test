package in.swiggy.android.tejas.feature.launch.model.network;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: FeedbackResponse.kt */
public final class FeedbackResponse {
    @SerializedName("rating_dispositions")
    private List<FeedbackItem> feedbackItems;
    @SerializedName("feedbackSubTitle")
    private String feedbackSubtitle;
    @SerializedName("feedbackTitle")
    private String feedbackTitle;
    @SerializedName("order_job_id")
    private Long orderJobId;

    public FeedbackResponse() {
        this((Long) null, (String) null, (String) null, (List) null, 15, (i) null);
    }

    public FeedbackResponse(Long l11, String str, String str2, List<FeedbackItem> list) {
        this.orderJobId = l11;
        this.feedbackTitle = str;
        this.feedbackSubtitle = str2;
        this.feedbackItems = list;
    }

    public static /* synthetic */ FeedbackResponse copy$default(FeedbackResponse feedbackResponse, Long l11, String str, String str2, List<FeedbackItem> list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = feedbackResponse.orderJobId;
        }
        if ((i11 & 2) != 0) {
            str = feedbackResponse.feedbackTitle;
        }
        if ((i11 & 4) != 0) {
            str2 = feedbackResponse.feedbackSubtitle;
        }
        if ((i11 & 8) != 0) {
            list = feedbackResponse.feedbackItems;
        }
        return feedbackResponse.copy(l11, str, str2, list);
    }

    public final Long component1() {
        return this.orderJobId;
    }

    public final String component2() {
        return this.feedbackTitle;
    }

    public final String component3() {
        return this.feedbackSubtitle;
    }

    public final List<FeedbackItem> component4() {
        return this.feedbackItems;
    }

    public final FeedbackResponse copy(Long l11, String str, String str2, List<FeedbackItem> list) {
        return new FeedbackResponse(l11, str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackResponse)) {
            return false;
        }
        FeedbackResponse feedbackResponse = (FeedbackResponse) obj;
        return p.e(this.orderJobId, feedbackResponse.orderJobId) && p.e(this.feedbackTitle, feedbackResponse.feedbackTitle) && p.e(this.feedbackSubtitle, feedbackResponse.feedbackSubtitle) && p.e(this.feedbackItems, feedbackResponse.feedbackItems);
    }

    public final List<FeedbackItem> getFeedbackItems() {
        return this.feedbackItems;
    }

    public final String getFeedbackSubtitle() {
        return this.feedbackSubtitle;
    }

    public final String getFeedbackTitle() {
        return this.feedbackTitle;
    }

    public final Long getOrderJobId() {
        return this.orderJobId;
    }

    public int hashCode() {
        Long l11 = this.orderJobId;
        int i11 = 0;
        int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        String str = this.feedbackTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.feedbackSubtitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<FeedbackItem> list = this.feedbackItems;
        if (list != null) {
            i11 = list.hashCode();
        }
        return hashCode3 + i11;
    }

    public final void setFeedbackItems(List<FeedbackItem> list) {
        this.feedbackItems = list;
    }

    public final void setFeedbackSubtitle(String str) {
        this.feedbackSubtitle = str;
    }

    public final void setFeedbackTitle(String str) {
        this.feedbackTitle = str;
    }

    public final void setOrderJobId(Long l11) {
        this.orderJobId = l11;
    }

    public String toString() {
        return "FeedbackResponse(orderJobId=" + this.orderJobId + ", feedbackTitle=" + this.feedbackTitle + ", feedbackSubtitle=" + this.feedbackSubtitle + ", feedbackItems=" + this.feedbackItems + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FeedbackResponse(Long l11, String str, String str2, List list, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : l11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : list);
    }
}
