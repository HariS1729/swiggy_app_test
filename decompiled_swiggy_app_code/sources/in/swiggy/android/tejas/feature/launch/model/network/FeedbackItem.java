package in.swiggy.android.tejas.feature.launch.model.network;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: FeedbackItem.kt */
public final class FeedbackItem {
    @SerializedName("empty_action_title")
    private String actionTitle;
    @SerializedName("disposition_title")
    private Map<String, String> dispositionTitles;
    @SerializedName("dispositions")
    private List<Disposition> dispositions;
    @SerializedName("title")
    private String title;
    @SerializedName("type")
    private String type;
    @SerializedName("type_id")
    private Integer typeId;

    public FeedbackItem() {
        this((Integer) null, (String) null, (String) null, (String) null, (Map) null, (List) null, 63, (i) null);
    }

    public FeedbackItem(Integer num, String str, String str2, String str3, Map<String, String> map, List<Disposition> list) {
        this.typeId = num;
        this.type = str;
        this.title = str2;
        this.actionTitle = str3;
        this.dispositionTitles = map;
        this.dispositions = list;
    }

    public static /* synthetic */ FeedbackItem copy$default(FeedbackItem feedbackItem, Integer num, String str, String str2, String str3, Map<String, String> map, List<Disposition> list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = feedbackItem.typeId;
        }
        if ((i11 & 2) != 0) {
            str = feedbackItem.type;
        }
        String str4 = str;
        if ((i11 & 4) != 0) {
            str2 = feedbackItem.title;
        }
        String str5 = str2;
        if ((i11 & 8) != 0) {
            str3 = feedbackItem.actionTitle;
        }
        String str6 = str3;
        if ((i11 & 16) != 0) {
            map = feedbackItem.dispositionTitles;
        }
        Map<String, String> map2 = map;
        if ((i11 & 32) != 0) {
            list = feedbackItem.dispositions;
        }
        return feedbackItem.copy(num, str4, str5, str6, map2, list);
    }

    public final Integer component1() {
        return this.typeId;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.actionTitle;
    }

    public final Map<String, String> component5() {
        return this.dispositionTitles;
    }

    public final List<Disposition> component6() {
        return this.dispositions;
    }

    public final FeedbackItem copy(Integer num, String str, String str2, String str3, Map<String, String> map, List<Disposition> list) {
        return new FeedbackItem(num, str, str2, str3, map, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackItem)) {
            return false;
        }
        FeedbackItem feedbackItem = (FeedbackItem) obj;
        return p.e(this.typeId, feedbackItem.typeId) && p.e(this.type, feedbackItem.type) && p.e(this.title, feedbackItem.title) && p.e(this.actionTitle, feedbackItem.actionTitle) && p.e(this.dispositionTitles, feedbackItem.dispositionTitles) && p.e(this.dispositions, feedbackItem.dispositions);
    }

    public final String getActionTitle() {
        return this.actionTitle;
    }

    public final Map<String, String> getDispositionTitles() {
        return this.dispositionTitles;
    }

    public final List<Disposition> getDispositions() {
        return this.dispositions;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final Integer getTypeId() {
        return this.typeId;
    }

    public int hashCode() {
        Integer num = this.typeId;
        int i11 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.type;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.actionTitle;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.dispositionTitles;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        List<Disposition> list = this.dispositions;
        if (list != null) {
            i11 = list.hashCode();
        }
        return hashCode5 + i11;
    }

    public final void setActionTitle(String str) {
        this.actionTitle = str;
    }

    public final void setDispositionTitles(Map<String, String> map) {
        this.dispositionTitles = map;
    }

    public final void setDispositions(List<Disposition> list) {
        this.dispositions = list;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setTypeId(Integer num) {
        this.typeId = num;
    }

    public String toString() {
        return "FeedbackItem(typeId=" + this.typeId + ", type=" + this.type + ", title=" + this.title + ", actionTitle=" + this.actionTitle + ", dispositionTitles=" + this.dispositionTitles + ", dispositions=" + this.dispositions + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FeedbackItem(java.lang.Integer r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.util.Map r10, java.util.List r11, int r12, kotlin.jvm.internal.i r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002a
            r12 = r0
            goto L_0x002b
        L_0x002a:
            r12 = r11
        L_0x002b:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.launch.model.network.FeedbackItem.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.List, int, kotlin.jvm.internal.i):void");
    }
}
