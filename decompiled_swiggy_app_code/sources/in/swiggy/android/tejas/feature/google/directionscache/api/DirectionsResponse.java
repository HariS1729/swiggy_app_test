package in.swiggy.android.tejas.feature.google.directionscache.api;

import com.google.android.gms.maps.model.LatLng;
import in.swiggy.android.tejas.dao.BaseResponse;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: DirectionsReqResponse.kt */
public final class DirectionsResponse extends BaseResponse<String> {
    private final ArrayList<ArrayList<LatLng>> latLngList;
    private final RemoteDirectionsDataSource remoteDataSource;
    private final String routeId;
    private int routeIndex;

    public DirectionsResponse() {
        this((ArrayList) null, 0, (RemoteDirectionsDataSource) null, (String) null, 15, (i) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DirectionsResponse(ArrayList arrayList, int i11, RemoteDirectionsDataSource remoteDirectionsDataSource, String str, int i12, i iVar) {
        this((i12 & 1) != 0 ? new ArrayList() : arrayList, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? RemoteDirectionsDataSource.SWIGGY_DIRECTIONS : remoteDirectionsDataSource, (i12 & 8) != 0 ? null : str);
    }

    public static /* synthetic */ DirectionsResponse copy$default(DirectionsResponse directionsResponse, ArrayList<ArrayList<LatLng>> arrayList, int i11, RemoteDirectionsDataSource remoteDirectionsDataSource, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            arrayList = directionsResponse.latLngList;
        }
        if ((i12 & 2) != 0) {
            i11 = directionsResponse.routeIndex;
        }
        if ((i12 & 4) != 0) {
            remoteDirectionsDataSource = directionsResponse.remoteDataSource;
        }
        if ((i12 & 8) != 0) {
            str = directionsResponse.routeId;
        }
        return directionsResponse.copy(arrayList, i11, remoteDirectionsDataSource, str);
    }

    public final ArrayList<ArrayList<LatLng>> component1() {
        return this.latLngList;
    }

    public final int component2() {
        return this.routeIndex;
    }

    public final RemoteDirectionsDataSource component3() {
        return this.remoteDataSource;
    }

    public final String component4() {
        return this.routeId;
    }

    public final DirectionsResponse copy(ArrayList<ArrayList<LatLng>> arrayList, int i11, RemoteDirectionsDataSource remoteDirectionsDataSource, String str) {
        p.j(arrayList, "latLngList");
        p.j(remoteDirectionsDataSource, "remoteDataSource");
        return new DirectionsResponse(arrayList, i11, remoteDirectionsDataSource, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectionsResponse)) {
            return false;
        }
        DirectionsResponse directionsResponse = (DirectionsResponse) obj;
        return p.e(this.latLngList, directionsResponse.latLngList) && this.routeIndex == directionsResponse.routeIndex && this.remoteDataSource == directionsResponse.remoteDataSource && p.e(this.routeId, directionsResponse.routeId);
    }

    public final ArrayList<ArrayList<LatLng>> getLatLngList() {
        return this.latLngList;
    }

    public final RemoteDirectionsDataSource getRemoteDataSource() {
        return this.remoteDataSource;
    }

    public final String getRouteId() {
        return this.routeId;
    }

    public final int getRouteIndex() {
        return this.routeIndex;
    }

    public int hashCode() {
        int hashCode = ((((this.latLngList.hashCode() * 31) + this.routeIndex) * 31) + this.remoteDataSource.hashCode()) * 31;
        String str = this.routeId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setRouteIndex(int i11) {
        this.routeIndex = i11;
    }

    public String toString() {
        return "DirectionsResponse(latLngList=" + this.latLngList + ", routeIndex=" + this.routeIndex + ", remoteDataSource=" + this.remoteDataSource + ", routeId=" + this.routeId + ')';
    }

    public final void updateFromRequest(DirectionsRequest directionsRequest) {
        p.j(directionsRequest, "request");
        BaseResponse.updateCache$default(this, directionsRequest.getDefaultKey(), 0, (Long) null, 6, (Object) null);
        this.routeIndex = directionsRequest.getRouteIndex();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DirectionsResponse(ArrayList<ArrayList<LatLng>> arrayList, int i11, RemoteDirectionsDataSource remoteDirectionsDataSource, String str) {
        super("", (Long) null, (Long) null, 6, (i) null);
        p.j(arrayList, "latLngList");
        p.j(remoteDirectionsDataSource, "remoteDataSource");
        this.latLngList = arrayList;
        this.routeIndex = i11;
        this.remoteDataSource = remoteDirectionsDataSource;
        this.routeId = str;
    }
}
