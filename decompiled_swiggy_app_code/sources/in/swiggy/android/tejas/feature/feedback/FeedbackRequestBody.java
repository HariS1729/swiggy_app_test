package in.swiggy.android.tejas.feature.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: FeedbackRequestBody.kt */
public final class FeedbackRequestBody implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR((i) null);
    @SerializedName("comments")
    private String comments;
    @SerializedName("order_job_id")
    private Long orderJobId;
    @SerializedName("ratings")
    private List<Rating> rating;

    /* compiled from: FeedbackRequestBody.kt */
    public static final class CREATOR implements Parcelable.Creator<FeedbackRequestBody> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(i iVar) {
            this();
        }

        public FeedbackRequestBody createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            return new FeedbackRequestBody(parcel);
        }

        public FeedbackRequestBody[] newArray(int i11) {
            return new FeedbackRequestBody[i11];
        }
    }

    public FeedbackRequestBody() {
        this((Long) null, (List) null, (String) null, 7, (i) null);
    }

    public FeedbackRequestBody(Long l11, List<Rating> list, String str) {
        this.orderJobId = l11;
        this.rating = list;
        this.comments = str;
    }

    public static /* synthetic */ FeedbackRequestBody copy$default(FeedbackRequestBody feedbackRequestBody, Long l11, List<Rating> list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = feedbackRequestBody.orderJobId;
        }
        if ((i11 & 2) != 0) {
            list = feedbackRequestBody.rating;
        }
        if ((i11 & 4) != 0) {
            str = feedbackRequestBody.comments;
        }
        return feedbackRequestBody.copy(l11, list, str);
    }

    public final Long component1() {
        return this.orderJobId;
    }

    public final List<Rating> component2() {
        return this.rating;
    }

    public final String component3() {
        return this.comments;
    }

    public final FeedbackRequestBody copy(Long l11, List<Rating> list, String str) {
        return new FeedbackRequestBody(l11, list, str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackRequestBody)) {
            return false;
        }
        FeedbackRequestBody feedbackRequestBody = (FeedbackRequestBody) obj;
        return p.e(this.orderJobId, feedbackRequestBody.orderJobId) && p.e(this.rating, feedbackRequestBody.rating) && p.e(this.comments, feedbackRequestBody.comments);
    }

    public final String getComments() {
        return this.comments;
    }

    public final Long getOrderJobId() {
        return this.orderJobId;
    }

    public final List<Rating> getRating() {
        return this.rating;
    }

    public int hashCode() {
        Long l11 = this.orderJobId;
        int i11 = 0;
        int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        List<Rating> list = this.rating;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.comments;
        if (str != null) {
            i11 = str.hashCode();
        }
        return hashCode2 + i11;
    }

    public final void setComments(String str) {
        this.comments = str;
    }

    public final void setOrderJobId(Long l11) {
        this.orderJobId = l11;
    }

    public final void setRating(List<Rating> list) {
        this.rating = list;
    }

    public String toString() {
        return "FeedbackRequestBody(orderJobId=" + this.orderJobId + ", rating=" + this.rating + ", comments=" + this.comments + ')';
    }

    public void writeToParcel(Parcel parcel, int i11) {
        p.j(parcel, "parcel");
        parcel.writeValue(this.orderJobId);
        parcel.writeTypedList(this.rating);
        parcel.writeString(this.comments);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FeedbackRequestBody(Long l11, List list, String str, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : l11, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : str);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FeedbackRequestBody(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.p.j(r3, r0)
            java.lang.Class r0 = java.lang.Long.TYPE
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r3.readValue(r0)
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 == 0) goto L_0x0016
            java.lang.Long r0 = (java.lang.Long) r0
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            in.swiggy.android.tejas.feature.feedback.Rating$CREATOR r1 = in.swiggy.android.tejas.feature.feedback.Rating.CREATOR
            java.util.ArrayList r1 = r3.createTypedArrayList(r1)
            java.lang.String r3 = r3.readString()
            r2.<init>(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.feedback.FeedbackRequestBody.<init>(android.os.Parcel):void");
    }
}
