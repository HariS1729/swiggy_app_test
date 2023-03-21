package in.swiggy.android.tejas.feature.launch.model.network;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: OrderItem.kt */
public final class OrderItem {
    @SerializedName("etaInMinutes")
    private Integer etamins;
    @SerializedName("order_job_id")
    private String orderJobId;
    @SerializedName("orderJobStatus")
    private String orderState;
    @SerializedName("order_type")
    private String orderType;
    @SerializedName("subtitle")
    private String subtitle;
    @SerializedName("title")
    private String title;

    public OrderItem() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, 63, (i) null);
    }

    public OrderItem(String str, String str2, String str3, String str4, String str5, Integer num) {
        this.orderJobId = str;
        this.title = str2;
        this.subtitle = str3;
        this.orderType = str4;
        this.orderState = str5;
        this.etamins = num;
    }

    public static /* synthetic */ OrderItem copy$default(OrderItem orderItem, String str, String str2, String str3, String str4, String str5, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderItem.orderJobId;
        }
        if ((i11 & 2) != 0) {
            str2 = orderItem.title;
        }
        String str6 = str2;
        if ((i11 & 4) != 0) {
            str3 = orderItem.subtitle;
        }
        String str7 = str3;
        if ((i11 & 8) != 0) {
            str4 = orderItem.orderType;
        }
        String str8 = str4;
        if ((i11 & 16) != 0) {
            str5 = orderItem.orderState;
        }
        String str9 = str5;
        if ((i11 & 32) != 0) {
            num = orderItem.etamins;
        }
        return orderItem.copy(str, str6, str7, str8, str9, num);
    }

    public final String component1() {
        return this.orderJobId;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final String component4() {
        return this.orderType;
    }

    public final String component5() {
        return this.orderState;
    }

    public final Integer component6() {
        return this.etamins;
    }

    public final OrderItem copy(String str, String str2, String str3, String str4, String str5, Integer num) {
        return new OrderItem(str, str2, str3, str4, str5, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderItem)) {
            return false;
        }
        OrderItem orderItem = (OrderItem) obj;
        return p.e(this.orderJobId, orderItem.orderJobId) && p.e(this.title, orderItem.title) && p.e(this.subtitle, orderItem.subtitle) && p.e(this.orderType, orderItem.orderType) && p.e(this.orderState, orderItem.orderState) && p.e(this.etamins, orderItem.etamins);
    }

    public final Integer getEtamins() {
        return this.etamins;
    }

    public final String getOrderJobId() {
        return this.orderJobId;
    }

    public final String getOrderState() {
        return this.orderState;
    }

    public final String getOrderType() {
        return this.orderType;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.orderJobId;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.orderType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.orderState;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.etamins;
        if (num != null) {
            i11 = num.hashCode();
        }
        return hashCode5 + i11;
    }

    public final void setEtamins(Integer num) {
        this.etamins = num;
    }

    public final void setOrderJobId(String str) {
        this.orderJobId = str;
    }

    public final void setOrderState(String str) {
        this.orderState = str;
    }

    public final void setOrderType(String str) {
        this.orderType = str;
    }

    public final void setSubtitle(String str) {
        this.subtitle = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        return "OrderItem(orderJobId=" + this.orderJobId + ", title=" + this.title + ", subtitle=" + this.subtitle + ", orderType=" + this.orderType + ", orderState=" + this.orderState + ", etamins=" + this.etamins + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OrderItem(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.Integer r11, int r12, kotlin.jvm.internal.i r13) {
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
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.launch.model.network.OrderItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, kotlin.jvm.internal.i):void");
    }
}
