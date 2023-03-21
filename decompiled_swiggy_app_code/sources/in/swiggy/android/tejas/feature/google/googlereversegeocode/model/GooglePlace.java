package in.swiggy.android.tejas.feature.google.googlereversegeocode.model;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.Place;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import in.swiggy.android.tejas.feature.google.googleplacesearch.model.GooglePlacePrediction;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import os.d0;

@Instrumented
/* compiled from: GooglePlace.kt */
public final class GooglePlace {
    public static final Companion Companion = new Companion((i) null);
    public static final String LOCALITY = "locality";
    public static final String NEIGHBOR = "neighborhood";
    public static final String SUB_LOC_1 = "sublocality_level_1";
    public static final String SUB_LOC_2 = "sublocality_level_2";
    public static final String SUB_LOC_3 = "sublocality_level_3";
    @SerializedName("address_components")
    private List<GooglePlaceAddress> addressComponents;
    private String area;
    private String city;
    private String establishment;
    @SerializedName("formatted_address")
    private String formattedAddress;
    @SerializedName("geometry")
    private GooglePlaceGeometry geometry;
    private boolean initialised;
    private String locality;
    @SerializedName("place_id")
    private String placeId;
    private String premise;
    private String roofTopArea;
    private String route;
    private String subLocality1;
    private String subLocality2;

