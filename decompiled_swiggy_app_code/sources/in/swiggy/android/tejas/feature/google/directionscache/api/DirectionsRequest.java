package in.swiggy.android.tejas.feature.google.directionscache.api;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import in.swiggy.android.tejas.dao.BaseRequest;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: DirectionsReqResponse.kt */
public final class DirectionsRequest extends BaseRequest<String> {
    private final LatLng customerLatLng;
    private String defaultKey;
    private final LatLng deliveryBoyLatLng;
    private LatLngBounds mapBounds;
    private final String orderId;
    private int routeIndex;
    private final int snappingLimit;
    private final boolean swiggyDirectionsXpValue;
    private final List<LatLng> wayPoints;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DirectionsRequest(java.lang.String r13, com.google.android.gms.maps.model.LatLng r14, com.google.android.gms.maps.model.LatLng r15, java.util.List r16, int r17, com.google.android.gms.maps.model.LatLngBounds r18, int r19, boolean r20, int r21, kotlin.jvm.internal.i r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r10 = 0
            goto L_0x000b
        L_0x0009:
            r10 = r19
        L_0x000b:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0011
            r11 = 0
            goto L_0x0013
        L_0x0011:
            r11 = r20
        L_0x0013:
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsRequest.<init>(java.lang.String, com.google.android.gms.maps.model.LatLng, com.google.android.gms.maps.model.LatLng, java.util.List, int, com.google.android.gms.maps.model.LatLngBounds, int, boolean, int, kotlin.jvm.internal.i):void");
    }

    public static /* synthetic */ DirectionsRequest copy$default(DirectionsRequest directionsRequest, String str, LatLng latLng, LatLng latLng2, List list, int i11, LatLngBounds latLngBounds, int i12, boolean z11, int i13, Object obj) {
        DirectionsRequest directionsRequest2 = directionsRequest;
        int i14 = i13;
        return directionsRequest.copy((i14 & 1) != 0 ? directionsRequest2.orderId : str, (i14 & 2) != 0 ? directionsRequest2.deliveryBoyLatLng : latLng, (i14 & 4) != 0 ? directionsRequest2.customerLatLng : latLng2, (i14 & 8) != 0 ? directionsRequest2.wayPoints : list, (i14 & 16) != 0 ? directionsRequest2.snappingLimit : i11, (i14 & 32) != 0 ? directionsRequest2.mapBounds : latLngBounds, (i14 & 64) != 0 ? directionsRequest2.routeIndex : i12, (i14 & 128) != 0 ? directionsRequest2.swiggyDirectionsXpValue : z11);
    }

    public final String component1() {
        return this.orderId;
    }

    public final LatLng component2() {
        return this.deliveryBoyLatLng;
    }

    public final LatLng component3() {
        return this.customerLatLng;
    }

    public final List<LatLng> component4() {
        return this.wayPoints;
    }

    public final int component5() {
        return this.snappingLimit;
    }

    public final LatLngBounds component6() {
        return this.mapBounds;
    }

    public final int component7() {
        return this.routeIndex;
    }

    public final boolean component8() {
        return this.swiggyDirectionsXpValue;
    }

    public final DirectionsRequest copy(String str, LatLng latLng, LatLng latLng2, List<LatLng> list, int i11, LatLngBounds latLngBounds, int i12, boolean z11) {
        p.j(str, "orderId");
        p.j(latLng, "deliveryBoyLatLng");
        p.j(latLng2, "customerLatLng");
        p.j(list, "wayPoints");
        LatLngBounds latLngBounds2 = latLngBounds;
        p.j(latLngBounds2, "mapBounds");
        return new DirectionsRequest(str, latLng, latLng2, list, i11, latLngBounds2, i12, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectionsRequest)) {
            return false;
        }
        DirectionsRequest directionsRequest = (DirectionsRequest) obj;
        return p.e(this.orderId, directionsRequest.orderId) && p.e(this.deliveryBoyLatLng, directionsRequest.deliveryBoyLatLng) && p.e(this.customerLatLng, directionsRequest.customerLatLng) && p.e(this.wayPoints, directionsRequest.wayPoints) && this.snappingLimit == directionsRequest.snappingLimit && p.e(this.mapBounds, directionsRequest.mapBounds) && this.routeIndex == directionsRequest.routeIndex && this.swiggyDirectionsXpValue == directionsRequest.swiggyDirectionsXpValue;
    }

    public final LatLng getCustomerLatLng() {
        return this.customerLatLng;
    }

    public final LatLng getDeliveryBoyLatLng() {
        return this.deliveryBoyLatLng;
    }

    public final LatLngBounds getMapBounds() {
        return this.mapBounds;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final int getRouteIndex() {
        return this.routeIndex;
    }

    public final int getSnappingLimit() {
        return this.snappingLimit;
    }

    public final boolean getSwiggyDirectionsXpValue() {
        return this.swiggyDirectionsXpValue;
    }

    public final List<LatLng> getWayPoints() {
        return this.wayPoints;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.orderId.hashCode() * 31) + this.deliveryBoyLatLng.hashCode()) * 31) + this.customerLatLng.hashCode()) * 31) + this.wayPoints.hashCode()) * 31) + this.snappingLimit) * 31) + this.mapBounds.hashCode()) * 31) + this.routeIndex) * 31;
        boolean z11 = this.swiggyDirectionsXpValue;
        if (z11) {
            z11 = true;
        }
        return hashCode + (z11 ? 1 : 0);
    }

    public final void setMapBounds(LatLngBounds latLngBounds) {
        p.j(latLngBounds, "<set-?>");
        this.mapBounds = latLngBounds;
    }

    public final void setRouteIndex(int i11) {
        this.routeIndex = i11;
    }

    public String toString() {
        return "DirectionsRequest(orderId=" + this.orderId + ", deliveryBoyLatLng=" + this.deliveryBoyLatLng + ", customerLatLng=" + this.customerLatLng + ", wayPoints=" + this.wayPoints + ", snappingLimit=" + this.snappingLimit + ", mapBounds=" + this.mapBounds + ", routeIndex=" + this.routeIndex + ", swiggyDirectionsXpValue=" + this.swiggyDirectionsXpValue + ')';
    }

    public DirectionsRequest(String str, LatLng latLng, LatLng latLng2, List<LatLng> list, int i11, LatLngBounds latLngBounds, int i12, boolean z11) {
        p.j(str, "orderId");
        p.j(latLng, "deliveryBoyLatLng");
        p.j(latLng2, "customerLatLng");
        p.j(list, "wayPoints");
        p.j(latLngBounds, "mapBounds");
        this.orderId = str;
        this.deliveryBoyLatLng = latLng;
        this.customerLatLng = latLng2;
        this.wayPoints = list;
        this.snappingLimit = i11;
        this.mapBounds = latLngBounds;
        this.routeIndex = i12;
        this.swiggyDirectionsXpValue = z11;
        this.defaultKey = str;
    }

    public String getDefaultKey() {
        return this.defaultKey;
    }

    public void setDefaultKey(String str) {
        p.j(str, "<set-?>");
        this.defaultKey = str;
    }
}
