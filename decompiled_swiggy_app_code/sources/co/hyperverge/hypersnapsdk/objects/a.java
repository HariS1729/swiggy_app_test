package co.hyperverge.hypersnapsdk.objects;

import com.google.gson.annotations.SerializedName;

/* compiled from: GeoDetails */
public class a {
    @SerializedName("as")

    /* renamed from: as  reason: collision with root package name */
    private String f13337as;
    @SerializedName("city")
    private String city;
    @SerializedName("country")
    private String country;
    @SerializedName("countryCode")
    private String countryCode;
    @SerializedName("isp")
    private String isp;
    @SerializedName("lat")
    private String latitude;
    @SerializedName("long")
    private String longitude;
    @SerializedName("org")

    /* renamed from: org  reason: collision with root package name */
    private String f13338org;
    @SerializedName("query")
    private String query;
    @SerializedName("region")
    private String region;
    @SerializedName("regionName")
    private String regionName;
    @SerializedName("status")
    private String status;
    @SerializedName("timezone")
    private String timezone;
    @SerializedName("zip")
    private String zip;

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!aVar.canEqual(this)) {
            return false;
        }
        String as2 = getAs();
        String as3 = aVar.getAs();
        if (as2 != null ? !as2.equals(as3) : as3 != null) {
            return false;
        }
        String city2 = getCity();
        String city3 = aVar.getCity();
        if (city2 != null ? !city2.equals(city3) : city3 != null) {
            return false;
        }
        String country2 = getCountry();
        String country3 = aVar.getCountry();
        if (country2 != null ? !country2.equals(country3) : country3 != null) {
            return false;
        }
        String countryCode2 = getCountryCode();
        String countryCode3 = aVar.getCountryCode();
        if (countryCode2 != null ? !countryCode2.equals(countryCode3) : countryCode3 != null) {
            return false;
        }
        String isp2 = getIsp();
        String isp3 = aVar.getIsp();
        if (isp2 != null ? !isp2.equals(isp3) : isp3 != null) {
            return false;
        }
        String latitude2 = getLatitude();
        String latitude3 = aVar.getLatitude();
        if (latitude2 != null ? !latitude2.equals(latitude3) : latitude3 != null) {
            return false;
        }
        String longitude2 = getLongitude();
        String longitude3 = aVar.getLongitude();
        if (longitude2 != null ? !longitude2.equals(longitude3) : longitude3 != null) {
            return false;
        }
        String org2 = getOrg();
        String org3 = aVar.getOrg();
        if (org2 != null ? !org2.equals(org3) : org3 != null) {
            return false;
        }
        String query2 = getQuery();
        String query3 = aVar.getQuery();
        if (query2 != null ? !query2.equals(query3) : query3 != null) {
            return false;
        }
        String region2 = getRegion();
        String region3 = aVar.getRegion();
        if (region2 != null ? !region2.equals(region3) : region3 != null) {
            return false;
        }
        String regionName2 = getRegionName();
        String regionName3 = aVar.getRegionName();
        if (regionName2 != null ? !regionName2.equals(regionName3) : regionName3 != null) {
            return false;
        }
        String status2 = getStatus();
        String status3 = aVar.getStatus();
        if (status2 != null ? !status2.equals(status3) : status3 != null) {
            return false;
        }
        String timezone2 = getTimezone();
        String timezone3 = aVar.getTimezone();
        if (timezone2 != null ? !timezone2.equals(timezone3) : timezone3 != null) {
            return false;
        }
        String zip2 = getZip();
        String zip3 = aVar.getZip();
        return zip2 != null ? zip2.equals(zip3) : zip3 == null;
    }

    public String getAs() {
        return this.f13337as;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getIsp() {
        return this.isp;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public String getOrg() {
        return this.f13338org;
    }

    public String getQuery() {
        return this.query;
    }

    public String getRegion() {
        return this.region;
    }

    public String getRegionName() {
        return this.regionName;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public String getZip() {
        return this.zip;
    }

    public int hashCode() {
        String as2 = getAs();
        int i11 = 43;
        int hashCode = as2 == null ? 43 : as2.hashCode();
        String city2 = getCity();
        int hashCode2 = ((hashCode + 59) * 59) + (city2 == null ? 43 : city2.hashCode());
        String country2 = getCountry();
        int hashCode3 = (hashCode2 * 59) + (country2 == null ? 43 : country2.hashCode());
        String countryCode2 = getCountryCode();
        int hashCode4 = (hashCode3 * 59) + (countryCode2 == null ? 43 : countryCode2.hashCode());
        String isp2 = getIsp();
        int hashCode5 = (hashCode4 * 59) + (isp2 == null ? 43 : isp2.hashCode());
        String latitude2 = getLatitude();
        int hashCode6 = (hashCode5 * 59) + (latitude2 == null ? 43 : latitude2.hashCode());
        String longitude2 = getLongitude();
        int hashCode7 = (hashCode6 * 59) + (longitude2 == null ? 43 : longitude2.hashCode());
        String org2 = getOrg();
        int hashCode8 = (hashCode7 * 59) + (org2 == null ? 43 : org2.hashCode());
        String query2 = getQuery();
        int hashCode9 = (hashCode8 * 59) + (query2 == null ? 43 : query2.hashCode());
        String region2 = getRegion();
        int hashCode10 = (hashCode9 * 59) + (region2 == null ? 43 : region2.hashCode());
        String regionName2 = getRegionName();
        int hashCode11 = (hashCode10 * 59) + (regionName2 == null ? 43 : regionName2.hashCode());
        String status2 = getStatus();
        int hashCode12 = (hashCode11 * 59) + (status2 == null ? 43 : status2.hashCode());
        String timezone2 = getTimezone();
        int hashCode13 = (hashCode12 * 59) + (timezone2 == null ? 43 : timezone2.hashCode());
        String zip2 = getZip();
        int i12 = hashCode13 * 59;
        if (zip2 != null) {
            i11 = zip2.hashCode();
        }
        return i12 + i11;
    }

    public void setAs(String str) {
        this.f13337as = str;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setIsp(String str) {
        this.isp = str;
    }

    public void setLatitude(String str) {
        this.latitude = str;
    }

    public void setLongitude(String str) {
        this.longitude = str;
    }

    public void setOrg(String str) {
        this.f13338org = str;
    }

    public void setQuery(String str) {
        this.query = str;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public void setRegionName(String str) {
        this.regionName = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public void setZip(String str) {
        this.zip = str;
    }

    public String toString() {
        return "GeoDetails(as=" + getAs() + ", city=" + getCity() + ", country=" + getCountry() + ", countryCode=" + getCountryCode() + ", isp=" + getIsp() + ", latitude=" + getLatitude() + ", longitude=" + getLongitude() + ", org=" + getOrg() + ", query=" + getQuery() + ", region=" + getRegion() + ", regionName=" + getRegionName() + ", status=" + getStatus() + ", timezone=" + getTimezone() + ", zip=" + getZip() + ")";
    }
}
