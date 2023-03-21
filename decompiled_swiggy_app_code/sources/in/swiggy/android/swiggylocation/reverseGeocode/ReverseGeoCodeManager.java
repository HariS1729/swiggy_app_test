package in.swiggy.android.swiggylocation.reverseGeocode;

import cg0.n;
import com.google.android.gms.maps.model.LatLng;
import fp0.c;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlace;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlaceAddress;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlaceGeometry;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlaceLocation;
import in.swiggy.android.tejas.feature.recommends.RecommendsAddressComponents;
import in.swiggy.android.tejas.feature.recommends.RecommendsApiManager;
import in.swiggy.android.tejas.feature.recommends.RecommendsData;
import in.swiggy.android.tejas.feature.recommends.RecommendsGeometry;
import in.swiggy.android.tejas.feature.recommends.RecommendsLocation;
import in.swiggy.android.tejas.feature.recommends.SwiggyRecommendsList;
import in.swiggy.android.tejas.feature.swiggygoogle.googlePlacesSdk.GoogleSdkManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: ReverseGeoCodeManager.kt */
public final class ReverseGeoCodeManager {

    /* renamed from: a  reason: collision with root package name */
    private final RecommendsApiManager f18907a;

    /* renamed from: b  reason: collision with root package name */
    private final n f18908b;

    /* renamed from: c  reason: collision with root package name */
    private final GoogleSdkManager f18909c;

    /* renamed from: d  reason: collision with root package name */
    private final GeocodedAddress f18910d = new GeocodedAddress(new GooglePlace());

    /* renamed from: e  reason: collision with root package name */
    private final Map<LatLng, GeocodedAddress> f18911e = new LinkedHashMap();

    public ReverseGeoCodeManager(RecommendsApiManager recommendsApiManager, n nVar, GoogleSdkManager googleSdkManager) {
        p.j(recommendsApiManager, "recommendsApiManager");
        p.j(nVar, "locationContext");
        p.j(googleSdkManager, "googleSdkManager");
        this.f18907a = recommendsApiManager;
        this.f18908b = nVar;
        this.f18909c = googleSdkManager;
    }

