package in.swiggy.android.tejas.feature.address.model;

import a0.h;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import in.swiggy.android.tejas.feature.address.model.AddressTag;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlace;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlaceGeometry;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlaceLocation;
import in.swiggy.android.tejas.oldapi.network.requests.PostableUpdatableAddress;
import java.io.Serializable;
import java.util.Objects;
import js.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import os.d0;
import os.g0;

@Instrumented
/* compiled from: Address.kt */
public final class Address implements Comparable<Object>, Parcelable, Serializable {
    public static final Parcelable.Creator<Address> CREATOR = new Creator();
    public static final Companion Companion = new Companion((i) null);
    @SerializedName("address_accuracy")
    private Integer addressAccuracy;
    @SerializedName("address_line_2")
    private String addressLine2;
    @SerializedName("address_nudge")
    private AddressNudge addressNudge;
    @SerializedName("address")
    private String addressString = "";
    @SerializedName("annotation")
    private String annotationString;
    /* access modifiers changed from: private */
    public int annotationTag = 3;
    @SerializedName("area")
    private String area = "";
    @SerializedName("city")
    private String city = "";
    @SerializedName("mobile")
    private String contactNumber = "";
    @SerializedName("instructions")
    private String directionsToReach;
    @SerializedName("estimated_sla")
    private Integer estimatedSla;
    private double finalSortScore;
    @SerializedName("flat_no")
    private String flatNo;
    private double haversineDistance;
    @SerializedName("id")

    /* renamed from: id  reason: collision with root package name */
    private String f20212id = "";
    @SerializedName("default")
    private boolean isDefault;
    @SerializedName("delivery_valid")
    private boolean isDeliveryValid;
    @SerializedName("selected")
    private boolean isListingSelected;
    @SerializedName("landmark")
    private String landmark;
    @SerializedName("lat")
    private double latitude;
    @SerializedName("lng")
    private double longitude;
    @SerializedName("estimated_sla_max")
    private Integer maxEstimatedSla;
    @SerializedName("estimated_sla_min")
    private Integer minEstimatedSla;
    @SerializedName("name")
    private String name;
    private double proximityScore;
    @SerializedName("recalculation_required")
    private boolean recalculationRequired;
    @SerializedName("restaurant_id")
    private String restaurantId;
    @SerializedName("reverse_geo_code_failed")
    private Boolean reverseGeoCodeFailed = Boolean.FALSE;
    @SerializedName("sla_message")
    private String slaMessageString;
    @SerializedName("sort_score")
    private Integer sortScore;
    private String subLocality;
    @SerializedName("voice_directions_s3_uri")
    private String voiceDirectionsUri;
    @SerializedName("weighted_order_share_score")
    private double weightedOrderShareScore;

