package in.swiggy.android.tejas.feature.google.googleplacesearch.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: OperationalCityBounds.kt */
public final class OperationalCityBounds {
    @SerializedName("operational_city_bounds_list")
    private List<LatLngBounds> operationalCityBoundsList;

    /* compiled from: OperationalCityBounds.kt */
    public final class LatLng {
        @SerializedName("latitude")
        private double latitude;
        @SerializedName("longitude")
        private double longitude;
        final /* synthetic */ OperationalCityBounds this$0;

        public LatLng(OperationalCityBounds operationalCityBounds) {
            p.j(operationalCityBounds, "this$0");
            this.this$0 = operationalCityBounds;
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        public final void setLatitude(double d11) {
            this.latitude = d11;
        }

        public final void setLongitude(double d11) {
            this.longitude = d11;
        }
    }

    /* compiled from: OperationalCityBounds.kt */
    public final class LatLngBounds {
        @SerializedName("northeast")
        private LatLng northeastLatLng;
        @SerializedName("southwest")
        private LatLng southwestLatLng;
        final /* synthetic */ OperationalCityBounds this$0;

        public LatLngBounds(OperationalCityBounds operationalCityBounds) {
            p.j(operationalCityBounds, "this$0");
            this.this$0 = operationalCityBounds;
        }

        public final LatLng getNortheastLatLng() {
            return this.northeastLatLng;
        }

        public final LatLng getSouthwestLatLng() {
            return this.southwestLatLng;
        }

        public final void setNortheastLatLng(LatLng latLng) {
            this.northeastLatLng = latLng;
        }

        public final void setSouthwestLatLng(LatLng latLng) {
            this.southwestLatLng = latLng;
        }
    }

    public final ArrayList<com.google.android.gms.maps.model.LatLngBounds> getLatLngBoundsList() {
        ArrayList<com.google.android.gms.maps.model.LatLngBounds> arrayList = new ArrayList<>();
        List<LatLngBounds> list = this.operationalCityBoundsList;
        if (list == null) {
            return arrayList;
        }
        p.g(list);
        for (LatLngBounds next : list) {
            LatLng southwestLatLng = next.getSouthwestLatLng();
            p.g(southwestLatLng);
            double latitude = southwestLatLng.getLatitude();
            LatLng southwestLatLng2 = next.getSouthwestLatLng();
            p.g(southwestLatLng2);
            com.google.android.gms.maps.model.LatLng latLng = new com.google.android.gms.maps.model.LatLng(latitude, southwestLatLng2.getLongitude());
            LatLng northeastLatLng = next.getNortheastLatLng();
            p.g(northeastLatLng);
            double latitude2 = northeastLatLng.getLatitude();
            LatLng northeastLatLng2 = next.getNortheastLatLng();
            p.g(northeastLatLng2);
            arrayList.add(new com.google.android.gms.maps.model.LatLngBounds(latLng, new com.google.android.gms.maps.model.LatLng(latitude2, northeastLatLng2.getLongitude())));
        }
        return arrayList;
    }

    public final List<LatLngBounds> getOperationalCityBoundsList() {
        return this.operationalCityBoundsList;
    }

    public final void setOperationalCityBoundsList(List<LatLngBounds> list) {
        this.operationalCityBoundsList = list;
    }
}