    private final GeocodedAddress b(LatLng latLng) {
        try {
            return this.f18909c.getBestGeocodedAddressFromSDK(latLng.f43937a, latLng.f43938b);
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007e A[Catch:{ Exception -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0097 A[Catch:{ Exception -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(com.google.android.gms.maps.model.LatLng r7, java.lang.String r8, boolean r9, fp0.c<? super in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof in.swiggy.android.swiggylocation.reverseGeocode.ReverseGeoCodeManager$getGeocodeAddressInternal$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            in.swiggy.android.swiggylocation.reverseGeocode.ReverseGeoCodeManager$getGeocodeAddressInternal$1 r0 = (in.swiggy.android.swiggylocation.reverseGeocode.ReverseGeoCodeManager$getGeocodeAddressInternal$1) r0
            int r1 = r0.f18917f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f18917f = r1
            goto L_0x0018
        L_0x0013:
            in.swiggy.android.swiggylocation.reverseGeocode.ReverseGeoCodeManager$getGeocodeAddressInternal$1 r0 = new in.swiggy.android.swiggylocation.reverseGeocode.ReverseGeoCodeManager$getGeocodeAddressInternal$1
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f18915d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f18917f
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            boolean r9 = r0.f18914c
            java.lang.Object r7 = r0.f18913b
            com.google.android.gms.maps.model.LatLng r7 = (com.google.android.gms.maps.model.LatLng) r7
            java.lang.Object r8 = r0.f18912a
            in.swiggy.android.swiggylocation.reverseGeocode.ReverseGeoCodeManager r8 = (in.swiggy.android.swiggylocation.reverseGeocode.ReverseGeoCodeManager) r8
            bp0.g.b(r10)     // Catch:{ Exception -> 0x009d }
            goto L_0x0076
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003b:
            bp0.g.b(r10)
            java.util.Map<com.google.android.gms.maps.model.LatLng, in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress> r10 = r6.f18911e
            java.lang.Object r10 = r10.get(r7)
            in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress r10 = (in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress) r10
            if (r10 == 0) goto L_0x004c
            r6.g(r7, r10, r9)
            return r10
        L_0x004c:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            double r4 = r7.f43937a
            r10.append(r4)
            r2 = 44
            r10.append(r2)
            double r4 = r7.f43938b
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            in.swiggy.android.tejas.feature.recommends.RecommendsApiManager r2 = r6.f18907a     // Catch:{ Exception -> 0x009c }
            r0.f18912a = r6     // Catch:{ Exception -> 0x009c }
            r0.f18913b = r7     // Catch:{ Exception -> 0x009c }
            r0.f18914c = r9     // Catch:{ Exception -> 0x009c }
            r0.f18917f = r3     // Catch:{ Exception -> 0x009c }
            java.lang.Object r10 = r2.getRecommedsListFromLatlng(r10, r8, r0)     // Catch:{ Exception -> 0x009c }
            if (r10 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r8 = r6
        L_0x0076:
            retrofit2.Response r10 = (retrofit2.Response) r10     // Catch:{ Exception -> 0x009d }
            boolean r0 = r10.isSuccessful()     // Catch:{ Exception -> 0x009d }
            if (r0 == 0) goto L_0x0097
            java.lang.Object r10 = r10.body()     // Catch:{ Exception -> 0x009d }
            in.swiggy.android.tejas.feature.recommends.SwiggyRecommendsList r10 = (in.swiggy.android.tejas.feature.recommends.SwiggyRecommendsList) r10     // Catch:{ Exception -> 0x009d }
            if (r10 != 0) goto L_0x0088
            r10 = 0
            goto L_0x008c
        L_0x0088:
            in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress r10 = r8.f(r10)     // Catch:{ Exception -> 0x009d }
        L_0x008c:
            if (r10 != 0) goto L_0x008f
            goto L_0x00a1
        L_0x008f:
            if (r9 == 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r3 = 0
        L_0x0093:
            r8.g(r7, r10, r3)     // Catch:{ Exception -> 0x009d }
            goto L_0x00a1
        L_0x0097:
            in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress r10 = r8.b(r7)     // Catch:{ Exception -> 0x009d }
            goto L_0x00a1
        L_0x009c:
            r8 = r6
        L_0x009d:
            in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress r10 = r8.b(r7)
        L_0x00a1:
            if (r10 == 0) goto L_0x00a7
            r8.g(r7, r10, r9)
            goto L_0x00a9
        L_0x00a7:
            in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GeocodedAddress r10 = r8.f18910d
        L_0x00a9:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylocation.reverseGeocode.ReverseGeoCodeManager.c(com.google.android.gms.maps.model.LatLng, java.lang.String, boolean, fp0.c):java.lang.Object");
    }

    public static /* synthetic */ Object e(ReverseGeoCodeManager reverseGeoCodeManager, LatLng latLng, String str, c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return reverseGeoCodeManager.d(latLng, str, cVar);
    }

    private final GeocodedAddress f(SwiggyRecommendsList swiggyRecommendsList) {
        RecommendsLocation location;
        RecommendsLocation location2;
        List<RecommendsData> places = swiggyRecommendsList.getPlaces();
        String str = null;
        RecommendsData recommendsData = places == null ? null : (RecommendsData) s.Z(places, 0);
        if (recommendsData == null) {
            return null;
        }
        RecommendsGeometry geometry = recommendsData.getGeometry();
        double d11 = 0.0d;
        double lat = (geometry == null || (location2 = geometry.getLocation()) == null) ? 0.0d : location2.getLat();
        RecommendsGeometry geometry2 = recommendsData.getGeometry();
        if (!(geometry2 == null || (location = geometry2.getLocation()) == null)) {
            d11 = location.getLng();
        }
        GooglePlaceLocation googlePlaceLocation = new GooglePlaceLocation(lat, d11);
        ArrayList arrayList = new ArrayList();
        List<RecommendsAddressComponents> addressComponents = recommendsData.getAddressComponents();
        if (addressComponents != null) {
            for (RecommendsAddressComponents next : addressComponents) {
                arrayList.add(new GooglePlaceAddress(next.getLongName(), next.getShortName(), next.getTypes()));
            }
        }
        RecommendsGeometry geometry3 = recommendsData.getGeometry();
        if (geometry3 != null) {
            str = geometry3.getLocationType();
        }
        return new GeocodedAddress(new GooglePlace(arrayList, recommendsData.getAddress(), new GooglePlaceGeometry(googlePlaceLocation, str), recommendsData.getPlaceId()));
    }

    private final void g(LatLng latLng, GeocodedAddress geocodedAddress, boolean z11) {
        this.f18911e.put(latLng, geocodedAddress);
        if (z11) {
            this.f18908b.D2(geocodedAddress);
        }
    }

    public final Object d(LatLng latLng, String str, c<? super GeocodedAddress> cVar) {
        return c(latLng, str, true, cVar);
    }
}
