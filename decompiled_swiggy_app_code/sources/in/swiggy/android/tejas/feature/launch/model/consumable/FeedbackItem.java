package in.swiggy.android.tejas.feature.launch.model.consumable;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: FeedbackItem.kt */
public final class FeedbackItem implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR((i) null);
    private final Map<Integer, String> dispositionTitles;
    private final List<Disposition> dispositions;
    private final String emptyActionTitle;
    private final String title;
    private final String type;
    private final int typeId;

    /* compiled from: FeedbackItem.kt */
    public static final class CREATOR implements Parcelable.Creator<FeedbackItem> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(i iVar) {
            this();
        }

        public FeedbackItem createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            return new FeedbackItem(parcel);
        }

        public FeedbackItem[] newArray(int i11) {
            return new FeedbackItem[i11];
        }
    }

    public FeedbackItem(int i11, String str, String str2, String str3, Map<Integer, String> map, List<Disposition> list) {
        p.j(str, "type");
        p.j(str2, "title");
        p.j(str3, "emptyActionTitle");
        p.j(map, "dispositionTitles");
        p.j(list, "dispositions");
        this.typeId = i11;
        this.type = str;
        this.title = str2;
        this.emptyActionTitle = str3;
        this.dispositionTitles = map;
        this.dispositions = list;
    }

    public int describeContents() {
        return 0;
    }

    public final Map<Integer, String> getDispositionTitles() {
        return this.dispositionTitles;
    }

    public final List<Disposition> getDispositions() {
        return this.dispositions;
    }

    public final String getEmptyActionTitle() {
        return this.emptyActionTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final int getTypeId() {
        return this.typeId;
    }

    public void writeToParcel(Parcel parcel, int i11) {
        p.j(parcel, "parcel");
        parcel.writeInt(this.typeId);
        parcel.writeString(this.type);
        parcel.writeString(this.title);
        parcel.writeString(this.emptyActionTitle);
        parcel.writeMap(this.dispositionTitles);
        parcel.writeTypedList(this.dispositions);
    }

    public FeedbackItem(Parcel parcel) {
        p.j(parcel, "parcel");
        this.typeId = parcel.readInt();
        String readString = parcel.readString();
        String str = "";
        this.type = readString == null ? str : readString;
        String readString2 = parcel.readString();
        this.title = readString2 == null ? str : readString2;
        String readString3 = parcel.readString();
        this.emptyActionTitle = readString3 != null ? readString3 : str;
        HashMap hashMap = new HashMap();
        this.dispositionTitles = hashMap;
        parcel.readMap(hashMap, String.class.getClassLoader());
        List<Disposition> createTypedArrayList = parcel.createTypedArrayList(Disposition.CREATOR);
        this.dispositions = createTypedArrayList == null ? k.j() : createTypedArrayList;
    }
}
