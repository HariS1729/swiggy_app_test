package in.swiggy.android.tejas.feature.google.directionscache.datasource;

import bp0.k;
import com.google.android.gms.maps.model.LatLng;
import fp0.c;
import in.swiggy.android.tejas.coroutineUtils.SharedPrefDataSourceImpl;
import in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsRequest;
import in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsResponse;
import in.swiggy.android.tejas.flush.SharedPrefFlushManager;
import in.swiggy.android.tejas.network.utils.NetworkBoundResourceKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.p;
import os.u;

/* compiled from: DirectionsLocalDataSource.kt */
public final class DirectionsLocalDataSource extends SharedPrefDataSourceImpl<DirectionsRequest, DirectionsResponse> {
    private final SharedPrefFlushManager sharedPrefFlushManager;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DirectionsLocalDataSource(SharedPrefFlushManager sharedPrefFlushManager2) {
        super(sharedPrefFlushManager2.getSharedPreferences(), DirectionsResponse.class);
        p.j(sharedPrefFlushManager2, "sharedPrefFlushManager");
        this.sharedPrefFlushManager = sharedPrefFlushManager2;
    }

    public Object removeCache(String str, c<? super k> cVar) {
        Object removeDayOldCache = this.sharedPrefFlushManager.removeDayOldCache(cVar);
        return removeDayOldCache == b.d() ? removeDayOldCache : k.f22762a;
    }

    public boolean shouldFetchRemote(DirectionsResponse directionsResponse, DirectionsRequest directionsRequest) {
        p.j(directionsRequest, "request");
        if (directionsResponse == null) {
            return true;
        }
        LatLng deliveryBoyLatLng = directionsRequest.getDeliveryBoyLatLng();
        int snappingLimit = directionsRequest.getSnappingLimit();
        ArrayList<ArrayList<LatLng>> latLngList = directionsResponse.getLatLngList();
        Iterator<T> it2 = latLngList.iterator();
        int i11 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i11 = -1;
                break;
            }
            T next = it2.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                k.t();
            }
            LocationUtils locationUtils = LocationUtils.INSTANCE;
            LatLng latLng = (LatLng) locationUtils.findNearestPoint(deliveryBoyLatLng, new ArrayList((ArrayList) next)).f9416a;
            if ((latLng == null ? Float.MAX_VALUE : locationUtils.distanceTo(latLng, deliveryBoyLatLng)) < ((float) snappingLimit)) {
                break;
            }
            i11 = i12;
        }
        if (i11 > 0) {
            ArrayList<LatLng> arrayList = latLngList.get(i11);
            p.i(arrayList, "get(routeIndex)");
            ArrayList arrayList2 = arrayList;
            latLngList.remove(arrayList2);
            latLngList.add(0, arrayList2);
        }
        directionsRequest.setRouteIndex(i11);
        directionsResponse.setRouteIndex(i11);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("routeIndex ");
        sb2.append(i11);
        sb2.append(" cache.latLngList ");
        sb2.append(directionsResponse.getLatLngList().size());
        sb2.append(" shouldFetchRemote ");
        sb2.append(i11 == -1);
        u.b(NetworkBoundResourceKt.NBR_TAG, sb2.toString());
        if (i11 == -1) {
            return true;
        }
        return false;
    }
}
