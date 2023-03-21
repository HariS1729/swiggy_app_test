package in.swiggy.android.repositories.saveablecontexts;

import in.swiggy.android.tejas.feature.address.model.Address;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: DataSharingData.kt */
public final class DataSharingData {
    public static final a Companion = new a((i) null);
    /* access modifiers changed from: private */
    public static final String DATA_JSON = "dataSharingJson";
    private List<Address> addressList;
    private String authToken;
    private String customerId;
    private String email;
    private String name;
    private String phoneNumber;
    private String sessionId;
    private String tid;
    private String token;

    /* compiled from: DataSharingData.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final String a() {
            return DataSharingData.DATA_JSON;
        }
    }

    public DataSharingData(String str, String str2, String str3, String str4, String str5, String str6, List<Address> list, String str7, String str8) {
        this.name = str;
        this.phoneNumber = str2;
        this.email = str3;
        this.tid = str4;
        this.token = str5;
        this.customerId = str6;
        this.addressList = list;
        this.authToken = str7;
        this.sessionId = str8;
    }

    public static /* synthetic */ DataSharingData copy$default(DataSharingData dataSharingData, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, int i11, Object obj) {
        DataSharingData dataSharingData2 = dataSharingData;
        int i12 = i11;
        return dataSharingData.copy((i12 & 1) != 0 ? dataSharingData2.name : str, (i12 & 2) != 0 ? dataSharingData2.phoneNumber : str2, (i12 & 4) != 0 ? dataSharingData2.email : str3, (i12 & 8) != 0 ? dataSharingData2.tid : str4, (i12 & 16) != 0 ? dataSharingData2.token : str5, (i12 & 32) != 0 ? dataSharingData2.customerId : str6, (i12 & 64) != 0 ? dataSharingData2.addressList : list, (i12 & 128) != 0 ? dataSharingData2.authToken : str7, (i12 & 256) != 0 ? dataSharingData2.sessionId : str8);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.phoneNumber;
    }

    public final String component3() {
        return this.email;
    }

    public final String component4() {
        return this.tid;
    }

    public final String component5() {
        return this.token;
    }

    public final String component6() {
        return this.customerId;
    }

    public final List<Address> component7() {
        return this.addressList;
    }

    public final String component8() {
        return this.authToken;
    }

    public final String component9() {
        return this.sessionId;
    }

    public final DataSharingData copy(String str, String str2, String str3, String str4, String str5, String str6, List<Address> list, String str7, String str8) {
        return new DataSharingData(str, str2, str3, str4, str5, str6, list, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataSharingData)) {
            return false;
        }
        DataSharingData dataSharingData = (DataSharingData) obj;
        return p.e(this.name, dataSharingData.name) && p.e(this.phoneNumber, dataSharingData.phoneNumber) && p.e(this.email, dataSharingData.email) && p.e(this.tid, dataSharingData.tid) && p.e(this.token, dataSharingData.token) && p.e(this.customerId, dataSharingData.customerId) && p.e(this.addressList, dataSharingData.addressList) && p.e(this.authToken, dataSharingData.authToken) && p.e(this.sessionId, dataSharingData.sessionId);
    }

    public final List<Address> getAddressList() {
        return this.addressList;
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getTid() {
        return this.tid;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        String str = this.name;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.phoneNumber;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tid;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.token;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.customerId;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<Address> list = this.addressList;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.authToken;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.sessionId;
        if (str8 != null) {
            i11 = str8.hashCode();
        }
        return hashCode8 + i11;
    }

    public final void setAddressList(List<Address> list) {
        this.addressList = list;
    }

    public final void setAuthToken(String str) {
        this.authToken = str;
    }

    public final void setCustomerId(String str) {
        this.customerId = str;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public final void setTid(String str) {
        this.tid = str;
    }

    public final void setToken(String str) {
        this.token = str;
    }

    public String toString() {
        return "DataSharingData(name=" + this.name + ", phoneNumber=" + this.phoneNumber + ", email=" + this.email + ", tid=" + this.tid + ", token=" + this.token + ", customerId=" + this.customerId + ", addressList=" + this.addressList + ", authToken=" + this.authToken + ", sessionId=" + this.sessionId + ')';
    }
}
