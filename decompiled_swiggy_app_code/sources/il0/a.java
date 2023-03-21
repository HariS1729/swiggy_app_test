package il0;

import com.google.android.gms.maps.model.LatLng;
import kotlin.jvm.internal.p;

/* compiled from: TrackMapModels.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final LatLng f20194a;

    /* renamed from: b  reason: collision with root package name */
    private final LatLng f20195b;

    public a(LatLng latLng, LatLng latLng2) {
        this.f20194a = latLng;
        this.f20195b = latLng2;
    }

    public final LatLng a() {
        return this.f20195b;
    }

    public final LatLng b() {
        return this.f20194a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p.e(this.f20194a, aVar.f20194a) && p.e(this.f20195b, aVar.f20195b);
    }

    public int hashCode() {
        LatLng latLng = this.f20194a;
        int i11 = 0;
        int hashCode = (latLng == null ? 0 : latLng.hashCode()) * 31;
        LatLng latLng2 = this.f20195b;
        if (latLng2 != null) {
            i11 = latLng2.hashCode();
        }
        return hashCode + i11;
    }

    public String toString() {
        return "CurvedDashLineConfig(restaurantLatLng=" + this.f20194a + ", customerLatLng=" + this.f20195b + ')';
    }
}