    @Instrumented
    /* compiled from: Address.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
            if ((r0.length() == 0) != false) goto L_0x0032;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final in.swiggy.android.tejas.feature.address.model.Address fromJson(java.lang.String r4) {
            /*
                r3 = this;
                java.lang.String r0 = "json"
                kotlin.jvm.internal.p.j(r4, r0)
                com.google.gson.Gson r0 = os.g0.i()
                java.lang.Class<in.swiggy.android.tejas.feature.address.model.Address> r1 = in.swiggy.android.tejas.feature.address.model.Address.class
                boolean r2 = r0 instanceof com.google.gson.Gson
                if (r2 != 0) goto L_0x0014
                java.lang.Object r4 = r0.fromJson((java.lang.String) r4, r1)
                goto L_0x0018
            L_0x0014:
                java.lang.Object r4 = com.newrelic.agent.android.instrumentation.GsonInstrumentation.fromJson((com.google.gson.Gson) r0, (java.lang.String) r4, r1)
            L_0x0018:
                in.swiggy.android.tejas.feature.address.model.Address r4 = (in.swiggy.android.tejas.feature.address.model.Address) r4
                java.lang.String r0 = r4.getAnnotationString()
                if (r0 == 0) goto L_0x0032
                java.lang.String r0 = r4.getAnnotationString()
                kotlin.jvm.internal.p.g(r0)
                int r0 = r0.length()
                if (r0 != 0) goto L_0x002f
                r0 = 1
                goto L_0x0030
            L_0x002f:
                r0 = 0
            L_0x0030:
                if (r0 == 0) goto L_0x0037
            L_0x0032:
                java.lang.String r0 = "Other"
                r4.setAnnotationString(r0)
            L_0x0037:
                java.lang.String r0 = "address"
                kotlin.jvm.internal.p.i(r4, r0)
                java.lang.String r0 = r4.getAnnotationString()
                int r0 = r3.getAnnotationTagFromString(r0)
                r4.annotationTag = r0
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.address.model.Address.Companion.fromJson(java.lang.String):in.swiggy.android.tejas.feature.address.model.Address");
        }

        public final int getAnnotationTagFromString(String str) {
            if (o.x(AddressTag.TypeString.HOME_TAG_STRING, str, true)) {
                return 1;
            }
            if (o.x(AddressTag.TypeString.WORK_TAG_STRING, str, true)) {
                return 2;
            }
            return o.x(AddressTag.TypeString.FRIENDS_AND_FAMILY_TAG_STRING, str, true) ? 4 : 3;
        }

        public final Address newAddressFromGeocodedAddress(GeocodedAddress geocodedAddress) {
            p.j(geocodedAddress, "geocodedAddress");
            return updateFromGeocodedAddress(new Address(), geocodedAddress);
        }

        public final Address updateFromGeocodedAddress(Address address, GeocodedAddress geocodedAddress) {
            String str;
            p.j(address, "address");
            p.j(geocodedAddress, "geocodedAddress");
            address.setLatitude(geocodedAddress.getLatitude());
            address.setLongitude(geocodedAddress.getLongitude());
            address.setCity(geocodedAddress.getCity());
            address.setSubLocality(geocodedAddress.getSubLocality());
            address.setArea(geocodedAddress.getArea());
            if (d0.g(geocodedAddress.getRoofTopArea())) {
                str = geocodedAddress.getRoofTopArea();
            } else {
                str = geocodedAddress.getDisplayableAddress();
            }
            address.setAddressString(str);
            return address;
        }
    }

    /* compiled from: Address.kt */
    public static final class Creator implements Parcelable.Creator<Address> {
        public final Address createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            parcel.readInt();
            return new Address();
        }

