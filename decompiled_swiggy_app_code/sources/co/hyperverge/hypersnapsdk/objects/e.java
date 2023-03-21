package co.hyperverge.hypersnapsdk.objects;

import com.google.gson.annotations.SerializedName;
import java.util.Date;

/* compiled from: IPAddress */
public class e {
    private Date createdAt;
    @SerializedName("geoDetails")
    private a geoDetails;
    @SerializedName("ipAddress")

    /* renamed from: ip  reason: collision with root package name */
    private String f13339ip;

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!eVar.canEqual(this)) {
            return false;
        }
        String ip2 = getIp();
        String ip3 = eVar.getIp();
        if (ip2 != null ? !ip2.equals(ip3) : ip3 != null) {
            return false;
        }
        a geoDetails2 = getGeoDetails();
        a geoDetails3 = eVar.getGeoDetails();
        if (geoDetails2 != null ? !geoDetails2.equals(geoDetails3) : geoDetails3 != null) {
            return false;
        }
        Date createdAt2 = getCreatedAt();
        Date createdAt3 = eVar.getCreatedAt();
        return createdAt2 != null ? createdAt2.equals(createdAt3) : createdAt3 == null;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public a getGeoDetails() {
        return this.geoDetails;
    }

    public String getIp() {
        return this.f13339ip;
    }

    public int hashCode() {
        String ip2 = getIp();
        int i11 = 43;
        int hashCode = ip2 == null ? 43 : ip2.hashCode();
        a geoDetails2 = getGeoDetails();
        int hashCode2 = ((hashCode + 59) * 59) + (geoDetails2 == null ? 43 : geoDetails2.hashCode());
        Date createdAt2 = getCreatedAt();
        int i12 = hashCode2 * 59;
        if (createdAt2 != null) {
            i11 = createdAt2.hashCode();
        }
        return i12 + i11;
    }

    public void setCreatedAt(Date date) {
        this.createdAt = date;
    }

    public void setGeoDetails(a aVar) {
        this.geoDetails = aVar;
    }

    public void setIp(String str) {
        this.f13339ip = str;
    }

    public String toString() {
        return "IPAddress(ip=" + getIp() + ", geoDetails=" + getGeoDetails() + ", createdAt=" + getCreatedAt() + ")";
    }
}