    /* compiled from: GooglePlace.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public GooglePlace() {
        this.addressComponents = new ArrayList();
        this.area = "";
        this.roofTopArea = "";
        this.locality = "";
        this.city = "";
        this.subLocality1 = "";
        this.subLocality2 = "";
        this.premise = "";
        this.establishment = "";
        this.route = "";
    }

    private final void initialise() {
        if (!this.initialised) {
            this.initialised = true;
            List<GooglePlaceAddress> list = this.addressComponents;
            if (list != null) {
                for (GooglePlaceAddress googlePlaceAddress : list) {
                    List<String> types = googlePlaceAddress.getTypes();
                    if (types != null) {
                        if (types.contains(LOCALITY)) {
                            this.city = googlePlaceAddress.getShortName();
                        }
                        if (types.contains(SUB_LOC_1)) {
                            this.locality = googlePlaceAddress.getShortName();
                            this.subLocality1 = googlePlaceAddress.getShortName();
                        }
                        if (types.contains(SUB_LOC_2)) {
                            if (d0.e(this.locality)) {
                                this.locality = googlePlaceAddress.getShortName();
                            }
                            this.subLocality2 = googlePlaceAddress.getShortName();
                        }
                        if (types.contains(SUB_LOC_3) && d0.e(this.subLocality2)) {
                            if (d0.e(this.locality)) {
                                this.locality = googlePlaceAddress.getShortName();
                            }
                            this.subLocality2 = googlePlaceAddress.getShortName();
                        }
                        if (types.contains(NEIGHBOR)) {
                            this.locality = googlePlaceAddress.getShortName();
                        } else if (types.contains("route")) {
                            this.route = googlePlaceAddress.getShortName();
                        }
                        if (types.contains("establishment")) {
                            this.establishment = googlePlaceAddress.getShortName();
                        }
                        if (types.contains("premise")) {
                            this.premise = googlePlaceAddress.getLongName();
                        }
                        if (!(!types.contains("street_number") || googlePlaceAddress.getShortName() == null || getFormattedAddress() == null)) {
                            String formattedAddress2 = getFormattedAddress();
                            setFormattedAddress(formattedAddress2 == null ? null : o.H(formattedAddress2, p.s(googlePlaceAddress.getShortName(), ", "), "", false, 4, (Object) null));
                        }
                    }
                }
            }
        }
    }

    public final List<GooglePlaceAddress> getAddressComponents() {
        return this.addressComponents;
    }

    public final String getAddressString() {
        return this.formattedAddress;
    }

    public final String getArea() {
        return this.area;
    }

    public final String getCity() {
        initialise();
        return this.city;
    }

    public final String getFirstLevelName() {
        initialise();
        if (d0.g(this.establishment)) {
            return this.establishment;
        }
        if (d0.g(this.premise)) {
            return this.premise;
        }
        if (d0.g(this.subLocality2)) {
            return this.subLocality2;
        }
        if (d0.g(this.subLocality1)) {
            return this.subLocality1;
        }
        return d0.g(this.route) ? this.route : "";
    }

    public final String getFormattedAddress() {
        return this.formattedAddress;
    }

    public final GooglePlaceGeometry getGeometry() {
        return this.geometry;
    }

    public final double getLatitude() {
        GooglePlaceLocation location;
        GooglePlaceGeometry googlePlaceGeometry = this.geometry;
        if (googlePlaceGeometry == null || (location = googlePlaceGeometry.getLocation()) == null) {
            return 0.0d;
        }
        return location.getLatitude();
    }

    public final String getLocality() {
        initialise();
        return this.locality;
    }

    public final double getLongitude() {
        GooglePlaceLocation location;
        GooglePlaceGeometry googlePlaceGeometry = this.geometry;
        if (googlePlaceGeometry == null || (location = googlePlaceGeometry.getLocation()) == null) {
            return 0.0d;
        }
        return location.getLongitude();
    }

    public final String getPlaceId() {
        return this.placeId;
    }

    public final String getRoofTopArea() {
        return this.roofTopArea;
    }

    public final String getSecondLevelName() {
        initialise();
        String str = this.locality;
        if (d0.g(this.establishment)) {
            if (d0.g(this.premise)) {
                return this.premise;
            }
            if (d0.g(this.subLocality2)) {
                return this.subLocality2;
            }
            if (d0.g(this.subLocality1)) {
                return this.subLocality1;
            }
            if (d0.g(this.route)) {
                return this.route;
            }
            return str;
        } else if (d0.g(this.premise)) {
            if (d0.g(this.subLocality2)) {
                return this.subLocality2;
            }
            if (d0.g(this.subLocality1)) {
                return this.subLocality1;
            }
            if (d0.g(this.route)) {
                return this.route;
            }
            return str;
        } else if (d0.g(this.subLocality2)) {
            if (d0.g(this.subLocality1)) {
                return this.subLocality1;
            }
            if (d0.g(this.route)) {
                return this.route;
            }
            return str;
        } else if (!d0.g(this.subLocality1)) {
            return str;
        } else {
            if (d0.g(this.route)) {
                return this.route;
            }
            return this.locality;
        }
    }

    public final String getThirdLevelName() {
        initialise();
        String str = this.city;
        if (d0.g(this.subLocality2)) {
            if (d0.g(this.subLocality1)) {
                return this.subLocality1;
            }
            if (d0.g(this.route)) {
                return this.route;
            }
            return str;
        } else if (d0.g(this.subLocality1)) {
            if (d0.g(this.route)) {
                return this.route;
            }
            return this.locality;
        } else if (d0.g(this.route)) {
            return this.locality;
        } else {
            return this.city;
        }
    }

    public final String getTitle() {
        initialise();
        if (d0.g(getFirstLevelName())) {
            return getFirstLevelName();
        }
        if (d0.g(getSecondLevelName())) {
            return getSecondLevelName();
        }
        return d0.g(getThirdLevelName()) ? getThirdLevelName() : "";
    }

    public final void improveAddress(GooglePlacePrediction googlePlacePrediction) {
        initialise();
        if (googlePlacePrediction != null && d0.e(this.premise) && d0.e(this.establishment) && o.y(googlePlacePrediction.getPlaceId(), this.placeId, false, 2, (Object) null)) {
            this.premise = googlePlacePrediction.getArea();
        }
    }

    public final boolean isLatLngValid() {
        if (!(getLatitude() == 0.0d)) {
            if (!(getLongitude() == 0.0d)) {
                return true;
            }
        }
        return false;
    }

    public final void setAddressComponents(List<GooglePlaceAddress> list) {
        this.addressComponents = list;
    }

    public final void setArea(String str) {
        this.area = str;
    }

    public final void setCity(String str) {
        initialise();
        this.city = str;
    }

    public final void setFormattedAddress(String str) {
        this.formattedAddress = str;
    }

    public final void setGeometry(GooglePlaceGeometry googlePlaceGeometry) {
        this.geometry = googlePlaceGeometry;
    }

    public final void setLocality(String str) {
        initialise();
        this.locality = str;
    }

    public final void setPlaceId(String str) {
        this.placeId = str;
    }

    public final void setRoofTopArea(String str) {
        this.roofTopArea = str;
    }

    public final void setSubLocality1(String str) {
        initialise();
        this.subLocality1 = str;
    }

    public String toString() {
        initialise();
        String json = GsonInstrumentation.toJson(new Gson(), (Object) this);
        p.i(json, "Gson().toJson(this)");
        return json;
    }

    public GooglePlace(Place place) {
        this.addressComponents = new ArrayList();
        this.area = "";
        this.roofTopArea = "";
        this.locality = "";
        this.city = "";
        this.subLocality1 = "";
        this.subLocality2 = "";
        this.premise = "";
        this.establishment = "";
        this.route = "";
        if (place != null) {
            this.locality = String.valueOf(place.getName());
            this.formattedAddress = String.valueOf(place.getAddress());
            LatLng latLng = place.getLatLng();
            if (latLng != null) {
                this.geometry = new GooglePlaceGeometry(new GooglePlaceLocation(latLng.f43937a, latLng.f43938b), (String) null, 2, (i) null);
            }
            this.placeId = place.getId();
        }
    }

    public GooglePlace(List<GooglePlaceAddress> list, String str, GooglePlaceGeometry googlePlaceGeometry, String str2) {
        new ArrayList();
        this.area = "";
        this.roofTopArea = "";
        this.locality = "";
        this.city = "";
        this.subLocality1 = "";
        this.subLocality2 = "";
        this.premise = "";
        this.establishment = "";
        this.route = "";
        this.addressComponents = list;
        this.formattedAddress = str;
        this.geometry = googlePlaceGeometry;
        this.placeId = str2;
    }
}