        public final Address[] newArray(int i11) {
            return new Address[i11];
        }
    }

    public static /* synthetic */ void getFinalSortScore$annotations() {
    }

    public static /* synthetic */ void getHaversineDistance$annotations() {
    }

    public static /* synthetic */ void getProximityScore$annotations() {
    }

    public int compareTo(Object obj) {
        p.j(obj, "other");
        int i11 = this.annotationTag - ((Address) obj).annotationTag;
        if (i11 > 0) {
            return 1;
        }
        return i11 < 0 ? -1 : 0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.e(Address.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type in.swiggy.android.tejas.feature.address.model.Address");
        Address address = (Address) obj;
        if (!p.e(this.name, address.name) || !p.e(this.landmark, address.landmark) || !p.e(this.flatNo, address.flatNo) || !p.e(this.f20212id, address.f20212id) || !p.e(this.area, address.area) || !p.e(this.city, address.city) || !p.e(this.addressString, address.addressString) || this.isDefault != address.isDefault || !p.e(this.contactNumber, address.contactNumber)) {
            return false;
        }
        if (!(this.latitude == address.latitude)) {
            return false;
        }
        if (!(this.longitude == address.longitude) || this.isDeliveryValid != address.isDeliveryValid || !p.e(this.estimatedSla, address.estimatedSla) || !p.e(this.minEstimatedSla, address.minEstimatedSla) || !p.e(this.maxEstimatedSla, address.maxEstimatedSla) || !p.e(this.slaMessageString, address.slaMessageString) || !p.e(this.reverseGeoCodeFailed, address.reverseGeoCodeFailed) || !p.e(this.annotationString, address.annotationString) || this.recalculationRequired != address.recalculationRequired || this.annotationTag != address.annotationTag || !p.e(this.subLocality, address.subLocality) || !p.e(this.voiceDirectionsUri, address.voiceDirectionsUri)) {
            return false;
        }
        return (this.weightedOrderShareScore > address.weightedOrderShareScore ? 1 : (this.weightedOrderShareScore == address.weightedOrderShareScore ? 0 : -1)) == 0;
    }

    public final Address generateLocalAddress() {
        Address address = new Address();
        address.f20212id = this.f20212id;
        address.area = this.area;
        address.city = this.city;
        address.landmark = this.landmark;
        address.addressString = this.addressString;
        address.isDefault = this.isDefault;
        address.contactNumber = this.contactNumber;
        address.name = this.name;
        address.latitude = this.latitude;
        address.longitude = this.longitude;
        address.isDeliveryValid = this.isDeliveryValid;
        address.flatNo = this.flatNo;
        address.estimatedSla = this.estimatedSla;
        address.maxEstimatedSla = this.maxEstimatedSla;
        address.minEstimatedSla = this.minEstimatedSla;
        address.reverseGeoCodeFailed = this.reverseGeoCodeFailed;
        address.annotationTag = this.annotationTag;
        address.subLocality = this.subLocality;
        address.slaMessageString = this.slaMessageString;
        address.restaurantId = this.restaurantId;
        address.voiceDirectionsUri = this.voiceDirectionsUri;
        int i11 = this.annotationTag;
        if (i11 == 1) {
            address.annotationString = AddressTag.TypeString.HOME_TAG_STRING;
        } else if (i11 == 2) {
            address.annotationString = AddressTag.TypeString.WORK_TAG_STRING;
        } else if (i11 != 3) {
            if (i11 == 4) {
                address.annotationString = AddressTag.TypeString.FRIENDS_AND_FAMILY_TAG_STRING;
            }
        } else if (d0.g(this.annotationString)) {
            address.annotationString = this.annotationString;
        } else {
            address.annotationString = "Other";
        }
        return address;
    }

    public final PostableAddress generatePostableAddress() {
        PostableAddress postableAddress = new PostableAddress((String) null, 1, (i) null);
        postableAddress.setAddressString(this.addressString);
        postableAddress.setCity(this.city);
        postableAddress.setArea(this.area);
        postableAddress.setFlatNo(this.flatNo);
        postableAddress.setNumber(this.contactNumber);
        postableAddress.setName(this.name);
        postableAddress.setLandmark(this.landmark);
        postableAddress.setLatitude(this.latitude);
        postableAddress.setLongitude(this.longitude);
        postableAddress.setReverseGeoCodeFailed(c.h(this.reverseGeoCodeFailed));
        postableAddress.setAnnotationString(this.annotationString);
        postableAddress.setAddressLine2(this.addressLine2);
        postableAddress.setDirectionsToReach(this.directionsToReach);
        postableAddress.setVoiceDirectionsUri(this.voiceDirectionsUri);
        int i11 = this.annotationTag;
        if (i11 == 1) {
            postableAddress.setAddressAnnotation(AddressTag.TypeString.HOME_TAG_STRING);
        } else if (i11 == 2) {
            postableAddress.setAddressAnnotation(AddressTag.TypeString.WORK_TAG_STRING);
        } else if (i11 != 3) {
            if (i11 == 4) {
                postableAddress.setAddressAnnotation(AddressTag.TypeString.FRIENDS_AND_FAMILY_TAG_STRING);
            }
        } else if (d0.g(this.annotationString)) {
            postableAddress.setAddressAnnotation(this.annotationString);
        } else {
            postableAddress.setAddressAnnotation("Other");
        }
        return postableAddress;
    }

    public final PostableUpdatableAddress generatePostableUpdatableAddress() {
        PostableUpdatableAddress postableUpdatableAddress = new PostableUpdatableAddress();
        postableUpdatableAddress.mId = this.f20212id;
        postableUpdatableAddress.mAddress = this.addressString;
        postableUpdatableAddress.mArea = this.area;
        postableUpdatableAddress.mFlatNo = this.flatNo;
        postableUpdatableAddress.mContactMobile = this.contactNumber;
        postableUpdatableAddress.mContactName = this.name;
        postableUpdatableAddress.mLandmark = this.landmark;
        postableUpdatableAddress.mLatitude = this.latitude;
        postableUpdatableAddress.mLongitude = this.longitude;
        postableUpdatableAddress.mReverseGeoCodeFailed = this.reverseGeoCodeFailed;
        postableUpdatableAddress.mCity = this.city;
        int i11 = this.annotationTag;
        if (i11 == 1) {
            postableUpdatableAddress.mAddressAnnotationString = AddressTag.TypeString.HOME_TAG_STRING;
        } else if (i11 == 2) {
            postableUpdatableAddress.mAddressAnnotationString = AddressTag.TypeString.WORK_TAG_STRING;
        } else if (i11 != 3) {
            if (i11 == 4) {
                postableUpdatableAddress.mAddressAnnotationString = AddressTag.TypeString.FRIENDS_AND_FAMILY_TAG_STRING;
            }
        } else if (d0.g(this.annotationString)) {
            postableUpdatableAddress.mAddressAnnotationString = this.annotationString;
        } else {
            postableUpdatableAddress.mAddressAnnotationString = "Other";
        }
        return postableUpdatableAddress;
    }

    public final PostableUpdateAddress generatePostableUpdatableAddressV2() {
        PostableUpdateAddress postableUpdateAddress = new PostableUpdateAddress((String) null, (String) null, 3, (i) null);
        postableUpdateAddress.setAddressId(this.f20212id);
        postableUpdateAddress.setAddressString(this.addressString);
        postableUpdateAddress.setArea(this.area);
        postableUpdateAddress.setFlatNo(this.flatNo);
        postableUpdateAddress.setNumber(this.contactNumber);
        postableUpdateAddress.setName(this.name);
        postableUpdateAddress.setLandmark(this.landmark);
        postableUpdateAddress.setLatitude(this.latitude);
        postableUpdateAddress.setLongitude(this.longitude);
        Boolean bool = this.reverseGeoCodeFailed;
        postableUpdateAddress.setReverseGeoCodeFailed(bool == null ? false : bool.booleanValue());
        postableUpdateAddress.setCity(this.city);
        postableUpdateAddress.setAnnotationString(this.annotationString);
        postableUpdateAddress.setAddressLine2(this.addressLine2);
        postableUpdateAddress.setDirectionsToReach(this.directionsToReach);
        postableUpdateAddress.setVoiceDirectionsUri(this.voiceDirectionsUri);
        int i11 = this.annotationTag;
        if (i11 == 1) {
            postableUpdateAddress.setAddressAnnotation(AddressTag.TypeString.HOME_TAG_STRING);
        } else if (i11 == 2) {
            postableUpdateAddress.setAddressAnnotation(AddressTag.TypeString.WORK_TAG_STRING);
        } else if (i11 != 3) {
            if (i11 == 4) {
                postableUpdateAddress.setAddressAnnotation(AddressTag.TypeString.FRIENDS_AND_FAMILY_TAG_STRING);
            }
        } else if (d0.g(this.annotationString)) {
            postableUpdateAddress.setAddressAnnotation(this.annotationString);
        } else {
            postableUpdateAddress.setAddressAnnotation("Other");
        }
        return postableUpdateAddress;
    }

    public final PostableUpdateAddress generatePostableUpdateInstructionsAddressV2() {
        PostableUpdateAddress postableUpdateAddress = new PostableUpdateAddress((String) null, (String) null, 3, (i) null);
        postableUpdateAddress.setAddressId(this.f20212id);
        postableUpdateAddress.setDirectionsToReach(this.directionsToReach);
        postableUpdateAddress.setVoiceDirectionsUri(this.voiceDirectionsUri);
        return postableUpdateAddress;
    }

    public final Integer getAddressAccuracy() {
        return this.addressAccuracy;
    }

    public final String getAddressLine2() {
        return this.addressLine2;
    }

    public final AddressNudge getAddressNudge() {
        return this.addressNudge;
    }

    public final String getAddressString() {
        return this.addressString;
    }

    public final String getAnnotationString() {
        return this.annotationString;
    }

    public final int getAnnotationTag() {
        String str = this.annotationString;
        if (str == null) {
            str = "";
        }
        if (o.x(AddressTag.TypeString.HOME_TAG_STRING, str, true)) {
            return 1;
        }
        if (o.x(AddressTag.TypeString.WORK_TAG_STRING, str, true)) {
            return 2;
        }
        return o.x(AddressTag.TypeString.FRIENDS_AND_FAMILY_TAG_STRING, str, true) ? 4 : 3;
    }

    public final String getAnnotationTagString() {
        String str = this.annotationString;
        if (str == null) {
            str = "";
        }
        boolean z11 = true;
        if (o.x(AddressTag.TypeString.HOME_TAG_STRING, str, true)) {
            return AddressTag.TypeString.HOME_TAG_STRING;
        }
        if (o.x(AddressTag.TypeString.WORK_TAG_STRING, str, true)) {
            return AddressTag.TypeString.WORK_TAG_STRING;
        }
        if (o.x(AddressTag.TypeString.FRIENDS_AND_FAMILY_TAG_STRING, str, true)) {
            return AddressTag.TypeString.FRIENDS_AND_FAMILY_TAG_STRING;
        }
        if (str.length() <= 0) {
            z11 = false;
        }
        return z11 ? str : "Other";
    }

    public final String getAnnotationTagStringDisplay() {
        String str = this.annotationString;
        if (str == null) {
            str = "";
        }
        boolean z11 = true;
        if (o.x(AddressTag.TypeString.HOME_TAG_STRING, str, true)) {
            return AddressTag.TypeString.HOME_TAG_STRING;
        }
        if (o.x(AddressTag.TypeString.WORK_TAG_STRING, str, true)) {
            return AddressTag.TypeString.WORK_TAG_STRING;
        }
        if (o.x(AddressTag.TypeString.FRIENDS_AND_FAMILY_TAG_STRING, str, true)) {
            String str2 = this.name;
            return str2 == null ? AddressTag.TypeString.FRIENDS_AND_FAMILY_TAG_STRING : str2;
        }
        if (str.length() <= 0) {
            z11 = false;
        }
        return z11 ? str : "Other";
    }

    public final String getAnnotationTagStringIdentifier() {
        String str = this.annotationString;
        if (str == null) {
            str = "";
        }
        if (o.x(AddressTag.TypeString.HOME_TAG_STRING, str, true)) {
            return AddressTag.TypeString.HOME_TAG_STRING;
        }
        return o.x(AddressTag.TypeString.WORK_TAG_STRING, str, true) ? AddressTag.TypeString.WORK_TAG_STRING : o.x(AddressTag.TypeString.FRIENDS_AND_FAMILY_TAG_STRING, str, true) ? AddressTag.TypeString.FRIENDS_AND_FAMILY_TAG_STRING : "Other";
    }

    public final String getArea() {
        return this.area;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getContactNumber() {
        return this.contactNumber;
    }

    public final String getDirectionsToReach() {
        return this.directionsToReach;
    }

    public final String getDisplayableAddress() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        sb2.append(d0.g(this.flatNo) ? p.s(this.flatNo, ", ") : str2);
        if (d0.g(this.addressLine2)) {
            str = this.addressLine2;
        } else {
            if (d0.g(this.landmark)) {
                str = this.landmark;
            }
            sb2.append(str2);
            sb2.append(this.addressString);
            String b11 = d0.b(sb2.toString());
            p.i(b11, "convertToTitleCase((if (…      this.addressString)");
            return b11;
        }
        str2 = p.s(str, ", ");
        sb2.append(str2);
        sb2.append(this.addressString);
        String b112 = d0.b(sb2.toString());
        p.i(b112, "convertToTitleCase((if (…      this.addressString)");
        return b112;
    }

    public final String getDisplayableAddressContentDescription() {
        String str;
        if (d0.g(this.flatNo)) {
            str = String.valueOf(this.flatNo);
        } else if (d0.g(this.addressLine2)) {
            str = String.valueOf(this.addressLine2);
        } else {
            str = d0.g(this.landmark) ? String.valueOf(this.landmark) : "";
        }
        String b11 = d0.b(str);
        p.i(b11, "convertToTitleCase(\n    …\"\n            }\n        )");
        return b11;
    }

    public final Integer getEstimatedSla() {
        return this.estimatedSla;
    }

    public final double getFinalSortScore() {
        return this.finalSortScore;
    }

    public final String getFlatNo() {
        return this.flatNo;
    }

    public final double getHaversineDistance() {
        return this.haversineDistance;
    }

    public final String getId() {
        return this.f20212id;
    }

    public final String getLandmark() {
        return this.landmark;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final Location getLocation() {
        Location location = new Location("");
        location.setLatitude(this.latitude);
        location.setLongitude(this.longitude);
        return location;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final Integer getMaxEstimatedSla() {
        return this.maxEstimatedSla;
    }

    public final Integer getMinEstimatedSla() {
        return this.minEstimatedSla;
    }

    public final String getName() {
        return this.name;
    }

    public final double getProximityScore() {
        return this.proximityScore;
    }

    public final boolean getRecalculationRequired() {
        return this.recalculationRequired;
    }

    public final String getRestaurantId() {
        return this.restaurantId;
    }

    public final Boolean getReverseGeoCodeFailed() {
        return this.reverseGeoCodeFailed;
    }

    public final String getSlaMessageString() {
        return this.slaMessageString;
    }

    public final Integer getSortScore() {
        return this.sortScore;
    }

    public final String getSubLocality() {
        return this.subLocality;
    }

    public final String getVoiceDirectionsUri() {
        return this.voiceDirectionsUri;
    }

    public final double getWeightedOrderShareScore() {
        return this.weightedOrderShareScore;
    }

    public int hashCode() {
        String str = this.name;
        int i11 = 0;
        int hashCode = (-863894366 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.landmark;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.flatNo;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20212id;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.area;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.city;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.addressString;
        int hashCode7 = (((hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + h.a(this.isDefault)) * 31;
        String str8 = this.contactNumber;
        int hashCode8 = (((((((hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31) + Double.doubleToLongBits(this.latitude)) * 31) + Double.doubleToLongBits(this.longitude)) * 31) + h.a(this.isDeliveryValid)) * 31;
        Integer num = this.estimatedSla;
        int intValue = (hashCode8 + (num == null ? 0 : num.intValue())) * 31;
        Integer num2 = this.minEstimatedSla;
        int intValue2 = (intValue + (num2 == null ? 0 : num2.intValue())) * 31;
        Integer num3 = this.maxEstimatedSla;
        int intValue3 = (intValue2 + (num3 == null ? 0 : num3.intValue())) * 31;
        String str9 = this.slaMessageString;
        int hashCode9 = (intValue3 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.reverseGeoCodeFailed;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str10 = this.annotationString;
        int hashCode11 = (((((hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31) + h.a(this.recalculationRequired)) * 31) + this.annotationTag) * 31;
        String str11 = this.subLocality;
        if (str11 != null) {
            i11 = str11.hashCode();
        }
        return hashCode11 + i11;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public final boolean isDeliveryValid() {
        return this.isDeliveryValid;
    }

    public final boolean isListingSelected() {
        return this.isListingSelected;
    }

    public final void setAddressAccuracy(Integer num) {
        this.addressAccuracy = num;
    }

    public final void setAddressLine2(String str) {
        this.addressLine2 = str;
    }

    public final void setAddressNudge(AddressNudge addressNudge2) {
        this.addressNudge = addressNudge2;
    }

    public final void setAddressString(String str) {
        this.addressString = str;
    }

    public final void setAnnotationString(String str) {
        this.annotationString = str;
    }

    public final void setAnnotationTag(int i11) {
        this.annotationTag = i11;
    }

    public final void setArea(String str) {
        this.area = str;
    }

    public final void setCity(String str) {
        this.city = str;
    }

    public final void setContactNumber(String str) {
        this.contactNumber = str;
    }

    public final void setDefault(boolean z11) {
        this.isDefault = z11;
    }

    public final void setDeliveryValid(boolean z11) {
        this.isDeliveryValid = z11;
    }

    public final void setDirectionsToReach(String str) {
        this.directionsToReach = str;
    }

    public final void setEstimatedSla(Integer num) {
        this.estimatedSla = num;
    }

    public final void setFinalSortScore(double d11) {
        this.finalSortScore = d11;
    }

    public final void setFlatNo(String str) {
        this.flatNo = str;
    }

    public final void setHaversineDistance(double d11) {
        this.haversineDistance = d11;
    }

    public final void setId(String str) {
        this.f20212id = str;
    }

    public final void setLandmark(String str) {
        this.landmark = str;
    }

    public final void setLatitude(double d11) {
        this.latitude = d11;
    }

    public final void setListingSelected(boolean z11) {
        this.isListingSelected = z11;
    }

    public final void setLongitude(double d11) {
        this.longitude = d11;
    }

    public final void setMaxEstimatedSla(Integer num) {
        this.maxEstimatedSla = num;
    }

    public final void setMinEstimatedSla(Integer num) {
        this.minEstimatedSla = num;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setProximityScore(double d11) {
        this.proximityScore = d11;
    }

    public final void setRecalculationRequired(boolean z11) {
        this.recalculationRequired = z11;
    }

    public final void setRestaurantId(String str) {
        this.restaurantId = str;
    }

    public final void setReverseGeoCodeFailed(Boolean bool) {
        this.reverseGeoCodeFailed = bool;
    }

    public final void setSlaMessageString(String str) {
        this.slaMessageString = str;
    }

    public final void setSortScore(Integer num) {
        this.sortScore = num;
    }

    public final void setSubLocality(String str) {
        this.subLocality = str;
    }

    public final void setVoiceDirectionsUri(String str) {
        this.voiceDirectionsUri = str;
    }

    public final void setWeightedOrderShareScore(double d11) {
        this.weightedOrderShareScore = d11;
    }

    public final String toJson() {
        Gson i11 = g0.i();
        String json = !(i11 instanceof Gson) ? i11.toJson((Object) this) : GsonInstrumentation.toJson(i11, (Object) this);
        p.i(json, "getGson().toJson(this)");
        return json;
    }

    public final GooglePlace toNewGooglePlace() {
        GooglePlace googlePlace = new GooglePlace();
        GooglePlaceLocation googlePlaceLocation = new GooglePlaceLocation(0.0d, 0.0d, 3, (i) null);
        GooglePlaceGeometry googlePlaceGeometry = new GooglePlaceGeometry((GooglePlaceLocation) null, (String) null, 3, (i) null);
        googlePlaceLocation.setLatitude(this.latitude);
        googlePlaceLocation.setLongitude(this.longitude);
        googlePlaceGeometry.setLocation(googlePlaceLocation);
        googlePlace.setSubLocality1(this.subLocality);
        googlePlace.setFormattedAddress(getDisplayableAddress());
        googlePlace.setLocality(this.area);
        googlePlace.setGeometry(googlePlaceGeometry);
        googlePlace.setCity(this.city);
        googlePlace.setArea(this.area);
        return googlePlace;
    }

    public String toString() {
        String json = GsonInstrumentation.toJson(new Gson(), (Object) this);
        p.i(json, "Gson().toJson(this)");
        return json;
    }

    public void writeToParcel(Parcel parcel, int i11) {
        p.j(parcel, "out");
        parcel.writeInt(1);
    }
}
