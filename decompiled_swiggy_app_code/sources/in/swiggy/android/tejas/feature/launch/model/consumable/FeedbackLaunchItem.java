package in.swiggy.android.tejas.feature.launch.model.consumable;

import android.os.Parcel;
import android.os.Parcelable;
import bs.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: FeedbackLaunchItem.kt */
public final class FeedbackLaunchItem extends LaunchItem implements Parcelable {
    public static final Parcelable.Creator<FeedbackLaunchItem> CREATOR = new Creator();
    private final List<FeedbackItem> feedbackItems;
    private final String feedbackSubtitle;
    private final String feedbackTitle;
    private final long orderJobId;

    /* compiled from: FeedbackLaunchItem.kt */
    public static final class Creator implements Parcelable.Creator<FeedbackLaunchItem> {
        public final FeedbackLaunchItem createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                arrayList.add(parcel.readParcelable(FeedbackLaunchItem.class.getClassLoader()));
            }
            return new FeedbackLaunchItem(readLong, readString, readString2, arrayList);
        }

        public final FeedbackLaunchItem[] newArray(int i11) {
            return new FeedbackLaunchItem[i11];
        }
    }

    public FeedbackLaunchItem(long j, String str, String str2, List<FeedbackItem> list) {
        p.j(list, "feedbackItems");
        this.orderJobId = j;
        this.feedbackTitle = str;
        this.feedbackSubtitle = str2;
        this.feedbackItems = list;
    }

    public static /* synthetic */ FeedbackLaunchItem copy$default(FeedbackLaunchItem feedbackLaunchItem, long j, String str, String str2, List<FeedbackItem> list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j = feedbackLaunchItem.orderJobId;
        }
        long j11 = j;
        if ((i11 & 2) != 0) {
            str = feedbackLaunchItem.feedbackTitle;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            str2 = feedbackLaunchItem.feedbackSubtitle;
        }
        String str4 = str2;
        if ((i11 & 8) != 0) {
            list = feedbackLaunchItem.feedbackItems;
        }
        return feedbackLaunchItem.copy(j11, str3, str4, list);
    }

    public final long component1() {
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

    public final FeedbackLaunchItem copy(long j, String str, String str2, List<FeedbackItem> list) {
        p.j(list, "feedbackItems");
        return new FeedbackLaunchItem(j, str, str2, list);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackLaunchItem)) {
            return false;
        }
        FeedbackLaunchItem feedbackLaunchItem = (FeedbackLaunchItem) obj;
        return this.orderJobId == feedbackLaunchItem.orderJobId && p.e(this.feedbackTitle, feedbackLaunchItem.feedbackTitle) && p.e(this.feedbackSubtitle, feedbackLaunchItem.feedbackSubtitle) && p.e(this.feedbackItems, feedbackLaunchItem.feedbackItems);
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

    public final long getOrderJobId() {
        return this.orderJobId;
    }

    public int hashCode() {
        int a11 = a.a(this.orderJobId) * 31;
        String str = this.feedbackTitle;
        int i11 = 0;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.feedbackSubtitle;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return ((hashCode + i11) * 31) + this.feedbackItems.hashCode();
    }

    public String toString() {
        return "FeedbackLaunchItem(orderJobId=" + this.orderJobId + ", feedbackTitle=" + this.feedbackTitle + ", feedbackSubtitle=" + this.feedbackSubtitle + ", feedbackItems=" + this.feedbackItems + ')';
    }

    public void writeToParcel(Parcel parcel, int i11) {
        p.j(parcel, "out");
        parcel.writeLong(this.orderJobId);
        parcel.writeString(this.feedbackTitle);
        parcel.writeString(this.feedbackSubtitle);
        List<FeedbackItem> list = this.feedbackItems;
        parcel.writeInt(list.size());
        for (FeedbackItem writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i11);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FeedbackLaunchItem(long j, String str, String str2, List list, int i11, i iVar) {
        this(j, str, str2, (i11 & 8) != 0 ? new ArrayList() : list);
    }
}
