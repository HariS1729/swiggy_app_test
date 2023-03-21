package in.swiggy.android.tejas.feature.address.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;

/* compiled from: SndAddressModels.kt */
public abstract class AddressInfo {
    @SerializedName("annotation")
    private String addressAnnotation;
    @SerializedName("address_line_2")
    private String addressLine2;
    @SerializedName("address")
    private String addressString;
    private String annotationString;
    @SerializedName("area")
    private String area;
    @SerializedName("city")
    private String city;
    @SerializedName("instructions")
    private String directionsToReach;
    @SerializedName("flat_no")
    private String flatNo;
    @SerializedName("landmark")
    private String landmark;
    @SerializedName("lat")
    private double latitude;
    private String launchSource;
    @SerializedName("lng")
    private double longitude;
    @SerializedName("name")
    private String name;
    @SerializedName("mobile")
    private String number;
    @SerializedName("reverse_geo_code_failed")
    private boolean reverseGeoCodeFailed;
    @SerializedName("voice_directions_s3_uri")
    private String voiceDirectionsUri;

    private AddressInfo() {
    }

    public /* synthetic */ AddressInfo(i iVar) {
        this();
    }

    public final String getAddressAnnotation() {
        return this.addressAnnotation;
    }

    public final String getAddressLine2() {
        return this.addressLine2;
    }

    public final String getAddressString() {
        return this.addressString;
    }

    public final String getAnnotationString() {
        return this.annotationString;
    }

    public final String getArea() {
        return this.area;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getDirectionsToReach() {
        return this.directionsToReach;
    }

    public final String getFlatNo() {
        return this.flatNo;
    }

    public final String getLandmark() {
        return this.landmark;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final String getLaunchSource() {
        return this.launchSource;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNumber() {
        return this.number;
    }

    public final boolean getReverseGeoCodeFailed() {
        return this.reverseGeoCodeFailed;
    }

    public abstract String getUserId();

    public final String getVoiceDirectionsUri() {
        return this.voiceDirectionsUri;
    }

    public final void setAddressAnnotation(String str) {
        this.addressAnnotation = str;
    }

    public final void setAddressLine2(String str) {
        this.addressLine2 = str;
    }

    public final void setAddressString(String str) {
        this.addressString = str;
    }

    public final void setAnnotationString(String str) {
        this.annotationString = str;
    }

    public final void setArea(String str) {
        this.area = str;
    }

    public final void setCity(String str) {
        this.city = str;
    }

    public final void setDirectionsToReach(String str) {
        this.directionsToReach = str;
    }

    public final void setFlatNo(String str) {
        this.flatNo = str;
    }

    public final void setLandmark(String str) {
        this.landmark = str;
    }

    public final void setLatitude(double d11) {
        this.latitude = d11;
    }

    public final void setLaunchSource(String str) {
        this.launchSource = str;
    }

    public final void setLongitude(double d11) {
        this.longitude = d11;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setNumber(String str) {
        this.number = str;
    }

    public final void setReverseGeoCodeFailed(boolean z11) {
        this.reverseGeoCodeFailed = z11;
    }

    public abstract void setUserId(String str);

    public final void setVoiceDirectionsUri(String str) {
        this.voiceDirectionsUri = str;
    }
}
